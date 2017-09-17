/*
* Copyright (c) 2017 sunvalley. All Rights Reserved.
*/
package com.sunvalley.erp.service.product.face;

import com.sunvalley.domain.FilterModel;
import com.sunvalley.domain.Pager;
import com.sunvalley.domain.erp.product.dto.ModelAndPreSkuDTO;
import com.sunvalley.domain.erp.product.dto.PreSkuDTO;
import com.sunvalley.erp.service.product.PrepareService;
import com.sunvalley.face.base.ResponseObj;
import com.sunvalley.face.erp.product.IPreSkuService;
import com.sunvalley.face.exception.FaceException;
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

        throw  new FaceException("exception test");
        //return  prepareService.getByModel(modelName,status);


    }

    @Override
    public ResponseObj<PreSkuDTO> saveModel(PreSkuDTO preSkuDTO) {

        ResponseObj<PreSkuDTO> result = new ResponseObj<>();
        try{
            PreSkuDTO dto = prepareService.saveModel(preSkuDTO);
            result.setData(dto);
            result.setResponseCode(0);
        }catch (Exception ex){
            result.setResponseCode(-1);
            result.setErrorMessage(ex.getMessage());
        }
      return result;

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
    public ResponseObj<Pager<ModelAndPreSkuDTO>> listModelAndPreSku(List<FilterModel> filterModels, int offset, int pageSize) {

        ResponseObj<Pager<ModelAndPreSkuDTO>> result = new ResponseObj<>();
        try {
            Pager<ModelAndPreSkuDTO> pager = prepareService.listModelAndPreSku(filterModels,offset,pageSize);
            result.setData(pager);
            result.setResponseCode(0);
        }catch (Exception ex){
            result.setResponseCode(-1);
            result.setErrorMessage(ex.getMessage());
        }
        return  result;


    }
}

