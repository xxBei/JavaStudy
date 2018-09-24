package com.zzw.TCPDemo;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 *      使用TCP协议发送数据
 *          创建发送端Socket对象(创建连接)
 *          获取输出流对象
 *          发送数据
 *          释放资源
 *
*   Exception in thread "main" java.net.ConnectException: Connection refused: connect
 *      表示连接异常,没有接收的服务端,所以产生这个错误
 *
 * */
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        //创建发送端Socket对象(创建连接)
        Socket socket = new Socket(InetAddress.getByName("zbei"),10086);
        //获取输出流对象
        OutputStream os = socket.getOutputStream();
        //发送数据
        String str = "hello TCP,I'm comming!!!";
        os.write(str.getBytes());
        //释放资源
        socket.close();
    }
}
