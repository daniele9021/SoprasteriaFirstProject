package com.mcs.be.course.facade;

import java.util.List;

import com.mcs.be.course.dto.CustomerDto;
import com.mcs.be.course.model.Customer;

public interface CustomerFacade {

	public CustomerDto login(CustomerDto customerDto);
	public CustomerDto register(CustomerDto customerDto);
	public void logout();
	List<CustomerDto> retrieveAllUsers(); 

}
