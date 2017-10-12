/*
* Copyright (c) 2017 sunvalley. All Rights Reserved.
*/
package com.sunvalley.erp.product.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.sunvalley.erp.common.enums.ApiMsgEnum;
import com.sunvalley.erp.common.exception.BusinessException;
import com.sunvalley.erp.common.exception.SunvalleyException;
import com.sunvalley.erp.common.exception.UniteException;
import com.sunvalley.erp.common.util.JsonUtil;
import com.sunvalley.erp.product.service.BomsService;
import com.sunvalley.erp.product.service.ItemLogService;
import com.sunvalley.erp.product.vo.BaseReturnVO;
import com.sunvalley.erp.to.common.SysSessionTO;
import com.sunvalley.erp.to.product.BomTO;
import com.sunvalley.erp.to.product.ImportPackageTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.lang.reflect.Array;
import java.util.List;


/**
 * 类或方法的功能描述 :TODO
 *
 * @Author: douglas.jiang
 * @Date: 2017-10-10 9:57
 */
@Controller
@RequestMapping("/product/bom")
public class BomController {

    @Autowired
    private BomsService bomsService;

    @Autowired
    private ItemLogService itemLogService;

    @RequestMapping(value = "/getBomInfo",consumes="application/json")
    @ResponseBody
    public BaseReturnVO getBomInfo(@RequestBody String jsonData) {

        JSONObject jsObject = JSONObject.parseObject(jsonData);
        Integer bomId= jsObject.getInteger("bomId");
        Integer skuId= jsObject.getInteger("skuId");
        BomTO result =  bomsService.getBom(bomId,skuId);
        return  new BaseReturnVO(result);
    }

    @RequestMapping(value = "/importPackageList",consumes="application/json")
    @ResponseBody
    public BaseReturnVO importPackageList(@RequestBody String jsonData) {

        JSONObject jsObject = JSONObject.parseObject(jsonData);

        Integer skuId= jsObject.getInteger("skuId");

        List<ImportPackageTO> packageList =JSON.parseArray(jsObject.getString("packageList"), ImportPackageTO.class);

        SysSessionTO sysSessionTO =JSON.parseObject(jsObject.getString("sessionTO"), SysSessionTO.class);

        boolean result =  bomsService.savePackageList(skuId,packageList,sysSessionTO);

        return  new BaseReturnVO(result);
    }
}
