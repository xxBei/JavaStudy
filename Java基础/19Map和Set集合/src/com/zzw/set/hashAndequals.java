package com.zzw.set;


import java.util.HashSet;
import java.util.Objects;

/**
 * hashCode和equals优化
 * */
public class hashAndequals {
    public static void main(String[] args) {
        HashSet<Persion> hs = new HashSet<>();
        Persion p1 = new Persion("张三",18);
        Persion p2 = new Persion("李四",20);
        Persion p3 = new Persion("李四",20);
        hs.add(p1);
        hs.add(p2);
        hs.add(p3);
        for (Persion p : hs){
            System.out.println(p.getName()+"---"+p.getAge());
        }
    }
}
class Persion{
    private String name;
    private int age;

    public Persion(String name,int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /*equals方法和hashCode方法优化,可以去除重复的数据*/
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persion persion = (Persion) o;
        return age == persion.age &&
                Objects.equals(name, persion.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}