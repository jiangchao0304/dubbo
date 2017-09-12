/*
* Copyright (c) 2017 sunvalley. All Rights Reserved.
*/
package com.sunvalley.faced.erp.product;

import com.sunvalley.faced.base.ResponseBean;

/**
 * sku service.
 *
 * @Author: douglas.jiang
 * @Date: 2017-09-04 10:44
 */
public interface ISkuService {

    String getSkuBaseInfo(String sku);

    String searchSku(String q,int langId, int limit,Integer companyId);
}

