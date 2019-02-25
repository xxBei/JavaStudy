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
            <h4>欢迎您,zbei</h4>
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
                <h3>添加学生</h3>
            </div>
            <div class="lineBoxRight">
                选择班级：
                <select name="stu_class">
                    <option value="">请选择班级</option>
                </select>
                <button id="findAllStuMan">查询</button>
            </div>
        </div>
        <div class="tableBox">
            <ul class="tableTitle">
                <li class="tableTitle_li">序号</li>
                <li class="tableTitle_li">学号</li>
                <li class="tableTitle_li">姓名</li>
                <li class="tableTitle_li">性别</li>
                <li class="tableTitle_li">年龄</li>
                <li class="tableTitle_li">成绩</li>
                <li class="tableTitle_li">班级</li>
                <li class="tableTitle_li">专业课老师</li>
                <li class="tableTitle_li">操作</li>
            </ul>
            <ul class="tableContext">
                <li class="tableContext_li">序号</li>
                <li class="tableContext_li">学号</li>
                <li class="tableContext_li">姓名</li>
                <li class="tableContext_li">性别</li>
                <li class="tableContext_li">年龄</li>
                <li class="tableContext_li">成绩</li>
                <li class="tableContext_li">班级</li>
                <li class="tableContext_li">专业课老师</li>
                <li class="tableContext_li">修改 | 删除</li>
            </ul>
        </div>
    </section>

    <script type="text/javascript" src="../js/jquery-3.3.1.min.js"/>
    <script src="../js/student_info.js" type="text/javascript"/>
    <%--<s:include value="../header.jsp"/>
    <div class="studentListBox">
        <ul class="studentListBox_ul">
            <li class="studentListBox_li">序号</li>
            <li class="studentListBox_li">学号</li>
            <li class="studentListBox_li">姓名</li>
            <li class="studentListBox_li">性别</li>
            <li class="studentListBox_li">年龄</li>
            <li class="studentListBox_li">成绩</li>
            <li class="studentListBox_li">班级</li>
            <li class="studentListBox_li">专业课老师</li>
        </ul>
        <s:if test="notClass==''">
            没有班级
        </s:if>
        <s:else>
            <s:set var="i" value="0" scope="request"/>
            <s:iterator var="stuList" value="StudentList">

            <ul class="studentListBox_ul">
                <li class="studentListBox_li">${stuList.stu_id}</li>
                <li class="studentListBox_li">${stuList.stu_num}</li>
                <li class="studentListBox_li">${stuList.stu_name}</li>
                <li class="studentListBox_li">${stuList.stu_gender}</li>
                <li class="studentListBox_li">${stuList.stu_age}</li>
                <li class="studentListBox_li">${stuList.stu_chengji}</li>
                <li class="studentListBox_li">${stuList.stu_class}</li>
                <li class="studentListBox_li">${stuList.stu_teacher}</li>
            </ul>
            </s:iterator>
        </s:else>
    </div>
    <div style="clear: both;"></div>--%>
<%--${StudentList.size()}--%>

</body>
</html>
