package com.zzw.List;

import java.util.ArrayList;
import java.util.List;

/**
 * List 列表
 * 1.有序列表(读取和存储的顺序是一致的)
 * 2.有整数索引
 * 3.允许重复数据
 * <p>
 * 常用方法:
 * boolean add(E e);   将指定的项目添加到列表的末尾。
 * void add(int index, E element)  将指定的项目添加到由索引指示的位置的列表中。
 * E get(int index);    获取索引处的元素
 * E remove(int index);   删除索引处的元素
 * E set(int index, E element);  用指定元素替换索引处对应的元素
 * int size();     返回列表中的元素个数
 * Object[] toArray();     返回一个包含此列表中所有元素的数组
 */
public class ListDemo01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        //添加元素
        list.add(0, "Hello");
        list.add(1, "World");
        list.add(2, "java");

        //获取索引处的元素
        //System.out.println(list.get(0));

        //删除索引处的元素
        //list.remove(1);

        //修改索引处对应的元素
        //list.set(2,"android");

        //获取列表长度
        //System.out.println(list.size());

        //循环列表
        /*for (String str : list) {
            System.out.println(str);
        }*/

        /*for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }*/

        System.out.println(list);
    }
}
