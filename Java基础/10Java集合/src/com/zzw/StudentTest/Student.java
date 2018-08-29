package com.zzw.StudentTest;

//定义学生类
public class Student {
    //成员变量
    private String name;
    private int age;

    //有参构造方法
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //set和get方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
