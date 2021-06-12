package SouthWind.s013;

import java.util.concurrent.CountDownLatch;

public class test {
    public static void main(String[] args) throws InterruptedException {

        int start=0;
        int end=100;
        CountDownLatch countdown = new CountDownLatch(end);
        long startTime = System.currentTimeMillis();

        for (;start<end; start++) {
            Express express = new Express(start);
            new Thread(()->{
                express.get();
                countdown.countDown();
            }).start();
        }
        countdown.await();
        long endTime = System.currentTimeMillis();
        System.out.println("多线程运行时间：" + (endTime - startTime) + "ms");

    }
}
