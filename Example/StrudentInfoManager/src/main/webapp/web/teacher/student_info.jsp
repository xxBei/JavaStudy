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
    <%--<s:debug></s:debug>--%>


    <h2 class="studentList_title">学生信息列表</h2>
    <div class="studentListTopBox">
        <span class="teacherWelcome">欢迎,
            <span style="color: #f00;">
                <s:iterator value="teacherList">
                    <s:property value="th_name"/>
                </s:iterator>
            </span>
            <form action="" style="display: inline">
                <select name="th_class">

                    <s:iterator value="className" var="classNames">
                        <option>
                            <s:property value="#classNames"/>
                        </option>
                    </s:iterator>

                </select>
                <input type="submit" value="查询">
            </form>
        </span>
    </div>
    <div class="studentListBox">
        <ul class="studentListBox_ul">
            <li class="studentListBox_li">序列</li>
            <li class="studentListBox_li">学号</li>
            <li class="studentListBox_li">姓名</li>
            <li class="studentListBox_li">性别</li>
            <li class="studentListBox_li">年龄</li>
            <li class="studentListBox_li">成绩</li>
            <li class="studentListBox_li">班级</li>
            <li class="studentListBox_li">专业课老师</li>
        </ul>
        <s:if test="notClass==0">
            你还有任何班级
        </s:if>
        <s:else>
            <ul class="studentListBox_ul">
                <li class="studentListBox_li"></li>
                <li class="studentListBox_li"></li>
                <li class="studentListBox_li"></li>
                <li class="studentListBox_li"></li>
                <li class="studentListBox_li"></li>
                <li class="studentListBox_li"></li>
                <li class="studentListBox_li"></li>
                <li class="studentListBox_li"></li>

            </ul>
        </s:else>
    </div>
</body>
</html>
