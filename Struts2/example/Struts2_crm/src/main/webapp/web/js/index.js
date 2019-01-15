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