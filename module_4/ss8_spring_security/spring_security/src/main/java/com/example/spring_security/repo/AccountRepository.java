package com.example.spring_security.repo;

import com.example.spring_security.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
    Account findByAccountName(String name);
}
