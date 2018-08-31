package com.zzw.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * set集合:
 *      特点:
 *          1.无序(存储和读取顺序可能不一样)
 *          2.不能添加重复内容
 *          3.没有索引
 *
 * set是一个接口,所以它不能创键对象,所以使用set的话,需要使用多态,父类指向子类对象
 * */
public class setDemo01 {
    public static void main(String[] args) {
        //创建集合对象
        Set<String> set = new HashSet<>();

        //添加元素
        set.add("hello");
        set.add("java");

        //遍历集合
        //方法一: 将集合转为数组,使用数组索引进行遍历
        //method1(set);

        //方法二: 使用迭代器进行遍历
        //method2(set);

        //方法三: 使用增强for--foreach
        for(String str : set){
            System.out.println(str);
        }
    }

    public static void method1(Set<String> set){
        Object[] array = set.toArray();
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }

    public static void method2(Set<String> set){
        Iterator<String> it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
