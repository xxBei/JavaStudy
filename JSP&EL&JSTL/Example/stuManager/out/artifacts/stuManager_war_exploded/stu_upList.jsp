<%--
  Created by IntelliJ IDEA.
  User: zBei
  Date: 2018/11/29
  Time: 14:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改学生信息</title>
</head>
<body>
    <%
        String id = request.getParameter("id");
    %>
    <h1 style="text-align: center">修改学生信息</h1>
    <table border="1" align="center">
        <tr>
            <th>姓名</th>
            <th>年龄</th>
            <th>年级</th>
            <th>性别</th>
            <th>电话</th>
            <th>地址</th>
            <th>操作</th>
        </tr>
        <tr>
            <td>
                <input type="text" name="name">
            </td>
            <td>
                <input type="text" name="age">
            </td>
            <td>
                <input type="text" name="grade">
            </td>
            <td>
                <input type="text" name="gender">
            </td>
            <td>
                <input type="text" name="number">
            </td>
            <td>
                <input type="text" name="address">
            </td>
            <td>
                <a href="UpdateList?id=<%=id%>">确定</a>
                <a href="stu_list.jsp">取消</a>
            </td>
        </tr>
    </table>
</body>
</html>
