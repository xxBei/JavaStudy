package com.zzw.StudentManager;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagerTest {
    /**
     * 学生管理系统
     * */
    public static void main(String[] args) {
        //创键学生对象
        Student student = new Student();
        //创键集合
        ArrayList<Student> array =  new ArrayList<>();

        while(true) {
            System.out.println("--------欢迎进入学生管理系统--------");
            System.out.println("1.查看所有学生");
            System.out.println("2.添加学生");
            System.out.println("3.删除学生");
            System.out.println("4.修改学生");
            System.out.println("5.退出");
            System.out.println("----------------");
            System.out.println("请输入您的选择:");

            //创键键盘录入
            Scanner sc = new Scanner(System.in);
            String chooseId = sc.nextLine();
            switch (chooseId) {
                case "1":
                    //查看所有学生
                    findStudent(array);
                    break;
                case "2":
                    //添加学生
                    addStudent(array);
                    break;
                case "3":
                    //删除学生
                    delStudent(array);
                    break;
                case "4":
                    //修改学生
                    updateStudent(array);
                    break;
                case "5":
                    //退出
                default:
                    System.out.println("已退出学生管理系统");
                    System.exit(0);
                    break;
            }
        }
    }

    //查看所有学生
    public static void findStudent(ArrayList<Student> array){
        if(array.size() == 0){
            System.out.println("抱歉,当前没有任何学生信息,请重新选择");
            return;
        }
        System.out.println("学号\t\t姓名\t\t年龄\t\t居住地");
        for(int i=0; i<array.size(); i++){
            Student s = array.get(i);
            System.out.println(s.getId()+"\t\t"+s.getName()+"\t\t"+s.getAge()+"\t\t"+s.getAddress());
        }
    }

    //添加学生信息
    public static void addStudent(ArrayList<Student> array){
        //创键学生对象
        Student student = new Student();

        //键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学号:");
        String id = sc.nextLine();
        //循环查找是否有相同的学号
        for(int i=0; i<array.size(); i++){
            Student s = array.get(i);
            //如果学号相同,进行处理
            if(s.getId().equals(id)){
                System.out.println("输入的学号已经存在,请重新输入");
                return;
            }
        }
        System.out.println("请输入姓名:");
        String name = sc.nextLine();
        System.out.println("请输入年龄:");
        String age=sc.nextLine();
        System.out.println("请输入居住地:");
        String address = sc.nextLine();

        //为学生对象的成员变量赋值
        student.setId(id);
        student.setName(name);
        student.setAge(age);
        student.setAddress(address);

        //将学生对象添加到集合中
        array.add(student);

    }

    //删除学生信息
    public static void delStudent(ArrayList<Student> array){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除的学号:");
        String id = sc.nextLine();
        Student s;
        int index = -1;
        for(int i=0; i<array.size(); i++){
            s = array.get(i);
            if(s.getId().equals(id)){
                index = i;
                break;
            }
        }
        if(index == -1){
            System.out.println("查不到该学生信息,请重新输入");
        }else{
            array.remove(index);
            System.out.println("删除成功");
        }

    }

    //修改学生信息
    public static void updateStudent(ArrayList<Student> array){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要修改的学号:");
        String id = sc.nextLine();


        Student s;
        int index = -1;
        for(int i=0;i<array.size();i++){
            s = array.get(i);
            if(s.getId().equals(id)){
                index = i;
                break;
            }
        }
        if(index == -1){
            System.out.println("您输入的学号有误,请重新输入:");
        }else{
            System.out.println("请输入新的姓名:");
            String name = sc.nextLine();
            System.out.println("请输入新的年龄:");
            String age = sc.nextLine();
            System.out.println("请输入新的居住地:");
            String address = sc.nextLine();

            //创键学生对象
            Student student = new Student();
            student.setId(id);
            student.setName(name);
            student.setAge(age);
            student.setAddress(address);

            array.set(index,student);
            System.out.println("修改成功");

        }
    }
}
