/*
* Copyright (c) 2017 sunvalley. All Rights Reserved.
*/
package com.sunvalley.erp.service.product;

import com.sunvalley.faced.base.ResponseBean;
import com.sunvalley.faced.erp.product.ISkuService;
import org.springframework.stereotype.Service;
import com.sunvalley.erp.util.redis.RedisUtil;

/**
 * SKU service
 *
 * @Author: douglas.jiang
 * @Date: 2017-09-04 10:56
 */
@Service
public class SkuService implements ISkuService {



    @Override
    public ResponseBean getSkuBaseInfo(String sku) {
        ResponseBean responseBean = new ResponseBean();
        return null;
    }
}

