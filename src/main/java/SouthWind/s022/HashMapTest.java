package SouthWind.s022;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

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
        Set<Map.Entry<String, String>> entrySet = hashMap.entrySet();
        Iterator<Map.Entry<String, String>> iterator = entrySet.iterator();
        while (iterator.hasNext()){
            Map.Entry<String, String> next = iterator.next();
            System.out.println(next.getKey()+"-----"+next.getValue());
        }
    }
}