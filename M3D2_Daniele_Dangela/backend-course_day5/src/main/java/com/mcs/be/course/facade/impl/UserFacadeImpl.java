package com.mcs.be.course.facade.impl;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.mcs.be.course.dto.CustomerDto;
import com.mcs.be.course.facade.UserFacade;
import com.mcs.be.course.model.Customer;
import com.mcs.be.course.service.CustomerService;
import com.mcs.be.course.service.SessionService;

import ma.glasnost.orika.MapperFacade;

@Component
public class UserFacadeImpl implements UserFacade{
	
	@Autowired
	private CustomerService customerService;
	
	@Autowired
	private SessionService sessionService;
	
	@Autowired
    private MapperFacade mapperFacade;

	 @Override
	 public List<CustomerDto> retrieveAllUsers() {
		 List<Customer> customers = customerService.retrieveAllUsers();
		 List<CustomerDto> customerDtoList = customers.stream()
	                .map(a -> mapperFacade.map(a,CustomerDto.class))
	                .collect(Collectors.toList());
	        
		 return customerDtoList;
	   }
	 
	@Override
	public CustomerDto register(CustomerDto user) {
		  
	   Customer customer = mapperFacade.map(user, Customer.class);	
	   customer = customerService.register(customer);
	   
	   return mapperFacade.map(customer, CustomerDto.class);
	       
	}

	@Override
	public CustomerDto login(CustomerDto customerDto) {
		Customer customer = mapperFacade.map(customerDto, Customer.class);	
		customer = customerService.login(customer.getId(), customer.getPassword());
		
		return mapperFacade.map(customer, CustomerDto.class);
	}

	@Override
	public void logout() {
		sessionService.remove();
	}
}
