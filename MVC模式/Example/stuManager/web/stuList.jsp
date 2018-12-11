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
        body,h2,div,input,a{
            margin: 0;
            padding: 0;
        }
        h2{
            text-align: center;
            margin-top: 20px;
        }
        .box{
            width: 962px;
            margin: 20px auto 0;
        }
        #insertBox{
            border: solid 1px #ccc;
            clear: both;
            width: 959px;
            height: 40px;
            line-height: 40px;
            text-align: center;
        }
        #insertBox input{
            height: 26px;
            width: 200px;
            margin-right: 20px
        }
        #insertBox select{
            height: 26px;
            margin-right: 20px
        }
        #insertBox button{
            height: 26px;
            margin-right: 20px
        }
        .fkBox{
            width: 962px;
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
        <div class="fkBox" id="insertBox">
            <span style="padding-left: 10px;">按姓名查询:</span>
            <input type="text" name="sname">
            <span>按性别查询:</span>
            <select name="gender">
                <option value="--请选择">--请选择</option>
                <option value="0">男</option>
                <option value="1">女</option>
            </select>
            <button>查询</button>
            <a href="#">添加</a>
        </div>
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
                String stu_info = student.getInfo();
                if(stu_info.length()>10){
                    stu_info = stu_info.substring(0,2) + " .... " +
                            stu_info.substring(stu_info.length()-5,stu_info.length());
                }

         %>
        <div class="fkBox">
            <div class="fk1"><%= student.getSid()%></div>
            <div class="fk1"><%= student.getSname()%></div>
            <div class="fk1"><%= student.getGender()==1?"男":"女"%></div>
            <div class="fk1"><%= student.getPhone()%></div>
            <div class="fk1"><%= student.getBirthday()%></div>
            <div class="fk1 fkInfo"><%= stu_info%></div>
            <div class="fk1"><a href="#">更新</a> <a href="#">删除</a></div>
        </div>
        <%
            }
        %>
    </div>
</body>
</html>
