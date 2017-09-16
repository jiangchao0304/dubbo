package com.sunvalley.erp.entity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import com.google.gson.reflect.TypeToken;
import com.sunvalley.erp.util.DateUtil;
import com.sunvalley.erp.util.ToolUtil;
import com.sunvalley.erp.util.exception.UniteException;
import com.sunvalley.erp.util.json.JsonParse;

@SuppressWarnings("nls")
public class FilterOP {

	public String getFilterSQL(String jsonData) throws ParseException {
		List<FilterModel> filterModelList = getFliterList(jsonData);
		return getSQL(filterModelList);
	}

	public String getFilterSQL(List<FilterModel> filterModelList) throws ParseException {
		return getSQL(filterModelList);
	}

	@SuppressWarnings("unchecked")
	public List<FilterModel> getFliterList(String jsonData) {
		List<FilterModel> filterModelList=(List<FilterModel>) JsonParse.fromJson(jsonData,
				new TypeToken<List<FilterModel>>() {
		}.getType());
		if(null!=filterModelList&&filterModelList.size()>0){
			for(FilterModel fm : filterModelList){//循环处理SQL注入的问题
				if(null!=fm.getValue()&&!"".equals(fm.getValue())){
					fm.setValue(fm.getValue().replaceAll("'", " "));
				}
			}
		}
		return filterModelList;
	}

	private String getSQL(List<FilterModel> filterModelList) throws ParseException {
		StringBuffer sqlString = new StringBuffer(512);
		for (FilterModel filterModel : filterModelList) {
			try {
				String sql=getSQL(filterModel);
					sqlString.append(sql);
			} catch (Exception e) {

			}
		}
		return sqlString.toString();
	}

