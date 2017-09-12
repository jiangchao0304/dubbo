package com.sunvalley.erp.util;

import com.sunvalley.erp.util.exception.UniteException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
/**
 * Date Utility Class used to convert Strings to Dates and Timestamps
 * 
 * to correct time pattern. Minutes should be mm not MM (MM is month).
 */
@SuppressWarnings("nls")
public class DateUtil {
	private static Logger log = LoggerFactory.getLogger(DateUtil.class);
	public static final String TIME_PATTERN = "HH:mm";
	/*
	 * styles of date format
	 */
	public static final String DATE_FORMAT_STRING1 = "yyyy-MM-dd";
	public static final String DATE_FORMAT_STRING2 = "yyyy/MM/dd";
	public static final String DATE_FORMAT_STRING3 = "yyyy年MM月dd日";
	public static final String DATE_FORMAR_STRING10 = "yyyy年MM月";
	public static final String DATE_FORMAT_STRING4 = "yyyyMMdd";
	public static final String DATE_FORMAT_STRING5 = "MMM-dd-yy";
	public static final String DATE_FORMAT_STRING6 = "dd.MM.yyyy";
	public static final String DATE_FORMAT_STRING7 = "yyyyMM";
	public static final String DATE_FORMAT_STRING8 = "dd-MMM-yy";
	public static final String DATE_FORMAT_STRING9 = "yyMMdd";
	public static final String en_FORMAT = "MMM dd yyyy";
	//"Mon, 12.01.2015 15:47 h" ""dd.MM.yyyy HH:mm
	public static final String DATE_TIME_FORMAT_STRING1 = "yyyy-MM-dd HH:mm:ss";
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
	public static final String YEAR_FORMAT_STRING = "yyyy";
	public static final String TIME_FORMAT_STRING1 = "HH:mm:ss";
	public static final String TIME_FORMAT_STRING2 = "HH时mm分ss秒";
	public static final String DATE_TIME_FORMART_STRING14 ="yyyy/MM/dd HH:mm";
	public static final String DATE_TIME_FORMAT_STRING15="dd.MM.yyyy HH:mm";
	
	
    public static final String YYYYMMDD = "yyyy-MM-dd";  
    public static final String YYYYMMDD_ZH = "yyyy年MM月dd日";  
    public static final int FIRST_DAY_OF_WEEK = Calendar.MONDAY; // 中国周一是一周的第一天  

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
	
	public static Date parseDate3(Date date){
		SimpleDateFormat format = new SimpleDateFormat(DATE_FORMAT_STRING1,
				Locale.ENGLISH);
		try {
			return format.parse(format.format(date));
		} catch (ParseException e) {
			throw new UniteException(e.toString());
		}
	}
	
	public static Date parseDate4(Date date){
		SimpleDateFormat format = new SimpleDateFormat(DATE_FORMAT_STRING1);
		try {
			return format.parse(format.format(date));
		} catch (ParseException e) {
			throw new UniteException(e.toString());
		}
	}
	
