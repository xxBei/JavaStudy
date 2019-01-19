<%@page contentType="text/html; charset=utf-8" language="java" %>
<%@taglib uri="/struts-tags" prefix="s" %>
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
    <%--用于将错误信息显示在页面--%>
    <s:fielderror/>
    <h1>Struts2访问Servlet的API</h1>
    <h3>方式一:完全解耦合的方式</h3>
    <form action="requestDemo1.action" method="get">
        姓名:<input name="username" type="text"><br>
        密码:<input name="password" type="password"><br>
        <input type="submit" value="登录">
    </form>
    <h3>方式二:使用原生的方式</h3>
    <form action="requestDemo2.action" method="get">
        姓名:<input name="username" type="text"><br>
        密码:<input name="password" type="password"><br>
        <input type="submit" value="登录">
    </form>
    <h3>方式三:接口注入的方式</h3>
    <form action="requestDemo3.action" method="get">
        姓名:<input name="username" type="text"><br>
        密码:<input name="password" type="password"><br>
        <input type="submit" value="登录">
    </form>

    <h3><a href="UserDemo/userFZ1.jsp">封装数据方式一:属性驱动-提供set方法的方式</a></h3>
    <h3><a href="UserDemo/userFZ2.jsp">封装数据方式二:属性驱动-页面提供表达式方法</a></h3>
    <h3><a href="UserDemo/userFZ3.jsp">封装数据方式三:模型驱动-模型驱动方法</a></h3>
    <br>
    <h3><a href="ProjectDemo/projectFZ1.jsp">复杂数据封装方式一:封装到List集合中</a></h3>
    <h3><a href="ProjectDemo/projectFZ2.jsp">复杂数据封装方式二:封装到Map集合中</a></h3>
</body>
</html>