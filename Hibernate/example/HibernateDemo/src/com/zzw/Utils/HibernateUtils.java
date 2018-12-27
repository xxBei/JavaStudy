package com.zzw.Utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * 抽取工具类
 * */
public class HibernateUtils {

    public static Configuration cfg;
    public static SessionFactory sf;

    static {
        //1.加载Hibernate的核心配置文件
        cfg = new Configuration().configure();
        //2.创建SessionFactory对象: 类似于JDBC连接池
        sf = cfg.buildSessionFactory();
    }

    //3.通过SessionFactory获取Session对象: 类似于JDBCConnection
    public static Session openSession(){
        return sf.openSession();
    }
}
