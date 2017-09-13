/*
* Copyright (c) 2017 sunvalley. All Rights Reserved.
*/
package com.sunvalley.erp.service.product.face;

import com.sunvalley.erp.domain.product.vo.PrepareSkuBaseInfoVO;
import com.sunvalley.erp.model.product.PrepareSku;
import com.sunvalley.erp.service.product.PrepareService;
import com.sunvalley.erp.util.json.JsonParse;
import com.sunvalley.face.base.ResponseBean;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;

/**
 * 类或方法的功能描述 :TODO
 *
 * @Author: douglas.jiang
 * @Date: 2017-09-13 13:06
 */
public class PrepareSkuService implements com.sunvalley.face.erp.product.PrepareSkuService {

    @Autowired
    private PrepareService prepareService;

    @Override
    public String getByModel(String modelName, Integer status) {

        ResponseBean responseBean = new ResponseBean();
        PrepareSkuBaseInfoVO vo;
        try {
             vo = prepareService.getByModel(modelName,status);
            responseBean.setJsonContent(JsonParse.toJson(vo));
        }catch (Exception ex){
            responseBean.setJsonContent(ex.getMessage());
        }

        return JsonParse.toJson(responseBean);

    }

    @Override
    public String getPreSkuGrid(HashMap<String, Object> map) {
        return null;
    }

    @Override
    public String ListpackageSku(HashMap<String, Object> map) {
        return null;
    }
}

