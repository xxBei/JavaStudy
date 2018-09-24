package com.zzw.TCPDemo;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * TCP协议接收数据
 *      创建接收端Socket对象
 *      监听(阻塞)
 *      获取输入对象
 *      获取数据
 *      输出数据
 *      释放资源
 * */
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        //创建接收端Socket对象
        ServerSocket serverSocket = new ServerSocket(10086);
        //监听
        Socket s = serverSocket.accept();
        //获取输入对象
        InputStream is = s.getInputStream();
        byte[] bytes = new byte[1024];
        int len;//用于读取的个数
        len = is.read(bytes);
        //输出数据
        System.out.println("client ---> " + s.getInetAddress().getHostName());
        System.out.println(new String(bytes,0,len));
        //释放资源
        s.close();
        //serverSocket.close();
    }
}
