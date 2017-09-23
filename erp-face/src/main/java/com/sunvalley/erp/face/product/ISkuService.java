/*
* Copyright (c) 2017 sunvalley. All Rights Reserved.
*/
package com.sunvalley.erp.face.product;

import com.sunvalley.erp.to.common.FilterModelTO;
import com.sunvalley.erp.to.common.PagerTO;
import com.sunvalley.erp.to.product.SkuBaseInfoTO;

import java.util.List;

/**
 * sku服务
 *
 * @Author: douglas.jiang
 * @Date: 2017-09-12 11:46
 */
public interface ISkuService {


    String searchSku(String q, int langId, int limit, Integer companyId);


    SkuBaseInfoTO getSkuBaseInfo(int skuId);

    SkuBaseInfoTO getSkuBaseInfo(String sku);

    boolean updateSkuBaseInfo(SkuBaseInfoTO dto);

    boolean saveSkuBaseInfo(SkuBaseInfoTO dto);


    PagerTO<com.sunvalley.erp.to.product.SkuListNewTO> listskuListNew(List<FilterModelTO> filterModels, int offset, int pageSize);
}
