package com.zzw.Test;

import com.zzw.Utils.HibernateUtils;
import com.zzw.domin.Customer;
import com.zzw.domin.Linkman;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.jupiter.api.Test;


public class demo1 {

    @Test
    public void demo1(){
        Session session = HibernateUtils.getCurrentSession();
        Transaction transaction = session.beginTransaction();

        //创建客户
        Customer customer1 = new Customer();
        Customer customer2 = new Customer();
        customer1.setCust_name("刘冰");
        customer2.setCust_name("武松");

        //创建联系人
        Linkman linkman1 = new Linkman();
        Linkman linkman2 = new Linkman();
        Linkman linkman3 = new Linkman();
        linkman1.setLkm_name("武大郎");
        linkman2.setLkm_name("宋江");
        linkman3.setLkm_name("鲁智深");

        //设置关系
        linkman1.setCustomer(customer1);//linkman1属于customer1客户
        linkman2.setCustomer(customer1);//linkman2属于customer1客户
        linkman3.setCustomer(customer2);//linkman3属于customer2客户
        customer1.getLinkmans().add(linkman1);
        customer1.getLinkmans().add(linkman2);
        customer2.getLinkmans().add(linkman3);

        //保存数据
        session.save(linkman1);
        session.save(linkman2);
        session.save(linkman3);
        session.save(customer1);
        session.save(customer2);

        transaction.commit();
    }
}
