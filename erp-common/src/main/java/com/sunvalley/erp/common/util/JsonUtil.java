package com.sunvalley.erp.common.util;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Simon.Cheng
 * */
public class JsonUtil {
	

	private static ObjectMapper objectMapper;
	
	static {

		objectMapper  = new ObjectMapper();
		objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL); 		// 非空不输出
		objectMapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")); // 时间格式

	}



	/**
	 *
	 * @Description: 转换json串为泛型集合列表
	 * @remark 示例代码：json = [{\"name\":\"pyj1\",\"age\":\"28\"},{\"name\":\"pyj2\",\"age\":\"29\"}]
	 * 					List<User> users = convertJsonToList(json2,ArrayList.class,User.class);
	 * @param jsonStr json串
	 * @param elementClass 元素类
	 * @return
	 * @throws Exception
	 * @author
	 * @date
	 */
	public static <T> List<T> fromJSONArray(String jsonStr, String fieldName, Class<T> elementClass) {
		try {
			JsonNode node = objectMapper.readTree(jsonStr);
			JsonNode jsonNode = node.get(fieldName);
			if(jsonNode==null)
				return null;
			String  fieldJson = node.get(fieldName).toString();
			JavaType javaType = objectMapper.getTypeFactory().constructParametricType(ArrayList.class, elementClass);
			return (List<T>) objectMapper.readValue(fieldJson, javaType);
		} catch (Exception e)
		{
			throw new RuntimeException(e);
		}
	}

	public static <T> List<T> fromJSONArray(String jsonStr, Class<T> elementClass) {
		try {
			JavaType javaType = objectMapper.getTypeFactory().constructParametricType(ArrayList.class, elementClass);
			return (List<T>) objectMapper.readValue(jsonStr, javaType);
		} catch (Exception e)
		{
			throw new RuntimeException(e);
		}
	}



	/**
	 *
	 * @Description: 转换json串为泛型集合列表
	 * @remark 示例代码：json = [{\"name\":\"pyj1\",\"age\":\"28\"},{\"name\":\"pyj2\",\"age\":\"29\"}]
	 * 					List<User> users = convertJsonToList(json2,ArrayList.class,User.class);
	 * @param jsonStr json串
	 * @param elementClass 元素类
	 * @return
	 * @throws Exception
	 * @author
	 * @date
	 */
	public static <T> T fromJSON(String jsonStr, String fieldName, Class<T> elementClass) {
		try {
			JsonNode node = objectMapper.readTree(jsonStr);

			String  fieldJson = node.get(fieldName).toString();

			return  objectMapper.readValue(fieldJson, elementClass);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * 将 JSON 字符串转为 Java 对象
	 */
	public static String getString(String jsonStr, String fieldName) {
		try {
			JsonNode node = objectMapper.readTree(jsonStr);
			JsonNode fieldJson = node.get(fieldName);
			if(fieldJson==null)
				return "";
			return node.get(fieldName).textValue();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public static Integer getInteger(String jsonStr, String fieldName) {
		try {
			JsonNode node = objectMapper.readTree(jsonStr);
			JsonNode jsonNode = node.get(fieldName);
			if(jsonNode==null)
				return null;
			return  castToInt(jsonNode.asText());
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * 将 JSON 字符串转为 Java 对象
	 */
	public static <T> T fromJSON(String json, Class<T> type) {
		T obj;
		try {
			obj = objectMapper.readValue(json, type);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return obj;
	}


	/**
	 *
	 * @Description: 复杂泛型的json转换
	 * @remark 示例：String json = "{\"status\":\"0\",\"msg\":\"ok\",\"data\":[{\"name\":\"pyj1\",\"age\":\"28\"},{\"name\":\"pyj2\",\"age\":\"29\"}]}";
	 * 				Result<List<User>> result = getObjFromJsonArrStr(json1, new TypeReference<Result<List<User>>>() {});
	 * @param source
	 * @param ref
	 * @return
	 * @throws Exception
	 * @author
	 * @date 2016-11-6
	 */
	public static <T> T fromJSON(String source, TypeReference<T> ref) throws Exception
	{
		T rtn = null;
		try
		{
			rtn = objectMapper.readValue(source, ref);
		}
		catch (IOException e)
		{
			throw e;
		}
		return rtn;
	}

	/**
	 *
	 * @Description: 转换json串为泛型集合列表
	 * @remark 示例代码：json = [{\"name\":\"pyj1\",\"age\":\"28\"},{\"name\":\"pyj2\",\"age\":\"29\"}]
	 * 					List<User> users = convertJsonToList(json2,ArrayList.class,User.class);
	 * @param jsonStr json串
	 * @param collectionClass 集合类
	 * @param elementClass 元素类
	 * @return
	 * @throws Exception
	 * @author Jerry
	 * @date 2016-7-11
	 */
	public static <T> List<T> fromJSON(String jsonStr, Class<?> collectionClass, Class<T> elementClass) throws Exception
	{
		try
		{

			JavaType javaType = objectMapper.getTypeFactory().constructParametricType(collectionClass, elementClass);
			return (List<T>) objectMapper.readValue(jsonStr, javaType);
		}
		catch (Exception e)
		{
			throw e;
		}
	}


	/**
	 * 将 Java 对象转为 JSON 字符串
	 */
	public static <T> String toJSON(T obj) {
		String jsonStr;
		try {
			jsonStr = objectMapper.writeValueAsString(obj);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return jsonStr;
	}


	
	public static String toJson(Object object) throws Exception{
		return objectMapper.writeValueAsString(object);
	}
	


	private static Integer castToInt(Object value){
		if(value == null){
			return null;
		}
		if(value instanceof Integer){
			return (Integer) value;
		}
		if(value instanceof Number){
			return ((Number) value).intValue();
		}
		if(value instanceof String){
			String strVal = (String) value;
			if(strVal.length() == 0 //
					|| "null".equals(strVal) //
					|| "NULL".equals(strVal)){
				return null;
			}
			if(strVal.indexOf(',') != 0){
				strVal = strVal.replaceAll(",", "");
			}
			return Integer.parseInt(strVal);
		}
		if(value instanceof Boolean){
			return ((Boolean) value).booleanValue() ? 1 : 0;
		}

		return null;
	}
}
