<%@ page import="com.zzw.Demo.Student" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: zBei
  Date: 2018/11/26
  Time: 22:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学生列表页面</title>
    <style>
        h1{
            text-align: center;
        }
        th{
            height: 40px;
        }
        td{
            width: 120px;
            height: 40px;
        }
        a{
            color: #000;
            text-decoration: none;
        }
        a:hover{
            text-decoration: underline;
            color: #ff5028;
        }
    </style>
</head>
<body>
    <h1>学生列表</h1>

    <%
        List<Student> list = (List<Student>) request.getSession().getAttribute("list");
    %>
        <table border="1" align="center">
            <tr>
                <th>编号</th>
                <th>姓名</th>
                <th>年龄</th>
                <th>年级</th>
                <th>性别</th>
                <th>电话</th>
                <th>地址</th>
                <th>操作</th>
            </tr>
    <%
        for (Student stu : list) {
            int id = stu.getId();
            String name = stu.getName();
            int age = stu.getAge();
            String grade = stu.getGrade();
            String gender = stu.getGender()==1?"男":"女";
            String number = stu.getNumber();
            String address = stu.getAddress();
    %>
            <tr>
                <td align="center"><%=id%></td>
                <td align="center"><%=name%></td>
                <td align="center"><%=age%></td>
                <td align="center"><%=grade%></td>
                <td align="center"><%=gender%></td>
                <td align="center"><%=number%></td>
                <td align="center"><%=address%></td>
                <td align="center"><a href="stu_upList.jsp?id=<%=id%>">更新</a>&emsp;
                    <a href="#">删除</a></td>
            </tr>
    <%
        }
    %>
        </table>
</body>
</html>
