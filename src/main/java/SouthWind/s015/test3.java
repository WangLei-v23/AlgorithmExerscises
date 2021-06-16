package SouthWind.s015;

public class test3 {
    public static void main(String[] args) {
        Account account = new Account();
        Thread thread1 = new Thread(account);
        Thread thread2 = new Thread(account);
        Thread thread3 = new Thread(account);
        Thread thread4 = new Thread(account);
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}

class Account implements Runnable{
    private static int num;

    @Override
    public synchronized void run() {
        //初始线程将共享的num改变后，进行休眠，其余线程同时访问共享资源时也改变num然后休眠
        //等初始线程进入运行状态后，访问的是其他线程已经改变的num
        num++;
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("当前访客===========================" + num);
    }
}
