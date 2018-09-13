package com.zzw.test;

import java.io.*;
import java.util.ArrayList;

/**
 * 解决对象输入流读取对象出现异常的问题
 *
 * */
public class ObjectArrayListFile {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        method1();
        //创建对象输入流对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Files\\arrayFile.txt"));
        //读取数据
        Object obj = ois.readObject();
//        System.out.println(obj);
        //向下转型,获得具体的子类对象
        ArrayList<Student> list = (ArrayList<Student>) obj;
        for(Student s : list){
            System.out.println(s);
        }
        //释放资源
        ois.close();
    }

    public static void method1() throws IOException {
        //创键对象输出流对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Files\\arrayFile" +
                ".txt"));

        //创键学生对象
        Student s1 = new Student("王五",28);
        Student s2 = new Student("许六",30);

        //创键集合对象
        ArrayList<Student> arrayList = new ArrayList<>();
        //添加学生对象
        arrayList.add(s1);
        arrayList.add(s2);

        //写入集合对象
        oos.writeObject(arrayList);

        //释放资源
        oos.close();
    }
}
