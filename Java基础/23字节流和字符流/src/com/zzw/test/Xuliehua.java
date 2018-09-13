package com.zzw.test;

import java.io.*;
import java.util.ArrayList;

/**
 * Exception in thread "main" java.io.InvalidClassException
 *      当序列化运行时检测到类中的以下问题之一时抛出。
 *      类的串行版本与从流中读取的类描述符的类型不匹配
 *      该类包含未知的数据类型
 *      该类没有可访问的无参数构造函数
 *
 *      这个问题的出现主要是由于Student类里面的东西出现改变生成了新的序列号,从而导致了当前类和Student类序列号比较时出现错误
 *      解决方法:
 *          给Student类生成一个固定的序列号,让其里面内容改变时,序列号不需要发生改变即可解决
 * */
public class Xuliehua {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        method1();
        method2();
    }
    public static void method2() throws IOException, ClassNotFoundException {
        //创键输入对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Files\\g.txt"));
        //读取输入对象
        Object obj = ois.readObject();
        ArrayList<Student> list = (ArrayList<Student>) obj;
        for(Student student : list){
            System.out.println(student);
        }
    }
    public static void method1() throws IOException {
        //创键输出对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Files\\g.txt"));
        //创键学生对象
        Student s1 = new Student("张一",28);
        Student s2 = new Student("李二",29);
        //创键集合对象
        ArrayList<Student> arrayList = new ArrayList<>();
        arrayList.add(s1);
        arrayList.add(s2);
        //写入数据
        oos.writeObject(arrayList);
        //释放资源
        oos.close();
    }
}
