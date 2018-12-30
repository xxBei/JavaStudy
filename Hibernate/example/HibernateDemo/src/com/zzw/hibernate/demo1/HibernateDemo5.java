package com.zzw.hibernate.demo1;

import com.zzw.Utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.jupiter.api.Test;

public class HibernateDemo5 {

    @Test
    /*测试当前线程绑定的Session*/
    public void test01(){
        //获取session对象(这个里面的session都是唯一的)
        Session session = HibernateUtils.getCurrentSession();
        Transaction transaction = session.beginTransaction();

        Customer customer = new Customer();
        customer.setCust_name("王昭君");
        session.save(customer);

        transaction.commit();
        //注意这里不需要session.close();线程结束会自动结束
    }
}
