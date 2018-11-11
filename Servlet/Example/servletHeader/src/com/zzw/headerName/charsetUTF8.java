package com.zzw.headerName;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class charsetUTF8 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //doGet(request, response);
        //用于解决post提交中文乱码
        request.setCharacterEncoding("UTF-8");
        String name = request.getParameter("name");
        String address = request.getParameter("address");
        System.out.println(name+"==="+address);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //String name = request.getParameter("name");
        //System.out.println(name);
        // 处理乱码  注意tomcat8.0之后,服务器默认的地址栏编码不在是ISO-8859-1,而变成了UTF-8
        //name = new String(name.getBytes("ISO-8859-1"),"UTF-8");
        //System.out.println(name);// 乱码问题解决
    }
}
