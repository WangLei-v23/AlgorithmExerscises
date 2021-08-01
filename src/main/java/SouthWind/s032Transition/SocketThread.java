package SouthWind.s032Transition;


import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class SocketThread implements Runnable{
    private Socket socket;

    public SocketThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        //聊天，接收客户端发来的数据，给客户端发数据
        InputStream inputStream=null;
        DataInputStream dataInputStream=null;
        OutputStream outputStream=null;
        DataOutputStream dataOutputStream=null;
        String message = null;
        Scanner scanner = new Scanner(System.in);

        while (true){
            try {
                //读客户端
                inputStream=socket.getInputStream();
                dataInputStream=new DataInputStream(inputStream);
                message=dataInputStream.readUTF();
                System.out.println("客户端:"+message);

                //写向客户端
                System.out.print("服务器：");
                message=scanner.next();
                outputStream=socket.getOutputStream();
                dataOutputStream=new DataOutputStream(outputStream);
                dataOutputStream.writeUTF(message);

            } catch (IOException e) {
                e.printStackTrace();
            } finally {
//                try {
//                    dataInputStream.close();
//                    dataOutputStream.close();
//                    inputStream.close();
//                    outputStream.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
            }
        }

    }
}
