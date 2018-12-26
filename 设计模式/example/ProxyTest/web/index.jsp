<%--
  Created by IntelliJ IDEA.
  User: zBei
  Date: 2018/12/26
  Time: 13:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>$Title$</title>
    </head>
    <body>
        <form action="LoginServlet" method="post">
            User:<input type="text" name="username">
            <input type="submit">
        </form>
        <br><br>
        <form action="LoginServlet" method="get">
            User:<input type="text" name="username">
            <input type="submit">
        </form>
    </body>
</html>
