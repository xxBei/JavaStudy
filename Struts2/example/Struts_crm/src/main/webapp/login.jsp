<%--
  Created by IntelliJ IDEA.
  User: zBei
  Date: 2019/1/26
  Time: 20:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>登录页面</title>
</head>
<body>
<p><s:actionerror/></p>
<form action="user_login.action" method="post" >
    用户名:<input type="text" name="user_name"> <br>
    密　码:<input type="password" name="user_password"> <br>
    <input type="submit" value="登录">
</form>
</body>
</html>
