package com.customer.account.tracker.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.customer.account.tracker.entity.Account;

@Repository
public interface AccountRepo extends JpaRepository<Account, Long>{

}
