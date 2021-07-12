package SouthWind.s025;

public class Test {
    public static void main(String[] args) {
        Time<String, Integer, Float> time = new Time<>();
        time.setHour("一点");
        time.setMin(40);
        time.setSec(59.0f);
        System.out.println("现在的时间==" + time.getHour() + ":" + time.getMin() + ":" + time.getSec());
    }

    public static void testExtend (Time<?extends Number,?extends Object,?extends Boolean> time){ }
    public static void testSuper(Time<? super Object,? super Number,? super Float> time){ }
}
