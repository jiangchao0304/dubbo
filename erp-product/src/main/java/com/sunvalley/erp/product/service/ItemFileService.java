/*
* Copyright (c) 2017 sunvalley. All Rights Reserved.
*/
package com.sunvalley.erp.product.service;

import com.sunvalley.erp.common.constants.Constants.SystemProfile_Category;
import com.sunvalley.erp.product.dao.ItemFileMapper;
import com.sunvalley.erp.product.dao.SystemprofileMapper;
import com.sunvalley.erp.product.daoEX.VideoExMapper;
import com.sunvalley.erp.product.model.ItemFile;
import com.sunvalley.erp.product.model.ItemFileExample;
import com.sunvalley.erp.product.model.Systemprofile;
import com.sunvalley.erp.product.model.SystemprofileExample;
import com.sunvalley.erp.to.product.ItemFileTO;
import com.sunvalley.erp.to.product.ItemVideoTO;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.imageio.ImageIO;

/**
 * 类或方法的功能描述 :TODO
 *
 * @Author: douglas.jiang
 * @Date: 2017-10-10 17:50
 */
@Service
public class ItemFileService {

    @Autowired
    private  ItemFileMapper itemFileMapper;

    @Autowired
    private VideoExMapper videoExMapper;
    @Autowired
    private SystemprofileMapper systemprofileMapper;
    
	private String fileName;
    private String fPath="";
    
	private static final String common = "common";
	
	private String fileSeparator = System.getProperty("file.separator");;
  

    public List<ItemFileTO> listItemFile(int skuId){

        List<ItemFileTO> result = new ArrayList<>();
        ItemFileExample itemFileExample = new ItemFileExample();
        itemFileExample.createCriteria().andSkuIdEqualTo(skuId);
        List<ItemFile> itemFileList =  itemFileMapper.selectByExample(itemFileExample);

        for (ItemFile itemFile : itemFileList) {
            ItemFileTO dto = new ItemFileTO();
            try {
                BeanUtils.copyProperties(dto,itemFile);
            }catch (Exception ex){

            }

            result.add(dto);
        }

        return  result;
    }


    public List<ItemVideoTO> listItemVideo(int skuId){
        List<ItemVideoTO> result = videoExMapper.selectBySkuId(skuId);
        return  result;
    }
    
