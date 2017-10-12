package com.sunvalley.erp.product.model;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import java.math.BigDecimal;
import java.io.Serializable;

/**
* @Description: table:Video
* @author
* @date 2017-10-12 04:28:23
*/
public class Video implements Serializable{

	//===========================================代码生成开始============================================
	private static final long serialVersionUID = 1L;
    //columns 开始
    private java.lang.Integer videoId;//
    private java.lang.Integer videoType;//
    private java.lang.String videoName;//
    private java.lang.Integer objectId;//
    private java.lang.String videoUrl;//
    private java.lang.Integer sortNum;//
    private java.lang.Integer userId;//
    private java.lang.Integer width;//
    private java.lang.Integer height;//
    private java.util.Date createDate;//
    private java.util.Date updateDate;//
    private java.lang.Integer deleted;//
	//columns 结束



  	/**
     * 
     *
     * @param value
     */
	public void setVideoId(java.lang.Integer value) {
		this.videoId = value;
	}
	
	/**
     * 
     */
	public java.lang.Integer getVideoId() {
		return this.videoId;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setVideoType(java.lang.Integer value) {
		this.videoType = value;
	}
	
	/**
     * 
     */
	public java.lang.Integer getVideoType() {
		return this.videoType;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setVideoName(java.lang.String value) {
		this.videoName = value;
	}
	
	/**
     * 
     */
	public java.lang.String getVideoName() {
		return this.videoName;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setObjectId(java.lang.Integer value) {
		this.objectId = value;
	}
	
	/**
     * 
     */
	public java.lang.Integer getObjectId() {
		return this.objectId;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setVideoUrl(java.lang.String value) {
		this.videoUrl = value;
	}
	
	/**
     * 
     */
	public java.lang.String getVideoUrl() {
		return this.videoUrl;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setSortNum(java.lang.Integer value) {
		this.sortNum = value;
	}
	
	/**
     * 
     */
	public java.lang.Integer getSortNum() {
		return this.sortNum;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setUserId(java.lang.Integer value) {
		this.userId = value;
	}
	
	/**
     * 
     */
	public java.lang.Integer getUserId() {
		return this.userId;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setWidth(java.lang.Integer value) {
		this.width = value;
	}
	
	/**
     * 
     */
	public java.lang.Integer getWidth() {
		return this.width;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setHeight(java.lang.Integer value) {
		this.height = value;
	}
	
	/**
     * 
     */
	public java.lang.Integer getHeight() {
		return this.height;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setCreateDate(java.util.Date value) {
		this.createDate = value;
	}
	
	/**
     * 
     */
	public java.util.Date getCreateDate() {
		return this.createDate;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setUpdateDate(java.util.Date value) {
		this.updateDate = value;
	}
	
	/**
     * 
     */
	public java.util.Date getUpdateDate() {
		return this.updateDate;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setDeleted(java.lang.Integer value) {
		this.deleted = value;
	}
	
	/**
     * 
     */
	public java.lang.Integer getDeleted() {
		return this.deleted;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("videoId",getVideoId())
			.append("videoType",getVideoType())
			.append("videoName",getVideoName())
			.append("objectId",getObjectId())
			.append("videoUrl",getVideoUrl())
			.append("sortNum",getSortNum())
			.append("userId",getUserId())
			.append("width",getWidth())
			.append("height",getHeight())
			.append("createDate",getCreateDate())
			.append("updateDate",getUpdateDate())
			.append("deleted",getDeleted())
			.toString();
	}
	//===========================================代码生成结束============================================
}

