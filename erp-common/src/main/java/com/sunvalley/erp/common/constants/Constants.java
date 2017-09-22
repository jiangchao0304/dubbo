package com.sunvalley.erp.common.constants;

@SuppressWarnings("nls")
public class Constants {
	
	//ERROR SKU ID
	public final static int ERROR_SKUID=1;//SKU ID
	
	public final static String ERRORSKU="ERROR";
	public final static byte AMAZONPLATFORM=2;
	public final static byte EBAYPLATFORM=1;
	public final static String PRODUCT="product";
	
	public final static byte NO = 0;
	public final static byte YES = 1;


	public class IsDrop {
		public final static byte ERP = 0;
		public final static byte DROPSHIP = 1;
	}

	public class ProductLineMappingType {
		public static final int skutype = 1;  //SKU
		public static final int category  = 2;  //大小类关系
		public static final int editps = 3;  //编辑权限
		public static final int viewps = 4;  //数据权限
	}

	public class ProductLineUseType {
		public static final int proType = 1;  //产品类型
		public static final int useType  = 1;  //使用类别
	}

	public class ProductLineType{
		public static final int Normal = 1;
		public static final int BigCateory = 2;
		public static final int SmallCateory = 3;
	}

	public class ProductLineLog{
		public static final int add=15;
		public static final int update=16;
		public static final int delete=17;
	}


	public class RowStateType {
		public static final int NOACTION = 0;
		public static final int INSERT = 1;
		public static final int UPDATE = 2;
		public static final int DELETE = 4;
	}


	// 产品状态
	public class SkuState {
		public final static byte COMING = 1;
		public final static byte NEWARRIVAL = 2;
		public final static byte REGULAR = 3;
		public final static byte REGULAR_INT = 4;
		public final static byte ONPROMOTION = 5;
		public final static byte CLEARANCE = 6;
		public final static byte WILLDEACTIVATE = 7;
		public final static byte INACTIVE = 8;
		public final static byte SEMIS = 9;
	}
	public class LineState {
		public final static String COMING = "Coming";
		public final static String NEWARRIVAL = "New Arrival";
		public final static String REGULAR = "Regular";
		public final static String REGULAR_INT = "Regular_INT";
		public final static String ONPROMOTION = "On Promotion";
		public final static String CLEARANCE = "Clearance";
		public final static String WILLDEACTIVATE = "Will Deactivate";
		public final static String INACTIVE = "Inactive";
		public final static String SEMIS = "Semis";
	}

	//产品日志类型
	public class ProductLogType{
		public static final byte SIZE=1;
		public static final byte STATUS=2;
		public static final byte IS_DROP_STATUS=3;
	}
	
	public class WarehouseID{
		public final static int US_CA=1;
		public final static int CN_Global_Baoan=2;
		public final static int DE_Hamburg=4;
		public final static int CN_HK=5;
		public final static int US_FBA_STK=6;
		public final static int DE_FBA_ZBT=7;
		public final static int UK_FBA_STK=8;
		public final static int CN_DFC=9;
		public final static int CN_BUC=10;
		public final static int FR_FBA_DH=11;
		public final static int CN_HQB=12;
		public final static int US_CA_Used=13;
		public final static int WH_3RD=30;
		public final static int US_SBN_STK=14;
		public final static int UK_FBA_DH=15;
		public final static int US_FBA_D2G=16;
		public final static int FR_FBA_STK=17;
		public final static int CA_FBA_STK=18;
		public final static int US_FBA_DH=19;
		public final static int JP_FBA_STK=23;
		public final static int DE_Hamburg_Used=22;
		public final static int IT_FBA_STK=24;
		public final static int ES_FBA_STK=25;
		public final static int CN_FBA_LYT=26;
		public final static int JP_FBA_NBD=27;
	}
	
	public class RMAStatusType {
		public static final byte FINISH=7;//完成操作
	}
	
	public class OrderStatusType{
		public static final byte FINISHED=4;
		public static final byte PENDING=0;
	}

	public class Language {
		public static final byte ENGLISH = 1; // 英语
		public static final byte CHINESE = 2; // 汉语
		public static final byte GERMAN = 3;  // 德语
		public static final String ENUS="en_US"; //dropship多国语言
		public static final String ZHCN="zh_CN";
	}
	
	public static final String WINDOWS_OS_PATH="F:\\tentacle_file\\";
	
	public static final String LINUX_OS_PATH="/usr/local/tentacle_file/";
	
	public class FileType{
		public static final String XML="xml";
		public static final String PDF="pdf";
		public static final String HTML="html";
		public static final String TXT="txt";
	}
	
	public class ClockType{
		public static final int AMAZONINBOUND=1;
		public static final int RKTORDER=1;
		public static final int AMAZONBUSINESSREPORT=2;
		
		public static final int Detail_Page_Sales_And_Traffic_Report = 3;
		
		public static final int Detail_Page_Sales_and_Traffic_by_Parent = 4;
		
		public static final int Detail_Page_Sales_And_Traffic_by_Child = 5;
		
		public static final int AMAZONSHIPMENTPROMOTION=6;
		//销售账单报表
		public static final int TYPE_AMAZON_PAYMENT_REPORT_DATERANGE=7;
	}
	
	public class Country{
		public static final String DE="DE";
		public static final String US="US";
		public static final String JP="JP";
		public static final String FR="FR";
		public static final String IT="IT";
		public static final String ES="ES";
		public static final String UK="UK";
		public static final String CA="CA";
		
	}
	
	public class CommonStatus{
		public static final byte TEMP=2;
		public static final byte BOOK=3;
		public static final byte DONE=4;
	}
	
	public static final String GMAIL="gmail.com";
	
	public class FILEPATH{
		public static final String PATH_OS_WINDOWS_MAIL="D:\\mail_attachment\\";
		public static final String PATH_OS_LINUX_MAIL="/usr/local/mail_attachment/";
	}
	
	public final static class Account{
		public final static String USSTK="USBig";
		public final static String FRDH="FRDHsunbt";
		public final static String FRSTK="FRDHStek";
		public final static String USD2G="USd2g";
		public final static String UKDHPlaza="UKDHPlaza";
		public final static String UKDHGtls="UKDHGtls";
		public final static String DEZBT="DEZBTGmbH";
		public final static String USDH="USDealheroe";
		public final static String CASTK="CAstk";
		public final static String JPSTK="JPstk";
		public final static String JPNBD="JPnbd";
		public final static String ITSTK="ITStek";
		public final static String ESSTK="ESStek";
		public final static String CNLYT="cnlyt";
		public final static String USSTK2="USSmall";
		public final static String CASTK2="CASmall";
		public final static String OTHER="Other";
	}

	public static class skuCodeType{
		public static final int modeCode = 0;
		public static final int preskuCode = 1;
		public static final int skuCode = 2 ;
	}

	public static class IsPackageSku{
		public static final int  noPackage= 1;
		public static final int  isPackage= 2;  //包材SKU
	}

	public class CompanyType {
		public static final byte PLATFORM = 0; // 运营商
		public static final byte SELLER = 1; // 销售商(sellor)
		public static final byte VENDOR = 2; // 供货商(vendor)
		public static final int SUNVALLEY = 999;
		//added by Jack.Zhou on 2011-12-23
		public static final int VENDOR_ID =3000;
		public static final int BUD = 503;    //BUD标识
		public static final int BUE = 504;    //BUE标识
		public static final int FREE = 0;    //BUE标识
		public static final int DROPSHIP_STOCK = 225;    //DropshipStock-Buffer标识
	}
	
}
