<%@page language="java" contentType="text/html; charset=UTF-8" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
    <h3>OGNL访问对象方法</h3>
    struts的字符长度为:<s:property value="'struts'.length"/>
    <h3>OGNL访问静态方法</h3>
    <%--静态方法默认是关闭,需要在配置文件开启--%>
    随机数:<s:property value="@java.lang.Math@random()" />
</body>
</html>