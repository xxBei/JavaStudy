<%--
  Created by IntelliJ IDEA.
  User: zBei
  Date: 2018/12/19
  Time: 21:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
    <link rel="stylesheet" href="css/myStyle.css">
</head>
<body>
<form action="LoginServlet" method="post">
    <div class="managerBox">
        <h2>用户登录</h2>
        <input type="text" name="username" class="inputs">
        <input type="password" name="password" class="inputs">
        <input type="checkbox" name="autoBtn" class="autoBtn">自动登录
        <input type="submit" id="subBtn" value="登　录">
    </div>
</form>
</body>
</html>