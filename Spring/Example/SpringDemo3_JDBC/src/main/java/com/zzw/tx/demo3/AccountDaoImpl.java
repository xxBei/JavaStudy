package com.zzw.tx.demo3;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {

    @Override
    public void fromMoney(String form, Double money) {
        this.getJdbcTemplate().update("update account set money = money - ? where name = ?",money
                ,form);
    }

    @Override
    public void toMoney(String to, Double money) {
        this.getJdbcTemplate().update("update account set money = money + ? where name = ?",money
                ,to);
    }
}
