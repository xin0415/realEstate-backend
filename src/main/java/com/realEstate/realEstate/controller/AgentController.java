package com.realEstate.realEstate.controller;

import com.realEstate.realEstate.bean.Agent;
import com.realEstate.realEstate.http.Response;
import com.realEstate.realEstate.service.AgentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/agents")
public class AgentController {
    @Autowired
    private AgentService agentService;

    @PostMapping
    public Response addAgent(@RequestBody Agent agent){return agentService.register(agent);}
    @GetMapping
    public List<Agent> getAll(){return agentService.getAll();}
    @PostMapping("/addrole/{id}/{role}")
    public Response addRole(@PathVariable int id,@PathVariable int role){
        return agentService.addRole(id,role);
    }
    @GetMapping("/getagent/{email}")
    public Agent getAgent(@PathVariable String email){
        System.out.println(email);
        return agentService.getAgentByEmail(email);
    }
}
