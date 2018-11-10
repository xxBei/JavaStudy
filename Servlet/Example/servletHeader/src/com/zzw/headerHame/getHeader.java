package com.zzw.headerHame;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

public class getHeader extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /**
         * 获取头信息
         *
         * req.getHeaderNames()  用于获取所有头信息名称
         * req.getHeader()  用于获取头信息的详细内容
         *
         * 将所有头信息名称用枚举集合存储
         * Enumeration<String> headerNames = req.getHeaderNames();
         *
         * 遍历枚举集合将其遍历并获取每个头信息名称中具体内容
         *
         * */
        Enumeration<String> headerNames = req.getHeaderNames();
        while(headerNames.hasMoreElements()){
            String name = headerNames.nextElement();
            String value = req.getHeader(name);
            System.out.println(name+":"+value);
        }


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
