package com.customer.account.tracker.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.customer.account.tracker.entity.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Long>{

		
}
