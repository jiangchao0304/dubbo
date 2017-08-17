/*
* Copyright (c) 2017 sunvalley. All Rights Reserved.
*/
package com.sunvalley.erp.service.product;

import com.sunvalley.erp.api.product.IEcnService;
import com.sunvalley.domain.erp.product.dto.EcnReasonDto;
import com.sunvalley.erp.dao.product.EcnReasonMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 类或方法的功能描述 :TODO
 *
 * @Author: douglas.jiang
 * @Date: 2017-08-17 18:25
 */
public class EcnService implements IEcnService {
    @Autowired
    private EcnReasonMapper ecnReasonMapper;
    @Override
    public EcnReasonDto getEcnReasonRemark(int id) {
        return null;
    }
}

