package com.sunvalley.erp.util.json;

import java.lang.reflect.Type;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.sunvalley.erp.util.DateUtil;

/**
 * @author ss336
 * */
public class JsonParse {
	
	private static Gson gson;
	
	static {
		GsonBuilder gsonBuilder = new GsonBuilder();
		gson = gsonBuilder.setDateFormat(DateUtil.DATE_TIME_FORMAT_STRING1).disableHtmlEscaping().create();
	}
	
	//独立字段可以用Map对象接收new TypeToken<Map<String, String>>(){}.getType()
	public static Object fromJson(String jsonData, Type type) {
		return gson.fromJson(jsonData, type);
	}
	
	public static String toJson(Object object){
		return gson.toJson(object);
	}
	
	public static String toJson(Object object,Type TokenType){
		return gson.toJson(object,TokenType);
	}
}
