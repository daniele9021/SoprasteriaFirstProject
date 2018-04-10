package com.mcs.be.course.service.impl;


import org.springframework.stereotype.Service;

import com.mcs.be.course.dto.SessionDto;
import com.mcs.be.course.model.Customer;
import com.mcs.be.course.service.SessionService;

@Service
public class SessionServiceImpl implements SessionService {

	private SessionDto session = new SessionDto();
	 
	@Override
	public void add(Customer customer) {
		session.setCustomer(customer);
	}

	@Override
	public void remove() {
		session.setCustomer(null);
	}
	
	public Customer currentCustomer() {
		return session.getCustomer();
	}
	
}
