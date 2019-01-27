package com.zzw.tagDemo;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import java.util.*;

public class TagDemo extends ActionSupport {

    public String ifelse(){

        //向request存储j
        ServletActionContext.getRequest().setAttribute("j",10);

        return SUCCESS;
    }

    public String iteratorTest(){

        List<String> list = new ArrayList<>();
        list.add("a1");
        list.add("a2");
        list.add("a3");

        Map<String,String> maps = new HashMap<>();
        maps.put("a","a1");
        maps.put("b","b1");
        maps.put("c","c1");

        ServletActionContext.getRequest().setAttribute("lists",list);
        ServletActionContext.getRequest().setAttribute("maps",maps);
        return "TEST";
    }
}
