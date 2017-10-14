package com.sunvalley.erp.common.util;

import java.io.IOException;
import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * @author Simon.Cheng
 * */
public class JsonUtil {
	
	private static Gson gson;
	private static ObjectMapper objectMapper;
	
	static {
		GsonBuilder gsonBuilder = new GsonBuilder();
		gson = gsonBuilder.setDateFormat(DateUtil.DATE_TIME_FORMAT_STRING1).disableHtmlEscaping().create();


		objectMapper  = new ObjectMapper();
		objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL); 		// 非空不输出
		objectMapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")); // 时间格式

	}




	public static JsonNode getJsonNode(String jsonString,String key) {
		try {
			JsonNode node = objectMapper.readTree(jsonString);
			return node.get(key);
		}catch (Exception ex){
			throw new RuntimeException(ex);
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
	public static <T> T getObjFromJsonArrStr(String source, TypeReference<T> ref) throws Exception
	{
		T rtn = null;
		try
		{
			ObjectMapper mapper = new ObjectMapper();
			mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
			mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
			rtn = mapper.readValue(source, ref);
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
	public static <T> List<T> convertJsonToList(String jsonStr, Class<?> collectionClass, Class<T> elementClass) throws Exception
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
