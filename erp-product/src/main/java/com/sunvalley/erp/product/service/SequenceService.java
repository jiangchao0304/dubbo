/*
* Copyright (c) 2017 sunvalley. All Rights Reserved.
*/
package com.sunvalley.erp.product.service;
import com.sunvalley.erp.common.constants.Constants;
import com.sunvalley.erp.common.exception.BusinessException;
import com.sunvalley.erp.product.dao.ItemBrandMapper;
import com.sunvalley.erp.product.dao.ItemMapper;
import com.sunvalley.erp.product.dao.ItemModelMapper;
import com.sunvalley.erp.product.dao.PrepareSkuMapper;
import com.sunvalley.erp.product.dao.ProductLineMapper;
import com.sunvalley.erp.product.daoEX.SequenceExMapper;
import com.sunvalley.erp.product.model.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * 类或方法的功能描述 :TODO
 *
 * @Author: douglas.jiang
 * @Date: 2017-09-15 16:07
 */
@Service
public class SequenceService {

    //#region Autowired
    @Autowired
    private  SequenceExMapper sequenceExMapper;
    //#endregion


    private static Logger logger = LoggerFactory.getLogger(SequenceService.class);



    public static final short STEP=1;
    public static final int VALUE=1;
    public static final int START=1;
    //使用存储过程事物控制
    @Transactional(readOnly = false, propagation = Propagation.NOT_SUPPORTED)
    public int getSeq(String name){
        Sequence sq = new Sequence();
        sq.setName(name);
        int value = sequenceExMapper.getSeq(sq);
        return  value;
    }

}

