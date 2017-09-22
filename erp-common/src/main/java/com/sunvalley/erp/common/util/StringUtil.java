package com.sunvalley.erp.common.util;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtil {



	/**
	 * format String
	 * */
	public static String formatString(String original,String beckend){
		if(original==null||"".equals(original)){
			return beckend;
		}
		return original;
	}
	
	/**
	 * Trim String
	 * */
	public static String trim(String str){
		if(str==null){
			return "";
		}
		return str.trim();
	}
	
	public static String[] getUniqueArray(String[] ss) {
        List<String> list = new LinkedList<String>();
        for(int i = 0; i < ss.length; i++) {
            if(!list.contains(ss[i])) {
                list.add(ss[i]);
            }
        }
        return (String[])list.toArray(new String[list.size()]);
    }
	
	/**
	 * 判断str1是否包含str2
	 * @param str1
	 * @param str2
	 * @return
	 */
	public static boolean StringIsExits(String str1,String str2){
		Pattern p1=Pattern.compile(str2,Pattern.CASE_INSENSITIVE);//正则表达式，后面的参数指定忽略大小写
		Matcher m1=p1.matcher(str1);
		if(m1.find()){
			return true;
		}
		return false;
	}
	
	public static String filterOffUtf8Mb4(String text) throws UnsupportedEncodingException {
        byte[] bytes = text.getBytes("utf-8");
        ByteBuffer buffer = ByteBuffer.allocate(bytes.length);
        int i = 0;
        while (i < bytes.length) {
            short b = bytes[i];
            if (b > 0) {
                buffer.put(bytes[i++]);
                continue;
            }

            b += 256; // 去掉符号位

            if (((b >> 5) ^ 0x6) == 0) {
                buffer.put(bytes, i, 2);
                i += 2;
            } else if (((b >> 4) ^ 0xE) == 0) {
                buffer.put(bytes, i, 3);
                i += 3;
            } else if (((b >> 3) ^ 0x1E) == 0) {
                i += 4;
            } else if (((b >> 2) ^ 0x3E) == 0) {
                i += 5;
            } else if (((b >> 1) ^ 0x7E) == 0) {
                i += 6;
            } else {
                buffer.put(bytes[i++]);
            }
        }
        buffer.flip();
        return new String(buffer.array(), "utf-8");
    }
	
	public static boolean isEmpty(String arg){
		if(arg!=null&&!arg.equals("")){
			return false;
		}
		return true;
	}
	public static boolean isNotEmpty(String arg){
		return !isEmpty(arg);
	}
	/**
	 * 判断字符串是否是整数
	 * 
	 */
	public static boolean isInteger(String str) {
		if (null == str) {
			str = "";
		}
		Pattern pattern = Pattern.compile("^-?[0-9]*$");
		Matcher matcher = pattern.matcher(str.trim());
		boolean b = matcher.matches();
		return b;
	}

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
