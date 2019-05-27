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


import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class UserTest {

    InputStream in;
    SqlSessionFactory factory;
    SqlSession session;
    UserDao userDao;

    @Before
    public void init() throws Exception {
        in = Resources.getResourceAsStream("SqlMapConfig.xml");
        factory = new SqlSessionFactoryBuilder().build(in);
        session = factory.openSession();
        userDao = session.getMapper(UserDao.class);
    }


    @After
    public void destroy() throws Exception{
        session.commit();
        session.close();
        in.close();
    }

    @Test
    public void findAllTest(){
        List<User> list = userDao.findAll();
        for (User user : list) {
            System.out.println(user);
        }
    }

    @Test
    public void findAllByName(){
        List<User> list = userDao.findAllByName("%李%");
        for (User user : list) {
            System.out.println(user);
        }
    }

    @Test
    public void findInfoByName(){
        User user = new User();
        user.setUser_name("张三");
        List<User> info = userDao.findInfoByName(user);
        for (User u : info ) {
            System.out.println(u);
        }
    }

    @Test
    public void findOtherInfoById(){
        QueryVo queryVo = new QueryVo();
        List<Integer> ids = new ArrayList<Integer>();
        ids.add(1);
        ids.add(2);
        ids.add(4);
        ids.add(6);
        queryVo.setIds(ids);
        List<User> info = userDao.findOtherInfoById(queryVo);
        for (User u: info) {
            System.out.println(u);
        }

    }

}










