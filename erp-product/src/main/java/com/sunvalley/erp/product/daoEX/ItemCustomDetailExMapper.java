/*
* Copyright (c) 2017 sunvalley. All Rights Reserved.
* @Owner:douglas.jiang
* @Date:  2017-10-14 17:21
*/
package com.sunvalley.erp.product.daoEX;

import com.sunvalley.erp.to.product.CustomsInfoDetailTO;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 类或方法的功能描述 :TODO
 *
 * @Author: douglas.jiang
 * @Date: 2017-10-14 17:21
 */
@Repository
public interface ItemCustomDetailExMapper {
    List<CustomsInfoDetailTO> listBySkuId(int skuId);
}

