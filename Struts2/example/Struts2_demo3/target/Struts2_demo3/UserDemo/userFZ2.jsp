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
    <form method="post" action="userAction2.action">
        <%--这里面的user是UserAction2中的User名,username必须和User类中的属性名一样--%>
        用户名: <input type="text" name="user.username"><br>
        密　码: <input type="password" name="user.password"><br>
        年　龄: <input type="text" name="user.age"><br>
        日　期: <input type="date" name="user.birthday"><br>
        工　资: <input type="number" name="user.salary"><br>
        <input type="submit" value="提交">
    </form>
</body>
</html>
