package SouthWind.s031;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;

public class Test {
    public static void main(String[] args) {
        //InetAddress  IP
        try {
            //获取本机地址   localhost
            InetAddress addresses = InetAddress.getByName("127.0.0.1");
            System.out.println(addresses);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }


        //URL  https://pic4.zhimg.com/80/v2-bd0e4154700ba9b608f427d5bfde4e56_1440w.jpg
        try {
            URL url = new URL("https://pic4.zhimg.com/80/v2-bd0e4154700ba9b608f427d5bfde4e56_1440w.jpg");
            //通过定位地址指向的资源 开启字节输入流
            InputStream inputStream = url.openStream();
            FileOutputStream outputStream = new FileOutputStream("D:\\appDonwload\\BaiduNetdiskDownload\\OutPutTest\\LiHeTian.jpg");
            System.out.println("开始下载图片。。");
            int temp=0;
            while ((temp=inputStream.read())!=-1){
                outputStream.write(temp);
                System.out.printf(".");
            }
            System.out.println();
            outputStream.close();
            inputStream.close();
            System.out.println("图片下载完成！");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
