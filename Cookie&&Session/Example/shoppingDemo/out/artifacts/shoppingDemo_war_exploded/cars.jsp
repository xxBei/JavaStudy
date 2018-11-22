<%--
  Created by IntelliJ IDEA.
  User: zBei
  Date: 2018/11/20
  Time: 13:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.Map" %>
<html>
<head>
    <title>购物车</title>
</head>
<body>
    <h2>购物车商品如下:</h2>
    <%
        Map<String,Integer> map = (Map<String, Integer>) request.getSession().getAttribute("cars");
        if(map != null){
            for (String key : map.keySet()){
                int count = map.get(key);
    %>
                <h3>名称:<%=key%>  数量:<%=count%></h3>
    <%

            }
        }

    %>
    <h3><a href="clearCars">清空购物车</a></h3>
    <h3><a href="index.jsp">返回商品列表</a></h3>
</body>
</html>
