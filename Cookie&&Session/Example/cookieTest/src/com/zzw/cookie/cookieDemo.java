package com.zzw.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "cookieDemo")
public class cookieDemo extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        解决中文乱码
        response.setContentType("text/html;charset=utf-8");

        Cookie[] cookies = request.getCookies();
        if(cookies != null){
            for (Cookie cookie:cookies) {
                String name = cookie.getName();
                String value = cookie.getValue();
            }
        }

        Cookie cookie = new Cookie("aa","10");
        response.addCookie(cookie);
        response.getWriter().write("请求成功...");



    }
}
