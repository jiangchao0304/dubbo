package com.sunvalley.erp.product.daoEX;

import java.util.HashMap;
import java.util.List;

import com.sunvalley.erp.domain.product.dto.ModelAndPreSkuDTO;
import com.sunvalley.erp.domain.product.dto.PackageSkuDTO;
import com.sunvalley.erp.domain.product.dto.PreSkuDTO;
import com.sunvalley.erp.domain.product.dto.PreSkuGridDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface PrepareSkuExMapper {

	
	List<PreSkuDTO> initByModel(HashMap<String, Object> map);

	List<PreSkuGridDTO> preSkuGrid(HashMap<String, Object> map);

	List<PackageSkuDTO> packageSkuList(HashMap<String, Object> map);

	int countModelAndPreSku(HashMap<String, Object> map);

	List<ModelAndPreSkuDTO>  listModelAndPreSku(HashMap<String, Object> map);


}
