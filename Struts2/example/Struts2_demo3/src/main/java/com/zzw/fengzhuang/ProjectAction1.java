package com.zzw.fengzhuang;

import com.opensymphony.xwork2.ActionSupport;
import com.zzw.domain.Project;

import java.util.List;

public class ProjectAction1 extends ActionSupport {

    /**
     * 将多个对象数据封装,可以使用 list集合方式
     * 但是在 jsp页面中需要添加页面表达式
     * 例如: projects.name
     * */
    private List<Project> projects;

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    @Override
    public String execute() throws Exception {
        for (Project project: projects) {
            System.out.println(project.getName()+"--"+project.getPrice());
        }
        return NONE;
    }
}
