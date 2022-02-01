package com.realEstate.realEstate.dao;

import com.realEstate.realEstate.bean.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileDao extends JpaRepository<Profile,Integer> {
}
