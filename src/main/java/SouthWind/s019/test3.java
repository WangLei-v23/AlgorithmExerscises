package SouthWind.s019;

import java.util.HashMap;
import java.util.Map;

public class test3 {
    public static void main(String[] args) {
        cache cache = new cache();
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

class cache{
    private Map<Integer,String> map= new HashMap<>();

    /**
     * 写入
     * @param key
     * @param value
     */
    public void write(Integer key,String value){
        System.out.println(key + "开始写入");
        map.put(key,value);
        System.out.println(key + "写入完毕");
    }

    public void read(Integer key){
        System.out.println(key + "开始读取");
        String s = map.get(key);
        System.out.println(key + "读取完毕============" + s);
    }
}
