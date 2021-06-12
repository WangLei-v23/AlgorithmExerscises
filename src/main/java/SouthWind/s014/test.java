package SouthWind.s014;

public class test {
    public static void main(String[] args) {
        //继承Thread类方式
        MyThread myThread = new MyThread();
        myThread.start();

        //实现Runnable接口方式
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();

        //匿名内部类（本质还是实现Runnable接口）
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                System.out.println("==============Lambda start=================");
            }
        });
        thread1.start();
        try {
            thread1.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i <1000 ; i++) {
            System.out.println("+++++++++++++++main start+++++++++++++++++");
        }

    }
}
