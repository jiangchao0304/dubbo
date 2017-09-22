/*
* Copyright (c) 2017 sunvalley. All Rights Reserved.
*/
package com.sunvalley.erp.face.product;

import com.sunvalley.erp.domain.common.dto.FilterModel;
import com.sunvalley.erp.domain.common.dto.Pager;
import com.sunvalley.erp.domain.product.dto.SkuBaseInfoDTO;
import com.sunvalley.erp.domain.product.dto.SkuListNewDTO;

import java.util.List;

/**
 * sku服务
 *
 * @Author: douglas.jiang
 * @Date: 2017-09-12 11:46
 */
public interface ISkuService {


    String searchSku(String q, int langId, int limit, Integer companyId);


    SkuBaseInfoDTO getSkuBaseInfo(int skuId);

    SkuBaseInfoDTO getSkuBaseInfo(String sku);

    boolean updateSkuBaseInfo(SkuBaseInfoDTO dto);

    boolean saveSkuBaseInfo(SkuBaseInfoDTO dto);


    Pager<SkuListNewDTO> listskuListNew(List<FilterModel> filterModels, int offset, int pageSize);
}

