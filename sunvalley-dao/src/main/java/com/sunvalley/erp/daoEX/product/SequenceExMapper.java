/*
* Copyright (c) 2017 sunvalley. All Rights Reserved.
*/
package com.sunvalley.erp.daoEX.product;

import com.sunvalley.erp.model.product.Sequence;
import org.springframework.stereotype.Repository;

import java.util.Map;

/**
 * 类或方法的功能描述 :TODO
 *
 * @Author: douglas.jiang
 * @Date: 2017-09-15 11:08
 */
@Repository
public interface SequenceExMapper {

    int update(String name);

    int updatesome(Map<String,Object> param);

    int insert(Sequence sequence);

    Sequence select(String name);

    Sequence selectone(String name);

    int getSeq(Sequence sequence);


}

