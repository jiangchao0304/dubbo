/*
* Copyright (c) 2017 sunvalley. All Rights Reserved.
*/
package com.sunvalley.erp.service.product.face;

import com.sunvalley.domain.FilterModel;
import com.sunvalley.domain.Pager;
import com.sunvalley.domain.erp.product.dto.ModelAndPreSkuDTO;
import com.sunvalley.domain.erp.product.dto.PreSkuDTO;
import com.sunvalley.domain.erp.product.dto.SkuBaseInfoDTO;
import com.sunvalley.erp.service.product.PrepareService;
import com.sunvalley.face.erp.product.IPreSkuService;
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
    public Pager<ModelAndPreSkuDTO> listModelAndPreSku(List<FilterModel> filterModels, int offset, int pageSize) {

        Pager<ModelAndPreSkuDTO> result = prepareService.listModelAndPreSku(filterModels,offset,pageSize);
        return  result;

    }
}

