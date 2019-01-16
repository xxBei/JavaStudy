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
        url:"TestServlet?name=zbei",
        success:function (result) {
            $(".rightCore").html(result);
        }
    });
}


/*ajax实现请求服务器显示客户列表*/
/*
function cstList(){
    var xmlhttp;
    if(window.XMLHttpRequest){
        //  IE7+, Firefox, Chrome, Opera, Safari 浏览器执行代码
        xmlhttp = new XMLHttpRequest();
    }else{
        // IE6, IE5 浏览器执行代码
        xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
    }
    xmlhttp.onreadystatechange = function(){
        if(xmlhttp.readyState == 4 && xmlhttp.status == 200 ){
            rightCore.innerHTML = xmlhttp.responseText;
        }else{
            console.log("加载失败");
        }
    }
    xmlhttp.open("get","TestServlet?name=zbei",true);
    xmlhttp.send();
}*/

