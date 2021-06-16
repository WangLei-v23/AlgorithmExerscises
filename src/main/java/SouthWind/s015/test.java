package SouthWind.s015;

public class test {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                try {
                    //刚获取资源就进行休眠，相当于不与其他线程抢占资源 只在join期间运行
                    //再次提醒 注意线程休眠调用时的位置 在哪调用 哪休眠
                    Thread.currentThread().sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread+++++++++++++++++++++++"+i);
            }
        });
        thread1.start();


        for (int i = 0; i < 100; i++) {
            if (i==30){
                try {
                    thread1.join(8000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(i+"===============================main");
        }

    }
}