	public String getSQL(FilterModel filterModel)
			throws ParseException {
		StringBuffer sqlString=new StringBuffer();
		String filtervalue=filterModel.getValue();
		if(null!=filtervalue&&!"".equals(filtervalue)){
			filtervalue = filtervalue.replaceAll("'", " ");
		}
		
		if ("daterange".equals(filterModel.getDatatype())) {
			// 对于Date格式的值做特殊处理

		}
		if ("num".equals(filterModel.getDatatype())&&!"IN".equals(filterModel.getOper())) {
			try{
				Double.parseDouble(filterModel.getValue());
			}catch(Exception e){
				throw new UniteException(filterModel.getFiled()+" must be number!");
			}
			// 对于数字格式的值做特殊处理

			// 1.如果是LIKE，默认转化为EQ
			if ("LIKE".equals(filterModel.getOper())) {
				filterModel.setOper("EQ");
			}
		}

		// EQ,LT,GT,LE,GE,LIKE,NE,IN,RANGE
		if ("LIKE".equals(filterModel.getOper())) {
//			if(filterModel.getFiled().equals("bs_item.sku")){
//				sqlString.append(" and " + filterModel.getFiled() + " like '"
//						+ filtervalue+ "%'");
//			}
			String [] s =filterModel.getFiled().split("\\.");
			String s2;
			if(s.length>1){
				 s2=s[1];
			}else{
				s2=filterModel.getFiled();
			}
			if(s2.equals("sku")){
				sqlString.append(" and " + filterModel.getFiled() + " like '" + filtervalue.trim()+ "%'");
			}			
			else{
				sqlString.append(" and " + filterModel.getFiled() + " like '%"
						+ filtervalue.trim()+ "%'");
			}
			
		}
				
		

		
		if ("LLIKE".equals(filterModel.getOper())) {
			sqlString.append(" and " + filterModel.getFiled() + " like '%"
					+ filtervalue.trim()+ "'");
		}
		if ("RLIKE".equals(filterModel.getOper())) {
			sqlString.append(" and " + filterModel.getFiled() + " like '"
					+ filtervalue.trim()+ "%'");
		}
		if ("LMRLIKE".equals(filterModel.getOper())) {
			String[] filtervalues = filtervalue.split(" ");
			String str = "";
			for(String v : filtervalues) {
				if(!v.trim().equals("")) {
					str = str.trim() + "%" + v.trim();
				}
			}
			sqlString.append(" and " + filterModel.getFiled() + " like '"
					+ str.trim()+ "%'");
		}
		if ("EQ".equals(filterModel.getOper())) {
			//数字类型的处理
			if("num".equals(filterModel.getDatatype())){
				sqlString.append(" and " + filterModel.getFiled() + " = "
						+ filtervalue.trim());
			}else {
				sqlString.append(" and " + filterModel.getFiled() + " = '"
						+ filtervalue.trim() + "'");
			}
		}
		if ("LT".equals(filterModel.getOper())) {
			//数字类型的处理
			if("num".equals(filterModel.getDatatype())){
				sqlString.append(" and " + filterModel.getFiled() + " < "
						+ filtervalue.trim());
			}else {
				sqlString.append(" and " + filterModel.getFiled() + " < '"
						+ filtervalue.trim() + "'");
			}
		}
		if ("GT".equals(filterModel.getOper())) {
			//数字类型的处理
			if("num".equals(filterModel.getDatatype())){
				sqlString.append(" and " + filterModel.getFiled() + " > "
						+ filtervalue.trim());
			}else {
				sqlString.append(" and " + filterModel.getFiled() + " > '"
						+ filtervalue.trim() + "'");
			}
		}
		if ("LE".equals(filterModel.getOper())) {
			//数字类型的处理
			if("num".equals(filterModel.getDatatype())){
				sqlString.append(" and " + filterModel.getFiled() + " <= "
						+ filtervalue.trim());
			}else {
				sqlString.append(" and " + filterModel.getFiled() + " <= '"
						+ filtervalue.trim() + "'");
			}
		}
		if ("GE".equals(filterModel.getOper())) {
			//数字类型的处理
			if("num".equals(filterModel.getDatatype())){
				sqlString.append(" and " + filterModel.getFiled() + " >= "
						+ filtervalue.trim());
			}else {
				sqlString.append(" and " + filterModel.getFiled() + " >= '"
						+ filtervalue.trim() + "'");
			}
		}
		/*
		 * if("NE".equals(filterModel.getOper())){ String sql="and
		 * "+filterModel.getFiled()+"="+filterModel.getValue(); }
		 */
		if ("IN".equals(filterModel.getOper())) {
			String multipleValue = filtervalue;
			String[] a = multipleValue.split(",");
			String value = "";
			for (String v : a) {
				if (!"".equals(v.trim())){
					if("num".equals(filterModel.getDatatype())){
						value +=v.trim() + ",";
					}else {
						value = value.trim() + "'" + v.trim() + "',";
					}
				}
			}
			value = value.substring(0, value.length() - 1);
			sqlString.append(" and " + filterModel.getFiled() + " IN (" + value
					+ ")");
		}

		if ("NOT IN".equals(filterModel.getOper())) {
			String multipleValue = filtervalue.trim();
			String[] a = multipleValue.split(",");
			String value = "";
			for (String v : a) {
				if (!"".equals(v.trim())){
					if("num".equals(filterModel.getDatatype())){
						value +=v.trim() + ",";
					}else {
						value = value + "'" + v.trim() + "',";
					}
				}
			}
			value = value.substring(0, value.length() - 1);
			sqlString.append(" and " + filterModel.getFiled() + " NOT IN (" + value
					+ ")");
		}
		if ("RANGE".equals(filterModel.getOper())) {
			String[] a = filtervalue.split("\t");
			if(!("".equals(a[0])))
			{
				if("num".equals(filterModel.getDatatype())){
					sqlString.append(" and " + filterModel.getFiled()
							+ " >= " + a[0].trim());
				}else {
					sqlString.append(" and " + filterModel.getFiled()
							+ " >= '" + a[0].trim() + "'");
				}
			}
			if(a.length==2 && !("".equals(a[1])) )
			{
				if("date".equals(filterModel.getDatatype()))
				{
					a[1]= DateUtil.adjustDate(DateUtil.getParseDate1(a[1]),1);
					sqlString.append(" and " + filterModel.getFiled()
							+ " < '" + a[1].trim() + "'");
				}else if("num".equals(filterModel.getDatatype())){
					sqlString.append(" and " + filterModel.getFiled()
							+ " <= " + a[1].trim());
				}else {
					sqlString.append(" and " + filterModel.getFiled()
							+ " <= '" + a[1].trim() + "'");
				}
				
			}
		}
		//新增a.id>b.id这样的sql
		if ("GT_C".equals(filterModel.getOper())) {
			sqlString.append(" and " + filterModel.getFiled() + " > "
					+ filtervalue.trim());
		}
		// value1 AND value2
		if("ISNULL".equals(filterModel.getOper())){
			if("0".equalsIgnoreCase(filtervalue)){
				sqlString.append(" and " + filterModel.getFiled() + " is null ");
			}
			if("1".equalsIgnoreCase(filtervalue)){
				sqlString.append(" and " + filterModel.getFiled() + " is not null ");
			}
		}
		if ("INTERVAL".equals(filterModel.getOper().toUpperCase())) {
			//数字类型的处理
			List<String> fieldList= ToolUtil.toStringList(filterModel.getFiled(), ",");
			if(fieldList.size()<=1){
				return ""; //如果只有filter项,则直接返回
			}				
			sqlString.append( generateSql(filterModel.getValue(),fieldList)); 
		}
		//如果含有","则用IN的子查询,如果不含",",则用左匹配查询
		if("RLIKEIN".equals(filterModel.getOper().toUpperCase())){
			if(filtervalue!=null && filtervalue.indexOf(",")>0){
				String multipleValue = filtervalue;
				String[] a = multipleValue.split(",");
				String value = "";
				for (String v : a) {
					if (!"".equals(v.trim())){
						if("num".equals(filterModel.getDatatype())){
							value +=v.trim() + ",";
						}else {
							value = value + "'" + v.trim() + "',";
						}
					}
				}
				value = value.substring(0, value.length() - 1);
				sqlString.append(" and " + filterModel.getFiled() + " IN (" + value.trim()	+ ")");
			}else{
				sqlString.append(" and " + filterModel.getFiled() + " like '" + filtervalue.trim()+ "%'");
			}
		}
		//如果含有","则用IN的子查询,如果不含",",则用左匹配查询
		if("LIKEIN".equals(filterModel.getOper().toUpperCase())){
			if(filtervalue!=null && filtervalue.indexOf(",")>0){
				String multipleValue = filtervalue;
				String[] a = multipleValue.split(",");
				String value = "";
				for (String v : a) {
					if (!"".equals(v.trim())){
						if("num".equals(filterModel.getDatatype())){
							value +=v.trim() + ",";
						}else {
							value = value + "'" + v.trim() + "',";
						}
					}
				}
				value = value.substring(0, value.length() - 1);
				sqlString.append(" and " + filterModel.getFiled() + " IN (" + value.trim()	+ ")");
			}else{
				sqlString.append(" and " + filterModel.getFiled() + " like '%" + filtervalue.trim()+ "%'");
			}
		}
		return sqlString.toString();
	}
	
	
	private String generateSql(String valueStr,List<String> fieldList){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String sql="";
		if(fieldList==null||fieldList.size()<=2)
			return sql.trim();
		List<String> dateList=new ArrayList<String>();
		String[] values=valueStr.split(",");
		
		Calendar c=Calendar.getInstance();
		dateList.add(sdf.format(c.getTime()));
		for(int i=0;i<values.length;i++){
			Calendar calendar=Calendar.getInstance();
			calendar.add(Calendar.DAY_OF_YEAR, 0-Integer.parseInt(values[i]));			
			dateList.add(sdf.format(calendar.getTime()));
		}
		
		String sql_1=",ROUND(SUM(IFNULL(" +
		" CASE WHEN"+  
		" %s<='%s'"+ 
		" AND %s>'%s'"+ 
		" THEN %s END,0.00 )),2)"; 


		String sql_2=",SUM(IFNULL("+ 
		" CASE WHEN"+ 
		" %s<='%s'"+ 
		" AND %s>'%s'"+ 
		" THEN %s END,0.00))";

		String sql_1_more=",ROUND(SUM(IFNULL("+ 
				" CASE WHEN ("+ 
				" %s<='%s'"+ 
				" OR "+
				" %s IS NULL "+
				" OR "+
				" YEAR(%s)=0)"+				 
				" THEN %s END,0.00 ) ),2)"; 


		String sql_2_more=",SUM(IFNULL("+ 
				" CASE WHEN ("+ 
				" %s<='%s'"+ 
				" OR "+
				" %s IS NULL "+
				" OR "+
				" YEAR(%s)=0)"+		
				" THEN %s END,0.00))";
		String gt=">";
		for(int i=0;i<values.length;i++){
			sql+=String.format(sql_1,fieldList.get(0), dateList.get(i),fieldList.get(0),dateList.get(1+i),fieldList.get(1)).concat("as '%s'");			
			if(fieldList.size()>=3){	
				sql+=String.format(sql_2,fieldList.get(0), dateList.get(i),fieldList.get(0),dateList.get(1+i),fieldList.get(2)).concat("as '%s'");
			}
		}
		
		sql+=String.format(sql_1_more,fieldList.get(0), dateList.get(dateList.size()-1),fieldList.get(0),fieldList.get(0),fieldList.get(1)).concat("as '").concat(gt).concat("%s'");
		if(fieldList.size()>=3){
			sql+=String.format(sql_2_more,fieldList.get(0), dateList.get(dateList.size()-1),fieldList.get(0),fieldList.get(0),fieldList.get(2)).concat("as '").concat(gt).concat("%s'");
		}
		
		return sql.trim();
	}	 
	
	
}
