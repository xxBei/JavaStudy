package com.zzw.dao;

import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.ParameterMetaData;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class commonUpdate {

    @Test
    public void test(){

        //增加数据
        //update1("insert into bank values(null,?,?)","赵子龙",1000);

        //修改数据
        //update1("update bank set name=?,money=? where id=?","赵子龙",1500,7);

        //删除数据
        //update1("delete from bank where id=?",1);

        //增加数据  ,   由于该方法判断的是问号(占位符),所以不会提示错误
        update2("insert into bank values(null,?,?)","曹操",5000,10,11,12);

    }
    /**
     *  对数据库的增删改的通用方法,不过此方法没有使用DBUtils
     *  注意:
     *      由于调用update1的时候,参数是自己填写的,如果参数填写过多会导致出错,所以此方法不如update2
     * ... 表示多个参数
     * @param sql 用于接收sql语句
     * @param args 用于接收多个参数,这里的参数是指SQL语句中的 ?
     * */
    public void update1(String sql, Object ...args){
        Connection conn = null;
        PreparedStatement ps = null;

        try {
            conn = JDBCUtils.getConnection();
            ps = conn.prepareStatement(sql);
            for(int i=0;i<args.length;i++){
                ps.setObject(i+1,args[i]);
            }
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                JDBCUtils.getConnection().close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     *
     * 此方法和上面方法一样,区别在于,此方法获取参数时,获取的是由多少个问号(占位符)
     * */
    public void update2(String sql,Object ... args){
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = JDBCUtils.getConnection();
            ps = conn.prepareStatement(sql);

            //元数据
            //获取到传递来的有几个问号,占位符
            ParameterMetaData metaData = ps.getParameterMetaData();
            int count = metaData.getParameterCount();
            for(int i=0;i<count;i++){
                ps.setObject(i+1,args[i]);
            }
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                JDBCUtils.getConnection().close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


    }
}
