package com.sunvalley.erp.common.constants;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

@SuppressWarnings("nls")
public class Constants {
	
	public static final String USER_TOKEN = "SUNVALLEY258hOOTOO"; // 外部接口 token
	public static final int ReturnSKUID = 1000000;
	public static final int BSITEMSKUID = 2; 
	public static final BigDecimal LOCKDATE = new BigDecimal(1.03);   //预备SKU锁定数据时所乘系数
	public final static String CONTENT_TYPE = "application/msexcel;charset=UTF-8";
	public final static String CONTENT_DISPOSITION = "Content-Disposition";
	public final static String FILENAME = "attachment;filename=";
	public final static String FILETYPE = ".xls";
	public static final BigDecimal JP_VALUE = new BigDecimal(0.074); //同步listing价格JP-NBD渠道计算Profit时所乘系数
	public static final BigDecimal DE_VALUE = new BigDecimal(0.19);//同步listing价格DE-STK渠道计算Profit时所乘系数
	public static final BigDecimal COEFFICIENT = new BigDecimal(0.08);//同步listing价格其他渠道计算Profit时所乘系数
	public static final Integer adminUserId= 500;
	/**
	 * 工作流参数状态
	 * @author andy.li
	 *
	 */
	public class Activiti{
		//条件变量
		public final static String CONDITION = "condition";
		//任务类型
		public final static String TASKTYPE = "taskType";
		//打回
		public final static int BACK = 0;
		//通过
		public final static int PASS = 1;
		//申请人id
		public final static String APPLYUSERID = "applyUserId";
		//申请人名称
		public final static String APPLYUSERNAME = "applyUserName";
		//会签用户集合
		public final static String COUNTERSIGNUSERS = "countersignUsers";
		//是否启动会签流程
		public final static String COUNTERSIGNCONDITION = "countersign";
		//会签通过人数
		public final static String AGREECOUNTERNAME = "agreeCounter";
		//过滤岗位级别
		public final static String FILTERPOSTLEVEL = "filterPostLevel";
		//过滤岗位名称
		public final static String FILTERPOSTNAME = "filterPostName";
		//YES or NO
		public final static int NO = 0;
		public final static int YES = 1;
		//任务名称-通常是指流程标题
		public final static String PROCESSINSTANCENAME = "processInstanceName";
		public final static String CREATEDATE = "createDate";
		
		public final static String CREATUSERID = "createUserId";
		public final static String PRIMARYKEY  = "primaryKey";
		
		//业务状态
		public final static int APPROVE = 1; //审批中
		public final static int REJECT = 2; //审批打回
		public final static int END = 3;	//审批结束
		public final static int CANCEL = 4;	//取消流程
	}
	
	/**
	 * Activiti流程key值常量
	 * @author andy.li
	 */
	public class ActivitiProcessKeys{
		//amazon Listing价格同步
		public final static String AMAZON_PRICE_SYNC = "AmazonPriceSync";
		public final static String OFFLINE_SALES = "offlineSales";
	}
	
	public static class Platform{
		public static final byte ERP=0;
		public static final byte EBAY=1;
		public static final byte AMAZON=2;
		public static final byte NEWEGG=3;
		public static final byte Rakuten=4;
		public static final byte JINGDONG=5;//京东
	}
	public static class skuCodeType{
		public static final int modeCode = 0;
		public static final int preskuCode = 1;
		public static final int skuCode = 2 ;
	}
	public static  class gyAllocateStatus{
		public static final byte  submit = 1;
		public static final byte  printed = 10;
		public static final byte  finished = 15;
		public static final byte  cancel = 20;
	}
	public static class TransferStatus{
		public static final int NEW = 1;
		public static final int WAITINANDOUT = 2;
		public static final int INANDOUT = 3;
		public static final int REJECT = 0;
	}
	
	public static class PreSkuSaveType{
		public static final int  pageSave= 1;
		public static final int  importSave= 2;
	}
	
	public static class IsPackageSku{
		public static final int  noPackage= 1;
		public static final int  isPackage= 2;  //包材SKU
	}
	
	public static class RightsType{
		public static final byte RIGHTS_TYPE_USER = 1;
		public static final byte RIGHTS_TYPE_ROLE = 2;
	}
	public class PlanLogType{
		public static final int version = 1;//版本号
		public static final int sales = 2;//销售计划
	}
	
	public class PlanSalesVersionType{
		public static final int EarlyMonth = 1;//月初
		public static final int middleMonth= 2;//月中
	}
	
	public class SkuSalesZone {
		public static final int internal = 1;//内销
		public static final int seaOut= 2;//外销
	}
	/** *****Common part********** */
	public class ParameterName {
		public static final String PAGENO = "pageNo";
		public static final String PAGESIZE = "pageSize";
		public static final String OFFSET = "offset";
		public static final String LIMIT = "limit";
		public static final String FILTERSQL= "filtersql";
		public static final String ODERBYSQL="orderbysql";
		public static final String JSONDATA = "jsonData";
		public static final String BEANID = "beanId";
		public static final String SERVICEID = "serviceId";
		public static final String FILTERDATA = "filterData";
		public static final String TRUE = "1";
		public static final String FALSE = "0";
		public static final String QUERYVALUE = "q";
		public static final String BASEID = "baseId";
		public static final String ISVS = "isvs";
		public static final String FILTERDATA2="filterdata";
		public static final String EMPTY = "";
		public static final String COUNTRY= "country";
		public static final String BASETWOID="baseTwoId";
		public static final double OUNCETOG=28.3495231;//盎司转化为克
		public static final int POUNDTOG=454;//磅转化为克
		public static final double INCTOMM=25.4;//英寸转化为毫米
		public static final int KGTOG=1000;//千克转化为克
		public static final int CRITICAL_VALUE = -999;
	}
	public class optionType{
		public static final int warehouseallocate = 1;
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
	
	public class Language {
		public static final byte ENGLISH = 1; // 英语
		public static final byte CHINESE = 2; // 汉语
		public static final byte GERMAN = 3;  // 德语
		public static final String ENUS="en_US"; //dropship多国语言
		public static final String ZHCN="zh_CN";
	}
	
	public static class DataFlag{
		public static final String SUCCESS = "SUCCESS";
		public static final String MESSAGE = "MESSAGE";
		
		public static final String PAGE = "page";
		public static final String TOTAL = "total";
		public static final String ROWS = "rows";
		public static final String RULES = "rules";
	}

	public class FreeType {
		public static final byte PUBLIC = 1;
		public static final byte PRIVATE = 0;
	}

	public class Invio {
		public static final byte INVUN = 0; // 不影响库存
		public static final byte INVOUT = -1; // 出库
		public static final byte INVIN = 1; // 入库
	}
	
	public class LabelFileType{
		public static final int USPS = 1;//usps
		public static final int WHOLE_SALE = 2;//wholesale
		public static final int USPSMI = 3;//uspsmi
		public static final int MILITARY = 4;//military
		public static final int EXPRESS = 5;//express
		public static final int UPS = 6;//ups
		public static final int USPSINTL = 7;//uspsintl
		public static final int UPS_Basic = 8;//upsbasic
		public static final int UPS_UPFEDEX = 9;//fedex
		public static final int EMS = 10;//ems
		public static final int HKP_REGISTERED = 12;//hkpr
		public static final int SGP_REGISTERED = 13;//sgpr
		public static final int HKP_FLAT_RATE = 14;//hkpfr
		public static final int SGP_FLAT_RATE = 15;//sgpfr
		public static final int DHL = 16;//
		public static final int DEPOST = 17;//depost
		public static final int SHUNFENG = 18;//shunfeng
	}

	public class MailClassFileMode {
		public static final String USPS = "usps";
		public static final String EXPRESS = "express";
		public static final String USPSMI = "uspsmi";
		public static final String USPSMIDV = "uspsmidv";
		public static final String USPSINTL = "uspsintl";
		public static final String UPS = "ups";
		public static final String UPS_Basic = "upsbasic";
		public static final String DHL = "dhl";
		public static final String DEPOST = "depost";
		public static final String SGP_FLAT_RATE = "sgpfr";
		public static final String SGP_REGISTERED = "sgpr";
		public static final String HKP_FLAT_RATE = "hkpfr";
		public static final String HKP_REGISTERED = "hkpr";
		public static final String USPSDV = "uspsdv";
		//专门为宝安仓库中导出UPS Invoice用，不保存在数据库中
		public static final String UPS_INVOICE = "upsinvoice";
		public static final String UPS_MINORTY_INVOICE = "upsminortyinvoice";
		public static final String UPS_MINORTY_SHIPMENT = "upsminortyshipment";
//		UPS Express Saver
		public static final String UPS_EXPRESS_SAVER = "upses";
//		UPS Expedited Rates
		public static final String UPS_EXPRESS_RATES = "upser";
		
		public static final String UPS_UPFEDEX = "fedex";
		public static final String EMS = "ems";
		public static final String EMSNL01 = "nl01";
		public static final String EMSSE01 = "se01";
		public static final String EMSSE02 = "se02";
		public static final String WHOLE_SALE = "wholesale";
		public static final String MILITARY = "military";
		public static final String EBAY = "ebay";
		public static final String OTHER = "other";
		public static final String DOWNLOADONLY = "downloadonly";
		
		public static final String SHUNFENG = "shunfeng";
		public static final String YUNDA="yunda";
		public static final String YIXUN="yixun";
		public static final String CNPOST="cnpost";
		public static final String HKDHL="hkdhl";
		
	}
	public class CustomerServiceLogOrderType{
		public static final int amazonOrderTask = 1;
		public static final int returnLable = 2;
	}
	public class LogOpType{
		public static final int op_create=0;
		public static final int op_save = 1;
		public static final int op_delete = 2;
		public static final int op_finish = 3;
		public static final int op_submit = 4;
		public static final int op_upload = 5;
		public static final int op_fightBack = 6;
	}
	//订单流程的状态
	public class OrderStatusType {
		public static final byte PENDING = 0;
		public static final byte PREPARED = 1;
		public static final byte HOLD = 2;
		public static final byte PRINTED = 3;
		public static final byte FINISHED = 4;
		public static final byte CANCELLED = 5;
		public static final byte OUTOFSTOCK = 6;
		public static final byte PAID = 7;//用来标记订单是否支付 added by Cheng Liangwei on 2010-03-26 
		public static final byte NORMAL = 8;//正常
		public static final byte BLACKLIST = 9;//黑名单
		public static final byte REQUIRED_FP = 10;//欺诈
		public static final byte SUSPICIOUS = 11;//嫌疑
		public static final byte CREDIT=12;
		
		public static final byte P_PENDING=20; // 购买订单的pending状态
		public static final byte P_FINISHED=21; // 购买订单的finish状态
		public static final byte P_TEMP=25;
	}
	
	public class OrderEmailStatus{
		public static final byte NEW = 0;
		public static final byte SENDERROR = 1;
		public static final byte TEMPLATERROR = 2;
		public static final byte FINISH = 10;
	}
	
	public class OrderEmailError{
		public static final byte ERROR_CHANNEL_DIFFERENT=3;//Order channel is different from template specified channel!
		public static final byte ERROR_STATUS_NOTFINISH=4;//Order status is not finished!
		public static final byte ERROR_RMA_ORDER=5;//Order from RMA!
		public static final byte ERROR_ORDER_RMA=11;//This order has generated RMA!
		public static final byte ERROR_HAVE_REVIEW=6;//Have review for this order's sku!
		public static final byte ERROR_NOT_ONLY_SKU=7;//Order sku is not the only one!
		public static final byte ERROR_EXIST_ORDER=8;//Order ID already exists!
		public static final byte ERROR_HAVE_REVIEW_STAR=9;//Have Sunvalley review <=XX Star
		public static final byte ERROR_HAVE_REVIEW_RVGSTAR=10;//Amazon review average <=XX Star
		public static final byte WARNING_SENT_OTHERTEMPLATE=2;
		public static final byte ERROR_BLACK_BUYER=13;//Blacklist user
		public static final byte WARNING_NOT_ONLY_SKU=14;
		public static final byte ERROR_ORDER_SKU_PRICEI_ZERO = 15;//Order price is 0. add by zhong_yong 2015/07/03
		public static final byte ERROR_ORDER_send_2 = 20;
		public static final byte ERROR_ORDER_send_3 = 21;
	}
	
	public class ExpeditedType{
		public static final byte NORMAL=0;
		public static final byte EXPEDITEDSHIPPING=1;
		public static final byte CUSTOMERREQUIREMENT=2;
	}
	
	//订单流程的状态,显示名
	public static class GetOrderStatusStr{
		public static Map<Byte,String> getOrderStatusStr(){
			Map<Byte,String> statusmap = new HashMap<Byte,String>();
			statusmap.put(OrderStatusType.PENDING, "Pending");
			statusmap.put(OrderStatusType.PREPARED, "Prepared");
			statusmap.put(OrderStatusType.HOLD, "Hold");
			statusmap.put(OrderStatusType.PRINTED, "Printed");
			statusmap.put(OrderStatusType.FINISHED, "Finished");
			statusmap.put(OrderStatusType.CANCELLED, "Cancelled");
			statusmap.put(OrderStatusType.OUTOFSTOCK, "Out Of Stock");
			return statusmap;
		}
		
		public static String getStatusStr(byte status){
			Map<Byte,String> statusmap = getOrderStatusStr();
			if(statusmap.containsKey(status)){
				return statusmap.get(status);
			}
			return "";
		}
		
	}
	
	//订单的操作状态
	public class OrderStatusOP{
		public static final byte PENDING=4;
		public static final byte CREATE=1;
		public static final byte DELETE=2;
		public static final byte UPDATE=3;
		public static final byte PREPARE=5;
		public static final byte PRINT=6;
		public static final byte FINISH=7;
		public static final byte CANCEL=8;
		public static final byte HOLD=9;
		public static final byte OUTOFSTOCK=10;
		public static final byte UNSHIP=11;
		public static final byte SETTLEAGAIN=12;
		public static final byte SETMAILCLASS=13;
		public static final byte DELSNBYHAND=14;//手动删除SN码
		public static final byte REFUND=15;//退款
	}
	
	//客户的状态
	public class CustomerStatus{
		public static final byte NORMAL=0;//正常
		public static final byte BLACKLIST=1;//黑名单
		public static final byte REQUIRED_FP=2;//欺诈
		public static final byte SUSPICIOUS=3;//嫌疑
		public static final byte CREDIT=4;//信用额度不够//Wholesale
		public static final byte WHOLESALE=5;//批发
		public static final byte MCF=6;//自发改代发类型
		public static final byte SAMPLE=7;//
		public static final byte OFFLINE_ORDER=8;//线下销售
	}
	