    public ItemFileTO listItemImages(String sku,int sellerId){
    	fPath  = this.initPath();
    	List<String> categoryList = getCategoryList();
    	String sku_33 = getSku(sku);
    	File dir = new File(fPath);
    	File[] files = dir.listFiles();
    	List<String[]> bigpiclist = new ArrayList<String[]>();
		List<String[]> gypiclist = new ArrayList<String[]>();
		List<String[]> gywmpiclist = new ArrayList<String[]>();
		List<String[]> rppicslist = new ArrayList<String[]>();
		int l = files.length;
		List<Integer> bigpicfolderlist = new ArrayList<Integer>();
		List<Integer> gypicfolderlist = new ArrayList<Integer>();
		List<Integer> rppicsfolderlist = new ArrayList<Integer>();
		ItemFileTO itemFileTO = new ItemFileTO();
		Map<String,List<String[]>> listMap = itemFileTO.getListMap();
		Map<String,List<Integer>> indexMap = itemFileTO.getIndexMap();
		for (int i = 0; i < l; i++) {
			if (files[i].isDirectory()) {
				String foldername = files[i].getName();
				if(foldername.contains("big_pic")) { // big_pic类型
					String s = foldername.substring(7, foldername.length());
					int foldernum = s.equals("")?0:Integer.parseInt(s);
					bigpicfolderlist.add(foldernum);
				}
				if(foldername.contains("gy")) { // gy类型
					int foldernum = Integer.parseInt(foldername.substring(2, foldername.length()));
					gypicfolderlist.add(foldernum);
				}
				if(foldername.contains("rp")) { // rp类型
					String s = foldername.substring(2, foldername.length());
					int foldernum = s.equals("")?0:Integer.parseInt(s);
					rppicsfolderlist.add(foldernum);
				}
		    	if(null != categoryList ){
		    		for (String  cag : categoryList){
		    			if(foldername.contains(cag)) {
		    				if ( null == indexMap.get(cag) ){
		    					 List <Integer>templist = new ArrayList<Integer>(1);
		    					 indexMap.put(cag, templist);
		    				}	
		    				String s  = foldername.substring(2, foldername.length());
		    				if (s.length()<=2 ) {
		    					if ( s.equals("") || (48<= s.charAt(0)&& s.charAt(0) <= 57)) {
								int foldernum = s.equals("")?0:Integer.parseInt(s);
								(indexMap.get(cag)).add(foldernum);
		    					}
		    				}
		    			}	
		    		}
		    	}				
				
			}
		}
		// 排序
		Collections.sort(bigpicfolderlist);
		Collections.sort(gypicfolderlist);
		Collections.sort(rppicsfolderlist);
		Set<String> set = indexMap.keySet();
		for(String key : set){
			List <Integer>catgfolderList = indexMap.get(key); 
			Collections.sort(catgfolderList);
			for(int type : catgfolderList) { // 生成key路径
				File file = new File(getSmallPath()+sku_33+"$"+key+(type>0?type:"")+".jpg");
				if(file.exists()) {
					String[] str = new String[5];
					str[0] = key+(type>0?type:"");
					str[1] = sku_33+"$"+str[0];					
					str[2] = getSmallImgUrl(sku, str[0]);
					str[3] = getImgUrl(sku, str[0], sellerId);
					str[4] = getOBImgUrl(sku,key,""+(type>0?type:"0"), sellerId);
					if (null == listMap.get(key)) {
						listMap.put(key, new ArrayList<String[]>(1));
					}
					listMap.get(key).add(str);
				}
			}			
		}	
		
		for(int type : bigpicfolderlist) { // 生成big_pic路径
			File file = new File(getSmallPath()+sku_33+"$big_pic"+(type>0?type:"")+".jpg");
			if(file.exists()) {
				String[] str = new String[5];
				str[0] = "big_pic"+(type>0?type:"");
				str[1] = sku_33+"$"+str[0];
				str[2] = getSmallImgUrl(sku, str[0]);
				str[3] = getImgUrl(sku, str[0], sellerId);
				str[4] = getOBImgUrl(sku, ""+(type>0?type:"0"), sellerId);
				bigpiclist.add(str);
			}
		}
		for(int type : gypicfolderlist) { // 生成gy路径
			File file = new File(getSmallPath()+sku_33+"$gy"+type+".jpg");
			if(file.exists()) {
				String[] str = new String[4];
				str[0] = "gy"+type;
				str[1] = sku_33+"$"+str[0];
				str[2] = getSmallImgUrl(sku, str[0]);
				str[3] = getImgUrl(sku, str[0], sellerId);
				if(type <= 7)
					gypiclist.add(str);
				else 
					gywmpiclist.add(str);
			}
		}
		for(int type : rppicsfolderlist) { // 生成rp路径
			File file = new File(getSmallPath()+sku_33+"$rp"+(type>0?type:"")+".jpg");
			if(file.exists()) {
				String[] str = new String[5];
				str[0] = "rp"+(type>0?type:"");
				str[1] = sku_33+"$"+str[0];
				str[2] = getSmallImgUrl(sku, str[0]);
				str[3] = getImgUrl(sku, str[0], sellerId);
				str[4] = getOBImgUrl(sku, ""+(type>0?type:"0"), sellerId);
				rppicslist.add(str);
			}
		}
		itemFileTO.setBigpiclist(bigpiclist);
		itemFileTO.setGypiclist(gypiclist);
		itemFileTO.setGywmpiclist(gywmpiclist);
		itemFileTO.setRppicslist(rppicslist);
    	if(null != categoryList )
    		itemFileTO.getGypType().addAll(categoryList);		
		return itemFileTO;
    }
    private void mkDirImgPath(String path) {
		File dir = new File(path);
		if(!dir.exists()) { // 先判断文件夹是否存在，不存在就创建
			dir.mkdir();
		}
	}
    
	// 加水印原大图url
	public String getOBImgUrl(String sku, String pic_type,String type, int seller_id) {
		String sku_33 = getSku(sku);
		sku_33="bic_pic".equals(pic_type)?sku_33:(sku_33+pic_type);
    	String[] skus = sku.split("-"); // 通过sku分割文件夹
    	String origpath = fPath + "orig" + System.getProperty("file.separator") + skus[0] + System.getProperty("file.separator");
    	origpath += skus[1] + System.getProperty("file.separator")+sku_33+("0".equals(type)?"":" ("+type+")")+".jpg";
    	File origfile = new File(origpath);
		if(origfile.exists()) {
			Image img;
			try {
				img = ImageIO.read(origfile);
				if(img==null){
					return "";
				}
				int  wide  = img.getWidth(null),height  = img.getHeight(null);
				if(wide>600||height>600){
		    		return RpcServerStore.getInstance().getImgUrl(seller_id) + "?" +Base64.getEncoder().encodeToString(((seller_id==999?0:seller_id)+" 0 "+type+" "+sku_33+" 0 getOBImg").getBytes());
				}else {
					return "";
				}
			} catch (IOException e) {
				return "";
			} 
	    	//process orig big file
			//return "http://10.0.0.252:8080/erp/img.do?"+Base64.encode(((seller_id==999?0:seller_id)+" 0 "+type+" "+sku+" 0 getOBImg").getBytes());
		} 
		return "";
	}
 // 产生small url
 	private String getSmallUrl(String sku) {
 		String[] skus = sku.split("-"); // 通过sku分割文件夹
 		if(skus.length < 2) {
 			return "";
 		}
     	return "small/" + skus[0] + "/" + skus[1] + "/";
 	}
	// 产生small文件夹
	private String getSmallPath() {
		String[] skus = fileName.split("-"); // 通过sku分割文件夹
    	String smallpath = fPath + "small" + System.getProperty("file.separator") + skus[0] + System.getProperty("file.separator");
    	mkDirImgPath(smallpath);
    	smallpath += skus[1] + System.getProperty("file.separator");
    	mkDirImgPath(smallpath);
    	return smallpath;
	}
 // 小图url
 	public String getSmallImgUrl(String sku, String type) {
 		String sku_33 = getSku(sku);
 		File smallfile = new File(fPath + getSmallUrl(sku) + sku_33 + "$"+type+".jpg");
 		if(smallfile.exists()) {
 			long time = System.currentTimeMillis();
 			return RpcServerStore.getInstance().getImgUrl(0)+"?" + Base64.getEncoder().encodeToString(("0 0 "+type+" "+sku+" 0 getSmallImg").getBytes())+ "&&" + time;
 		} else {
 			return "";
 		}
 	}
 	
