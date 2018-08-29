package com.zzw.Collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest {
    /**
     * Collection
     *      boolean add(E e) 确保此集合包含指定的元素（可选操作）。
     *      void clear() 从此集合中删除所有元素（可选操作）。
     *      boolean contains(Object o) 如果此集合包含指定的元素，则返回 true.
     *      boolean remove(Object o)
     *      int size()
     *      Object toArray()
     * */
    public static void main(String[] args) {
        //创键集合对象
//        Collection collection = new Collection();//Collection是接口,不能被初始化
        Collection c = new ArrayList();//多态 -- 父类指向子类对象

        //boolean add(E e) 确保此集合包含指定的元素
        System.out.println(c.add("hello"));
        System.out.println(c.add("world"));

        //void clear() 删除集合所有元素
//        c.clear();

        //boolean contains(Object o) 如果此集合包含指定的元素，则返回 true.
        //System.out.println(c.contains("hello"));

        //boolean remove(Object o)  删除指定元素,成功返回true
        //c.remove("hello");

        //int size();  返回集合中的元素个数
        //System.out.println(c.size());

        //Object toArray()  将列表转为object数组,通过转为的数组,遍历列表
        System.out.println("------------");
        Object[] objArray = c.toArray();
        for(int i=0; i<c.size(); i++){
            System.out.println(objArray[i]);
        }
        System.out.println("------------");

        //显示集合中元素
        System.out.println(c);
    }
}
