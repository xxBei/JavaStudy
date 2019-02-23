<%--
  Created by IntelliJ IDEA.
  User: zBei
  Date: 2019/2/23
  Time: 14:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2 class="studentList_title">学生信息列表</h2>
<div class="studentListTopBox">
        <span class="teacherWelcome">欢迎,
            <span style="color: #f00;">
                <s:iterator value="teacherList">
                    <s:property value="th_name"/>
                </s:iterator>

            </span>
            <form action="student_findAll" style="display: inline" method="post">
                <select name="stu_class">
                    <s:iterator value="notClass" var="classNames">
                        <option>
                            <s:property value="#classNames"/>
                        </option>
                    </s:iterator>

                </select>
                <input type="submit" value="查询">
            </form>
        </span>
</div>
</body>
</html>
