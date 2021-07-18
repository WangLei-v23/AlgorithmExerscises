package SouthWind.s028;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test5 {
    //字节输出缓冲流
    public static void main(String[] args) {
        FileOutputStream fileOutputStream=null;
        BufferedOutputStream bufferedOutputStream=null;

        try {
            fileOutputStream=new FileOutputStream("D:\\appDonwload\\BaiduNetdiskDownload\\test.txt");
            bufferedOutputStream=new BufferedOutputStream(fileOutputStream);
            String str="ENTJ：外向，直觉，思维，判断。ENTJ型的人是伟大的领导者和作决定的人。对ENTJ类型的人来说，一生中最重要的是展现自身的实力并实现某些重大的事情。他们是天生的指挥家和领导者。这一点无论在他们身为世界领导人时所展现的魅力和手腕上，还是在身为宗教领导人时所体现的领导力上，都得到很好的映证。ENTJ人喜欢先设计好一个计划，然后再去实现它。ENTJ型的人有时会急于做决定，偶尔放慢脚步可以给他们机会来收集到所有相关的数据，并可以将实际情况与自身立场仔细地考虑清楚。";
            bufferedOutputStream.write(str.getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedOutputStream.close();
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }
}
