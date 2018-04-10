package com.mcs.be.course.mapping;


import org.springframework.stereotype.Component;

import com.mcs.be.course.dto.CustomerDto;
import com.mcs.be.course.model.Customer;

import ma.glasnost.orika.MapperFactory;
import net.rakugakibox.spring.boot.orika.OrikaMapperFactoryConfigurer;

@Component
public class CustomerMapping implements OrikaMapperFactoryConfigurer {
    @Override
    public void configure(MapperFactory orikaMapperFactory) {
        orikaMapperFactory.classMap(Customer.class, CustomerDto.class)
                .byDefault()
                .mapNulls(false)
                .mapNullsInReverse(true)
                .register();
    }
}