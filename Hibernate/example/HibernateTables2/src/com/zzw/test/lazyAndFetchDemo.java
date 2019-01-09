package com.zzw.test;

import com.zzw.Utils.HibernateUtils;
import com.zzw.domain.Customer;
import com.zzw.domain.LinkMan;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.jupiter.api.Test;

import javax.persistence.criteria.CriteriaQuery;
import java.util.List;

public class lazyAndFetchDemo {

    @Test
    /**
     * 默认情况
     * 不在set 里面写 fetch 和 lazy 的情况
     * */
    public void test01(){
        Session session = HibernateUtils.getCurrentSession();
        Transaction transaction = session.beginTransaction();

        Customer customer = session.get(Customer.class,1l);
        System.out.println(customer.getCust_name());

        for(LinkMan linkMan : customer.getLinkMans()){
            System.out.println(linkMan.getLkm_name());
        }

        transaction.commit();
    }

    @Test
    /**
     * 设置set 里面写 fetch="select" 和 lazy="true" 的情况
     * <set name="linkMans" fetch="select" lazy="true">
     * 和默认情况一样
     * */
    public void test02(){
        Session session = HibernateUtils.getCurrentSession();
        Transaction transaction = session.beginTransaction();

        Customer customer = session.get(Customer.class,1l);
        System.out.println(customer.getCust_name());

        for(LinkMan linkMan : customer.getLinkMans()){
            System.out.println(linkMan.getLkm_name());
        }

        transaction.commit();
    }

    @Test
    /**
     * 设置set 里面写 fetch="select" 和 lazy="false" 的情况
     * <set name="linkMans" fetch="select" lazy="false">
     * 会直接发送两条sql查询
     * */
    public void test03(){
        Session session = HibernateUtils.getCurrentSession();
        Transaction transaction = session.beginTransaction();

        Customer customer = session.get(Customer.class,1l);//在这里会直接发送两条查询语句
        System.out.println(customer.getCust_name());

        for(LinkMan linkMan : customer.getLinkMans()){
            System.out.println(linkMan.getLkm_name());
        }

        transaction.commit();
    }

    @Test
    /**
     * 设置set 里面写 fetch="select" 和 lazy="extra" 的情况
     * <set name="linkMans" fetch="select" lazy="extra">
     * 会直接发送两条sql查询
     * */
    public void test04(){
        Session session = HibernateUtils.getCurrentSession();
        Transaction transaction = session.beginTransaction();

        Customer customer = session.get(Customer.class,1l);//发送一条查询1号客户的SQL语句
        System.out.println(customer.getCust_name());

        System.out.println(customer.getLinkMans().size());//发送一条select count() from ... 语句

        transaction.commit();
    }

    @Test
    /**
     * 设置set 里面写 fetch="join" lazy里面无论写什么都不会生效
     * <set name="linkMans" fetch="join" lazy="true/false/extra">
     * 会直接发送两条sql查询
     * */
    public void test05(){
        Session session = HibernateUtils.getCurrentSession();
        Transaction transaction = session.beginTransaction();

        Customer customer = session.get(Customer.class,1l);//这里会发送一个迫切左外连接查询记录
        System.out.println(customer.getCust_name());

        System.out.println(customer.getLinkMans().size());//上面查完之后,下面不会再执行查询语句
        transaction.commit();
    }

    @Test
    /**
     * 设置set 里面写 fetch="subselect" lazy="true"
     * <set name="linkMans" fetch="subselect" lazy="true">
     * 只会在用的时候查询语句
     * */
    public void test06(){
        Session session = HibernateUtils.getCurrentSession();
        Transaction transaction = session.beginTransaction();

         List<Customer> list = session.createQuery("from Customer").list();//先查询一次cst_customer1
         for(Customer customer : list){
             System.out.println(customer.getCust_name());
             System.out.println(customer.getLinkMans().size());//在查询一次查询子查询语句
         }

        transaction.commit();
    }

    @Test
    /**
     * 设置set 里面写 fetch="subselect" lazy="false"
     * <set name="linkMans" fetch="subselect" lazy="false">
     * 只会在用的时候查询语句
     * */
    public void test07(){
        Session session = HibernateUtils.getCurrentSession();
        Transaction transaction = session.beginTransaction();

        List<Customer> list = session.createQuery("from Customer").list();//直接查询两次语句
        for(Customer customer : list){
            System.out.println(customer.getCust_name());
            System.out.println(customer.getLinkMans().size());
        }

        transaction.commit();
    }
}
