package com.zzw.demo01;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListToFileTest {
    /**
     * 需求:
     *      键盘录入3个学生的信息(学号,姓名,年龄,居住地)存入集合,然后遍历集合把每个学生信息
     *      存入到文本文件(每个学生信息为一行数据,自己定义分隔符)
     *
     * */
    public static void main(String[] args) throws IOException{
        //文件路径
        String fileName = "txt/StudentText";

        while (true) {
            //创键主界面
            Scanner sc = new Scanner(System.in);
            System.out.println("--------欢迎进入学生管理系统--------");
            System.out.println("1.查询所有学生的信息");
            System.out.println("2.添加学生的信息");
            System.out.println("3.删除学生的信息");
            System.out.println("4.修改学生的信息");
            System.out.println("5.退出学生管理系统");
            System.out.println("----------------------------------");

            String changId = sc.nextLine();
            //输入数字进行选择不同功能
            switch (changId){
                case "1":
                    //查询学生信息
                    selectStudent(fileName);
                    break;
                case "2":
                    //添加学生信息
                    addStudent(fileName);
                    break;
                case "3":
                    //删除学生信息
                    delStudent(fileName);
                    break;
                case "4":
                    //修改学生信息
                    updateStudent(fileName);
                    break;
                case "5":
                default:
                    System.out.println("----已退出学生管理系统----");
                    System.exit(0);//退出jvm
                    break;
            }
        }
    }

    //查询学生信息
    public static void selectStudent(String fileName) throws IOException{
        //创键集合对象
        ArrayList<Student> arrayList = new ArrayList<>();
        //查询文件是否存在数据
        readFile(fileName,arrayList);

        if(arrayList.size() == 0){
            System.out.println("抱歉,当前没有任何学生信息");
            return;
        }
        System.out.println("学号\t\t姓名\t\t年级\t\t居住地");
        for(int i=0;i<arrayList.size();i++){
            Student s = arrayList.get(i);
            System.out.println(s.getId()+"\t\t"+s.getName()+"\t\t"+s.getAge()+"\t\t"+s.getAddress());
        }
    }

    //添加学生信息
    public static void addStudent(String fileName) throws IOException{
//        创键集合对象
        ArrayList<Student> arrayList = new ArrayList<>();
//        读取文件是否存在数据
        readFile(fileName,arrayList);

        //创键学生对象
        Student student = new Student();
        //创键键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学号:");
        String id = sc.nextLine();

        for(int i=0;i<arrayList.size();i++){
            Student s = arrayList.get(i);
            if(s.getId().equals(id)){
                System.out.println("输入的学号已存在,请重新选择");
                return;
            }
            break;
        }

        System.out.println("请输入姓名:");
        String name = sc.nextLine();
        System.out.println("请输入年龄:");
        String age = sc.nextLine();
        System.out.println("请输入居住地:");
        String address = sc.nextLine();

        //将数据添加到学生对象
        student.setId(id);
        student.setName(name);
        student.setAge(age);
        student.setAddress(address);

        //将学生对象添加到集合
        arrayList.add(student);
        writeFile(fileName,arrayList);
    }

    //删除学生信息
    public static void delStudent(String fileName) throws IOException{
//        创键集合对象
        ArrayList<Student> arrayList = new ArrayList<>();
//        读取文件中的数据
        readFile(fileName,arrayList);

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除的学号:");
        String id = sc.nextLine();
        int index = -1;
        //循环集合数据
        for(int i=0;i<arrayList.size();i++){
            Student s = arrayList.get(i);//获取到i对应的集合值
            if(s.getId().equals(id)){
                index = i;
                break;
            }
        }
        if(index == -1){
            System.out.println("没有查到对应的学生请重新输入");
        }else{
            arrayList.remove(index);
            writeFile(fileName,arrayList);
            System.out.println("删除成功");
        }
    }

    //修改学生信息
    public static void updateStudent(String fileName) throws IOException{
//        创键集合对象
        ArrayList<Student> arrayList = new ArrayList<>();
//        读取文件中的数据
        readFile(fileName,arrayList);

        Student student = new Student();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要修改的学号:");
        String id = sc.nextLine();
        int index = -1;
        for(int i=0;i<arrayList.size();i++){
            Student s = arrayList.get(i);
            if(s.getId().equals(id)){
                index = i;
                break;
            }
        }
        if(index == -1){
            System.out.println("您输入的学号已存在,请重新选择");
        }else {
            System.out.println("请输入新的姓名:");
            String name = sc.nextLine();
            System.out.println("请输入新的年龄:");
            String age = sc.nextLine();
            System.out.println("请输入新的居住地:");
            String address = sc.nextLine();

            student.setId(id);
            student.setName(name);
            student.setAge(age);
            student.setAddress(address);

//            根据index,修改Student类中的数据
            arrayList.set(index,student);
            writeFile(fileName,arrayList);
            System.out.println("修改成功");

        }
    }

//    缓冲输出流对象,用于存储数据
    public static void writeFile(String fileName,ArrayList<Student> arrayList) throws IOException{
//        定义缓冲输出对象,用于写入对象
        BufferedWriter bw  = new BufferedWriter(new FileWriter(fileName));


        for(int i=0;i<arrayList.size();i++){
//            存储集合中所有的数据
            Student s = arrayList.get(i);
            StringBuilder sb = new StringBuilder();
//            将所有的字符串进行拼接
            sb.append(s.getId()).append(",").append(s.getName()).append(",").append(s.getAge()).append(",").append(s.getAddress());
//            写入字符串
            bw.write(sb.toString());
            bw.newLine();
            bw.flush();
        }
//        释放资源
        bw.close();
    }


//    缓冲输入流对象,用于读取数据
   public static void readFile(String fileName,ArrayList<Student> arrayList) throws IOException{
//        定义缓冲流输入对象
       BufferedReader br = new BufferedReader(new FileReader(fileName));
//       定义字符串用于接收读取的数据
       String dates;
       while ((dates=br.readLine()) != null){
//           定义数组用于接收分割的字符串
           String[] array = dates.split(",");
//           定义学生类对象
           Student s = new Student();
           s.setId(array[0]);
           s.setName(array[1]);
           s.setAge(array[2]);
           s.setAddress(array[3]);
//           接收学生类对象
           arrayList.add(s);
       }
//       释放资源
       br.close();
   }
}