 	// 小图流
 	public InputStream getSmallImg(String sku, String type) throws IOException {
 		String sku_33 = getSku(sku);
 		File smallfile = new File(fPath + getSmallUrl(sku) + sku_33 + "$"+type+".jpg");
 		if(smallfile.exists()) {
 			return new FileInputStream(smallfile);
 		} else {
 			//String nopic = getPhysicalPath("/style_new/image/nopic.gif");
 			String nopic = fPath + common + fileSeparator +  "nopic.gif";
 			return new FileInputStream(nopic);
 		}
 	}
 // 加水印原大图url
 	public String getOBImgUrl(String sku, String type, int seller_id) {
 		String sku_33 = getSku(sku);
     	String[] skus = sku.split("-"); // 通过sku分割文件夹
     	String origpath = fPath + "orig" + System.getProperty("file.separator") + skus[0] + System.getProperty("file.separator");
     	origpath += skus[1] + System.getProperty("file.separator")+sku_33+("0".equals(type)?"":" ("+type+")")+".jpg";
     	File origfile = new File(origpath);
 		if(origfile.exists()) {
 			Image img;
 			try {
 				img = ImageIO.read(origfile);
 				if(img==null){
 					return "";
 				}
 				int  wide  = img.getWidth(null),height  = img.getHeight(null);
 				if(wide>600||height>600){
 		    		return RpcServerStore.getInstance().getImgUrl(seller_id) + "?" + Base64.getEncoder().encodeToString(((seller_id==999?0:seller_id)+" 0 "+type+" "+sku+" 0 getOBImg").getBytes());
 				}else {
 					return "";
 				}
 			} catch (IOException e) {
 				return "";
 			} 
 	    	//process orig big file
 			//return "http://10.0.0.252:8080/erp/img.do?"+Base64.encode(((seller_id==999?0:seller_id)+" 0 "+type+" "+sku+" 0 getOBImg").getBytes());
 		} 
 		return "";
 	}
 	
 	// 加水印大图url
 	public String getImgUrl(String sku, String type, int seller_id) {
 		String sku_33 = getSku(sku);
 		String filepath = fPath+type+System.getProperty("file.separator")+sku_33+".jpg";
 		File file = new File(filepath);
 		
 		if(file.exists()) {
 			return RpcServerStore.getInstance().getImgUrl(seller_id) + "?" +  Base64.getEncoder().encodeToString(((seller_id==999?0:seller_id)+" 0 "+type+" "+sku+" 0 getImg").getBytes());
 		} else {
 			return "";
 		}
 	}
 	
    
    public List<String> getCategoryList(){
    	SystemprofileExample systemProfileExample = new SystemprofileExample();
    	systemProfileExample.createCriteria().andCompanyidEqualTo(999).andCategoryEqualTo(SystemProfile_Category.IMGEMANAGE);
    	List<Systemprofile> systemProfileList = systemprofileMapper.selectByExample(systemProfileExample);
    	List<String> categoryList = new ArrayList<String>();
    	for(Systemprofile systemProfile : systemProfileList) {
    		categoryList.add(systemProfile.getFvalue());
		}
		return categoryList;
    }
	private String getSku(String sku) {
		if(sku.substring(0, 3).equals("33-")||sku.substring(0, 3).equals("34-")) {
			sku = sku.substring(0, 10);
		}
		return sku;
	}
    /**
     * 初始化图片路径
     */
    public String initPath(){
    	String fPath = "D:\\upload\\"; 
//    	if(System.getProperty("os.name").toLowerCase().contains("window")) {
//			fPath = Config.getProperty("uploadimage.windowspath");
//		} else {
//			fPath = Config.getProperty("uploadimage.linuxpath");
//		}
    	
    	File dir = new File(fPath);
		if(!dir.exists()) { // 文件夹不存在就创建
			dir.mkdir();
			//throw new UniteException("", "noexistimgfolder");
		}
		File dirSmall = new File(fPath + "small/");
		if(!dirSmall.exists()) { // 文件夹不存在就创建
			dirSmall.mkdir();
		}
		File dirOrig = new File(fPath + "orig/");
		if(!dirOrig.exists()) { // 文件夹不存在就创建
			dirOrig.mkdir();
		}
		return fPath;
    }
    
}

