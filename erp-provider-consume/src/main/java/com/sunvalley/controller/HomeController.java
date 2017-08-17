package com.sunvalley.controller;

import com.sunvalley.api.product.IItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Autowired
    private IItemService itemService;

    @RequestMapping("/hello")
    public String test(){
        return itemService.getSku("aa");
    }
}
