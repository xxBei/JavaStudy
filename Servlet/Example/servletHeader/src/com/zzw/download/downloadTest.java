package com.zzw.download;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

@WebServlet(name = "downloadTest")
public class downloadTest extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取传递过来的文件名
        String fileName = request.getParameter("filename");
        //获取服务器上文件的绝对路径
        String path = getServletContext().getRealPath("download/"+fileName);

        //让浏览器收到资源的时候,以下载的方式,提醒用户,而不是直接展示
        response.setHeader("Content-Disposition","attachment;filename=" + fileName);

        //转换为输入流
        InputStream is = new FileInputStream(path);
        ServletOutputStream os = response.getOutputStream();

        int len = 0;
        byte[] buffer = new byte[1024];

        while ((len = is.read(buffer)) != -1) {
            os.write(buffer,0,len);
        }

        is.close();
        os.close();

    }
}
