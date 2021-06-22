package SouthWind.s019;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class test1 {
    public static void main(String[] args) {
        //概率出现的ConcurrentModificationException  并发修改异常
        // 1.使用重入锁避免读写冲突
        // 2.使用读写分离CopyOnWriteArrayList
        List<String> list = new ArrayList<>();
        ReentrantLock reentrantLock = new ReentrantLock();
        for (int i = 0; i < 10; i++) {
            new Thread(()->{
                try {
                    TimeUnit.SECONDS.sleep(2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                reentrantLock.lock();
                list.add("a");
                System.out.println(list);
                if (reentrantLock.isHeldByCurrentThread()){
                    reentrantLock.unlock();
                }
            }).start();
        }

        //使用线程安全的集合
        //或使用线程安全的 Collections.synchronizedList(new ArrayList<>());将集合进行封装
//        Vector<String> vector = new Vector<>();
//        new Thread(()->{
//            while (vector.size()<10){
//                System.out.println(vector);
//                try {
//                    TimeUnit.MILLISECONDS.sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        }).start();
//        for (int i = 0; i < 10; i++) {
//            new Thread(()->{
//                vector.add("x");
//            }).start();
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
    }
}
