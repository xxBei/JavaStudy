package com.zzw.ArrayList;

import java.util.ArrayList;

public class ArrayListDemo2 {
    /**
     * 获取元素
     *      public E get(int index)获取此列表中指定位置的元素,返回获取的元素
     * 集合长度
     *      public int size() 获取此列表中的元素数量。
     * 删除元素
     *      public E remove(int index) 删除该列表中指定位置的元素,返回被删除的元素
     *      public boolean remove(Object o) 从列表中删除指定元素的第一个出现（如果存在）。成功返回true,失败false
     * 修改元素
     *      public E set(int index,E element)用指定的元素替换此列表中指定位置的元素。返回被替换的元素
     *
     * */
    public static void main(String[] args) {
        //创建ArrayList对象
        ArrayList<String> arrayList = new ArrayList<>();

        //添加元素
        arrayList.add("hello");
        arrayList.add("world");
        arrayList.add("java");

        //获取指定元素 public E get(int index)
        //System.out.println(arrayList.get(2));//java

        //获取长度 public int size()
        //System.out.println(arrayList.size());//3

        //删除指定位置元素 public E remove(int index)
        //System.out.println(arrayList.remove(+1));

        //删除指定元素 public boolean remove(Object o)
        //System.out.println(arrayList.remove("world"));//true
        //System.out.println(arrayList.remove("world"));//false

        //修改元素指定位置元素
        System.out.println(arrayList.set(1,"android"));//world

        //输出结果
        System.out.println(arrayList);
    }
}
