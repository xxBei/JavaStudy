<%--
  Created by IntelliJ IDEA.
  User: zBei
  Date: 2019/1/27
  Time: 14:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>循环语句</title>
</head>
<body>
    <%--向request存储一个list集合--%>
    <s:set var="list" value="{'aaa','bbb','ccc'}" scope="request"/>

    <s:iterator value="#request.list" var="i">
        <s:property value="i"/>
    </s:iterator>
</body>
</html>
