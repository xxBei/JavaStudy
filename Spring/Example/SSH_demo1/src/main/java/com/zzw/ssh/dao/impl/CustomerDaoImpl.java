package com.zzw.ssh.dao.impl;

import com.zzw.ssh.dao.CustomerDao;
import com.zzw.ssh.domain.Customer;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 客户管理的持久层实现类
 * */
@Transactional//事务注解
public class CustomerDaoImpl extends HibernateDaoSupport implements CustomerDao {

    /**
     * 新增客户
     * */
    @Override
    public void save(Customer customer) {
        System.out.println("CustomerDao中save执行了");
        this.getHibernateTemplate().save(customer);
        System.out.println(customer);

    }

    /**
     * 执行查询方法
     * */
    @Override
    public List<Customer> findAll() {
        System.out.println("CustomerDao中findAll执行了");
        //List<Customer> list = (List<Customer>) this.getHibernateTemplate().find("from Customer ");
        HibernateTemplate hibernateTemplate = this.getHibernateTemplate();
        DetachedCriteria criteria = DetachedCriteria.forClass(Customer.class);
        List<Customer> list = (List<Customer>) hibernateTemplate.findByCriteria(criteria);
        return list;
    }
}
