<%--
  Created by IntelliJ IDEA.
  User: zBei
  Date: 2019/1/27
  Time: 14:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>判断语句</title>
</head>
<body>
    <%--
        用于在页面里面存储值,
        var:相当于值的变量名
        value:存储的数值是什么
        scope: 存储到哪个里面 request session action application等--%>
    <s:set var="i" value="6" scope="request"/>

    <%--
        if,elseif else 判断语句
        test: 表示判断的条件
        #request.i 表示从request中将变量i中的数值取出来
    --%>
    <s:if test="#request.i>3">
        i的值大于3
    </s:if>
    <s:elseif test="#request.i<3">
        i的值小于3
    </s:elseif>
    <s:else>
        i的值等于3
    </s:else>

    <h4>i的值为:<s:property value="#request.i" /></h4>

    <hr size="1"/>

    <%--从值栈中获取request的值--%>
    <s:if test="#request.j>5">
        j的值大于5
    </s:if>
    <s:elseif test="#request.j<5">
        j的值小于5
    </s:elseif>
    <s:else>
        j的值等于5
    </s:else>

    <h4>j的值为:<s:property value="#request.j"/></h4>
</body>
</html>
