package com.zzw.ssh.dao.impl;

import com.zzw.ssh.dao.CustomerDao;
import com.zzw.ssh.domain.Customer;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

/**
 * 客户管理的持久层实现类
 * */
@Transactional
public class CustomerDaoImpl extends HibernateDaoSupport implements CustomerDao {

    @Override
    public void save(Customer customer) {
        System.out.println("CustomerDao中save执行了");
        this.getHibernateTemplate().save(customer);
        System.out.println(customer);

    }
}
