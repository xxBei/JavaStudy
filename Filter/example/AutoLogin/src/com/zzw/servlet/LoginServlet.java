package com.zzw.servlet;

import com.zzw.dao.UserDao;
import com.zzw.dao.impl.UserImpl;
import com.zzw.domain.UserBean;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "LoginServlet" , urlPatterns = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            String autoBtn = request.getParameter("autoBtn");

            UserBean user = new UserBean();
            user.setUname(username);
            user.setUpassword(password);

            UserDao dao = new UserImpl();
            UserBean userBean = dao.login(user);
            if(userBean!=null){

                if("on".equals(autoBtn)){
                    Cookie cookie = new Cookie("auto_login",username+"#user#"+password);
                    cookie.setMaxAge(60*60*24*3);
                    cookie.setPath(request.getContextPath());
                    response.addCookie(cookie);
                }


                request.getSession().setAttribute("userBean", userBean);
                response.sendRedirect("index.jsp");
            }else{
                request.getRequestDispatcher("login.jsp").forward(request,response);
            }
            System.out.println(username+"--"+password+"--"+autoBtn);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
