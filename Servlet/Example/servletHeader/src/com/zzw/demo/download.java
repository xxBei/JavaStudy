package com.zzw.demo;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLEncoder;


@WebServlet(name = "download")
public class download extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String filename = request.getParameter("filename");

        String path = getServletContext().getRealPath("download/"+filename);

        response.setHeader("Content-Disposition","attachment;filename="+filename);

        InputStream is = new FileInputStream(path);
        ServletOutputStream os = response.getOutputStream();

        int len = 0;
        byte[] buffer = new byte[1024];

        while ((len = is.read()) != -1){
            os.write(buffer,0,len);
        }

        is.close();
        os.close();
    }
}
