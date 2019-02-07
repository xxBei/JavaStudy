package com.zzw.demo1.impl;

import com.zzw.demo1.ProductDao;

public class ProductDaoImpl implements ProductDao {
    @Override
    public void save() {
        System.out.println("ProductDaoImpl的save方法执行了...");
    }

    @Override
    public void delete() {
        System.out.println("ProductDaoImpl的delete方法执行了...");
    }

    @Override
    public void update() {
        System.out.println("ProductDaoImpl的update方法执行了...");
    }

    @Override
    public void find() {
        System.out.println("ProductDaoImpl的find方法执行了...");
    }
}
