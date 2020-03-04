package com.microservice.example.beer.distributor.web.controller;

import com.microservice.example.beer.distributor.web.Service.BeerService;
import com.microservice.example.beer.distributor.web.model.BeerDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {
     private final BeerService beerService;

    public BeerController(BeerService beerService) {
        this.beerService = beerService;
    }

    @RequestMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeer(@PathVariable String beerId){

        return new ResponseEntity<BeerDto>( beerService.getBeerById(beerId), HttpStatus.OK);
    }
}
