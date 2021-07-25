package SouthWind.s031.TCP;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        ServerSocket serverSocket=null;
        Socket socket=null;
        OutputStream outputStream=null;
        InputStream inputStream=null;
        DataInputStream dataInputStream=null;
        DataOutputStream dataOutputStream=null;

        try {
            //定义服务器端口号
            serverSocket = new ServerSocket(8080);
            System.out.println("服务器启动。。开始接受消息。。");
            //保持开启状态
            while (true){
                //实例化socket 建立通信管道 接受消息
                socket=serverSocket.accept();
                //获取接受到的字节流
                inputStream=socket.getInputStream();
                //将字节流封装
                dataInputStream=new DataInputStream(inputStream);
                String readUTF = dataInputStream.readUTF();
                System.out.println("接收到了客户端请求："+readUTF);

                //获取管道的字节输出流 回复消息
                outputStream = socket.getOutputStream();
                //将字节流封装
                dataOutputStream=new DataOutputStream(outputStream);
                String reponse = "Hello World";
                dataOutputStream.writeUTF(reponse);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                serverSocket.close();
                socket.close();
                outputStream.close();
                inputStream.close();
                dataInputStream.close();
                dataOutputStream.close();
                System.out.println("服务器关闭！");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
