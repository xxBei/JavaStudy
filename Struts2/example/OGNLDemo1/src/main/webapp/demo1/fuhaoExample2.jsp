<%--
  Created by IntelliJ IDEA.
  User: zBei
  Date: 2019/1/24
  Time: 22:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>%号的使用</title>
</head>
<body>
    <%
        request.setAttribute("name","zbei");
    %>

    <h3>强制解析OGNL</h3>
    姓名:<s:textfield name="name" value="%{#request.name}"/>
    <%--下面方法不能解析,因为OGNL标签不能再套OGNL标签--%>
    <%--姓名:<s:textfield name="name" value="<s:property value="name" ">"/>--%>

    
</body>
</html>
