package CustomerTest;

import com.zzw.domain.Customer;
import com.zzw.service.CustomerService;
import com.zzw.service.Impl.CustomerServiceImpl;
import org.junit.Test;


import java.util.List;

public class Test01 {
    @Test
    public void testFind(){
        CustomerService service = new CustomerServiceImpl();
        List<Customer> list = service.find();
        for (Customer c : list) {
            System.out.println(c.getCust_name()+":"+c.getCust_industry());
        }
    }
}
