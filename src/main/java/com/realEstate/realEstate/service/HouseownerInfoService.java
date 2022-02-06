package com.realEstate.realEstate.service;

import com.realEstate.realEstate.bean.HouseownerInfo;
import com.realEstate.realEstate.dao.HouseownerInfoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HouseownerInfoService {
    @Autowired
    private HouseownerInfoDao houseownerInfoDao;
    public void save(HouseownerInfo houseownerInfo){houseownerInfoDao.save(houseownerInfo);}

}
