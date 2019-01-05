package com.zzw.Test;

import com.zzw.Utils.HibernateUtils;
import com.zzw.domin.Role;
import com.zzw.domin.User;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.jupiter.api.Test;

/**
 * Hibernate多对多的映射
 * */
public class demo2 {

    @Test
    public void test01(){
        Session session = HibernateUtils.getCurrentSession();
        Transaction transaction = session.beginTransaction();

        //创建两个用户
        User user1 = new User();
        user1.setUser_name("张三");
        User user2 = new User();
        user2.setUser_name("李四");

        //创建三个角色
        Role role1 = new Role();
        role1.setRole_name("鲁班");
        Role role2 = new Role();
        role2.setRole_name("伽罗");
        Role role3 = new Role();
        role3.setRole_name("后羿");

        //设置双向关联关系
        user1.getRoles().add(role1);//张三喜欢玩鲁班
        user1.getRoles().add(role2);//张三喜欢玩伽罗
        user2.getRoles().add(role1);
        user2.getRoles().add(role3);
        role1.getUsers().add(user1);//鲁班被张三玩
        role1.getUsers().add(user2);//鲁班被李四玩
        role2.getUsers().add(user1);
        role3.getUsers().add(user2);

        //保存操作:多对多建立双向的关系必须有一方放弃外键维护权,一般由被动放放弃(角色实体)
        session.save(user1);
        session.save(user2);
        session.save(role1);
        session.save(role2);
        session.save(role3);

        transaction.commit();
    }

    @Test
    /**
     * 删除用户级联删除角色（不常用）
     * <set name="roles" table="sys_user_role" cascade="save-update,delete">
     * */
    public void test02(){
        Session session = HibernateUtils.getCurrentSession();
        Transaction transaction = session.beginTransaction();

       User user = session.get(User.class,10l);
       session.delete(user);

        transaction.commit();
    }

    /**
     * 删除角色级联删除用户
     * <set name="users" table="sys_user_role" cascade="save-update,delete">
     * */
    @Test
    public void Test05(){
        Session session = HibernateUtils.getCurrentSession();
        Transaction transaction = session.beginTransaction();

        Role role = session.get(Role.class,17l);
        session.delete(role);

        transaction.commit();

    }

    @Test
    /**
     * 保存用户级联保存角色
     * <set name="roles" table="sys_user_role" cascade="save-update">
     * */
    public void test03(){
        Session session = HibernateUtils.getCurrentSession();
        Transaction transaction = session.beginTransaction();

        User user = new User();
        user.setUser_name("刘武");

        Role role = new Role();
        role.setRole_name("诸葛亮");

        //设置双向关系
        user.getRoles().add(role);
        role.getUsers().add(user);

        session.save(user);

        transaction.commit();
    }

    @Test
    public void test04(){
        Session session = HibernateUtils.getCurrentSession();
        Transaction transaction = session.beginTransaction();

        User user = new User();
        user.setUser_name("李玖");

        Role role = new Role();
        role.setRole_name("夏侯惇");

        user.getRoles().add(role);
        role.getUsers().add(user);

        session.save(role);

        transaction.commit();
    }


}
