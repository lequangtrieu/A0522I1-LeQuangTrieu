package Demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Map<Integer, Customer> customers;
            customers = new HashMap<>();
            customers.put(1, new Customer(1, "John", "john@codegym.vn", "Hanoi"));
            customers.put(2, new Customer(2, "Bill", "bill@codegym.vn", "Danang"));
            customers.put(3, new Customer(3, "Alex", "alex@codegym.vn", "Saigon"));
            customers.put(4, new Customer(4, "Adam", "adam@codegym.vn", "Beijin"));
            customers.put(5, new Customer(5, "Sophia", "sophia@codegym.vn", "Miami"));
            customers.put(6, new Customer(6, "Rose", "rose@codegym.vn", "Newyork"));

        List<Customer> arr = new ArrayList<>(customers.values());

        System.out.println(customers);


    }
}
