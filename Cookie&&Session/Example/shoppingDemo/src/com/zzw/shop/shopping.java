package com.zzw.shop;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public class shopping extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");

        //获取添加到购物车的商品id
        int id = Integer.parseInt(request.getParameter("id"));
        System.out.println("商品id:"+id);
        String[] shop_list = {"iPhone XR","小米8","华为 mate20","魅族 pro8"};
        //获取商品id对应的商品名称
        String name = shop_list[id];
        System.out.println("商品名称:"+name);

        Map<String,Integer> map = (Map<String, Integer>) request.getSession().getAttribute("cars");
        if(map == null){
            map = new LinkedHashMap<>();
            request.getSession().setAttribute("cars",map);
        }
        //判断商品中是否存在此商品名称
        if(map.containsKey(name)){
            //如果商品存在,就在数量上加1
            map.put(name,map.get(name)+1);
        }else{
            //如果商品不存在,就在数量写1
            map.put(name,1);
        }
        System.out.println(map);
        response.getWriter().write("<h3><a href='index.jsp'>继续购物</a></h3>");
        response.getWriter().write("<h3><a href='cars.jsp'>返回购物车</a></h3>");
    }
}
