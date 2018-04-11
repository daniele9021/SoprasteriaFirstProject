package com.mcs.be.course.facade.impl;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mcs.be.course.dto.ArticleDto;
import com.mcs.be.course.dto.CartDto;
import com.mcs.be.course.dto.CartEntryDto;
import com.mcs.be.course.dto.CustomerDto;
import com.mcs.be.course.exception.ElementNotFound;
import com.mcs.be.course.facade.CartFacade;
import com.mcs.be.course.model.Article;
import com.mcs.be.course.model.CartEntry;
import com.mcs.be.course.model.Customer;
import com.mcs.be.course.service.CartService;

import ma.glasnost.orika.MapperFacade;

@Component
public class CartFacadeImpl implements CartFacade {
	

	@Autowired
	private CartService cartService;
	
	@Autowired
    private MapperFacade mapperFacade;


	@Override
	public CartEntryDto addToCart(CartEntryDto cartEntryDto) {
		 CartEntry cartEntry = mapperFacade.map(cartEntryDto, CartEntry.class);
		 cartEntry = cartService.addToCart(cartEntry);
		 CartEntryDto cartEntryDtoTemp= mapperFacade.map(cartEntry, CartEntryDto.class);
		 cartEntryDtoTemp.setTotalPrice(cartEntry.getUnitPrice().multiply(new BigDecimal(cartEntry.getQuantity())));
		 return cartEntryDtoTemp ;
	}

	@Override
	public CartEntryDto removeFromCart(CartEntryDto cartEntryDto) {
		 CartEntry cartEntry = mapperFacade.map(cartEntryDto, CartEntry.class);
		 cartEntry = cartService.removeFromCart(cartEntry);
		 return  cartEntryDto;
		
		
	}


	@Override
	public List<CartEntryDto> retrieveCartEntry() {
		List<CartEntry> cartEntry = cartService.retrieveCartEntry();
		List<CartEntryDto> cartEntryDtoList = cartEntry.stream()
		                .map(a -> mapperFacade.map(a,CartEntryDto.class))
		                .collect(Collectors.toList());
		  for(CartEntryDto c : cartEntryDtoList)   {
			  c.setTotalPrice(c.getUnitPrice().multiply(new BigDecimal( c.getQuantity())));
		  }   
		return cartEntryDtoList;
		}

	@Override
	public CartDto getCartForUser(CustomerDto customerDto) {
		// TODO Auto-generated method stub
		return null;
	}

	

}

