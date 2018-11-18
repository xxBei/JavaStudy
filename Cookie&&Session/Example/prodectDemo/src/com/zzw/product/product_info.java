package com.zzw.product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import com.zzw.util.cookieUtil;

@WebServlet(name = "product_info")
public class product_info extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取商品id
        String pro_id = request.getParameter("pro_id");

        Cookie[] cookies = request.getCookies();
        Cookie cookie = cookieUtil.findCookie(cookies,"History");
        if(cookie == null){
            //第一次访问  cookie == null
            System.out.println("第一次访问");
            Cookie c = new Cookie("History",pro_id);
            //cookie 保存时间1天
            c.setMaxAge(60*60*24*2);
            response.addCookie(c);
            response.sendRedirect("product_info.jsp");

        }else{
            //第二次访问  cookie != null
            System.out.println("---------------");
            System.out.println("第二次访问");
            String pro_idNew = cookie.getValue();
            cookie.setValue(pro_id+"#"+pro_idNew);
            cookie.setMaxAge(60*60*24*2);
            response.addCookie(cookie);
            response.sendRedirect("product_info.jsp");
        }
    }
}
