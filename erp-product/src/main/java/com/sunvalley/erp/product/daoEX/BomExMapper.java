/*
* Copyright (c) 2017 sunvalley. All Rights Reserved.
*/
package com.sunvalley.erp.product.daoEX;

import com.sunvalley.erp.product.modelEX.BomEX;
import com.sunvalley.erp.product.modelEX.BomSupplierEX;
import com.sunvalley.erp.to.product.BomSupplierTO;
import com.sunvalley.erp.to.product.BomTO;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

/**
 * 类或方法的功能描述 :TODO
 *
 * @Author: douglas.jiang
 * @Date: 2017-09-26 15:33
 */
@Repository
public interface BomExMapper {
    List<BomTO> selectSkuInfoBySKuid(HashMap<String, Object> map);

    List<BomSupplierTO> selectBomSupplier(HashMap<String, Object> map);

    List<BomTO> selectSkuInfoList(HashMap<String, Object> param);

     BomTO selectById(HashMap<String, Object> map);

     int selectTotalChild(Integer skuid);

     int selectTotalParent(Integer skuid);
}

