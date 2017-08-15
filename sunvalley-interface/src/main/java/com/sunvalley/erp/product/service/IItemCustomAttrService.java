package com.sunvalley.erp.product.service;

import com.sunvalley.erp.framework.service.IBaseService;
import com.sunvalley.erp.product.pojos.ItemCustomAttr;

public interface IItemCustomAttrService extends
		IBaseService<ItemCustomAttr, ItemCustomAttr> {

	/**
	 * @see get the commodity name by the sku code
	 * @param String sku code
	 * @return String 
	 * */
	public String getCommodityNameBySKU(String sku);
	
	public ItemCustomAttr getCommodityAttrBySKU(String sku);
	
	public ItemCustomAttr getCommodityAttrBySKU(int skuid,String sku);
}
