package com.zzw.servlet;

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
import java.util.List;

@WebServlet(name = "StudentSearchServlet",urlPatterns = "/StudentSearchServlet")
public class StudentSearchServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String sname = request.getParameter("sname");
        String gender = request.getParameter("gender");
        System.out.println("-----search:"+sname+":"+gender);

        try {
            StudentService service = new StudentServiceImpl();
            List<Student> list = service.findName(sname,gender);
            request.setAttribute("list",list);
            request.getRequestDispatcher("stuList.jsp").forward(request,response);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
