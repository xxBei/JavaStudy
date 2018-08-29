package com.zzw.athleteTest;

public class Persion {
    //成员变量
    private String name;
    private int age;
    private char gender;

    //无参构造
    public Persion(){}

    //有参构造
    public Persion(String name,int age,char gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    //成员方法
    public void eat(){
        System.out.println("去吃饭");
    }
    public void sleep(){
        System.out.println("去睡觉");
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public char getGender(){
        return gender;
    }

    public void setGender(char gender){
        this.gender = gender;
    }
}