	public static Date parseDate5(Date date){
		SimpleDateFormat format = new SimpleDateFormat(DATE_TIME_FORMAT_STRING1);
		try {
			return format.parse(format.format(date));
		} catch (ParseException e) {
			throw new UniteException(e.toString());
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
	 * @param
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
	 * @param
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
	 * @param
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
	 * The first day of last month
	 * @param date
	 * @return
	 * @throws ParseException
	 */
	public static Date getFirstDayByLastMonth(Date date)
			throws ParseException {
		Calendar scalendar = new GregorianCalendar();
		scalendar.setTime(date);
		scalendar.add(Calendar.MONTH, -1);
		scalendar.set(Calendar.DAY_OF_MONTH, 1);
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
	 * @param strFormat
	 * @param strDate
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
	 * @param strDate
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

		if (log.isDebugEnabled()) {
			log.debug("converting '" + strDate + "' to date with mask '"
					+ aMask + "'");
		}

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
//	public static String formatDateTime(Object o, String format){
//		String s = String.valueOf(o);
//		if(StringUtil.trim(s).equals("")){
//			return "";
//		}else{
//			Date dt = (Date) o;
//			String ds = DateUtil.getDateTimeString(format, dt);
//			return ds;
//		}
//	}
    
    /**
     * @author Cheng Liangwei
     * @see "计算两个日期间的天数"
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
     * @see "计算两个日期间的天数"
     * @param beforeDate:起始日期
     * @param afterDate:截止日期
     * @return int:返回相隔的天数
     * */
    public static int spaceHours(Date beforeDate,Date afterDate){
    	long space=afterDate.getTime()-beforeDate.getTime();
    	return (int)(space/(60*60*1000));
    }
    
    /**
     * @author Cheng Liangwei
     * @see "比较两个日期的前后，前一个日期晚于后一个日期则返回TRUE"
     * */
    public static boolean compareDates(Date firstDate,Date secondDate){
    	double first=Math.floor(firstDate.getTime()/(60*60*24*1000));
    	double after=Math.floor(secondDate.getTime()/(60*60*24*1000));
    	return first>after;
    }
    
//    public static String formatDate(Date date){
//    	int L=SessionManager.getSysSession().getLanguage();
//    	if(L == 1)
//    	{
//    		SimpleDateFormat f = new SimpleDateFormat(en_FORMAT,Locale.US);
//    		return f.format(date);
//    	}
//    	SimpleDateFormat df = new SimpleDateFormat(DATE_FORMAT_STRING1);
//    	return df.format(date);
//    }
    
    /**
    * 该方法将字符串格式化为标准日期格式
    * 
    * @param format
	* @param datetime
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
     * @see "获得一个默认的日期"
     * */
    public static Date getInitDate() throws Exception{
    	return DateUtil.parseDate(DateUtil.DATE_FORMAT_STRING1, "0000-00-00");
    }

    /**
	 * 验证数据是否Date类型--并且日期大于1900-01-01年
	 * 
	 * @param  strFormat
	 * @param strDate
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
	 * 获得系统上个月第一天
	 * @return
	 */
	public static Date geLastMonthFirstDay(){
		Calendar cal = Calendar.getInstance();
		  cal.set(Calendar.DAY_OF_MONTH, 1);
		  cal.add(Calendar.DAY_OF_MONTH, -1);
		cal.set(Calendar.DAY_OF_MONTH, 1);
		return cal.getTime();//第一天
	}
	/**
	 * 获得系统时间上个最后一天
	 * @return
	 */
	public static Date getMonethLastDay(){
		Calendar cal = Calendar.getInstance();
		  cal.set(Calendar.DAY_OF_MONTH, 1);
		  cal.add(Calendar.DAY_OF_MONTH, -1);
		  return  cal.getTime();// 最后一天
		
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
	 * @see "获取前days或后days的日期"
	 * @param date
	 * @param days
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
     * @param srcDateTime
     *            待转化的日期时间的格式.
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
    /**
	 *  验证参数时间是否大于（比当前时间大一天的时间）
     * @throws ParseException 
	 */
    public static boolean isMoreThanNowOneDay(Date date) throws ParseException{
		if(DateUtil.compareDates( DateUtil.parseDate5(date), DateUtil.parseDateTime(DATE_TIME_FORMAT_STRING1,adjustDateForDateTime(new Date(),1)))){
			return true;
		}else{
			return false;
		}
    }
    
    /**
     * 将日期转为特定日期
     * @param paramDate 参考日期
     * @param year 需要减少的年份
     * @param month 需要减少的月份
     * @param dateOfMonth 需要减少的天
     * @param flag 类型：0获得当月第一天、1获得当月最后一天、-1返回当前天数
     * @param isMaxTime 是否返回当天最大时间
     * @return 
     */
    public static Date adjustDateReturnDate(Date paramDate,int year,int month,int dateOfMonth,int flag,boolean isMaxTime){
    	
    	Calendar cal = Calendar.getInstance();
		cal.setTime(paramDate);
    	int date = cal.get(Calendar.DATE);
		cal.set(Calendar.YEAR, cal.get(Calendar.YEAR)-year);
		cal.set(Calendar.MONTH, cal.get(Calendar.MONTH)-month);
		cal.set(Calendar.DATE, date-dateOfMonth);
		if(flag==0){
			cal.set(Calendar.DAY_OF_MONTH, 1);//设置为1，当前日期即为本月第一天
		}
		if(flag==1){
			cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DAY_OF_MONTH));//获得当月最大天数，即为当月最后一天
		}
		if(isMaxTime){
			cal.set(Calendar.HOUR, 23);
			cal.set(Calendar.MINUTE, 59);
			cal.set(Calendar.SECOND, 59);
		}
		return cal.getTime();
    }
    
    
    
  
    /** 
     * format date 
     *  
     * @param date 
     * @param pattern 
     * @return 
     */  
    public static String formatDate(Date date, String pattern) {  
        String strDate = null;  
        try {  
            if (pattern == null) {  
                pattern = YYYYMMDD;  
            }  
            SimpleDateFormat format = new SimpleDateFormat(pattern);  
            strDate = format.format(date);  
        } catch (Exception e) {  
        }  
        return strDate;  
    }  
  
    /** 
     * 取得日期：年 
     *  
     * @param date 
     * @return 
     */  
    public static int getYear(Date date) {  
        Calendar c = Calendar.getInstance();  
        c.setTime(date);  
        int year = c.get(Calendar.YEAR);  
        return year;  
    }  
  
    /** 
     * 取得日期：年 
     *  
     * @param date 
     * @return 
     */  
    public static int getMonth(Date date) {  
        Calendar c = Calendar.getInstance();  
        c.setTime(date);  
        int month = c.get(Calendar.MONTH);  
        return month + 1;  
    }  
  
    /** 
     * 取得日期：年 
     *  
     * @param date 
     * @return 
     */  
    public static int getDay(Date date) {  
        Calendar c = Calendar.getInstance();  
        c.setTime(date);  
        int da = c.get(Calendar.DAY_OF_MONTH);  
        return da;  
    }  
  
    /** 
     * 取得当天日期是周几 
     *  
     * @param date 
     * @return 
     */  
    public static int getWeekDay(Date date) {  
        Calendar c = Calendar.getInstance();  
        c.setTime(date);  
        int week_of_year = c.get(Calendar.DAY_OF_WEEK);  
        return week_of_year - 1;  
    }  
  
    /** 
     * 取得一年的第几周 
     *  
     * @param date 
     * @return 
     */  
    public static int getWeekOfYear(Date date) {  
        Calendar c = Calendar.getInstance();  
        c.setTime(date);  
        int week_of_year = c.get(Calendar.WEEK_OF_YEAR);  
        return week_of_year;  
    }  
  
    /** 
     * getWeekBeginAndEndDate 
     *  
     * @param date 
     * @param pattern 
     * @return 
     */  
    public static String getWeekBeginAndEndDate(Date date, String pattern) {  
        Date monday = getMondayOfWeek(date);  
        Date sunday = getSundayOfWeek(date);  
        return formatDate(monday, pattern) + " - "  
                + formatDate(sunday, pattern);  
    }  
  
    /** 
     * 根据日期取得对应周周一日期 
     *  
     * @param date 
     * @return 
     */  
    public static Date getMondayOfWeek(Date date) {  
        Calendar monday = Calendar.getInstance();  
        monday.setTime(date);  
        monday.setFirstDayOfWeek(FIRST_DAY_OF_WEEK);  
        monday.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);  
        return monday.getTime();  
    }  
  
    /** 
     * 根据日期取得对应周周日日期 
     *  
     * @param date 
     * @return 
     */  
    public static Date getSundayOfWeek(Date date) {  
        Calendar sunday = Calendar.getInstance();  
        sunday.setTime(date);  
        sunday.setFirstDayOfWeek(FIRST_DAY_OF_WEEK);  
        sunday.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);  
        return sunday.getTime();  
    }  
  
