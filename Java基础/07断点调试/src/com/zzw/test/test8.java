package com.zzw.test;

import java.util.Scanner;

public class test8 {
    /**
     * 需求:
     *      1.键盘录入数据,要求数据是4位的整数,现要求对其进行加密
     *      2.每位数字+5,除以10的余数代替该数字
     *      3.将第一位和第四位进行交换,第二位和第三进行交换
     *      4.将加密的数字输出到控制台
     *
     * 分析:
     *      A:键盘录入4位整数
     *          举例:{4,5,6,7}
     *      B:定义长度为4的数组
     *          int[] arr = new int[4];
     *      C:让数组每个元素进行加密
     *          每位数字+5,除以10的余数代替该数字
     *              arr[i] += 5;
     *                  结果:{9,10,11,12}
     *              arr[i] %=10;
     *                  结果:{9,0,1,2}
     *          将第一位和第四位进行交换,第二位和第三进行交换
     *                  结果:{2,1,0,9}
     *      D:输出到控制台
     * */
    public static void main(String[] args) {
        //键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入4位整数:");
        int num = sc.nextInt();
        //定义数组
        int[] arr = new int[4];
        arr[3] = num%10;
        arr[2] = num/10%10;
        arr[1] = num/10/10%10;
        arr[0] = num/10/10/10%10;

        //对4位数字加密
        int[] resultArr = getEncryption(arr);
        for(int i=0;i<resultArr.length;i++){
            System.out.print(resultArr[i]);
        }
    }
    /**
     * 两个明确:
     *      返回值:int encryption
     *      参数列表:int[] arr
     * */
    public static int[] getEncryption(int[] arr){
        for(int i=0;i<arr.length;i++){
            //循环加密处理
            arr[i] += 5;
            arr[i] %= 10;
        }
        for(int start=0,end=arr.length-1;start<=end;start++,end--){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        return arr;
    }

}
