package com.customer.account.tracker.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customer.account.tracker.entity.Customer;
import com.customer.account.tracker.repo.CustomerRepo;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepo customerRepo;
	
	public void saveCustomer(Customer customer) {
		customerRepo.save(customer);
	}

}
