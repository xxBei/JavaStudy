package demo1;

import com.zzw.jdbc.demo1.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * 使用 Spring 进行管理 JdbcTemplate 和 DriverManagerDatasource
 *      这种方法,可以减少开发时间和开发成本
 * */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class JdbcDemo2 {

    @Resource(name = "jdbcTemplate")
    private JdbcTemplate jdbcTemplate;

    /**
     * 实现CRUD操作
     * */

    @Test
    //保存方法
    public void test01(){
        jdbcTemplate.update("insert into account value(null,?,?)" , "花花",1000d);
    }

    @Test
    //修改方法
    public void test02(){
        jdbcTemplate.update("update account set name=?,money=? where id=?","章三",2000d,1);
    }

    @Test
    //删除方法
    public void test03(){
        jdbcTemplate.update("delete from account where id = ?",3);
    }

    //查询方法(只能查询某一个字段)
    @Test
    public void test04(){
        String name = jdbcTemplate.queryForObject("select name from account where id = ?",String.class
                ,1);
        System.out.println(name);
    }

    //统计查询
    @Test
    public void test05(){
        long count = jdbcTemplate.queryForObject("select count(*) from account",long.class);
        System.out.println(count);
    }

    //封装到对象
    @Test
    public void test06(){
        Account account = jdbcTemplate.queryForObject("select * from account where id = ?",
                new MyRowmapper(), 1);
        System.out.println(account);
    }

    //封装到对象查询多条记录
    @Test
    public void test07(){
        List<Account> list = jdbcTemplate.query("select * from account",new MyRowmapper());
        for (Account account : list) {
            System.out.println(account);
        }
    }

    class MyRowmapper implements RowMapper<Account> {

        @Override
        public Account mapRow(ResultSet resultSet, int i) throws SQLException {
            Account account = new Account();
            account.setId(resultSet.getInt("id"));
            account.setName(resultSet.getString("name"));
            account.setMoney(resultSet.getDouble("money"));
            return account;
        }
    }

}