	//订单 是否支付
	public class OrderPaymentStatus {
		public static final byte UNPAID = 0;
		public static final byte PAID = 1;
		/*20100723brian 去掉这个付款状态，判断时候看UNPAID就可以了。*/
//		public static final byte CHECK_RECEIVED = 2;
		
	}

	public class PoOrderStatus {
		public static final byte UNPAID = 0;
		public static final byte PAIDED = 1;
		public static final byte HOLD = 2;
		public static final byte INSTOCK = 3;
		public static final byte SETTLE = 4;
	}

	public class RMAStatusType {
		public static final byte ALLBUTRECEIVED=11;//不退回货物
		public static final byte REPLACED=12;//换货
		public static final byte REFOUND=13;//退款
		public static final byte DISCOUNT=14;//打折扣
		public static final byte CLOSED=16;//关闭
		public static final byte DPFINISHED=50;//Dropship的退货单的完成状态
		public static final byte DEALWITHED = 4;//dropship已处理状态
		public static final byte RETURNTOSVT = 8;//已发货至平台
		
		//----------------------RMA PART--------------------------------
		//edited by JerryWei on 2011.01.17
		public static final byte REQUESTED=0;//申请
		public static final byte RECEIVED=5;//接收Receive from Consumer
		public static final byte CREATED=10; //创建
		public static final byte PROCESSING=15;//处理中
		public static final byte WHRECEIVED=20;//接收
		public static final byte FINISHED=30;//完成
		public static final byte CANCELLED=40;//取消
		
		//记录RMA log状态
		public static final byte NOACTION=0;//无任何操作
		public static final byte CREATE=1; //创建操作
		public static final byte SUBMIT=2; //DS提交ERP操作
		public static final byte APPROVE=3;//处理中操作
		public static final byte RECEIVE_FROM_CUSTOMER=4;//Ads接收操作	
		public static final byte WHRECEIVE=5;//仓库接收操作
		public static final byte CANCEL=6;//取消操作
		public static final byte FINISH=7;//完成操作
		public static final byte UPDATE=8;//更新操作
		public static final byte DELETE=9;//删除操作
		public static final byte REFUND=10;//退款操作
		public static final byte REPLACE=11;//换货操作
		public static final byte NEWORDER=12;//创建新订单操作
		public static final byte SETWHRECEIVE=13;//设置接收信息
		public static final byte STATUSRESET=14;//重置状态
		public static final byte PENDINGREFUND=15;//pendingRefund
	}
	
	public class ReturnStatus {
		public static final byte CREATED = 10;   //创建
		public static final byte PROCESSING = 20;//处理中
		public static final byte FINISHED = 30;  //处理完成
		public static final byte CANCELLED = 40; //取消
	}
	public class RefundStatus {
		public static final byte NoRefund = 0;   
		public static final byte PendingRefund =2;  
		public static final byte Refunded = 1;  
	}
	public class ReturnType{
		public static final byte NORMA = 1;
		public static final byte YESRMA = 2;
		public static final byte FBAUNSELLABLE = 3;
		public static final byte FBASELLABLE = 4;
	}
	
	public class ReturnProcessType{
		public static final byte BackToSelf = 1;
		public static final byte Used = 2;
		public static final byte ThrowAway = 3;
		public static final byte ToVendor = 4;
		public static final byte REPLACEMENT = 5;
		public static final byte USED_P = 6;
	}
	
	public class ReturnProcessStatus{
		public static final byte ProcessFinish = 1;
		public static final byte Processed=10;
		public static final byte QC_Checked=0;
		public static final byte Restock_Counting=5;
	}

	/**
	 * @author Cheng Liangwei 
	 * @date 2010-04-16
	 * @version 1.0
	 * @see 发货单的状态流程
	 * */
	public class ShipmentStatus {
		public static final byte NEW = 0;// 新建的发货计划单状态，在这个状态下可以进行删除
		public static final byte ONROAD = 10;//在途
		public static final byte COSTAUDIT = 15;//核算成本
		public static final byte PARTRECEIVED = 16;//部分接收
		public static final byte RECEIVED= 20;//接收
		public static final byte ALLOCATED=30;//分配
		
		public static final byte ALLOCATELOG=5;//分配操作
		public static final byte PREALLOCATELOG=4;//预分配操作
		public static final byte RECEIVEDLOG=3;//接收
		public static final byte CREATELOG=1;//创建
		public static final byte SHIPLOG=2;//发货
		public static final byte AUDITLOG=6;//成本确认
		public static final byte UPDATELOG=7;//更新
		public static final byte IGNORERECEIVEDLOG=8;//接收
		public static final byte UPAPPROVE=9;//回滚Approve
	}
	
	/**
	 * @see Shipment的类型
	 * */
	public class ShipmentType{
		public static final byte NORMAL_SHIPMENT=0;//正常手工创建的类型
		public static final byte BLUE_SHIPMENT=1;//系统自动创建的蓝字Shipment
		public static final byte RED_SHIPMENT=2;//系统自动创建设的红字Shipment
		public static final byte AUTO_SHIPMENT=3;//系统自动创建的电子商务类型
		public static final byte AUTO_ALLOCATE_SHIPMENT=4;//库存调拨系统自动创建的电子商务类型
	}
	
	/**
	 * @see Shipment的来源数据类型
	 * */
	public class ShipmentOriginType{
		public static final byte ORIGIN_ALLOCATE=1;//调拨
		public static final byte ORIGIN_CHECK=2;//盘点
	}
	
	/**
	 * @author Cheng Liangwei 
	 * @date 2010-04-14
	 * @version 1.0
	 * @see 库存申请的状态流程
	 * */
	public class RequestStatus{
		public static final byte COLLECTION = 0;//归集
		public static final byte FREEZE = 10;//冻结
		public static final byte PURCHASE = 20;//待提交采购
		public static final byte SUBMIT_PURCHASE = 21;//提交采购
		public static final byte PURCHASING = 22;//采购中
		public static final byte END_PURCHASES = 23;//采购完成
		public static final byte FINISH = 30;//完成
	}
	/**
	 * @author ervin
	 * @date 2013-02-26
	 * @version 4.8
	 * @see 库存申请的审核状态流程(备货日志记录状态optype)
	 * */
	public class RequestLogStatus{
		public static final byte SAVE = 0;//新增
		public static final byte PASS = 1;//审核通过
		public static final byte NOPASS = 2;//审核不通过
		public static final byte TOCOLLECTION = 3;//打回到新建状态
		public static final byte TOPURCHASE = 10;//提交到审核	
		public static final byte FINISH = 4;//完成
		
		public static final byte PRINT = 11;//记录备货明细报表打印Log日志类型
	}

	public class RowStateType {
		public static final int NOACTION = 0;
		public static final int INSERT = 1;
		public static final int UPDATE = 2;
		public static final int DELETE = 4;
	}

	public class ShipMethodType {
		public static final byte SEA = 1;
		public static final byte AIR = 2;
		public static final byte LAND = 3;
		public static final byte NOAIRSEA = 0;
	}

	public class StockStateType {
		public static final byte PREPARE = 0;
		public static final byte SURE = 10;
		public static final byte PURCHASE = 20;
		public static final byte ENTERWAREHOUSE = 30;
		public static final byte TESTQUALITY = 35;
		public static final byte SHIPMENT = 40;
		public static final byte ARRIVE = 50;
	}

	public class FeeType {
		public static final byte MATERIAL_FEE = 1;       // 材料费
		public static final byte SHIPPING_FEE = 2;       // 运费
		public static final byte HANDLE_FEE = 3;         // 处理费（人工费、包装费。。。）
		public static final byte PER_ITEM_CHARGE = 4;    // 每个sku费
		public static final byte PER_ORDER_CHARGE = 5;   // 每个订单费
		public static final byte DROPSHIP_FEE = 6;       // PER_ITEM_CHARGE与PER_ORDER_CHARGE之和

		public static final byte RECHARGE = 10;          // 充值 
		public static final byte PAYMENT_DISCOUNT = 11;  // 充值折扣
		public static final byte VOLUME_DISCOUNT = 12;   // 批量折扣
		public static final byte OTHER_DISCOUNT = 13;
		
		public static final byte OVER_DUE_BALANCE = 14; // 上一账期转到本账期
		
		public static final byte VAT_FEE = 15; // 联邦税
		public static final byte Others=16;//其它费用
		
		public static final byte customsfeesdrop=17;//CI报关费
		public static final byte taxesdrop=18;//CI税金
		public static final byte totalfreightdrop=19;//CI总运费
		
	}

	public class TransType {
		public static final byte ORDER = 1; // 1 ORDER
		public static final byte RMA = 2; // 2 RMA Order
		public static final byte RECHARGE = 3;// 3 充值
		public static final byte PURCHASE = 4;// 4购买
		public static final byte Shipment = 5;// CI结算类型
		public static final byte OTHER = 7;// 7 其他
	}

	public class RechargeType {
		public static final byte CHECK = 1;
		public static final byte MONEY_ORDER = 2;
		public static final byte BANK_TRANSFER = 3;
		public static final byte CREDIT_CARD = 4;
		public static final byte PAYPAL = 5;
		public static final byte OTHER_DISCOUNT = 6;
	}
	
	public class SettleStatus {
		public static final byte UNCONFIRM = 0;
		public static final byte CONFIRM = 1;
		public static final byte TEMPORARY=2;
	}

	// 货运承担方
	public class ShipOption {
		public static final byte SUNVALLEY = 1;
		public static final byte SELLER = 2;
		public static final byte CUSTORMER = 3;
		public static final byte THIRDPART = 4;
		public static final String SUNVALLEY_NAME="Sunvalley";
		public static final String CUSTOMER_NAME="Customer";
		public static final String THIRDPART_NAME="Third Party";
	}
	
	public class Websiteid {
		public static final short SUNVALLEY = 1;
		public static final short EBAY = 2;
		public static final short AMAZON = 3;
		public static final short BUYCOM = 4;
	}
	
	public class ShipOptionName {
		public static final String SUNVALLEY = "Shipper";
		public static final String SELLER = "Seller";
		public static final String CUSTORMER = "Customer";
		public static final String THIRDPART = "Third Party";
	}
	
public class PoOrderConstants {
		
		////session失效，需要重新登录
		public final static int PURCHASE_RESULT_2 = 2;
		//
		public final static int PURCHASE_RESULT_3 = 3;
		//
		public final static int PURCHASE_RESULT_4 = 4;
		//
		public final static int PURCHASE_RESULT_5 = 5;
		//
		public final static int PURCHASE_RESULT_6 = 6;
		//
		public final static int PURCHASE_RESULT_7 = 7;
		
	}
	
	public class ReturnConstants {
		
		////session失效，需要重新登录
		public final static int RETURN_RESULT_2 = 2;
		//返还数量大于现有实存数量
		public final static int RETURN_RESULT_3 = 3;

	}
	
	public class TransConstants {
		
		////session失效，需要重新登录
		public final static int TRANSOUT_RESULT_2 = 2;
		//转让数量大于现有数量
		public final static int TRANSOUT_RESULT_3 = 3;
		//没有一个转让数量
		public final static int TRANSOUT_RESULT_4 = 4;
		//列表中没有填转让数量
		public final static int TRANSOUT_RESULT_5 = 5;
		//转让数量小于已转让数量（用于修改时候）
		public final static int TRANSOUT_RESULT_6 = 6;
		//扣库存失败
		public final static int TRANSOUT_RESULT_7 = 7;
		
		////session失效，需要重新登录
		public final static int TRANSOUTREC_RESULT_2 = 2;
		//转入数量大于现有数量
		public final static int TRANSOUTREC_RESULT_3 = 3;
		//转入数量大于可转入数量
		public final static int TRANSOUTREC_RESULT_4 = 4;
		//自己没有数据可转让
		public final static int TRANSOUTREC_RESULT_5 = 5;
		
	}
	
	public class Countryid {
		//美国
		public final static String USA = "US";
		//德国
		public final static String GERMANY = "DE";
		//香港
		public final static String HONGKONG = "HK";
		//宝安
		public final static String CHINA = "CN";
		//加拿大
		public final static String CANADA = "CA";
		//奥地利
		public final static String AUSTRIA= "AT";
		public final static String UK="GP";
		public final static String FR="FR";
		public final static String IT="IT";
		public final static String ES="ES";
		public final static String JP="JP";
	}

	//打印宝安仓库中挂号订单时候的ShippingMethod字段
	public class ShippingMethod {
		//新加坡
		public final static String SGP = "SGR";
		public final static String SGF = "SGF";
		//香港
		public final static String HKP = "HKR";
		public final static String HKF = "HKF";
	}
	
	//post register sn 的类型
	public class RegType {
		//新加坡
		public final static byte SGP = 2;
		//香港
		public final static byte HKP = 1;
	}
	//post register sn 的状态
	public class PostRegStatus {
		//未使用
		public final static byte NOTUSED = 0;
		//香港
		public final static byte USED = 1;
	}
	
	public class Curno {
		//美元
		public final static String USD = "USD";
		//欧元
		public final static String EUR = "EUR";
		//人民币
		public final static String CNY = "CNY";
		//港币
		public final static String HKD = "HKD";
		//澳币
		public final static String AUD = "AUD";
		//英磅
		public final static String GBP = "GBP";
		
	}
	public static class Currency{
		public static Map<String ,String> getMap(){
			Map<String ,String > map=new HashMap<String ,String>();
			map=new HashMap<String ,String >();
			map.put("AUD", "AUD");
			map.put("CAD", "CAD");
			map.put("CNY", "CNY");
			map.put("EUR", "EUR");
			map.put("GBP", "GBP");
			map.put("HKD", "HKD");
			map.put("USD", "USD");
			return map;
		}
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
	//产品日志类型
	public class ProductLogType{
		public static final byte SIZE=1;
		public static final byte STATUS=2;
		public static final byte IS_DROP_STATUS=3;
	}
	
	//add by wangweidong line_state
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
	
	// 库存情况
	public class InventoryState {
		public static final double OOS = 0.3;  // 缺货比例
		public static final double ENOUGH = 2; // 充足比例
	}
	
	// 库存状态
	public class InventoryStatus {
		public final static byte ACTUAL = 1;
		public final static byte ONROAD = 0;
		public final static byte TEMPLE=2;
	}
	
