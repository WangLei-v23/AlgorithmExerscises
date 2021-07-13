package SouthWind.s027;

import java.io.File;
import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        File file1 = new File("D:\\appDonwload\\BaiduNetdiskDownload\\test.txt");
        File file2 = new File("D:\\appDonwload\\BaiduNetdiskDownload\\test2.txt");
        try {
            if (!file2.exists()){
                if (file2.createNewFile()){//根据当前对象创建文件
                    System.out.println(file2);
                }
            }else{
                System.out.println(file2.getName());
                System.out.println(file2.length());
                System.out.println(file2.getPath());
                System.out.println(file2.getParent());
                System.out.println(file2.getParentFile());
                File parentFile = file2.getParentFile();
                if (parentFile.isDirectory()){
                    System.out.println(parentFile.getName()+"===是一个文件夹");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(file1);
        System.out.println("**************************************************");
        File file3 = new File("D:\\appDonwload\\BaiduNetdiskDownload\\test3.txt");
        System.out.println(file2.renameTo(file3));
        System.out.println(file1.delete());


    }
}
