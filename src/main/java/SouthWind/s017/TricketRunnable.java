package SouthWind.s017;

import java.util.concurrent.locks.ReentrantLock;

public class TricketRunnable implements Runnable {
    //剩余票数
    private int surplusNum = 20;
    //已售出票数
    private int soldNum = 0;
    //重入锁
    private ReentrantLock reentrantLock = new ReentrantLock();

    @Override
    public void run() {
        while (surplusNum > 0) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (surplusNum == 0) {
                System.out.println(Thread.currentThread().getName() + "线程结束");
                return;
            }
            synchronized (TricketRunnable.class) {
                surplusNum--;
                soldNum++;
                if (surplusNum == 0) {
                    System.out.println(Thread.currentThread().getName() + "售出第" + soldNum + "张票，剩余0张，售罄！");
                } else {
                    System.out.println(Thread.currentThread().getName() + "售出第" + soldNum + "张票，剩余" + surplusNum + "张票");
                }
            }
        }
    }
}
