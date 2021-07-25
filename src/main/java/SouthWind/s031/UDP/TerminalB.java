package SouthWind.s031.UDP;

import java.net.*;

public class TerminalB {
    public static void main(String[] args) throws Exception {
        //发送数据
        String reply = "我是TerminalB,你好";
        InetAddress inetAddress = InetAddress.getByName("localhost");
        DatagramPacket datagramPacket = new DatagramPacket(reply.getBytes(), reply.getBytes().length, inetAddress, 8181);
        DatagramSocket datagramSocket = new DatagramSocket(8080);
        datagramSocket.send(datagramPacket);

        //接收数据
        byte[] buff = new byte[1024];
        DatagramPacket datagramPacket2 = new DatagramPacket(buff, buff.length);
        datagramSocket.receive(datagramPacket2);
        String mess = new String(datagramPacket2.getData(), 0, datagramPacket2.getLength());
        System.out.println("我是TerminalB，接收到了" + datagramPacket2.getPort() + "返回的数据：" + mess);

    }
}
