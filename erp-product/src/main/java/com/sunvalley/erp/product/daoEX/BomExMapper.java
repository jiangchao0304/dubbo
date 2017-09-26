/*
* Copyright (c) 2017 sunvalley. All Rights Reserved.
*/
package com.sunvalley.erp.product.daoEX;

import com.sunvalley.erp.product.modelEX.BomEX;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

/**
 * 类或方法的功能描述 :TODO
 *
 * @Author: douglas.jiang
 * @Date: 2017-09-26 15:33
 */
@Repository
public interface BomExMapper {
    BomEX selectById(HashMap<String, Object> map);

     int selectTotalChild(Integer skuid);
     int selectTotalParent(Integer skuid);
}

