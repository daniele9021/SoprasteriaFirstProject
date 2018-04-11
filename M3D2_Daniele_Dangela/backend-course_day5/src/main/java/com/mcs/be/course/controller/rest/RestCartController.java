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
import com.mcs.be.course.dto.CartEntryDto;
import com.mcs.be.course.facade.CartFacade;


@RestController
@RequestMapping(value = "/cart")
public class RestCartController {

    private static final Logger LOGGER = LogManager.getLogger(RestArticleController.class);

    @Autowired
    private CartFacade cartFacade;
    
    @RequestMapping(method = RequestMethod.GET)
    public List<CartEntryDto> retrieveCartEntry(){
    	return cartFacade.retrieveCartEntry();
    }
    
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public CartEntryDto addToCart(@RequestBody CartEntryDto cartEntryDto) {
    	return cartFacade.addToCart(cartEntryDto);
    } 
    
    @RequestMapping(value = "/remove", method = RequestMethod.POST)
    public CartEntryDto removeFromCart(@RequestBody CartEntryDto cartEntryDto) {
    	return cartFacade.removeFromCart(cartEntryDto);
    } 
    
    
    
}
