package com.sunvalley.erp.common.util;

import com.sunvalley.erp.common.constants.Constants;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

import javax.xml.datatype.XMLGregorianCalendar;

import static com.sunvalley.erp.common.constants.Constants.Country.*;


/**
 * Date Utility Class used to convert Strings to Dates and Timestamps
 * 
 * to correct time pattern. Minutes should be mm not MM (MM is month).
 */
@SuppressWarnings("nls")
public class DateUtil {
	public static final String TIME_PATTERN = "HH:mm";
	/*
	 * styles of date format October 4, 2013
	 */
	public static final String DATE_FORMAT_STRING1 = "yyyy-MM-dd";
	public static final String DATE_FORMAT_STRING2 = "yyyy/MM/dd";
	public static final String DATE_FORMAT_STRING3 = "yyyy年MM月dd日";
	public static final String DATE_FORMAT_STRING4 = "yyyyMMdd";
	public static final String DATE_FORMAT_STRING5 = "MMM-dd-yy";
	public static final String DATE_FORMAT_STRING6 = "dd.MM.yyyy";
	public static final String DATE_FORMAT_STRING7 = "yyyyMM";
	public static final String DATE_FORMAT_STRING8 = "dd-MMM-yy";
	public static final String DATE_FORMAT_STRING9 = "yyMMdd";
	public static final String en_FORMAT = "MMM dd yyyy";
	public static final String PAGE_SHOW_FORMAT_STRING="MMM dd, yyyy";
	//2013-08-21T21:20:01+00:00
	//2014-04-16T15:21:17+00:00
	public static final String DATE_TIME_FORMAT_STRING1 = "yyyy-MM-dd HH:mm:ss";
	public static final String DATE_TIME_FORMAT_STRING14 = "yyyy/MM/dd HH:mm:ss";
	public static final String DATE_TIME_FORMAT_STRING2 = " HH:mm:ss";
	public static final String DATE_TIME_FORMAT_STRING3 = "yyyy年MM月dd日 HH时mm分ss秒";
	public static final String DATE_TIME_FORMAT_STRING4 = "yyyyMMddHHmmss";
	public static final String DATE_TIME_FORMAT_STRING5 = "dd.MM.yyyy HH:mm:ss";
	public static final String DATE_TIME_FORMAT_STRING52 = "dd.MM.yyyy";
	public static final String DATE_TIME_FORMAT_STRING6 = "MM/dd/yyyy HH:mm:ss";
	public static final String DATE_TIME_FORMAT_STRING7 = "yyyy-MM-dd HH:mm:ss";
	public static final String DATE_TIME_FORMAT_STRING8 = "MM/dd/yyyy HH:mm a";//01/30/2010  02:02 AM
	public static final String DATE_TIME_FORMAT_STRING9 = "yyyyMMddHHmm";
	public static final String DATE_TIME_FORMAT_STRING10 = "MM/dd/yyyy HH:mm:ss a";//01/30/2010  02:02 AM
	public static final String DATE_TIME_FORMAT_STRING11 = "yyyy-MM-dd-HH-mm-ss-ssss";//时间格式想精确到多少位后面加s就行了
	public static final String DATE_TIME_FORMAT_STRING12 = "MM/dd/yyyy";
	public static final String DATE_TIME_FORMAT_STRING13 = "dd/MM/yyyy HH:mm:ss";//19/03/2012 14:20:03
	public static final String DATE_TIME_FORMAT_STRING15 = "MM/dd/yyyy HH:mm";//02/19/2015 0:00
	public static final String YEAR_FORMAT_STRING = "yyyy";
	public static final String TIME_FORMAT_STRING1 = "HH:mm:ss";
	public static final String TIME_FORMAT_STRING2 = "HH时mm分ss秒";
	public static final String UTC_TIME_FORMAT_STRING="yyyy-MM-dd'T'HH:mm:ss'+'00:00";//2013-11-06T02:10:02+00:00


