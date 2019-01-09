package com.zzw.test;

import com.zzw.Utils.HibernateUtils;
import com.zzw.domain.LinkMan;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.jupiter.api.Test;

public class mToOneFetchLazy {

    @Test
    /**
     * 默认情况下
     * */
    public void test01(){
        Session session = HibernateUtils.getCurrentSession();
        Transaction transaction = session.beginTransaction();

        LinkMan linkMan = session.get(LinkMan.class,1l);//先select查询cst_linkman1
        System.out.println(linkMan.getLkm_name());
        System.out.println(linkMan.getCustomer().getCust_name());//在查询联系人对用的客户名称

        transaction.commit();
    }

    @Test
    /**
     * 设置fetch="select" lazy="proxy"
     * <many-to-one fetch="select" lazy="proxy"></many-to-one>
     * */
    public void test02(){
        Session session = HibernateUtils.getCurrentSession();
        Transaction transaction = session.beginTransaction();

        LinkMan linkMan = session.get(LinkMan.class,1l);//先select查询cst_linkman1
        System.out.println(linkMan.getLkm_name());
        System.out.println(linkMan.getCustomer().getCust_name());//在查询联系人对用的客户名称

        transaction.commit();
    }

    @Test
    /**
     * 设置fetch="select" lazy="false"
     * <many-to-one fetch="select" lazy="false"></many-to-one>
     * */
    public void test03(){
        Session session = HibernateUtils.getCurrentSession();
        Transaction transaction = session.beginTransaction();

        LinkMan linkMan = session.get(LinkMan.class,1l);//先select查询cst_linkman1,在查询联系人对用的客户名称
        System.out.println(linkMan.getLkm_name());
        System.out.println(linkMan.getCustomer().getCust_name());

        transaction.commit();
    }

    @Test
    /**
     * 左外迫切外连接
     * 设置fetch="join" lazy="false/proxy" lazy会失效
     * <many-to-one fetch="join" lazy="false/proxy"></many-to-one>
     * */
    public void test04(){
        Session session = HibernateUtils.getCurrentSession();
        Transaction transaction = session.beginTransaction();

        LinkMan linkMan = session.get(LinkMan.class,1l);//发送迫切左外连接,一次性全部查清
        System.out.println(linkMan.getLkm_name());
        System.out.println(linkMan.getCustomer().getCust_name());//不发送语句

        transaction.commit();
    }
}
