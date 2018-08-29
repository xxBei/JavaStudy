package com.zzw.abstractDemo;

/**
 * 雇员:
 *      程序员(programmer):姓名,工号,薪水,工作内容
 *      项目经理(Manager):姓名,工号,薪水,奖金,工作内容
 *
 *      共性:
 *          属性: 姓名,工号,薪水
 *          行为: 工作内容
 *
 * */

public class abstractTest02 {
    public static void main(String[] args) {
       Programmer pr = new Programmer();
       pr.id = 1;
       pr.name = "刘德华";
       pr.pay = 10000;
       pr.work();

       Manager manager =  new Manager();
       manager.id = 2;
       manager.name = "成龙";
       manager.pay = 20000;
       manager.bonus = 20;
       manager.work();
    }
}

abstract class Employee{
    String name;
    int id;
    double pay;

    public abstract void work();
}

class Programmer extends Employee{

    @Override
    public void work() {
        System.out.println(id+","+name+","+pay+":写代码");
    }
}
class Manager extends Employee{

    byte bonus;

    @Override
    public void work() {
        System.out.println(id+","+name+","+pay+","+bonus+":盯着程序员写代码");
    }
}