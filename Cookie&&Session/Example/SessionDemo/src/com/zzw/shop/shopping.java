package com.zzw.shop;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

@WebServlet(name = "shopping")
public class shopping extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String[] names = {"iPhone XR","小米8","华为mate20","三星Note8","vivo x20"};
        String name = names[id];

        Map<String,Integer> map = (Map<String, Integer>) request.getSession().getAttribute("cars");
        if(map == null){
            map = new LinkedHashMap<>();
            request.getSession().setAttribute("cars",map);
        }
        if(map.containsKey(name)){
            map.put(name,map.get(name)+1);
        }else{
            map.put(name,1);
        }

        response.sendRedirect("cars.jsp");
    }
}
