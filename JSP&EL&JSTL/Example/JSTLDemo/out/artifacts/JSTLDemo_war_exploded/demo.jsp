<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.zzw.user.User" %><%--
  Created by IntelliJ IDEA.
  User: zBei
  Date: 2018/11/22
  Time: 17:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>JSTL forEach</title>
</head>
<body>

    <%--
        var :　表示名
        begin : 表示从那开始
        end : 表示到哪结束
     --%>
    <br>-----------JSTL中forEach循环(1)--------------<br><br>
    <c:forEach var="i" begin="1" end="10">
        ${i}
    </c:forEach>


    <%--
        var :　表示名
        begin : 表示从那开始
        end : 表示到哪结束
        step: 表示增幅,隔两个循环一次
     --%>
    <br><br>-----------JSTL中forEach循环(2)--------------<br><br>
    <c:forEach var="i" begin="1" end="10" step="2">
        ${i}
    </c:forEach>


    <%
        //将数据存储到user类中
        List list = new ArrayList();
        list.add(new User("张三",18));
        list.add(new User("李四",20));
        list.add(new User("王五",22));
        list.add(new User("马六",28));
        //将集合添加到page作用域中
        pageContext.setAttribute("list",list);
    %>

    <%--
        var :  遍历出来的每个元素用user
        items: 表示要遍历的对象
    --%>
    <br><br>-----------JSTL中forEach循环(3)---遍历对象--------------<br><br>
    <c:forEach var="user" items="${list}">
        ${user.name}--${user.age},
    </c:forEach>
</body>
</html>
