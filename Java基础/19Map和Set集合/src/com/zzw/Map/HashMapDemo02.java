package com.zzw.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 使用HashMap存储数据并遍历(自定义对象作为 Key)
 *
 * */
public class HashMapDemo02 {
    public static void main(String[] args) {
        //创键HashMap对象
        HashMap<Student,String> hm = new HashMap<>();
        //创建Key对象
        Student s1 = new Student("曹操","孟德");
        Student s2 = new Student("孙权","仲谋");
        Student s3 = new Student("刘备","玄德");
        Student s4 = new Student("刘备","玄德");
        //添加元素
        hm.put(s1,"001");
        hm.put(s2,"002");
        hm.put(s3,"003");
        hm.put(s4,"003");
        //获取key值并存储
        Set<Student> keys = hm.keySet();
        //遍历第一种方法
        for(Student key : keys){
            //通过key值获取value
            String value = hm.get(key);
            System.out.println(key + "------" + value);
        }

        System.out.println("-------------------------");

        Set<Map.Entry<Student,String>> entries = hm.entrySet();
        //遍历第一种方法
        for(Map.Entry<Student,String> entry : entries){
            Student key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"---"+value);
        }
    }
}
