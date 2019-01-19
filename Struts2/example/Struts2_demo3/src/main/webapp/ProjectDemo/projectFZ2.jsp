<%--
  Created by IntelliJ IDEA.
  User: zBei
  Date: 2019/1/19
  Time: 21:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="projectAction2.action" method="post">
    <%-- 将多个数据进行封装,需要写表达式,但是[]里面的值可以随便写,因为他是map中的key --%>
    商品名称: <input type="text" name="map[0].name"><br>
    商品价格: <input type="text" name="map[0].price"><br>
    商品名称: <input type="text" name="map[1].name"><br>
    商品价格: <input type="text" name="map[1].price"><br>
    商品名称: <input type="text" name="map[2].name"><br>
    商品价格: <input type="text" name="map[2].price"><br>
    <input type="submit" value="提交">
</form>
</body>
</html>
