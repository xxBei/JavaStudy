var stuTeacherLogin = document.getElementById("stuTeacherLogin");
var stuStudentLogin = document.getElementById("stuStudentLogin");
var stuManager_loginTit = document.getElementsByClassName("stuManager_loginTit");

//切换登录方式
for(var i=0;i<stuManager_loginTit.length;i++){
    stuManager_loginTit[i].index = i;
    stuManager_loginTit[i].onclick = function () {
        if(this.index == 0){
            stuTeacherLogin.style.display = "block";
            stuStudentLogin.style.display = "none";
            stuManager_loginTit[0].className = "stuManager_loginTit stuManager_bg";
            stuManager_loginTit[1].className = "stuManager_loginTit";
        }else{
            stuTeacherLogin.style.display = "none";
            stuStudentLogin.style.display = "block";
            stuManager_loginTit[0].className = "stuManager_loginTit";
            stuManager_loginTit[1].className = "stuManager_loginTit stuManager_bg";
        }
    }
}

