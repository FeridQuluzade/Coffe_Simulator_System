package concrete;

import Abstract.CustomerCheckService;
import Abstract.CustomerManager;
import model.Customer;

public class NeroCustomerManager extends CustomerManager {

    private CustomerCheckService customerCheckService;

    public NeroCustomerManager(CustomerCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;
    }
   @Override
    public void save(Customer customer) throws Exception {

        if(customerCheckService.CheckIfRealPerson(customer) ) {
            super.save(customer);
        }
        else {
            System.out.println("Not a valid person");
        }
    }
}
