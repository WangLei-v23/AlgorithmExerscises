package SouthWind.s027;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class Test3 {
    public static void main(String[] args) throws Exception {
        File file = new File("D:\\appDonwload\\BaiduNetdiskDownload\\test3.txt");
        if (file.exists()){
            OutputStream outputStream = new FileOutputStream(file);
//            byte[] bytes = {12,16,33,72,90,100,108,109};
//            outputStream.write(bytes,3,3);
            String str="写入测试";
            byte[] bytes = str.getBytes();
            outputStream.write(bytes);
            outputStream.close();
            System.out.println("写入成功！");
        }else{
            System.out.println("文件不存在！");
        }

    }
}
