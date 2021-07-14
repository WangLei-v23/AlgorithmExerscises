package SouthWind.s028;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Test {
    public static void main(String[] args) {
        Reader reader=null;
        try {
            reader = new FileReader("D:\\appDonwload\\BaiduNetdiskDownload\\test.txt");
            //输出ascll
            int temp=0;
            while ((temp=reader.read())!=-1){
                System.out.printf(temp+" ");
            }
            System.out.println();

            reader = new FileReader("D:\\appDonwload\\BaiduNetdiskDownload\\test.txt");
            //输出字符
            char[] chars = new char[10];
            int read = reader.read(chars,2,4);
            System.out.println(read);
            for (char achar:
                 chars) {
                System.out.printf(achar+"");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
