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
    <h2>遍历list集合</h2>
    <%--方式一: --%>
    <%--向request存储一个list集合--%>
    <s:set var="list" value="{'aaa','bbb','ccc'}" scope="request"/>

    <s:iterator value="#request.list" var="i">
        <s:property value="i"/>
    </s:iterator>

    <hr />

    <%--方式二: --%>
    <s:iterator value="{'111','222','333'}" var="j">
        <s:property value="#j"/>
    </s:iterator>

    <hr />

    <%--方式三: --%>
    <s:iterator var="z" value="#request.lists">
        <s:property value="z"/>
    </s:iterator>


    <h2>遍历Map集合</h2>
    <%--方式一: --%>
    <s:iterator var="map1" value="#{'aa':'a11','bb':'b11','cc':'c11'}" >
        <s:property value="#map1.key"/>
        :
        <s:property value="#map1.value"/>

        <br>
    </s:iterator>

    <hr />

    <s:iterator value="#request.maps" var="maps">
        <s:property value="#maps.key"/>
        :
        <s:property value="#maps.value"/>
        <br>
    </s:iterator>



    <h2>普通循环1-10</h2>

    <%--
        begin:表示从1开始
        end:表示到10结束
        step:表示每次加1

    --%>
    <s:iterator begin="1" end="10" step="1" var="i">
        <s:property value="i"/>
    </s:iterator>

    <h2>循环10以内偶数</h2>
    <s:iterator begin="1" end="10" step="1" var="j" status="status">
        <s:if test="#status.count % 2 == 0">
            <s:property value="#j"/>
        </s:if>
    </s:iterator>
</body>
</html>
