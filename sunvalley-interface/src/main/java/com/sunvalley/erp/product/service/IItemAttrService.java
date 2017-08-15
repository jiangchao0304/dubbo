package com.sunvalley.erp.product.service;

import java.util.List;
import java.util.Map;

import com.sunvalley.erp.framework.service.IBaseService;
import com.sunvalley.erp.product.pojos.ItemAttr;
import com.sunvalley.erp.product.pojos.ItemAttrValueLocale;

/**
 * 产品属性接口
 * @author lufangzong
 * @version 1.0
 * @date 2010-03-23
 */

public interface IItemAttrService extends IBaseService<ItemAttr, ItemAttr> {
	
	/**
	 * 保存产品属性
	 * @param itemAttr
	 * @return
	 */
	public int saveAttr(ItemAttr itemAttr) throws Exception;
	
	/**
	 * 获取产品属性
	 * @param categoryId 类型编号
	 * @param langId 语言
	 * @return
	 */
	public List<ItemAttr> getListByCatagoryId(int categoryId, int langId);
	
	/**
	 * 页面产生属性方法
	 * @param categoryId
	 * @param langId
	 * @return
	 */
	public String printAttr(int categoryId, int langId);
	
	/**
	 * 多语言翻译页面产生属性方法
	 * @param categoryId
	 * @param langId
	 * @return
	 */
	public String multiLangPrintAttr(int categoryId, int langId);
	
	/**
	 * 保存sku属性
	 * @param itemAttrValueLocale
	 * @return
	 */
	public int saveItemAttrValueLocale(ItemAttrValueLocale itemAttrValueLocale);
	
	/**
	 * 获取产品属性列表
	 * @param skuid
	 * @return
	 */
	public List<ItemAttrValueLocale> getItemAttrValueLocaleList(int skuid, byte lang_id);
	
	/**
	 * 获取sku最大的属性行数
	 * @param skuid
	 * @return
	 */
	public int getAttrRow(int skuid);
	
	public int getRowCount(Map<String,Object> map);
}
