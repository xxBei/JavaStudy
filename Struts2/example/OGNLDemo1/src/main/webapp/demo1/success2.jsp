<%--
  Created by IntelliJ IDEA.
  User: zBei
  Date: 2019/1/22
  Time: 21:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>获取值栈中root和context存储的值</title>
</head>
<body>
    <s:debug></s:debug>

    <h1>获取值栈中root存储的值</h1>

    <h3>获取对象的值</h3>
    <s:property value="username"/>
    <s:property value="password"/>

    <h3>获取集合中的数据</h3>
    <s:property value="list[0].username" />
    <s:property value="list[0].password" /><br>
    <s:property value="list[1].username" />
    <s:property value="list[1].password" /><br>
    <s:property value="list[2].username" />
    <s:property value="list[2].password" /><br>

    <h3>获取Context中request中的值</h3>
    <s:property value="#request.name" /><br>
    <h3>获取Context中session中的值</h3>
    <s:property value="#session.name" /><br>
    <h3>获取Context中application中的值</h3>
    <s:property value="#application.name" /><br>

    <h3>用来获取地址栏中传递的参数</h3>
    <s:property value="#parameters.id"/>


</body>
</html>
