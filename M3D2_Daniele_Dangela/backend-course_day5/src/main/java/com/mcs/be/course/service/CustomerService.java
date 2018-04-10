package com.mcs.be.course.service;


import com.mcs.be.course.model.Customer;

import java.util.List;

public interface CustomerService 
{
   
	  List<Customer> retrieveAllUsers();
	
    Customer register(Customer user);
    
    Customer login(long id, String password);
  
    

}
