package com.sunvalley.erp.product.daoEX;

import com.sunvalley.erp.product.modelEX.PreSkuRelation;
import com.sunvalley.erp.to.product.SkuBaseInfoTO;
import com.sunvalley.erp.to.product.SkuDescTO;
import com.sunvalley.erp.to.product.SkuListNewTO;
import com.sunvalley.erp.product.model.ItemLocale;
import com.sunvalley.erp.to.product.SkuSimpleInfoTO;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
@Repository
public interface ItemExMapper {

	List<ItemLocale> searchSkuCategoryName(Map<String, Object> param);

	SkuBaseInfoTO getSkuBaseInfo(Map<String, Object> param);

	SkuBaseInfoTO getPreSkuBaseInfo(Map<String, Object> param);

	List<SkuListNewTO> listSkuListNew(Map<String, Object> param);

	int countSkuListNew (Map<String, Object> param);

	PreSkuRelation getPreSkuRelation(int skuId);


	List<SkuDescTO> listBySameModel(int skuId);

	Integer getSkuId(String sku);

	String getSku(int skuId);

	SkuSimpleInfoTO getSkuSimpleInfo(Map<String, Object> param);

	List<SkuDescTO> listBySameModel(String sku);


}
