package SouthWind.s019;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLockTest {
    public static void main(String[] args) {
        cache2 cache = new cache2();
        for (int i = 0; i < 5; i++) {
            final int j=i;
            new Thread(()->{
                cache.write(j,String.valueOf(j));
            }).start();
        }

        for (int i = 0; i < 5; i++) {
            final int j=i;
            new Thread(()->{
                cache.read(j);
            }).start();
        }
    }
}

class cache2{
    private Map<Integer,String> map= new HashMap<>();
    ReadWriteLock readWriteLock= new ReentrantReadWriteLock();
    /**
     * 写入
     * @param key
     * @param value
     */
    public void write(Integer key,String value){
        readWriteLock.writeLock().lock();
        System.out.println(key + "开始写入");
        map.put(key,value);
        System.out.println(key + "写入完毕");
        readWriteLock.writeLock().unlock();
    }

    public void read(Integer key){
        readWriteLock.readLock().lock();
        System.out.println(key + "开始读取");
        String s = map.get(key);
        System.out.println(key + "读取完毕============" + s);
        readWriteLock.readLock().unlock();
    }
}
