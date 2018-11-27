package com.zzw.web.servlet;

import com.zzw.Demo.Student;
import com.zzw.dao.StuList_jdbc;
import com.zzw.dao.User_login;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "LoginServlet", urlPatterns = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        String username = request.getParameter("username");
        String password = request.getParameter("password");


        //判断用户名和密码是否正确
        boolean isSuccess = User_login.login(username,password);
        if(isSuccess){
            //response.getWriter().write("登录成功");

            //查询所有学生信息
            StuList_jdbc stu = new StuList_jdbc();
            List<Student> list = stu.findAll();
            request.getSession().setAttribute("list",list);


            //重定向
            response.sendRedirect("stu_list.jsp");
        }else{
            response.getWriter().write("用户名或密码错误");
        }

    }
}
