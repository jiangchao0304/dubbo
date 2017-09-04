package com.sunvalley.controller;

import com.sunvalley.faced.erp.product.IEcnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Autowired
    private IEcnService ecnService;

    @RequestMapping("/hello")
    public String test(){
        return ecnService.getEcnReasonRemark(1).getReasonName();
    }
}
