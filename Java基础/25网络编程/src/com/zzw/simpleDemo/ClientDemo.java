package com.zzw.simpleDemo;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

/*
* 模拟用户登录
* */
public class ClientDemo {
    public static void main(String[] args) throws IOException {
//        创建客户端socket对象
//        Socket s = new Socket(InetAddress.getByName("zbei"),8888);
        Socket s = new Socket("zbei",8888);

        //获取用户名和密码
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入用户名:");
        String username = br.readLine();
        System.out.println("请输入密码:");
        String password = br.readLine();

        //获取输出对象
//        PrintWriter pw = new PrintWriter(new OutputStreamWriter(s.getOutputStream()));
        PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
        pw.println(username);
        pw.println(password);

        //获取输入对象
        BufferedReader serverBr = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String jieguo = serverBr.readLine();
        System.out.println(jieguo);

        //释放资源
        s.close();
    }
}
