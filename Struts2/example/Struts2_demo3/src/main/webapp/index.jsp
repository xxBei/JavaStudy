<%@page contentType="text/html; charset=utf-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
    <h1>Struts2访问Servlet的API</h1>
    <h3>方式一:完全解耦合的方式</h3>
    <form action="requestDemo1.action" method="get">
        姓名:<input name="username" type="text"><br>
        密码:<input name="password" type="password"><br>
        <input type="submit" value="登录">
    </form>
    <h3>方式二:使用原生的方式</h3>
    <form action="requestDemo2.action" method="get">
        姓名:<input name="username" type="text"><br>
        密码:<input name="password" type="password"><br>
        <input type="submit" value="登录">
    </form>
</body>
</html>