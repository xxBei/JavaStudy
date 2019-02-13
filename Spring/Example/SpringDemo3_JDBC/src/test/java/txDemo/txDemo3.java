package txDemo;

import com.zzw.tx.demo3.AccountServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:tx3.xml")
public class txDemo3 {

    @Resource(name = "accountService3")
    private AccountServiceImpl accountService;

    @Test
    public void test01(){
        accountService.transfer("章三","李四",100d);
    }
}
