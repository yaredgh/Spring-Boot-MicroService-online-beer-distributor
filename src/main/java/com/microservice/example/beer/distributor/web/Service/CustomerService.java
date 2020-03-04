package com.microservice.example.beer.distributor.web.Service;

import com.microservice.example.beer.distributor.web.model.CustomerDto;
import org.springframework.stereotype.Service;

@Service
public interface CustomerService {
    CustomerDto getCustomerById(String customerId);
}
