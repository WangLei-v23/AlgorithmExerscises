package SouthWind.s023;

import java.util.*;

public class HashMapTest {
    public static void main(String[] args) {

        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("h", "Hello");
        hashMap.put("w", "World");
        hashMap.put("j", "Java");
        hashMap.put("s", "JavaSE");
        hashMap.put("m", "JavaME");
        hashMap.put("e", "JavaEE");
//        hashMap.put("j", "Jack"); //直接覆盖key值相同的value
        System.out.println(hashMap);
        System.out.println("*********************************");
        /**
         * map的3种遍历方式
         */
        //1、获取set 使用迭代器遍历
        Set<Map.Entry<String, String>> entrySet = hashMap.entrySet();
        Iterator<Map.Entry<String, String>> iterator = entrySet.iterator();
        while (iterator.hasNext()){
            Map.Entry<String, String> next = iterator.next();
            System.out.println(next.getKey()+"-----"+next.getValue());
        }
        System.out.println("*********************************");
        //2、获取key所在的set集合 使用迭代器遍历
        Set<String> keySet = hashMap.keySet();
        Iterator<String> iterator1 = keySet.iterator();
        while (iterator1.hasNext()){
            String next = iterator1.next();
            System.out.println(next);
        }
        System.out.println("*********************************");
        //3、获取value所在的Collection集合 使用迭代器遍历
        Collection<String> values = hashMap.values();
        Iterator<String> iterator2 = values.iterator();
        while (iterator2.hasNext()){
            String next = iterator2.next();
            System.out.println(next);
        }
    }
}