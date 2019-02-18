package com.zzw.domain;

import javax.persistence.*;

@Entity
@Table(name = "student_info", schema = "studentinfomanager", catalog = "")
public class StudentInfo {
    private long stu_id;
    private long stu_num;
    private String stu_name;
    private String stu_gender;
    private Integer stu_age;
    private Integer stu_chengji;
    private int stu_class;
    private String stu_teacher;

    @Override
    public String toString() {
        return "StudentInfo{" +
                "stu_id=" + stu_id +
                ", stu_num=" + stu_num +
                ", stu_name='" + stu_name + '\'' +
                ", stu_gender='" + stu_gender + '\'' +
                ", stu_age=" + stu_age +
                ", stu_chengji=" + stu_chengji +
                ", stu_class=" + stu_class +
                ", stu_teacher='" + stu_teacher + '\'' +
                '}';
    }

    public long getStu_id() {
        return stu_id;
    }

    public void setStu_id(long stu_id) {
        this.stu_id = stu_id;
    }

    public long getStu_num() {
        return stu_num;
    }

    public void setStu_num(long stu_num) {
        this.stu_num = stu_num;
    }

    public String getStu_name() {
        return stu_name;
    }

    public void setStu_name(String stu_name) {
        this.stu_name = stu_name;
    }

    public String getStu_gender() {
        return stu_gender;
    }

    public void setStu_gender(String stu_gender) {
        this.stu_gender = stu_gender;
    }

    public Integer getStu_age() {
        return stu_age;
    }

    public void setStu_age(Integer stu_age) {
        this.stu_age = stu_age;
    }

    public Integer getStu_chengji() {
        return stu_chengji;
    }

    public void setStu_chengji(Integer stu_chengji) {
        this.stu_chengji = stu_chengji;
    }

    public int getStu_class() {
        return stu_class;
    }

    public void setStu_class(int stu_class) {
        this.stu_class = stu_class;
    }

    public String getStu_teacher() {
        return stu_teacher;
    }

    public void setStu_teacher(String stu_teacher) {
        this.stu_teacher = stu_teacher;
    }
}
