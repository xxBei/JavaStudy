<%@ page import="java.util.List" %>
<%@ page import="com.zzw.domain.Customer" %>
<%@page contentType="text/html; charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!doctype html>
<html lang="en">
<head>
    <title>Document</title>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="web/css/cst_list.css">
</head>
<body>
    <div class="cstListTitle">
        <span>客户名称:</span>
        <input type="text" id="cstName">
        <button id="filterBtn">筛选</button>
    </div>
    <div class="listTitle">
        <ul>
            <li class="cst_TitleLi">客户名称</li>
            <li class="cst_TitleLi">客户来源</li>
            <li class="cst_TitleLi">客户所属行业</li>
            <li class="cst_TitleLi">客户级别</li>
            <li class="cst_TitleLi">电话</li>
            <li class="cst_TitleLi">手机</li>
            <li class="cst_TitleLi">操作</li>
        </ul>


        <c:forEach var="customer" items="${list}" >
            <ul class="listTitle_ul2">
                <li class="cst_TitleLi2">${customer.cust_name}</li>
                <li class="cst_TitleLi2">${customer.cust_source}</li>
                <li class="cst_TitleLi2">${customer.cust_industry}</li>
                <li class="cst_TitleLi2">${customer.cust_level}</li>
                <li class="cst_TitleLi2">${customer.cust_phone}</li>
                <li class="cst_TitleLi2">${customer.cust_mobile}</li>
                <li class="cst_TitleLi2">
                    <a href="javascript:;">修改</a>
                    &emsp;&emsp;
                    <a href="javascript:;">删除</a>
                </li>
            </ul>
        </c:forEach>


        <%--<%
            List<Customer> list = (List<Customer>) request.getAttribute("list");
            for(Customer customer : list){
        %>
        <ul class="listTitle_ul2">
            <li class="cst_TitleLi2"><%= customer.getCust_name()%></li>
            <li class="cst_TitleLi2"><%= customer.getCust_source()%></li>
            <li class="cst_TitleLi2"><%= customer.getCust_industry()%></li>
            <li class="cst_TitleLi2"><%= customer.getCust_level()%></li>
            <li class="cst_TitleLi2"><%= customer.getCust_phone()%></li>
            <li class="cst_TitleLi2"><%= customer.getCust_mobile()%></li>
            <li class="cst_TitleLi2">
                <a href="javascript:;">修改</a>
                &emsp;&emsp;
                <a href="javascript:;">删除</a>
            </li>
        </ul>
        <%
            }
        %>--%>
    </div>
</body>
</html>