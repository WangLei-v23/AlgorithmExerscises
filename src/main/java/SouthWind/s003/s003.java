package SouthWind.s003;

import java.util.Scanner;

public class s003 {
    public static void main(String[] args) {

        /**
         *用户循环输入4位数的会员号，
         * 判断是否为幸运会员(会员号的百位数等于指定数即为幸运会员，幸运数字自定义)，
         * 如果输入0则结束循环，使用do-while循环
         */
//        int peace = (int) ((Math.random()*9+1) * 1000);
//        System.out.println("-------------"+peace+"-------------");
//        Scanner scanner = new Scanner(System.in);
//        int i=0;
//        do {
//            System.out.println("请输入幸运数字：");
//            i = scanner.nextInt();
//        }while (i!=peace);
//        System.out.println("恭喜成为幸运用户！");

        /**
         *使用循环打印出九九乘法表
         */
//        for (int i = 1; i <10 ; i++) {
//            for (int j = 1; j <=i ; j++) {
//                System.out.print(j+"*"+i+"="+(i*j)+" ");
//            }
//            System.out.println();
//        }


        /**
         * 求出100以内所有能被9整除的数之和
         */
//        int sum = 0;
//        for (int i = 0; i <100 ; i++) {
//            if (i%9==0){
//                sum+=i;
//            }
//        }
//        System.out.println("100以内所有能被9整除的数之和："+sum);

        /**
         *实现计算器功能，用户输入两个操作数，一个运算符（＋，-，×，/），输出结果
         */
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("输入操作数1：");
//        int a=scanner.nextInt();
//        System.out.println("输入操作数2：");
//        int b=scanner.nextInt();
//        System.out.println("输入操作符（+ - * /）：");
//        String s = scanner.next();
//        System.out.println("输出结果：");
//        switch (s){
//            case "+":
//                System.out.println(a+b);
//                break;
//            case "-":
//                System.out.println(a-b);
//                break;
//            case "*":
//                System.out.println(a*b);
//                break;
//            case "/":
//                if (a==0||b==0){
//                    System.out.println("除数不能为0！");
//                    break;
//                }
//                System.out.println(a/b);
//                break;
//        }

        /**
         * 判断用户输入的数是奇数还是偶数
         */
//        Scanner scanner = new Scanner(System.in);
//        int a=scanner.nextInt();
//        if (a%2!=0){
//            System.out.println("您出入的是奇数！");
//        }else {
//            System.out.println("您出入的是偶数！");
//        }
//        return;
    }
}
