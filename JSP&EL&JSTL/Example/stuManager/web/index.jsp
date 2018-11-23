<%--
  Created by IntelliJ IDEA.
  User: zBei
  Date: 2018/11/22
  Time: 17:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>学生登录窗口</title>
      <style>
          *{
              margin: 0;
              padding: 0;
          }
          h2{
              text-align: center;
              margin: 20px 0 20px 0;
          }
          .formBox{
              width: 300px;
              height: 355px;
              background: #ccc;
              margin: auto;
          }
          form{
              width: 300px;
              height: 355px;
          }
          .formBox p{
              padding: 20px 20px 20px;
              font-size: 18px;
          }
          .formBox p input{
              height: 30px;
              width: 200px;
          }
          .btn{
              width: 60px;
              height: 30px;
              margin-right: 32px;
              float: right;
          }
      </style>
  </head>
  <body>
  <h2>学生登录窗口</h2>
  <div class="formBox">
      <form action="LoginServlet" method="post">
          <p>账户: <input type="text" name="username"></p>
          <p>密码: <input type="password" name="password"></p>
          <input type="submit" value="登录" class="btn">
      </form>
  </div>
  </body>
</html>
