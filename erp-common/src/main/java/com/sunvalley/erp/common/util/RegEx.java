package com.sunvalley.erp.common.util;

import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegEx {

	@SuppressWarnings("nls")
	public static boolean checkMinorty(String str){
		boolean bl = false;
//    	String reg = "/^[\\{0000}-\\{007f}\\{4e00}-\\{9fa5}]+$/u";
		//匹配全部都是中文英文
    	String reg = "^[\u0000-\u007f\u4e00-\u9fa5]+$";
    	Pattern p=Pattern.compile(reg);
    	Matcher m=p.matcher(str);
    	bl=m.find();
    	//如果含有小语种，则返回true
    	return !bl;
	}
	
	@SuppressWarnings("nls")
	public static boolean checkSku(String sku){
		String regex = "[0-9]{2,3}-[0-9]{5,6}-[0-9]{2,6}"; // 数字中划线正则
		if(!sku.matches(regex)) { // 正则表达式判断搜索描述还是编码
			return false;
		}
		return true;
	}
	
	@SuppressWarnings("nls")
	public static boolean checkBUASku(String sku){
		String regex = "[A-Z,a-z,0-9]{2,3}-[0-9]{2,3}"; // 数字中划线正则
		if(!sku.matches(regex)) { // 正则表达式判断搜索描述还是编码
			return false;
		}
		return true;
	}
	
	@SuppressWarnings("nls")
	public static boolean checkBUAAllSku(String sku){
		String regex = "[A-Z,a-z,0-9]{2,3}-[0-9]{2,3}-[0-9]{2,6}"; // 数字中划线正则
		if(!sku.matches(regex)) { // 正则表达式判断搜索描述还是编码
			return false;
		}
		return true;
	}
	
	@SuppressWarnings("nls")
	public static boolean checkBUBSku(String sku){
		String regex = "[A-Z]{3}"; // 数字中划线正则
		if(!sku.matches(regex)) { // 正则表达式判断搜索描述还是编码
			return false;
		}
		return true;
	}
	
	@SuppressWarnings("nls")
	public static boolean checkBUBAllSku(String sku){
		String regex = "[A-Z]{3}-[0-9]{2,5}"; // 数字中划线正则
		if(!sku.matches(regex)) { // 正则表达式判断搜索描述还是编码
			return false;
		}
		return true;
	}
	
	/**
	 * 正则验证是否整数
	 * @param sku
	 * @return
	 */
	@SuppressWarnings("nls")
	public static boolean checkInt(String sku){
		String regex = "[\\d]+";
		if(!sku.matches(regex)) {
			return false;
		}
		return true;
	}
	public static boolean checkIntTwo(String sku){
		String regex = "[1-9]+";
		if(!sku.matches(regex)) {
			return false;
		}
		return true;
	}
	
	/**
	 * 验证是否为数字：包括小数
	 * add by wangweidong
	 */
	public static boolean isNumeric(String sku){
		String regex = "[0-9]+(.[0-9]+)?";
		if(!sku.matches(regex)) {
			return false;
		}
		return true;
	}
	

	public static boolean checkDate(String dateStr,String dateFormat){
		 if (dateStr != null) {
		       SimpleDateFormat formatter = new SimpleDateFormat(dateFormat);
		       formatter.setLenient(false);
	          try {
	              formatter.format(formatter.parse(dateStr));
	            }catch (Exception e) {
	            	formatter = new SimpleDateFormat(DateUtil.DATE_TIME_FORMAT_STRING1);
	            	formatter.setLenient(false);
	            	try{
	            		formatter.format(formatter.parse(dateStr));
	            	}catch (Exception e1) {
	            		return false;
					}
	              
	            }
	            return true;
	          }
		          return false;

	}

	/**
	 * checkModel .
	 * @remark 判断是否是model
	 * <p>判断规则:前两位大写字母+横杠+大写字母和数字</p>
	 * <p>例:AJ-AD008</p>
	 * @param sku
	 *         [sku]
	 * @return boolean
	 * @throws
	 * @author: douglas.jiang
	 * @date : 2017/9/1:13:42
	 */
	@SuppressWarnings("nls")
	public static boolean checkModel(String sku){

		String regex = "[A-Z]{2}-[A-Z,0-9]*"; // 数字中划线正则
		if(!sku.matches(regex)) { // 正则表达式判断搜索描述还是编码
			return false;
		}
		return true;
	}

	/**
	 * checkModel .
	 * @remark 判断是否是Asin
	 * <p>判断规则:长度10位仅包含大写字母和数字组合</p>
	 * <p>例:</p>
	 * @param sku
	 *         [sku]
	 * @return boolean
	 * @throws
	 * @author: douglas.jiang
	 * @date : 2017/9/1:13:42
	 */
	@SuppressWarnings("nls")
	public static boolean checkAsin(String sku){
		String regex = "[A-Z0-9]{10}";
		if(!sku.matches(regex)) {
			return false;
		}
		return true;
	}
}
