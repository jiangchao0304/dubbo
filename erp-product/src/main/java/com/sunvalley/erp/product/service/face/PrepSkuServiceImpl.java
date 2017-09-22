/*
* Copyright (c) 2017 sunvalley. All Rights Reserved.
*/
package com.sunvalley.erp.product.service.face;

import com.sunvalley.erp.domain.common.dto.FilterModel;
import com.sunvalley.erp.domain.common.dto.Pager;
import com.sunvalley.erp.domain.product.dto.ModelAndPreSkuDTO;
import com.sunvalley.erp.domain.product.dto.PreSkuDTO;
import com.sunvalley.erp.domain.product.dto.SkuBaseInfoDTO;
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
    public PreSkuDTO getByModel(String modelName, Integer status) {
        return  prepareService.getByModel(modelName,status);
    }

    @Override
    public PreSkuDTO saveModel(PreSkuDTO preSkuDTO) {
        PreSkuDTO result = prepareService.saveModel(preSkuDTO);
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
    public SkuBaseInfoDTO getPreSkuBaseInfo(Integer skuId, Integer modelId) {
        return prepareService.getPreSkuBaseInfo(skuId,modelId);
    }

    @Override
    public Pager<ModelAndPreSkuDTO> listModelAndPreSku(List<FilterModel> filterModels, int offset, int pageSize) {

        Pager<ModelAndPreSkuDTO> result = prepareService.listModelAndPreSku(filterModels,offset,pageSize);
        return  result;

    }
}

