package com.zzw.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

public class servletConfig extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //ServletConfig可以获取servlet配置信息

        //获取配置对象
        ServletConfig config = getServletConfig();
        //1.获取web.xml里面的servlet-name的文本内容
        String name = config.getServletName();
        System.out.println("servletName:"+name);

        //2.获取web.xml的具体某一个参数
        String address =  config.getInitParameter("address");
        System.out.println("address:"+address);

        System.out.println("-------------------");

        //3.获取web.xml的多个参数和值
        Enumeration<String> names = config.getInitParameterNames();
        while (names.hasMoreElements()){

            String key = names.nextElement();
            System.out.println("key:"+key);
            String string = config.getInitParameter(key);
            System.out.println("value:"+string);
            System.out.println("*************");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
