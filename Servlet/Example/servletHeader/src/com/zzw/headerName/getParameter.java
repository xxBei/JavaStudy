package com.zzw.headerName;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

public class getParameter extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    /**
     * 主要讲解request 获取浏览器参数的几种方法
     * 第一种将浏览器参数存储到枚举集合
     *      Enumeration<String> parameterNames = request.getParameterNames();
     *
     * 第二种将浏览器参数存储到map集合
     *      Map<String,String[]> map = request.getParameterMap();
     *
     * */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /**
         * 用于获取所有浏览器传来的参数
         *
         * request.getParameterNames() : 用于获取所有参数的name
         * request.getParameter(name)  : 根据获取的name来找到对应的值
         *
         *
         * 浏览器get传参方式
         * ?name=zhangsan&address=handan
         * */
        /*Enumeration<String> parameterNames = request.getParameterNames();
        while (parameterNames.hasMoreElements()){
            String name = parameterNames.nextElement();
            String value = request.getParameter(name);
            System.out.println(name+"="+value);
        }*/

        /**
         * 获取一个key对应一个value
         *
         * 浏览器get传参方式
         * ?name=zhangsan&address=handan
         * */
        Map<String,String[]> map = request.getParameterMap();
        for(Map.Entry<String,String[]> entry : map.entrySet()){
            String key = entry.getKey();
            String value = entry.getValue()[0];

            System.out.println(key + "=" + value);
        }


        /**
         * 获取一个key对应多个value
         *
         * 浏览器get传参方式
         * ?name=zhangsan&address=handan
         *
         * 将浏览器参数存储到map集合中
         * 通过 map entrySet遍历集合,该方法可以同时拿到 key和 value .
         *
         * 用于获取浏览器传递来的 key
         * String name = entry.getKey();
         *
         * 用于获取浏览器传递来的所有 value , 注意,由于是多个value,所以需要是用数组形式进行存储的
         *    想要得到多个 value 需要循环出所有value
         * String value = entry.getValue()
         * */
        /*Map<String,String[]> map = request.getParameterMap();
        for (Map.Entry<String,String[]> entry: map.entrySet()) {
            String name = entry.getKey();
            for(var i=0;i<entry.getValue().length;i++) {
                String value = entry.getValue()[i];
                System.out.println(name + "=" + value);
            }
        }*/
    }
}
