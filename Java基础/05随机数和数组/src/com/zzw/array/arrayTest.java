package com.zzw.array;

public class arrayTest {
    public static void main(String[] args) {
        /*
        * 在数组初始化后，每个数组里面的元素都会有一个默认值
        * byte,short,int,long的默认值是0
        * float,double默认值是0.0
        * boolean:false
        * char:'\u0000'
        * 引用类型：null
        * */
        int[] arr1 = new int[2];
        int[] arr2 = new int[3];
        String[] str = new String[1];
        System.out.println(str[0]);

        System.out.println(arr1);
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);

        System.out.println(arr2);
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);
        System.out.println("--------------------------------");
        arr1[0] = 100;
        arr1[1] = 200;
        arr2[0] = 1000;
        arr2[2] = 2000;

        System.out.println(arr1);
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);

        System.out.println(arr2);
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);


    }
}
