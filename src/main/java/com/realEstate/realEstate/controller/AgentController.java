package com.realEstate.realEstate.controller;

import com.realEstate.realEstate.bean.Agent;
import com.realEstate.realEstate.http.Response;
import com.realEstate.realEstate.service.AgentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/agents")
public class AgentController {
    @Autowired
    private AgentService agentService;

    @PostMapping
    public Response addAgent(@RequestBody Agent agent){return agentService.register(agent);}
}
