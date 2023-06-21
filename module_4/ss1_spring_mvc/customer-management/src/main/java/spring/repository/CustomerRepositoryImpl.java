package spring.repository;

import org.springframework.stereotype.Repository;
import spring.model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class CustomerRepositoryImpl implements CustomerRepository {
    private static final Map<Integer, Customer> customerMap = new HashMap<>();

    static {
        customerMap.put(1, new Customer(1, "John", "john.com", "dn"));
        customerMap.put(2, new Customer(2, "John", "john.com", "dn"));
        customerMap.put(3, new Customer(3, "John", "john.com", "dn"));
        customerMap.put(4, new Customer(4, "John", "john.com", "dn"));

    }

    @Override
    public void create(Customer customer) {
        if (!customerMap.containsKey(customer.getId())) {
            customerMap.put(customer.getId(), customer);
        }
    }

    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customerMap.values());
    }
}
