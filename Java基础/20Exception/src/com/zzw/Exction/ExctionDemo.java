package com.zzw.Exction;

/**
 * 注意:只要编译时期的异常需要抛出异常
 *      编译时期异常:Exception
 * 如何定义一个异常类:
 *      写一个类去继承Exception或者RuntimeException,然后实现多个构造即可
 * */

public class ExctionDemo {
    public static void main(String[] args) {
        /*try {
            exctions(110);
        } catch (Excetion excetion) {
            excetion.printStackTrace();
        }*/

        exctions(110);
    }

    /*public static void exctions(int socuse) throws Excetion {
        if(socuse < 0 || socuse > 100){

            throw new Excetion("考试成绩不合格");

        }
        System.out.println("成绩合格");
    }*/

    public static void exctions(int socuse){
        if(socuse < 0 || socuse > 100){

            throw new Excetion("考试成绩不合格");

        }
        System.out.println("成绩合格");
    }
}
