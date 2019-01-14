package com.zzw.methodDemo;

import com.opensymphony.xwork2.ActionSupport;

public class ProductAction extends ActionSupport {

    public String find(){
        System.out.println("商品的查询...");
        return NONE;
    }

    public String update(){
        System.out.println("商品的修改...");
        return NONE;
    }

    public String delete(){
        System.out.println("商品的删除...");
        return NONE;
    }

    public String save(){
        System.out.println("商品的保存...");
        return NONE;
    }
}