	/**
	 * 获取当前系统时间(原始格式)
	 */
	public static Date getCurrentDateTime() {
		Date date = new Date(System.currentTimeMillis());
		return date;
	}

	/**
	 * 
	 * @param yearFormat
	 * @param date
	 * @return
	 */
	public static String getYearString(String yearFormat, Date date) {
		SimpleDateFormat format = new SimpleDateFormat(yearFormat);
		return format.format(date);
	}

	/**
	 * 
	 * @param dateFormat
	 * @param date
	 * @return
	 */
	public static String getDateString(String dateFormat, Date date) {
		if(date==null)
			return "";
		SimpleDateFormat format = new SimpleDateFormat(dateFormat);
		return format.format(date);
	}

	/**
	 * 
	 * @param dateFormat
	 * @param date
	 * @return
	 */
	public static String getDateString2(String dateFormat, Date date) {
		SimpleDateFormat format = new SimpleDateFormat(dateFormat,
				Locale.ENGLISH);
		return format.format(date);
	}

	/**
	 * 
	 * @param dateTimeFormat
	 * @param date
	 * @return
	 */
	public static String getDateTimeString(String dateTimeFormat, Date date) {
		SimpleDateFormat format = new SimpleDateFormat(dateTimeFormat);
		return format.format(date);
	}

	/**
	 * 
	 * @param timeFormat
	 * @param date
	 * @return
	 */
	public static String getTimeString(String timeFormat, Date date) {
		SimpleDateFormat format = new SimpleDateFormat(timeFormat);
		return format.format(date);
	}

