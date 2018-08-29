package com.zzw.test_02;

public class Test {
    /**
     * 类型作为返回值
     * */
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        Student student = teacher.getStudent();
        student.study();

    }
}
