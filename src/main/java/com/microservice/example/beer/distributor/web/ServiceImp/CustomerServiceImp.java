package com.microservice.example.beer.distributor.web.ServiceImp;

import com.microservice.example.beer.distributor.web.Service.CustomerService;
import com.microservice.example.beer.distributor.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Service
public class CustomerServiceImp implements CustomerService {
    @Override
    public CustomerDto getCustomerById(String customerId) {
        return CustomerDto.builder().customerId(UUID.randomUUID())
                .firstName("Mike")
                .lastName("Wills")
                .build();
    }
}