	/**
	 * 
	 * @param dateFormat
	 * @param date
	 * @return
	 * @throws ParseException
	 */
	public static Date parseDate(String dateFormat, String date)
			throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat(dateFormat);
		return format.parse(date);
	}

	public static Date parseDate2(String dateFormat, String date)
			throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat(dateFormat,
				Locale.ENGLISH);
		return format.parse(date);
	}
	
	public static Date parseDate3(Date date) throws ParseException{
		SimpleDateFormat format = new SimpleDateFormat(DATE_FORMAT_STRING1,
				Locale.ENGLISH);
		try {
			return format.parse(format.format(date));
		} catch (ParseException e) {
			throw e;
		}
	}
	
	public static Date parseDate4(Date date) throws ParseException{
		SimpleDateFormat format = new SimpleDateFormat(DATE_FORMAT_STRING1);
		try {
			return format.parse(format.format(date));
		} catch (ParseException e) {
			throw e;
		}
	}
	
	public static Date parseDate14(Date date) throws ParseException{
		SimpleDateFormat format = new SimpleDateFormat(DATE_TIME_FORMAT_STRING14);
		try {
			return format.parse(format.format(date));
		} catch (ParseException e) {
			throw e;
		}
	}
	
	

	/**
	 * 
	 * @param dateTimeFormat
	 * @param date
	 * @return
	 * @throws ParseException
	 */
	public static Date parseDateTime(String dateTimeFormat, String date)
			throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat(dateTimeFormat);
		return format.parse(date);
	}

	/**
	 * 
	 * @param timeFormat
	 * @param date
	 * @return
	 * @throws ParseException
	 */
	public static Date parseTime(String timeFormat, String date)
			throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat(timeFormat);
		return format.parse(date);
	}

	/*
	 * list the interface to outside
	 */

	/**
	 * get date string of the input date "yyyy-MM-dd"
	 * 
	 * @param date
	 *            Date
	 * @return String
	 */
	public static String getDateString1(Date date) {
		return getDateString(DATE_FORMAT_STRING1, date);
	}

	/**
	 * get date string of the input date "yyyy/MM/dd"
	 * 
	 * @param date
	 * @return
	 */
	public static String getDateString2(Date date) {
		return getDateString(DATE_FORMAT_STRING2, date);
	}

	/**
	 * Get date string of the Chinese style "yyyy年MM月dd日".
	 * 
	 * @param date
	 * @return
	 */
	public static String getDateStringCN(Date date) {
		return getDateString(DATE_FORMAT_STRING3, date);
	}

	/**
	 * Get date string of the compact style "yyyyMMdd".
	 * 
	 * @param date
	 * @return
	 */
	public static String getDateStringCompact(Date date) {
		return getDateString(DATE_FORMAT_STRING4, date);
	}
	
	/**
	 * Get date string of the compact style "yyyyMMdd".
	 * 
	 * @param date
	 * @return
	 */
	public static String getDateTimeString4(Date date) {
		return getDateString(DATE_TIME_FORMAT_STRING4, date);
	}

	/**
	 * Get date string of the compact style "MM-dd-yy".
	 * 
	 * @param date
	 * @return
	 */
	public static String getDateString5(Date date) {
		return getDateString2(DATE_FORMAT_STRING5, date);
	}

	/**
	 * get date time string of the style "yyyy-MM-dd HH:mm:ss"
	 * 
	 * @param date
	 *            Date
	 * @return String
	 */
	public static String getDateTimeString1(Date date) {
		return getDateTimeString(DATE_TIME_FORMAT_STRING1, date);
	}

	/**
	 * get date time string of the style "yyyy/MM/dd HH:mm:ss"
	 * 
	 * @param date
	 * @return
	 */
	public static String getDateTimeString2(Date date) {
		return getDateTimeString(DATE_TIME_FORMAT_STRING2, date);
	}

	/**
	 * 得到 "dd/MM/yyyy HH:mm:ss"格式的时间字符串
	 * @Author Jack.Zhou  
	 * @Date 2012-3-19
	 */
	public static String getDateTimeString13(Date date) {
		return getDateTimeString(DATE_TIME_FORMAT_STRING13, date);
	}

	/**
	 * Get date string of the Chinese style "yyyy年MM月dd日 HH时mm分ss秒".
	 * 
	 * @param date
	 * @return
	 */
	public static String getDateTimeStringCN(Date date) {
		return getDateTimeString(DATE_TIME_FORMAT_STRING3, date);
	}

	/**
	 * get time string of the style "HH:mm:ss"
	 * 
	 * @param date
	 * @return
	 */
	public static String getTimeString(Date date) {
		return getTimeString(TIME_FORMAT_STRING1, date);
	}

	/**
	 * get time string of the style "HH时mm分ss秒"
	 * 
	 * @param date
	 * @return
	 */
	public static String getTimeStringCN(Date date) {
		return getTimeString(TIME_FORMAT_STRING2, date);
	}

	/**
	 * Get the year string of the style "yyyy"
	 * 
	 * @param date
	 * @return
	 */
	public static String getYearString(Date date) {
		return getYearString(YEAR_FORMAT_STRING, date);
	}

	/**
	 * Get date from string style of "yyyy-MM-dd"
	 * 
	 * @param date
	 * @return
	 * @throws ParseException
	 */
	public static Date getParseDate1(String date) throws ParseException {
		return parseDate(DATE_FORMAT_STRING1, date);
	}
	
	public static Date getParseDate14(String date) throws ParseException {
		return parseDate(DATE_TIME_FORMAT_STRING14, date);
	}
	
	public static Date getParseDates(String date) throws ParseException {
		return parseDate(en_FORMAT, date);
	}

	/**
	 * Get date from string style of "yyyy-MM-dd HH:mm:ss"
	 * 
	 * @param date
	 * @return
	 * @throws ParseException
	 */
	public static Date getParseDate3(String date) throws ParseException {
		return parseDate(DATE_TIME_FORMAT_STRING1, date);
	}

	/**
	 * Get date from string style of "yyyyMMddHHmmss"
	 * 
	 * @param date
	 * @return
	 * @throws ParseException
	 */
	public static Date getParseDate4(String date) throws ParseException {
		return parseDate(DATE_TIME_FORMAT_STRING4, date);
	}

	/**
	 * Get date from string style of "yyyy/MM/dd"
	 * 
	 * @param date
	 * @return
	 * @throws ParseException
	 */
	public static Date getParseDate2(String date) throws ParseException {
		return parseDate(DATE_FORMAT_STRING2, date);
	}

	/**
	 * Get the year of the input date.
	 * 
	 * @param s
	 * @return
	 * @throws ParseException
	 */
	public static int getYearOfDate(Date date) throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		String d = format.format(date);
		return Integer.parseInt(d.substring(0, 4));
	}

	/**
	 * Get the month of the input date
	 * 
	 * @param s
	 * @return
	 * @throws ParseException
	 */
	public static int getMonthOfDate(Date date) throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		String d = format.format(date);
		return Integer.parseInt(d.substring(5, 7));
	}

	/**
	 * Get the day of the input date.
	 * 
	 * @param s
	 * @return
	 * @throws ParseException
	 */
	public static int getDayOfDate(Date date) throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		String d = format.format(date);
		return Integer.parseInt(d.substring(8, 10));
	}

	/**
	 * Get first day of the month.
	 * 
	 * @param year
	 * @param month
	 * @return
	 * @throws ParseException
	 */
	public static Date getFirstDay(String year, String month)
			throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		return format.parse(year + "-" + month + "-1");
	}

	/**
	 * Get first day of the month.
	 * 
	 * @param year
	 * @param month
	 * @return
	 * @throws ParseException
	 */
	public static Date getFirstDay(int year, int month) throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		return format.parse(year + "-" + month + "-1");
	}

	/**
	 * Get the last day of the month.
	 * 
	 * @param year
	 * @param month
	 * @return
	 * @throws ParseException
	 */
	public static Date getLastDay(String year, String month)
			throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date date = format.parse(year + "-" + month + "-1");

		Calendar scalendar = new GregorianCalendar();
		scalendar.setTime(date);
		scalendar.add(Calendar.MONTH, 1);
		scalendar.add(Calendar.DATE, -1);
		date = scalendar.getTime();
		return date;
	}

	/**
	 * Get the last day of the month.
	 * 
	 * @param year
	 * @param month
	 * @return
	 * @throws ParseException
	 */
	public static Date getLastDay(int year, int month) throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date date = format.parse(year + "-" + month + "-1");

		Calendar scalendar = new GregorianCalendar();
		scalendar.setTime(date);
		scalendar.add(Calendar.MONTH, 1);
		scalendar.add(Calendar.DATE, -1);
		date = scalendar.getTime();
		return date;
	}

	/**
	 * Get distinct months of the tow date.
	 * 
	 * @param fromDate
	 *            format must be "yyyy-MM-dd"
	 * @param toDate
	 *            format must be "yyyy-MM-dd"
	 * @return
	 * @throws ParseException
	 */
	@SuppressWarnings("deprecation")
	public static long getDistinctMonth(String fromDate, String toDate)
			throws ParseException {
		SimpleDateFormat d = new SimpleDateFormat("yyyy-MM-dd");
		long monthCount = 0;
		Date d1 = d.parse(fromDate);
		Date d2 = d.parse(toDate);

		monthCount = (d2.getYear() - d1.getYear()) * 12 + d2.getMonth()
				- d1.getMonth();
		// dayCount = (d2.getTime()-d1.getTime())/(30*24*60*60*1000);

		return monthCount;
	}

	/**
	 * Get the different day between tow date.
	 * 
	 * @param fromDate
	 *            format must be "yyyy-MM-dd"
	 * @param toDate
	 *            format must be "yyyy-MM-dd"
	 * @return
	 * @throws ParseException
	 */
	public static long getDistinctDay(String fromDate, String toDate)
			throws ParseException {
		SimpleDateFormat d = new SimpleDateFormat("yyyy-MM-dd");
		long dayCount = 0;
		Date d1 = d.parse(fromDate);
		Date d2 = d.parse(toDate);

		dayCount = (d2.getTime() - d1.getTime()) / (24 * 60 * 60 * 1000);
		return dayCount;
	}

	/**
	 * Get the Distinct day between tow date.
	 * 
	 * @param fromDate
	 * @param toDate
	 * @return
	 * @throws ParseException
	 */
	public static long getDistinctDay(Date fromDate, Date toDate)
			throws ParseException {
		long dayCount = 0;

		dayCount = (toDate.getTime() - fromDate.getTime())
				/ (24 * 60 * 60 * 1000);
		return dayCount;
	}

	// tank append

	/**
	 * Checkstyle rule: utility classes should not have public constructor
	 */
	public DateUtil() {
	}

	/**
	 * This method generates a string representation of a date/time in the
	 * format you specify on input
	 * 
	 * @param aMask
	 *            the date pattern the string is in
	 * @param strDate
	 *            a string representation of a date
	 * @return a converted Date object
	 * @see SimpleDateFormat
	 * @throws ParseException
	 *             when String doesn't match the expected format
	 */
	public static Date convertStringToDate(String aMask, String strDate)
			throws ParseException {
		SimpleDateFormat df;
		Date date;
		df = new SimpleDateFormat(aMask);

		try {
			date = df.parse(strDate);
		} catch (ParseException pe) {
			// log.error("ParseException: " + pe);
			throw new ParseException(pe.getMessage(), pe.getErrorOffset());
		}

		return (date);
	}

	/**
	 * This method returns the current date time in the format: MM/dd/yyyy HH:MM
	 * a
	 * 
	 * @param theTime
	 *            the current time
	 * @return the current date/time
	 */
	public static String getTimeNow(Date theTime) {
		return getDateTime(TIME_PATTERN, theTime);
	}

	/**
	 * This method generates a string representation of a date's date/time in
	 * the format you specify on input
	 * 
	 * @param aMask
	 *            the date pattern the string is in
	 * @param aDate
	 *            a date object
	 * @return a formatted string representation of the date
	 * 
	 * @see SimpleDateFormat
	 */
	public static String getDateTime(String aMask, Date aDate) {
		SimpleDateFormat df = null;
		String returnValue = "";

		if (aDate == null) {
			return "";
		} else {
			df = new SimpleDateFormat(aMask);
			returnValue = df.format(aDate);
		}

		return (returnValue);
	}

	/**
	 * 验证数据是否Date类型
	 * 
	 * @param String
	 * @return
	 */
	public static boolean isDate(String strFormat, String strDate) {

		SimpleDateFormat df;
		df = new SimpleDateFormat(strFormat, Locale.ENGLISH);
		try {

			df.parse(strDate);
			return true;

		} catch (ParseException pe) {

		}

		return false;
	}
	
	/**
	 * 验证数据是否Date类型
	 * 
	 * @param String
	 * @return
	 */
	public static boolean isDate( String strDate) {

		SimpleDateFormat df;
		df = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
		try {

			df.parse(strDate);
			return true;

		} catch (ParseException pe) {

		}

		return false;
	}

	@SuppressWarnings("deprecation")
	public static String convertDate(String aMask, String strDate) {

		SimpleDateFormat df;
		df = new SimpleDateFormat(aMask, Locale.ENGLISH);
		String str = "";

		str = df.format(new Date(strDate));

		return str;
	}
    /**
     * 将给定的日期根据给的天数来调整
     * 
     * @author ss336
     * @param oldDate 需要调整的日期
     * @param days 需要调整的天数，正数表示往后调多少天，负数表示往前调多少天
     * @return 返回调整后的日期
     * */
    public static String adjustDate(Date oldDate,int days){
    	SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-dd");
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(oldDate);
		calendar.add(5,days);
		Date newDate = calendar.getTime();
		return sf.format(newDate);
    }
    
    /**
     * 将给定的日期根据给的天数来调整
     * 
     * @author ss336
     * @param oldDate 需要调整的日期
     * @param days 需要调整的天数，正数表示往后调多少天，负数表示往前调多少天
     * @return 返回调整后的日期
     * */
    public static Date adjustDateForReturnDate(Date oldDate,int days){
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(oldDate);
		calendar.add(5,days);
		Date newDate = calendar.getTime();
		return newDate;
    }
    
    /**
     * 将给定的日期根据给的天数来调整
     * 
     * @author ss336
     * @param oldDate 需要调整的日期
     * @param days 需要调整的天数，正数表示往后调多少天，负数表示往前调多少天
     * @return 返回调整后的日期
     * */
    public static String adjustDateForDateTime(Date oldDate,int days){
    	SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(oldDate);
		calendar.add(5,days);
		Date newDate = calendar.getTime();
		return sf.format(newDate);
    }
    
    /**
     * 导出日期格式化 by jerry
     */
	public static String formatDateTime(Object o, String format){
		String s = String.valueOf(o);
		if(s==null||"".equals("")){
			return "";
		}else{
			Date dt = (Date) o;
			String ds = DateUtil.getDateTimeString(format, dt);
			return ds;
		}
	}
    
    /**
     * @author Cheng Liangwei
     * @see 计算两个日期间的天数
     * @param beforeDate:起始日期
     * @param afterDate:截止日期
     * @return int:返回相隔的天数
     * */
    public static int spaceDays(Date beforeDate,Date afterDate){
    	long space=afterDate.getTime()-beforeDate.getTime();
    	return (int)(space/(60*60*24*1000));
    }
    
    /**
     * @author Cheng Liangwei
     * @see 比较两个日期的前后，前一个日期晚于后一个日期则返回TRUE
     * */
    public static boolean compareDates(Date firstDate,Date secondDate){
    	double first=Math.floor(firstDate.getTime()/(60*60*24*1000));
    	double after=Math.floor(secondDate.getTime()/(60*60*24*1000));
    	return first>after;
    }
    
    public static String formatDate(Date date){
		SimpleDateFormat f = new SimpleDateFormat(en_FORMAT,Locale.US);
		return f.format(date);
    } 
    
    /**
    * 该方法将字符串格式化为标准日期格式
    * 
    * @param String
    * @return String
    */
    public static String getFormatDate(String format, String datetime) {
       SimpleDateFormat df = new SimpleDateFormat(format);
       Date date;
       String strDate = "";
       try {
        date = df.parse(datetime);
        df.applyPattern(format);
        strDate = df.format(date);
       } catch (ParseException e) {
       }

       return strDate;
    }
    
    public static String formatDates(Date date){
//    	int L=SessionManager.getSysSession().getLanguage();
//    	if(L == 1)
//    	{
    		SimpleDateFormat f = new SimpleDateFormat(en_FORMAT,Locale.US);
    		return f.format(date);
//    	}
//    	SimpleDateFormat df = new SimpleDateFormat(DATE_FORMAT_STRING1);
//    	return df.format(date);
    } 
    
    /**
     * @author Cheng Liangwei
     * @throws Exception 
     * @see 获得一个默认的日期
     * */
    public static Date getInitDate() throws Exception{
    	return DateUtil.parseDate(DateUtil.DATE_FORMAT_STRING1, "0000-00-00");
    }

    /**
	 * 验证数据是否Date类型--并且日期大于1900-01-01年
	 * 
	 * @param String strFormat
	 * @param String strDate
	 * @return boolean
	 */
	public static boolean isBigDate(String strFormat, String strDate) {

		SimpleDateFormat df;
		df = new SimpleDateFormat(strFormat, Locale.ENGLISH);
		try {

			Date date = df.parse(strDate);
			DateFormat   df2   =   new   SimpleDateFormat("yy-MM-dd"); 
			if(date.compareTo(df2.parse("1900-01-01"))<0){
				return false;
			}
			return true;

		} catch (ParseException pe) {

		}

		return false;
	}
	/**
	 * by wangweidong
	 * 获取当前天的昨天
	 */
	public static Date getYesterday(){
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		cal.add(Calendar.DAY_OF_MONTH, -1);
		return cal.getTime();
	}
	/**
	 *  by wangweidong
	 *  获取当前天的前几周或后几周日期
	 */
	public static Date getDateByWeek(int week){
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		cal.add(Calendar.WEEK_OF_MONTH, week);
		return cal.getTime();
	}
	/**
	 * @see 获取前days或后days的日期
	 * @param week
	 * @return
	 */
	public static Date getDateBydays(Date date,int days){
		Calendar scalendar = Calendar.getInstance();
		scalendar.setTime(date);
		scalendar.add(Calendar.DATE, days);
		return scalendar.getTime();
	}
	/**
	 *  by brian
	 *  获取两个时间间隔数,毫秒
	 */
    public static int nDaysBetweenTwoDate(Date firstDate,Date secondDate) { 
    	int nDay=(int)((secondDate.getTime()-firstDate.getTime())); 
    	return nDay; 
    }
    
	/**
	 *  by brian
	 *  获取两个时间间隔数,分钟
	 */
    public static int nDaysBetweenTwoDate_min(Date firstDate,Date secondDate) { 
    	int nDay=(int)((secondDate.getTime()-firstDate.getTime())/(60*1000)); 
    	return nDay; 
    }
    
    /**
     * 将日期时间字符串根据转换为指定时区的日期时间.
     * 
     * @param srcFormater
     *            待转化的日期时间的格式.
     * @param srcDateTime
     *            待转化的日期时间.
     * @param dstFormater
     *            目标的日期时间的格式.
     * @param dstTimeZoneId
     *            目标的时区编号.
     * 
     * @return 转化后的日期时间.
     */
    public static Date string2Timezone(Date srcDateTime,String dstTimeZoneId) {
    	int diffTime = getDiffTimeZoneRawOffset(dstTimeZoneId);
        long nowTime = srcDateTime.getTime();
        long newNowTime = nowTime - diffTime;
        srcDateTime = new Date(newNowTime);
        return srcDateTime;
    }
    
    /**
     * 获取系统当前默认时区与指定时区的时间差.(单位:毫秒)
     * 
     * @param timeZoneId
     *            时区Id
     * @return 系统当前默认时区与指定时区的时间差.(单位:毫秒)
     */
    private static int getDiffTimeZoneRawOffset(String timeZoneId) {
        return TimeZone.getDefault().getRawOffset()
                - TimeZone.getTimeZone(timeZoneId).getRawOffset();
    }
    
    
	/**
	 *  by brian
	 *  获取两个时间间隔数,秒
	 */
    public static int nDaysBetweenTwoDate_po(Date firstDate,Date secondDate) { 
    	int nDay=(int)((secondDate.getTime()-firstDate.getTime())/(1000)); 
    	return nDay; 
    }
    
    public static boolean compareDatesEq(Date firstDate,Date secondDate){
    	double first=Math.floor(firstDate.getTime()/(60*60*24*1000));
    	double after=Math.floor(secondDate.getTime()/(60*60*24*1000));
    	return first>=after;
    }
    
