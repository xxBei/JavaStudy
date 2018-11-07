package com.zzw.servletContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/*
* 注意: 普通读取文件,是无法读取到web服务器上的,所以需要借助其他方式获取文件资源所在路径
*
* */
public class servletContext02 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //test01();
        //test02();
        test03();

    }

    /*
    * classLoader 用于获取java的class文件,然后获取到加载这个class到虚拟机中那个类加载器对象
    * */
    public void test03() throws IOException {
        //获取属性资源对象
        Properties properties = new Properties();
        //使用类加载器获取 流对象


        /*
        * getClassLoader获取的路径是:
        *   E:\WeStudy\Java\Servlet\Example\servletContext\out\artifacts\servletContext_war_exploded\WEB-INF\classes
        *
        * 而文件资源所在路径是:
        *   E:\WeStudy\Java\Servlet\Example\servletContext\out\artifacts
        *   \servletContext_war_exploded\file\config.properties
        *
        *   所以需要返回两次上一级目录
        *
        * */
        InputStream is = this.getClass().getClassLoader().getResourceAsStream("../../file/config" +
                ".properties");


        properties.load(is);

        String name = properties.getProperty("name");
        System.out.println("name="+name);
        is.close();
    }

    /**
     * 使用getResourceAsStream获取资源 流对象
     * 直接给相对路径,然后获取流对象
     * */
    public void test02() throws IOException {
        //获取ServletContext对象
        ServletContext context = getServletContext();

        //创键属性对象
        Properties properties = new Properties();

        //getResourceAsStream 获取资源 流对象
        InputStream is = context.getResourceAsStream("file/config.properties");
        properties.load(is);

        String name = properties.getProperty("name");
        System.out.println("name="+name);
        is.close();
    }

    /**
     * 使用context.getRealPath方法获取资源绝对地址
     * */
    public void test01() throws IOException {
        //获取ServletContext对象
        ServletContext context = getServletContext();

        //获取给定文件在服务器上的绝对路径
        String path = context.getRealPath("file/config.properties");
        System.out.println("path=" + path);

        //1.创建属性对象
        Properties properties = new Properties();

        //2.指定载入的数据源
        InputStream is = new FileInputStream(path);
        //加载资源
        properties.load(is);

        String name = properties.getProperty("name");
        System.out.println("name=" + name);
        is.close();
    }
}
