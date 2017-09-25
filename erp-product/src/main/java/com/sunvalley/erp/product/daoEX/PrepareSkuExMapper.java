package com.sunvalley.erp.product.daoEX;

import java.util.HashMap;
import java.util.List;

import com.sunvalley.erp.to.product.ModelAndPreSkuTO;
import com.sunvalley.erp.to.product.PackageSkuTO;
import com.sunvalley.erp.to.product.PreSkuTO;
import com.sunvalley.erp.to.product.PreSkuGridTO;
import org.springframework.stereotype.Repository;

@Repository
public interface PrepareSkuExMapper {

	
	List<PreSkuTO> initByModel(HashMap<String, Object> map);

	List<PreSkuGridTO> preSkuGrid(HashMap<String, Object> map);

	List<PackageSkuTO> packageSkuList(HashMap<String, Object> map);

	int countModelAndPreSku(HashMap<String, Object> map);

	List<ModelAndPreSkuTO>  listModelAndPreSku(HashMap<String, Object> map);

	//更新SKU状态
	int updatePreSkuStatus(HashMap<String, Object> map);


}
