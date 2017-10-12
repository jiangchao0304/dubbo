package com.sunvalley.erp.product.service;

import com.sunvalley.erp.product.dao.MarketAccountMapper;
import com.sunvalley.erp.product.model.MarketAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class RpcServerStore {
	
//	'4'	=> API_URL_TEK,
//	'5'	=> API_URL_US,
//	'9'	=> API_URL_PAPATEK,
//	'14'	=> API_URL_ULOOKSTORE,
//	'17'	=> API_URL_USADAPTER,
//	'30'	=> API_URL_LCDHT,
//	'32'	=> API_URL_OLCD
	
//	define('API_URL_TEK', 'http://www.sunvalleytek.com/server.php');
//	define('API_URL_NEW_TEK', 'http://new.sunvalleytek.com/API/erpapi/server.asp');
//	define('API_URL_US', 'http://www.sunvalleyus.com/API/erpapi/server.asp');
//	define('API_URL_BABATEK', 'http://www.babatek.com/server.php');
//	define('API_URL_ULOOKSTORE', 'http://www.hootoo.com/server.php');
//	define('API_URL_PAPATEK', 'http://www.papatek.com/API/erpapi/server.asp');
//	define('API_URL_USADAPTER', 'http://www.usadapter.com/API/erpapi/server.asp');

	@Autowired
	private MarketAccountMapper marketAccountMapper;

	private static RpcServerStore __instance;
	private final static String default_img_url="https://image.hootoo.com/"; //"http://pic.shangfun.net/";
	
	
	private static Map<Integer,String> __store=new HashMap<Integer,String>();
	private static Map<Integer,String> __imgstore=new HashMap<Integer,String>();
	
	//这里使用单态模式而且同时定义一个Map为静态变量。
	//主要是使用单态模式与静态对象的特性。使所有存储到静态变量中的数据在该实例周期内被存放于内存。提高效率。
	private RpcServerStore(){
		load();		
	}
	
	public static RpcServerStore getInstance(){
		if(__instance==null){
			__instance=new RpcServerStore();
		}
		return __instance;
	}
	
	public String getRpcServer(int seller_id){
		if(__store==null){
			reload();
		}
		if(__store.containsKey(seller_id)){
			return __store.get(seller_id);
		}
		if(__store.containsKey(0)){
			return __store.get(0);
		}
		return null;
	}
	
	
	public String getImgUrl(int seller_id){
		if(__imgstore==null){
			reload();
		}
		if(__imgstore.containsKey(seller_id)){
			return __imgstore.get(seller_id);
		}
		if(__imgstore.containsKey(0)){
			return __imgstore.get(0);
		}
		return default_img_url;
	}
	
	
	public List<Integer> getAllSeller(){
		if(__store!=null&&!__store.isEmpty()){
			return  new ArrayList<Integer>(__store.keySet()); 
		}
		return null;
	}
	
	public void reload(){
		load();
	}
	
	
	
	//TODO:这里只是临时写入默认值，功能完毕后把内容提到配置或者数据库，应用启动是自动加载进来。
	private void load(){

//		__store.put(4, "http://www.sunvalleytek.com/server.php");
//		__store.put(5, "http://new.sunvalleytek.com/API/erpapi/server.asp");
//		__store.put(9, "http://www.sunvalleyus.com/API/erpapi/server.asp");
//		__store.put(14, "http://www.babatek.com/server.php");
//		__store.put(17, "http://www.hootoo.com/server.php");
//		__store.put(30, "http://www.papatek.com/API/erpapi/server.asp");
//		__store.put(32, "http://www.usadapter.com/API/erpapi/server.asp");
		//IMarketAccountDao marketAccountDao=(IMarketAccountDao)Env.getBean("marketAccountDao");
		
		List<MarketAccount> list = marketAccountMapper.selectByExample(null);
		String httpreg="http://([A-Za-z0-9-]+\\.)+[A-Za-z0-9-]+(/[A-Za-z0-9- ./?%&=]||[:A-Za-z0-9- ./?%&=]*)?";
		String httpsreg="https://([A-Za-z0-9-]+\\.)+[A-Za-z0-9-]+(/[A-Za-z0-9- ./?%&=]||[:A-Za-z0-9- ./?%&=]*)?";
		Map<Integer,String> __store_pri=new HashMap<Integer,String>();
		Map<Integer,String> __imgstore_pri=new HashMap<Integer,String>();
		if(list!=null&&!list.isEmpty()){
			for(MarketAccount marketAccount:list){
				if(marketAccount.getRpcUrl()!=null&&!marketAccount.getRpcUrl().trim().equals("")){
					if(marketAccount.getRpcUrl().trim().toLowerCase().matches(httpreg)||marketAccount.getRpcUrl().trim().toLowerCase().matches(httpsreg)||marketAccount.getRpcUrl().trim().startsWith("http://localhost")){
						__store_pri.put(marketAccount.getMaid(), marketAccount.getRpcUrl());
					}
				}
				if((marketAccount.getImgUrl()!=null&&!marketAccount.getImgUrl().trim().equals(""))){
					if(marketAccount.getImgUrl().trim().toLowerCase().matches(httpreg)||marketAccount.getImgUrl().trim().toLowerCase().matches(httpsreg)||marketAccount.getImgUrl().trim().startsWith("http://localhost")){							
						__imgstore_pri.put(marketAccount.getMaid(), marketAccount.getImgUrl());
					}
				}
			}			
		}
		__store.clear();
		__imgstore.clear();
		if(!__imgstore_pri.isEmpty()){
			__imgstore.putAll(__imgstore_pri);
		}
		if(!__store_pri.isEmpty()){
			__store.putAll(__store_pri);
		}
//		if(__store.keySet()!=null&&__store.keySet().size()>0){
//			for(Integer i:__store.keySet()){
//				System.out.println(i+"="+__store.get(i));
//			}
//		}
	}

}
