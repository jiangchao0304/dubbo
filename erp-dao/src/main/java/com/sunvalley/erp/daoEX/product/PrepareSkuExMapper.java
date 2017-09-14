package com.sunvalley.erp.daoEX.product;

import java.util.HashMap;
import java.util.List;

import com.sunvalley.erp.domain.product.dto.PackageSkuDTO;
import com.sunvalley.erp.domain.product.dto.PreSkuGridDTO;
import com.sunvalley.erp.modelEX.product.PrepareSkuEx;

public interface PrepareSkuExMapper {

	
	List<PrepareSkuEx> initByModel(HashMap<String, Object> map);

	List<PreSkuGridDTO> preSkuGrid(HashMap<String, Object> map);

	List<PackageSkuDTO> packageSkuList(HashMap<String, Object> map);


}
