package Test;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class PerformanceTest {
    //线程池
    protected static final ExecutorService pool = Executors.newCachedThreadPool();
    //线程计数器
    protected CyclicBarrier barrier;
    //队列
    protected final BoundedQueue<Integer> boundedQueue ;
    //线程数
    protected final int nPairs;
    protected final BarrierTimer barrierTimer=new BarrierTimer();
    //入队操作次数
    protected final AtomicInteger putSum = new AtomicInteger(0) ;
    //出队操作次数
    protected final AtomicInteger takeSum = new AtomicInteger(0) ;

    public static void main(String[] args) throws Exception {

        for (int pairs = 0; pairs <10 ; pairs++) {//对照组次数
            PerformanceTest t = new PerformanceTest(1000, 30);
            System.out.print("Pairs: " + 10 + "\t") ;
            t.test();
            System.out.print("\t ");
            Thread.sleep(1000);
        }

        PerformanceTest.pool.shutdown() ;
    }

    //构造函数
    public PerformanceTest(int capacity, int npairs) {
        this.boundedQueue = new BoundedQueue<Integer>(capacity);
        this.nPairs = npairs;
        this.barrier = new CyclicBarrier(npairs * 2 + 1,barrierTimer);
    }

    //测试方法
    void test() {
        try {
            //线程池分配任务
            for (int i = 0; i < nPairs; i++) {
                pool.execute(new Producer());
                pool.execute(new Consumer());
            }
            barrier.await(); // 等待所有的线程就绪
//            barrierTimer.run();
            barrier.await() ; // 等待所有的线程执行完成 自动回调timer
            barrierTimer.clear();
            long time = barrierTimer.getTime();
            // 1 second = 1_000_000_000 nano seconds
            double convert = (double) time / 1_000_000_000;
//            long convert = TimeUnit.SECONDS.convert(time, TimeUnit.NANOSECONDS);
//            long convert = TimeUnit.NANOSECONDS.toSeconds(time);
            System.out.println("总时间："+convert+"秒"+"-----time="+time);
            System.out.println("操作次数：PUT="+putSum.get()+" TAKE="+takeSum.get());
            System. out.println("put : take == "+(putSum.get()/takeSum.get()));
            int throughput =(int)(((putSum.get() + takeSum.get()) / 2)/convert);
            System.out.println("吞吐量："+throughput+" 操作数/秒");
        } catch (Exception e) {
            throw new RuntimeException(e) ;
        }

    }

    //生成每个线程的唯一标识
    static int xorShift( int y) {
        y ^= (y << 6);
        y ^= (y >>> 21) ;
        y ^= (y << 7) ;
        return y;

    }

    //生产者 入队
    class Producer implements Runnable {
        public void run() {
            try {
                int seed = (this.hashCode() ^ (int) System.nanoTime()) ;
                barrier.await();
                boundedQueue.enq(seed);
                boundedQueue.enqSize.getAndAdd(1);
                seed = xorShift(seed);
                putSum.getAndAdd(1) ;
                barrier.await();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    //消费者 出队
    class Consumer implements Runnable {
        public void run() {
            try {
                barrier.await() ;
                boundedQueue.deq();
//                boundedQueue.enqSize.getAndAdd(1);
                boundedQueue.deqSize.getAndAdd(1);
                takeSum.getAndAdd(1) ;
                barrier.await();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

        }

    }

}
