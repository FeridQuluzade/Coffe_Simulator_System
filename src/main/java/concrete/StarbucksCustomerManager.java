package concrete;

import Abstract.CustomerCheckService;
import Abstract.CustomerManager;
import model.Customer;

public class StarbucksCustomerManager extends CustomerManager {
    private CustomerCheckService customerCheckService;

    public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
        customerCheckService = this.customerCheckService;
    }

    @Override
    public void save(Customer customer) throws Exception {
        if (customerCheckService.CheckIfRealPerson(customer)) {
            super.save(customer);
        } else {
            throw new Exception("Not a valid person");
        }
    }

}
