package com.sunvalley.erp.daoEX.product;

import java.util.HashMap;
import java.util.List;
import com.sunvalley.erp.modelEX.product.PrepareSkuEx;

public interface PrepareSkuExMapper {

	
	List<PrepareSkuEx> initByModel(HashMap<String, Object> map);

	List<PrepareSkuEx> preSkuGrid(HashMap<String, Object> map);

	List<PrepareSkuEx> packageSkuList(HashMap<String, Object> map);


}
