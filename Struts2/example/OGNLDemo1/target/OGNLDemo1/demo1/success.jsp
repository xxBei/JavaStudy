<%--
  Created by IntelliJ IDEA.
  User: zBei
  Date: 2019/1/22
  Time: 16:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>值栈</title>
</head>
<body>
<h2>成功页面</h2>
<s:debug></s:debug>

<%-- 方法一: 使用valueStack本身的方法获取username和password --%>
<%--<s:property value="username"/>
<s:property value="password"/>--%>

<%-- 方法二: 使用Action中提供属性的get方法 --%>
<s:property value="user.username"/>
<s:property value="user.password"/>

</body>
</html>
