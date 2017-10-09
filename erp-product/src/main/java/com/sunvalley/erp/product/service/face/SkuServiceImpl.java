/*
* Copyright (c) 2017 sunvalley. All Rights Reserved.
*/
package com.sunvalley.erp.product.service.face;

import com.sunvalley.erp.common.util.JsonUtil;
import com.sunvalley.erp.face.product.ISkuService;
import com.sunvalley.erp.to.common.FilterModelTO;
import com.sunvalley.erp.to.common.PagerTO;
import com.sunvalley.erp.to.product.*;
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
public class SkuServiceImpl implements ISkuService {

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
    public SkuBaseInfoTO getSkuBaseInfo(int skuId) {
        return itemService.getSkuBaseInfo(skuId);
    }

    @Override
    public SkuBaseInfoTO getSkuBaseInfo(String sku) {
        return itemService.getSkuBaseInfo(sku);
    }

    @Override
    public boolean updateSkuBaseInfo(SkuBaseInfoTO dto) {

        return  prepareService.updateSkuBaseInfo(dto);
    }

    @Override
    public PreSkuRelationTO saveSkuBaseInfo(SkuBaseInfoTO dto) {

        return  prepareService.saveSkuBaseInfo(dto);
    }

    @Override
    public CustomsInfoTO getCustomsInfo(int skuId) {
        return itemService.getCustomsInfo(skuId);
    }

    @Override
    public List<SkuDescTO> listBySameModel(String sku) {
        return itemService.listBySameModel(sku);
    }

    @Override
    public PagerTO<SkuListNewTO> listskuListNew(List<FilterModelTO> filterModels, int langId,int offset, int pageSize) {
        return itemService.listskuListNew(filterModels,langId,offset,pageSize);
    }
}

