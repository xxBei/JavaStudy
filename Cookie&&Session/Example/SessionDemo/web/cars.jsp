<%@ page import="java.util.Map" %>
<%--
  Created by IntelliJ IDEA.
  User: zBei
  Date: 2018/11/21
  Time: 13:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>购物车</title>
</head>
<body>
    <h2>购物车商品列表</h2>
    <%
        Map<String,Integer> map = (Map<String, Integer>) request.getSession().getAttribute("cars");
        for(String name : map.keySet()){
    %>
            <h3>商品名称:<%=name%> 数量:<%=map.get(name)%></h3>
    <%
        }
    %>
    <h4><a href="index.jsp">返回商品列表</a></h4>
    <h4><a href="clearCars">删除购物车</a></h4>
</body>
</html>
