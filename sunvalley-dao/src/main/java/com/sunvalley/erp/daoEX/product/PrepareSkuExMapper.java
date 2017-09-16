package com.sunvalley.erp.daoEX.product;

import java.util.HashMap;
import java.util.List;

import com.sunvalley.domain.erp.product.dto.ModelAndPreSkuDTO;
import com.sunvalley.domain.erp.product.dto.PackageSkuDTO;
import com.sunvalley.domain.erp.product.dto.PreSkuDTO;
import com.sunvalley.domain.erp.product.dto.PreSkuGridDTO;
import com.sunvalley.erp.modelEX.product.PrepareSkuEx;

public interface PrepareSkuExMapper {

	
	List<PreSkuDTO> initByModel(HashMap<String, Object> map);

	List<PreSkuGridDTO> preSkuGrid(HashMap<String, Object> map);

	List<PackageSkuDTO> packageSkuList(HashMap<String, Object> map);

	int countModelAndPreSku(HashMap<String, Object> map);

	List<ModelAndPreSkuDTO>  listModelAndPreSku(HashMap<String, Object> map);


}
