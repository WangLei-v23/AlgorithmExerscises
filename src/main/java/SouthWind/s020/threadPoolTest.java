package SouthWind.s020;

import java.util.concurrent.*;

public class threadPoolTest {
    public static void main(String[] args) {

        //线程池对象
        ExecutorService executorService=null;
        try {
            executorService = new ThreadPoolExecutor(
                    2,
                    4,
                    1L,
                    TimeUnit.SECONDS,
                    new ArrayBlockingQueue<>(4),
                    Executors.defaultThreadFactory(),
//                    new ThreadPoolExecutor.AbortPolicy //直接抛出异常
//                    new ThreadPoolExecutor.DiscardPolicy() //放弃任务，不抛出异常
//                    new ThreadPoolExecutor.DiscardOldestPolicy() //尝试与阻塞队列前面的任务争夺，不抛出异常(尝试插队)
                    new ThreadPoolExecutor.CallerRunsPolicy() //谁调用谁处理
            );
//
            for (int i = 0; i <9 ; i++) {
                final int j=i;
                executorService.execute(()->{
                    System.out.println(Thread.currentThread().getName() + "====>办理业务"+j);
                    try {
                        TimeUnit.MILLISECONDS.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "<====办理业务结束"+j);
                });
            }

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            executorService.shutdown();
        }

        //快速创建线程池
        //单例线程池
//        ExecutorService executorService1 = Executors.newSingleThreadExecutor();
        //指定线程数量
//        ExecutorService executorService1 = Executors.newFixedThreadPool(5);
        //缓存线程池 根据请求数量和电脑性能自动配置线程数(可以测试电脑性能===>R9000P 6121线程/10000请求)
//        ExecutorService executorService1 = Executors.newCachedThreadPool();
//
//        for (int i = 0; i <10000 ; i++) {
//            executorService1.execute(()->{
//                System.out.println(Thread.currentThread().getName() + "====>办理业务");
//                try {
//                    TimeUnit.MILLISECONDS.sleep(100);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println(Thread.currentThread().getName() + "<====办理业务结束");
//            });
//        }
//        executorService1.shutdown();
    }
}
