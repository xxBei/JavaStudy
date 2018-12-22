<%@ page import="java.util.List" %>
<%@ page import="com.zzw.domain.UserBean" %>
<%--
  Created by IntelliJ IDEA.
  User: zBei
  Date: 2018/12/19
  Time: 21:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>用户登录</title>
  </head>
  <body>
    <c:if test="${not empty userBean}">
      欢迎您,${userBean.uname}
    </c:if>
    <c:if test="${!not empty userBean}">
      <a href="login.jsp">您好,请先登录</a>
    </c:if>
  </body>
</html>
