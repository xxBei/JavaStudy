package com.zzw.Map;

import java.util.Objects;

public class Student {
    private String name;
    private String zi;

    public Student(String name, String zi) {
        this.name = name;
        this.zi = zi;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", zi='" + zi + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) &&
                Objects.equals(zi, student.zi);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, zi);
    }
}
