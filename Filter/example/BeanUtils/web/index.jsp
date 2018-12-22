<%--
  Created by IntelliJ IDEA.
  User: zBei
  Date: 2018/12/21
  Time: 17:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>$Title$</title>
    </head>
    <body>
        <form action="UserBeanServlet" method="post">
            用户名: <input type="text" name="username">
            密　码: <input type="password" name="password">
            年　龄: <input type="text" name="age">
            电　话: <input type="text" name="phone">
            邮　箱: <input type="text" name="email">
            <input type="submit" value="注册">
        </form>
    </body>
</html>
