package SouthWind.s027;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) throws Exception {
        File file = new File("D:\\appDonwload\\BaiduNetdiskDownload\\test3.txt");
        FileInputStream inputStream = new FileInputStream(file);
        for (int i = 0; i <file.length() ; i++) {
            System.out.print(inputStream.read()+" ");
        }
        System.out.println();
        inputStream = new FileInputStream(file);
        int temp=0;
        while ((temp=inputStream.read())!=-1){
            System.out.print(temp+" ");
            System.out.println("待读取的个数==="+inputStream.available());
        }

        inputStream = new FileInputStream(file);
        byte[] bytes = new byte[20];
        System.out.println(inputStream.read(bytes));
        System.out.println(Arrays.toString(bytes));

//        inputStream = new FileInputStream(file);
//        byte[] b=inputStream.readAllBytes(); //jdk14
        inputStream.close();

    }
}
