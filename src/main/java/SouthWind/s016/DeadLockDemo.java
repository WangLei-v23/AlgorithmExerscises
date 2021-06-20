package SouthWind.s016;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class DeadLockDemo implements Runnable{
    public int num;
    private static data data1= new data();
    private static data data2= new data();
    private static DeadLockDemo dd;
    //方法3 使用重入锁设定等待时间方式，解决死锁
    private static ReentrantLock reentrantLock=new ReentrantLock();
    @Override
    public void run() {
        try {
            if (reentrantLock.tryLock(1, TimeUnit.MILLISECONDS)){
                if (this.num==1){
                    System.out.println("线程"+Thread.currentThread().getName()+"获取data1, 等待获取data2");
                    Thread.sleep(1000);
                    System.out.println("线程"+Thread.currentThread().getName()+"获取data2, 线程结束");
                    //            synchronized (data1){
                    //                try {
                    //                    Thread.sleep(100);
                    //                } catch (InterruptedException e) {
                    //                    e.printStackTrace();
                    //                }
                    //                System.out.println("线程"+Thread.currentThread().getName()+"获取data1, 等待获取data2");
                    //                synchronized (data2){
                    //                    System.out.println("线程"+Thread.currentThread().getName()+"获取data2, 开始用餐");
                    //                }
                    //            }
                }

                if (this.num==2){
                    System.out.println("线程"+Thread.currentThread().getName()+"获取data2, 等待获取data1");
                    Thread.sleep(1000);
                    System.out.println("线程"+Thread.currentThread().getName()+"获取data1, 线程结束");
                    //            try {
                    //方式1 线程休眠
                    // 但休眠时间相同，多线程下仍然会出现死锁 不适用
                    //                Thread.sleep(1000);
                    //            } catch (InterruptedException e) {
                    //                e.printStackTrace();
                    //            }
                    //            synchronized (data2){
                    //                System.out.println("线程"+Thread.currentThread().getName()+"获取data2, 等待获取data1");
                    //                synchronized (data1){
                    //                    System.out.println("线程"+Thread.currentThread().getName()+"获取data1, 开始用餐");
                    //                }
                    //            }
                }
            }else {
                System.out.println(Thread.currentThread().getName()+"中断");
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            if (reentrantLock.isHeldByCurrentThread()){
                reentrantLock.unlock();
                System.out.println(Thread.currentThread().getName() + "解锁");
            }
        }

//        try {
//            if (reentrantLock.tryLock(1, TimeUnit.MILLISECONDS)){
//                if (this.num==2){
//                    System.out.println("线程"+Thread.currentThread().getName()+"获取data2, 等待获取data1");
//                    Thread.sleep(1000);
//                    System.out.println("线程"+Thread.currentThread().getName()+"获取data1, 线程结束");
//                    //            try {
//                    //方式1 线程休眠
//                    // 但休眠时间相同，多线程下仍然会出现死锁 不适用
//                    //                Thread.sleep(1000);
//                    //            } catch (InterruptedException e) {
//                    //                e.printStackTrace();
//                    //            }
//                    //            synchronized (data2){
//                    //                System.out.println("线程"+Thread.currentThread().getName()+"获取data2, 等待获取data1");
//                    //                synchronized (data1){
//                    //                    System.out.println("线程"+Thread.currentThread().getName()+"获取data1, 开始用餐");
//                    //                }
//                    //            }
//                }
//            }else {
//                System.out.println(Thread.currentThread().getName()+"放弃等待data1，中断");
//            }
//
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }

    private DeadLockDemo(int num) {
        this.num=num;
        System.out.println("死锁对象创建");
    }

    public static DeadLockDemo getDd(int num) {
//        reentrantLock.lock();
        if (dd==null){
            dd=new DeadLockDemo(num);
        }
//        reentrantLock.unlock();
        return dd;
    }

    //线程单例模式
//    public static DeadLockDemo getDd(int num) {
//        synchronized (DeadLockDemo.class){
//            if (dd==null){
//                dd=new DeadLockDemo(num);
//            }
//            return dd;
//        }
//
//    }
}
