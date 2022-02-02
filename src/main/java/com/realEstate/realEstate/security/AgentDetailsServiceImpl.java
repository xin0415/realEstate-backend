package com.realEstate.realEstate.security;

import com.realEstate.realEstate.bean.Agent;
import com.realEstate.realEstate.dao.AgentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class AgentDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private AgentDao agentDao;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
//        System.out.println("load "+username);
        Agent agent=agentDao.findByEmail(username);
        if(agent==null)
                throw new UsernameNotFoundException(username+"does NOT exist!");
        return agent;
    }
}
