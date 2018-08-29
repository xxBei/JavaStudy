package com.zzw.test_04;

public class gouzaoDemo {
    public static void main(String[] args) {
        //无参构造方法+setXxx()
        Gouzao gz = new Gouzao();
        gz.setBrand("华为");
        gz.setColor("土豪金");
        gz.setPrice(2999);

        System.out.println("品牌:"+gz.getBrand()+",颜色:"+gz.getColor()+",价格:"+gz.getPrice());
        System.out.println("-------------------------");

        //有参构造方法
        Gouzao gz1 = new Gouzao("OPPO","玫瑰金",3699);
        System.out.println("品牌:"+gz1.getBrand()+",颜色"+gz1.getColor()+",价格:"+gz1.getPrice());
    }
}