	public class InventoryHoldType{
		public final static byte ORDER=1;
		public final static byte ALLOCATE=2;
		public final static byte FBARETURN = 3;
		public final static byte GYALLOCATE = 4;
	}
	//产品装箱单状态
	public interface PackageItemStatus
	{
		public static int UnSubmit = 0;//未提交
		public static int Submit = 10;//已提交
		public static int Audited = 20;//已审核
		public static int AuditNotPass =30;//审核不通过
		public static int Shipping = 40;//发货中
		public static int Shipped = 50;//已发货
		public static int New=1;
	}
	//预付款单状态
	public interface PrepaymentStatus
	{
		public static int New = 0;//新建
		public static int Cancel = 5;//取消
		public static int Paid = 10;//已付款
		public static int PartiallyUse = 20;//部分勾稽
		public static int AllUsed =30;//已勾稽
	}
	
	//付款单状态
	public interface PaymentStatus
	{
		public static int New = 0;		//新建
		public static int Part = 10;	//部分付款
		public static int Paid = 20;	//已付款
		
	}
	
	//付款，预付款日志类型
	public interface PaymentLogType
	{
		public static int Payment = 1;		//付款
		public static int PrePayment = 2;	//预付款	
	}
	
	//付款，预付款日志操作类型
	public interface PaymentLogOP
	{
		public static int New = 0;		    //新建
		public static int AuditPayment= 10; //审核
		public static int AntiAudit = 20;   //反审核
		public static int Payment = 30;	    //付款
		public static int PrePayment = 35;	//支付预付款
		public static int Articulation = 40;//勾稽
		public static int Del = 50;         //删除
		public static int Cancel = 55;      //取消
		public static int Editor = 60;      //修改
	}
	
	//采购订单是否已经生成过预付款单
	public interface PrOrderIsPrepay
	{
		public static byte No = 0; //
		public static byte Yes = 1; //
	}
	// 库存日志类型
	public class InvChangeType {
		public final static byte OTHERS = 0;
		public final static byte SHIPPING = 1;
		public final static byte SHIPMENT = 2;
		public final static byte CHECKSTOCK = 3;
		public final static byte RMA = 4;
		public final static byte DROPSHIP = 5;
		public final static byte BUFFERSHIPIN = 6;
		public final static byte BUFFERSHIPOUT = 7;
		public final static byte TRASHIPPING = 8;
		public final static byte NORMARESTOCK = 9;
		public final static byte ALLOCATESTOCK = 10;
		public final static byte FBASELLABLE = 11 ;//add by zhong_yong 增加FBA退货单据类型：可卖  2014/12/16
		public final static byte FBAUNSELLABLE = 12 ;//add by zhong_yong 增加FBA退货单据类型：不可卖  2014/12/16
		public final static byte FBARETURN =13;
		public final static byte gyAllcoate = 14;//管易调拨
	}
	
	// 调拨明细状态
	public class AllocateStatus {
		public final static byte ALLOCATED = 1;
		public final static byte REQUESTED = 2;
		public final static byte RECEIVED = 3;
		public final static byte REJECTED = 4;
		public final static byte CANCELLED = 5;
	}
	
	// 调拨明细类型
	public class AllocateType {
		public final static byte CHANNEL = 1;
		public final static byte PREPARE = 2;
		public final static byte CRON = 3;
	}
	
	// added by lufangzong on 2010-04-07 是否erp or dropship
	public class IsDrop {
		public final static byte ERP = 0;
		public final static byte DROPSHIP = 1;
	}
    
	public class SystemFlag {
		public final static byte ERP = 0;
		public final static byte DROPSHIP = 1;
		public final static byte VENDOR = 2;
	}
	
	//订单支付方法
	public class OrderPaymentMethod{
		/*
		1 Cash
		2 Check
		3 Credit card
		4 Money order
		5 Paypal
		6 Paypal echeck
		7 Wire
		8 Amazon
		13 Net*/
		public final static byte CASH = 1;
		public final static byte CHECK = 2;
		public final static byte CREDIT_CARD = 3;
		public final static byte MONEY_ORDER = 4;
		public final static byte PAYPAL = 5;
		public final static byte PAYPAL_ECHECK = 6;
		public final static byte WIRE = 7;
		public final static byte AMAZON = 8;
		public final static byte NET=13;
		public final static byte OTHER=0;
	}
	
	//订单支付方法
	public class OrderPaymentMethodString{
		/*
		1 Cash
		2 Check
		3 Credit card
		4 Money order
		5 Paypal
		6 Paypal echeck
		7 Wire
		8 Amazon
		13 Net*/
		public final static String CASH = "Cash";
		public final static String CHECK = "Check";
		public final static String CREDIT_CARD = "Credit card";
		public final static String MONEY_ORDER = "Money order";
		public final static String PAYPAL = "Paypal";
		public final static String PAYPAL_ECHECK = "Paypal echeck";
		public final static String WIRE = "Wire";
		public final static String AMAZON = "Amazon";
		public final static String NET= "Net";
	}
	
	/**
	 * @author Cheng Liangwei
	 * @see 退货单入库的各种状态
	 * */
	public class RestockStatus{
		public final static byte BACKTOSHELF=101;
		public final static byte BACKTOMANUFACTORY=102;
		public final static byte THROWAWAY=103;
		public final static byte INTOSTOCK=1;
		public final static byte TEMPERORYRESTOCK=2;
	}
	
	public class WarehouseAllocateStatus{
		//Status
		public final static byte NEW=0;
		public final static byte SALESSUBMITTED=4;
		public final static byte SUBMITTED=5;
		public final static byte SHIPPED=10;
		public final static byte RECEIVED=15;
		public final static byte UPDATEURGENT=20;
		
		//Operate type
		public final static byte CREATE=1;
		public final static byte UPDATE=2;
		public final static byte SHIPFAIL=3;
		public final static byte PMCFIGHTBACK=6;
	}
	/**
	 * 发货指令单是否为打回
	 * @author Administrator
	 *
	 */
	public class PackageIsReject{
		public final static int NO=0;
		public final static int YES=1;	
	}
	
	public class IsError {
		public final static byte ERROR = 1;
		public final static byte NOERROR = 2;
	}
	
	/**
	 * @author Brian Zhong
	 * @see 仓库id
	 * */
	public class WharehouseId{
		public final static int US_CA=1;
		public final static int CN_GLOBAL_BAOAN=2;
		public final static int DE_HAMBURG=4;
		public final static int CN_GLOBAL_FUBAO=5;
		public final static int US_FBA=6;
		public final static int US_FBA2=41;
		public final static int DE_FBA=7;
		public final static int UK_FBA=8;
		public final static int FR_FBA=11;	
		public final static int US_CA_USED=13;
		public final static int US_CA_USED_FOR_REPLACEMENT=50;
		public final static int US_SBN_STK=14;
		public final static int UK_FBA_DH=15;	
		public final static int US_FBA_D2G=16;	
		public final static int FR_FBA_STK=17;	
		public final static int CA_FBA_STK=18;
		public final static int US_FBA_STK=19;
		public final static int DE_HAMBURG_USED=22;
		public final static int DE_HAMBURG_USED_FOR_REPLACEMENT=51;
		public final static int WH_3RD=30;
		public final static int CN_TAX = 32;
		public final static int CN_NoTax = 31;
		public final static int CN_NOTAX_SZ =34;
		public final static int HK_NOTAX = 42;
		public final static int CN = 20;//基础费率 中国仓
		public final static int FBA = 21;//基础费率 FBA仓
		public final static int UK_NBE_FBA=35;
		public final static int FR_NBE_FBA=36;
		public final static int IT_NBE_FBA=37;
		public final static int ES_NBE_FBA=38;
		public final static int UK_SKL_FBA=43;
		public final static int FR_SKL_FBA=44;
		public final static int IT_SKL_FBA=45;
		public final static int ES_SKL_FBA=46;
		public final static int JP_NBD_FBA=27;
		public final static int JP_STK_FBA=23;
		public final static int CN_SUPPLIER = 39;
		public final static int GUANYI = 103;
	}
	
	/**
	 * @author Ervin zeng
	 * @see 基础费率类型
	 * */
	public class BaseCostType{
		public final static int REBATE_COEFFICIENT=1;//退税成本
		public final static int FREIGHT_RATES=2;//海运费费率
		public final static int LABOR_COSTS=3;//人工包材
	}
	
	/**
	 * @author Brian Zhong
	 * @see 仓库简写，用在导入订单时候有93-36006-011#5*US,93-36006-011*F情况的时候取仓库
	 * */
	public static class WharehouseSkuCode{
		public static Map<String ,Integer > getMap(){
			Map<String ,Integer > map=new HashMap<String ,Integer >();
			map=new HashMap<String ,Integer >();
			map.put("US", WharehouseId.US_CA);
			map.put("CNB", WharehouseId.CN_GLOBAL_BAOAN);
			map.put("CNF", WharehouseId.CN_GLOBAL_FUBAO);
			map.put("F", WharehouseId.CN_GLOBAL_FUBAO);
			map.put("DEH", WharehouseId.DE_HAMBURG);
			map.put("USF", WharehouseId.US_FBA);
			map.put("DEF", WharehouseId.DE_FBA);
			map.put("USU", WharehouseId.US_CA_USED);//增加US-CA(Used)仓库
			map.put("DEHU", WharehouseId.DE_HAMBURG_USED);
			return map;
		}
		
		/**
		 * 上传订单的时候,取SKU中93-36006-011#5*US,93-36006-011*F情况时候的仓库ID
		 * 
		 * @author Brian Zhong 2010-06-25
		 * @param String warehousecode
		 * @return int
		 */
		public final static int getWarehouseIdByCode(String warehousecode){

			warehousecode = StringUtils.upperCase(warehousecode);
			Map<String ,Integer > map=getMap();
			if(map.containsKey(warehousecode)){
				return map.get(warehousecode);
			}
			return 0;
			
		}
		
		public static Map<Integer ,String> getMap2(){
			Map<Integer,String> map=new HashMap<Integer,String>();
			map=new HashMap<Integer,String>();
			map.put(WharehouseId.US_CA,"US");
			map.put(WharehouseId.CN_GLOBAL_BAOAN,"CNB");
			map.put(WharehouseId.CN_GLOBAL_FUBAO,"CNF");
			map.put(WharehouseId.CN_GLOBAL_FUBAO,"F");
			map.put(WharehouseId.DE_HAMBURG,"DEH");
			map.put(WharehouseId.US_FBA,"USF");
			map.put(WharehouseId.DE_FBA,"DEF");
			return map;
		}
		public final static String getWarehouseCodeById(int wh_id){
			Map<Integer,String> map=getMap2();
			if(map.containsKey(wh_id)){
				return map.get(wh_id);
			}
			return "";
			
		}
	}
	
	
	/**
	 * @author Cheng Liangwei
	 * @date 2010-04-07
	 * @see 支付方式
	 * */
	public class PamentMethod{
		public final static byte Paypal=1;
		public final static byte PaypalEcheck=2;
		public final static byte MoneyOrder=3;
		public final static byte Check=4;
		public final static byte Cash=5;
		public final static byte CreditCard=6;
		public final static byte BankWire=7;
		public final static byte NetCreditSale=8;
		public final static byte PaypalRefund=9;
		public final static byte PaypalResend=10;
		public final static byte BuyCom=11;
		public final static byte Amazon=12;
	}
	
	/**
	 * @author Cheng Liangwei
	 * @date 2010-04-07
	 * @see 退货单的下一步操作
	 * */
	public class NextStatus{
		public final static byte DoNothing=1;
		public final static byte CancelRma=2;
		public final static byte ReceivedItem=3;
		public final static byte SendExpectReturn=4;
		public final static byte SendNotExpectReturn=5;
		public final static byte Discount=6;
		public final static byte DoNothingClose=7;
		public final static byte SendReplacement=8;
		public final static byte Refund=9;
		public final static byte Postal_refund=10;
		public final static byte No_postal_refund=11;
	}
	
	/**
	 * @author Brian Zhong
	 * @see seller_id
	 * */
	public class MarketAount_acount{
		
		public final static String web_sunvalleyus = "web-sunvalleyus";
		public final static String web_sunvalleytek = "web-sunvalleytek";
		public final static String usadapter = "usadapter";
		public final static String sunvalleyus = "sunvalleyus";
		public final static String sunvalleytek = "sunvalleytek";
		public final static String rma = "rma";
		public final static String papatek = "papatek";
		public final static String hootoo_de = "hootoo_de";
		public final static String hootoodeals = "hootoodeals";
		public final static String hootoo = "hootoo";
		public final static String eshoponline = "eshoponline";
		public final static String dropship = "dropship";
		public final static String de_amazon = "de_amazon";
		public final static String chargerdeal = "chargerdeal";
		public final static String buy_com = "buy.com";
		public final static String babatek = "babatek";
		public final static String amazon = "amazon";
	}
	
	/**
	 * @author Brian Zhong
	 * @see seller_id
	 * */
	//5, 9, 10, 14, 17 零售渠道
	public class MarketAount_Channel_ID{
		public final static int sunvalleytek=1;
		public final static int sunvalleyus=2;
		public final static int rma=3;
		public final static int web_sunvalleytek=4;
		public final static int web_sunvalleyus=5;
		public final static int papatek=9;
		public final static int babatek=10;
		public final static int amazon=12;
		public final static int de_amazon=21;
		public final static int FBA_amazon=31;
		public final static int FBA_amazon_de=200;
		public final static int FBA_amazon_uk=207;
		public final static int amazon_dealheroes=212;
		public final static int chargerdeal=13;
		public final static int hootoo=14;
		public final static int US_Dropship=15;
		public final static int buy_com=16;
		public final static int usadapter=17;
		public final static int hootoodeals=18;
		public final static int eshoponline=19;
		public final static int hootoo_de=20;
		public final static int tra_wholesale=22;
		public final static int makeqian=23;
		public final static int CN_Dropship=24;
		public final static int zbt_trading=25;
		public final static int hootoo_de_2=26;
		public final static int CN_B2C=27;
		public final static int trustpick=28;
		public final static int AfterBuy=29;
		public final static int lcdht=30;
		public final static int ebay_yeahart=205;
		public final static int newegg=221;
		public final static int sears=222;
		public final static int web_papatek=9;
		public final static int web_usadapter=17;
		public final static int channel_x=233;
		public final static int direct2grocery=513;
		public final static int NEWEGG_Sunvalley=221;
		public final static int NEWEGG_ProTrend=223;
		public final static int SBN_Sunvalley=248;
		public final static int SBN_Protrend=249;
		public final static int FBA_US_D2G=250;
		public final static int Wholesale_Newegg_US=257;
		public final static int Wholesale_Amazon_US=258;
		public final static int web_nearbyexpress=201;
	}
	
