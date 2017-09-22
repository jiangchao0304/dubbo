package com.sunvalley.erp.common.util;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;

public class ParamUtils {
	@SuppressWarnings("nls")
	public static String getString(Object obj){
		if(obj == null) return "";
		else return obj.toString().trim();
	}
	
	@SuppressWarnings("nls")
	public static int getInt(Object obj){
		String str = getString(obj);
		str=str.replaceAll(",", "").replaceAll("%", "").replaceAll(Matcher.quoteReplacement("$"),Matcher.quoteReplacement("")).replaceAll("€", "").replaceAll("£", "").replaceAll("￥","").replaceAll("JPY","");
		if("Infinite".equals(str)){
			return Integer.MAX_VALUE;
		}
		try{
			return Integer.parseInt(str);
		}catch(Exception e){
			return Integer.parseInt("0");
		}
	}
	
	public static long getLong(Object obj){
		String str = getString(obj);
		if(str.equals("")) 
			return 0;
		else
			return Long.parseLong(str);
	}
	
	@SuppressWarnings("nls")
	public static byte getByte(Object obj){
		String str = getString(obj);
		if(str.equals("")) return 0;
		else return Byte.parseByte(str);
	}
	
	@SuppressWarnings("nls")
	public static short getShort(Object obj){
		String str = getString(obj);
		if(str.equals("")) return 0;
		else return Short.parseShort(str);
	}
	
	@SuppressWarnings("nls")
	public static BigDecimal getBigDecimal(Object obj){
		String str = getString(obj);
		str=str.replaceAll(",", "").replaceAll("%", "").replaceAll(Matcher.quoteReplacement("$"),Matcher.quoteReplacement("")).replaceAll("€", "").replaceAll("£", "").replaceAll("￥","").replaceAll("JPY","");
		try{
			return new BigDecimal(Double.parseDouble(str));
		}catch(Exception e){
			return BigDecimal.ZERO;
		}
	}
	
	@SuppressWarnings("nls")
	public static double getDouble(Object obj){
		String str = getString(obj);
		if(str.equals("")) return 0;
		else return Double.parseDouble(str);
	}
	
	public static boolean getBoolean(Object obj){
		String str = getString(obj);
		if(str.equals("")) return false;
		else return Boolean.parseBoolean(str);
	}
	
	@SuppressWarnings("nls")
	public static Date getDate(Object obj) throws ParseException{
		String str = getString(obj);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		if(str.equals("")) return TimeUtil.Now();
		else return sdf.parse(str);
	}
	
	public static String getImgId(String imgUrl){
		if(imgUrl==null||"".equals(imgUrl)){
			return "";
		}
		String imgId=imgUrl;
		try{
			int index=imgUrl.indexOf("/I/");
			if(index>0){
				String img2=imgUrl.substring(index);
				index=img2.indexOf(".");
				if(index>0){
					imgId=img2.substring(img2.lastIndexOf("/")+1,index);
				}
			}
		}catch(Exception e){
			
		}
		return imgId;
	}
	
}
