package com.realEstate.realEstate.service;

import com.realEstate.realEstate.bean.Agent;
import com.realEstate.realEstate.bean.Profile;
import com.realEstate.realEstate.dao.AgentDao;
import com.realEstate.realEstate.http.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AgentService {
    @Autowired
    private AgentDao agentDao;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public List<Agent> getAll(){return agentDao.findAll();}

    public Response register(Agent agent){
        agent.setPassword(passwordEncoder.encode(agent.getPassword()));
        List<Profile> profiles=new ArrayList<Profile>();
        profiles.add(new Profile(3));
        agent.setProfiles(profiles);
//        System.out.println("agent"+agent);
        agentDao.save(agent);
        return new Response(true);
    }
}
