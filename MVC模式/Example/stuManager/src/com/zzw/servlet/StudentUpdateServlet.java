package com.zzw.servlet;

import com.zzw.service.StudentService;
import com.zzw.service.impl.StudentServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "StudentUpdateServlet",urlPatterns = "/StudentUpdateServlet")
public class StudentUpdateServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        int sid = Integer.parseInt(session.getAttribute("sid").toString());
        String sname = request.getParameter("sname");
        int gender = Integer.parseInt(request.getParameter("gender"));
        String phone = request.getParameter("phone");
        String birthday = request.getParameter("birthday");
        String info = request.getParameter("info");

        try {
            StudentService service = new StudentServiceImpl();
            service.updateStu(sname,gender,phone,birthday,info,sid);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println(sid+"--"+sname+"--"+gender+"--"+phone+"--"+birthday+"--"+info);
        response.sendRedirect("stuList.jsp");
    }
}
