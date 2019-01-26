<%--
  Created by IntelliJ IDEA.
  User: zBei
  Date: 2019/1/24
  Time: 21:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>#号的使用</title>
</head>
<body>

    <s:debug></s:debug>

    <h3>获取list中的数据方式一</h3>
    <s:iterator var="i" value="list">
        <s:property value="i"/> -- <s:property value="#i"/><br>
    </s:iterator>

    <h3>获取list中的数据方式二</h3>
    <s:iterator value="{'aaa','bbb','ccc'}" var="j">
        <s:property value="j"/> -- <s:property value="#j"/><br>
    </s:iterator>

    <h3>获取Map中的数据方式一</h3>
    <s:iterator value="map">
        <s:property value="key"/>---<s:property value="value"/><br>
    </s:iterator>

    <h3>获取Map中的数据方式二</h3>
    <s:iterator value="map" var="m">
        <s:property value="#m.key"/>---<s:property value="#m.value"/> <br>
    </s:iterator>

    <h3>也可以用于输入框中 -- 方法一</h3>
    <s:radio list="{'男','女'}" name="sex" label="性别"/>

    <h3>也可以用于输入框中 -- 方法二</h3>
    <%--忽略报错--%>
    <s:radio list="#{'1':'男','0':'女'}" name="sex1" label="性别"/>
</body>
</html>
