package SouthWind.s028;

import java.io.*;

public class copyTest2 {
    //字符流只适用于文本类型的文件读写，非文本类型的文件复制需要使用字节流，否则会破坏源文件的数据结构
    //此处代码为字节缓冲流版本的文件复制，以字节形式读写，保留了文件原有的数据结构
    public static void main(String[] args) {
        FileInputStream fileInputStream=null;
        BufferedInputStream bufferedInputStream=null;
        FileOutputStream fileOutputStream=null;
        BufferedOutputStream bufferedOutputStream=null;

        try {
            fileInputStream=new FileInputStream("C:\\Users\\WangLei\\Pictures\\processOn\\02.png");
            bufferedInputStream=new BufferedInputStream(fileInputStream);
            fileOutputStream=new FileOutputStream("D:\\appDonwload\\BaiduNetdiskDownload\\02copy.png");
            bufferedOutputStream=new BufferedOutputStream(fileOutputStream);
            int temp=0;
            while ((temp=bufferedInputStream.read())!=-1){
                bufferedOutputStream.write(temp);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedInputStream.close();
                bufferedOutputStream.close();
                fileInputStream.close();
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
