<%--
  Created by IntelliJ IDEA.
  User: zBei
  Date: 2018/11/17
  Time: 16:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta charset="UTF-8">
  <title></title>
  <link rel="stylesheet" href="css/myCss.css">
</head>
<body>
<h1>新歌首发</h1>
<div class="titleBox">
    <p class="p1 green" onclick="tuijian()">为你推荐</p>
    <p class="p1" onclick="neidi()">内地</p>
    <p class="p1">港台</p>
    <p class="p1">欧美</p>
    <p class="p1">日本</p>
    <p class="p1">韩国</p>
</div>
<!--歌单内容1-->
<div id="musicBox1">
    <!--列表1-->
    <div class="musicDiv1">
        <a href="product_info?pro_id=1">
            <div class="smileBox">
                <img src="img/1.jpg" class="imgs"/>
                <div class="textBox">
                    <p>恰好《功夫联盟》电影主题曲</p>
                    <p>b-Lin</p>
                </div>
                <div class="timeBox">
                    <p>03:45</p>
                </div>
            </div>
        </a>
        <a href="product_info?pro_id=2">
            <div class="smileBox">
                <img src="img/2.jpg" class="imgs"/>
                <div class="textBox">
                    <p>恰好《功夫联盟》电影主题曲</p>
                    <p>A-Lin</p>
                </div>
                <div class="timeBox">
                    <p>03:45</p>
                </div>
            </div>
        </a>
        <a href="product_info?pro_id=3">
            <div class="smileBox">
                <img src="img/3.jpg" class="imgs"/>
                <div class="textBox">
                    <p>恰好《功夫联盟》电影主题曲</p>
                    <p>A-Lin</p>
                </div>
                <div class="timeBox">
                    <p>03:45</p>
                </div>
            </div>
        </a>
    </div>

    <!--列表2-->
    <div class="musicDiv1">
        <a href="product_info?pro_id=4">
            <div class="smileBox">
                <img src="img/4.jpg" class="imgs"/>
                <div class="textBox">
                    <p>恰好《功夫联盟》电影主题曲</p>
                    <p>A-Lin</p>
                </div>
                <div class="timeBox">
                    <p>03:45</p>
                </div>
            </div>
        </a>
        <a href="product_info?pro_id=5">
            <div class="smileBox">
                <img src="img/5.jpg" class="imgs"/>
                <div class="textBox">
                    <p>恰好《功夫联盟》电影主题曲</p>
                    <p>A-Lin</p>
                </div>
                <div class="timeBox">
                    <p>03:45</p>
                </div>
            </div>
        </a>
        <a href="product_info?pro_id=6">
            <div class="smileBox">
                <img src="img/6.jpg" class="imgs"/>
                <div class="textBox">
                    <p>恰好《功夫联盟》电影主题曲</p>
                    <p>A-Lin</p>
                </div>
                <div class="timeBox">
                    <p>03:45</p>
                </div>
            </div>
        </a>
    </div>

    <!--列表3-->
    <div class="musicDiv1">
        <a href="product_info?pro_id=7">
            <div class="smileBox">
                <img src="img/7.jpg" class="imgs"/>
                <div class="textBox">
                    <p>恰好《功夫联盟》电影主题曲</p>
                    <p>A-Lin</p>
                </div>
                <div class="timeBox">
                    <p>03:45</p>
                </div>
            </div>
        </a>
        <a href="product_info?pro_id=8">
            <div class="smileBox">
                <img src="img/8.jpg" class="imgs"/>
                <div class="textBox">
                    <p>恰好《功夫联盟》电影主题曲</p>
                    <p>A-Lin</p>
                </div>
                <div class="timeBox">
                    <p>03:45</p>
                </div>
            </div>
        </a>
        <a href="product_info?pro_id=9">
            <div class="smileBox">
                <img src="img/9.jpg" class="imgs"/>
                <div class="textBox">
                    <p>恰好《功夫联盟》电影主题曲</p>
                    <p>A-Lin</p>
                </div>
                <div class="timeBox">
                    <p>03:45</p>
                </div>
            </div>
        </a>
    </div>
