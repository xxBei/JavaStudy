package com.zzw.List;

import java.util.LinkedList;

/**
 * List常用子类
 *      ArrayList: 查询快,增删慢    它的底层是数组
 *      LinkedList: 查询慢,增删快   它的的底层是链表
 *
 * 使用场景:
 *      查询多,增删少的时候使用ArrayList
 *      查询少,增删多: 使用LinkedList
 *
 * 常用方法:
 *      boolean add(E e);     添加列表元素
 *      E get(int index)      获取指定索引的元素
 *      E getFirst()          获取第一位的元素
 *      E getLast()           获取最后一位的元素
 *      E remove(int index)   删除指定索引的元素
 *      E removeFirst()       删除第一位元素
 *      E removeLast()        删除最后一位元素
 * */
public class LinkedDemo {
    public static void main(String[] args) {
        //创键列表对象
        LinkedList<String> list = new LinkedList<>();

        //添加元素
        list.add("hello");
        list.add("world");

        //在第一位添加元素,在索引0处
        list.addFirst("java");

        //在最后一位添加元素,在索引size()-1处
        list.addLast("android");

        //获取第一位的元素
        //System.out.println(list.getFirst());

        //获取最后一位的元素
        //System.out.println(list.getLast());

        //删除指定索引的元素
        //list.remove(1);

        //删除第一位元素
        list.removeFirst();

        //删除最后一位元素
        list.removeLast();

        System.out.println(list);
    }
}
