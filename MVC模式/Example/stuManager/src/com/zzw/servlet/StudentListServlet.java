package com.zzw.servlet;

import com.zzw.domain.Student;
import com.zzw.service.StudentService;
import com.zzw.service.impl.StudentServiceImpl;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;


public class StudentListServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        try {
            StudentService service = new StudentServiceImpl();
            List<Student> list = service.findAll();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
