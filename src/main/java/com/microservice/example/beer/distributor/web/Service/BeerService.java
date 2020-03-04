package com.microservice.example.beer.distributor.web.Service;

import com.microservice.example.beer.distributor.web.model.BeerDto;
import org.springframework.stereotype.Service;

@Service
public interface BeerService {
    BeerDto getBeerById(String beerId);
}
