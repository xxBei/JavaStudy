package com.zzw.servlet;

import javax.servlet.*;
import java.io.IOException;

/**
 * servlet 生命周期演示
 * init
 * */
public class lifecycleServlet implements Servlet {
    /*
    * 项目被初始化时会调用init方法
    * 一个servlet只会初始化一次,init方法只会执行一次
    * */
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("servlet初始化时被调用....");
    }

    /*
    * 只要客户端有请求,就会执行service方法
    * 该方法可以被执行多次,一次请求,对应一次service方法
    * */
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("只要客户端有请求就会被调用....");
    }

    /*
    * servlet 销毁的时候,就会执行此方法
    * 1.将该项目从服务器移除
    * 2.正常关闭服务器就会执行destroy方法
    * */
    @Override
    public void destroy() {
        System.out.println("servlet被销毁时会被调用...");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public String getServletInfo() {
        return null;
    }


}
