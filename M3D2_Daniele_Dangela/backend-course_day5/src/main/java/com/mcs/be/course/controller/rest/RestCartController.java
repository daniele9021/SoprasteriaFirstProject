package com.mcs.be.course.controller.rest;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mcs.be.course.dto.ArticleDto;
import com.mcs.be.course.dto.CustomerDto;
import com.mcs.be.course.exception.ElementNotFound;
import com.mcs.be.course.facade.ArticleFacade;
import com.mcs.be.course.facade.UserFacade;

@RestController
@RequestMapping(value = "/cart")
public class RestCartController {

    private static final Logger LOGGER = LogManager.getLogger(RestArticleController.class);

    @Autowired
    private UserFacade userFacade;
    
    
    //metodo get
    @RequestMapping(method = RequestMethod.GET)
    public List<CustomerDto> getCustomers(){
    	return userFacade.retrieveAllUsers();
    }
    
    //-removeFromCart
/*    @RequestMapping(method = RequestMethod.POST)
    public void removeFromCart(@RequestBody ArticleDto articleDto) throws ElementNotFound {
    return articleDto.
    }*/
    
    //TODO addToCart (articleId, [quantity]) ("/cart/add")
	
}
