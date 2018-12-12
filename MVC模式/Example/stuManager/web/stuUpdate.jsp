<%@ page import="com.zzw.service.StudentService" %>
<%@ page import="com.zzw.service.impl.StudentServiceImpl" %>
<%@ page import="java.util.List" %>
<%@ page import="com.zzw.domain.Student" %><%--
  Created by IntelliJ IDEA.
  User: zBei
  Date: 2018/12/12
  Time: 8:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学生信息更新</title>
    <style>
        *{
            margin: 0;
            padding: 0;
        }
        h2{
            text-align: center;
            margin: 20px 0;
        }
        .box{
            width: 500px;
            height: 300px;
            margin: auto;
        }
        .lineBox{
            width: 498px;
            height: 40px;
            border: solid #ccc 1px;
        }
        .colTitle{
            width: 120px;
            height: 40px;
            border-right: solid 1px #ccc;
            text-align: center;
            line-height: 40px;
            float: left;
        }
        .colValue{
            width: 370px;
            height: 40px;
            float: left;
        }
        .colValue input{
            margin-top: 5px;
            margin-left: 10px;
            width: 230px;
            height: 30px;
            padding-left: 10px;
        }
        .colValue textarea{
            margin-top: 3px;
            margin-left: 10px;
            padding-left: 10px;
        }
        .colValues input{
            margin-top: 16px;
            margin-left: 10px;
        }
        .lineBoxs{
            width: 498px;
            height: 80px;
            border: solid #ccc 1px;
        }
        #infoId{
            height: 80px;
            line-height: 80px;
        }
        .updateBtn{
            width: 70px;
            height: 30px;
            margin-top: 5px;
            margin-right: 10px;
            float: right;
        }
    </style>
</head>
<body>
    <%
        HttpSession sessions = request.getSession();
        sessions.setAttribute("sid",request.getParameter("sid"));
        int sid = Integer.parseInt(request.getParameter("sid"));

        StudentService service = new StudentServiceImpl();
        List<Student> list = service.findOther(sid);

        for(Student student : list){
    %>
    <h2>学生信息更新</h2>
    <form action="StudentUpdateServlet">
    <div class="box">
        <div class="lineBox">
            <div class="colTitle">姓名</div>
            <div class="colValue">
                <input type="text" name="sname" value="<%= student.getSname()%>">
            </div>
        </div>
        <div class="lineBox">
            <div class="colTitle">性别</div>
            <div class="colValues">
                <input type="radio" value="1" name="gender">男
                <input type="radio" value="0" name="gender">女
            </div>
        </div>
        <div class="lineBox">
            <div class="colTitle">电话</div>
            <div class="colValue">
                <input type="tel" name="phone" value="<%= student.getPhone()%>">
            </div>
        </div>
        <div class="lineBox">
            <div class="colTitle">生日</div>
            <div class="colValue">
                <input type="text" name="birthday" value="<%= student.getBirthday()%>">
            </div>
        </div>
        <div class="lineBoxs">
            <div class="colTitle" id="infoId">信息</div>
            <div class="colValue">
                <textarea name="info" cols="30" rows="3" ><%= student.getInfo()%></textarea>
            </div>
        </div>
        <div class="lineBox">
            <input type="submit" value="更新" class="updateBtn">
        </div>
    </div>
    </form>
    <%
        }
    %>
</body>
</html>
