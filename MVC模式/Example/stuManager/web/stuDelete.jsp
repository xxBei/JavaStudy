<%--
  Created by IntelliJ IDEA.
  User: zBei
  Date: 2018/12/12
  Time: 21:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学生信息删除</title>
</head>
<body>
    <%
        HttpSession sessions = request.getSession();
        sessions.setAttribute("sid",request.getParameter("sid"));

    %>
</body>
</html>
