package com.zzw.test;

import com.zzw.Utils.HibernateUtils;
import com.zzw.domain.Customer;
import com.zzw.domain.LinkMan;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.jupiter.api.Test;

import java.util.List;

public class BatchCrawlingDemo {

    @Test
    /**
     * 获取客户的时候,批量抓取联系人
     * <set name="linkMans" batch-size="4">
     *     batch-size="4" 用于批量抓取 可以优化代码,4表示查询的数据有4条
     * */
    public void test01(){
        Session session = HibernateUtils.getCurrentSession();
        Transaction transaction = session.beginTransaction();

        List<Customer> list = session.createQuery("from Customer").list();
        for(Customer customer : list){
            System.out.println(customer.getCust_name());
            for(LinkMan linkMan : customer.getLinkMans()){
                System.out.println(linkMan.getLkm_name());
            }
        }

        transaction.commit();
    }

    @Test
    /**
     * 获取联系人的时候,批量抓取客户
     *      <many-to-one>上面不能设置batch-size,所以只能在一的一方class上设置 batch-size="4"
     *      <class ... batch-size="4">
     *          batch-size="4" 用于批量抓取 可以优化代码,4表示查询的数据有4条
     * */
    public void test03(){
        Session session = HibernateUtils.getCurrentSession();
        Transaction transaction = session.beginTransaction();

        List<LinkMan> list = session.createQuery("from LinkMan").list();
        for(LinkMan linkMan : list){
            System.out.println(linkMan.getLkm_name());
            System.out.println(linkMan.getCustomer().getCust_name());
        }

        transaction.commit();
    }
}
