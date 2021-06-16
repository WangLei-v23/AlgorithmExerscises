package SouthWind.s015;

import java.text.SimpleDateFormat;
import java.util.Date;

public class simpleClock implements Runnable{

    @Override
    public void run() {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        while (true){
            Date date = new Date();
            System.out.println(sdf.format(date));
            for (int i = 0; i <4 ; i++) {
                System.out.println();
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) {
        simpleClock clock = new simpleClock();
        Thread thread = new Thread(clock);
        thread.start();
    }
}
