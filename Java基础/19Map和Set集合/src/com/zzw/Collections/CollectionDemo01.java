package com.zzw.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Collection 和 Collections区别:
 *      Collection是集合体系的最顶层,包含了集合体系的共性
 *      Collections是一个集合工具类,方法都是用于操作Collection
 *
 * 常用方法:
 *      static int binarySearch(List list, T key) : 使用二分法来查找元素对应的索引值
 *      static void copy(List dest, List src) : 将所有元素从一个列表复制到另一个列表,注意:复制到的列表元素必须大于或等于被复制的列表
 *      static void fill(List list, Object obj) : 用指定的元素代替指定列表的所有元素。
 *      static void reverse(List list) : 反转列表中的元素
 *      static void shuffle(List list) : 使用默认的随机源随机排列指定的列表。
 *      static void sort(List list) : 通过升序对列表进行排序。
 *      static void swap(List list, int i, int j) : 将列表中,指定的两个索引位置的元素互换
 * */
public class CollectionDemo01 {
    public static void main(String[] args) {
        method7();
    }

    public static void method1(){
        //static int binarySearch(List list, T key) : 使用二分法来查找元素对应的索引值
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        int index = Collections.binarySearch(list,4);
        System.out.println(index);
    }

    public static void method2(){
        List<String> src = new ArrayList<>();
        src.add("hello");
        src.add("world");
        src.add("java");
        List<String> dest = new ArrayList<>();
        System.out.println(src);
        System.out.println("----------------");
        dest.add("");
        dest.add("");
        dest.add("");
        dest.add("android");
        Collections.copy(dest,src);
        System.out.println(dest);
    }

    public static void method3(){
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("java");
        Collections.fill(list,"android");
        System.out.println(list);
    }

    public static void method4(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(2);
        Collections.reverse(list);
        System.out.println(list);
    }

    public static void method5(){
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("java");
        Collections.shuffle(list);
        System.out.println(list);
    }

    public static void method6(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(2);
        Collections.sort(list);
        System.out.println(list);
    }

    public static void method7(){
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("java");
        Collections.swap(list,0,2);
        System.out.println(list);
    }
}
