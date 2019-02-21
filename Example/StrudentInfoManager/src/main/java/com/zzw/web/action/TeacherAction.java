package com.zzw.web.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.zzw.domain.TeacherInfo;
import com.zzw.service.TeacherService;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class TeacherAction extends ActionSupport implements ModelDriven<TeacherInfo> {

    private TeacherInfo teacherInfo = new TeacherInfo();

    @Override
    public TeacherInfo getModel() {
        return teacherInfo;
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

    //跳转的教师注册页面
    public String comeRegisteredUI(){
        return "registeredUI";
    }

    HttpServletRequest request = ServletActionContext.getRequest();

    //教师登录功能实现
    public String login(){
        /*String th_username =  request.getParameter("th_username");
        String th_password = request.getParameter("th_password");*/
        String th_class;

        List<TeacherInfo> teacherList =
                teacherService.findByUsername(teacherInfo.getTh_username(),teacherInfo.getTh_password());
        if(teacherList!=null){
            System.out.println("登录成功"+teacherList);
            ActionContext.getContext().getValueStack().set("teacherList",teacherList);
            for(TeacherInfo teacherInfo : teacherList){
                th_class = teacherInfo.getTh_class();
                if(th_class.equals("")){
                    ActionContext.getContext().getValueStack().set("notClass","");
                }else{
                    String[] className = th_class.split(",");
                    ActionContext.getContext().getValueStack().set("notClass",className);
                }
            }
            return "teacherLogin";
        }else{
            System.out.println("登录失败");
            return "teacherLoginError";
        }
    }

    //教师注册功能实现
    public String registered(){
        String th_name = request.getParameter("th_name");
        String th_gender = request.getParameter("th_gender");
        String th_username = request.getParameter("th_username");
        String th_password = request.getParameter("th_password");
        String th_class = request.getParameter("th_class");

        teacherInfo.setTh_name(th_name);
        teacherInfo.setTh_gender(th_gender);
        teacherInfo.setTh_username(th_username);
        teacherInfo.setTh_password(th_password);
        teacherInfo.setTh_class(th_class);

        teacherService.registeredTeacher(teacherInfo);
        return "registeredSuccess";
    }
}
