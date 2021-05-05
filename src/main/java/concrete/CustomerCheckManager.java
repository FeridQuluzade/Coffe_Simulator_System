package concrete;

import Abstract.CustomerCheckService;
import Abstract.CustomerService;
import model.Customer;

public class CustomerCheckManager implements CustomerCheckService {

    @Override
    public boolean CheckIfRealPerson(Customer customer) {
           return true;
    }
}
