package com.zzw.demo;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class login extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        ServletContext context = getServletContext();
        String oldUser = (String) context.getAttribute("username");
        String oldPass = (String) context.getAttribute("password");

        PrintWriter pw = response.getWriter();
        if(username.equals(oldUser) && password.equals(oldPass)){
            response.setStatus(302);
            response.setHeader("Location","login_success.html");
            System.out.println("登录成功");
        }else{
//            name = new String(name.getBytes("ISO-8859-1"),"UTF-8");

            pw.println("登录失败");
        }
    }
}
