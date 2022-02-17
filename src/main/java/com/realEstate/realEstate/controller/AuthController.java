package com.realEstate.realEstate.controller;

import com.realEstate.realEstate.http.Response;
import com.realEstate.realEstate.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
    @Autowired
    private AuthService authService;

    @GetMapping("/checklogin")
    public Response checkLogin(Authentication authentication){
//        System.out.println("authcontroller"+authentication);
        return authService.checklogin(authentication);
    }
}