	/**
	 * @author Brian Zhong
	 * @see MarketName
	 * */
	public class MarketName{
		public final static String EBAY="ebay";
//		public final static String SUNVALLEYTEK="www.sunvalleytek.com";
//		public final static String SUNVALLEYUS="www.sunvalleyus.com";
//		public final static String PAPATEK="www.papatek.com";
//		public final static String BABATEK="www.babatek.com";
//		public final static String AMAZON="amazon";
//		public final static String HOOTOO="www.hootoo.com";
//		public final static String DEOPSHIP="dropship";
//		public final static String BUY_CAO="buy.com";
//		public final static String USA_DAPTER="www.usadapter.com";
		
	}
	
	/**
	 * @author Cheng Liangwei
	 * @date 2010-04-08
	 * @see 平台是否接收
	 * */
	public class IsReceive {
		public final static byte RECEIVED = 1;
		public final static byte NORECEIVED = 0;
		public final static byte TEMPRECEIVED = 2;
	}
	
	/**
	 * @author Cheng Liangwei
	 * @date 2010-04-09
	 * @see 退货单的处理方式
	 * */
	public class DealwithType{
		public final static byte REFUND = 1;
		public final static byte NOACTION=0;
	}
	
	/**
	 * @author Cheng Liangwei 
	 * @date 2010-04-10
	 * @see 是否考虑材积重
	 * */
	public class VolWeight{
		public final static byte VOLWEIGHT=1;
		public final static byte IGNOREVOLWEIGHT=0;
		public final static byte VOLCUBIC=2;
	}
	
	/**
	 * @author Cheng Liangwei 
	 * @date 2010-04-10
	 * @see 渠道的类型
	 * */
	public class ChannelType{
		public final static int AMAZON=507;//amazon类型
		public final static int EBAY=501;//ebay类型
		public final static int DROPSHIP=502;//dropship类型
	}
	
	/**
	 * 渠道类型
	 * @author andy.li
	 * ERP-3958
	 */
	public class SysCompanyType{
		public final static int FBA=10;//fba类型
	}
	
	/**
	 * @author Cheng Liangwei 
	 * @date 2010-04-12
	 * @see 虚拟SKU的类型
	 * */
	public class VirtualType{
		public final static byte VIRTUAL = 1;//虚拟SKU
		public final static byte ACTUAL = 0;//实际的SKU
	}
	
	/**
	 * @author Cheng Liangwei
	 * @date 2010-04-17
	 * @see 是否进行采购
	 * */
	public class PurchaseSet{
		public final static byte PURCHASE=1;//进行采购
		public final static byte NOTPURCHASE=0;//不进行采购，默认是0
	}
	
	/**
	 * 包装执行者
	 * @author Lufangzong
	 * @date 2010-04-20
	 */
	public class PackageExecutor {
		public final static byte SUPPLIERS = 1; // 供应商
		public final static byte MIDWAREHOUSE = 2; // 中转仓
		public final static byte PURPOSEWAREHOUSE = 3; // 目的仓
	}
	
	
	/**
	 * SKU的替换模式
	 * @author Cheng Liangwei
	 * @date 2010-04-22
	 * @version 1.0
	 * */
	public class ReplaceType{
		public final static byte ONEWAY=0;//单向替换
		public final static byte TWOWAY=1;//双向替换
		public final static byte COMFIRMREPLACE=1;//确认替换
		public final static byte UNCOMFIRMREPLACE=0;//非确认替换
	}
	
	/**
	 * 检测状态
	 * @author Cheng Liangwei
	 * @date 2010-04-30
	 * @version 1.0
	 * */
	public class CheckStatus{
		public final static byte AUDITING=1;
	    public final static byte VERIFIED=2;
	    public final static byte DISPUTE=3;
	}
	
	/**
	 * 登录状态
	 * @author Cheng Liangwei
	 * @date 2010-05-05
	 * @version 1.0
	 * */
	public class LoginStatus{
		public final static byte ACTIVE=1;//激活
		public final static byte NOTACTIVE=0;//未激活
		public final static byte NOTEXIST=2;//用户不存在
		public final static byte PWDERROR=3;//密码错误
		public final static byte PASS=4;//通过
		public final static byte NEW=3;//new dropship公司
		public final static byte PASSEXPIRED=5;//密码过期
		public final static byte PASSEXPIREDMESSAGE=6;//密码有效期剩余7天
		public final static byte NORIGHT = 7 ;//没有权限
		public final static byte LOCK = 8;//被锁住
	}
	
	
	//供应商信息的状态
	public class SupplierStatusType {
		public static final byte NO = 0;
		public static final byte YES = 1;
		// added by hileen jiangzg on 2010-05-5 
	}
	public class SupplierItemStatus{
		public static final int NEW = 1;//新建
		public static final int ELEMENTARYAUDIT = 2;//初级审核
		public static final int ENDAUDIT =3;//终极审核
		public static final int checkAudit = 4;//已审核
	}
	
	
	// added by Lufangzong on 2010-05-08
	public class ItemPriceType {
		public static final byte TP1PRICE = 0;
		public static final byte DROPPRICE = 1;
		public static final byte MARKETPRICE=2;
	}
	
	// added by Lufangzong on 2010-05-10
	public class NoticeType {
		public static final byte SYSTEM = 1;
		public static final byte PRODUCT = 2;
		public static final byte PRICE = 3;
		public static final byte SHIPMENT = 4;
	}
	
	/**
	 * 是否为零库存
	 * @author Cheng Liangwei
	 * @date 2010-05-11
	 * @version 1.0
	 * */
	public class ZeroStock{
		public static final byte TRUE=1;
		public static final byte FALSE=0;
	}
	
	/**
	 * 对渠道是否限制
	 * */
	public class PrepareLimmit{
		public static final byte YES=1;
		public static final byte NO=0;
	}
	
	public class Right {
		public static final String Right = "menu_right"; // 放到request里面定义的key值
	}
	
	/**
	 * MAILCLASS的配置
	 * 109,110,111,112,113,114,115
	 * */
	public class MailClassConfig{
		public static final int	HKP_FLAT_RATE=1;
		public static final int	HKP_REGISTERED=2;
		public static final int	SGP_FLAT_RATE=21;
		public static final int	SGP_REGISTERED=22;
		public static final int	UPS_Expedited_Rates=99;
		public static final int	UPS_Express_Saver_BAOAN=100;
		public static final int	USPS_First_Class_Parcel=101;
		public static final int	USPS_First_Class_Parcel_U=420;
		public static final int	USPS_Priority_Flat_Env=102;
		public static final int	USPS_Priority_Flat_Box=103;
		public static final int	USPS_Priority_Large_Flat_Box=104;
		public static final int	USPS_Priority=105;
		public static final int	Pick_Up=106;
		public static final int FBA_SHIPING = 587;
		public static final int	USPS_Express=107;
		public static final int	USPS_Express_Flat=108;
		public static final int	UPS_Ground=109;
		public static final int	UPS_Ground_U=428;
		public static final int	UPS_2nd_Day_Air=110;
		public static final int	UPS_2nd_Day_Air_U=429;
		public static final int	UPS_3_Day_Select=111;
		public static final int	UPS_2nd_Day_Air_AM=112;
		public static final int	UPS_Next_Day_Air_Saver=113;
		public static final int	UPS_Next_Day_Air=114;
		public static final int	UPS_Next_Day_Air_U=433;
		public static final int	UPS_Next_Day_Air_Early_A=115;
		public static final int	USPS_First_Class_Env=116;
		public static final int	USPS_First_Class_Env_U=435;
		public static final int	USPS_Priority_Small_Flat_Box=117;
		public static final int	USPS_First_Class_Flat=118;
		public static final int	USPS_First_Class_Flat_U=437;
		public static final int	USPS_First_Class_Intl=120;
		public static final int	USPS_First_Class_Intl_U=439;
		public static final int	USPS_Priority_Intl=121;
		public static final int	USPS_Priority_Intl_Env=122;
		public static final int	USPS_Priority_Intl_Small_Box=123;
		public static final int	USPS_Priority_Intl_Small_Box_U=442;
		public static final int	USPS_Priority_Intl_Medium_Box=124;
		public static final int	USPS_Priority_Intl_Large_Box=125;
		public static final int	USPS_Express_Intl=126;
		public static final int	USPS_Express_Intl_Env=127;
		public static final int	UPS_Parcel_Post=128;
		public static final int	UPS_Basic=129;
		public static final int	UPS_Basic_U=448;
		public static final int	UPS_Worldwide_Express=130;
		public static final int	UPS_Worldwide_Save=131;
		public static final int	UPS_Worldwide_Save_U=450;
		public static final int	UPS_Worldwide_Expedited=132;
		public static final int	UPS_Standard=133;
		public static final int	UPS_Standard_U=452;
		public static final int	USPS_Priority_Large_Flat_Box_2=134;
		public static final int USPS_Priority_Mail_Commercial_Plus_Cubic=136;
		public static final int DHL_SMARTMAIL=137;
		public static final int DHL_SMARTMAIL_PLUS=138;
		public static final int DHL_SMARTMAIL_PLUS_U=457;
		public static final int	DHL=201;
		public static final int	DHL_AT=214;
		public static final int	DHL_World=215;
		public static final int	DE_POST_SMALL=203;
		public static final int	DE_POST_BIG=204;
		public static final int DE_SLOW1=208;
		public static final int DE_SLOW2=209;
		public static final int DE_SLOW3=210;
		//public static final int	DE_POST_EU=206;
		public static final int	DE_POST_EU0_5=206;
		public static final int	DE_POST_EU1_0=212;
		public static final int	DE_POST_EU2_0=213;
		public static final int	DPD_EU=207;
		public static final int	DE_POST_PA=205;
		public static final int	DPD=202;
		public static final int	UPS_Express_Saver_FUBAO=301;
		public static final int UPS_Expedited_Rates_FUBAO=302;
		public static final int	FEDEX_IE=310;
		public static final int FEDEX_IP=311;
		public static final int	BAO_FEDEX_IE=60;
		public static final int BAO_FEDEX_IP=70;
		public static final int FBA=401;
		public static final int DE_FBA=402;
		public static final int Postnl_NL01=501;
		public static final int PostNord_SE01=502;
		public static final int PostNord_SE02=503;
		public static final int DHL_Freight=504;
		public static final int Postnl_NL01_HK=524;
		public static final int PostNord_SE01_HK=525;
		public static final int PostNord_SE02_HK=526;
		
		public static final String DE_DHL_NAME = "DHL DE";
		public static final String DE_DHL_POST_NAME ="Großbrief";
		public static final String DE_POST_BIG_NAME = "Maxibrief";
		public static final String DE_POST_EU0_5_NAME="DE-EU 0.5";
		public static final String DHL_AT_NAME = "DHL AT";
		public static final String DHL_World_NAME = "DHL World";
		public static final String USPS_First_Class_Intl_Name = "USPS First-Class Mail International Packages";
		public static final String UPS_Standard_Name = "UPS Standard";
		public static final String USPS_First_Class_Parcel_Name ="USPS First-Class Mail Large Packages";
		public static final String UPS_Ground_NAME="UPS Ground";
		public static final String UPS_2nd_Day_Air_Name ="UPS 2nd Day Air";
		public static final String UPS_Next_Day_Air_Name ="UPS Next Day Air";
		public static final String USPS_First_Class_Env_Name ="USPS First-Class Mail Large Envelopes";
		public static final String USPS_Priority_Intl_Small_Box_Name ="USPS Priority Mail International Small Flat Rate Box";
		public static final String USPS_First_Class_Flat_Name = "USPS First-Class Mail Letters";
		public static final String UPS_Basic_Name="UPS Basic";
		public static final String UPS_Worldwide_Save_Name="UPS Worldwide Saver";
		public static final String DE_SLOW1_NAME="Warensendung(Standard)";
		public static final String DE_SLOW2_NAME="Warensendung(Kompakt)";
		public static final String DE_SLOW3_NAME="Warensendung(Maxi)";
	}
	
	//是与否的类型
	public class IOType{
		public static final byte YES=1;
		public static final byte NO=0;
	}
	public class PHP {
		public static final String PATH = "http://eshoponline.nearbyexpress.com/do.php?"; // 运营商
		public static final String ROOT_PATH = "http://eshoponline.nearbyexpress.com/"; // 运营商
		//public static final String LINKPATH="http://216.227.210.188:88/add_title.php";
	}
	
	//区域划分的类型
	public class ZoneType{
		public static final byte COUNTRY=1;//按国家来区分
		public static final byte ZIP3=2;//按邮编的前三位来区分
		public static final byte ZIP=3;//按全ZIP来进行区分
		public static final byte SINGLEZONE=4;//不分区域
		public static final byte SINGLEZONE_RATIO_PRICE=5;//不分区域 价格与重量成反比
		public static final byte SINGLEZONE_RATIO_PRICE_K=6;//不分区域 价格与重量成反比，之后与常值求和
		public static final byte zip3_DEFAULT=7;//用zip3方式查不到时的默认方式
	}
	
	public class MailClassFeeType{
		public static final byte DIRECT=0;//直接取价格
		public static final byte PERPRICE_ADD_BASEFEE=1;//按单位计算
		public static final byte PERPRICE_COMPARE_BASEFEE=2;//按单位计算不少于基础费用
		public static final byte PERPRICEUP_ADD_BASEFEE=3;//按单位向上取整计算
		public static final byte PERPRICEUP_COMPARE_BASEFEE=4;//按单位向上取整计算不少基础费用
		public static final byte BASEPRICEUP_COMPARE_BASEFEE=5;//按单位向上取整计算基础费用
		public static final byte BASEPRICE_COMPARE_BASEFEE=6;//按单位计算不少于基础费用
	}
	
	//锁库类型
	public class LockStockType{
		public static final byte LOCK_PUBLIC_FIRST=1;//先锁公有再锁私有库存
		public static final byte LOCK_CHANNEL_FIRST=0;//先锁私有库存再锁公有库存
		public static final byte LOCK_PUBLIC_ONLY=2;//只锁公有库存
		public static final byte LOCK_CHANNEL_ONLY=3;//只锁私有库存
		public static final byte LOCK_CHANNEL_PART_PUBLIC_FIRST=4;//先锁私有库存再锁小领域公有库存再锁大领域公有库存
	}
	//字符集，主要用于上传文档的地方
//	public class CharacterSet{
//		public static final byte ISO_8859_1 = 1;//"ISO-8859-1";
//		public static final byte UTF_8 = 2;//"UTF-8";
//		public static final byte GB2312 = 3;//"GB2312";
//		public static final byte GBK = 4; //"GBK";
//	}
	
	/**
	 * @author Brian Zhong
	 * @see 字符集
	 * */
	public static class CharacterSet{
		public static Map<String ,String > getCharacterSetMap(){
			
			Map<String ,String > map=new HashMap<String ,String >();
			map=new HashMap<String ,String >();
			map.put( "1", "ISO-8859-1");
			map.put( "2", "UTF-8");
			map.put( "3", "GB2312");
			map.put( "4", "GBK");
			map.put("5", "ANSI");
			return map;
		}
		
