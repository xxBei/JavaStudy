package txDemo;

import com.zzw.tx.demo1.AccountServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * 测试转账环境
 * */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:tx.xml")
public class txDemo1 {

    @Resource(name = "accountService")
    private AccountServiceImpl accountService;

    @Test
    public void test01(){
        accountService.transfer("章三","李四",100d);
    }

}
