package eugene.architectural.dataaccessobject;

import java.util.List;

/**
 * Created by Jian on 2015/8/13.
 */
public interface CustomerDao {
    public List<Customer> getAllCustomers();
    public Customer getCusterById(int id);
    public void addCustomer(Customer customer);
    public void updateCustomer(Customer customer);
    public void deleteCustomer(Customer customer);
}
