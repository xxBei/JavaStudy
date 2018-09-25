package com.zzw.TCPDemo2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        //创建服务端
        ServerSocket ss = new ServerSocket(10010);
        //阻塞
        Socket s = ss.accept();
        //获取数据
        InputStream is = s.getInputStream();
        byte[] bytes = new byte[1024];
        int len;
        len = is.read(bytes);
        String str = new String(bytes,0,len);
        //输出数据
        System.out.println(str);

        //转换数据
        String upStr = str.toUpperCase();
        //创建输出对象
        OutputStream os = s.getOutputStream();
        //发送数据
        os.write(upStr.getBytes());



        //释放资源
        s.close();
    }
}
