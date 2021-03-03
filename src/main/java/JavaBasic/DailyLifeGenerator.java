package JavaBasic;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class DailyLifeGenerator {

    public static int random() {//测试通过
        //直接调用产生随机数
        return (int) (Math.random() * 100);
    }

    public static void item() {//测试通过
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

        int b = random();
        if (b > 0 && b <= 10) System.out.println("pc-game");
        if (b > 10 && b <= 20) System.out.println("work-body");
        if (b > 20 && b <= 30) System.out.println("bilibili");
        if (b > 30 && b <= 40) System.out.println("c++");
        if (b > 40 && b <= 50) System.out.println("java");
        if (b > 50 && b <= 60) System.out.println("data-structure");
        if (b > 60 && b <= 70) System.out.println("english");
        if (b > 70 && b <= 80) System.out.println("leetcode");
        if (b > 80 && b <= 95) System.out.println("draft");
        if (b > 95 && b <= 100) System.out.println("comic");

    }

    public static void main(String[] args) {
        //获取今天日期
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(new Date());
        //日期格式化转换
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        //得到日期字符
        String today = sdf.format(calendar.getTime());
        //新建文件
        File file = new File("C:\\Users\\WangLei\\Desktop\\today\\DailyLife-" + today + ".txt");
        try {
            //需要新增文件重复性校验  已存在 则将该文件重新写入 不存在 则生成文件并写入
            if (file.exists()){

            }else{
                file.createNewFile();
            }
            //考虑如何定时离线生成文件 或将生成的文件发送到手机

            //将控制台内容输入文件
            FileOutputStream fos = new FileOutputStream(file);
            PrintStream ps = new PrintStream(fos);
            System.setOut(ps);
            System.out.println("【上午】");
            for (int a = 0; a < 2; a++) {
                item();
            }
            System.out.println("【下午】");
            for (int a = 0; a < 2; a++) {
                item();
            }
            System.out.println("【晚上】");
            item();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
