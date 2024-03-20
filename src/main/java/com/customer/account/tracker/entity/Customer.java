package com.customer.account.tracker.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.ToString;

@Entity
@ToString
@Table(name="customer")
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private long id;
	@Column(name="name")
	private String name;
	@Column(name="sirname")
	private String sirName;
	@Column(name="address")
	private String address;
	@Column(name="phoneno")
	private long phoneNo;
	
	//default Constructor
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//parameterized constructor
	public Customer(long id, String name, String sirName, String address, long phoneNo) {
		super();
		this.id = id;
		this.name = name;
		this.sirName = sirName;
		this.address = address;
		this.phoneNo = phoneNo;
	}
	
	//setters and getters
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSirName() {
		return sirName;
	}

	public void setSirName(String sirName) {
		this.sirName = sirName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	
}
