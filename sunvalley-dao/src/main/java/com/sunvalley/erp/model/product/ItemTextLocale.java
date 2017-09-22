package com.sunvalley.erp.model.product;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import java.math.BigDecimal;
import java.io.Serializable;

/**
* @Description: table:ItemTextLocale
* @author
* @date 2017-09-22 11:33:48
*/
public class ItemTextLocale implements Serializable{

	//===========================================代码生成开始============================================
	private static final long serialVersionUID = 1L;
    //columns 开始
    private java.lang.Integer skuid;//
    private Integer langId;//
    private java.lang.String metatile;//
    private java.lang.String metakeyword;//
    private java.lang.String metadesc;//
    private java.lang.String laptopModel;//
    private java.lang.String review;//
    private java.lang.String specification;//
    private java.lang.String partNumber;//
    private java.lang.String packagedesc;//
    private java.lang.String warranty;//
    private java.lang.String specificationOriginal;//
    private java.lang.Boolean flag;//
	//columns 结束



  	/**
     * 
     *
     * @param value
     */
	public void setSkuid(java.lang.Integer value) {
		this.skuid = value;
	}
	
	/**
     * 
     */
	public java.lang.Integer getSkuid() {
		return this.skuid;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setLangId(Integer value) {
		this.langId = value;
	}
	
	/**
     * 
     */
	public Integer getLangId() {
		return this.langId;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setMetatile(java.lang.String value) {
		this.metatile = value;
	}
	
	/**
     * 
     */
	public java.lang.String getMetatile() {
		return this.metatile;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setMetakeyword(java.lang.String value) {
		this.metakeyword = value;
	}
	
	/**
     * 
     */
	public java.lang.String getMetakeyword() {
		return this.metakeyword;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setMetadesc(java.lang.String value) {
		this.metadesc = value;
	}
	
	/**
     * 
     */
	public java.lang.String getMetadesc() {
		return this.metadesc;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setLaptopModel(java.lang.String value) {
		this.laptopModel = value;
	}
	
	/**
     * 
     */
	public java.lang.String getLaptopModel() {
		return this.laptopModel;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setReview(java.lang.String value) {
		this.review = value;
	}
	
	/**
     * 
     */
	public java.lang.String getReview() {
		return this.review;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setSpecification(java.lang.String value) {
		this.specification = value;
	}
	
	/**
     * 
     */
	public java.lang.String getSpecification() {
		return this.specification;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setPartNumber(java.lang.String value) {
		this.partNumber = value;
	}
	
	/**
     * 
     */
	public java.lang.String getPartNumber() {
		return this.partNumber;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setPackagedesc(java.lang.String value) {
		this.packagedesc = value;
	}
	
	/**
     * 
     */
	public java.lang.String getPackagedesc() {
		return this.packagedesc;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setWarranty(java.lang.String value) {
		this.warranty = value;
	}
	
	/**
     * 
     */
	public java.lang.String getWarranty() {
		return this.warranty;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setSpecificationOriginal(java.lang.String value) {
		this.specificationOriginal = value;
	}
	
	/**
     * 
     */
	public java.lang.String getSpecificationOriginal() {
		return this.specificationOriginal;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setFlag(java.lang.Boolean value) {
		this.flag = value;
	}
	
	/**
     * 
     */
	public java.lang.Boolean getFlag() {
		return this.flag;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("skuid",getSkuid())
			.append("langId",getLangId())
			.append("metatile",getMetatile())
			.append("metakeyword",getMetakeyword())
			.append("metadesc",getMetadesc())
			.append("laptopModel",getLaptopModel())
			.append("review",getReview())
			.append("specification",getSpecification())
			.append("partNumber",getPartNumber())
			.append("packagedesc",getPackagedesc())
			.append("warranty",getWarranty())
			.append("specificationOriginal",getSpecificationOriginal())
			.append("flag",getFlag())
			.toString();
	}
	//===========================================代码生成结束============================================
}

