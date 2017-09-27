/*
* Copyright (c) 2017 sunvalley. All Rights Reserved.
*/
package com.sunvalley.erp.product.service.face;

import com.sunvalley.erp.face.product.IBomService;
import com.sunvalley.erp.product.service.BomsService;
import com.sunvalley.erp.product.service.ItemLogService;
import com.sunvalley.erp.to.product.BomTO;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 类或方法的功能描述 :TODO
 *
 * @Author: douglas.jiang
 * @Date: 2017-09-26 19:11
 */
public class BomServiceImpl implements IBomService {


    @Autowired
    private BomsService bomsService;

    @Autowired
    private ItemLogService itemLogService;

    @Override
    public BomTO getBomInfo(Integer bomId, Integer skuid) {

        return  bomsService.getBom(bomId,skuid);
    }
}

