/*
* Copyright (c) 2017 sunvalley. All Rights Reserved.
* @Owner:douglas.jiang
* @Date:  2017-10-17 19:05
*/
package com.sunvalley.erp.product.daoEX;

import org.springframework.stereotype.Repository;

import java.util.Map;

/**
 * 类或方法的功能描述 :TODO
 *
 * @Author: douglas.jiang
 * @Date: 2017-10-17 19:05
 */
@Repository
public interface ItemVirtualExMapper {
    int copyVirtualFromSku(Map<String, Object> param);
    Integer checkSubSkuLevel(String sku);
}

