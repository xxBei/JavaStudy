package com.zzw.tx.demo3;

import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Transactional
public class AccountServiceImpl implements AccountService{

    @Resource(name = "accountDao3")
    private AccountDaoImpl accountDao;

    @Override
    public void transfer(String from, String to, Double money) {
        accountDao.fromMoney(from,money);
        //int i = 10/0;
        accountDao.toMoney(to,money);
    }
}
