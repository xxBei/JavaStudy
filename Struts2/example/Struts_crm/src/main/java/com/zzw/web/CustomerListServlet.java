package com.zzw.web;

import com.zzw.domain.Customer;
import com.zzw.service.CustomerService;
import com.zzw.service.Impl.CustomerServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CustomerListServlet" , urlPatterns = "/CustomerListServlet")
public class CustomerListServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,
            IOException {
        System.out.println("ajax访问成功");
        CustomerService service = new CustomerServiceImpl();
        List<Customer> list = service.find();
        request.setAttribute("list",list);
        request.getRequestDispatcher("cst_list.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException
            , IOException {
        doGet(request, response);
    }


}
