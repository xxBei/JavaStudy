<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>学生信息管理系统</title>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="web/css/index.css">
</head>
<body>
    <h1 class="stuManager_title">学生信息管理系统</h1>
    <div class="stuManager_login">
        <h2 class="stuManager_loginTit stuManager_bg">教师登录</h2>
        <h2 class="stuManager_loginTit">学生登录</h2>
        <div class="stuManager_teacherLogin"  id="stuTeacherLogin">
            <div class="stuManager_loginBox">
                <form action="teacher_login" method="post">
                    用户名: <input type="text" name="th_username" class="teacherInput"><br><br>
                    密　码: <input type="password" name="th_password" class="teacherInput"><br><br>
                    <div class="buttonBox">
                        <input type="submit" value="登录" class="teacherLoginBtn">
                        <button class="teacherLoginBtn"><a href="teacher_comeRegisteredUI">注册</a></button>
                    </div>
                </form>
            </div>
        </div>
        <div class="stuManager_studentLogin" id="stuStudentLogin">
            <div class="stuManager_loginBox">
                <form action="student_login" method="post">
                    用户名: <input type="text" name="th_username" class="teacherInput"><br><br>
                    密　码: <input type="password" name="th_password" class="teacherInput"><br><br>
                    <div class="buttonBox">
                        <input type="submit" value="登录" class="teacherLoginBtn">
                        <button class="teacherLoginBtn"><a href="teacher_comeRegisteredUI">注册</a></button>
                    </div>
                </form>
            </div>
        </div>
        <p><s:property value="LoginError"/></p>
    </div>

    <script src="web/js/index.js"></script>
</body>
</html>