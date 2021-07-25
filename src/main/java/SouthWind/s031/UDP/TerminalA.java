package SouthWind.s031.UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketAddress;


public class TerminalA {
    public static void main(String[] args) throws Exception {
        //接收数据
        byte[] buff = new byte[1024];
        DatagramPacket datagramPacket=new DatagramPacket(buff,buff.length);
        DatagramSocket datagramSocket=new DatagramSocket(8181);
        datagramSocket.receive(datagramPacket);
        String mess = new String(datagramPacket.getData(), 0, datagramPacket.getLength());
        System.out.println("我是TerminalA，接收到了" + datagramPacket.getPort() + "传来的数据：" + mess);

        //发送数据
        String reply = "我是TerminalA,已接收到你发来的数据";
        SocketAddress socketAddress = datagramPacket.getSocketAddress();
        DatagramPacket datagramPacket1 = new DatagramPacket(reply.getBytes(), reply.getBytes().length, socketAddress);
        datagramSocket.send(datagramPacket1);
    }
}
