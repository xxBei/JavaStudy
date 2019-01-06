package com.zzw.Utils;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hibernate工具类
 * */
public class HibernateUtils {

    public static final Configuration cfg;
    public static final SessionFactory sf;

    static {
        cfg = new Configuration().configure();
        sf = cfg.buildSessionFactory();
    }

    public static Session onpenSession(){
        return sf.openSession();
    }

    public static Session getCurrentSession(){
        return sf.getCurrentSession();
    }
}
