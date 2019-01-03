package com.zzw.domin2;

import java.util.HashSet;
import java.util.Set;

public class Teacher {
    private int tid;
    private String tname;
    private int tgender;
    private String tsubject;

    private Set<Student> students = new HashSet<>();

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public int getTgender() {
        return tgender;
    }

    public void setTgender(int tgender) {
        this.tgender = tgender;
    }

    public String getTsubject() {
        return tsubject;
    }

    public void setTsubject(String tsubject) {
        this.tsubject = tsubject;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }
}
