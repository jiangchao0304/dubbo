package com.sunvalley.erp.common.json;

import java.io.IOException;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtil
{

	/**
	 * 
	 * @Description: 转换对象为json格式字符串
	 * @remark
	 * @param obj
	 * @return
	 * @throws Exception 
	 * @author angelo
	 * @date 2016-3-3
	 */
	public static String convertObjectToJson(Object obj) throws Exception
	{
		ObjectMapper mapper = new ObjectMapper();
		mapper.setSerializationInclusion(Include.NON_NULL);
		return mapper.writeValueAsString(obj);
	}

	/**
	 * 
	 * @Description: 转换json串为对象
	 * @remark
	 * @param jsonStr
	 * @param clz
	 * @return
	 * @throws Exception 
	 * @author angelo
	 * @date 2016-3-3
	 */
	public static <T> T convertJsonToObject(String jsonStr, Class<T> clz) throws Exception
	{
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		return mapper.readValue(jsonStr, clz);
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
			mapper.setSerializationInclusion(Include.NON_NULL);
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
			ObjectMapper mapper = new ObjectMapper();
			mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
			JavaType javaType = mapper.getTypeFactory().constructParametricType(collectionClass, elementClass);
			return (List<T>) mapper.readValue(jsonStr, javaType);
		}
		catch (Exception e)
		{
			throw e;
		}
	}

}
