/*
* Copyright (c) 2017 sunvalley. All Rights Reserved.
*/
package com.sunvalley.erp.product.controller;

import com.sunvalley.erp.common.util.JsonUtil;
import com.sunvalley.erp.product.service.BomsService;
import com.sunvalley.erp.product.service.ItemLogService;
import com.sunvalley.erp.product.vo.BaseReturnVO;
import com.sunvalley.erp.to.common.SysSessionTO;
import com.sunvalley.erp.to.product.BomOneSkuTO;
import com.sunvalley.erp.to.product.BomTO;
import com.sunvalley.erp.to.product.ImportPackageTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
        Integer bomId= JsonUtil.getInteger(jsonData,"bomId");
        Integer skuId= JsonUtil.getInteger(jsonData,"skuId");
        BomTO result =  bomsService.getBom(bomId,skuId);
        return  new BaseReturnVO(result);
    }


    @RequestMapping(value = "/saveBomOneSkuList",consumes="application/json")
    @ResponseBody
    public BaseReturnVO saveBomOneSkuList(@RequestBody String jsonData) {

        Integer skuId= JsonUtil.getInteger(jsonData,"skuid");
        Integer bomId= JsonUtil.getInteger(jsonData,"id");
        String sku = JsonUtil.getString(jsonData,"sku");

        List<BomOneSkuTO> bomOneSkuTOList =JsonUtil.fromJSONArray(jsonData,"bomOneSkuList",BomOneSkuTO.class);

        int result =  bomsService.saveBomOneSkuList(skuId,sku,bomId,bomOneSkuTOList);

        return  new BaseReturnVO(result);
    }

    @RequestMapping(value = "/importPackageList",consumes="application/json")
    @ResponseBody
    public BaseReturnVO importPackageList(@RequestBody String jsonData) {

        Integer skuId= JsonUtil.getInteger(jsonData,"skuId");

        List<ImportPackageTO> packageList =JsonUtil.fromJSONArray(jsonData,"packageList", ImportPackageTO.class);

        SysSessionTO sysSessionTO =JsonUtil.fromJSON(jsonData,"sessionTO", SysSessionTO.class);

        boolean result =  bomsService.savePackageList(skuId,packageList,sysSessionTO);

        return  new BaseReturnVO(result);
    }
}

