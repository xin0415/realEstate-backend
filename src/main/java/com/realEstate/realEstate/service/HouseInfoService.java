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
}
