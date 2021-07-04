package SouthWind.s022;

import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();
        treeSet.add(new b(3));
        treeSet.add(new b(2));
        treeSet.add(new b(1));
        treeSet.add(new b(6));
        treeSet.add(new b(4));
        System.out.println(treeSet.toString());
    }
}


class b implements Comparable{
    private int num;

    public b(int num) {
        this.num = num;
    }

    @Override
    public int compareTo(Object o) {
        /**
         * a.compareTo(b)
         * 1 a大于b
         * 0 a等于b
         * -1 a小于b
         */
        b b1 = (b) o;
        return (this.num>b1.num)?-1:(this.num==b1.num)?0:1;
    }

    @Override
    public String toString() {
        return "b{" +
                "num=" + num +
                '}';
    }
}

