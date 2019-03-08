<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: zBei
  Date: 2019/2/26
  Time: 10:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
</head>
<body>
<s:if test="StudentList.size()!=0">
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
<s:iterator value="StudentList">
    <ul class="tableContext">
        <li class="tableContext_li">${stu_id}</li>
        <li class="tableContext_li">${stu_num}</li>
        <li class="tableContext_li">${stu_name}</li>
        <li class="tableContext_li">${stu_gender}</li>
        <li class="tableContext_li">${stu_age}</li>
        <li class="tableContext_li">${stu_chengji}</li>
        <li class="tableContext_li">${stu_class}</li>
        <li class="tableContext_li">${stu_teacher}</li>
        <li class="tableContext_li">修改 | 删除</li>
    </ul>

</s:iterator>
</s:if>
<s:else>
    你还没有班级
</s:else>
</body>
</html>
