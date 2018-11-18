package com.zzw.linkedList;

import java.util.LinkedList;

public class linkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("1");
        linkedList.add("2");
        linkedList.add("3");
        linkedList.add("4");
        linkedList.add("5");

        for (int i=0;i<linkedList.size();i++){
            System.out.println(linkedList);
        }
    }
}
