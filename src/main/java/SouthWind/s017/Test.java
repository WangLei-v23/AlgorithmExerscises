package SouthWind.s017;

public class Test {
    public static void main(String[] args) {
        TricketRunnable runnable = new TricketRunnable();
        new Thread(runnable,"窗口A").start();
        new Thread(runnable,"窗口B").start();
        new Thread(runnable,"窗口C").start();
        new Thread(runnable,"窗口D").start();
        new Thread(runnable,"窗口E").start();
    }
}
