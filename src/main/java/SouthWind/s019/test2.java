package SouthWind.s019;

import java.util.concurrent.*;

public class test2 {

    public static void main(String[] args) {

        //使用计数信号量
        //初始化
        Semaphore semaphore = new Semaphore(5);
        for (int i = 0; i <15 ; i++) {
            new Thread(()->{
                try {
                    //获取许可
                    semaphore.acquire();
                    System.out.println(Thread.currentThread().getName() + "进站浏览");
                    TimeUnit.SECONDS.sleep(1);
                    System.out.println(Thread.currentThread().getName() + "出站");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    //释放许可
                    semaphore.release();
                }
            },String.valueOf(i)).start();
        }


        //使用加法计数器
//        CyclicBarrier cyclicBarrier = new CyclicBarrier(10,()->{
//            System.out.println("-----------------------------");
//        });


//        for (int i = 0; i < 20; i++) {
//            final int temp=i;
//            new Thread(()->{
//                System.out.println("++++++++++++++++++++++" + temp);
//                try {
//                    System.out.println(cyclicBarrier.getNumberWaiting());
//                    cyclicBarrier.await();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                } catch (BrokenBarrierException e) {
//                    e.printStackTrace();
//                }
//            }).start();
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }

        //使用减法计数器
//        CountDownLatch countDownLatch = new CountDownLatch(50);
//
//        new Thread(()->{
//            for (int i = 0; i <100 ; i++) {
//                System.out.println("++++++++++++++++++++++" + i);
//                countDownLatch.countDown();
//            }
//        }).start();
//
//        try {
//            countDownLatch.await();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        for (int i = 0; i <100 ; i++) {
//            System.out.println(i + "-----------------------------");
//        }
    }
}
