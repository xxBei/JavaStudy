<%--
  Created by IntelliJ IDEA.
  User: zBei
  Date: 2019/2/17
  Time: 21:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>学生信息列表</title>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="web/css/student_info.css">
</head>
<body>
<%--<s:debug></s:debug>--%>
<header>
    <h1>学生信息管理系统</h1>
</header>
<!--左列表-->
<section class="directory">
    <article>
        <s:iterator value="teacherList">
            <h4>欢迎您,<s:property value="th_name"/>老师</h4>
        </s:iterator>
    </article>
    <ul>
        <li>学生信息</li>
    </ul>
</section>
<!--主内容-->
<section class="mainContext">
    <div class="lineBox">
        <div class="lineBoxLeft">
            <h3>学生管理</h3>
            <h3 id="addStudent">添加学生</h3>
        </div>
        <div class="lineBoxRight">
            选择班级：
            <select name="stu_class" id="stu_class">
                <option value="0">请选择班级</option>
                <s:iterator value="notClass" var="classNames">
                    <option>
                        <s:property value="classNames"/>
                    </option>
                </s:iterator>
            </select>
            <button id="findAllStuMan">查询</button>
        </div>
    </div>
    <div class="tableBox">

        <div class="mainResult">
            <!--学生信息页面-->
            <h2>欢迎来到学生信息管理系统</h2>
        </div>
    </div>
</section>
<script type="text/javascript" src="web/js/jquery-3.3.1.min.js"></script>
<script type="text/javascript" src="web/js/student_info.js"></script>
<%--${StudentList.size()}--%>

</body>
</html>