//////////////////RMA PART////////////////
    /**
	 *  获取两个时间间隔数,天数
	 */
    public static int nDaysBetweenTwoDate_day(Date firstDate,Date secondDate) { 
    	return (int)((secondDate.getTime()-firstDate.getTime())/(24*60*60*1000)); 
    }
    
    public static Date parseXMLUTCDate(String dateStr) throws ParseException{
    	SimpleDateFormat sf= new SimpleDateFormat(UTC_TIME_FORMAT_STRING,Locale.ENGLISH);
    	return sf.parse(dateStr);
    }
    
    public static Date parsePageShowDate(String dateStr) throws ParseException{
    	SimpleDateFormat sf= new SimpleDateFormat(PAGE_SHOW_FORMAT_STRING,Locale.ENGLISH);
    	return sf.parse(dateStr);
    }
    
    /**
     * trunsXMLGregorianCalendar
     * */
    public static Date trunsXMLGregorianCalendar(XMLGregorianCalendar xmlGregorianCalendar){
    	if(xmlGregorianCalendar==null){
    		return null;
    	}
    	Calendar cal=Calendar.getInstance();
    	cal.set(xmlGregorianCalendar.getYear(), xmlGregorianCalendar.getMonth()-1, xmlGregorianCalendar.getDay(), xmlGregorianCalendar.getHour(), xmlGregorianCalendar.getMinute(), xmlGregorianCalendar.getSecond());
    	return cal.getTime();
    }
    
