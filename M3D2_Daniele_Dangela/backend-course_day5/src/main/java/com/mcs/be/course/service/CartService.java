package com.mcs.be.course.service;

import java.util.List;

import com.mcs.be.course.model.Article;
import com.mcs.be.course.model.Cart;
import com.mcs.be.course.model.CartEntry;


public interface CartService {
    Cart getCartForUser( Long id);
	CartEntry addToCart(CartEntry cartEntry);
	List<CartEntry> retrieveCartEntry();
	CartEntry removeFromCart(CartEntry cartEntry);
    
}