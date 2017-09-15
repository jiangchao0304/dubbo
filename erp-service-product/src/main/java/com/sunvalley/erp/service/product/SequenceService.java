/*
* Copyright (c) 2017 sunvalley. All Rights Reserved.
*/
package com.sunvalley.erp.service.product;

import com.sunvalley.erp.daoEX.product.SequenceExMapper;
import com.sunvalley.erp.model.product.Sequence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

/**
 * 类或方法的功能描述 :TODO
 *
 * @Author: douglas.jiang
 * @Date: 2017-09-15 16:07
 */
@Service
public class SequenceService {

    @Autowired
    private  SequenceExMapper sequenceExMapper;

    public static final short STEP=1;
    public static final int VALUE=1;
    public static final int START=1;

    public synchronized String getNextIdSkuCodeY6(String name){
        if (name==null || "".equals(name)) return "";
//        DataSourceTransactionManager transactionManager = (DataSourceTransactionManager) Env
//                .getBean("transactionManager");
//        DefaultTransactionDefinition td = new DefaultTransactionDefinition(
//                TransactionDefinition.PROPAGATION_REQUIRES_NEW); // 鏂板紑涓�釜浜嬪姟
//        TransactionStatus status = transactionManager.getTransaction(td);
        Sequence seq = sequenceExMapper.select(name);
        if (seq == null) {
            seq = new Sequence();
            seq.setStep(STEP);
            seq.setStart(START);
            seq.setValue(VALUE);
            sequenceExMapper.insert(seq);
        }
        sequenceExMapper.update( name);
        //transactionManager.commit(status);
        String suffixCode =  String.format("%06d", seq.getValue());
        String skuCode = name+suffixCode.substring(0, 3)+"-"+suffixCode.substring(3, suffixCode.length());
        return skuCode;
    }


    public synchronized String getNextIdSkuCodeY3(String name){
        if (name==null || "".equals(name)) return "";
//        DataSourceTransactionManager transactionManager = (DataSourceTransactionManager) Env
//                .getBean("transactionManager");
//        DefaultTransactionDefinition td = new DefaultTransactionDefinition(
//                TransactionDefinition.PROPAGATION_REQUIRES_NEW); // 鏂板紑涓�釜浜嬪姟
//        TransactionStatus status = transactionManager.getTransaction(td);
        Sequence seq = (Sequence) sequenceExMapper.select( name);
        if (seq == null) {
            seq = new Sequence();
            seq.setStep(STEP);
            seq.setStart(START);
            seq.setValue(VALUE);
            sequenceExMapper.insert(seq);
        }
        sequenceExMapper.update( name);

        //transactionManager.commit(status);
        String suffixCode =  String.format("%03d", seq.getValue());
        String skuCode = name+suffixCode;
        return skuCode;
    }
}

