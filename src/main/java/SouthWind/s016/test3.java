package SouthWind.s016;

public class test3 {
    public static void main(String[] args) {
        ReentrantLockDemo lockDemo = new ReentrantLockDemo();
        Thread thread1 = new Thread(lockDemo, "张三");
        Thread thread2 = new Thread(lockDemo, "李四");
        Thread thread3 = new Thread(lockDemo, "王五");
        Thread thread4 = new Thread(lockDemo, "赵六");
        Thread thread5 = new Thread(lockDemo, "老七");
        thread3.start();
        thread5.start();
        thread1.start();
        thread2.start();
        thread4.start();
    }
}
