package com.zzw.tx.demo1;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * 持久的转账操作
 * */
public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao{

    /* 下面方法比较麻烦,可以继承JdbcDaoSupport,
    JdbcDaoSupport 这个类里面提供了 set方法
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }*/

    @Override
    public void outMoney(String form, Double money) {
        this.getJdbcTemplate().update("update account set money = money - ? where name = ?" ,
                money,form);
    }

    @Override
    public void inMoney(String to, Double money) {
        this.getJdbcTemplate().update("update account set money = money + ? where name = ?" ,
                money,to);
    }
}
