/*
* Copyright (c) 2017 sunvalley. All Rights Reserved.
*/
package com.sunvalley.erp.product.daoEX;

import com.sunvalley.erp.to.product.CustomsInfoTO;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

/**
 * 类或方法的功能描述 :TODO
 *
 * @Author: douglas.jiang
 * @Date: 2017-09-29 18:21
 */
@Repository
public interface ItemCustomExMapper {
    CustomsInfoTO getCustomsInfo(Map<String,Object> map);
}

