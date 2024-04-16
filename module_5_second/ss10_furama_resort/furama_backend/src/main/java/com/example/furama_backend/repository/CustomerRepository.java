package com.example.furama_backend.repository;

import com.example.furama_backend.model.customer.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    @Query(value = "SELECT c.customer_id AS customerId, c.name, c.birthday, c.gender, c.id_card AS idCard, c.phone, " +
            "c.email, c.address, ct.customer_type_id AS customerTypeId, " +
            "ct.customer_type_name AS customerTypeName " +
            "FROM customer c " +
            "INNER JOIN customer_type ct ON c.customer_type_id = ct.customer_type_id", nativeQuery = true)
    List<Customer> getAllCustomers();

    @Query(value = "Select * from customer", nativeQuery = true)
    List<Customer> getAllCustomer2();
}
