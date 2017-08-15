package com.sunvalley.api.product;

/**
 * 产品控制层接口
 * @author lufangzong
 * @version 1.0
 * @date 2010-03-23
 */

@SuppressWarnings("rawtypes")
public interface IItemService{

	/*
	 * 判断sku是否存在
	 * @param sku
	 * @return
	 */
	String getSku(String sku);
}
