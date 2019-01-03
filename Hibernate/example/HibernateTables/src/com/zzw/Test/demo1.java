package com.zzw.Test;

import com.zzw.Utils.HibernateUtils;
import com.zzw.domin.Customer;
import com.zzw.domin.Linkman;
import com.zzw.domin2.Student;
import com.zzw.domin2.Teacher;
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

    @Test
    public void demo2(){
        Session session = HibernateUtils.getCurrentSession();
        Transaction transaction = session.beginTransaction();

        //创建学生
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        //创建教师
        Teacher teacher1 = new Teacher();
        Teacher teacher2 = new Teacher();

        student1.setSname("刘备");
        student2.setSname("张飞");
        student3.setSname("关羽");

        teacher1.setTname("诸葛亮");
        teacher2.setTname("曹操");

        student1.setTeacher(teacher1);
        student2.setTeacher(teacher1);
        student3.setTeacher(teacher2);
        teacher1.getStudents().add(student1);
        teacher1.getStudents().add(student2);
        teacher2.getStudents().add(student3);


        session.save(student1);
        session.save(student2);
        session.save(student3);
        session.save(teacher1);
        session.save(teacher2);

        transaction.commit();
    }

    @Test
    /**
     * 级联保存或更新操作,级联表示,在操作一个的同时,要不要修改其他的东西
     * 保存客户级联联系人,操作的主题是客户,所以对 Customer.hbm.xml进行配置
     * <set name="linkmans" cascade="save-update">
     * */
    public void demo3(){
        Session session = HibernateUtils.getCurrentSession();
        Transaction transaction = session.beginTransaction();

        Customer customer = new Customer();
        customer.setCust_name("曹植");

        Linkman linkman = new Linkman();
        linkman.setLkm_name("曹操");


        customer.getLinkmans().add(linkman);
        linkman.setCustomer(customer);

        session.save(customer);

        transaction.commit();
    }

    @Test
    /**
     * 级联保存或更新操作,级联表示,在操作一个的同时,要不要修改其他的东西
     * 保存联系人级联客户,操作的主题是联系人,所以对 Linkman.hbm.xml进行配置
     * <many-to-one name="customer" cascade="save-update" column="lkm_cust_id"
     *                      class="com.zzw.domin.Customer">
     * </many-to-one>
     * */
    public void demo4(){
        Session session = HibernateUtils.getCurrentSession();
        Transaction transaction = session.beginTransaction();

        Customer customer = new Customer();
        customer.setCust_name("曹植");

        Linkman linkman = new Linkman();
        linkman.setLkm_name("曹操");


        customer.getLinkmans().add(linkman);
        linkman.setCustomer(customer);

        session.save(linkman);

        transaction.commit();
    }
}
