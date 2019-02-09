package demo1;

import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class JdbcDemo1 {

    /**
     * 这种方法比较麻烦
     *      只要连接数据库就要,从新创建连接池和JDBCTemplate对象
     *      简单方法:
     *          将创建对象交给Spring进行管理
     * */
    @Test
    public void test01(){
        //创建连接池
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://127.0.0.1:3306/springdemo3_jdbc?useSSL=false" +
                "&serverTimezone=UTC");
        dataSource.setUsername("root");
        dataSource.setPassword("root");
        //创建JDBC模板
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        jdbcTemplate.update("insert into account value(null,?,?) ","张三",1000d);
    }

}
