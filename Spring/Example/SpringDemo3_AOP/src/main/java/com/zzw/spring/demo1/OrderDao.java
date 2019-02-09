package com.zzw.spring.demo1;

public class OrderDao {

    public void save(){
        System.out.println("保存方法...");
    }

    public String delete(){
        System.out.println("删除方法...");
        return "张三";
    }

    public void update(){
        System.out.println("修改方法...");
    }

    public void find(){
        System.out.println("查询方法...");
//        int i = 10/0;
    }
}