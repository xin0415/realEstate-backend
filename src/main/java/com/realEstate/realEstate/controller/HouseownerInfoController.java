package com.realEstate.realEstate.controller;

import com.realEstate.realEstate.bean.HouseownerInfo;
import com.realEstate.realEstate.http.Response;
import com.realEstate.realEstate.service.HouseownerInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/houseowners")
public class HouseownerInfoController {
    @Autowired
    private HouseownerInfoService houseownerInfoService;

    @PostMapping
    public Response save(@RequestBody HouseownerInfo houseownerInfo){return houseownerInfoService.save(houseownerInfo);}
}
