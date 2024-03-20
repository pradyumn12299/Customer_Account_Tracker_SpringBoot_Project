package com.customer.account.tracker.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customer.account.tracker.entity.Account;
import com.customer.account.tracker.entity.Customer;
import com.customer.account.tracker.repo.AccountRepo;

@Service
public class AccountService {
	
		private AccountRepo accountRepo;
		
		public AccountService(AccountRepo accountRepo) {
			super();
			this.accountRepo = accountRepo;
		}


		//post mapping
		public void saveAccountDao(Account account) {
			accountRepo.save(account);
		}
		
		//Get All Mapping
		public Double getBalanace(Long accountId) {
			return accountRepo.findById(accountId).get().getTotalBalance();
		}
		
		public Account updateAccountbalance(Account account) {
			Account acc=accountRepo.findById(account.getAid()).get();
			acc.setTotalBalance(acc.getTotalBalance()+ account.getTotalBalance());
			accountRepo.save(acc);
			return acc;
		}
		
		public Account withdrawMoney(Account account) {
			Account acc=accountRepo.findById(account.getAid()).get();
			acc.setTotalBalance(acc.getTotalBalance()- account.getTotalBalance());
			accountRepo.save(acc);
			return acc;
			
		}
		
		public Customer getAccountProfile(Long id) {
			Account acc=accountRepo.findById(id).get();
			return acc.getCustomer();
		}
		
		public Account transferMoney(Account account, long toAccounId) {
			Account fromAccount=accountRepo.findById(account.getAid()).get();
			Account toAccount = accountRepo.findById(toAccounId).get();
			fromAccount.setTotalBalance(fromAccount.getTotalBalance()-account.getTotalBalance());
			toAccount.setTotalBalance(toAccount.getTotalBalance() + account.getTotalBalance());
			accountRepo.save(fromAccount);
			accountRepo.save(toAccount);
			return fromAccount;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
