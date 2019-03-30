<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: zBei
  Date: 2019/3/29
  Time: 17:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>教师修改学生信息</title>
    <link rel="stylesheet" href="web/css/student_add.css">
</head>
<body>
<s:iterator value="StudentListById">
<div class="mainResult">
    <form action="student_" method="post">
        <table border="0">
            <tr>
                <td class="titleLine">学号:</td>
                <td class="contextLine">
                    <input type="text" name="stu_num" class="inp" value="${stu_num}">
                </td>
            </tr>
            <tr>
                <td class="titleLine">姓名:</td>
                <td class="contextLine">
                    <input type="text" name="stu_name" class="inp" value="${stu_name}">
                </td>
            </tr>
            <tr>
                <td class="titleLine">性别:</td>
                <td class="contextLine">
                    <input type="radio" name="stu_gender" value="男" class="inp_rad" >男
                    <input type="radio" name="stu_gender" value="女" class="inp_rad">女
                </td>
            </tr>
            <tr>
                <td class="titleLine">年龄:</td>
                <td class="contextLine">
                    <input type="text" name="stu_age" class="inp" value="${stu_age}">
                </td>
            </tr>
            <tr>
                <td class="titleLine">成绩:</td>
                <td class="contextLine">
                    <input type="text" name="stu_class" class="inp"  value="${stu_chengji}">
                </td>
            </tr>
            <tr>
                <td class="titleLine">班级:</td>
                <td class="contextLine">
                    <input type="text" name="stu_class" class="inp"  value="${stu_class}">
                </td>
            </tr>
            <tr>
                <td class="titleLine">专业老师:</td>
                <td class="contextLine">
                    <input type="text" name="stu_teacher" class="inp"  value="${stu_teacher}">
                </td>
            </tr>
            <tr>
                <td colspan="2" class="contextLine">
                    <input type="button" value="修改" class="btn" id="stu_update_sub">
                </td>
            </tr>
        </table>

    </form>

</div>
</s:iterator>
<script type="text/javascript" src="web/js/jquery-3.3.1.min.js"></script>
<script type="text/javascript" src="web/js/student_info.js"></script>
</body>
</html>
