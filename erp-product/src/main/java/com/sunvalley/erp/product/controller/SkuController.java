/*
* Copyright (c) 2017 sunvalley. All Rights Reserved.
*/
package com.sunvalley.erp.product.controller;

import com.sunvalley.erp.common.component.filtersql.FilterModel;
import com.sunvalley.erp.common.util.JsonUtil;
import com.sunvalley.erp.product.service.ItemFileService;
import com.sunvalley.erp.product.service.ItemService;
import com.sunvalley.erp.product.service.PrepareService;
import com.sunvalley.erp.product.vo.BaseReturnVO;
import com.sunvalley.erp.to.common.PagerTO;
import com.sunvalley.erp.to.product.*;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * sku controller.
 *
 * @Author: douglas.jiang
 * @Date: 2017-10-10 9:26
 */
@Controller
@RequestMapping("/product/sku")
public class SkuController {

    @Autowired
    private ItemService itemService;

    @Autowired
    private PrepareService prepareService;

    @Autowired
    private ItemFileService itemFileService;

    @RequestMapping(value = "/getSkuBaseInfo/{sku}",method = RequestMethod.GET)
    @ResponseBody
    public BaseReturnVO getSkuBaseInfo(@PathVariable  String sku) {
        SkuBaseInfoTO result;
        if (StringUtils.isNumeric(sku)) {
            int skuId=  Integer.parseInt(sku);
            result =  itemService.getSkuBaseInfo(skuId);
        }else {
            result =  itemService.getSkuBaseInfo(sku);
        }
        return new BaseReturnVO(result);
    }

    @RequestMapping("/updateSkuBaseInfo")
    @ResponseBody
    public BaseReturnVO updateSkuBaseInfo(@RequestBody SkuBaseInfoTO dto) {
        boolean result =  prepareService.updateSkuBaseInfo(dto);

        Map<String,String> jsonData = new HashMap<>();
        if(result){
            jsonData.put("success","true");
        }else {
            jsonData.put("success","false");
        }

        return new BaseReturnVO(jsonData);
    }


    @RequestMapping("/saveSkuBaseInfo")
    @ResponseBody
    public BaseReturnVO saveSkuBaseInfo(@RequestBody SkuBaseInfoTO dto) {

        PreSkuRelationTO result =  prepareService.saveSkuBaseInfo(dto);
        return new BaseReturnVO(result);
    }


    @RequestMapping("/saveSkuMarketInfo")
    @ResponseBody
    public BaseReturnVO saveSkuMarketInfo(@RequestBody SkuMarketInfoTO dto) {
        itemService.saveSkuMarketInfo(dto);
        return new BaseReturnVO(true);
    }

    @RequestMapping("/getCustomsInfo/{skuId}")
    @ResponseBody
    public BaseReturnVO getCustomsInfo(@PathVariable int skuId) {
        Map<String,Object> customsInfoTO =  itemService.getCustomsInfo(skuId);
        return new BaseReturnVO(customsInfoTO);
    }

    @RequestMapping("/listBySameModel/{skuId}")
    @ResponseBody
    public BaseReturnVO listBySameModel(@PathVariable int skuId) {
        List<SkuDescTO> result =  itemService.listBySameModel(skuId);
        return new BaseReturnVO(result);
    }

    @RequestMapping("/copyVirtualFromSku")
    @ResponseBody
    public BaseReturnVO copyVirtualFromSku(@RequestBody String jsonData) {
        String sourceSku= JsonUtil.getString(jsonData,"sourceSku");
        int targetSkuId= JsonUtil.getInteger(jsonData,"targetSkuId");
        int result =  itemService.copyVirtualFromSku(sourceSku,targetSkuId);
        return new BaseReturnVO(result);
    }

    @RequestMapping("/getSkuSimpleInfo")
    @ResponseBody
    public BaseReturnVO getSkuSimpleInfo(@RequestBody String jsonData) {
        String sku= JsonUtil.getString(jsonData,"sku");
        int langId= JsonUtil.getInteger(jsonData,"langId");
        int companyId= JsonUtil.getInteger(jsonData,"companyId");
        SkuSimpleInfoTO skuSimpleInfoTO =  itemService.getSkuSimpleInfo(sku,langId,companyId);
        return new BaseReturnVO(skuSimpleInfoTO);
    }

    @RequestMapping("/listSkuListNew")
    @ResponseBody
    public BaseReturnVO listSkuListNew(@RequestBody String jsonData){

        List<FilterModel> filterModels = JsonUtil.fromJSONArray(jsonData,"filterModels",FilterModel.class);

        int langId= JsonUtil.getInteger(jsonData,"langId");
        int offset= JsonUtil.getInteger(jsonData,"offset");
        int pageSize= JsonUtil.getInteger(jsonData,"pageSize");

        PagerTO<SkuListNewTO> result =  itemService.listskuListNew(filterModels,langId,offset,pageSize);
        return new BaseReturnVO(result);
    }

    @RequestMapping("/getSkuMarketInfo/{skuId}")
    @ResponseBody
    public BaseReturnVO getSkuMarketInfo(@PathVariable int skuId){
        Object result =  itemService.getSkuMarketInfo(skuId);
        return new BaseReturnVO(result);
    }


    @RequestMapping("/listSkuFile/{skuId}")
    @ResponseBody
    public BaseReturnVO listSkuFile(@PathVariable int skuId){
        Object result =  itemFileService.listItemFile(skuId);
        return new BaseReturnVO(result);
    }

    @RequestMapping("/listSkuVideo/{skuId}")
    @ResponseBody
    public BaseReturnVO listSkuVideo(@PathVariable int skuId){
        Object result =  itemFileService.listItemVideo(skuId);
        return new BaseReturnVO(result);
    }
    
    @RequestMapping("/listSkuImage/{sku}")
    @ResponseBody
    public BaseReturnVO listSkuImage(@PathVariable String sku){
        Object result =  itemFileService.listItemImages(sku,0);
        return new BaseReturnVO(result);
    }

}

