package JavaBasic;

/**
 * description: BasicDay03
 * date: 2020/7/25 17:57
 * package JavaBasic
 * author: WangLei
 * version: 1.0
 */
public class BasicDay03 {
    public static void main(String[] args) {
//        int a=4;
//        int b=2;
//        int c=1;
//        int max=getMax(a,b,c);
//        System.out.println(max);
//        double d=11.0;
//        double e=2.0;
//        double m=sumOrMult(d, e);
//        System.out.println(m);
    }


    /**
    * @Author: WangLei
    * @Description: //TODO 选出三个数种较大的那个
    * @Date: 18:04 2020/7/25
    * @Param: [a, b, c] 
    * @return: int
    **/
    public static int getMax(int a,int b,int c){
        int temp=0;
        temp=((temp=(a>b)?a:b)>c)?temp:c;
        return temp;
    }

    /**
    * @Author: WangLei
    * @Description: //TODO 两数之和或乘积
    * @Date: 18:14 2020/7/25
    * @Param: [a, b] 
    * @return: double
    **/
    public static double sumOrMult(double a,double b){
        double temp=0;
        if(a>10.0&&b<20.0){
            temp=a+b;
        }else {
            temp=a*b;
        }
        return temp;
    }

    /**
    * @Author: WangLei
    * @Description: //TODO 交换两个变量
    * @Date: 18:18 2020/7/25
    * @Param: [a, b] 
    * @return: void
    **/
    public static void exchange(Object a,Object b){
        Object temp=null;
        temp=a;
        a=b;
        b=temp;
    }
}
