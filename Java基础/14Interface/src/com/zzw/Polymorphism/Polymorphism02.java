package com.zzw.Polymorphism;

/**
 *
 * Teacher techer = new ComputerTeacher();
 *
 * 多态特点:
 *      成员变量
 *              编译时看左边,运行时看左边
 *      成员方法
 *              编译时看左边,运行时看右边
 *      静态方法
 *              编译时看左边,运行时看左边
 *
 * 总结:
 *      编译时都看左边,运行时成员方法看的是右边,其他(成员变量和静态方法)看的都是左边
 * */
public class Polymorphism02 {
    public static void main(String[] args) {
        Teacher teacher = new ComputerTeacher();
//        teacher.methods();
//        System.out.println(teacher.num);
        teacher.function();
    }
}

class Teacher{
    int num = 30;
    public void methods(){
        System.out.println("教");
    }

    public static void function(){
        System.out.println("父类静态方法");
    }
}

class ComputerTeacher extends Teacher {
    int num = 10;

    @Override
    public void methods() {
        System.out.println("子类方法");
    }

    public static void function(){
        System.out.println("子类静态方法");
    }
}