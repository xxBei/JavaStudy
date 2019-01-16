package com.zzw.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "TestServlet" , urlPatterns = "/TestServlet")
public class TestServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        req.getParameter("name");
        if(name.equals("zbei")){
            System.out.println("访问成功");
            req.setAttribute("t","This is a Ajax Test!");
            //resp.getWriter().write("This is a Ajax Test!");
            //req.getRequestDispatcher("index.jsp").forward(req, resp);
            req.getRequestDispatcher("test.jsp").forward(req, resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }


}
