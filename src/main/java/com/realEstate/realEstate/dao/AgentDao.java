package com.realEstate.realEstate.dao;

import com.realEstate.realEstate.bean.Agent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgentDao extends JpaRepository<Agent,Integer> {
}
