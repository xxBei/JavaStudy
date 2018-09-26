package com.zzw.simpleDemo;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        //创建服务端Socket
        ServerSocket ss = new ServerSocket(8888);
        //监听
        Socket s = ss.accept();

        //获取数据
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));

        //获取用户名和密码
        String username = br.readLine();
        String password = br.readLine();

        //判断用户名和密码
        boolean flag = false;
        if("zzw123".equals(username) && "123456".equals(password)){
            flag = true;
        }
        //获取输出流对象
//        PrintWriter pw = new PrintWriter(new OutputStreamWriter(s.getOutputStream()));
        PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
        if(flag){
            pw.println("登录成功");
        }else{
            pw.println("登录失败");
        }

        s.close();
    }
}
