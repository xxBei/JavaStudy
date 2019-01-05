package com.zzw.Test;

import com.zzw.Utils.HibernateUtils;
import com.zzw.domin.Role;
import com.zzw.domin.User;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.jupiter.api.Test;

public class demo3 {

    @Test
    /**
     * 用户选择角色
     * */
    public void test1(){
        Session session = HibernateUtils.getCurrentSession();
        Transaction transaction = session.beginTransaction();

        //给1号用户多选一个3号角色
        //查询1号用户
        User user1 = session.get(User.class,1l);
        //查询3号角色
        Role role3 = session.get(Role.class,3l);

        //将用户1添加3号角色
        user1.getRoles().add(role3);


        transaction.commit();
    }

    @Test
    /**
     * 用户改选角色
     * */
    public void test2(){
        Session session = HibernateUtils.getCurrentSession();
        Transaction transaction = session.beginTransaction();

        //将2号用户的2号角色变成1号角色
        //查询2号用户
        User user2 = session.get(User.class,2l);

        //查询2号角色
        Role role2 = session.get(Role.class,2l);

        //查询1号角色
        Role role1 = session.get(Role.class,1l);

        user2.getRoles().remove(role2);
        user2.getRoles().add(role1);

        transaction.commit();
    }

    @Test
    /**
     * 用户删除角色
     * */
    public void test3(){
        Session session = HibernateUtils.getCurrentSession();
        Transaction transaction = session.beginTransaction();

        //删除用户1的2号角色
        //查询用户1
        User user1 = session.get(User.class,1l);

        //查询2号角色
        Role role2 = session.get(Role.class,2l);

        //将2号角色删除
        user1.getRoles().remove(role2);

        transaction.commit();
    }
}
