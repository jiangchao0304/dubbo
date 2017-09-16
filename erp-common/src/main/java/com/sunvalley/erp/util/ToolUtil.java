package com.sunvalley.erp.util;

import java.util.ArrayList;
import java.util.List;

//公共方法类
@SuppressWarnings("nls")
public class ToolUtil {

	public static List<String> toStringList(String str,String splitCode){
		List<String> result=null;
		if (!"".equals(str)) {
			String[] array = str.trim().split(splitCode);
			int size=array.length;
			result=new ArrayList<String>(size);
			for(int i=0;i<size;i++){
				result.add(array[i]);
			}
		}
		return result;
	}
}
