package com.mcs.be.course.mapping;

import org.springframework.stereotype.Component;

import com.mcs.be.course.dto.CartEntryDto;
import com.mcs.be.course.model.CartEntry;
import ma.glasnost.orika.MapperFactory;
import net.rakugakibox.spring.boot.orika.OrikaMapperFactoryConfigurer;


@Component
public class CartEntryMapping implements OrikaMapperFactoryConfigurer{
	  	@Override
	    public void configure(MapperFactory orikaMapperFactory) {
	        orikaMapperFactory.classMap(CartEntry.class, CartEntryDto.class)
	        	.exclude("totalPrice")
	        	.exclude("cartId")       
	        	.byDefault()
	            .mapNulls(false)
	            .mapNullsInReverse(true)
	            .register();
	        
	    }
}
