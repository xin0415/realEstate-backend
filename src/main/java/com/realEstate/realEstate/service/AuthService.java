package com.realEstate.realEstate.service;

import com.realEstate.realEstate.dao.AgentDao;
import com.realEstate.realEstate.http.AuthenticationSuccessResponse;
import com.realEstate.realEstate.http.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    @Autowired
    private AgentDao agentDao;
    public Response checklogin(Authentication authentication){
        if (authentication != null) {
            Response response=new AuthenticationSuccessResponse(true,200,"Logged In!",agentDao.findByEmail(authentication.getName()));
            return response;
        }else{
            return new Response(false);
        }
    }
}
