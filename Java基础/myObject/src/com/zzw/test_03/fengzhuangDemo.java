package com.zzw.test_03;

import java.util.Scanner;

public class fengzhuangDemo {
    public static void main(String[] args) {
        Fengzhuang fz = new Fengzhuang();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你喜欢的品牌");
        String brand = sc.nextLine();
        System.out.println("请输入你喜欢的颜色");
        String color = sc.nextLine();

        fz.setBrand(brand);
        fz.setColor(color);
        fz.setPrice(2699);

        System.out.println("品牌:"+fz.getBrand()+",颜色:"+fz.getColor()+",价格:"+fz.getPrice());
    }
}
