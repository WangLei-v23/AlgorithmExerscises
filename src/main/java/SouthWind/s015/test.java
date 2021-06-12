package SouthWind.s015;

public class test {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("Thread+++++++++++++++++++++++");
            }
        });
        thread1.start();


        for (int i = 0; i < 100; i++) {
            if (i==30){
                try {
                    thread1.join(3000);
                    for (int j = 0; j <3 ; j++) {
                        System.out.println("暂停" + j + "秒");
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("===============================main");
        }
    }
}
