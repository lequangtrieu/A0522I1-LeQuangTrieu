package codegym.vn.repository;

import codegym.vn.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CustomerRepositoryImpl implements CustomerRepository{
    private static List<Customer> list = new ArrayList<>();

    static {
        list.add(new Customer(0, "Trieu", "trieu@gmail.com", "Da Nang"));
        list.add(new Customer(1, "Hung", "trieu@gmail.com", "Qn"));
        list.add(new Customer(2, "Thao", "trieu@gmail.com", "Hue"));
        list.add(new Customer(3, "Hieu", "trieu@gmail.com", "HN"));
    }

    @Override
    public List<Customer> findAll() {
        return list;
    }

    @Override
    public void create(Customer customer) {
        list.add(customer);
    }

    @Override
    public Customer findById(int id) {
        return null;
    }

    @Override
    public void update(Customer customer) {

    }

    @Override
    public void delete(Customer customer) {

    }
}
