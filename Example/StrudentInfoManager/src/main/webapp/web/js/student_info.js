$("#findAllStuMan").click(function () {
   var data_class = $("#stu_class").val();
   //console.log(data_class);
   $.ajax({
       type:"post",
       url:"student_findAll",//教师根据班级查询学生信息
       data:{"stu_class":data_class},
       success:function (result) {
           $(".mainResult").html(result);
       },
       error:function () {
            $(".mainResult").html("加载失败");
       }
   })
});

$("#addStudent").click(function () {
    /*$(this).css("background","#3a3d48");
    $(this).css("color","#fff");*/
    $.ajax({
        type:"post",
        url:"student_addUI",//教师添加学生信息
        success:function (result) {
            $(".mainResult").html(result);
        },
        error:function () {
            $(".mainResult").html("加载失败");
        }
    })
});

