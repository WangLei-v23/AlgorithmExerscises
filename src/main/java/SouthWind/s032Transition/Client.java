package SouthWind.s032Transition;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Socket socket = null;
        InputStream inputStream = null;
        DataInputStream dataInputStream = null;
        OutputStream outputStream = null;
        DataOutputStream dataOutputStream = null;
        Scanner scanner = new Scanner(System.in);
        String message = null;
        try {
            socket = new Socket("127.0.0.1", 8081);
            System.out.println("客户端已启动。。。");

            while (true){
                //写
                System.out.print("客户端：");
                message = scanner.next();
                outputStream=socket.getOutputStream();
                dataOutputStream=new DataOutputStream(outputStream);
                dataOutputStream.writeUTF(message);
                //读
                inputStream=socket.getInputStream();
                dataInputStream=new DataInputStream(inputStream);
                message=dataInputStream.readUTF();
                System.out.println("服务器：" + message);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
//            try {
//                dataInputStream.close();
//                dataOutputStream.close();
//                inputStream.close();
//                outputStream.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
        }

    }
}
