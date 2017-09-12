package com.sunvalley.controller;


import com.sunvalley.face.erp.product.SkuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Autowired
    private SkuService iSkuService;

    @RequestMapping("/hello")
    public String test(){
        return iSkuService.getSkuBaseInfo("");
    }
}
