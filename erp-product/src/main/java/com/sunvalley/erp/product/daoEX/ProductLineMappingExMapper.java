/*
* Copyright (c) 2017 sunvalley. All Rights Reserved.
*/
package com.sunvalley.erp.product.daoEX;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * 类或方法的功能描述 :TODO
 *
 * @Author: douglas.jiang
 * @Date: 2017-09-22 16:26
 */
@Repository
public interface ProductLineMappingExMapper {

    List<com.sunvalley.erp.to.product.ProductLineMappingTO> getProductLineMappingList(Map<String,Object> map);
}

