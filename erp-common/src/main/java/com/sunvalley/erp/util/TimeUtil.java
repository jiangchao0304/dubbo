package com.sunvalley.erp.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import com.sunvalley.erp.common.constants.Constants.WharehouseId;

/**
 * @author lufangzong
 * @version 1.0
 * @updated_date 2010-07-10
 */

@SuppressWarnings("nls")
public class TimeUtil {
	
	public static Date Now(Integer whId){
		if(whId==WharehouseId.CN_TAX
				||whId==WharehouseId.CN_NoTax
				||whId==WharehouseId.CN_GLOBAL_BAOAN
				||whId==WharehouseId.HK_NOTAX
				||whId==WharehouseId.CN_NOTAX_SZ
				||whId== WharehouseId.CN_SUPPLIER
				){
			return BeiJingTimeNow();
		}else if (whId == WharehouseId.DE_HAMBURG || whId == WharehouseId.DE_HAMBURG_USED 
				|| whId == WharehouseId.DE_FBA || whId == WharehouseId.DE_HAMBURG_USED_FOR_REPLACEMENT){
			return DeBerlinTimeNow();
		}
		return Now();
	}
	public static Date Now(String countryCode){
		if(countryCode.equalsIgnoreCase("cn")){
			return BeiJingTimeNow();
		}
		return Now();
	}
	
	
	/**
	 * 获得当前时间
	 * */
	public static Date Now(){
		return new Date();
	}
	
