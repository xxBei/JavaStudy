package com.zzw.danli;

public class DanliTest {

    /**
     * 运行可以看出,在内存中存在的都是同一个地址
     * */
    public static void main(String[] args) {
        System.out.println("1"+Danli.getInstance());
        System.out.println("2"+Danli.getInstance());
        System.out.println("3"+Danli.getInstance());
    }
}
