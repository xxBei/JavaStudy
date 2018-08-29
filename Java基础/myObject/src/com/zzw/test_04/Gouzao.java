package com.zzw.test_04;

public class Gouzao {
    /**
     * 创建手机类
     *
     * */
    //成员变量
    private String brand;
    private String color;
    private int price;


    //无参构造函数
    public Gouzao(){}
    //有参构造函数
    public Gouzao(String brand,String color,int price){
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    //成员方法
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
