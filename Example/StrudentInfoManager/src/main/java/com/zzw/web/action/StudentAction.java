package com.zzw.web.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.zzw.domain.StudentInfo;

public class StudentAction extends ActionSupport implements ModelDriven<StudentInfo> {

    private StudentInfo student = new StudentInfo();

    @Override
    public StudentInfo getModel() {
        return student;
    }

    public String findNameStu(){
        System.out.println("根据姓名查找学生...");
        return "findNameStu";
    }
}
