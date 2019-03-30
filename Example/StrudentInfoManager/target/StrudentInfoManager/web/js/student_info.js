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
//student_info_list.jsp
$(".upStuBtn").click(function () {
    //获取upStubtn中的alt属性的值
    var data_stu_id = $(this).attr("alt");
    $.ajax({
        type:"post",
        url:"student_updateTUI",//教师修改学生信息（跳转并根据id查询学生）
        data:{"stu_id":data_stu_id},
        success:function (result) {
            $(".mainResult").html(result);
        },
        error:function () {
            $(".mainResult").html("加载失败");
        }
    });
    console.log("修改学生信息"+data_stu_id);
});


$(".delStuBtn").click(function () {
    $.ajax({
        type:"post",
        url:"student_delete",//教师删除学生信息
        success:function (result) {

        },
        error:function () {

        }
    });
    console.log("修改学生信息");
});

//student_updateT.jsp
$("#stu_update_sub").click(function () {
    $.ajax({
        type:"post",
        url:"student_updateT",//修改学生信息
        data:$("form").serialize(),//将表单数据提交
        success:function (result) {
            alert("修改成功")
        },
        error:function () {
            alert("修改失败")
        }
    })
});