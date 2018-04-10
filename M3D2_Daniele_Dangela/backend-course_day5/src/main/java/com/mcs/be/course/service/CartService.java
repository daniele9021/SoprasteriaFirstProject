package com.mcs.be.course.service;

import java.util.List;

import com.mcs.be.course.dto.ArticleDto;
import com.mcs.be.course.dto.CartEntryDto;
import com.mcs.be.course.dto.CustomerDto;
import com.mcs.be.course.model.Cart;

public interface CartService {
    List<Cart> retrieveAllCustomers();
    
    
    Cart getCartForUser(CustomerDto customerDto);
    Cart addToCart (CartEntryDto cartEntryDto, ArticleDto articleDto);
    Cart removeFromCart (CartEntryDto cartEntryDto, ArticleDto articleDto);


}
