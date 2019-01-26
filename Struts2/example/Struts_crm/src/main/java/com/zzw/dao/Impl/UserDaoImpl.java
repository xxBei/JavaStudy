package com.zzw.dao.Impl;

import com.zzw.Utils.HibernateUtils;
import com.zzw.dao.UserDao;
import com.zzw.domain.User;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;


public class UserDaoImpl implements UserDao {

    @Override
    public User Login(User user) {
        Session session = HibernateUtils.getCurrentSession();
        Transaction transaction = session.beginTransaction();

        String username = user.getUser_name();
        String password = user.getUser_password();

        String hql = "from User where user_name=?0 and user_password=?1";
        Query query = session.createQuery(hql);
        query.setParameter(0,username);
        query.setParameter(1,password);

        List<User> list = query.list();

        for(User user1 : list){
            System.out.println("UserDao:"+user.getUser_name()+"---"+user.getUser_password());
        }

        if(list.size()>0){
            return list.get(0);
        }

        transaction.commit();
        return null;
    }
}
