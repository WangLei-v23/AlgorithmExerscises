package SouthWind.s015;

public class test2 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                if (i == 5) {
                    System.out.println("让你一手");
                    Thread.yield();
                }
                System.out.println(i + "+++++++++++++++++++++++++++thread1");

            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(i + "==================thread2");
            }
        });

        thread1.start();
        thread2.start();
    }
}