//    public static void main(String[] args){
//    	String d="Sep. 5 2013";
//    	try {
//			System.out.println(DateUtil.praseLocalDate("CA", d));
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
////    	String d2="2013-09-05";
////    	try {
////			Date d=DateUtil.parseDate(DateUtil.DATE_FORMAT_STRING1,d2);
////			System.out.println(DateUtil.getDateString2(DateUtil.en_FORMAT, d));
////		} catch (ParseException e) {
////			// TODO Auto-generated catch block
////			e.printStackTrace();
////		}
//    }
//    
    
    
    /**
     * get the date format for the local
     * @throws ParseException 
     * Sept. 5 2013  Sept. 5 2013
     * */
    public static Date praseLocalDate(String local,String dateStr) throws ParseException{
    	SimpleDateFormat sf=null;
    	if(DE.equals(local)){
			sf= new SimpleDateFormat("dd. MMM yyyy",Locale.GERMANY);
		}else if(FR.equals(local)){
			sf= new SimpleDateFormat("dd MMM yyyy",Locale.FRENCH);
		}else if(IT.equals(local)){//11 apri 2015
			sf= new SimpleDateFormat("dd MMM yyyy",Locale.ITALIAN);
		}else if(Constants.Country.ES.equals(local)){
			sf= new SimpleDateFormat("dd MMM yyyy",new Locale("es", Constants.Country.ES));
		}else if(Constants.Country.UK.equals(local)){
			if(dateStr.indexOf(".")>0){
				if(dateStr.indexOf("Sept")>=0){
					dateStr=dateStr.replaceFirst("Sept","Sep");
				}
				sf= new SimpleDateFormat("dd MMM. yyyy",Locale.ENGLISH);
			}else {
				sf= new SimpleDateFormat("dd MMM yyyy",Locale.ENGLISH);
			}
		}else if(Constants.Country.JP.equals(local)){
			sf= new SimpleDateFormat("yyyy/MMM/dd",Locale.JAPANESE);
		}else if(Constants.Country.US.equals(local)){
			String[] fs=new String[]{"yyyy/MMM/dd","MMM dd, yyyy"};
			Date d=null;
			for(String f:fs){
				try{
					d=new SimpleDateFormat(f,Locale.US).parse(dateStr);
				}catch(Exception e){
					continue;
				}
				return d;
			}
		}else if(Constants.Country.CA.equals(local)){
			if(dateStr.indexOf(".")>0){
				if(dateStr.indexOf("Sept")>=0){
					dateStr=dateStr.replaceFirst("Sept","Sep");
				}
				sf= new SimpleDateFormat("MMM. dd yyyy",Locale.CANADA);
			}else {
				sf= new SimpleDateFormat("MMM dd yyyy",Locale.CANADA);//MMM dd yyyy
			}
		}else {
			sf= new SimpleDateFormat("MMM dd, yyyy",Locale.ENGLISH);
		}
    	return sf.parse(Constants.Country.ES.equals(local)?dateStr.replaceAll(" de "," "):dateStr);
    }
    
}
