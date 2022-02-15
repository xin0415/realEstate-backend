package com.realEstate.realEstate.controller;

import com.realEstate.realEstate.bean.HouseInfo;
import com.realEstate.realEstate.http.Response;
import com.realEstate.realEstate.service.HouseInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/houseinfo")
public class HouseInfoController {
    @Autowired
    private HouseInfoService houseInfoService;

    @PostMapping
    public Response save(@RequestBody HouseInfo houseInfo){return houseInfoService.save(houseInfo);}

    @GetMapping
    public List<HouseInfo> getAll(){return houseInfoService.getAll();}

    @PutMapping
    public Response updateHouse(@RequestBody HouseInfo houseInfo){
        return houseInfoService.updateHouse(houseInfo);
    }
}
