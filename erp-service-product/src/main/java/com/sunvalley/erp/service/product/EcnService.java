/*
* Copyright (c) 2017 sunvalley. All Rights Reserved.
*/
package com.sunvalley.erp.service.product;

import com.sunvalley.erp.api.product.IEcnService;
import com.sunvalley.erp.domain.product.dto.EcnReasonDto;

/**
 * 类或方法的功能描述 :TODO
 *
 * @Author: douglas.jiang
 * @Date: 2017-08-17 18:25
 */
public class EcnService implements IEcnService {
//    @Autowired
//    private EcnReasonMapper ecnReasonMapper;
    @Override
    public EcnReasonDto getEcnReasonRemark(int id) {

        //EcnReason model = ecnReasonMapper.selectByPrimaryKey(1);
        EcnReasonDto dto = new EcnReasonDto();
        dto.setReasonName("test");
        return dto;
    }
}

