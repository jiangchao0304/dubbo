/*
* Copyright (c) 2017 sunvalley. All Rights Reserved.
*/
package com.sunvalley.erp.face.product;

import com.sunvalley.erp.to.product.BomTO;

/**
 * 类或方法的功能描述 :TODO
 *
 * @Author: douglas.jiang
 * @Date: 2017-09-26 19:01
 */
public interface IBomService {

    BomTO getBomInfo(Integer bomId, Integer skuid);
}