		/**
		 * 获取字符集
		 * 
		 * @author Brian Zhong 2010-07-05
		 * @param String code
		 * @return String
		 */
		public final static String getCharacterSet(String code){

			code = StringUtils.upperCase(code);
			Map<String ,String > map=getCharacterSetMap();
			if(map.containsKey(code)){
				return map.get(code);
			}
			//取不到，默认UTF-8
			return "UTF-8";
			
		}
	}
	
	/**
	 * @author Brian Zhong
	 * @see 字符集
	 * */
	public static class UploadMode{
		
		public static final int Amazon=1;
		public static final int DE_Amazon=2;
		public static final int FBA_Amazon=3;
		public static final int DE_FBA_Amazon=4;
		public static final int Afterbuy=5;
		public static final int Buycom=6;
		public static final int Ebay=7;
		public static final int NEWEGG=8;
		public static final int SEARS=9;
		public static final int NEWEGGSBN=10;
		public static final int JINGDONG=11;
//		public static Map<String ,String > getUploadModeMap(){
//			Map<String ,String > map=new HashMap<String ,String >();
//			map=new HashMap<String ,String >();
//			map.put( "1", "Amazon");
//			map.put( "2", "DE-Amazon");
//			map.put( "3", "FBA-Amazon");
//			map.put( "4", "DE-FBA-Amazon");
//			map.put( "5", "Afterbuy");
//			map.put( "6", "Buycom");
//			map.put( "7", "Ebay");
//			return map;
//		}
//		
//		/**
//		 * 获取字符集
//		 * 
//		 * @author Brian Zhong 2010-07-05
//		 * @param String code
//		 * @return String
//		 */
//		public final static String getUploadMode(String code){
//
//			code = StringUtils.upperCase(code);
//			Map<String ,String > map=getUploadModeMap();
//			if(map.containsKey(code)){
//				return map.get(code);
//			}
//			//取不到，默认空
//			return "";
//			
//		}
		
		/**
		 * @author Brian Zhong
		 * @see bs_systemprofile表的category字段参数
		 * */
		public static class SystemProfile_Category{
			public static final String Bill="Bill";
			public static final String Import="import";
			public static final String TrackingNoDateFormat="TrackingNoDateFormat";
			public static final String IMGUP="imgup"; // 图片上传ftp服务器设置参数
			public static final String IMGEMANAGE="imageManage"; // 图片显示类别参数			
		}
		
		/**
		 * @author Brian Zhong
		 * @see bs_systemprofile表的fkey字段参数
		 * */
		public static class SystemProfile_Fkey{
			public static final String BillTerm = "BillTerm";
			public static final String Order = "order";
			public static final String TrackingNoDateFormat_USPS = "usps";
			public static final String TrackingNoDateFormat_DE = "de";
		}
		
		/**
		 * @author Brian Zhong
		 * @see 取设定的发货时间格式
		 * */
		public static class ShippingDateMode{
			public static Map<String ,String > getShippingDateModeMap(){
				
				Map<String ,String > map=new HashMap<String ,String >();
				map=new HashMap<String ,String >();
				map.put( "1", "yyyy-MM-dd");
				map.put( "2", "yyyy/MM/dd");
				map.put( "3", "yyyyMMdd");
				map.put( "4", "MMM-dd-yy");
				map.put( "5", "MMM-dd-yyyy");
				map.put( "6", "MMM dd yyyy");
				map.put( "7", "dd.MM.yyyy");
				map.put( "8", "dd.MM.yy");
				map.put( "9", "yyyy-MM-dd HH:mm:ss");
				map.put( "10", "yyyyMMddHHmmss");
				map.put( "11", "dd.MM.yyyy HH:mm:ss");
				map.put( "12", "MM/dd/yyyy HH:mm:ss");
				map.put( "13", "MM/dd/yyyy HH:mm a");
				map.put( "14", "MM/dd/yyyy HH:mm:ss a");
				map.put( "15", "yyyy-MM-dd-HH-mm-ss-ssss");
				
				return map;
			}
			
			/**
			 * 取设定的发货时间格式
			 * 
			 * @author Brian Zhong 2010-07-05
			 * @param String code
			 * @return String
			 */
			public final static String getShippingDateMode(String code){

				code = StringUtils.upperCase(code);
				Map<String ,String > map=getShippingDateModeMap();
				if(map.containsKey(code)){
					return map.get(code);
				}
				return "";
				
			}
		}
	}
	
	public class TimeType {
		public final static byte DAILY = 1; // 按日
		public final static byte WEEKLY = 2; // 按周
		public final static byte MONTHLY = 3; // 按月
	}
	
	public class CountryIsDomestic{
		public final static byte NO = 0; // 默认非国际标准
		public final static byte YES = 1; // 1为国际标准
	}
	
	//邮件发送状态
	public class DeliverStute{
		//发送成功
		public final static int SUCCESS=1;
		//发送未发送
		public final static int NORMAL=0;
		//信息错误
		public final static int ERROR=2;
	}
	
	//订单的替换类型
	public class PrepareReplaceType{
		//不进行替换
		public final static byte NOTREPLACE=0;
		//自动替换
		public final static byte AUTOREPLACE=1;
		//手动替换
		public final static byte HANDREPLACE=2;
	}
	
	//模板类型/Email类型(详见表sys_type_status)
	public class TemplateType{
		// modify by peter
		//DROP SHIP
		public final static int PRODUCT_TEMPLATE=1;//产品
		public final static int EMAIL_TEMPLATE=2;//email
		//ERP for email template
		public final static int ORDER = 2;
		public final static int RMA = 3;
		public final static int USER = 4;
		public final static int PRODUCT=5;
		public final static int CUSTOMER=6;
	}
	
	//模板权限类型
	public class TemplateAuthorityType{
		public final static int PUBLIC=0;//公开的
		public final static int PRIVATE=1;//私有的
	}
	
	//ERROR SKU id
	public class ErrorSkuid{
		public final static int ERROR_SKUID=1;//SKU ID
		public final static int SKU_3RD_H_ID=10;
		public final static int SKU_3RD_J_ID=20;
	}
	public class SKU{
		public final static String SKU_3RD_H="SKU-3RD-H";
		public final static String SKU_3RD_J="SKU-3RD-J";
	}
	//打印默认值
	public class PrinteLabel_config{
		public final static double UPS_Package_DeclaredValueOption=300;
		public final static String UPS_signature_require_Y="Y";
		public final static String UPS_signature_require_N="N";
		
		
	}
	
	//退货分析的处理状态
	public class AnalysisStatus{
		public final static int BySKU=0;
		public final static int ByCategory=1;
		public final static int ByReason=2;
		public final static int ByBatch=3;
	}
	
	//美国的小岛
	public static List<String> IsLandList=null;
	
	static {
		if(IsLandList==null){
			IsLandList=new ArrayList<String>();
			IsLandList.add("AS");
			IsLandList.add("Virgin Island");
			IsLandList.add("VI");
			IsLandList.add("Puerto Rico");
			IsLandList.add("PR");
			IsLandList.add("American Samoa");
			IsLandList.add("Guam");
			IsLandList.add("GU");
			IsLandList.add("Marshall Islands");
			IsLandList.add("MH");
			IsLandList.add("MP");
			IsLandList.add("Northern Mariana Islands");
			IsLandList.add("Wake Island");
			IsLandList.add("Palau");
			IsLandList.add("PW");
		}
	}
	
	/*
	public class TemplateMappingOwner{
		//订单所属
		//public final static int ORDER_OWNER=1;
		//rma所属
		//public final static int RMA_OWNER=2;
		//产品所属
		//public final static int PRODUCT_OWNER=3;
		//用户所属
		//public final static int USER_OWNER=4;
		// modify by peter at 2011-11-07 
		public final static int PRODUCT_OWNER=1;
		public final static int ORDER_OWNER=2;
		public final static int RMA_OWNER=3;
		public final static int USER_OWNER=4;
	}
	*/
	public class PrepareErrorType{
		public final static int NORMAL=0;
		public final static int SKU_ACTIVE=1;
	}
	
	/**
	 * 修改类型
	 * */
	public class ModifyType{
		public final static byte YES=1;
		public final static byte NO=2;
	}
	//DROP SHIP 
	public class TemplateMappingStatus{		
		public final static int USED=1;		
		public final static int UN_USED=0;
	}
	
	public class MappingStatus{
		//启用
		public final static int USED=1;
		//不启用
		public final static int UN_USED=0;
	}
	
	public class BillExportReplace 
	{
		//transtype数据库中值对应含义
		public final static String TRANSTYPE1 = "Order";

		public final static String TRANSTYPE2 = "RMA";

		public final static String TRANSTYPE3 = "Recharge";

		public final static String TRANSTYPE4 = "Purchase";

		public final static String TRANSTYPE7 = "Other";
		
		//feetype数据库值对应含义
		public final static String FEETYPE1 = "MerchandizeAmount";
		
		public final static String FEETYPE2 = "Shipping Fee";
		
		public final static String FEETYPE3 = "Handle Fee";
		
		public final static String FEETYPE4 = "Per Item Charge";
		
		public final static String FEETYPE5 = "Per Order Charge";
		
		public final static String FEETYPE6 = "DropShip Fee";
		
		public final static String FEETYPE10 = "Recharge";
		
		public final static String FEETYPE11 = "Payment Discount";
		
		public final static String FEETYPE12 = "Volume Discount";
		
		public final static String FEETYPE13 = "Other Discount";
		
		public final static String FEETYPE14 = "Over Due Balance";
		
		public final static String STATUS0 = "Unconfirmed";
		
		public final static String STATUS1 = "Confirmed";
		
		public final static String ONE = "1";
		
		public final static String Zero = "0";
		
		public final static String TWO = "2";
		
		public final static String THREE = "3";
		
		public final static String FOUR = "4";
		
		public final static String FIVE = "5";
		
		public final static String SIX = "6";
		
		public final static String SEVEN = "7";
		
		public final static String EIGHT = "8";
		
		public final static String NINE = "9";
		
		public final static String TEN = "10";
		
		public final static String ELEVEN = "11";
		
		public final static String TWELVE = "12";
		
		public final static String THIRTEEN = "13";
		
		public final static String FOURTEEN = "14";
		
		
	
				
	}
	
	//ebay订单通过API提交到ebay网站的状态
	public class EbayTrackingSubmitedStatus{
		//未提交
		public final static byte UN_SUBMIT=0;
		
		//已提交
		public final static byte SUBMITTED=1;
		
		//条件不足Inadequate conditions
		public final static byte INADEQUANTE_CONDITIONS=2;
		
		//异常
		public final static byte EXCEPTION=3;
	}
	
	//sys_ebay_token表的isTrackSubmit配置，配置需要发送tracking#回ebay网站的渠道。
	public class EbayIsSubmitToken{
		//不需要提交
		public final static byte UN_SUBMIT=0;
		//需要提交
		public final static byte SUBMIT=1;
	}
	
	
	
	/**
	 * @author creez
	 *	在USPS发货时，如果碰到产生不了TRACKING NO.的情况下，是否要使用第三方软件生成。
	 */
	public class DeliveryConfirmation{
		//使用第三方软件生成TRACK NO.当生成不了TRACKING NO.的时候
		public final static String YES="Y";
		//不使用第三方软件生成TRACK NO.当生成不了TRACKING NO.的时候
		public final static String NO="N";
	}
	
	
	/**
	 * 
	 * @author creez
	 * 模板所属系统
	 */
	public class TemplateOwner{
		//代发货系统所属
		public final static int DROPSHIP=1;
		//ERP系统所属
		public final static int ERP=0;
		//采购系统所属
		public final static int PURCHASE=2;
	}
	
	/**
	 * 
	 * @author creez
	 * 模板是否启用（审核通过）
	 *
	 */
	public class TemplateStatus{
		//启用
		public final static int USED=1;
		//不启用
		public final static int UN_USED=0;
	}
	
	
	/**
	 * 
	 * @author creez
	 *	设置邮件发送的类型，是发给客户还是发给自己或者发给客户同时发给自己 
	 */
	public class EmailSenderType{
		//只发给客户
		public final static int CUSTOMER=0;
		//只发给自己
		public final static int USER=1;
		//发给客户同时发给自己
		public final static int USER_AND_CUSTOMER=2;
	}
	
	
	/**
	 * @author creez
	 * company的状态列表。
	 */
	public class CompanyStatus{
		public final static byte Inactive=0;
		public final static byte Active=1;
		public final static byte Hold=2;
		public final static byte New=3;
		public final static byte FREEZE=10;//渠道的冻结状态
		public final static byte UNFREEZE=11;//渠道的非冻结状态
	}
	
	
	//出入库单据的状态
	public final static class VoucherStatus{
		public final static int DRAFT=0;
		public final static int CHECK=10;
		public final static int FREEZE=20;
		public final static int CANCEL=30;
		public final static int CLOSE=40;
		public final static int INVALID=50; //作废
	}
	
	//组装单据的状态
	public final static class CombineStatus{
		public final static int COMBINING=0;//组装中
		public final static int waitEaudit=4;//待审核
		public final static int waitStock=8;//待入库
		public final static int CONBINED=10;//组装完成
		public final static int INVALID=50; //作废
	}
	
	//退货通知单单据的状态
	public final static class ReturnVoucherStatus{
		public final static int UN_AUDIT=0;//未审核
		public final static int AUDITED=1;//已审核
		public final static int INVALID=50; //作废
	}
	
	
	//日志记录默认字段
	public final static class SysLogField{
		//记录用户
		public final static String OP_USER="erp_op_user";
		//记录时间
		public final static String OP_DATE="erp_op_date";
	}
	
	//EbayAPI提交类型
	public final static class EbayAPIActionType{
		public final static byte MANUAL=0;//手动
		public final static byte AUTOMATIC=1;//自动
	}
	
	
	public final static class LogType{
		public final static int EmailSend=100001001;
		
		public final static int InventorySyn=100002001;
		
		public final static int TrackNumberSyn=100003001;
		
		public final static int AutoSettle=100004001;
	}
	
	public final static class LogOpStatus{
		public final static String SUCCESS="success";
		
		public final static String FAIL="fail";
	}
	
	//Laptopmodel类型
	public final static class LaptopModelLocalType{
		public final static byte PN=0;
		public final static byte FitModels=1;
	}
	
