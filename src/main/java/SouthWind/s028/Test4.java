package SouthWind.s028;

import java.io.*;

public class Test4 {
    //字符输入缓冲流
    public static void main(String[] args) {
        FileReader fileReader=null;
        BufferedReader bufferedReader=null;
        try {
            fileReader=new FileReader("D:\\appDonwload\\BaiduNetdiskDownload\\test.txt");
            bufferedReader = new BufferedReader(fileReader);
            String str="";
            while ((str=bufferedReader.readLine())!=null){
                System.out.println(str);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedReader.close();
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
