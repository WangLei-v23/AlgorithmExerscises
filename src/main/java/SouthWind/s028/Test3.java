package SouthWind.s028;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test3 {
    //字节输入缓冲流
    public static void main(String[] args) {
        FileInputStream fileInputStream=null;
        BufferedInputStream bufferedInputStream=null;
        try {
            fileInputStream = new FileInputStream("D:\\appDonwload\\BaiduNetdiskDownload\\test.txt");
            bufferedInputStream = new BufferedInputStream(fileInputStream);
            int temp=0;
            while ((temp=bufferedInputStream.read())!=-1){
                System.out.printf(temp+" ");
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileInputStream.close();
                bufferedInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
