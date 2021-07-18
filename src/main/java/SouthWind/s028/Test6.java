package SouthWind.s028;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Test6 {
    public static void main(String[] args) {
        Writer writer=null;
        BufferedWriter bufferedWriter=null;

        try {
            writer=new FileWriter("D:\\appDonwload\\BaiduNetdiskDownload\\test.txt");
            bufferedWriter=new BufferedWriter(writer);
            String str="996 icu";
            bufferedWriter.write(str);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedWriter.close();
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
