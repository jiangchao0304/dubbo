/*
* Copyright (c) 2017 sunvalley. All Rights Reserved.
*/
package com.sunvalley.erp.service.product.face;

import com.sunvalley.common.util.JsonUtil;
import com.sunvalley.domain.FilterModel;
import com.sunvalley.domain.Pager;
import com.sunvalley.domain.erp.product.dto.SkuBaseInfoDTO;
import com.sunvalley.domain.erp.product.dto.SkuListNewDTO;
import com.sunvalley.domain.erp.product.dto.UpdateSkuBaseInfoDTO;
import com.sunvalley.erp.dao.product.ItemMapper;
import com.sunvalley.erp.model.product.Item;
import com.sunvalley.erp.model.product.ItemLocale;
import com.sunvalley.erp.service.product.ItemService;
import com.sunvalley.common.util.JsonUtil;
import com.sunvalley.erp.service.product.PrepareService;
import com.sunvalley.face.base.ResponseBean;
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
public class SkuServiceImpl implements com.sunvalley.face.erp.product.ISkuService {

    @Autowired
    private ItemService itemService;

    @Autowired
    private PrepareService prepareService;


    @Override
    public String searchSku(String q,int langId, int limit,Integer companyId){
        ResponseBean responseBean = new ResponseBean();
        List<ItemLocale> list = itemService.searchSkuCategoryName(q, langId,new int[]{},limit,companyId);
        responseBean.setJsonContent(JsonUtil.toJson(list));
        return JsonUtil.toJson(responseBean);
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
    public boolean updateSkuBaseInfo(UpdateSkuBaseInfoDTO dto) {

        return  prepareService.updateSkuBaseInfo(dto);
    }

    @Override
    public Pager<SkuListNewDTO> listskuListNew(List<FilterModel> filterModels, int offset, int pageSize) {
        return itemService.listskuListNew(filterModels,offset,pageSize);
    }
}

