package com.sunvalley.erp.common.util;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.regex.Pattern;


//数值处理方法类

public class NumberUtil {
	
	public static boolean isShort(int val){
		if(val>=-32768 && val<=32767){
			return true;
		}
		return false;
	}
	
	public static boolean isPositiveShort(int val){
		if(val >=0 && val<=32767){
			return true;
		}
		return false;
	}
	
	//浮点数正则处理
	//正浮点数："^(([0-9]+\\.[0-9]*[1-9][0-9]*)|([0-9]*[1-9][0-9]*\\.[0-9]+)|([0-9]*[1-9][0-9]*))$";
	public static boolean isPositiveFload(String s){
		String reg = "^(([0-9]+\\.[0-9]*[1-9][0-9]*)|([0-9]*[1-9][0-9]*\\.[0-9]+)|([0-9]*[1-9][0-9]*))$";
		Pattern pattern = Pattern.compile(reg);
		return pattern.matcher(s).matches();
	}
	//是否浮点数
	public static boolean isFload(String s){
		String reg = "^(-?\\d+)(\\.\\d+)?$";
		Pattern pattern = Pattern.compile(reg);
		return pattern.matcher(s).matches();
	}
	
	//正整数
	public static boolean isPositiveInteger(String s){
		String reg = "^[0-9]*[1-9][0-9]*$";
		Pattern pattern = Pattern.compile(reg);
		return pattern.matcher(s).matches();
	}
	
	/**
	 * 乘法
	 * 
	 * @param int1
	 * @param int2
	 * @return
	 */
	public static Integer multiply(Integer int1,Integer int2)
	{
		BigDecimal bd1 = new BigDecimal(int1);
		BigDecimal bd2 = new BigDecimal(int2);
		return bd1.multiply(bd2).intValue();
	}
	
	/**
	 * truncate long to INT
	 * */
	public static Integer truncateLong(Long longNum){
		if(longNum==null){
			return 0;
		}
		return longNum.intValue();
	}
		
	/**
	 * 截短小数
	 * 
	 * 
	 * @param num 需被截短的数
	 * @param scale 小数点后保留位数
	 * @return
	 */
	public static BigDecimal truncateDigit(BigDecimal num, int scale) 
	{
		DecimalFormat formater = new DecimalFormat();
		formater.setMaximumFractionDigits(2);
		formater.setGroupingSize(0);
		formater.setRoundingMode(RoundingMode.FLOOR);
		String value = formater.format(num.doubleValue());
		return new BigDecimal(value);
	}
	
	/**
	 * 四舍五入
	 * 
	 * 
	 * @param num 需四舍五入的数
	 * @param scale 小数点后保留位数
	 * @return
	 */
	public static BigDecimal scaleDigit(BigDecimal num, int scale) 
	{
		if(num == null)
			return num;
		return num.setScale(scale,BigDecimal.ROUND_HALF_UP);
	}
	
	/**
	 * 相除
	 * @param divider 被除数
	 * @param divisor 除数
	 * @param scale
	 * @return
	 */
	public static double divide(long divider,long divisor, int scale)
	{
		BigDecimal bddivider = new BigDecimal(divider);
		BigDecimal bddivisor = new BigDecimal(divisor);
		return bddivider.divide(bddivisor,scale,BigDecimal.ROUND_HALF_UP).doubleValue();
	}
	
	/**
	 * Integer数字相除
	 * 
	 * @param divider 除数
	 * @param divisor 被除数
	 * @param scale 小数保留位数
	 * @return 运算结果
	 */
	public static Double divideLong(long divider, int divisor,int scale)
	{
		BigDecimal bdDivider = new BigDecimal(String.valueOf(divider));
		BigDecimal bdDivisor = new BigDecimal(String.valueOf(divisor));
		BigDecimal result = bdDivider.divide(bdDivisor, scale,BigDecimal.ROUND_HALF_UP);
		return result.doubleValue();
	}
	
}
