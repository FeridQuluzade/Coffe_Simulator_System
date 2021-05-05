import Abstract.CustomerManager;
import concrete.NeroCustomerManager;
import model.Customer;

public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager=new NeroCustomerManager();
        customerManager.save(new Customer("Ferid","Quluzade","2002-07-02","7FALHS"));

    }
}
