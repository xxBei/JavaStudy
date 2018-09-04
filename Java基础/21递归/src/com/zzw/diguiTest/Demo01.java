package com.zzw.diguiTest;

/**
 * 递归:
 *      用自身方法调用自身方法
 * */
public class Demo01 {
    public static void main(String[] args) {
        System.out.println(show(5));
    }

    public static int show(int n){
        if(n == 1){
            return 1;
        }else {
            return n * show(n - 1);
        }
    }
}
