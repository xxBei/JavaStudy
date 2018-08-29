package com.zzw.Phone;

/**
 * 需求:
 *      创键一个手机工厂,可以开发各个品牌手机打电话功能
 *
 *分析:
 *      共性:
 *           手机打电话
 *
 * */
public class Test {
    public static void main(String[] args) {
        Factory factory = new Factory();
        factory.createPhone(new RedMi());
        factory.createPhone(new MiNote());
    }
}
