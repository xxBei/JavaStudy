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
      <link rel="stylesheet" href="css/mystyle.css">
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