  //四大件数据格式化常量
	public final static class FourbigTransferDataConstant{
	  public final static String SKUID="skuid";
	  public final static String MODEL="Model";
	  public final static String BRAND="Brand";
	  public final static String SERIE="Series";
	  public final static String SUB_SERIE="Sub_Series"; 
	  public final static String PNFITMODELS="PNFitModels";
	} 
	
	/**
	 * 系统角色类型
	 * @author simon.cheng 2011-06-01
	 * */
	public final static class RoleType{
		public final static byte PLATFORM=1;
		public final static byte SELLER=2;
		public final static byte VENDOR=3;
	}
	
	
	public final static class InventoryCountType{
		public final static int NORMAL=1;
		public final static int RMA=2;
		public final static int FBA=3;
	}
	
	/**
	 * 边际成业务逻辑状态
	 * */
	public final static class MarginalCostStatus{
		public final static byte DRAFT=0;
		public final static byte CONFIRM=1;
		public final static byte CANCEL=2;
		public final static byte EFFECT=3;
	}
	/**
	 * 费用导入业务状态
	 */
	public final static class ShippingFeeStatus{
		public final static byte NORMAL = 0;
		public final static byte EXIST = 1;
		public final static byte NOTMATCH = 2;
	}
	/**
	 * 费用导入明细业务状态
	 */
	public final static class ShippingFeeDetailStatus{
		public final static byte NORMAL = 1;
		public final static byte NOTMATCH = 2;
		public final static byte EXIST = 3;
	}
	
	/**
	 * 库存变货类型
	 * */
	public final static class InventoryChangeType{
		public final static byte SHIPMENTSTOCK=1;
		public final static byte CHECKSTOCK=2;
		public final static byte BATCHALLOCATE=3;
		public final static byte MANUALOPERATE=4;
		public final static byte REFRESHMC=5;
		public final static byte RMARESTOCK=6;
		public final static byte UNBOOK=7;
		public final static byte gyAllocate = 8; //管易调拨单
	}
	/**
	 * 消息类型
	 * @author jerry.wei
	 *
	 */
	public final static class MessageType{
		public final static byte IMAGE_CHANGE = 1;
		public final static byte STOCK_CHANGE = 2;
	}
	
	/**
	 * 定时器状态
	 */
	public final static class TimerStatus{
		public final static byte STOPPED = 0;
		public final static byte RUNNING = 1;
	}
	
	/*
	 * 系统日志类型
	 */
	public final static class SystemLogType{
		public final static int FILE_UPLOAD_FOR_PRODUCT_DOCUMENT$DRIVER = 100005001;
		
		public final static int OP_LOG_IMAGE = 202001000;
		
	}
	/**
	 * 系统日志状态
	 */
	public final static class SystemLogStatus{
		public final static byte SUCCESS = 1;
		public final static byte FAIL = 0;
	}
	
	
	/**
	 * 系统日志操作类型
	 */
	public final static class SystemLogOPType{
		public final static int IMAGE_UPLOAD  = 202001001;
		public final static int IMAGE_DELETE  = 202001002;
		public final static int IMAGE_COPY  = 202001003;

	}
	/**
	 * Seller 分类类型
	 */
	public final static class CompanyCategoryType{
		public final static int SELLER = 1;
	}
	/**
	 *RMA Simple Report要发送邮件的仓库
	 */
	public final static class WarehouseType{
		public final static int[] SENDEMAIL_WAREHOUSE={
			WharehouseId.US_CA,WharehouseId.CN_GLOBAL_BAOAN,WharehouseId.DE_HAMBURG,WharehouseId.CN_GLOBAL_FUBAO
			};
	}
	
	/**
	 * Report
	 */
	public final static class ReportFilterType{
		public final static String OrderCategory = "OrderCategory";
		public final static String Market = "Market";
		public final static String Channel = "Channel";
	}

	/**
	 * Amazon 同步标志
	 * 
	 */
	public final static class AmazonOrderSync{
		public final static int NO = 0;
		public final static int YES = 1;
	}
	public final static class AmazonReturnSync{
		public final static int NO = 0;
		public final static int YES = 1;
	}
	public final static class AmazonFeeTypes{
		public final static String ITEMFEES = "ItemFees";
		public final static String ITEMPRICES = "ItemPrice";
		public final static String PROMOTION = "Promotion";
	}
	public final static class AmazonItemFees{
		public final static String FBAPerUnitFulfillmentFee = "FBAPerUnitFulfillmentFee";
		public final static String FBAWeightBasedFee = "FBAWeightBasedFee";
		public final static String FBAPerOrderFulfillmentFee = "FBAPerOrderFulfillmentFee";
		public final static String COMMISSION = "Commission";
	}
	public final static class AmazonItemPrice{
		public final static String PRINCIPAL = "Principal";
		public final static String SHIPPING = "Shipping";
		public final static String TAX = "Tax";
		public final static String SHIPPINGTAX = "ShippingTax";
	}
	public final static class AmazonType{
		public final static String MFN = "MFN"; //amazon-us
		public final static String AFN = "AFN"; //FBA-amazon-us
		public final static byte ORDER_TYPE_ORDER = 1;
		public final static byte ORDER_TYPE_RMA = 2;
	}
	public final static class TrackingNoModelType{
		public final static byte UPS=1;
		public final static byte USPS=2;
		public final static byte COMMON=3;
		public final static byte DE=4;
	}
	public final static class TrackingNoStatus{
		public final static byte CREATE=10;
		public final static byte FINISH=20;
		public final static byte CANCELLED=30;
	}
	public final static class TRACKINGNOISPACKAGES{
		public final static byte NO=0;
		public final static byte YES=1;
	}
	//箱位状态
	public class BoxLocationStatus{
		public final static int INACTIVE=1;//未使用
		public final static int ACTIVE=2;//使用中
		public final static int INVALID=3;//已作废
	}
	
	//箱位状态
	public class StockCountStatus{
		public final static int NOCHECK=0;//待审核
		public final static int CHECK=1;//审核通过
		public final static int CANCEL=2;//作废
	}
	//入库单状态
	public class ReceivingOrderStatus{
		public final static int NEW=0;//新建
		public final static int ONROAD=10;//发货
		public final static int RECEIVING=20;//仓库部分收货
		public final static int RECEIVED=21;//仓库收货完成
		public final static int FINISH=30;//上架完成
		public final static int CANCEL=35;//上架完成
	}
	//库位类型状态
	public class InventoryLocationTypeStatus{
		public final static int FIRST=1;//正常(一级库位)
		public final static int USED=2;//退货或其他(RMA)
		public final static int SECOND=3;//正常(二级库位)
		public final static int TEMP=4;//临时库位
		public final static int RETURNS=5;//退换货库位
		public final static int SAMPLE=6;//送样库位
		public final static int REPLACEMENT=7;//换货库位
		public final static int USED_P=8;//补发配件品库位
	}
	//库存类型
	public class InventoryType{
		public final static int NORMAL=1;//正常(NORMAL)
		public final static int USED=2;//二手(Used)
		public final static int RETURNS=3;//退换货(Returns)
		public final static int SAMPLE=4;//送样(Sample)
		public final static int REPLACEMENT=5;//换货仓
		public final static int USED_P=6;//补发配件品
	}
	//盘点类型
	public class StockCountLocType{
		public final static int NORMAL=1;//正常(NORMAL)
		public final static int USED=2;//退货或其他(USED)
		public final static int SAMPLE=4;//送样
		public final static int REPLACEMENT=5;//送样
		public final static int Used_P = 6;//补发配件品
	}
	//订单类型
	public class OrderType{
		public final static int NORMAL = 1;
		public final static int RMA = 2;
		public final static int SHIPPINGORDER = 3;
	}
	
	//拣货单类型
	public class PickinglistType{
		//订单拣货
		public final static int SellOrderERP = 0;
		//出库单拣货
		public final static int ShippingOrder = 1;
	}
	
	//WMS 订单发货类型
	public class WmsOrderType{
		public final static int NormalOrderDelivery = 1;
		public final static int OneselfTakeDelivery = 2;
	}
	//出库标识
	public class OutOfStockFlag{
		public final static int NO = 0;
		public final static int YES = 1;
		public final static int CANCEL = -1;
	}
	
	//入库单类型
	public class WmsBdOrderType{
		public final static int NORMAL = 0;
		public final static int USED = 1;
		public final static int RETURN = 2;
	}
	//拣货单类型
	public class WmsPickingListType{
		public final static int ONE_TO_ONE = 1;
		public final static int ONE_TO_MANY = 2;
	}
	//拣货单状态
	public class WmsPickingListStatus{
		public final static int NEW = 0;
		public final static int PICKING = 10;
		public final static int FINISH = 30;
	}
	public class WmsStockStatus{
		//状态:0 new新建 5.Confirm确认 .10.Packing 正在拣货 15.Packed 发货20.Finish完成,25Cancel作废',
		public final static int NEW = 0;
		public final static int CONFIRM = 5;
		public final static int PACKING = 10;
		public final static int PACKED	= 15;
		public final static int FINISH	= 20;
		public final static int CANCEL	= 25;
		
	}
	//出库单来源类型
	public class WmsShippingOrderFromType{
		public final static int SELFCREATE = 0;
		public final static int ERPORDER = 1;
	}
	
	//WMS OneBoxOneSKU标志类型
	public class WmsOneBoxOneSKUFlag{
		public final static int ManySKU = 0;
		public final static int OneSKU = 1;
	}
	//发送email,备货审核人配置
	public class SysEmailReceiverType{
		public final static int rma_simple_report_email = 1;//1表示rma simple report 类型
		public final static int baoan_scm_email = 2;//宝安仓库存与SCM的可销售仓数量不等时自动发送email
		public final static int aging_email_send = 3;//每周库龄超90天提醒
		public final static int request_audit_name = 4;//备货审核流程  审核人
		public final static int request_autiNotice_email = 5;//备货审核结果通知
		public final static int ebayTrackingSubmitAPI_email = 6;//Ebay TrackingSubmitAPI
		public final static int shipment_report_email = 7;//发货报表统计
		public final static int rma_purchase_report_email = 8;//rma采购部报表
		public final static int rma_manage_report_email = 9;//rma高层报表
		public final static int detect_detail_report_email =10;// 检测统计报表
		public final static int warehouse_allocate_email = 11;//仓库间调拨通知德国发货仓库人员
		public final static int ebayOrderWarn_email = 12;//Ebay未出货订单通知
		public final static int erpWmsInventory_email =13;//erp和wms系统库存差异收件人美国
		public final static int warehouseOrderAndAllocatesReport = 14;//订单和调拨单报表信息
		public final static int warehouse_allocate_email_Global = 15;//含税和不含税仓通知仓库人员
		public final static int warehouse_allocate_emial_USCA =16;//仓库间调拨通知美国发货仓库人员
		public final static int scm_allocate_email = 17;//销售人员新建调出单的时候通知仓库人员
		public final static int erpWmsInventory_email_DE = 18;//erp和wms系统库存差异收件人德国
		public final static int logistics_SCM_email = 19;//产品装箱单全部提交后 提醒物流人员
		public final static int repeat_order_email = 20;//出入库单重复接收人员
		public final static int combine_sku_email = 21; //组合sku 全部入库时，发送邮件给仓库人员
		public final static int request_adopt_email = 22; //备货审核通过收邮件人员
		public final static int purchase_receipt_email = 23; //采购收货通过收邮件人员
		public final static int generate_detect_email = 24; //生成检测单通过收邮件人员
		public final static int deliveryfeedback_email = 25; //供应商反馈交期 修改通知PMC
		public final static int requestAdjustEmail = 26; //备货调整单 提交&审核通知PMC
		public final static int supplierTrialEmail = 27; //供应商配置提醒审核人邮件（初审人）
		public final static int supplierFinalEmail = 28; //供应商配置提醒审核人邮件（终审人）
		public final static int supplierItemTrialEmail = 29; //供应商与SKU关系配置提醒审核人邮件（初审人）
		public final static int supplierItemFinalEmail = 30; //供应商与SKU关系配置提醒审核人邮件（终审人）
		public final static int ItemVerifyEmail = 31; //产品认证信息过期配置提醒人
		public final static int TRANSFERREJECT = 32;//转仓单打回提醒人
		public final static int TRANSFERWAITOUTANDIN = 33;//转仓单待出库和申请提醒人
		public final static int PurchaseApplyEmail = 34; //供应商仓采购入库申请单邮件提醒人
		public final static int OUTMODEDPURCHASEREMIND = 35 ;//过时采购提醒
		public final static int PRESKUTOFORMAL = 37;//SKU转正
		public final static int remindToUpdateSkuMsg = 36 ;//sku包装信息未填写则发邮件提醒
		public final static int gyAllocateWarehouse = 38 ;//管易管理>调拨单列表 仓库收件人
		public final static int RMA_RATIO_WARNING_EMAIL = 39 ;//产品RMA比率预警邮件收件人
		public final static int PRESKUSUBMIT = 40 ;//预备SKU提交发送邮件类型
		public final static int RemindDidnItDoWACI = 43 ;//WA单未做CI的则发邮件提醒
		public final static int ECNBBCEMail = 44 ; //当超出
		public final static int CUSTOMSINFOAUDITEMAIL = 46 ; //报关单审核人

	}	
	//标记备货单是否虚拟采购
	public class RequestIsNotPurchase{
		public final static byte YES = 1;
		public final static byte NO = 0;
	}
	
	//标记备货单是否打回过新建状态
	public class RequestUPIs_Rollback{
		public final static byte UP1 = 1;//	1 表示打回新建状态时is_rollback_collection改为1的操作
		public final static byte UP2 = 2;//  2 表示为拆分时is_rollback_collection改为0的操作
		
		public final static byte YES = 1;//	1 表示打回新建状态时is_rollback_collection改为1
		public final static byte NO = 0;//	0 表示为拆分时is_rollback_collection改为0
	}
	
	//密码有效期
	public class PasswordEffectivetime{
		public final static int SYS_CREATE= 7;//系统创建有效期为7天
		public final static int MANUALLY = 90;//  2 表示为拆分时is_rollback_collection改为0的操作
	}
	public class QuestionStatus{
		public final static byte NEW = 0;
		public final static byte ANSWER = 1;
		public final static byte CANCEL = 2;
	}
	
	//采购单状态
	public class PrOrderStatus{
		public final static byte NEW = 1;//新建
		public final static byte PURCHASING = 2;//采购中
		public final static byte FINISH = 3;//采购完毕
		public final static byte CANCEL = 4;//作废
		public static final int ISSUED = 5;
	}
	
