package com.realEstate.realEstate.http;

import com.realEstate.realEstate.bean.Agent;

public class AuthenticationSuccessResponse extends Response{
    private Agent agent;
    public AuthenticationSuccessResponse(boolean success, int code, String message, Agent agent){
        super(success,code,message);
        this.agent=agent;
    }

    public Agent getAgent(){return agent;}
    public void setAgent(Agent agent){this.agent=agent;}
}
