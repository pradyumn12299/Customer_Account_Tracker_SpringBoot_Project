package com.customer.account.tracker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.customer.account.tracker.entity.Account;
import com.customer.account.tracker.service.AccountService;

@RestController
@RequestMapping("/api")
public class AccountController {
	
	@Autowired
	private AccountService accountService;
	
	@PostMapping("/createAccount")
	public Account createAccount(@RequestBody Account account) {
		accountService.saveAccountDao(account);
		return account;
	}
	
	@GetMapping("/balance")
	public Double getBalance(@RequestBody Account account) {
		return accountService.getBalanace(account.getAid());
	}
	
	@PutMapping("/updateBalance")
	public Account updateBalance(@RequestBody Account account) {
		return accountService.updateAccountbalance(account);
	}
	
	@PutMapping("/withdraw")
	public Account withdrawMoney(@RequestBody Account account){
		return accountService.withdrawMoney(account);
	}
	
	@PutMapping("/transferAmount")
	public Account transferAmount(@RequestBody Account account, @RequestParam long toAccountId) {
		return accountService.transferMoney(account, toAccountId);
	}
}

