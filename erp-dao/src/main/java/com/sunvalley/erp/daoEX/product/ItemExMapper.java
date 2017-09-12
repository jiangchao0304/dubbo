package com.sunvalley.erp.daoEX.product;


import com.sunvalley.erp.model.product.ItemLocale;

import java.util.List;
import java.util.Map;

public interface ItemExMapper {

	List<ItemLocale> searchSkuCategoryName(Map<String, Object> param);
}
