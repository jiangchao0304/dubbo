/*
* Copyright (c) 2017 sunvalley. All Rights Reserved.
*/
package com.sunvalley.erp.product.daoEX;

import com.sunvalley.erp.product.modelEX.BomLogEx;
import com.sunvalley.erp.to.product.BomLogTO;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

/**
 * 类或方法的功能描述 :TODO
 *
 * @Author: douglas.jiang
 * @Date: 2017-09-26 18:57
 */
@Repository
public interface BomLogExMapper {


    List<BomLogEx> selectLogPageList(HashMap<String, Object> param);

    int selectLogPageCount(HashMap<String, Object> param);

    List<BomLogTO> selectLogList(HashMap<String, Object> param);

    int selectLogCount(int skuid);

}

