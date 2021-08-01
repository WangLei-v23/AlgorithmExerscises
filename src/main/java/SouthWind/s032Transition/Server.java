package SouthWind.s032Transition;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        Socket socket = null;

        try {
            serverSocket = new ServerSocket(8081);
            System.out.println("服务器已启动。。");
            //聊天业务 多线程启动
            while (true) {
                socket=serverSocket.accept();
                new Thread(new SocketThread(socket)).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
//            try {
//                serverSocket.close();
//                socket.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
        }
    }
}
