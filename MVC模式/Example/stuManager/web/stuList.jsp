<%@ page import="com.zzw.domain.Student" %>
<%@ page import="com.zzw.service.StudentService" %>
<%@ page import="com.zzw.service.impl.StudentServiceImpl" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: zBei
  Date: 2018/12/10
  Time: 15:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学生列表</title>
    <style>
        body,h2,div{
            margin: 0;
            padding: 0;
        }
        h2{
            text-align: center;
            margin-top: 20px;
        }
        .box{
            width: 1000px;
            margin: 20px auto 0;
        }
        .fkBox{
            width: 1000px;
            height: 40px;
            margin: auto;
        }
        .fk1{
            float: left;
            width: 125px;
            height: 40px;
            text-align: center;
            line-height: 40px;
            border: solid 1px #ccc;
        }
        .fkInfo{
            width: 200px;
            height: 40px;
        }
    </style>
</head>
<body>
    <h2>学生列表</h2>
    <div class="box">
        <div class="fkBox">
            <div class="fk1">编号</div>
            <div class="fk1">姓名</div>
            <div class="fk1">性别</div>
            <div class="fk1">电话</div>
            <div class="fk1">出生日期</div>
            <div class="fk1 fkInfo">信息</div>
            <div class="fk1">操作</div>
        </div>

        <%
            StudentService stuServive = new StudentServiceImpl();
            List<Student> list = stuServive.findAll();
            for(Student student : list){


         %>
        <div class="fkBox">
            <div class="fk1"><%= student.getSid()%></div>
            <div class="fk1"><%= student.getSname()%></div>
            <div class="fk1"><%= student.getGender()==1?"男":"女"%></div>
            <div class="fk1"><%= student.getPhone()%></div>
            <div class="fk1"><%= student.getBirthday()%></div>
            <div class="fk1 fkInfo">....</div>
            <div class="fk1"><a href="#">更新</a> <a href="#">删除</a></div>
        </div>
        <%
            }
        %>
    </div>
</body>
</html>
