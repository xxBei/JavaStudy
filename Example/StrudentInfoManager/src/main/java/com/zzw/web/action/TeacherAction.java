package com.zzw.web.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.zzw.domain.Teacher;
import com.zzw.service.TeacherService;

public class TeacherAction extends ActionSupport implements ModelDriven<Teacher> {

    private Teacher teacher = new Teacher();

    @Override
    public Teacher getModel() {
        return teacher;
    }

    private TeacherService teacherService;

    public void setTeacherService(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    public String findAllStu(){
        teacherService.findAll();
        return "findAllStuSuccess";
    }
}