    /** 
     * 取得月的剩余天数 
     *  
     * @param date 
     * @return 
     */  
    public static int getRemainDayOfMonth(Date date) {  
        int dayOfMonth = getDayOfMonth(date);  
        int day = getPassDayOfMonth(date);  
        return dayOfMonth - day;  
    }  
  
    /** 
     * 取得月已经过的天数 
     *  
     * @param date 
     * @return 
     */  
    public static int getPassDayOfMonth(Date date) {  
        Calendar c = Calendar.getInstance();  
        c.setTime(date);  
        return c.get(Calendar.DAY_OF_MONTH);  
    }  
  
    /** 
     * 取得月天数 
     *  
     * @param date 
     * @return 
     */  
    public static int getDayOfMonth(Date date) {  
        Calendar c = Calendar.getInstance();  
        c.setTime(date);  
        return c.getActualMaximum(Calendar.DAY_OF_MONTH);  
    }  
  
    /** 
     * 取得月第一天 
     *  
     * @param date 
     * @return 
     */  
    public static Date getFirstDateOfMonth(Date date) {  
        Calendar c = Calendar.getInstance();  
        c.setTime(date);  
        c.set(Calendar.DAY_OF_MONTH, c.getActualMinimum(Calendar.DAY_OF_MONTH));  
        return c.getTime();  
    }  
  
