package com.microservice.example.beer.distributor.web.ServiceImp;

import com.microservice.example.beer.distributor.web.Service.BeerService;
import com.microservice.example.beer.distributor.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceImp implements BeerService {
    @Override
    public BeerDto getBeerById(String beerId) {
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("Heineken")
                .beerStyle("pale lager")
                .upc(72890000163l)
                .build();
    }
}
