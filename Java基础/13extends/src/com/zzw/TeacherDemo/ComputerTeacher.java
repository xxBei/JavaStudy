package com.zzw.TeacherDemo;

public class ComputerTeacher extends Teacher{

    @Override
    public void teach() {
        System.out.println(getName()+","+getSex()+":在上计算机专业课");
    }
}
