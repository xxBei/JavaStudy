/*
* 左侧菜单项点击显示隐藏功能
* */
var leftMenu = document.getElementsByClassName('leftMenu');
var leftMenuUl = document.getElementsByClassName('leftMenuUl');
var index = 0;

for(var i=0;i<leftMenu.length;i++){
    leftMenu[i].a = i;
    leftMenu[i].onclick = function () {
        index = this.a;
        for(var j=0;j<leftMenuUl.length;j++){
            leftMenuUl[j].style.display = 'none';
        }
        leftMenuUl[index].style.display = 'block';
    }
}

/*
* 右侧菜单
**/
var rightCore = document.getElementsByClassName('rightCore')[0];
/*jquery实现Ajax*/
function cstList() {
    $.ajax({
       type:"post",
       // url:"/CustomerListServlet",//通过servlet跳转获取数据
        url:"customer_find.action",//通过Struts中的action跳转获取数据
        success:function (result) {
            $(".rightCore").html(result);
        },
        error:function () {
            $(".rightCore").html("加载失败");
        }
    });



    /*$.ajax({
        type:"get",
        url:"CustomerListServlet?name=zbei",//要访问的路径
        async:true,//开启异步加载
        success:function (result) {//请求成功时执行的函数
            $(".rightCore").html(result);//改变div的内容
        },
        error:function () {//请求失败时执行的函数
            $(".rightCore").html("加载失败");
        }
    });*/

    /*$.ajax({
        type:"post",
        url:"CustomerListServlet",
        data:{
            "name":"zbei"
        },
        success:function (result) {
            $(".rightCore").html(result);
        },
        error:function () {
            $(".rightCore").html("加载失败");
        }
    });*/
}