package com.zzw.test;

import java.util.Scanner;

public class test6 {
    /**
     * 需求：
     *      1.键盘录入5个int值的数据存入到数组中
     *      2.定义方法将arr数组中的内容反转
     *      3.定义方法对反转内容遍历
     * */
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<arr.length; i++){
            System.out.println("请输入第"+(i+1)+"位数字");
            arr[i] = sc.nextInt();
        }
        //反转前遍历
        printArray(arr);
        // 调用函数
        fanzhuan(arr);
        //反转后的遍历
        printArray(arr);
    }

    /**
     * 定义方法将arr反转
     * */
    public static void fanzhuan(int[] arr){
        for(int start=0,end = arr.length-1; start<=end; start++,end--){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
    }
    /**
     * 遍历反转数组
     * */
    public static void printArray(int[] arr){
        System.out.print("[");
        for(int i=0; i<arr.length; i++){
            if(i == arr.length-1){
                System.out.println(arr[i]+"]");
            }else{
                System.out.print(arr[i]+",");
            }
        }
    }
}
