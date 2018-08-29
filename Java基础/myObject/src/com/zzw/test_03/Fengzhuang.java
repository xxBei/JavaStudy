package com.zzw.test_03;

/**
 * 定义一个手机类
 */

public class Fengzhuang {
    //成员变量
    private String color;
    private int price;
    private String brand;

    //成员方法
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
