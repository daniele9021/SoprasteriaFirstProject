package com.mcs.be.course.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mcs.be.course.dao.CartDao;
import com.mcs.be.course.dao.CartEntryDao;
import com.mcs.be.course.exception.ElementNotFound;
import com.mcs.be.course.model.Article;
import com.mcs.be.course.model.Cart;
import com.mcs.be.course.model.CartEntry;
import com.mcs.be.course.service.CartService;
import com.mcs.be.course.service.SessionService;
@Service
public class CartServiceImpl implements CartService{

	
	@Autowired
	private CartDao cartDao;
	
	@Autowired
	private CartEntryDao cartEntryDao; 
	
	@Autowired
	private SessionService sessionService;
	
	@Override
	public Cart getCartForUser(Long id) {
		return cartDao.getOne(id);
	}
	
	@Override
	public List<CartEntry> retrieveCartEntry(){
		return cartEntryDao.findAll();
	}

	
	@Override
	public CartEntry addToCart(CartEntry cartEntry) {
		cartEntry.setCartId(sessionService.currentCustomer().getCartId());
			return cartEntryDao.save(cartEntry);
	}

	@Override
	public CartEntry removeFromCart(CartEntry cartEntry) {
		CartEntry cartE = this.cartEntryByArticleId(cartEntry.getArticleId());
		if(cartE != null) {
			cartEntryDao.delete(cartE);
		}
		return cartEntry;
	}
	
	public CartEntry cartEntryByArticleId (Long articleId) {
		return cartEntryDao.findOne(articleId);
	}

}
