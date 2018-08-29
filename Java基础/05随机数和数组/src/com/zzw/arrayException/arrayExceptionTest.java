package com.zzw.arrayException;

public class arrayExceptionTest {
    public static void main(String[] args) {
        /*
        * 数组常见问题：
        *   ArrayIndexOutOfBoundsException：数组索引越界异常
        *       产生的原因：访问了不存在的索引。
        *   NullPointerException：空指针异常
        *       产生的原因：数组已经不在指向堆内存的数据了，却还在使用数组名去访问元素。
        *       数组名其实是指向了堆内存里面实例化的对象数组的一个地址，如果给他赋值为null,意味着
        *       数组名已经不在指定这个地址了，再去使用数组名访问数组元素，是找不到的。
        * */

        int[] arr = {1,2,3};
        // 下面代码会报错，显示数组索引越界异常
        // System.out.println(arr[3]);

        //下面代码会报空指针异常错误
        // arr = null;
        // System.out.println(arr[0]);
    }
}
