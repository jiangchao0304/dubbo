package com.sunvalley.erp.product.service;

import java.util.List;

import com.sunvalley.erp.framework.service.IBaseService;
import com.sunvalley.erp.product.pojos.ItemCatagory;

/**
 * 产品类别接口
 * @author lufangzong
 * @version 1.0
 * @date 2010-03-23
 */

public interface IItemCatagoryService extends IBaseService<ItemCatagory, ItemCatagory> {
	
	/**
	 * 保存类型
	 * @param itemCatagory
	 * @return
	 */
	public int saveCatagory(ItemCatagory itemCatagory) throws Exception;
	
	/**
	 * 获取产品列表
	 * @return 产品类别列表
	 */
	public List<ItemCatagory> getList();
	
	/**
	 * 获取前端类型option
	 * @return
	 */
	public String getCatagoryOption();
	
	/**
	 * 根据类型编号产生sku编码
	 * @param catagoryId
	 * @return
	 */
	public String getSkuCode(int catagoryId);
	
	/**
	 * 将产品的属性转化为树型结构
	 * */
	public String getCategoryTreeHtml();
}
