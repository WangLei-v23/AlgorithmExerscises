package SouthWind.s018;

import java.util.concurrent.TimeUnit;

public class Test2 {
    public static void main(String[] args) {
        Data data = new Data();
        new Thread(()->{
            for (int i = 0; i <10 ; i++) {
                data.dataTest(i);
            }
        }).start();

        new Thread(()->{
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            data.dataWeekUp();
        }).start();
    }
}

class Data{
    //自动休眠
    public synchronized void  dataTest(int i){
        System.out.println("============================="+i);
        if (i==5){
            try {
                System.out.println("线程等待。。。");
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
    //唤醒线程
    public synchronized void dataWeekUp(){
        this.notify();
    }

}
