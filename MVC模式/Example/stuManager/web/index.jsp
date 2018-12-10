<%--
  Created by IntelliJ IDEA.
  User: zBei
  Date: 2018/12/8
  Time: 21:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>学生管理列表</title>
      <link rel="stylesheet" href="css/myStyle.css">
  </head>
  <body>
  <form action="UserLonginServlet" method="post">
        <div class="managerBox">
            <h2>学生管理系统</h2>
            <input type="text" name="username">
            <input type="password" name="password">
            <input type="submit" id="subBtn" value="登　录">
        </div>
  </form>
  </body>
</html>
