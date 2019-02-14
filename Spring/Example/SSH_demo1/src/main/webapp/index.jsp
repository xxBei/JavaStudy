<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>客户管理系统</title>
    <link rel="stylesheet" href="web/css/index.css">
    <meta charset="UTF-8">

</head>
<body>
<div class="mainContent">
    <div class="leftContent">
        <p class="humanText">人力资源 - 功能菜单</p>
        <h4 class="leftMenu">客户管理</h4>
        <ul class="leftMenuUl noneUl">
            <li onclick="addCustomer()">新增客户</li>
            <li onclick="cstList()">客户列表</li>
        </ul>
        <h4 class="leftMenu">联系人管理</h4>
        <ul class="leftMenuUl noneUl">
            <li>新增联系人</li>
            <li>联系人列表</li>
        </ul>
        <h4 class="leftMenu">客户拜访管理</h4>
        <ul class="leftMenuUl noneUl">
            <li>新增客户拜访</li>
            <li>客户拜访列表</li>
        </ul>
        <h4 class="leftMenu">综合查询</h4>
        <ul class="leftMenuUl noneUl">
            <li>客户信息查询</li>
            <li>联系人信息查询</li>
            <li>客户拜访记录查询</li>
        </ul>
        <h4 class="leftMenu">统计分析</h4>
        <ul class="leftMenuUl noneUl">
            <li>客户行业统计</li>
            <li>客户来源统计</li>
        </ul>
        <h4 class="leftMenu">系统管理</h4>
        <ul class="leftMenuUl noneUl">
            <li>角色管理</li>
            <li>用户管理</li>
            <li>数据字典</li>
        </ul>
    </div>
    <div class="rightContent">
        <div class="rightTop">
            <p class="rightUser">当前用户 : <s:property value="#session.user_login.user_name"/></p>
            <p
                    class="rightOperating"><a href="javascript:0">修改密码</a><a
                    href="javascript:0">安全退出</a></p>
        </div>
        <div class="rightCore">
            <h2 class="right_welcome">欢迎来到客户管理系统</h2>
            <h4><s:property value="#request.result"/></h4>
        </div>
    </div>
</div>
<script type="text/javascript" src="web/js/jquery-3.3.1.min.js"></script>
<script type="text/javascript" src="web/js/index.js"></script>
</body>
</html>
