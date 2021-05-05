package Abstract;

import model.Customer;

public interface CustomerCheckService {
    boolean CheckIfRealPerson(Customer customer);
}
