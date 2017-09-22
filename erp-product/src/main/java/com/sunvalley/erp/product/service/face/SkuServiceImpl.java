/*
* Copyright (c) 2017 sunvalley. All Rights Reserved.
*/
package com.sunvalley.erp.product.service.face;

import com.sunvalley.erp.common.util.JsonUtil;
import com.sunvalley.erp.domain.common.dto.FilterModel;
import com.sunvalley.erp.domain.common.dto.Pager;
import com.sunvalley.erp.domain.product.dto.SkuBaseInfoDTO;
import com.sunvalley.erp.domain.product.dto.SkuListNewDTO;
import com.sunvalley.erp.product.model.ItemLocale;
import com.sunvalley.erp.product.service.ItemService;
import com.sunvalley.erp.product.service.PrepareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * SKU service
 *
 * @Author: douglas.jiang
 * @Date: 2017-09-04 10:56
 */
@Service
public class SkuServiceImpl implements com.sunvalley.erp.face.product.ISkuService {

    @Autowired
    private ItemService itemService;

    @Autowired
    private PrepareService prepareService;


    @Override
    public String searchSku(String q,int langId, int limit,Integer companyId){
        //ResponseBean responseBean = new ResponseBean();
        List<ItemLocale> list = itemService.searchSkuCategoryName(q, langId,new int[]{},limit,companyId);
        //responseBean.setJsonContent(JsonUtil.toJson(list));
        return JsonUtil.toJson(list);
    }

    @Override
    public SkuBaseInfoDTO getSkuBaseInfo(int skuId) {
        return itemService.getSkuBaseInfo(skuId);
    }

    @Override
    public SkuBaseInfoDTO getSkuBaseInfo(String sku) {
        return itemService.getSkuBaseInfo(sku);
    }

    @Override
    public boolean updateSkuBaseInfo(SkuBaseInfoDTO dto) {

        return  prepareService.updateSkuBaseInfo(dto);
    }

    @Override
    public boolean saveSkuBaseInfo(SkuBaseInfoDTO dto) {

        return  prepareService.saveSkuBaseInfo(dto);
    }

    @Override
    public Pager<SkuListNewDTO> listskuListNew(List<FilterModel> filterModels, int offset, int pageSize) {
        return itemService.listskuListNew(filterModels,offset,pageSize);
    }
}

