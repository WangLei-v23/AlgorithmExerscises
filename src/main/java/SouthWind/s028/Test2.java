package SouthWind.s028;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Test2 {
    public static void main(String[] args) {
        FileWriter fileWriter = null;
        try {
            fileWriter=new FileWriter("D:\\appDonwload\\BaiduNetdiskDownload\\test2.txt");
            //单字符写入
            fileWriter.write(20710);
            fileWriter.write(21012);
            //数组写入 可截取或全部写入
            char[] chars={'巴','克','亚','罗'};
            fileWriter.write(chars,1,2);
            //字符串写入 可截取或全部写入
            String str="少冲塔，多读书";
            fileWriter.write(str,1,3);
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
