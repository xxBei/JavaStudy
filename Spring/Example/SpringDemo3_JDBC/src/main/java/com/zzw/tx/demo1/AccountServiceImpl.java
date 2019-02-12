package com.zzw.tx.demo1;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

import javax.annotation.Resource;

/**
 * 转账的业务层的实现类
 * */
public class AccountServiceImpl implements AccountService{

    //@Resource(name = "accountDao")
    private AccountDaoImpl accountDao;

    public void setAccountDao(AccountDaoImpl accountDao) {
        this.accountDao = accountDao;
    }

    private TransactionTemplate transactionTemplate;

    public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
        this.transactionTemplate = transactionTemplate;
    }
    /**
     * 下面这种事物方式比较麻烦,了解即可
     * */
    @Override
    public void transfer(final String from, final String to, final Double money) {
        transactionTemplate.execute(new TransactionCallbackWithoutResult() {
            @Override
            protected void doInTransactionWithoutResult(TransactionStatus transactionStatus) {
                accountDao.outMoney(from,money);
                //int i = 10/0;
                accountDao.inMoney(to,money);
            }
        });
    }
}
