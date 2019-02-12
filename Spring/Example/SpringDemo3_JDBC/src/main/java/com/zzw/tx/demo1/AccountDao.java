package com.zzw.tx.demo1;

public interface AccountDao {

    //转出
    public void outMoney(String form,Double money);

    //转入
    public void inMoney(String to,Double money);
}
