
$("#findAllStuMan").click(function () {
   var data_class = $("#stu_class").val();
   //console.log(data_class);
   $.ajax({
       type:"post",
       url:"student_findAll",
       data:{"stu_class":data_class},
       success:function (result) {
           $(".mainResult").html(result);
       },
       error:function () {
            $(".mainResult").html("加载失败");
       }
   })
});
