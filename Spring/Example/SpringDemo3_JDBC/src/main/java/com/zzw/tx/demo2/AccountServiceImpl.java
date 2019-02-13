package com.zzw.tx.demo2;

public class AccountServiceImpl implements AccountService{

    private AccountDaoImpl accountDao2;

    public void setAccountDao(AccountDaoImpl accountDao) {
        this.accountDao2 = accountDao;
    }

    @Override
    public void transfer(String from, String to, Double money) {
        accountDao2.outMoney(from,money);
       // int i = 10/0;
        accountDao2.inMoney(to,money);
    }
}
