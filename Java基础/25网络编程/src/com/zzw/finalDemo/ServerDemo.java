package com.zzw.finalDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;

//服务器
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        //创键服务器Socket
        ServerSocket serverSocket = new ServerSocket(9999);

        //监听
        Socket s = serverSocket.accept();

        //获取输入流对象
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));

        //获取用户名和密码
        String username = br.readLine();
        String password = br.readLine();

        //判断用户名和密码是否正确
        boolean flag = false;
        /*if(username.equals("zzw") && password.equals("123")) {
            flag = true;
        }*/

        //使用list接收UserDB对象里面的值获取
        List<User> users = UserDB.getUsers();

        //创键User对象,将用户名和密码传入到对象里
        User user = new User(username,password);

        /*boolean contains(Object o)
        如果此列表包含指定的元素，则返回 true 。*/
        if(users.contains(user) && users.contains(user)){
            flag = true;
        }

        //获取输出流对象
        PrintWriter out = new PrintWriter(s.getOutputStream(),true);

        //返回判断信息
        if(flag == true){
            out.println("登录成功");
        }else{
            out.println("登录失败");
        }

        //释放资源
        s.close();
        //serverSocket.close();//服务器一般不关闭
    }
}
