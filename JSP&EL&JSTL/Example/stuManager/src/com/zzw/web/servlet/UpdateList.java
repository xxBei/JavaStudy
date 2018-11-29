package com.zzw.web.servlet;

import com.zzw.dao.Stu_update;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "UpdateList",urlPatterns = "/UpdateList")
public class UpdateList extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));
        String grade = request.getParameter("grade");
        String gender = request.getParameter("gender");
        String number = request.getParameter("number");
        String address = request.getParameter("address");

        Stu_update stu_update = new Stu_update();
        stu_update.UpdateSql(id,name,age,grade,gender,number,address);

    }


}
