package com.zzw.test;

import java.util.Scanner;

public class test7 {
    /**
     * 需求:
     *      1.数组元素查找(查找指定的元素第一次出现的索引)
     *      2.要查询的元素,需通过键盘录入
     *      3.定义一个查找数组元素第一次出现索引的方法
     *
     * 分析:
     *      A:查找数组,需要定义一个数组 int[] arr = {5,3,4,7,10,5};
     *      B:键盘录入元素 Scanner sc = new Scanner(System.in);
     *      C:定义一个方法,遍历数组并判断是否和输入的元素相符,相符则返回该元素的索引;
     * */
    public static void main(String[] args) {
        //定义一个数组
        int[] arr = {5,3,4,7,10,5};
        //键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要查询的元素:");
        int num = sc.nextInt();

        //定义方法,返回索引
        int index = getIndex(arr,num);
        if(index == -1){
            System.out.println("你输入的元素,数组中不存在");
        }else {
            System.out.println("该元素的索引是:" + index);
        }
    }

    /**
     * 两个明确:
     *      返回值:int
     *      参数列表:int[] arr,int value
     * */
    public static int getIndex(int[] arr,int value){
        //定义一个方法,遍历数组并判断是否和输入的元素相符
        for(int i=0; i<arr.length; i++){
            if(value == arr[i]){
                //和元素相等返回该元素的索引
                return i;
            }
        }
        //与元素不相等,返回-1
        return -1;
    }
}
