package com.mcs.be.course.mapping;

import org.springframework.stereotype.Component;

import com.mcs.be.course.dto.CartDto;
import com.mcs.be.course.model.Cart;

import ma.glasnost.orika.MapperFactory;
import net.rakugakibox.spring.boot.orika.OrikaMapperFactoryConfigurer;


@Component
public class CartMapping implements OrikaMapperFactoryConfigurer{
	  	@Override
	    public void configure(MapperFactory orikaMapperFactory) {
	        orikaMapperFactory.classMap(Cart.class, CartDto.class)
	                .byDefault()
	                .mapNulls(false)
	                .mapNullsInReverse(true)
	                .register();
	    }
}
