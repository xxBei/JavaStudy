<%--
  Created by IntelliJ IDEA.
  User: zBei
  Date: 2019/3/1
  Time: 15:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加学生</title>
    <link rel="stylesheet" href="web/css/student_add.css">
</head>
<body>
    <div class="mainResult">
        <form action="student_addStu" method="post">
            <table border="0">
                <tr>
                    <td class="titleLine">学号:</td>
                    <td class="contextLine">
                        <input type="text" name="stu_num" class="inp">
                    </td>
                </tr>
                <tr>
                    <td class="titleLine">姓名:</td>
                    <td class="contextLine">
                        <input type="text" name="stu_name" class="inp">
                    </td>
                </tr>
                <tr>
                    <td class="titleLine">性别:</td>
                    <td class="contextLine">
                        <input type="radio" name="stu_gender" value="男" class="inp_rad" checked>男
                        <input type="radio" name="stu_gender" value="女" class="inp_rad">女
                    </td>
                </tr>
                <tr>
                    <td class="titleLine">年龄:</td>
                    <td class="contextLine">
                        <input type="text" name="stu_age" class="inp">
                    </td>
                </tr>
                <tr>
                    <td class="titleLine">班级:</td>
                    <td class="contextLine">
                        <input type="text" name="stu_class" class="inp">
                    </td>
                </tr>
                <tr>
                    <td class="titleLine">专业老师:</td>
                    <td class="contextLine">
                        <input type="text" name="stu_teacher" class="inp">
                    </td>
                </tr>
                <tr>
                    <td colspan="2" class="contextLine">
                        <input type="submit" value="添加" class="btn">
                    </td>
                </tr>
            </table>

            <%--学号: <input type="text" name="stu_num"><br>
            姓名: <input type="text" name="stu_name"><br>
            性别: <input type="radio" name="stu_gender" value="男">男
            <input type="radio" name="stu_gender" value="女">女 <br>
            年龄: <input type="text" name="stu_age"><br>
            班级: <input type="text" name="stu_class"><br>
            专业老师: <input type="text" name="stu_teacher"> <br>
            <input type="submit" value="添加">--%>

        </form>
    </div>

</body>
</html>
