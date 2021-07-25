package SouthWind.s031.TCP;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        Socket socket=null;
        OutputStream outputStream=null;
        InputStream inputStream=null;
        DataInputStream dataInputStream=null;
        DataOutputStream dataOutputStream=null;

        try {
            //获取客户端的地址和端口号 建立管道
            socket=new Socket("127.0.0.1",8080);
            System.out.println("客户端启动。。开始发送消息。。");
            String request = "你好！";
            //发送消息
            outputStream=socket.getOutputStream();
            dataOutputStream=new DataOutputStream(outputStream);
            dataOutputStream.writeUTF(request);

            //接收消息
            inputStream=socket.getInputStream();
            dataInputStream=new DataInputStream(inputStream);
            String response = dataInputStream.readUTF();
            System.out.println("服务端响应："+response);

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                inputStream.close();
                outputStream.close();
                dataInputStream.close();
                dataOutputStream.close();
                socket.close();
                System.out.println("客户端关闭！");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
