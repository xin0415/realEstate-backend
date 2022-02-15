package com.realEstate.realEstate.controller;

import com.realEstate.realEstate.bean.Offer;
import com.realEstate.realEstate.http.Response;
import com.realEstate.realEstate.service.OfferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/offers")
public class OfferController {
    @Autowired
    private OfferService offerService;

    @PostMapping
    public Response save(@RequestBody Offer offer){
        return offerService.save(offer);
    }
    @GetMapping("/house/{houseId}")
    public List<Offer> getByHouseId(@PathVariable int houseId){
        return offerService.getOfferById(houseId);
    }
    @PutMapping
    public Response updateOffer(@RequestBody Offer offer){
        return offerService.updateOffer(offer);
    }
    @GetMapping
    public List<Offer> getAllOffer(){return offerService.getAll();}
}
