package com.sunvalley.erp.product.model;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import java.math.BigDecimal;
import java.io.Serializable;

/**
* @Description: table:MarketAccount
* @author
* @date 2017-10-13 02:12:20
*/
public class MarketAccount implements Serializable{

	//===========================================代码生成开始============================================
	private static final long serialVersionUID = 1L;
    //columns 开始
    private java.lang.Integer maid;//
    private java.lang.Integer marketId;//
    private java.lang.String account;//
    private java.lang.String accountEmail;//
    private java.lang.String paypalEmail;//
    private java.lang.String smtpEmail;//
    private java.lang.String emailPassword;//
    private java.lang.Integer tplId;//
    private java.lang.Integer smtpId;//
    private java.lang.String rpcUrl;//
    private Integer channelClass;//
    private java.lang.String abbreviation;//
    private java.lang.String imgUrl;//
    private java.lang.String mailCenterId;//
	//columns 结束



  	/**
     * 
     *
     * @param value
     */
	public void setMaid(java.lang.Integer value) {
		this.maid = value;
	}
	
	/**
     * 
     */
	public java.lang.Integer getMaid() {
		return this.maid;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setMarketId(java.lang.Integer value) {
		this.marketId = value;
	}
	
	/**
     * 
     */
	public java.lang.Integer getMarketId() {
		return this.marketId;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setAccount(java.lang.String value) {
		this.account = value;
	}
	
	/**
     * 
     */
	public java.lang.String getAccount() {
		return this.account;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setAccountEmail(java.lang.String value) {
		this.accountEmail = value;
	}
	
	/**
     * 
     */
	public java.lang.String getAccountEmail() {
		return this.accountEmail;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setPaypalEmail(java.lang.String value) {
		this.paypalEmail = value;
	}
	
	/**
     * 
     */
	public java.lang.String getPaypalEmail() {
		return this.paypalEmail;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setSmtpEmail(java.lang.String value) {
		this.smtpEmail = value;
	}
	
	/**
     * 
     */
	public java.lang.String getSmtpEmail() {
		return this.smtpEmail;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setEmailPassword(java.lang.String value) {
		this.emailPassword = value;
	}
	
	/**
     * 
     */
	public java.lang.String getEmailPassword() {
		return this.emailPassword;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setTplId(java.lang.Integer value) {
		this.tplId = value;
	}
	
	/**
     * 
     */
	public java.lang.Integer getTplId() {
		return this.tplId;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setSmtpId(java.lang.Integer value) {
		this.smtpId = value;
	}
	
	/**
     * 
     */
	public java.lang.Integer getSmtpId() {
		return this.smtpId;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setRpcUrl(java.lang.String value) {
		this.rpcUrl = value;
	}
	
	/**
     * 
     */
	public java.lang.String getRpcUrl() {
		return this.rpcUrl;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setChannelClass(Integer value) {
		this.channelClass = value;
	}
	
	/**
     * 
     */
	public Integer getChannelClass() {
		return this.channelClass;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setAbbreviation(java.lang.String value) {
		this.abbreviation = value;
	}
	
	/**
     * 
     */
	public java.lang.String getAbbreviation() {
		return this.abbreviation;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setImgUrl(java.lang.String value) {
		this.imgUrl = value;
	}
	
	/**
     * 
     */
	public java.lang.String getImgUrl() {
		return this.imgUrl;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setMailCenterId(java.lang.String value) {
		this.mailCenterId = value;
	}
	
	/**
     * 
     */
	public java.lang.String getMailCenterId() {
		return this.mailCenterId;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("maid",getMaid())
			.append("marketId",getMarketId())
			.append("account",getAccount())
			.append("accountEmail",getAccountEmail())
			.append("paypalEmail",getPaypalEmail())
			.append("smtpEmail",getSmtpEmail())
			.append("emailPassword",getEmailPassword())
			.append("tplId",getTplId())
			.append("smtpId",getSmtpId())
			.append("rpcUrl",getRpcUrl())
			.append("channelClass",getChannelClass())
			.append("abbreviation",getAbbreviation())
			.append("imgUrl",getImgUrl())
			.append("mailCenterId",getMailCenterId())
			.toString();
	}
	//===========================================代码生成结束============================================
}

