package com.zzw.test;

import java.io.*;

/**
 * 使用对象输入流和对象输出流写对象
 *
 * 对象输入流
 *      ObjectOutputStream
 * 对象输出流
 *      ObjectInputStream
 *
 * Exception in thread "main" java.io.NotSerializableException: com.zzw.test.Student
 * 上述异常是因为学生类需要接口Serializable,只有实现Serializable这个接口才能进行读写
 * Serializable : 序列号,是一个标识接口,只起到标识作用,没有方法可以实现
 *
 * Exception in thread "main" java.io.EOFException:当输入过程中意外到达文件或流的末尾时,抛出该异常.
 *
 * */
public class ObjectFileDemo1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //method1();
        //创键对象输入流对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Files\\对象输出文件.txt"));
        //读取学生对象
        /*Object obj1 = ois.readObject();
        System.out.println(obj1);
        Object obj2 = ois.readObject();
        System.out.println(obj2);
        Object obj3 = ois.readObject();
        System.out.println(obj3);*/

        //读取学生对象需要抛出异常,通过异常来判断是否到达了文件底部
        try {
            while (true){
                Object obj = ois.readObject();
                System.out.println(obj);
            }
        }catch (EOFException e){
            System.out.println("已经读到文件末尾");
        }


        //释放资源
        ois.close();
    }

    public static void method1() throws IOException {
        //创键对象输出流对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Files\\对象输出文件.txt"));

        //创键学生对象
        Student s1 = new Student("张三",20);
        Student s2 = new Student("李四",22);

        //写入学生对象
        oos.writeObject(s1);
        oos.writeObject(s2);

        //释放资源
        oos.close();
    }
}
