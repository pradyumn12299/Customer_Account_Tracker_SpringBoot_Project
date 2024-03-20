package com.customer.account.tracker.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
//@NoArgsConstructor
//@AllArgsConstructor
//@Data
//@ToString
@Table(name="account")
public class Account {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long aid;
	private long cid;
	private String accountType;
	private Double totalBalance;
	@ManyToOne(cascade=CascadeType.ALL)
	private Customer customer;
	/**
	 * @return the aid
	 */
	public long getAid() {
		return aid;
	}
	/**
	 * @param aid the aid to set
	 */
	public void setAid(long aid) {
		this.aid = aid;
	}
	/**
	 * @return the cid
	 */
	public long getCid() {
		return cid;
	}
	/**
	 * @param cid the cid to set
	 */
	public void setCid(long cid) {
		this.cid = cid;
	}
	/**
	 * @return the accountType
	 */
	public String getAccountType() {
		return accountType;
	}
	/**
	 * @param accountType the accountType to set
	 */
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	/**
	 * @return the totalBalance
	 */
	public Double getTotalBalance() {
		return totalBalance;
	}
	/**
	 * @param totalBalance the totalBalance to set
	 */
	public void setTotalBalance(Double totalBalance) {
		this.totalBalance = totalBalance;
	}
	/**
	 * @return the customer
	 */
	public Customer getCustomer() {
		return customer;
	}
	/**
	 * @param customer the customer to set
	 */
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Account(long aid, long cid, String accountType, Double totalBalance, Customer customer) {
		super();
		this.aid = aid;
		this.cid = cid;
		this.accountType = accountType;
		this.totalBalance = totalBalance;
		this.customer = customer;
	}
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Account [aid=" + aid + ", cid=" + cid + ", accountType=" + accountType + ", totalBalance="
				+ totalBalance + ", customer=" + customer + "]";
	}
	
	
	
	
	
	
}
