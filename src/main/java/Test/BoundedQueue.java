package Test;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 1. 把Bounded Blocking Lock-based Queue中的size变量替换为enqSize和deqSize两个变量，给出实现代码并进行性能评估。
 * enqSize : 入队元素个数
 * deqSize ：出队元素个数
 */
/**
 * Bounded blocking queue
 */
public class BoundedQueue<T> {
    private static int counter = 0;
    // Lock out other enqueuers (dequeuers)
    ReentrantLock enqLock, deqLock;
    /**
     * wait/signal when queue is not empty or not full
     */
    Condition notEmptyCondition, notFullCondition;
    /**
     * Number of empty slots.
     */
    // AtomicInteger size;
    AtomicInteger enqSize;
    AtomicInteger deqSize;
    /**
     * First entry in queue.
     */
    Entry head;
    /**
     * Last entry in queue.
     */
    Entry tail;
    /**
     * Max number of entries allowed in queue.
     */
    int capacity;

    public int getCapacity() {
        return capacity;
    }
    /**
     * Constructor.
     *
     * @param capacity
     *            Max number of items allowed in queue.
     */
    public BoundedQueue(int capacity) {
        this.capacity = capacity;
        this.head = new Entry(null);
        this.tail = head;
        // this.size = new AtomicInteger(capacity);
        this.enqSize = new AtomicInteger(capacity);	// enqSize is capacity
        this.deqSize = new AtomicInteger();	//	no items in queue
        this.enqLock = new ReentrantLock();
        this.notFullCondition = enqLock.newCondition();
        this.deqLock = new ReentrantLock();
        this.notEmptyCondition = deqLock.newCondition();
        System.out.println("Time: [" + counter++ +"] Thread: [" + Thread.currentThread().getId() + "]: Created bounded queue with capacity [" + capacity+ "]");

    }

    /**
     * Remove and return head of queue.
     * 出栈
     * @return remove first item in queue
     */
    public T deq() {
        T result;
        boolean mustWakeEnqueuers = true;
        System.out.println("Time: [" + counter++ +"] Thread: [" + Thread.currentThread().getId()
                + "]: Acquired Lock for dequeing an element.");

        deqLock.lock();
        try {

            while (capacity == (enqSize.get() - deqSize.get()) ) {	// 表示没有能出队的元素
                try {
                    System.out.println("Time: [" + counter++ +"] Thread: [" + Thread.currentThread().getId()
                            + "] waiting for notEmptyCondition.");
                    notEmptyCondition.await();
                } catch (InterruptedException ex) {
                }
            }
            result = head.next.value;
            head = head.next;

            if (capacity ==  (deqSize.getAndIncrement() - enqSize.getAndDecrement() )  ) {//有入队者在等待
                mustWakeEnqueuers = true;
            }
        } finally {
            deqLock.unlock();
        }
        if (mustWakeEnqueuers) {
            enqLock.lock();
            try {

                System.out.println("Time: [" + counter++ +"] Thread: [" + Thread.currentThread().getId()
                        + "] Signalling not full condition after a dequeue operation.");
                notFullCondition.signalAll();
            } finally {
                enqLock.unlock();
            }
        }
        return result;
    }

    /**
     * Append item to end of queue.
     * 入栈
     * @param x
     *            item to append
     */
    public void enq(T x) {
        if (x == null)
            throw new NullPointerException();
        boolean mustWakeDequeuers = false;
        System.out.println("Time: [" + counter++ +"] Thread: [" + Thread.currentThread().getId()
                + "]: Acquired Lock for enqueing an element.");

        enqLock.lock();
        try {
            // while (size.get() == 0) {
            while (capacity == (deqSize.get() - enqSize.get() ) ) { //表示已满
                try {
                    System.out.println("Time: [" + counter++ +"] Thread: [" + Thread.currentThread().getId()
                            + "] waiting for notFullCondition.");
                    notFullCondition.await();
                } catch (InterruptedException e) {
                }
            }
            Entry e = new Entry(x);
            tail.next = e;
            tail = e;
            // if (size.getAndDecrement() == capacity) {
            if (capacity == (enqSize.get() - deqSize.get())) { //表示有出队等待队列
                mustWakeDequeuers = true;
            }
        } finally {
            enqLock.unlock();
        }
        if (mustWakeDequeuers) {
            deqLock.lock();
            try {

                System.out.println("Time: [" + counter++ +"] Thread: [" + Thread.currentThread().getId()
                        + "] Signalling not empty condition after a enqueue operation.");
                notEmptyCondition.signalAll();
            } finally {
                deqLock.unlock();
            }
        }
    }

    /**
     * Individual queue item.
     */
    protected class Entry {
        /**
         * Actual value of queue item.
         */
        public T value;
        /**
         * next item in queue
         */
        public Entry next;

        /**
         * Constructor
         *
         * @param x
         *            Value of item.
         */
        public Entry(T x) {
            value = x;
            next = null;
        }
    }

}
