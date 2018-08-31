package com.zzw.set;

import java.util.HashSet;

/**
 * 去除重复数据
 *      先比较hashCode,如果hashCode不一致,直接添加数据
 *      如果hashCode一致,则比较地址值,地址值一样,比较数据equals值是否一致,不一致,直接添加数据
 *      如果equals值一致,去除重复数据
 * */
public class setTest01 {
    public static void main(String[] args) {
        //创键集合对象
        HashSet<Student> hs = new HashSet<>();
        //创键元素对象
        Student s1 = new Student("张三",18);
        Student s2 = new Student("李四",20);
        //添加元素
        hs.add(s1);
        hs.add(s2);
        //遍历集合
        for(Student student : hs){
            //使用的Student重写toString方法
            System.out.println(student);
        }
    }
}

//创键学生类
class Student{
    private String name;
    private int age;

    public Student(String name,int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public void setAge(String name){
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    //去除重复数据

    @Override
    public int hashCode() {
        //将所有数据的hashCode全部返回1
        return 1;
    }
    //比较数据是否一致

    @Override
    public boolean equals(Object obj) {
        System.out.println("---------------");
        Student s = (Student) obj;
        if(!this.getName().equals(s.getName())){
            return false;
        }
        if(this.getAge() != s.getAge()){
            return false;
        }
        return true;
    }
}
