package com.zzw.methodDemo;

import com.opensymphony.xwork2.ActionSupport;

public class CustomerAction extends ActionSupport {

    public String find(){
        System.out.println("客户的查询...");
        return NONE;
    }

    public String update(){
        System.out.println("客户的修改...");
        return NONE;
    }

    public String delete(){
        System.out.println("客户的删除...");
        return NONE;
    }

    public String save(){
        System.out.println("客户的保存...");
        return NONE;
    }
}
