/*
* Copyright (c) 2017 sunvalley. All Rights Reserved.
*/
package com.sunvalley.erp.product.controller;

import com.sunvalley.erp.common.component.filtersql.FilterModel;
import com.sunvalley.erp.common.util.JsonUtil;
import com.sunvalley.erp.product.service.PrepareService;
import com.sunvalley.erp.product.vo.BaseReturnVO;
import com.sunvalley.erp.to.common.PagerTO;
import com.sunvalley.erp.to.product.ModelAndPreSkuTO;
import com.sunvalley.erp.to.product.PreSkuTO;
import com.sunvalley.erp.to.product.SkuBaseInfoTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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

        String modelName=JsonUtil.getString(jsonData,"modelName");
        Integer status= JsonUtil.getInteger(jsonData,"status");
        PreSkuTO result = prepareService.getByModel(null,modelName,status);
        return  new BaseReturnVO(result);
    }

    @RequestMapping("/getByModelId")
    @ResponseBody
    public BaseReturnVO getByModelId(@RequestBody String jsonData) {
        Integer modelId= JsonUtil.getInteger(jsonData,"modelId");
        Integer status= JsonUtil.getInteger(jsonData,"status");
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
        Integer skuId= JsonUtil.getInteger(jsonData,"skuId");
        Integer modelId= JsonUtil.getInteger(jsonData,"modelId");
        Integer type= JsonUtil.getInteger(jsonData,"type");
        SkuBaseInfoTO result =  prepareService.getPreSkuBaseInfo(skuId,modelId,type);
        return  new BaseReturnVO(result);
    }

    @RequestMapping("/listModelAndPreSku")
    @ResponseBody
    public BaseReturnVO listModelAndPreSku(@RequestBody String jsonData) {

        List<FilterModel> filterModels = JsonUtil.fromJSONArray(jsonData,"filterModels",FilterModel.class);

        int offset= JsonUtil.getInteger(jsonData,"offset");

        int pageSize= JsonUtil.getInteger(jsonData,"pageSize");

        PagerTO<ModelAndPreSkuTO> result = prepareService.listModelAndPreSku(filterModels,offset,pageSize);
        return  new BaseReturnVO(result);

    }


}

