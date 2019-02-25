<%--
  Created by IntelliJ IDEA.
  User: zBei
  Date: 2019/2/18
  Time: 9:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>教师登录</title>
    <meta charset="UTF-8">
</head>
<body>
    <h2>教师登录</h2>
    <form action="teacher_login" method="get">
        用户名: <input type="text" name="th_username"><br><br>
        密　码: <input type="password" name="th_password"><br><br>
        <input type="submit" value="登录">
        <button><a href="teacher_comeRegisteredUI">注册</a></button>
    </form>
</body>
</html>
