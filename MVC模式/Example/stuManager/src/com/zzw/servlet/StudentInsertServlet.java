package com.zzw.servlet;

import com.zzw.service.StudentService;
import com.zzw.service.impl.StudentServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "StudentInsertServlet",urlPatterns = "/StudentInsertServlet")
public class StudentInsertServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String sname = request.getParameter("sname");
        int gender = Integer.parseInt(request.getParameter("gender"));
        String phone = request.getParameter("phone");
        String birthday = request.getParameter("birthday");
        String info = request.getParameter("info");

        StudentService service = new StudentServiceImpl();
        try {
            service.insertStuInfo(sname,gender,phone,birthday,info);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        response.sendRedirect("stuList.jsp");
    }
}
