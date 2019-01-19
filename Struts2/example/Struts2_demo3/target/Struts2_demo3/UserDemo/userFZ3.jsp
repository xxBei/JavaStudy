<%--
  Created by IntelliJ IDEA.
  User: zBei
  Date: 2019/1/19
  Time: 9:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Struts2复杂数据封装</h1>
    <h3>封装到List集合中,批量插入商品</h3>
    <form method="post" action="userAction3.action">
        用户名: <input type="text" name="username"><br>
        密　码: <input type="password" name="password"><br>
        年　龄: <input type="text" name="age"><br>
        日　期: <input type="date" name="birthday"><br>
        工　资: <input type="number" name="salary"><br>
        <input type="submit" value="提交">
    </form>
</body>
</html>
