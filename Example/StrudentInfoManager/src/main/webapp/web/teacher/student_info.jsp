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
    <link rel="stylesheet" href="web/css/student_info.css">
</head>
<body>
    <s:debug></s:debug>
    <s:include value="../header.jsp"/>
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
    <div style="clear: both;"></div>
<%--${StudentList.size()}--%>

</body>
</html>
