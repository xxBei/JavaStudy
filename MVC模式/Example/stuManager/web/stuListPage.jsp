<%@ page import="com.zzw.domain.Student" %>
<%@ page import="com.zzw.service.StudentService" %>
<%@ page import="com.zzw.service.impl.StudentServiceImpl" %>
<%@ page import="java.util.List" %>
<%@ page import="com.zzw.domain.PageBean" %><%--
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
        body,h2,div,input,a,form{
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
        #insertBox .btn{
            height: 26px;
            margin-right: 20px
        }
        .fkBox{
            width: 962px;
            height: 40px;
            margin: auto;
            clear: both;
        }
        .pageBox{
            width: 960px;
            height: 40px;
            margin: auto;
            clear: both;
            border: solid #ccc 1px;
            text-align: center;
            line-height: 40px;
        }
        .pageBox span{
            margin-left: 10px;
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
        <form action="StudentSearchServlet" method="post">
        <div class="fkBox" id="insertBox">
            <span style="padding-left: 10px;">按姓名查询:</span>
            <input type="text" name="sname">
            <span>按性别查询:</span>
            <select name="gender">
                <option value="">--请选择</option>
                <option value="1">男</option>
                <option value="0">女</option>
            </select>
            <input type="submit" value="查询" class="btn">
            <a href="stuInsert.jsp">添加</a>
        </div>
        </form>
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
            PageBean<Student> list = (PageBean<Student>) request.getAttribute("pageBean");
            for(Student student : list.getList()){
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
            <div class="fk1">
                <a href="stuUpdate.jsp?sid=<%= student.getSid()%>">更新</a>
                <a href="#" onclick="delStu(<%= student.getSid()%>)" id="delBtn">删除</a>
            </div>
        </div>
        <%
            }
        %>
    </div>
    <div class="pageBox">
        <span>第<%= list.getCurrentPage()%> / <%= list.getTotalPage()%></span>
        <span>每页显示<%= list.getPageSize()%>条 &emsp; 总记录数: <%= list.getTotalSize()%></span>
        <span>
            <%
                if(list.getCurrentPage()!=1){
            %>
                    <a href="StudentPageList?currentPage=1">首页</a> | <a
                href="StudentPageList?currentPage=<%= list.getCurrentPage()-1%>">上一页</a>
            <%
                }
            %>
        </span>
        <span>
            <%
                for(int i=1;i<=list.getTotalPage();i++){
            %>
                    <%
                        if(i==list.getCurrentPage()){
                    %>
                            <%= i%>
                    <%
                        }else{
                    %>
                            <a href="StudentPageList?currentPage=<%= i%>"><%= i%></a>
                    <%
                        }
                    %>
            <%
                }
            %>
        </span>
        <span>
            <%
                if(list.getCurrentPage()!=list.getTotalPage()){
            %>
                    <a href="StudentPageList?currentPage=<%= list.getTotalPage()%>">尾页</a> | <a
                href="StudentPageList?currentPage=<%= list.getCurrentPage()+1%>">下一页</a>
            <%
                }
            %>
        </span>
    </div>
    <script src="js/myScript.js"></script>
</body>
</html>
