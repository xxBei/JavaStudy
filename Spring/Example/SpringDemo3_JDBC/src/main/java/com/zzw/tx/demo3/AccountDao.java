package com.zzw.tx.demo3;

public interface AccountDao {
    public void fromMoney(String form,Double money);
    public void toMoney(String to,Double money);
}
