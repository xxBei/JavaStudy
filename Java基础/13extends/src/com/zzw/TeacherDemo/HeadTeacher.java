package com.zzw.TeacherDemo;

public class HeadTeacher extends Teacher{
    private String other;
    @Override
    public void teach() {
        System.out.println(getName()+","+getSex()+","+getOther()+":在上公共课");
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }
}
