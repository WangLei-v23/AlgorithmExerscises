package SouthWind.s028;

import java.io.*;

public class copyTest {
    public static void main(String[] args) {
        FileReader fileReader=null;
        FileWriter fileWriter=null;
        try {
            fileReader = new FileReader("D:\\appDonwload\\BaiduNetdiskDownload\\test2.txt");
            fileWriter=new FileWriter("D:\\appDonwload\\BaiduNetdiskDownload\\OutPutTest\\testCopy.txt");
            int temp=0;
            while ((temp=fileReader.read())!=-1){
                fileWriter.write(temp);
            }
            fileWriter.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileReader.close();
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
