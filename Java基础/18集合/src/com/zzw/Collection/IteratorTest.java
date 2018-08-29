package com.zzw.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 *  遍历集合方法总结:
 *      1.Object[] toArray();   将集合转为数组
 *      2.Iterator<E> iterator() 返回此集合中的元素的迭代器。
 *              使用: collection.iterator();
 *  Iterator:可以用于遍历集合
 *       E next();   返回迭代中的下一个元素。
 *                   如果超过最后一个,则会返回一个错误信息:
 *                        Exception in thread "main" java.util.NoSuchElementException
 *
 *       boolean hasNext()    如果迭代具有更多元素，则返回 true。直到结束
 *
 *
 * */
public class IteratorTest {
    public static void main(String[] args) {
        //创键集合对象
        Collection collection = new ArrayList();
        //添加集合元素
        collection.add("hello");
        collection.add("world");
        collection.add("Java");

        //获取迭代器对象
        Iterator it = collection.iterator();

        //遍历集合
        /*方法一: next(); */
        /*System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());*/

        /*方法二: hasNext(); */
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
