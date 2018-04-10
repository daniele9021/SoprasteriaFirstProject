package com.mcs.be.course.service;

import com.mcs.be.course.model.Customer;

public interface SessionService {
	public void add(Customer customer);
	public void remove();
	public Customer currentCustomer();
}
