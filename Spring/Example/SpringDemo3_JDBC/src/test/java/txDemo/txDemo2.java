package txDemo;

import com.zzw.tx.demo2.AccountServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:tx2.xml")
public class txDemo2 {

    @Resource(name = "accountService")
    private AccountServiceImpl accountService;

    @Test
    public void test02(){
        accountService.transfer("章三","李四",100d);
    }
}
