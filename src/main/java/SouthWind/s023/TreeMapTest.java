package SouthWind.s023;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapTest {
    public static void main(String[] args) {
        //自动按照key进行排序
        TreeMap treeMap = new TreeMap();
        treeMap.put(new b(3), "Java");
        treeMap.put(new b(5), "JavaME");
        treeMap.put(new b(1), "Hello");
        treeMap.put(new b(6), "JavaEE");
        treeMap.put(new b(2), "World");
        treeMap.put(new b(4), "JavaSE");
        Set keySet = treeMap.keySet();
        Iterator iterator = keySet.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next+"---"+treeMap.get(next));
        }
    }
}

class b implements Comparable{
    private int num;

    public b(int num) {
        this.num = num;
    }

    @Override
    public int compareTo(Object o) {
        b c = (b) o;
        return (this.num>c.num)?1:((this.num==c.num)?0:-1);
    }

    @Override
    public String toString() {
        return "b{" +
                "num=" + num +
                '}';
    }
}
