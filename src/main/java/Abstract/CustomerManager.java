package Abstract;

import model.Customer;

public abstract class CustomerManager implements CustomerService {
    @Override
    public void save(Customer customer) throws Exception {
        System.out.println("Saved to Db!"+customer.getFirstName());
    }
}
