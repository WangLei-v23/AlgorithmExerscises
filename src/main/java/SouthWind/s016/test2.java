package SouthWind.s016;

public class test2 {
    public static void main(String[] args) throws InterruptedException {
//        DeadLockDemo dd1 = new DeadLockDemo(1);
//        DeadLockDemo dd2 = new DeadLockDemo(2);
//        Thread thread1=new Thread(dd1,"张三");
//        thread1.start();
//        try {
//            //方式2 ：线程合并
//            //短时间内同步，无法解决高并发场景，而且会失去多线程的意义
//            thread1.join(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        Thread thread2=new Thread(dd2,"李四");
//        thread2.start();

        //方式3： 多线程单例模式
//        Thread thread3=new Thread(DeadLockDemo.getDd(1),"张三");
//        Thread thread4=new Thread(DeadLockDemo.getDd(2),"李四");
//        thread3.start();
//        thread4.start();

        //方式4 重入锁
        Thread thread3=new Thread(DeadLockDemo.getDd(1),"张三");
        Thread thread4=new Thread(DeadLockDemo.getDd(2),"李四");
        thread3.start();
        thread4.start();

    }
}