    /** 
     * 取得月最后一天 
     *  
     * @param date 
     * @return 
     */  
    public static Date getLastDateOfMonth(Date date) {  
        Calendar c = Calendar.getInstance();  
        c.setTime(date);  
        c.set(Calendar.DAY_OF_MONTH, c.getActualMaximum(Calendar.DAY_OF_MONTH));  
        return c.getTime();  
    }  
  
    /** 
     * 取得季度第一天 
     *  
     * @param date 
     * @return 
     */  
    public static Date getFirstDateOfSeason(Date date) {  
        return getFirstDateOfMonth(getSeasonDate(date)[0]);  
    }  
  
    /** 
     * 取得季度最后一天 
     *  
     * @param date 
     * @return 
     */  
    public static Date getLastDateOfSeason(Date date) {  
        return getLastDateOfMonth(getSeasonDate(date)[2]);  
    }  
  
    /** 
     * 取得季度天数 
     *  
     * @param date 
     * @return 
     */  
    public static int getDayOfSeason(Date date) {  
        int day = 0;  
        Date[] seasonDates = getSeasonDate(date);  
        for (Date date2 : seasonDates) {  
            day += getDayOfMonth(date2);  
        }  
        return day;  
    }  
  
    /** 
     * 取得季度剩余天数 
     *  
     * @param date 
     * @return 
     */  
    public static int getRemainDayOfSeason(Date date) {  
        return getDayOfSeason(date) - getPassDayOfSeason(date);  
    }  
  
    /** 
     * 取得季度已过天数 
     *  
     * @param date 
     * @return 
     */  
    public static int getPassDayOfSeason(Date date) {  
        int day = 0;  
  
        Date[] seasonDates = getSeasonDate(date);  
  
        Calendar c = Calendar.getInstance();  
        c.setTime(date);  
        int month = c.get(Calendar.MONTH);  
  
        if (month == Calendar.JANUARY || month == Calendar.APRIL  
                || month == Calendar.JULY || month == Calendar.OCTOBER) {// 季度第一个月  
            day = getPassDayOfMonth(seasonDates[0]);  
        } else if (month == Calendar.FEBRUARY || month == Calendar.MAY  
                || month == Calendar.AUGUST || month == Calendar.NOVEMBER) {// 季度第二个月  
            day = getDayOfMonth(seasonDates[0])  
                    + getPassDayOfMonth(seasonDates[1]);  
        } else if (month == Calendar.MARCH || month == Calendar.JUNE  
                || month == Calendar.SEPTEMBER || month == Calendar.DECEMBER) {// 季度第三个月  
            day = getDayOfMonth(seasonDates[0]) + getDayOfMonth(seasonDates[1])  
                    + getPassDayOfMonth(seasonDates[2]);  
        }  
        return day;  
    }  
  
