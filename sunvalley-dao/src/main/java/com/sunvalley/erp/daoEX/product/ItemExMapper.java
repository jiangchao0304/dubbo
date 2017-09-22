package com.sunvalley.erp.daoEX.product;


import com.sunvalley.domain.erp.product.dto.SkuBaseInfoDTO;
import com.sunvalley.domain.erp.product.dto.SkuListNewDTO;
import com.sunvalley.erp.model.product.ItemLocale;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
@Repository
public interface ItemExMapper {

	List<ItemLocale> searchSkuCategoryName(Map<String, Object> param);

	SkuBaseInfoDTO getSkuBaseInfo(Map<String, Object> param);

	SkuBaseInfoDTO getPreSkuBaseInfo(Map<String, Object> param);

	List<SkuListNewDTO> listSkuListNew(Map<String, Object> param);
	int countSkuListNew (Map<String, Object> param);
}
