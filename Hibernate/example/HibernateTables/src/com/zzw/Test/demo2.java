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

}
