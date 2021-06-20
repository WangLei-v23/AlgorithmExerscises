package SouthWind.s016;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockDemo implements Runnable{
    private static int num=0;
    private ReentrantLock reentrantLock=new ReentrantLock();
    @Override
    public void run() {
        //上锁
        reentrantLock.lock();
        num++;
        System.out.println("[" + Thread.currentThread().getName() + "]--->第" + num + "位访客");
        //解锁
        reentrantLock.unlock();
    }
}
