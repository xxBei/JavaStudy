package com.zzw.demo;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "register")
public class register extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        verify(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    /**
     * 用于将输入的用户名和密码进行注册
     * 通过ServletContext 中的setAttribute进行添加
     * */
    private void verify(HttpServletRequest request, HttpServletResponse response) {
        String userName = request.getParameter("username");
        String passWord = request.getParameter("password");

        System.out.println("username:"+userName+"password="+passWord);

        ServletContext context = getServletContext();

        context.setAttribute("username",userName);
        context.setAttribute("password",passWord);
        response.setStatus(302);
        response.setHeader("Location","logins.html");
    }
}
