package com.zzw.fanxing;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 泛型的来历:
 *      由于集合可以存储任意类型的元素,当我们存储了不同类型的元素,就有可能在转换类型的时候出现类型转换异常
 *      所以java为了解决这个问题,提供了一种机制,叫做泛型
 *
 * 泛型:
 *      是一种广泛的类型,把明确数据类型的工作提前到了编译时期,借鉴到数组的特点
 * 优点:
 *      避免了类型转化
 *      减少错误提醒
 *      简化代码书写
 * 何时使用:
 *      看API,当看到接口或类有<E>,就可以使用泛型了
 *
 * */
public class Fanxing {
    public static void main(String[] args) {
        //创键集合
        Collection<Student> c = new ArrayList<>();
        Student s1 = new Student("张三",18);
        Student s2 = new Student("李四",26);
        //添加Student对象
        c.add(s1);
        c.add(s2);
        //创键迭代器
        Iterator<Student> it = c.iterator();
        //遍历集合
        while (it.hasNext()){
            Student stu = it.next();
            System.out.println(stu.name+"---"+stu.age);
        }
    }
}

//创键学生对象
class Student{
    String name;
    int age;

    public Student (String name,int age){
        this.name = name;
        this.age = age;
    }
}