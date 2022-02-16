package com.realEstate.realEstate.service;

import com.realEstate.realEstate.bean.HouseownerInfo;
import com.realEstate.realEstate.dao.HouseownerInfoDao;
import com.realEstate.realEstate.http.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HouseownerInfoService {
    @Autowired
    private HouseownerInfoDao houseownerInfoDao;
    public Response save(HouseownerInfo houseownerInfo){
//        houseownerInfoDao.save(houseownerInfo);
        int id=houseownerInfoDao.save(houseownerInfo).getId();
        return new Response(true,String.valueOf(id));
    }
    public HouseownerInfo getHouseownerInfoById(Integer id){
        return houseownerInfoDao.findById(id).get();
    }
    public Response updateHouseOwner(HouseownerInfo houseownerInfo){
        houseownerInfoDao.save(houseownerInfo);
        return new Response(true);
    }

}
