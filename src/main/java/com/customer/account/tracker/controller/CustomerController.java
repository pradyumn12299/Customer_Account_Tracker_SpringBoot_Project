package com.customer.account.tracker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.customer.account.tracker.entity.Customer;
import com.customer.account.tracker.service.AccountService;

@RestController
public class CustomerController {
	
	@Autowired
	private AccountService accountService;
	
	public Customer getCustomerProfile(@RequestParam long aid) {
		
	}
}
