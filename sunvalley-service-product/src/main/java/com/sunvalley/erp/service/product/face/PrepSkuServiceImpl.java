/*
* Copyright (c) 2017 sunvalley. All Rights Reserved.
*/
package com.sunvalley.erp.service.product.face;

import com.sunvalley.erp.domain.product.dto.ModelAndPreSkuDTO;
import com.sunvalley.erp.domain.product.dto.PreSkuSaveDTO;
import com.sunvalley.erp.domain.product.dto.PreSkuDTO;
import com.sunvalley.erp.entity.FilterModel;
import com.sunvalley.erp.entity.Pager;
import com.sunvalley.erp.service.product.PrepareService;
import com.sunvalley.erp.util.json.JsonParse;
import com.sunvalley.face.base.ResponseBean;
import com.sunvalley.face.base.ResponseObj;
import com.sunvalley.face.erp.product.IPreSkuService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    public String getByModel(String modelName, Integer status) {

        ResponseBean responseBean = new ResponseBean();

        Map<String,Object> result = new HashMap<>();
        result.put("responseCode",1);


        PreSkuDTO vo;
        try {
             vo = prepareService.getByModel(modelName,status);
            result.put("jsonContent",vo);
            responseBean.setJsonContent(JsonParse.toJson(vo));
        }catch (Exception ex){
            responseBean.setJsonContent(ex.getMessage());
        }

        return JsonParse.toJson(result);

    }

    @Override
    public String saveModel(String jsonData) {

      PreSkuSaveDTO preSkuSaveVO = (PreSkuSaveDTO)JsonParse.fromJson(jsonData, PreSkuSaveDTO.class);
      prepareService.save(preSkuSaveVO);

      return "1";

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

