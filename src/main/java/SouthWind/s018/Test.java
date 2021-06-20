package SouthWind.s018;

public class Test {
    public static void main(String[] args) {
        Thread thread= new Thread(()->{
            for (int i = 0; i <10 ; i++) {
                System.out.println("++++++++++++++++++++++++A");
                if (i%5==0){
                    try {
                        System.out.println("输出A休眠1s");
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        thread.start();

        try {
            System.out.println("主线程休眠1s");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i = 0; i <10 ; i++) {
            System.out.println("B=========================");
            if (i%3==0){
                try {
                    System.out.println("输出B休眠1s");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
