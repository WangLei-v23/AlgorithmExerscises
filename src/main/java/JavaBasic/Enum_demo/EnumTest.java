package JavaBasic.Enum_demo;

/**
 * @ClassName: EnumTest
 * @Description:
 * @Author: WangLei
 * @Date: 2021/6/28 11:52
 */
public class EnumTest {

    public void judge(SeasonEnum season){
        switch (season){
            case SPRING:
                System.out.println("春天");
                break;
            case SUMMER:
                System.out.println("夏天");
                break;
            case FALL:
                System.out.println("秋天");
                break;
            case WINTER:
                System.out.println("冬天");
                break;
        }
    }

    public static void main(String[] args) {
        for (SeasonEnum s:SeasonEnum.values()
             ) {
            System.out.println(s);
        }
        System.out.println("==========================");
        //创建枚举实例时，可使用EnumClass.variable形式来访问
        new EnumTest().judge(SeasonEnum.SPRING);
    }

}
