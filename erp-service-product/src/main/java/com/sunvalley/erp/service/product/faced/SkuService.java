/*
* Copyright (c) 2017 sunvalley. All Rights Reserved.
*/
package com.sunvalley.erp.service.product.faced;

import com.sunvalley.erp.dao.product.ItemMapper;
import com.sunvalley.erp.model.product.Item;
import com.sunvalley.erp.model.product.ItemLocale;
import com.sunvalley.erp.service.product.ItemService;
import com.sunvalley.erp.util.json.JsonParse;
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
public class SkuService implements com.sunvalley.face.erp.product.SkuService {


    @Autowired
    private ItemMapper itemMapper;

    @Autowired
    private ItemService itemService;

    @Override
    public String getSkuBaseInfo(String sku) {
        ResponseBean responseBean = new ResponseBean();
        Item item = itemMapper.selectByPrimaryKey(4624);
        responseBean.setJsonContent(JsonParse.toJson(item));
        return JsonParse.toJson(responseBean);
    }

    @Override
    public String searchSku(String q,int langId, int limit,Integer companyId){
        ResponseBean responseBean = new ResponseBean();
        List<ItemLocale> list = itemService.searchSkuCategoryName(q, langId,new int[]{},limit,companyId);
        responseBean.setJsonContent(JsonParse.toJson(list));
        return JsonParse.toJson(responseBean);
    }
}

