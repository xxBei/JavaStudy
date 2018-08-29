package com.zzw.TeacherDemo;

public class TeacherTest {
    public static void main(String[] args) {
        HeadTeacher ht = new HeadTeacher();
        ht.setName("尹老师");
        ht.setSex('女');
        ht.setOther("管理班级");
        ht.teach();

        ComputerTeacher ct = new ComputerTeacher();
        ct.setName("朱老师");
        ct.setSex('男');
        ct.teach();
    }
}
