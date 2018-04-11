package com.mcs.be.course.service.impl;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mcs.be.course.service.CustomerService;
import com.mcs.be.course.service.SessionService;
import com.mcs.be.course.dao.CustomerDao;
import com.mcs.be.course.model.*;
@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerDao CustomerDao;
   
    @Autowired
	private SessionService sessionService;

    @Override
    public List<Customer> retrieveAllUsers() {
        return CustomerDao.findAll();
    }

	@Override
	public Customer register(Customer user) {
	        Objects.requireNonNull(user.getFirstName(), "First name cannot be null");
	        Objects.requireNonNull(user.getLastName(), "Last name cannot be null");
	        Objects.requireNonNull(user.getPassword(), "Password cannot be null");
	        for(Customer userall:  retrieveAllUsers())
			{
				if(userall.getId().equals(user.getId()))
				{
					return user;
				}
			}
	        return CustomerDao.save(user);
	}

	@Override
	public Customer login(long id, String password) {
		for(Customer user:  retrieveAllUsers())
		{
			if(user.getId().equals(id)&& user.getPassword().equals(password))
			{
				return user;	
			}
		}
		return null;
	}
}
