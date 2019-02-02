package com.zzw.demo3;

import javax.annotation.Resource;

/**
 * xml和注解的整合开发
 * */
public class ProductService {

    @Resource(name = "productDao")
    private ProductDao productDao;
    @Resource(name = "orderDao")
    private OrderDao orderDao;

    /*public void setProductDao(ProductDao productDao) {
        this.productDao = productDao;
    }

    public void setOrderDao(OrderDao orderDao) {
        this.orderDao = orderDao;
    }*/

    public void save(){
        System.out.println("ProductService中的save方法执行了...");
        productDao.save();
        orderDao.save();
    }
}
