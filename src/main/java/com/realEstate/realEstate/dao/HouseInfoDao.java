package com.realEstate.realEstate.dao;

import com.realEstate.realEstate.bean.HouseInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HouseInfoDao extends JpaRepository<HouseInfo,Integer> {
}
