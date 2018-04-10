package com.mcs.be.course.dto;

import java.io.Serializable;

import com.mcs.be.course.model.Customer;

public class SessionDto implements Serializable{
	private Customer customer;

	public SessionDto() {
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	
	
	
	
	
	
}
