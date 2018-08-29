package com.zzw.array;

public class arrayTest2 {
    public static void main(String[] args) {
        int[] arr1 = new int[2];

        arr1[0] = 100;
        arr1[1] = 200;
        System.out.println(arr1);
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println("------------");

        int[] arr2 = arr1;
        arr2[0] = 111;
        arr2[1] = 222;
        System.out.println(arr1);
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);

        System.out.println(arr2);
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
    }

}
