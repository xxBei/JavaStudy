package com.zzw.domin2;

public class Student {
    private int sid;
    private String sname;
    private int sgender;
    private String sclass;

    private Teacher teacher;

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getSgender() {
        return sgender;
    }

    public void setSgender(int sgender) {
        this.sgender = sgender;
    }

    public String getSclass() {
        return sclass;
    }

    public void setSclass(String sclass) {
        this.sclass = sclass;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
