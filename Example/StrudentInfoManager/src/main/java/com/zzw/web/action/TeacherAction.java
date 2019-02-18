package com.zzw.web.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.zzw.domain.TeacherInfo;
import com.zzw.service.TeacherService;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


public class TeacherAction extends ActionSupport implements ModelDriven<TeacherInfo> {

    private TeacherInfo teacher = new TeacherInfo();

    @Override
    public TeacherInfo getModel() {
        return teacher;
    }

    private TeacherService teacherService;

    public void setTeacherService(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    //查询所有学生信息
    public String findAllStu(){
        teacherService.findAll();
        return "findAllStuSuccess";
    }

    //跳转到教师登录页面
    public String comeUI(){
        return "teacherComeUI";
    }

    public String loginT(){
        HttpServletRequest request = ServletActionContext.getRequest();
        String th_username =  request.getParameter("th_username");
        String th_password = request.getParameter("th_password");

        List<TeacherInfo> teacherList = teacherService.findByUsername(th_username,th_password);
        if(teacherList!=null){
            System.out.println("登录成功"+teacherList);
        }else{
            System.out.println("登录失败");
        }

        return "teacherLogin";
    }
}
