package com.zzw.twoArray;

public class twoArrayTest {
    public static void main(String[] args) {
        /*
        * 二维数组
        * 二维数组配合索引可以获取一维数组
        * 一维数组配合索引可以获取数组中的元素
        * */

        int[][] arr = {{1,2,3},{4,5,6},{10,11,50}};
        // 遍历数组
        for(int i=0; i<arr.length; i++){
            for (int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

}
