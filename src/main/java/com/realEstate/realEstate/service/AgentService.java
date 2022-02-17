package com.realEstate.realEstate.service;

import com.realEstate.realEstate.bean.Agent;
import com.realEstate.realEstate.bean.Email;
import com.realEstate.realEstate.bean.Profile;
import com.realEstate.realEstate.dao.AgentDao;
import com.realEstate.realEstate.http.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.security.core.Authentication;
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

    @Autowired
    private JavaMailSender emailSender;

    public List<Agent> getAll(){return agentDao.findAll();}

    public Response register(Agent agent){
        agent.setPassword(passwordEncoder.encode(agent.getPassword()));
        List<Profile> profiles=new ArrayList<Profile>();
        profiles.add(new Profile(3));
        agent.setProfiles(profiles);
        agentDao.save(agent);
        return new Response(true);
    }
    public Response addRole(int id,int role){
        Agent agent=agentDao.getById(id);
        List<Profile> profiles=new ArrayList<Profile>();
        if(role==3){
            profiles.add(new Profile(role));
        }else if(role==2){
            profiles.add(new Profile(role));
        }else{
            profiles.add(new Profile(2));
            profiles.add(new Profile(role));
        }
        agent.setProfiles(profiles);
        agentDao.save(agent);
        return new Response(true);
    }
//    public Response changePassword(Agent agent, Authentication authentication){
//        if(agent.getEmail().equals(authentication.getName()))
//    }
    public Agent getAgentByEmail(String email){
        return agentDao.findByEmail(email);
    }
    public void sendEmail(Email e){
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("realestatetest12@outlook.com");
        message.setTo(e.getEmail());
        message.setSubject("Appointment");
        message.setText(e.getMessage());
        emailSender.send(message);
    }
}
