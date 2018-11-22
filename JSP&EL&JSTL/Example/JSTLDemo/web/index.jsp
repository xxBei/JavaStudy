<%--
  Created by IntelliJ IDEA.
  User: zBei
  Date: 2018/11/22
  Time: 16:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--导入jstl包--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>JSTL使用</title>
  </head>
  <body>
  <h4>使用JSTL方式设置键和值</h4>
  <c:set var="name" value="张三"></c:set>
  <br>-----------EL表达式输出--------------<br><br>
  ${name}
  <c:set var="name" value="李四" scope="session"></c:set>
  <br>-----------EL表达式session中name输出--------------<br><br>
  ${sessionScope.name}
  <br>-----------EL表达式输出--------------<br><br>


  <br><br><br><br><br>
  <br>-----------JSTL中if判断--------------<br><br>
  <c:set var="age" value="18"></c:set>
  <c:if test="${age < 20}">
      年龄小于20...
  </c:if>
  <br><br>-----------JSTL中if判断--------------<br><br>
  <c:set var="salary" value="${2000*2}"></c:set>
  工资为:${salary}<br><br>
  <c:if test="${salary > 2000}">
      工资高于2000....
  </c:if>
  </body>
</html>