	public class MailTaskOrderStatus{
		public final static int NEW = 0;//新建
		public final static int APPROVE = 10;//审核通过
		public final static int BUILDING = 14;
		public final static int PROCESSING = 16;
		public final static int CANCEL = 20;//作废
		public final static int FAIL = 25;//邮件发送异常
		public final static int FINISH = 30;//完成
		//记录日志操作
		public final static int OP_NEW = 0;//新建
		public final static int OP_UPDATE = 1;//修改
		public final static int OP_DEL = 2;//删除
		public final static int OP_APPROVE = 10;//审核
		public final static int OP_UNAPPROVE = 15;//反审核
		public final static int OP_CANCEL = 20;//作废
		public final static int OP_PRCESSION = 30;//邮件处理
		public final static int OP_FINISH = 40;//send mail
	}
	public class MailClassIsTax{//是否含税
		public final static String  YES = "1";
		public final static String NO = "0";
	}
	public  final static int DECLREMONEY = 350;//报关费
	
	public class CiStencilId {
		public static final byte DE = 1;
		public static final byte US = 2;
		public static final byte FBA = 3;
	}
	public class BusinessprocessType {
		public static final int LOC_RECEIVE = 15;//收货仓
		public static final int LOC_DETECT = 16;//拣货仓
		public static final int LOC_PRODUCT = 17; //成品仓
		public static final int LOC_UNQUALIFIED = 5; //不良品
		public static final int LOC_SEMI_FINISHED =18 ;//半成品仓
		public static final int LOC_SAMPLE = 6 ;//送样仓
		public static final int LOC_CACHE = 19; //缓存仓（用于提货计划）
	}
	public class CompanyId{
		public static final int CNTAX = 7;
		public static final int CNNOTAZ = 8;
		public static final int CNNOTAXSZ=10;//深圳不含税公司
		public static final int HKNOTAX = 11;
	}
	public class AllocateWarehouseType{
		public static final int SCM_TO_ERP = 1;
		public static final int ERP_TO_SCM = 2;
	}
	public class isHaveBoxinfo{
		public static final int YES = 1;
		public static final int NO = 0;
	}
	public class WarehouseAllocateOrderType{
		public static final int Normal = 1;
		public static final int THREERD = 2;//3rd
		public static final int WMS = 3;
		public static final int OFFLINE = 4; //线下销售订单
	}
	
	public class ScmAllocateWarehouseStatus{
		public final static int NEW = 0;//新建
		public final static int WALT = 5;//待出库
		public final static int FINISH = 10;//已出库
		public final static int CANCEL = 20;//取消
	}
	//wms_temppickingrule
	public class WarehouseTemppickingRule{
		public final static int BOX = 1;//根据箱子拣货
		public final static int SKUQUANTITY = 2;//根据sku 数量拣货
		public final static int DEFAULT=0;//无规则的情况
	}
	public class RuleType{
		public final static int SHIPPINGORDER = 1;//出库单
		public final static int PICKINGORDER = 2;//拣货单
	}
	
	public class AmazonListingReview{
		public final static byte TASK_STATUS_NEW=0;
		public final static byte TASK_STATUS_PROCESSING=5;
		public final static byte TASK_STATUS_FINISH=10;
		
		public final static int TASK_LEVEL_NORMAL=1;
		public final static int TASK_LEVEL_URGENT=2;
		
		public final static int TASK_NOTE_RESOLUTION=1;
		public final static int TASK_NOTE_SUGGESTION=2;
		public final static int TASK_NOTE_COMPLAINT=3;
		
		public final static int TASK_SAVE_TYPE_DEFAULT=0;
		public final static int TASK_SAVE_TYPE_STATUS=1;
		public final static int TASK_SAVE_TYPE_OPERATOR=2;
		public final static int TASK_SAVE_TYPE_OFCALLS=3;
		public final static int TASK_SAVE_TYPE_OFEMAILS=4;
		public final static int TASK_SAVE_TYPE_ADDNOTE=5;
		public final static int TASK_SAVE_TYPE_COMPLAINT=6;
		public final static int TASK_SAVE_TYPE_CLIENT=7;
		public final static int TASK_SAVE_TYPE_ADDNOTE_NOTICE=8;
		public final static int TASK_SAVE_TYPE_REMARK=9;
	}
	
	public class AmazonListingPhone{
		public final static int TASK_SAVETYPE_DEFAULT = 0;
		public final static int TASK_SAVETYPE_OPERATOR = 1;
		public final static int TASK_SAVETYPE_ANSWER = 2;
		public final static int TASK_SAVETYPE_ADDNOTE = 3;
		public final static int TASK_SAVETYPE_CLIENT = 4;
		public final static int TASK_SAVETYOE_REOPEN = 5;
		public final static int TASK_SAVETYOE_CLOSE = 6;
	}
	public class AmazonListingPhoneTaskCallCode{
		public final static int CUSTOMER_ANSWERED=1;
		public final static int AGREED_SUPER =10;//agreed to join Super User Program
		public final static int MAKET_REVIEW = 11;// Customer will make a review(with personal email)
		public final static int CUSTOMER_REVIEW = 32;//Customer will make a review(but WITHOUT personal email)
		public final static int DECLINED_SUPER =12;  //- Declined Super User Program
		public final static int REQUESTED_UNSUBSCRIBE=13;//- Requested Unsubscribe / DNC
		public final static int NO_ANSWER=2;//No Answer:
		public final static int LEAVE_VOICEMAIL=21;//- Did Not leave Voicemail
		public final static int VOICEMAIL_UNAVAILABLE=22;//- Voicemail Unavailable
		public final static int WRONG_INVALIDE_NUMBER=23;// - Invalid Number
		public final static int NUMBER_DISCONNECTED=24;//- Number disconnected / No Longer in Service

		public final static int FOLLOW = 3;//Error:
		public final static int  FOLLOW_CUSTOMER = 31;//- Wrong Number (someone answered call)
		

	}
	public class StockInSimulate{
		public final static int Yes=1;
		public final static int No =0;
	}
	public class isShipment{
		public final static int No=1;
		public final static int Yes =0;
	}
	public class detectDetailType{
		public final static int PURCHASEDETECT = 0;//采购
		public final static int OUTSOURCEDETECT = 1;//委外
		public final static int REDDETECT = 3;//红单
	}
	public class detectStatus{
		public final static int NOTDETECT = 0;//未检测
		public final static int detecting = 2;//检测中
		public final static int detect = 1;//检测完
		public final static int delete =-1;//删除
	}
	//检测
	public class detetailStatus{
		public final static int normal = 0;//正常品
		public final static int defective = 3;//不良品
		public final static int ALLSTOCK = 2;//已入库
	}
	public class detectStockStatus{
		public final static int NOTSTOCK = 0;//未入库
		public final static int PARTSTOCK = 3;//部分入库
		public final static int ALLSTOCK = 1;//已入库
	}
	public class packageLogType{
		public final static int changeBox = 1;
		public final static int submitbox = 2;
		public final static int reject = 3;
		public final static int ship = 4; 
		public final static int updateCI = 5;
		public final static int print = 6;
		public final static int update = 7;
	}
	public class receivingOrderFromType{
		public final static int autoCreate = 1;
		public final static int selfCreate = 0;
	}
	public class invAdjustmentType{
		public final static int INVENTORYPROFIT = 1;//盘盈
		public final static int INVENTORYSHORTAGES = 2;//盘亏
	}
	
	public class commercialInvoiceStatus{
		public final static byte NEW = 0;//新建
		public final static byte Submit = 10;//已提交
		public final static byte Audited=20;//已审核
		
		public static final byte FINISHED=30;//完成
	}
	
	public class orderInvoiceStatus{
		public final static byte NEW = 1;//新建
		public final static byte Submit = 2;//提交
		public final static byte Cancel = 3;//打回
		public final static byte Invoice=4;//开票
		public final static byte Delete=5;//删除
	}
	
	public class CILogType{
		public final static int Settle = 1;//结算
		public final static int Fightback = 2;//打回
		public final static byte Audited=3;//审核
		public final static byte UnAudited=4;//反审核
		public static final byte FINISHED=5;//完成
		public static final byte SUBMIT = 6 ;//提交 modified by zhong_yong 增加一个提交操作 2015/01/15
		public static final byte COUNTFREIGHT = 7;//shipment生成运费 modified by zhong_yong 2015/04/10
		public static final byte COUNTFREIGHTBYHAND = 8;//手动平摊运费 modified by zhong_yong 2015/04/10
	}
	public class isUrgen{//是否加急
		public final static int Urgen = 1;//加急
		public final static int Normal = 0;//正常
	}
	public class InvoicingOrderType{
		public final static int SALES_ORDER=18;//销售订单出库
		public final static int INNER_TRANSFORM_IN=27;//内部交易入库
		public final static int INNER_TRANSFORM_OUT=28;//内部交易出库
		public final static int RMA_RESTOCK=23;//rma 入库
		public final static int WMS_OUT=29;
		public final static int WMS_IN=30;
		public final static int SHIPMENT_IN_ONROAD=20;
		public final static int SHIPMENT_OUT_ONROAD=21;
		public final static int SHIPMENT_IN_RECEIVED=22;
		public final static int SHIPMENT_ONROAD_MISS=26;
		public final static int WHALLOCATEOUT=19;
		public final static int SCM_SALES_IN=1;
		public final static int SCM_WEIWAI_IN=3;
		public final static int SCM_ZHUZHUANG_IN=4;
		public final static int SCM_BULIANG_IN=5;
		public final static int SCM_WAIGOU_IN=6;
		public final static int SCM_KEHUTUI_IN=7;
		public final static int SCM_ZENGPING_IN=8;//
		public final static int SCM_RMANEW_IN=9;
		public final static int SCM_RMAUSED_IN=10;
		public final static int SCM_ZHENGPI_IN=11;
		public final static int SCM_HONG_IN=2;
		public final static int SCM_SALES_OUT=12;
		public final static int SCM_WEIWAI_OUT=13;
		public final static int SCM_ZHUZHUANG_OUT=14;
		public final static int SCM_WAIGOU_OUT=15;
		public final static int SCM_COUNT_IN=16;
		public final static int SCM_COUNT_OUT=17;
		public final static int WMS_COUNT_IN=31;
		public final static int WMS_COUNT_OUT=32;
		public final static int ERP_COUNT_IN=24;
		public final static int ERP_COUNT_OUT=25;
		public final static int FBA_RETURN=38;  //3RD Return单
		public final static int FBA_IN_ONROAD=39; //3RD Return单在途入
		public final static int FBA_OUT_ONROAD=40; //3RD Return单在途出
		public final static int FBA_IN_RECEIVED=41; //3RD Return单在库入
		public final static int transferOut = 42;//转仓出
		public final static int transferin = 43;//转仓入
		public final static int scmTransferOut = 44;
		public final static int scmTransferIn = 45;
		public final static int gyAllocateOut = 46;
		public final static int gyAllocateIn = 47;
	}
	public class SysType{
		public final static int erp = 1;
		public final static int scm = 2;
		public final static int wms = 3;
		public final static int fba = 4;
	}
	public class InvoicingDataServiceShipmentType{
		public final static int Onroad = 1;
		public final static int Received = 2;
		public final static int ignoreReceived = 3;
	} 
	
	public class Resulttype {
		public final static byte Normal = 0;	
		public final static byte ERorderno = 1;	
		public final static byte ERsys = 2;
		public final static byte RepeatSN = 3;
		public final static byte ERSKU = 4;
	}
	
	//是否带电池类型
	public class batterytype{
		public final static byte battery_No  = 0; //无电池
		public final static byte battery_lithium = 1; //纯锂离子电池产品
		public final static byte battery_lithium_Removable  = 2; //带可拆锂离子电池产品
		public final static byte battery_lithium_NotRemovable = 3; //带不可拆锂离子电池产品
		public final static byte battery_metal = 4; //纯锂金属电池产品
		public final static byte battery_metal_Removable = 5; //带可拆锂金属电池产品
		public final static byte battery_metal_NotRemovable = 6; //带不可拆锂金属电池产品
		public final static byte battery_dry = 7; //干电池
	}
	public class amazonReviewTaskStatus{
		public final static byte New = 0;
		public final static byte Open = 5;
		public final static byte Pass = 10;
		public final static byte Approved = 11;
		public final static byte Rejected = 12;
		public final static byte No_Response = 13;
		public final static byte Pending_Delete = 14;
		public final static byte Deleted = 15;
		/*把现有的Approved删除，增加Pending alter和Altered,
		抓到review后，发现Final star和Curreny Star一致，则修改状态为Altered.
		初始化时候把所有的approve转为pending alter.*/
		public final static byte Altered = 16;
	}
	public class amazonPhoneTaskStatus{
		public final static int New = 0;
		public final static int Open = 5;
		public final static int Pass = 10;
		public final static int Approved = 11;
		public final static int Rejected = 12;
		public final static int No_Response = 13;
		public final static int CLOSE = 14;
		public final static int FOLLOW_UP =15;

	}
	
	public class AmazonListingTaskNoteSourceType{
		public final static int REVIEW_TASK =0;
		public final static int PHONE_TASK =1;
	}
	
	public class skuBrandDesc{
		public final static int RAPOWER = 1005;
		public final static int TAOTRONICS =1002;
		public final static int HOOTOO =1003;
	}
	public class requestAdjustStatus{ //备货调整单状态
		public final static byte NEW = 1;   //新建 
		public final static byte SUBMITED=2; //提交待审核
		public final static byte AUDITED =3; //已审核
		public final static byte DELETED =4;  //已删除
	}
	public class requestAdjustLogType{ //备货调整单日志类型
		public final static int ADDNOTE = 1;  //add note
		public final static int PASS=2;   //审核通过
		public final static int NOPASS =3; //审核不通过
		public final static int COMQTY=4; //修改组装单数量
		public final static int DEL=5; //逻辑删除日志
	}
	public class itemVerifyLogOPType{
		public final static int ADD=0;//新增
		public final static int update =1;//修改
		public final static int delete =2;//删除
	}
	public class itemVerifyDelete{
		public final static byte  normal=0;//正常数据
		public final static byte  log =1;//日志
		public final static byte delete =2;//已删除
	}
	public class allocateAttachmentOrigin_type{
		public final static byte FAQ = 3; 
		public final static byte ITEMVERIFY = 5;
	}
	public class RsStockBasePriceBizType{
		public final static int restock = 1;//shipent 入库
		public final static int mc = 2;//销售订单
	}
	//供应商状态
	public class SupplierStatus{
		public final static byte NEWS = 1;  //新建
		public final static byte TRIAL = 2;  //初级审核
		public final static byte FINALS = 3;  //终级审核
		public final static byte APPROVED = 4;  //已审核
	}
	
