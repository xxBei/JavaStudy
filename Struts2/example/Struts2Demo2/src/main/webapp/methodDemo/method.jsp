<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>method</title>
</head>
<body>
<h1>Action的访问</h1>
<h3>通过method方法</h3>
<a href="userFind.action">查询用户</a><br>
<a href="userUpdate.action">修改用户</a><br>
<a href="userDelete.action">删除用户</a><br>
<a href="userSave.action">保存用户</a><br>

<h3>通过通配符</h3>
<a href="product_find.action">查询商品</a><br>
<a href="product_update.action">修改商品</a><br>
<a href="product_delete.action">删除商品</a><br>
<a href="product_save.action">保存商品</a><br>

<h3>通过动态方法</h3>
<a href="customer!find.action">查询客户</a><br>
<a href="customer!update.action">修改客户</a><br>
<a href="customer!delete.action">删除客户</a><br>
<a href="customer!save.action">保存客户</a><br>

<button onclick="btn()">jQuery Ajax</button>
<script src="jquery-3.3.1.min.js"></script>
<script>
    function btn() {
        $.ajax({
           type:"post",
           url:"product_find.action",
           success:function () {
               console.log("成功");
           },
            error:function () {
                console.log("失败");
            }
        });
    }
</script>

</body>
</html>