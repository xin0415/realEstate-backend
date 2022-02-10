package com.realEstate.realEstate.controller;

import com.realEstate.realEstate.bean.HouseownerInfo;
import com.realEstate.realEstate.http.Response;
import com.realEstate.realEstate.service.HouseownerInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/houseowners")
public class HouseownerInfoController {
    @Autowired
    private HouseownerInfoService houseownerInfoService;

    @PostMapping
    public Response save(@RequestBody HouseownerInfo houseownerInfo){return houseownerInfoService.save(houseownerInfo);}
    @GetMapping("/{ownerId}")
    public HouseownerInfo getById(@PathVariable int ownerId){
        return houseownerInfoService.getHouseownerInfoById(ownerId);
    }
}
