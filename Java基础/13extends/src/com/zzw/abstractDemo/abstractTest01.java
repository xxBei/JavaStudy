package com.zzw.abstractDemo;

/**
 * 需求:
 *      基础班老师和就业版老师
 *
 *      共性:
 *              属性: 姓名,年龄,性别
 *              行为: 讲课
 * */
public class abstractTest01 {
    public static void main(String[] args) {
        BaseTeacher bt = new BaseTeacher();
        bt.name = "张无忌";
        bt.age = 23;
        bt.sex = '男';
        bt.teach();

        JopTeacher jt = new JopTeacher();
        jt.name = "小泽";
        jt.age = 18;
        jt.sex = '女';
        jt.teach();
    }
}

abstract class Teacher{
    String name;
    int age;
    char sex;
    public abstract void teach();
}

class BaseTeacher extends Teacher{

    @Override
    public void teach() {
        System.out.println(name+","+age+","+sex+":基础班课程");
    }
}

class JopTeacher extends Teacher{

    @Override
    public void teach() {
        System.out.println(name+","+age+","+sex+":就业班课程");
    }
}