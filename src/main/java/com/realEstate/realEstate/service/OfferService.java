package com.realEstate.realEstate.service;

import com.realEstate.realEstate.bean.Offer;
import com.realEstate.realEstate.dao.OfferDao;
import com.realEstate.realEstate.http.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OfferService {
    @Autowired
    private OfferDao offerDao;

    public Response save(Offer offer){
        offerDao.save(offer);
        return new Response(true);
    }
    public List<Offer> getOfferById(Integer id){
        return offerDao.findAllByHouse_id(id);
    }
    public Response updateOffer(Offer offer){
        Offer of=offerDao.getById(offer.getId());
        of.setStatus(offer.getStatus());
        of.setPrice(offer.getPrice());
        offerDao.save(of);
        return new Response(true);
    }
    public List<Offer> getAll(){
        return offerDao.findAll();
    }
 }
