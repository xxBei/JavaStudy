package com.zzw.domin;

import java.util.HashSet;
import java.util.Set;

public class Customer {
    //客户编号
    private Long cust_id;
    //客户名称(公司名称)
    private String cust_name;
    //客户信息来源
    private String cust_source;
    //客户所属行业
    private String cust_industry;
    //客户级别
    private String cust_level;
    //固定电话
    private String cust_phone;
    //移动电话
    private String cust_mobile;

    /*一个客户对应多个联系人*/
    /*放置的是多的一方的集合,hibernate默认Set集合.*/
    private Set<Linkman> linkmans = new HashSet<>();

    public Set<Linkman> getLinkmans() {
        return linkmans;
    }

    public void setLinkmans(Set<Linkman> linkmans) {
        this.linkmans = linkmans;
    }

    public Long getCust_id() {
        return cust_id;
    }

    public void setCust_id(Long cust_id) {
        this.cust_id = cust_id;
    }

    public String getCust_name() {
        return cust_name;
    }

    public void setCust_name(String cust_name) {
        this.cust_name = cust_name;
    }

    public String getCust_source() {
        return cust_source;
    }

    public void setCust_source(String cust_source) {
        this.cust_source = cust_source;
    }

    public String getCust_industry() {
        return cust_industry;
    }

    public void setCust_industry(String cust_industry) {
        this.cust_industry = cust_industry;
    }

    public String getCust_level() {
        return cust_level;
    }

    public void setCust_level(String cust_level) {
        this.cust_level = cust_level;
    }

    public String getCust_phone() {
        return cust_phone;
    }

    public void setCust_phone(String cust_phone) {
        this.cust_phone = cust_phone;
    }

    public String getCust_mobile() {
        return cust_mobile;
    }

    public void setCust_mobile(String cust_mobile) {
        this.cust_mobile = cust_mobile;
    }

}