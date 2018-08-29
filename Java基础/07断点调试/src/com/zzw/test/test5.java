package com.zzw.test;

import java.util.Scanner;

public class test5 {
    /**
     * 需求：
     *      在编程中，有六个评委为参赛的选手打分，分数为0-100的整数分
     *      选手最后得分为：去掉一个最高分，一个最低分后的四个评委平均值
     * */
    public static void main(String[] args) {
        int[] arr = new int[6];
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<arr.length; i++){
            System.out.println("请输入第"+(i+1)+"个");
            arr[i] = sc.nextInt();
        }

        int max = getMax(arr);
        int min = getMin(arr);
        int sum = getPingjun(arr);
        float result = (sum-min-max)/(arr.length-2);
        System.out.println("result:"+result);
    }
    /**
     * 判断一个数组中的最大值和最小值
     * */
    public static int getMax(int[] arr){
        int max = arr[0];
        for (int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public static int getMin(int[] arr){
        int min = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
    public static int getPingjun(int[] arr){

        int sum = 0;
        for (int i=0; i<arr.length; i++){
            sum += arr[i];
        }

        return sum;
    }
}