	public static Date BeiJingTimeNow(){
		try {
			return DateUtil.convertStringToDate("yyyy-MM-dd HH:mm:ss",BeiJingZoneNow());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return Now();
	}
	public static String BeiJingZoneNow(){
		return BeiJingZoneNow("yyyy-MM-dd HH:mm:ss");
	}
	
	public static String BeiJingZoneNow(String format){
		 SimpleDateFormat sd = new SimpleDateFormat(format);
	     sd.setTimeZone(java.util.TimeZone.getTimeZone("GMT+8"));
	     return sd.format(new Date());
	}
	
	
	public static Date DeBerlinTimeNow(){
		try {
			return DateUtil.convertStringToDate("yyyy-MM-dd HH:mm:ss",DeBerlinZoneNow());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return Now();
	}
	
	public static String DeBerlinZoneNow(){
		return DeBerlinZoneNow("yyyy-MM-dd HH:mm:ss");
	}
	
	public static String DeBerlinZoneNow(String format){
		SimpleDateFormat sd = new SimpleDateFormat(format);
	     sd.setTimeZone(java.util.TimeZone.getTimeZone("GMT+1"));
	     return sd.format(new Date());
	}
	public static String BeiJingZoneNow(Date date,String format){
		 SimpleDateFormat sd = new SimpleDateFormat(format);
	     sd.setTimeZone(java.util.TimeZone.getTimeZone("GMT+8"));
	     return sd.format(date);
	}
	
	public static Date TimeZoneTimeNow(String timeZone){
		try {
			return DateUtil.convertStringToDate("yyyy-MM-dd HH:mm:ss",TimeZoneNow(timeZone));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return Now();
	}
	public static String TimeZoneNow(String timeZone){
		return TimeZoneNow(timeZone,"yyyy-MM-dd HH:mm:ss");
	}
	public static String TimeZoneNow(String timeZone,String format){
		 SimpleDateFormat sd = new SimpleDateFormat(format);
	     sd.setTimeZone(java.util.TimeZone.getTimeZone(timeZone));
	     return sd.format(new Date());
	}
	
	/**
	 * 获得当前的年份
	 * */
	public static int getYear(){
		Calendar now = Calendar.getInstance();
		now.setTime(Now());
		return now.get(Calendar.YEAR);
	}
	
	/**
	 * 获取当前的月份
	 * */
	public static int getMonth(){
		Calendar now = Calendar.getInstance();
		now.setTime(Now());
		return now.get(Calendar.MONTH)+1;
	}
	
	/**
	 * 日列表
	 * @param datefrom
	 * @param dateto
	 * @return
	 */
	public static List<String> getDailyList(Date datefrom, Date dateto) {
		List<String> list = new ArrayList<String>();
		Calendar now = Calendar.getInstance();
		now.setTime(datefrom);
		while(true) {
			list.add(DateUtil.getDateString1(now.getTime()));
			now.add(Calendar.DATE, 1);
			if(now.getTime().after(dateto)) {
				break;
			}
		}
		return list;
	}
	

	/**
	 * 月列表
	 * @param datefrom
	 * @param dateto
	 * @return
	 */
	public static List<String> getMonthlyList(Date datefrom, Date dateto) {
		List<String> list = new ArrayList<String>();
		Calendar now = Calendar.getInstance();
		now.setTime(datefrom);
		int startYear = now.get(Calendar.YEAR);
		now.setTime(dateto);
		int endYear = now.get(Calendar.YEAR);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMM");
		int start = Integer.parseInt(sdf.format(datefrom));
		int end = Integer.parseInt(sdf.format(dateto));
		if(startYear == endYear) {
			for(int i=start;i<=end;i++) {
				list.add(String.valueOf(i));
			}
		} else if (startYear + 1 == endYear) { // 最多只能跨一年
			for(int i=start;i<=Integer.parseInt(startYear+"12");i++) {
				list.add(String.valueOf(i));
			}
			for(int i=Integer.parseInt(endYear+"01");i<=end;i++) {
				list.add(String.valueOf(i));
			}
		}
		return list;
	}
	
	/**  
	 *   
	 * 获取某年某月的第一天
	 *   
	 * @param year int 年份  
	 * @param month int 月份  
	 *   
	 * @return int 某年某月的第一天
	 */  
	public static Date getFistDayOfMonth(int year, int month) {   
	    Calendar cal = Calendar.getInstance();   
	    cal.set(Calendar.YEAR, year);   
	    cal.set(Calendar.MONTH, month-1);
	    cal.set(Calendar.DAY_OF_MONTH, cal.getActualMinimum(Calendar.DAY_OF_MONTH));  
	    cal.set(Calendar.HOUR_OF_DAY, 00);  
	    cal.set(Calendar.MINUTE, 00); 
	    cal.set(Calendar.SECOND, 00); 
	    // 某年某月的第一天   
	    return cal.getTime();
	}

	/**  
     * 获取某年某月的最后一天
     *   
     * @param year int 年份  
     * @param month int 月份  
     *   
     * @return int 某年某月的最后一天  
     */  
	public static Date getLastDayOfMonth(int year, int month) 
    {   
        Calendar cal = Calendar.getInstance();   
        cal.set(Calendar.YEAR, year);   
        cal.set(Calendar.MONTH, month-1);
        cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DAY_OF_MONTH));  
        cal.set(Calendar.HOUR_OF_DAY, 23);  
        cal.set(Calendar.MINUTE, 59); 
        cal.set(Calendar.SECOND, 59); 
        // 某年某月的最后一天   
        return cal.getTime();
    }
	
	/**
	 * 返回指定日期的下一个月的第一天
	 * @param d 指定日期
	 * @return Date 指定日期的下一个月的第一天
	 */
	public static Date getFirstDayOfNextMonth(Date d) {
		DateFormat df = new SimpleDateFormat("yyyyMMdd", Locale.ENGLISH);
		String dateStr = df.format(d);
		int year = Integer.parseInt(dateStr.substring(0, 4));
		int month = Integer.parseInt(dateStr.substring(4, 6));
		if (month == 12) {
			year++;
			month = 1;
		} else {
			month++;
		}
		return getFistDayOfMonth(year, month);
	}
	
	public static void main(String[] arg) throws ParseException {
		//getDailyList(DateUtil.getParseDate1("2010-05-01"), DateUtil.getParseDate1("2010-07-10"));
	}
}
