package SouthWind.s027;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyTest {
    public static void main(String[] args) throws Exception {
//        System.out.println(copy("D:\\appDonwload\\BaiduNetdiskDownload\\test.txt", "D:\\appDonwload\\BaiduNetdiskDownload\\OutPutTest\\testCopy.txt"));
        //极简实现
        FileInputStream inputStream = new FileInputStream("D:\\appDonwload\\BaiduNetdiskDownload\\test.txt");
        FileOutputStream outputStream = new FileOutputStream("D:\\appDonwload\\BaiduNetdiskDownload\\OutPutTest\\testCopy.txt");
        int temp=0;
        while ((temp=inputStream.read())!=-1){
            outputStream.write(temp);
        }
        inputStream.close();
        outputStream.close();
    }

    public static String copy(String sourcePath,String targetPath) throws Exception {
        String callback="0";
        File source = new File(sourcePath);
        File target = new File(targetPath);
        if (source.exists()){
            FileInputStream inputStream = new FileInputStream(source);
            int sourceLength = Integer.parseInt(String.valueOf(source.length()));
            byte[] sourceByte=new byte[sourceLength];
            inputStream.read(sourceByte);//将filepath文件读取为字节流，存入byte数组
            if (target.exists()){
                FileOutputStream outputStream = new FileOutputStream(target);
                outputStream.write(sourceByte);//将byte数组写入目标文件
                outputStream.close();
                callback="写入成功！";
            }else {
             callback="目标文件不存在！";
            }
            inputStream.close();
        }else {
            callback="源文件不存在！";
        }
        return callback;
    }
}
