package com.zzw.StudentTest;

public class StudentDemo {
    /**
     * 创建一个学生数组,存储三个学生对象并遍历
     *
     * 分析:
     * 1.定义学生类
     * 2.创建一个学生数组
     * 3.创建学生对象
     * 4.把学生对象作为元素赋值给学生对象
     * 5.遍历学生数组
     */
    public static void main(String[] args) {
        //创建学生数组
        Student[] student = new Student[3];

        //创建学生对象
        Student s1 = new Student("刘备", 35);
        Student s2 = new Student("关羽", 33);
        Student s3 = new Student("张飞", 30);

        //把学生对象作为元素赋值给学生对象
        student[0] = s1;
        student[1] = s2;
        student[2] = s3;

        //遍历学生数组
        for (int i = 0; i < student.length; i++) {
            System.out.println(student[i].getName() + "---" + student[i].getAge());
        }

    }
}
