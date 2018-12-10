package com.zzw.servlet;

import com.zzw.domain.User;
import com.zzw.service.UserLoginService;
import com.zzw.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "UserLonginServlet",urlPatterns = "/UserLonginServlet")
public class UserLonginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException
            , IOException {
        doGet(request,response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        UserLoginService userService = new UserServiceImpl();
        try {
            List<User> list = userService.user_login();
            for(User user:list){
                if(username.equals(user.getUname()) && password.equals(user.getUpassword())){
                    response.sendRedirect("stuList.jsp");
                }else{
                    response.getWriter().write("用户名或密码错误!");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
