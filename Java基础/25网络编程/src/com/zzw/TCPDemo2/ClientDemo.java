package com.zzw.TCPDemo2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;


/**
 *
 * 需求:
 *      使用 TCP 协议发送数据，并将接收的数据转换成大写返回
 *
 *      客户端发送数据
 *      服务端接收数据
 *      服务端转换数据
 *      服务端发送数据
 *      客户端接收数据
 *
 * */
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        //创建socket对象
        Socket s = new Socket(InetAddress.getByName("zbei"),10010);
        //创建输出对象
        OutputStream os = s.getOutputStream();
        //发送数据
        String str = "tcp,i'm comming!!!";
        os.write(str.getBytes());

        //接收数据
        InputStream is = s.getInputStream();
        //获取数据
        byte[] bytes = new byte[1024];
        int len;
        len = is.read(bytes);
        String upStr = new String(bytes,0,len);
        //输出数据
        System.out.println(upStr);

        //释放资源
        s.close();
    }
}
