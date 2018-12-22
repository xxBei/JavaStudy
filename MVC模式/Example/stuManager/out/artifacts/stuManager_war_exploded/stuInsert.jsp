<%--
  Created by IntelliJ IDEA.
  User: zBei
  Date: 2018/12/11
  Time: 21:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加学生信息</title>
    <style>
        *{
            margin: 0;
            padding: 0;
        }
        h2{
            text-align: center;
            margin-top: 20px;
            margin-bottom: 20px;
        }
        .box{
            width: 500px;
            height: 600px;
            margin: auto;
        }
        .lineBox{
            width: 500px;
            height: 40px;
        }
        .colsBox:first-child{
            width: 125px;
            height: 40px;
            border: solid 1px #ccc;
            text-align: center;
            line-height: 40px;
            float: left;
        }
        .colsBox{
            width: 360px;
            height: 40px;
            float: left;
            border: solid 1px #ccc;
        }
        .colsBoxs{
            width: 486px;
            height: 40px;
            border: solid 1px #ccc;
            clear: both;
        }
        .colsBoxs input{
            margin-top: 10px;
            margin-left: 10px;
        }
        .colsBox1:first-child{
            width: 125px;
            height: 80px;
            border: solid 1px #ccc;
            text-align: center;
            line-height: 80px;
            float: left;
        }
        .colsBox1{
            width: 360px;
            height: 80px;
            float: left;
            border: solid 1px #ccc;
        }
        .colsBox1 textarea{
            margin-top: 10px;
            margin-left: 10px;
        }
        .input1{
            width: 200px;
            height: 26px;
            margin-top: 9px;
            margin-left: 10px;
            padding-left: 5px;
        }
        .input2{
            margin-top: 15px;
            margin-left: 10px;
        }
    </style>
</head>
<body>
    <h2>添加学生信息</h2>
    <form action="StudentInsertServlet">
    <div class="box">
        <div class="lineBox">
            <div class="colsBox">姓名</div>
            <div class="colsBox">
                <input type="text" name="sname" class="input1">
            </div>
        </div>
        <div class="lineBox">
            <div class="colsBox">性别</div>
            <div class="colsBox">
                <input type="radio" name="gender" value="1" class="input2">男
                <input type="radio" name="gender" value="0" class="input2">女
            </div>
        </div>
        <div class="lineBox">
            <div class="colsBox">电话</div>
            <div class="colsBox">
                <input type="number" name="phone" class="input1">
            </div>
        </div>
        <div class="lineBox">
            <div class="colsBox">生日</div>
            <div class="colsBox">
                <input type="text" name="birthday" class="input1">
            </div>
        </div>
        <div class="lineBox">
            <div class="colsBox1">信息</div>
            <div class="colsBox1">
                <textarea name="info" cols="30"></textarea>
            </div>
        </div>
        <div class="lineBox">
            <div class="colsBoxs">
                <input type="submit" value="添加">
            </div>
        </div>
    </div>
    </form>
</body>
</html>
