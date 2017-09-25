/*
* Copyright (c) 2017 sunvalley. All Rights Reserved.
* owner:
*/
package com.sunvalley.erp.product.service.face;

import com.sunvalley.erp.to.common.FilterModelTO;
import com.sunvalley.erp.to.common.PagerTO;
import com.sunvalley.erp.to.product.ModelAndPreSkuTO;
import com.sunvalley.erp.to.product.PreSkuTO;
import com.sunvalley.erp.to.product.SkuBaseInfoTO;
import com.sunvalley.erp.product.service.PrepareService;
import com.sunvalley.erp.face.product.IPreSkuService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;

/**
 * 类或方法的功能描述 :TODO
 *
 * @Author: douglas.jiang
 * @Date: 2017-09-13 13:06
 */
public class PrepSkuServiceImpl implements IPreSkuService {

    @Autowired
    private PrepareService prepareService;

    @Override
    public PreSkuTO getByModel(String modelName, Integer status) {
        return  prepareService.getByModel(modelName,status);
    }

    @Override
    public PreSkuTO saveModel(PreSkuTO preSkuTO) {
        PreSkuTO result = prepareService.saveModel(preSkuTO);
        return  result;
    }



    @Override
    public String getPreSkuGrid(HashMap<String, Object> map) {
        return null;
    }

    @Override
    public String ListpackageSku(HashMap<String, Object> map) {
        return null;
    }

    @Override
    public SkuBaseInfoTO getPreSkuBaseInfo(Integer skuId, Integer modelId,Integer type) {
        return prepareService.getPreSkuBaseInfo(skuId,modelId,type);
    }

    @Override
    public PagerTO<ModelAndPreSkuTO> listModelAndPreSku(List<FilterModelTO> filterModels, int offset, int pageSize) {

        PagerTO<ModelAndPreSkuTO> result = prepareService.listModelAndPreSku(filterModels,offset,pageSize);
        return  result;

    }
}

