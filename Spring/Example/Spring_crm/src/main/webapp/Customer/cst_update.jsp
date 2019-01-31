<%--
  Created by IntelliJ IDEA.
  User: zBei
  Date: 2019/1/19
  Time: 22:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        *{
            margin: 0;
            padding: 0;
        }
        .addP{
            padding: 10px 0;
        }
        .addP input{
            margin-right: 20px;
        }
    </style>
</head>
<body>
    <div style="padding: 5px 0 0 10px">
        <h3>修改客户信息</h3>
        <form action="customer_updateUI.action" method="post">
            <input type="text" name="cust_id" style="display: none" value="${customer.cust_id}">
            <p class="addP">
                客户名称: <input type="text" name="cust_name" value="${customer.cust_name}">
                客户级别: <input type="text" name="cust_level" value="${customer.cust_level}">
            </p>
            <p class="addP">
                信息来源: <input type="text" name="cust_source" value="${customer.cust_source}">
                所属行业: <input type="text" name="cust_industry" value="${customer.cust_industry}">
            </p>
            <p class="addP">
                移动电话: <input type="text" name="cust_phone" value="${customer.cust_phone}">
                固定电话: <input type="text" name="cust_mobile" value="${customer.cust_mobile}">
            </p>
            <input type="submit" value="修改">
        </form>
    </div>
</body>
</html>
