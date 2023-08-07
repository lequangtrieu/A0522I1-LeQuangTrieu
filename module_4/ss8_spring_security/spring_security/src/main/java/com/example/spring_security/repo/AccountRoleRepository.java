package com.example.spring_security.repo;

import com.example.spring_security.model.Account;
import com.example.spring_security.model.AccountRole;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountRoleRepository extends JpaRepository<AccountRole, Long> {
    List<AccountRole> findAllByAccount(Account account);
}
