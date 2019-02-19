<%--
  Created by IntelliJ IDEA.
  User: zBei
  Date: 2019/2/19
  Time: 20:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>教师注册</title>
    <meta charset="UTF-8">
</head>
<body>
    <h2>教师注册</h2>
    <form action="teacher_registered" method="post">
        教师名:　<input type="text" name="th_name"><br><br>
        性　别:　<input type="radio" value="男" name="th_gender">男
                <input type="radio" value="女" name="th_gender">女
        <br><br>
        用户名:　<input type="text" name="th_username"><br/><br/>
        密　码:　<input type="password" name="th_password"><br/><br/>
        授课班级:<input type="text" name="th_class"><br><br>
        <input type="submit" value="注册"> <span style="color: red">*多个班级以逗号分隔</span>
    </form>
</body>
</html>
