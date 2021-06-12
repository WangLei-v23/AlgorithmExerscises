package SouthWind.s013;

public class test2 {
    public static void main(String[] args) {
        long startTime2 = System.currentTimeMillis();
        for (int i = 0; i <100; i++) {
            Express express = new Express(i);
            express.get();
        }
        long endTime2 = System.currentTimeMillis();
        System.out.println("单线程运行时间：" + (endTime2 - startTime2) + "ms");
    }
}
