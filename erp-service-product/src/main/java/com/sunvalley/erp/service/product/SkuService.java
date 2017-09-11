/*
* Copyright (c) 2017 sunvalley. All Rights Reserved.
*/
package com.sunvalley.erp.service.product;

import com.sunvalley.erp.dao.product.ItemMapper;
import com.sunvalley.erp.model.product.Item;
import com.sunvalley.faced.base.ResponseBean;
import com.sunvalley.faced.erp.product.ISkuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * SKU service
 *
 * @Author: douglas.jiang
 * @Date: 2017-09-04 10:56
 */
@Service
public class SkuService implements ISkuService {


    @Autowired
    private ItemMapper itemMapper;

    @Override
    public ResponseBean getSkuBaseInfo(String sku) {
        ResponseBean responseBean = new ResponseBean();
        Item item = itemMapper.selectByPrimaryKey(1000);
        responseBean.setJsonContent(item.getSku());
        return responseBean;
    }
}

