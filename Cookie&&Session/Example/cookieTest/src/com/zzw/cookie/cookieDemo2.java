package com.zzw.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "cookieDemo2")
public class cookieDemo2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    /**
     * cookie常用方法
     * */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");

        //获取浏览器的cookie
        Cookie[] cookies = request.getCookies();
        //判断cookie是否有值
        if(cookies!=null){
            //遍历所有cookie
            for (Cookie c : cookies){
                String name = c.getName();
                String value = c.getValue();
                System.out.println(name+"="+value);
            }
        }

        Cookie cookie1 = new Cookie("name","张三");
        /*
        * 设置cookie保存时间,保存时间为秒数
        * 正值: 时间过后会失效
        * 负值: 默认-1,关闭浏览器cookie就会失效
        * 不设置时间,当浏览器关闭cookie就会失效
        * */
        cookie1.setMaxAge(60*60*24*1);//保存一天

        /*
        //赋新的值
        cookie1.setValue("newValue");

        //用于指定只有请求了指定的域名,才会带上cookie
        cookie1.setDomain(".zbei.com");
        //用于访问该域名下的cookieDemo2这个路径才会带上cookie
        cookie1.setPath("/cookieDemo2");
        */

        response.addCookie(cookie1);

        Cookie cookie2 = new Cookie("age","18");
        response.addCookie(cookie2);

        response.getWriter().write("hello cookie");


    }
}
