package com.zzw.domain;

public class TeacherInfo {
    private long th_id;
    private long th_num;
    private String th_name;
    private String th_gender;
    private String th_username;
    private String th_password;
    private String th_class;

    public long getTh_id() {
        return th_id;
    }

    public void setTh_id(long th_id) {
        this.th_id = th_id;
    }

    public long getTh_num() {
        return th_num;
    }

    public void setTh_num(long th_num) {
        this.th_num = th_num;
    }

    public String getTh_name() {
        return th_name;
    }

    public void setTh_name(String th_name) {
        this.th_name = th_name;
    }

    public String getTh_gender() {
        return th_gender;
    }

    public void setTh_gender(String th_gender) {
        this.th_gender = th_gender;
    }

    public String getTh_username() {
        return th_username;
    }

    public void setTh_username(String th_username) {
        this.th_username = th_username;
    }

    public String getTh_password() {
        return th_password;
    }

    public void setTh_password(String th_password) {
        this.th_password = th_password;
    }

    public String getTh_class() {
        return th_class;
    }

    public void setTh_class(String th_class) {
        this.th_class = th_class;
    }

    @Override
    public String toString() {
        return "TeacherInfo{" +
                "th_id=" + th_id +
                ", th_num=" + th_num +
                ", th_name='" + th_name + '\'' +
                ", th_gender='" + th_gender + '\'' +
                ", th_username='" + th_username + '\'' +
                ", th_password='" + th_password + '\'' +
                ", th_class='" + th_class + '\'' +
                '}';
    }
}
