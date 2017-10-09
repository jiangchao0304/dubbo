/*
* Copyright (c) 2017 sunvalley. All Rights Reserved.
*/
package com.sunvalley.erp.product.daoEX;

import com.sunvalley.erp.to.product.ItemVideoTO;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 类或方法的功能描述 :TODO
 *
 * @Author: douglas.jiang
 * @Date: 2017-10-10 18:20
 */
@Repository
public interface VideoExMapper {
    List<ItemVideoTO> selectBySkuId(int skuId);
}

