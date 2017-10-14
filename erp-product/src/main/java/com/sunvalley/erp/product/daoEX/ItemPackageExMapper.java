/*
* Copyright (c) 2017 sunvalley. All Rights Reserved.
* @Owner:douglas.jiang
* @Date:  2017-10-14 16:40
*/
package com.sunvalley.erp.product.daoEX;

import com.sunvalley.erp.to.product.PackingBoxTO;
import org.springframework.stereotype.Repository;

/**
 * 类或方法的功能描述 :TODO
 *
 * @Author: douglas.jiang
 * @Date: 2017-10-14 16:40
 */
@Repository
public interface ItemPackageExMapper {

    PackingBoxTO getBySkuId(int skuId);
}

