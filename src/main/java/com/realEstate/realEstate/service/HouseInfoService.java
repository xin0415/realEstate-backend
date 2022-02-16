package com.realEstate.realEstate.service;

import com.realEstate.realEstate.bean.HouseInfo;
import com.realEstate.realEstate.dao.HouseInfoDao;
import com.realEstate.realEstate.http.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HouseInfoService {
    @Autowired
    private HouseInfoDao houseInfoDao;

    public Response save(HouseInfo houseInfo){
        houseInfoDao.save(houseInfo);
        return new Response(true);
    }
    public List<HouseInfo> getAll(){return houseInfoDao.findAll();}
    public Response updateHouse(HouseInfo houseInfo){
        HouseInfo house=houseInfoDao.getById(houseInfo.getId());
        if(houseInfo.getStatus()!=null){
            house.setStatus(houseInfo.getStatus());
        }
        houseInfoDao.save(house);
        return new Response(true);
    }
    public Response updateHouseById(HouseInfo houseInfo){
        houseInfoDao.save(houseInfo);
//        System.out.println(houseInfo);
        return new Response(true);
    }
}
