package com.zzw.test;

import com.zzw.dao.UserDao;
import com.zzw.domain.QueryVo;
import com.zzw.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class myBatisTest {

    private InputStream in;
    private SqlSession session;
    private UserDao userDao;

    /**
     * 将读取文件和创建SqlSession初始化时加载完毕
     * */
    @Before
    public void init() throws Exception{
        //读取配置文件
        in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建SqlSessionFactory工厂
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //开启Session
        session = factory.openSession();
        //使用SqlSection创建Dao的动态接口代理
        userDao = session.getMapper(UserDao.class);
    }

    /**
     * 在结束是关闭资源
     * */
    @After
    public void destroy() throws Exception {
        //事物提交
        session.commit();
        session.close();
        in.close();
    }

    /**
     * 查询所有信息
     * */
    @Test
    public void findAll() {
        List<User> list = userDao.findAll();
        for (User user: list) {
            System.out.println(user);
        }
    }

    /**
     * 插入信息
     * */
    @Test
    public void saveTest(){
        User user = new User();
        user.setUser_name("李时珍");
        user.setUser_password("zzz123");

        //调用UserDao中的插入方法
        userDao.insertInfo(user);

    }

    /**
     * 更新信息
     * */
    @Test
    public void updateTest(){
        User user = new User();
        user.setId(3);//根据id修改数据
        user.setUser_name("雷蛇");
        user.setUser_password("abcdef");
        System.out.println(user);
        userDao.updateInfo(user);
    }

    /**
     * 根据id删除信息
     * */
    @Test
    public void deleteByIdTest(){
        //将id=3传入,删除id=3的数据
        userDao.deleteInfoById(3);
    }

    /**
     * 根据id查询信息
     * */
    @Test
    public void findOneById(){
        User user = userDao.findInfoById(2);
        System.out.println(user);
    }

    /**
     * 根据姓名模糊查询
     * */
    @Test
    public void findInfoByName(){
        List<User> users = userDao.findInfoByName("%李%");
        System.out.println(users);
    }

    /**
     * 查询用户总数
     * */
    @Test
    public void findCountUser(){
        Integer total = userDao.findCountUser();
        System.out.println("用户个数:"+total);
    }


    /**
     * 查询插入的id名
     * */
    @Test
    public void findAllGetID(){
        User user = new User();
        user.setUser_name("章毅");
        user.setUser_password("111222");
        System.out.println("保存前:"+user);
        userDao.findAllGetID(user);
        System.out.println("保存后:"+user);

    }

    /**
     * 根据 QueryVo对象中封装的User 进行模糊查询
     * */
    @Test
    public void findNameByQueryVo(){
        QueryVo queryVo = new QueryVo();
        User user = new User();
        user.setUser_name("%李%");
        queryVo.setUser(user);

        List<User> users = userDao.findUserByQueryVo(queryVo);
        for (User userList :users ) {
            System.out.println(userList);
        }

    }
}
