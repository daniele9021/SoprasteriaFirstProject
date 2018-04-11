package com.mcs.be.course.facade;

import java.util.List;
import com.mcs.be.course.dto.CartDto;
import com.mcs.be.course.dto.CartEntryDto;
import com.mcs.be.course.dto.CustomerDto;


public interface CartFacade {
    CartDto getCartForUser(CustomerDto customerDto);
    CartEntryDto addToCart (CartEntryDto cartEntryDto);
    CartEntryDto removeFromCart (CartEntryDto cartEntryDto);
	List<CartEntryDto> retrieveCartEntry();
}
