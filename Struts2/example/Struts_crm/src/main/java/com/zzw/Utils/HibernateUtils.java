package com.zzw.Utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernateUtils {
    public static Configuration cfg;
    public static SessionFactory sf;

    static {
        cfg = new Configuration().configure();
        sf = cfg.buildSessionFactory();
    }
    public static Session openSession(){
        return sf.openSession();
    }

    public static Session getCurrentSession(){
        return sf.getCurrentSession();
    }
}
