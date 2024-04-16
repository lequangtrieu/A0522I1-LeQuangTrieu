package com.example.furama_backend.repository;

import com.example.furama_backend.model.customer.CustomerType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerTypeRepository extends JpaRepository<CustomerType, Integer> {
}
