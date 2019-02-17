package com.zzw.web.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.zzw.domain.Student;

public class StudentAction extends ActionSupport implements ModelDriven<Student> {

    private Student student = new Student();

    @Override
    public Student getModel() {
        return student;
    }

    public String findNameStu(){
        System.out.println("根据姓名查找学生...");
        return "findNameStu";
    }
}
