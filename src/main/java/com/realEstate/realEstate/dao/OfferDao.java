package com.realEstate.realEstate.dao;

import com.realEstate.realEstate.bean.Offer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface OfferDao extends JpaRepository<Offer,Integer> {
//    Offer findByHouse_id(int house_id);
    @Query("select o from Offer o where o.house_id=:house_id")
    public List<Offer> findAllByHouse_id(@Param("house_id") int house_id);
}
