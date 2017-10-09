/*
* Copyright (c) 2017 sunvalley. All Rights Reserved.
*/
package com.sunvalley.erp.product.controller;

import com.alibaba.fastjson.JSONObject;
import com.sunvalley.erp.product.service.ItemFileService;
import com.sunvalley.erp.product.service.ItemService;
import com.sunvalley.erp.product.service.PrepareService;
import com.sunvalley.erp.product.vo.BaseReturnVO;
import com.sunvalley.erp.to.common.FilterModelTO;
import com.sunvalley.erp.to.common.PagerTO;
import com.sunvalley.erp.to.product.*;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
        return new BaseReturnVO(result);
    }


    @RequestMapping("/saveSkuBaseInfo")
    @ResponseBody
    public BaseReturnVO saveSkuBaseInfo(@RequestBody SkuBaseInfoTO dto) {

        PreSkuRelationTO result =  prepareService.saveSkuBaseInfo(dto);
        return new BaseReturnVO(result);
    }


    @RequestMapping("/saveSkuMarketInfo/{skuId}")
    @ResponseBody
    public BaseReturnVO saveSkuMarketInfo(@PathVariable int skuId, @RequestBody SkuMarketInfoTO dto) {
        itemService.saveSkuMarketInfo(skuId,dto);
        return new BaseReturnVO(true);
    }

    @RequestMapping("/getCustomsInfo/{skuId}")
    @ResponseBody
    public BaseReturnVO getCustomsInfo(@PathVariable int skuId) {
        CustomsInfoTO customsInfoTO =  itemService.getCustomsInfo(skuId);
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
        JSONObject jsObject = JSONObject.parseObject(jsonData);
        String sourceSku= jsObject.getString("sourceSku");
        int targetSkuId= jsObject.getIntValue("targetSkuId");
        int result =  itemService.copyVirtualFromSku(sourceSku,targetSkuId);
        return new BaseReturnVO(result);
    }

    @RequestMapping("/getSkuSimpleInfo")
    @ResponseBody
    public BaseReturnVO getSkuSimpleInfo(@RequestBody String jsonData) {
        JSONObject jsObject = JSONObject.parseObject(jsonData);
        String sku= jsObject.getString("sku");
        int langId= jsObject.getIntValue("langId");
        int companyId= jsObject.getIntValue("companyId");
        SkuSimpleInfoTO skuSimpleInfoTO =  itemService.getSkuSimpleInfo(sku,langId,companyId);
        return new BaseReturnVO(skuSimpleInfoTO);
    }

    @RequestMapping("/listSkuListNew")
    @ResponseBody
    public BaseReturnVO listSkuListNew(@RequestBody String jsonData){

        JSONObject jsObject = JSONObject.parseObject(jsonData);
        List<FilterModelTO> filterModels = jsObject.getJSONArray("filterModels").toJavaList(FilterModelTO.class);

        int langId= jsObject.getIntValue("langId");
        int offset= jsObject.getIntValue("offset");
        int pageSize= jsObject.getIntValue("pageSize");

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

}

