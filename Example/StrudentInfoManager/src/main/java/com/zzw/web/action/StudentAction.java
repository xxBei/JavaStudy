package com.zzw.web.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.zzw.domain.StudentInfo;
import com.zzw.service.StudentService;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public class StudentAction extends ActionSupport implements ModelDriven<StudentInfo> {

    private StudentInfo studentInfo = new StudentInfo();

    @Override
    public StudentInfo getModel() {
        return studentInfo;
    }

    private StudentService studentService;

    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }

    HttpServletRequest request = ServletActionContext.getRequest();

    public String findNameStu(){
        System.out.println("根据姓名查找学生...");
        return "findNameStu";
    }

    /**
     * 查询所有学生
     * */
    public String findAll(){
        //String stu_class = request.getParameter("stu_class");
        List<StudentInfo> list = studentService.findAll(studentInfo);
        ActionContext.getContext().getValueStack().set("StudentList",list);
        return "studentFindAll";
    }

    /**
     * 跳转到添加学生
     * */
    public String addUI(){
        return "stuAddUI";
    }

    /**
     * 添加学生
     * */
    public String addStu(){
        long stu_num = Integer.parseInt(request.getParameter("stu_num"));
        String stu_name = request.getParameter("stu_name");
        String stu_gender = request.getParameter("stu_gender");
        int stu_age = Integer.parseInt(request.getParameter("stu_age"));
        String stu_class = request.getParameter("stu_class");
        String stu_teacher = request.getParameter("stu_teacher");

        studentInfo.setStu_num(stu_num);
        studentInfo.setStu_name(stu_name);
        studentInfo.setStu_gender(stu_gender);
        studentInfo.setStu_age(stu_age);
        studentInfo.setStu_class(stu_class);
        studentInfo.setStu_teacher(stu_teacher);

        System.out.println(studentInfo);
        //将数据进行保存
        studentService.addStudent(studentInfo);
        return "addStu";
    }

}
