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

    public String findAll(){
        //String stu_class = request.getParameter("stu_class");


        List<StudentInfo> list = studentService.findAll(studentInfo);
        System.out.println(studentInfo.getStu_class());
        ActionContext.getContext().getValueStack().set("StudentList",list);
        System.out.println("action:"+list);
        return "studentFindAll";
    }
}
