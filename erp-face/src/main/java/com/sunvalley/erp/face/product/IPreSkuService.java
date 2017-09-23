/*
* Copyright (c) 2017 sunvalley. All Rights Reserved.
*/
package com.sunvalley.erp.face.product;

import com.sunvalley.erp.to.common.PagerTO;
import com.sunvalley.erp.to.product.ModelAndPreSkuTO;
import com.sunvalley.erp.to.common.FilterModelTO;
import com.sunvalley.erp.to.product.PreSkuTO;
import com.sunvalley.erp.to.product.SkuBaseInfoTO;

import java.util.HashMap;
import java.util.List;

/**
 * 类或方法的功能描述 :TODO
 *
 * @Author: douglas.jiang
 * @Date: 2017-09-13 13:10
 */
public interface IPreSkuService {

    PreSkuTO getByModel(String modelName, Integer status);

    PreSkuTO saveModel(PreSkuTO preSkuDTO);

    String getPreSkuGrid(HashMap<String, Object> map);

    String ListpackageSku(HashMap<String, Object> map);

    SkuBaseInfoTO getPreSkuBaseInfo(Integer skuId, Integer modelId);

    PagerTO<ModelAndPreSkuTO> listModelAndPreSku(List<FilterModelTO> filterModels, int offset, int pageSize);
}

