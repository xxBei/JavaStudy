package com.zzw.fengzhuang;

import com.opensymphony.xwork2.ActionSupport;
import com.zzw.domain.Project;

import java.util.List;
import java.util.Map;

public class ProjectAction2 extends ActionSupport {

    /**
     * 将多个对象数据封装,可以使用 Map集合方式
     * 但是在 jsp页面中需要添加页面表达式
     * 例如: projects.name
     * */

    private Map<String,Project> map;

    public Map<String, Project> getMap() {
        return map;
    }

    public void setMap(Map<String, Project> map) {
        this.map = map;
    }

    @Override
    public String execute() throws Exception {
        for(String key : map.keySet()){
            Project project = map.get(key);
            System.out.println(key+"     "+project.getName()+"=="+project.getPrice());
        }
        return NONE;
    }
}