</div>

<!--歌单内容2-->
<div id="musicBox2">
    <!--列表1-->
    <div class="musicDiv1">
        <div class="smileBox">
            <img src="img/b1.jpg" class="imgs"/>
            <div class="textBox">
                <p>恰好《功夫联盟》电影主题曲</p>
                <p>A-Lin</p>
            </div>
            <div class="timeBox">
                <p>03:45</p>
            </div>
        </div>
        <div class="smileBox">
            <img src="img/b2.jpg" class="imgs"/>
            <div class="textBox">
                <p>恰好《功夫联盟》电影主题曲</p>
                <p>A-Lin</p>
            </div>
            <div class="timeBox">
                <p>03:45</p>
            </div>
        </div>
        <div class="smileBox">
            <img src="img/b3.jpg" class="imgs"/>
            <div class="textBox">
                <p>恰好《功夫联盟》电影主题曲</p>
                <p>A-Lin</p>
            </div>
            <div class="timeBox">
                <p>03:45</p>
            </div>
        </div>
    </div>

    <!--列表2-->
    <div class="musicDiv1">
        <div class="smileBox">
            <img src="img/b4.jpg" class="imgs"/>
            <div class="textBox">
                <p>恰好《功夫联盟》电影主题曲</p>
                <p>A-Lin</p>
            </div>
            <div class="timeBox">
                <p>03:45</p>
            </div>
        </div>
        <div class="smileBox">
            <img src="img/b5.jpg" class="imgs"/>
            <div class="textBox">
                <p>恰好《功夫联盟》电影主题曲</p>
                <p>A-Lin</p>
            </div>
            <div class="timeBox">
                <p>03:45</p>
            </div>
        </div>
        <div class="smileBox">
            <img src="img/b6.jpg" class="imgs"/>
            <div class="textBox">
                <p>恰好《功夫联盟》电影主题曲</p>
                <p>A-Lin</p>
            </div>
            <div class="timeBox">
                <p>03:45</p>
            </div>
        </div>
    </div>

    <!--列表3-->
    <div class="musicDiv1">
        <div class="smileBox">
            <img src="img/b7.jpg" class="imgs"/>
            <div class="textBox">
                <p>恰好《功夫联盟》电影主题曲</p>
                <p>A-Lin</p>
            </div>
            <div class="timeBox">
                <p>03:45</p>
            </div>
        </div>
        <div class="smileBox">
            <img src="img/b8.jpg" class="imgs"/>
            <div class="textBox">
                <p>恰好《功夫联盟》电影主题曲</p>
                <p>A-Lin</p>
            </div>
            <div class="timeBox">
                <p>03:45</p>
            </div>
        </div>
        <div class="smileBox">
            <img src="img/b1.jpg" class="imgs"/>
            <div class="textBox">
                <p>恰好《功夫联盟》电影主题曲</p>
                <p>A-Lin</p>
            </div>
            <div class="timeBox">
                <p>03:45</p>
            </div>
        </div>
    </div>
</div>

<!--浏览记录-->
<ul class="browseBox">
    <li class="browseHistory">浏览记录</li>
    <%
        Cookie[] cookies = request.getCookies();
        Cookie cookie = com.zzw.util.cookieUtil.findCookie(cookies,"History");
        if(cookie == null){
    %>
            <h2 class="browseH2">您没有浏览任何歌曲<h2>
    <%
        }else{
            String[] pro_idValues = cookie.getValue().split("#");
            for (String pro_id : pro_idValues) {
    %>
                <li class="browseImg">
                    <img src="img/<%=pro_id%>.jpg">
                </li>
    <%
            }
        }
    %>
</ul>

<script type="text/javascript" src="js/myJs.js"></script>
</body>
</html>

