package com.zzw.ArrayListTest;

import java.util.ArrayList;

public class ArrayListTest03 {
    /**
     * 需求:
     *      存储自定义对象并遍历
     *
     * 分析:
     *      定义一个类(学生类)
     *      创建集合对象
     *      创键学生对象
     *      添加对象元素
     *      遍历
     * */
    public static void main(String[] args) {
        //创键集合对象
        ArrayList<Student> arrayList = new ArrayList<>(3);

        //创键Student对象
        Student student1 = new Student("张三",'男',23);
        Student student2 = new Student("李四",'女',20);
        Student student3 = new Student("王五",'男',28);

        //添加对象元素
        arrayList.add(student1);
        arrayList.add(student2);
        arrayList.add(student3);

        for(int i=0; i<arrayList.size(); i++){
            Student s = arrayList.get(i);
            System.out.println(s.getName()+","+s.getSex()+","+s.getAge());
        }


    }
}
