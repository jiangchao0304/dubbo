/*
* Copyright (c) 2017 sunvalley. All Rights Reserved.
*/
package com.sunvalley.erp.face.product;

import com.sunvalley.erp.domain.product.dto.ModelAndPreSkuDTO;
import com.sunvalley.erp.domain.common.dto.FilterModel;
import com.sunvalley.erp.domain.common.dto.Pager;
import com.sunvalley.erp.domain.product.dto.PreSkuDTO;
import com.sunvalley.erp.domain.product.dto.SkuBaseInfoDTO;

import java.util.HashMap;
import java.util.List;

/**
 * 类或方法的功能描述 :TODO
 *
 * @Author: douglas.jiang
 * @Date: 2017-09-13 13:10
 */
public interface IPreSkuService {

    PreSkuDTO getByModel(String modelName, Integer status);

    PreSkuDTO saveModel(PreSkuDTO preSkuDTO);

    String getPreSkuGrid(HashMap<String, Object> map);

    String ListpackageSku(HashMap<String, Object> map);

    SkuBaseInfoDTO getPreSkuBaseInfo(Integer skuId, Integer modelId);

    Pager<ModelAndPreSkuDTO> listModelAndPreSku(List<FilterModel> filterModels, int offset, int pageSize);
}

