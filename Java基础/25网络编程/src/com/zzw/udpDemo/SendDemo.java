package com.zzw.udpDemo;

import java.io.IOException;
import java.net.*;

/**
 * 使用 UDP 协议发送数据
 *      创建发送端的Socket对象
 *      创建数据并打包
 *      发送数据
 *      释放资源
 * */
public class SendDemo {

    /**
     * DatagramSocket : 此类用来发送和接收数据，基于UDP协议
     * */
    public static void main(String[] args) throws IOException {
        //创建发送端Socket对象
        DatagramSocket dg = new DatagramSocket();
        //创建数据并打包
        /**
         * DatagramPacket : 表示数据报包
         * 数据 byte[]
         * 设备IP
         * 进程地址 端口号
         * */
        String data = "hello UDP";
        byte[] bytes = data.getBytes();
        int length = bytes.length;
        InetAddress address = InetAddress.getByName("zbei");
        int port = 8888;
        DatagramPacket dp = new DatagramPacket(bytes,length,address,port);
        //发送数据
        dg.send(dp);
        //释放资源
        dg.close();
    }
}
