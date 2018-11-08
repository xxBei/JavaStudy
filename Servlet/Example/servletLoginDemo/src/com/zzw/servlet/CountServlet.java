package com.zzw.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class CountServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取Servlet对象
        ServletContext context = getServletContext();
        //用于获取LoginServlet中使用getServletContext存储的count
        int count = (int) context.getAttribute("count");

        //将结果打印在网页上
        PrintWriter pw = resp.getWriter();
        pw.write("count="+count);
    }
}
