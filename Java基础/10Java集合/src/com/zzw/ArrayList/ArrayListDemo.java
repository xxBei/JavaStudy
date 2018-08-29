package com.zzw.ArrayList;

import java.util.ArrayList;

public class ArrayListDemo {
    /**
     * 集合 —— —— ArrayList类
     * 特点:
     *      长度可变.
     *  ArrayList<E>:
     *      是大小可变的数组的实现
     *
     *  <E>:
     *      一种特殊的数据类型,表示泛型
     *     使用:
     *          在 <E> 出现的地方我们可以使用引用数据类型替换即可
     *     例如:
     *          ArrayList<String>
     *
     *  构造方法:
     *      ArrayList();
     *
     *  添加元素:
     *      public boolean add(E e)将指定的元素追加到此列表的末尾。
     *      public void add(int index,E element)在此列表中的指定位置插入指定的元素。
     * */
    public static void main(String[] args) {
        //创建ArrayList对象
        ArrayList<String> arrayList = new ArrayList<>();

        String str = "";
        System.out.println(str);

        //添加元素
        arrayList.add("hello");
        arrayList.add("world");
        arrayList.add("java");

        //指定位置添加元素
        //arrayList.add(1,"android");

        //输出结果
        System.out.println(arrayList);
    }
}
