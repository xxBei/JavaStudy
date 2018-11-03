package com.zzw.serverlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * HttpServlet 为通用方法
 * 相比较 接口servlet方法 可以选择一些常用的方法,没有用到的方法不需要全部去实现
 * */


public class helloServlet extends HttpServlet {
    //Get请求会来这个方法
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
        System.out.println("get...");
    }

    //Post
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
        System.out.println("post...");
    }
}
