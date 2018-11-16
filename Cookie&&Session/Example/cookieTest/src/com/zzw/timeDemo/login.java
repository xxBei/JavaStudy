package com.zzw.timeDemo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class login extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if(username.equals("zzw") && password.equals("123")){
            Cookie[] cookies = request.getCookies();
            Cookie cookie = cookieUtil.findCookie(cookies,"last");
            if(cookie == null){
                Cookie c = new Cookie("last",cookieUtil.getDates());
                c.setMaxAge(60*60);
                response.addCookie(c);
                response.getWriter().write("欢迎您,"+username);
            }else{
                String lastDate = cookie.getValue();
                response.getWriter().write("欢迎您,"+username+"&emsp;上次登录时间:"+lastDate);

                cookie.setValue(cookieUtil.getDates());
                response.addCookie(cookie);
            }
        }else{
            response.getWriter().write("登录失败");
        }


        /*if(username.equals("zzw") && password.equals("123")){
            //获取cookie
            Cookie[] cookies = request.getCookies();
            //寻找名字叫做last的cookie
            Cookie cookie = cookieUtil.findCookie(cookies,"last");

            if(cookie == null){
                Cookie c = new Cookie("last",dateString);
                c.setMaxAge(60*60);
                response.addCookie(c);
                response.getWriter().write("欢迎您,"+username);
            }

        }else{
            response.getWriter().write("登录失败");
        }*/




    }
}