	//供应商日志状态
	public class supplierOperationType{
		public final static byte NEWS = 1;  //新建供应商
		public final static byte SUBMITS = 2;  //提交供应商
		public final static byte TRIALS = 3;  //初审供应商
		public final static byte FINALS = 4;  //终审供应商
		public final static byte DELETES = 5;  //删除供应商图片
		public final static byte UPNAME = 6;  //编辑供应商名称
		public final static byte SAVEUPDATE = 7;  //保存修改
	}
	
	//银行列表（是否含税）
	public class supplierIstaxType{
		public final static String NOTAX = "不含税";
		public final static String TAX = "含税";
		public final static String USDACCOUNT = "美金账号";
	}
	public class incoivingExportType{
		public final static int stock=1;//在库
		public final static int road=2;//在途
	}
	
	//导入物流账单
	public class logisticsBillsLogResultType{
		public final static int news=1;//新增
		public final static int over=2;//覆盖
		public final static int didnotmatch=3;//未匹配
		public final static int dataerror=4;//数据错误
	}
	
	//邮件任务订单
	public class mailTaskOrderSkustatus{
		public final static int THEREISNO=1;//无
		public final static int THEREARE=2;//有
	}
	
	//结算账单数据状态
	public class AmazonPaymentStatus{
		public final static byte CREATED=0;
		public final static byte PROCESSED=1;
		public final static byte SYNC=2;
		public final static byte COMPLETED_FOR_BILL_REPORT=3;
	}
	
	public class AmazonPaymentType{
		public final static byte ORDER=1;
		public final static byte RMA=2;
		public final static byte OTHER=3;
		public final static byte REPALCE=4;
		public final static byte SAMPLE=5;
	}
	//add by zhong_yong 来料检验报告打印格式修改-增加处理结果-支持批退 2015/06/23
	public class DetectDetailTestResult{
		public final static int PASS=1;//pass
		public final static int RETURNNOTGOOD=2;//只退不合格数
		public final static int RETURNALL=3;//批退
	}
	
	public class BomCombineUnit{
		public final static int  sunvalley =2;
		public final static int supplier = 1;
	}
	public class BomPurPropertity{
		public final static int PartyB=2;//乙方
		public final static int firstParty =1;// 甲方
	}
	public class Vendor{
		public static final int SUNVALLEY=827;//vendor=sunvalley
	}
	
	//采购入库申请单
	public static class PurchaseApplyStatus{
		public static final int NEW = 1;
		public static final int PINSTORAGED = 2;
		public static final int PINSTORAGEY = 3;
	}
	
	//销售计划状态状态
	public class PlanSalesStatus{
		public final static byte NEWS = 1;  //
		public final static byte TRIAL = 2;  //待初审
		public final static byte FINALS = 3;  //待终审
		public final static byte APPROVED = 4;  //待备货
		public final static byte ACCEPTED = 5;  //已受理
		public final static byte SUBSTOCKUP  = 6;  //已提交备货
		public final static byte STOCKUP = 7;  //已备货
	}
	
	//销售计划操作类型
	public class PlanSalesType{
		public final static byte SAVEOPERATION = 1;  //保存
		public final static byte SUBMITOPERATION = 2;  //提交
		public final static byte TRIALOPERATION = 3;  //初审
		public final static byte FINALSOPERATION = 4;  //终审
		public final static byte BACKOPERATION  = 5;  //打回
		public final static byte DELOPERATION = 6;  //删除
		public final static byte ACCOPESRATION = 7;  //自动受理
		public final static byte ACCOPERATION = 8;  //受理
		public final static byte SUBOPERATION = 9;  //提交备货
		public final static byte STOCKUPOPERATION = 10;  //审核备货
		public final static byte BACKACCOPERATION = 11;  //打回受理
		public final static byte CANCELACCOPERATION = 12;  //取消受理
	}
	
	//销售计划审核操作类型
	public class PSAuditType{
		public final static byte YES = 1;  //通过
		public final static byte NO = 2;  //不通过
	}
	
	//公司
	public class ScmCompanyStatus{
		public final static byte YES = 0;  //可用
		public final static byte NO = 1;  //禁用
	}
	
	//仓库
	public class ScmWarehouseId{
		public final static byte US_CA = 1;
		public final static byte CN_Global_Baoan = 2;
		public final static byte DE_Hamburg = 4;
		public final static byte Sunvalley_Supplier = 39;
	}
	
	//是否含税
	public class ScmWHIstax{
		public final static byte YES = 1;  //含税
		public final static byte NO = 0;  //不含税
	}
	
	//仓库（中、海外）
	public class ScmWHCode{
		public final static String CN = "CN";  //中仓
		public final static String US = "US";  //美仓
		public final static String DE = "DE";  //德仓
	}
	
	//采购订单日志类型
	public class poLogType{
		public final static int PRICEUPDATE=1;//单价更新
		public final static int STATECHANGES=2;//状态变更
		public final static int SAVEPO=3;//保存
		public final static int ENDPURCHASE=4;//结束采购
		public final static int OPENTHE=5;//重新打开
		public final static int ISSUED=6;//下达
		public final static int CREATES=7;//创建
		public final static int CANCEL=8;//取消采购订单
	}
	
	//仓库（中、海外）
	public class ScmWHid{
		public final static int US = 1;  //美仓
		public final static int CN = 2;  //中仓
		public final static int DE = 4;  //德仓
	}
	public class TaskType{
		public static final int requestPlan = 1;
		public static final int salesPlan = 2;    //年度目标计划
		public static final int organization = 4;//组织架构任务权限
		public static final int orderEmail = 3;
	}

	public class RequestSType{
		public static final byte FREEZE = 10;//冻结
		public static final byte PURCHASE = 21;//待采购
		public static final byte BEFORE_AUDIT = 20;//待审核
	}
	
	public class DelierySla{
		public static final int Expedited = 1;
		public static final int Priority = 2;
		public static final int Standard = 3;
	}
	
	public class Declaration{
		public static final int NEW = 0;    //新建
		public static final int AUDITED = 1;//已审核
	}
	
		//内外销供应商
	public class regionType{
		public static final int DomesticSales = 1; //内销
		public static final int ExportSales = 2;  //外销
	}
	//报关品名状态
	public class customCategoryNameStatus{
		public static final int enable = 1;  //启用
		public static final int disable = 2;  //禁用
	}
	
	public static final int EXCLE_EXPORT_NUMBER = 60000; 
	
	//付款方式
	public class paymentmethodType{
		public static final int type19 = 19;  //预付款30%，余款于供应商发货前付清
		public static final int type20 = 20;  //预付款30%，余款于货到验收入库后当天付清
		public static final int type10 = 10;  //款到发货
		public static final int type27 = 27;  //货到验收合格后当天付款
		public static final int type29 = 29;  //当月结，另加15天付款期内付清
		public static final int type31 = 31;  //月结30天，次月15日前付款
		public static final int type32 = 32;  //月结60天，次月15日前付款
		public static final int type33 = 33;  //月结90天，次月15日前付款
		public static final int type36 = 36;  //预付款50%，余款于供应商发货后30天付清
		public static final int type12 = 12;//月结60
	}
	
	public class combineUnitType{
		public static final int supplierZ = 1;  //供应商组装
		public static final int sunvalleyZ = 2;  //SUNVALLEY组装
		public static final int noZ = 3;  //不需要组装
	}
	
	public class purchasePropertyType{
		public static final int partyA = 1;  //甲方提供
		public static final int partyB = 2;  //乙方提供
	}
	
	public class prOrderStatusType{
		public static final int New = 1;  //新建
		public static final int Purchasing = 2;  //采购中
		public static final int PurchaseFinished = 3;  //采购完毕
		public static final int Invalid = 4;  //作废
		public static final int OrderSentToSupplier = 5;  //订单已下达
	}
	
	public class AmazonProductLogType {
		public static final int ProductName = 1;
		public static final int Feature = 2;
	}
	
	public class gyAllocateOrderType {
		public static final int invin = 1;  //调入
		public static final int invout = 2;  //调出
	}
	
	public class BrandName {
		public static final String TaoTronics = "TaoTronics";
		public static final String HooToo = "HooToo";
		public static final String USpicy = "USpicy";
		public static final String RAVPower = "RAVPower";
		public static final String Anjou = "Anjou";
		public static final String VAVA = "VAVA";
	}
	
	public class ListingSyncStatus{
		public static final int TO_SUBMIT = 0; //待提交
		public static final int SYNCHRONIZATION_PROCEDURE = 1; //同步中
		public static final int SYNCHRONIZED = 2; //已同步
		public static final int SYNCHRONIZED_FAILURE = 3; //同步失败 
		public static final int CANCELED = 4; //取消
		public static final int TO_GROUP_AUDIT = 5; //待组长审核
		public static final int TO_DEPT_AUDIT = 6; //待部门经理审核
		
		
		
		public static final byte IS_NOT_LATEST = 0;
		public static final byte IS_LATEST = 1; 
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
	
	public class ProductTypeStatus{
		public static final int proStatus=1; //有效
		public static final int prStatus=0;  //无效
	}
	/**
	 *  用户状态
	 * */
	public class BuyerStatus{
		public static final int Normal=0;//正常
		public static final int BlackList=1;//列入黑名单
		public static final int Unsubscription=2;//退订
	}
	
	/**
	 *  配单状态
	 * */
	public class GadgetStatus{
		public static final int NEW=0;//新建
		public static final int AUDITED=1;//已审核
		public static final int DECLARATION=2;//申报中
		public static final int Declared=3;//已申报
	}
	
	/**
	 * sku类型
	 * @author stone.zhuang
	 */
	public class SkuType{
		public static final int SKU=1;//sku
		public static final int PRE_SKU=2;//预备sku
	}
	
	public class ItemMappingType{
		public static final int anrule=1;//安规
		public static final int country=2;//国家
	}
	public class ItemMappingOrigin{
		public static final int sku=1;//新建
		public static final int presku=2;//预备sku
	}
	
	public class ItemBaseDataType{
		public static final int COLOR=1;//颜色
		public static final int ANRULE=2;//安规
		public static final int TRANSPORT=3;//预备SKU运输方式
	}
	
	public class CustomOrderStatus{
		public static final int  NEW = 0;     //新建
		public static final int  SUBMIT = 1;     //提交
		public static final int  FIRSTAUDIT = 2;   //初审
		public static final int  FINALAUDIT = 3;   //终审
		public static final int  Storage = 4;   //添加入库单
	}
	
	public class OrgnizationLevelId{
		public static final int  COMPANY = 1;//公司
		public static final int  DEPARTMENT = 2;//部门
		public static final int  GROUP = 3;   //组
		public static final int  GROUP_COUNTRY = 4;   //组+国家
		public static final int  SKU_COUNTRY = 5;   //sku+国家
	}
	
	public class Mc{
		public static final double COEFFICIENT = 1.03;//MC系数
	}
	
	public class PostPriceResult{
		public static final String EXCEPTION ="EXCEPTION:";
		public static final String SUBMITTED ="_SUBMITTED_";
		public static final String DONE ="_DONE_";
	}
	
	public class AmountType{
		public static final String ITEM_PRICE = "ItemPrice";
		public static final String PROMOTION = "Promotion";
		public static final String ITEM_FEES = "ItemFees";
		public static final String DIRECTPAYMENTTYPE="DirectPaymentType";
		public static final String SHIPMENTFEES="ShipmentFees";
		public static final String ORDERFEES="OrderFees";
		public static final String OTHER_FEES = "OtherFees";
		
	}
	
	public class ReportFeeName{
		public static final String SALES_AMOUNT = "sales_amount";
		public static final String SHIPPING_AMOUNT = "shipping_amount";
		public static final String SALES_DISCOUNT = "sales_discount";
		public static final String REFUND_AMOUNT = "refund_amount";
		public static final String OTHER_AMOUNT = "other_amount";
		public static final String SHIPPING_FEE = "shipping_fee";
		public static final String FVF = "fvf";
		public static final String LD_FEE = "ld_fee";
		public static final String AD_FEE = "ad_fee";
		public static final String SAMPLE_FEE = "sample_fee";
		public static final String DISCOUNT_VAT = "discount_vat";
	}
	
	public class AmountDescription{
		public static final String PRINCIPAL = "Principal";
		public static final String TAX = "Tax";
		public static final String SHIPPING = "Shipping";
		public static final String HANDLING = "Handling";
		public static final String INSURANCE = "Insurance";
		public static final String COMMISSION = "Commission";
		public static final String SHIPPING_FEE = "ShippingFee";
		public static final String MC = "MC";
		public static final String SALES_VAT = "SalesVAT";
		public static final String SALES_TAX = "SalesTax";
		public static final String SHIPPING_TAX = "ShippingTax";
		public static final String PATENT_FEE = "PatentFee";
		public static final String DISCOUNT_VAT = "DiscountVAT";
		public static final String REFUND_VAT = "RefundVAT";
		public static final String SHIPPMENT_FEE_VAT = "ShippingFeeVAT";
		public static final String FVF_VAT = "fvfVAT";
		public static final String LD_FEE_VAT = "LdFeeVAT";
		public static final String AD_FEE_VAT = "AdFeeVAT";
		public static final String SAMPLE_FEE_VAT = "SampleFeeVAT";
	}
	
	
	public class ScmRequestStatus{
		public static final byte NEW = 0;//新建
		public static final byte SUBMITED = 20;//提交待审核
		public static final byte PURCHASE = 21;//待采购
		public static final byte PURCHASING = 22;//采购中
		public static final byte END_PURCHASES = 23;//结束采购 
		public static final byte FINISH = 30;//完成
	}
	
	public class IsChildSku{
		public static final int ZERO = 0;//表示正常sku
		public static final int ONE= 1;//表示子sku
	}
	
	public class ExportOrder{
		public static final byte YES = 1;   //线下出口订单
		public static final byte NO= 0;     //正常订单
	}
	
	public class PickupSalesPlanStatus{
		public static final byte NEW = 1;    //新建
		public static final byte AUDITED = 2;//已审核
		public static final byte PLAN = 3;//已计划
		public static final byte CLOSE = 5;//关闭
	}
	
	
	public static class PickUpOperType{
		public final static Integer NEW = 1;    //新建
		public final static Integer UPDATE = 2;    //更新
		public final static Integer DELETE = 3;    //删除
	}

	public static class OrgPrivilegeTaskType{
		public final static int SAVE_USER_AUTH = 1;    //保存用户节点权限
		public final static int REMOVE_USER_AUTH = 2;    //删除用户节点权限
		public final static int SAVE_ORGID = 3;    //导入model
		public final static int SAVE_MODEL = 4;    //model添加sku
		public final static int REMOVE_ORG_AUTH = 5;    //删除org
		public final static int MODIFY_ORG = 6;    //组织架构调整(添加/删除节点)
	}
}
