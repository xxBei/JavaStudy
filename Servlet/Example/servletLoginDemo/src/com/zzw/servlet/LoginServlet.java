package com.zzw.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }


    /*
    * request : 用于从浏览器传送数据
    *
    * response : 用于向浏览器传送数据
    * */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName = request.getParameter("username");
        String passWord = request.getParameter("password");
        System.out.println("username="+userName+"---"+"password="+passWord);

        //向客户端输出内容
        PrintWriter pw = response.getWriter();

        if(userName.equals("zzw") && passWord.equals("123")){
            //System.out.println("登录成功");
            /*以下两种方法是用于在页面中输出文字*/
            //pw.println("login success");
            //pw.write("login success");


            //获取servletContext对象
            ServletContext context = getServletContext();

            //用于获取以前登陆的次数
            Object obj = context.getAttribute("count");

            //定义第一次登陆的默认值
            int totalCount = 0;
            //如果以前登陆次数不是第一次,就让totalCount的值为之前存的值
            if(obj != null){
                totalCount = (int) obj;
            }



            //给这个count赋新值
            context.setAttribute("count",totalCount+1);
            System.out.println("登陆次数为:"+totalCount);

            //设置状态码 重新定位 状态码
            response.setStatus(302);
            //用于定位跳转到哪个网页
            response.setHeader("Location","login_success.html");
        }else{
            //System.out.println("登录失败");
            //pw.println("login failed");
            pw.write("login failed");
        }
    }
}
