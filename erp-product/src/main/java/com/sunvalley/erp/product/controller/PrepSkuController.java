/*
* Copyright (c) 2017 sunvalley. All Rights Reserved.
*/
package com.sunvalley.erp.product.controller;

import com.alibaba.fastjson.JSONObject;
import com.sunvalley.erp.common.util.JsonUtil;
import com.sunvalley.erp.product.model.ItemLocale;
import com.sunvalley.erp.product.service.ItemService;
import com.sunvalley.erp.product.service.PrepareService;
import com.sunvalley.erp.product.vo.BaseReturnVO;
import com.sunvalley.erp.to.common.FilterModelTO;
import com.sunvalley.erp.to.common.PagerTO;
import com.sunvalley.erp.to.product.ModelAndPreSkuTO;
import com.sunvalley.erp.to.product.PreSkuTO;
import com.sunvalley.erp.to.product.SkuBaseInfoTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

/**
 * 预备sku controller
 *
 * @Author: douglas.jiang
 * @Date: 2017-10-10 9:01
 */
@Controller
@RequestMapping("/product/prepsku")
public class PrepSkuController {

    @Autowired
    private PrepareService prepareService;


    @RequestMapping("/getByModel")
    @ResponseBody
    public BaseReturnVO getByModel(@RequestBody String jsonData) {

        JSONObject jsObject = JSONObject.parseObject(jsonData);
        String modelName= jsObject.getString("modelName");
        Integer status= jsObject.getInteger("status");

        PreSkuTO result = prepareService.getByModel(null,modelName,status);
        return  new BaseReturnVO(result);
    }

    @RequestMapping("/getByModelId")
    @ResponseBody
    public BaseReturnVO getByModelId(@RequestBody String jsonData) {
        JSONObject jsObject = JSONObject.parseObject(jsonData);
        Integer modelId= jsObject.getInteger("modelId");
        Integer status= jsObject.getInteger("status");
        PreSkuTO result =  prepareService.getByModel(modelId,null,status);
        return  new BaseReturnVO(result);
    }

    @RequestMapping("/saveModel")
    @ResponseBody
    public BaseReturnVO saveModel(@RequestBody PreSkuTO preSkuTO) {
        PreSkuTO result = prepareService.saveModel(preSkuTO);
        return  new BaseReturnVO(result);
    }



    @RequestMapping("/getPreSkuGrid")
    @ResponseBody
    public BaseReturnVO getPreSkuGrid(HashMap<String, Object> map) {
        return  new BaseReturnVO("");
    }

    @RequestMapping("/ListPackageSku")
    @ResponseBody
    public BaseReturnVO ListpackageSku(HashMap<String, Object> map) {
        return  new BaseReturnVO("");
    }

    @RequestMapping("/getPreSkuBaseInfo")
    @ResponseBody
    public BaseReturnVO getPreSkuBaseInfo(@RequestBody String jsonData) {
        JSONObject jsObject = JSONObject.parseObject(jsonData);
        Integer skuId= jsObject.getInteger("skuId");
        Integer modelId= jsObject.getInteger("modelId");
        Integer type= jsObject.getInteger("type");
        SkuBaseInfoTO result =  prepareService.getPreSkuBaseInfo(skuId,modelId,type);
        return  new BaseReturnVO(result);
    }

    @RequestMapping("/listModelAndPreSku")
    @ResponseBody
    public BaseReturnVO listModelAndPreSku(@RequestBody String jsonData) {
        JSONObject jsObject = JSONObject.parseObject(jsonData);
        List<FilterModelTO> filterModels = jsObject.getJSONArray("filterModels").toJavaList(FilterModelTO.class);
        int offset= jsObject.getIntValue("offset");
        int pageSize= jsObject.getIntValue("pageSize");
        PagerTO<ModelAndPreSkuTO> result = prepareService.listModelAndPreSku(filterModels,offset,pageSize);
        return  new BaseReturnVO(result);

    }


}

