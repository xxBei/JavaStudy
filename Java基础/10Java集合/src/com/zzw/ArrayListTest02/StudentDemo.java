package com.zzw.ArrayListTest02;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentDemo {
    /**
     * 创键一个集合,存储学生对象,学生对象的数据来自键盘录入,最后遍历集合
     *
     * 分析:
     *      1.创键学生类
     *      2.创键一个集合
     *      3.创键键盘录入
     *      4.将录入的信息赋值到学生对象
     *      5.添加到集合
     *      6.遍历集合
     * */
    public static void main(String[] args) {
        //创键集合
        ArrayList<Student> array = new ArrayList<>();

        //创键方法,用于重复使用添加元素
        addStudent(array);
        addStudent(array);
        addStudent(array);

        for(int i=0;i<array.size();i++){
            array.get(i);
            System.out.println(array.get(i).getName()+","+array.get(i).getAge());
        }
    }

    private static void addStudent(ArrayList<Student> students){
        //创键键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入姓名:");
        String name = sc.nextLine();
        System.out.println("请输入年龄");
        int age = sc.nextInt();

        //创键学生对象
        Student s = new Student();


        //将录入的数据赋值到学生对象
        s.setName(name);
        s.setAge(age);

        //将对象添加到集合
        students.add(s);
    }
}
