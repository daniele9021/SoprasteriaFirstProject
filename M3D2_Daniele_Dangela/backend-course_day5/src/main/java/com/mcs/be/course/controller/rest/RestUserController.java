package com.mcs.be.course.controller.rest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.mcs.be.course.dto.CustomerDto;
import com.mcs.be.course.facade.UserFacade;


@RestController
@RequestMapping(value = "/user")
public class RestUserController {

    private static final Logger LOGGER = LogManager.getLogger(RestUserController.class);

    @Autowired
    private UserFacade userFacade;

    @RequestMapping(method=RequestMethod.POST)
    public CustomerDto login(@RequestBody CustomerDto customerDto) 
    {
    	return userFacade.login(customerDto);
    }
  
    @RequestMapping(value = "/register", method=RequestMethod.POST)
    public CustomerDto register(@RequestBody CustomerDto customerDto) 
    {
    	return userFacade.register(customerDto);
    }
    
    @RequestMapping(value = "/logout",method=RequestMethod.POST)
    public void logout() 
    {
    	userFacade.logout();
    }
    

}
