/*
* Copyright (c) 2017 sunvalley. All Rights Reserved.
*/
package com.sunvalley.erp.to.product;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 类或方法的功能描述 :TODO
 *
 * @Author: douglas.jiang
 * @Date: 2017-10-10 17:53
 */
public class ItemFileTO  implements Serializable {
    private static final long serialVersionUID = 1L;
    private java.lang.Integer itemFileId;//
    private java.lang.Integer fileId;//
    private java.lang.String fileName;//
    private java.lang.Integer fileType;//
    private java.lang.Integer skuId;//
    private java.lang.String sku;//
    private java.lang.Integer userId;//
    private java.lang.String email;//
    private java.lang.String desc;//
    private java.util.Date createDate;//
    private java.util.Date updateDate;//
    private List<String[]> bigpiclist;
    private List<String[]> gypiclist;
    private List<String[]> gywmpiclist;
    private List<String[]> Rppicslist;
    private List<String> gypType;
    private Map<String,List<String[]>> listMap = new HashMap<String,List<String[]>>();
	private Map<String,List<Integer>> indexMap = new HashMap<String,List<Integer>>();
	
    
 
    public List<String> getGypType() {
		return gypType;
	}

	public void setGypType(List<String> gypType) {
		this.gypType = gypType;
	}

	public Map<String, List<String[]>> getListMap() {
		return listMap;
	}

	public void setListMap(Map<String, List<String[]>> listMap) {
		this.listMap = listMap;
	}

	public Map<String, List<Integer>> getIndexMap() {
		return indexMap;
	}

	public void setIndexMap(Map<String, List<Integer>> indexMap) {
		this.indexMap = indexMap;
	}

	public List<String[]> getBigpiclist() {
		return bigpiclist;
	}

	public void setBigpiclist(List<String[]> bigpiclist) {
		this.bigpiclist = bigpiclist;
	}

	public List<String[]> getGypiclist() {
		return gypiclist;
	}

	public void setGypiclist(List<String[]> gypiclist) {
		this.gypiclist = gypiclist;
	}

	public List<String[]> getGywmpiclist() {
		return gywmpiclist;
	}

	public void setGywmpiclist(List<String[]> gywmpiclist) {
		this.gywmpiclist = gywmpiclist;
	}

	public List<String[]> getRppicslist() {
		return Rppicslist;
	}

	public void setRppicslist(List<String[]> rppicslist) {
		Rppicslist = rppicslist;
	}

	public Integer getItemFileId() {
        return itemFileId;
    }

    public void setItemFileId(Integer itemFileId) {
        this.itemFileId = itemFileId;
    }

    public Integer getFileId() {
        return fileId;
    }

    public void setFileId(Integer fileId) {
        this.fileId = fileId;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Integer getFileType() {
        return fileType;
    }

    public void setFileType(Integer fileType) {
        this.fileType = fileType;
    }

    public Integer getSkuId() {
        return skuId;
    }

    public void setSkuId(Integer skuId) {
        this.skuId = skuId;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}

