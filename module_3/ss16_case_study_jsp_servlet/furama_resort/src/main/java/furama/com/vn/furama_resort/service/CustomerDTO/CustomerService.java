package furama.com.vn.furama_resort.service.CustomerDTO;

import furama.com.vn.furama_resort.model.customer.Customer;

import java.sql.SQLException;
import java.util.List;

public interface CustomerService {
    List<Customer> listAllCustomer(int page) throws SQLException;
    void createCustomer(Customer customer);
}
