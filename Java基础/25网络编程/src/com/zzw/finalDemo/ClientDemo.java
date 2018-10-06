package com.zzw.finalDemo;

import java.io.*;
import java.net.Socket;

// 用户登录判断(对象版本)
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        //创键Socket对象
//        Socket s = new Socket(InetAddress.getByName("zbei"),8888);
        Socket s = new Socket("zbei",9999);

        //获取输入流对象
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //获取用户名和密码
        System.out.println("请输入用户名:");
        String username = br.readLine();
        System.out.println("请输入密码:");
        String password = br.readLine();

        //获取输出对象
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        PrintWriter out = new PrintWriter(s.getOutputStream(),true);
        //写出数据
        out.println(username);
        out.println(password);

        //获取输入流对象
        BufferedReader serverBr = new BufferedReader(new InputStreamReader(s.getInputStream()));

        //获取服务器端返回的数据
        String result = serverBr.readLine();

        //输出结果
        System.out.println(result);

        //释放资源
        s.close();
    }
}
