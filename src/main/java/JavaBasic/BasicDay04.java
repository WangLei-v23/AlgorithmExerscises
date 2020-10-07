package JavaBasic;

import java.util.Scanner;

/**
 * description: BasicDay04
 * date: 2020/7/28 20:28
 * package JavaBasic
 * author: WangLei
 * version: 1.0
 */
public class BasicDay04 {
    public static void main(String[] args) {
//        testSwitch();
//        testScan();
//        outOdd();
    }


    /**
    * @Author: WangLei
    * @Description: //TODO testSwitch
    * @Date: 21:11 2020/7/28
    * @Param: []
    * @return: void
    **/
    public  static  void testSwitch(){
        int a=3;
        int x=100;
        switch (a){
            case 1: x+=5; break;
            case 2: x+=10; break;
            case 3: x+=16; break;
            default: x+=34;
        }
        System.out.println("x="+x);
    }

    /**
    * @Author: WangLei
    * @Description: //TODO testScan
    * @Date: 21:12 2020/7/28
    * @Param: [] 
    * @return: void
    **/
    public static void testScan(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("输入姓名：");
        String name = scanner.nextLine();

        System.out.println("输入年龄：");
        int age=scanner.nextInt();

        System.out.println(name+"的年龄是"+age+"岁");
    }
    
    /**
    * @Author: WangLei
    * @Description: //TODO
    * @Date: 22:46 2020/8/2
    * @Param: [] 
    * @return: int
    **/
    public  static void outOdd(){
        int sum = 0;
        for (int i=1;i<=100;i++){
            if (i%2!=0){
                System.out.println(i);
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}

