package com.zzw.Collection;

import java.util.*;

/**
 * 需求:
 *      判断集合中是否包含Java,如果包含,则添加 Android
 *      Exception in thread "main" java.util.ConcurrentModificationException:并发修改异常
 *      迭代器是依赖与集合的,相当于集合的一个副本,当迭代器在操作的时候,如果发现迭代器和集合长度不一样,则会抛出上面的错误
 *
 * 解决方案:
 *      在使用迭代器进行遍历的时候使用迭代器进行修改
 *
 * */
public class IteratorDemo {
    public static void main(String[] args) {
//        method1();
        //创键集合
        //Collection c = new ArrayList();
        List c = new ArrayList();

        //添加元素
        c.add("hello");
        c.add("World");
        c.add("Java");

        //添加迭代器,以下方法会提示ConcurrentModificationException并发修改错误
        /*Iterator it = c.iterator();

        while (it.hasNext()){
            String s = (String)it.next();
            if(s.equals("Java")){
                c.add("Android");
            }
        }*/

        //解决方法:
        ListIterator lit = c.listIterator();
        while (lit.hasNext()){
            String s = (String)lit.next();
            if (s.equals("Java")){
                lit.add("Android");
            }
        }

        //查看集合元素
        System.out.println(c);
    }

    /*使用contains()方法判断是否包含Java*/
    public static void method1(){
        //创键集合
        Collection c = new ArrayList();

        //添加元素
        c.add("hello");
        c.add("World");
        c.add("Java");

        //判断集合中是否有Java
        if(c.contains("Java")){
            c.add("Android");
            System.out.println(c);
        }else{
            System.out.println("没有Java元素");
            return;
        }

        //添加迭代器
        Iterator it = c.iterator();

        //遍历数组
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
