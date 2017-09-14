package com.sunvalley.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Autowired
    //private SkuService iSkuService;

    @RequestMapping("/hello")
    public String test(){
        return "";
        //return iSkuService.getSkuBaseInfo("");
    }
}
