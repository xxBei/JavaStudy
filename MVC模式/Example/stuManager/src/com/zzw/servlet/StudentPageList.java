package com.zzw.servlet;

import com.zzw.domain.PageBean;
import com.zzw.domain.Student;
import com.zzw.service.StudentService;
import com.zzw.service.impl.StudentServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "StudentPageList",urlPatterns = "/StudentPageList")
public class StudentPageList extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取需要的页码数
        int currentPage = Integer.parseInt(request.getParameter("currentPage"));

        //根据指定的页数,获取该页数的数据
        try {
            StudentService service = new StudentServiceImpl();
            PageBean pageBean = service.findStudentByPage(currentPage);
            request.setAttribute("pageBean",pageBean);
            //跳转页面
            request.getRequestDispatcher("stuListPage.jsp").forward(request,response);
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