    /** 
     * 取得季度月 
     *  
     * @param date 
     * @return 
     */  
    public static Date[] getSeasonDate(Date date) {  
        Date[] season = new Date[3];  
  
        Calendar c = Calendar.getInstance();  
        c.setTime(date);  
  
        int nSeason = getSeason(date);  
        if (nSeason == 1) {// 第一季度  
            c.set(Calendar.MONTH, Calendar.JANUARY);  
            season[0] = c.getTime();  
            c.set(Calendar.MONTH, Calendar.FEBRUARY);  
            season[1] = c.getTime();  
            c.set(Calendar.MONTH, Calendar.MARCH);  
            season[2] = c.getTime();  
        } else if (nSeason == 2) {// 第二季度  
            c.set(Calendar.MONTH, Calendar.APRIL);  
            season[0] = c.getTime();  
            c.set(Calendar.MONTH, Calendar.MAY);  
            season[1] = c.getTime();  
            c.set(Calendar.MONTH, Calendar.JUNE);  
            season[2] = c.getTime();  
        } else if (nSeason == 3) {// 第三季度  
            c.set(Calendar.MONTH, Calendar.JULY);  
            season[0] = c.getTime();  
            c.set(Calendar.MONTH, Calendar.AUGUST);  
            season[1] = c.getTime();  
            c.set(Calendar.MONTH, Calendar.SEPTEMBER);  
            season[2] = c.getTime();  
        } else if (nSeason == 4) {// 第四季度  
            c.set(Calendar.MONTH, Calendar.OCTOBER);  
            season[0] = c.getTime();  
            c.set(Calendar.MONTH, Calendar.NOVEMBER);  
            season[1] = c.getTime();  
            c.set(Calendar.MONTH, Calendar.DECEMBER);  
            season[2] = c.getTime();  
        }  
        return season;  
    }  
  
    /** 
     *  
     * 1 第一季度 2 第二季度 3 第三季度 4 第四季度 
     *  
     * @param date 
     * @return 
     */  
    public static int getSeason(Date date) {  
  
        int season = 0;  
  
        Calendar c = Calendar.getInstance();  
        c.setTime(date);  
        int month = c.get(Calendar.MONTH);  
        switch (month) {  
        case Calendar.JANUARY:  
        case Calendar.FEBRUARY:  
        case Calendar.MARCH:  
            season = 1;  
            break;  
        case Calendar.APRIL:  
        case Calendar.MAY:  
        case Calendar.JUNE:  
            season = 2;  
            break;  
        case Calendar.JULY:  
        case Calendar.AUGUST:  
        case Calendar.SEPTEMBER:  
            season = 3;  
            break;  
        case Calendar.OCTOBER:  
        case Calendar.NOVEMBER:  
        case Calendar.DECEMBER:  
            season = 4;  
            break;  
        default:  
            break;  
        }  
        return season;  
    }
    
    /**
     * 判断给定日期是否为月末的一天
     * @param date
     * @return
     */
    public static boolean isLastDayOfMonth(Date date) { 
        Calendar calendar = Calendar.getInstance(); 
        calendar.setTime(date); 
        calendar.set(Calendar.DATE, (calendar.get(Calendar.DATE) + 1)); 
        if (calendar.get(Calendar.DAY_OF_MONTH) == 1) { 
            return true; 
        } 
        return false; 
    } 
    
    /**
     * 获得给定日期上个月最后一天
     * @return
     */
    public static Date getLastMonthLastDay(Date date){
	    Calendar cal = Calendar.getInstance();
	    cal.setTime(date);
	    cal.set(Calendar.DAY_OF_MONTH, 1);
	    cal.add(Calendar.DAY_OF_MONTH, -1);
	    return cal.getTime();
    }
    
    /**
     * 获得给定日期下个月第一天
     * @return
     */
    public static Date getFirstDayByNextMonth(Date date){
	    Calendar cal = Calendar.getInstance();
	    cal.setTime(date);
	    cal.set(Calendar.DAY_OF_MONTH, 1);
	    cal.add(Calendar.MONTH, 1);
	    return cal.getTime();
    }
    
}
