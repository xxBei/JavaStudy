package com.zzw.spring.test1;

public class Car1 {

    private String name;
    private Double price;

    public Car1(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car1{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
