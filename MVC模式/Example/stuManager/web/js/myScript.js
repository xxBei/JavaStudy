//删除学生信息
function delStu(sid){
    var flag = confirm("是否删除该学生信息?");
    if(flag){
        location.href = "StudentDeleteServlet?sid="+sid;
    }
}