package JavaBasic;

import java.lang.reflect.Array;

public class DailyLifeGenerator {

    public static int random(){//测试通过
        //直接调用产生随机数
        int r=(int)(Math.random()*100);
        return r;
    }

    public static void item(){//测试通过
        /**
         *  活动事项：
         *  1玩pc游戏，
         *  2锻炼身体，
         *  3画画，
         *  4看闲书，
         *  5java一章，
         *  6数据结构一章（+算法题），
         *  7学英语（背单词+看原著），
         *  8一部电影（或纪录片），
         *  9复习java和数据结构各一章
         *  10GHS
         */

        int b=random();
        if(b>0&&b<=10) System.out.println("玩pc游戏");
        if (b>10&&b<=20) System.out.println("锻炼身体");
        if(b>20&&b<=30) System.out.println("bilibili");
        if(b>30&&b<=40) System.out.println("看闲书");
        if(b>40&&b<=50) System.out.println("java一章");
        if(b>50&&b<=60) System.out.println("数据结构一章");
        if(b>60&&b<=70) System.out.println("英语（背单词+看原著）");
        if(b>70&&b<=80) System.out.println("一部电影/纪录片）");
        if(b>80&&b<=90) System.out.println("复习java和数据结构各一章");
        if(b>90&&b<=100) System.out.println("GHS");

    }

    public static void main(String[] args) {

        System.out.println("【上午】");
        for (int a =0;a<2;a++){
            item();
        }
        System.out.println("【下午】");
        for (int a =0;a<2;a++){
            item();
        }
        System.out.println("【晚上】");
        item();
    }
}
