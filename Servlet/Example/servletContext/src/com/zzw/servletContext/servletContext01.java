package com.zzw.servletContext;


import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class servletContext01 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /**
         * ServletContext
         *    获取全局变量
         *    getInitParameter 可以用于获取web.xml的context-param中的param-name里的东西
         * */
        //获取ServletContext对象
        ServletContext context = getServletContext();
        String  address = context.getInitParameter("address");
        System.out.println("servletContext01 的address:"+address);


    }
}
