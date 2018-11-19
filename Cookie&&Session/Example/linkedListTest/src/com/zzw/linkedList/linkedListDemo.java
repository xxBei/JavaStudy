package com.zzw.linkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class linkedListDemo {
    public static void main(String[] args) {
        String test = "1#2#3#4#5#3";
        String[] fuhao = test.split("#");
        LinkedList<String> list = new LinkedList<>();
        for(String str : fuhao){
            list.add(str);
        }
        int index = list.indexOf("3");
        if(list.get(index).equals("3")){
            list.remove(index);
            System.out.println("-----"+list);
            Iterator iterator = list.iterator();
            while (iterator.hasNext()){
                String i = (String) iterator.next();
                int a = Integer.parseInt(i);
                System.out.println("value:"+a);
            }
        }







        //LinkedList<String> linkedList = new LinkedList<String>();


        /*int index = linkedList.indexOf("4");
        linkedList.addLast(linkedList.get(index));
        linkedList.remove(index);
        System.out.println(linkedList.get(index));

        //使用迭代器遍历列表
        Iterator iterator = linkedList.iterator();
        while (iterator.hasNext()){
            System.out.println("value:"+iterator.next());
        }*/
    }
}
