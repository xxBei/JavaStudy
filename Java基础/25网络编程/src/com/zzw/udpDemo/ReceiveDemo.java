package com.zzw.udpDemo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;


/**
 * UDP协议接收端
 *      创建接收端Socket对象
 *      接收数据
 *      解析数据
 *      输出数据
 *      释放资源
 * */
public class ReceiveDemo {
    public static void main(String[] args) throws IOException {
        //创建接收端Socket对象
        DatagramSocket ds = new DatagramSocket(8888);

        //接收数据
        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes,bytes.length);

        System.out.println("等待接收数据");
        ds.receive(dp);//阻塞
        System.out.println("接收数据开始");

        //解析数据
        InetAddress address = dp.getAddress();//获取ip地址
        byte[] data = dp.getData();//获取数据
        int length = dp.getLength();//获取数据长度

        //输出数据
        System.out.println("sendUser ----> " + address);
        System.out.println("data ---->" + new String(data,0,length));
        //释放资源
        ds.close();
    }
}
