package com.sunvalley.erp.product.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.math.BigDecimal;

/**
* @Description: ItemPreCommomExample
* @author
* @date 2017-10-13 02:11:54
*/
public class ItemPreCommomExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private int pageIndex;

    private int pageSize;

    public ItemPreCommomExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setPageIndex(int pageIndex) {
        this.pageIndex=pageIndex;
    }

    public int getPageIndex() {
        return this.pageIndex;
    }

    public void setPageSize(int pageSize) {
        this.pageSize=pageSize;
    }

    public int getPageSize() {
        return this.pageSize;
    }

    public int getSkipRecordCount() {
        return (this.pageIndex-1)*this.pageSize;
    }

    public int getEndRecordCount() {
        return this.pageIndex*this.pageSize;
    }

    public ItemPreCommomExample(int pageSize, int pageIndex) {
        this();
        this.pageSize=pageSize;
        this.pageIndex=pageIndex;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }
        
        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }


        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(java.lang.Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(java.lang.Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(java.lang.Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(java.lang.Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }


        public Criteria andIdIn(List<java.lang.Integer > values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<java.lang.Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }



        public Criteria andModelIdIsNull() {
            addCriterion("modelId is null");
            return (Criteria) this;
        }


        public Criteria andModelIdIsNotNull() {
            addCriterion("modelId is not null");
            return (Criteria) this;
        }

        public Criteria andModelIdEqualTo(java.lang.Integer value) {
            addCriterion("model_id =", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdNotEqualTo(java.lang.Integer value) {
            addCriterion("model_id <>", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdGreaterThan(java.lang.Integer value) {
            addCriterion("model_id >", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("model_id >=", value, "model_id");
            return (Criteria) this;
        }

        public Criteria andModelIdLessThan(java.lang.Integer value) {
            addCriterion("model_id <", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("model_id <=", value, "modelId");
            return (Criteria) this;
        }


        public Criteria andModelIdIn(List<java.lang.Integer > values) {
            addCriterion("model_id in", values, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdNotIn(List<java.lang.Integer> values) {
            addCriterion("model_id not in", values, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("model_id between", value1, value2, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdNotBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("model_id not between", value1, value2, "modelId");
            return (Criteria) this;
        }



        public Criteria andStandardSizeIsNull() {
            addCriterion("standardSize is null");
            return (Criteria) this;
        }


        public Criteria andStandardSizeIsNotNull() {
            addCriterion("standardSize is not null");
            return (Criteria) this;
        }

        public Criteria andStandardSizeEqualTo(java.lang.Integer value) {
            addCriterion("standard_size =", value, "standardSize");
            return (Criteria) this;
        }

        public Criteria andStandardSizeNotEqualTo(java.lang.Integer value) {
            addCriterion("standard_size <>", value, "standardSize");
            return (Criteria) this;
        }

        public Criteria andStandardSizeGreaterThan(java.lang.Integer value) {
            addCriterion("standard_size >", value, "standardSize");
            return (Criteria) this;
        }

        public Criteria andStandardSizeGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("standard_size >=", value, "standard_size");
            return (Criteria) this;
        }

        public Criteria andStandardSizeLessThan(java.lang.Integer value) {
            addCriterion("standard_size <", value, "standardSize");
            return (Criteria) this;
        }

        public Criteria andStandardSizeLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("standard_size <=", value, "standardSize");
            return (Criteria) this;
        }


        public Criteria andStandardSizeIn(List<java.lang.Integer > values) {
            addCriterion("standard_size in", values, "standardSize");
            return (Criteria) this;
        }

        public Criteria andStandardSizeNotIn(List<java.lang.Integer> values) {
            addCriterion("standard_size not in", values, "standardSize");
            return (Criteria) this;
        }

        public Criteria andStandardSizeBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("standard_size between", value1, value2, "standardSize");
            return (Criteria) this;
        }

        public Criteria andStandardSizeNotBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("standard_size not between", value1, value2, "standardSize");
            return (Criteria) this;
        }



        public Criteria andWeightIsNull() {
            addCriterion("weight is null");
            return (Criteria) this;
        }


        public Criteria andWeightIsNotNull() {
            addCriterion("weight is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(BigDecimal value) {
            addCriterion("weight =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(BigDecimal value) {
            addCriterion("weight <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(BigDecimal value) {
            addCriterion("weight >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("weight >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(BigDecimal value) {
            addCriterion("weight <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("weight <=", value, "weight");
            return (Criteria) this;
        }


        public Criteria andWeightIn(List<BigDecimal > values) {
            addCriterion("weight in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<BigDecimal> values) {
            addCriterion("weight not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("weight between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("weight not between", value1, value2, "weight");
            return (Criteria) this;
        }



        public Criteria andShippingTypeIsNull() {
            addCriterion("shippingType is null");
            return (Criteria) this;
        }


        public Criteria andShippingTypeIsNotNull() {
            addCriterion("shippingType is not null");
            return (Criteria) this;
        }

        public Criteria andShippingTypeEqualTo(java.lang.Integer value) {
            addCriterion("shipping_type =", value, "shippingType");
            return (Criteria) this;
        }

        public Criteria andShippingTypeNotEqualTo(java.lang.Integer value) {
            addCriterion("shipping_type <>", value, "shippingType");
            return (Criteria) this;
        }

        public Criteria andShippingTypeGreaterThan(java.lang.Integer value) {
            addCriterion("shipping_type >", value, "shippingType");
            return (Criteria) this;
        }

        public Criteria andShippingTypeGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("shipping_type >=", value, "shipping_type");
            return (Criteria) this;
        }

        public Criteria andShippingTypeLessThan(java.lang.Integer value) {
            addCriterion("shipping_type <", value, "shippingType");
            return (Criteria) this;
        }

        public Criteria andShippingTypeLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("shipping_type <=", value, "shippingType");
            return (Criteria) this;
        }


        public Criteria andShippingTypeIn(List<java.lang.Integer > values) {
            addCriterion("shipping_type in", values, "shippingType");
            return (Criteria) this;
        }

        public Criteria andShippingTypeNotIn(List<java.lang.Integer> values) {
            addCriterion("shipping_type not in", values, "shippingType");
            return (Criteria) this;
        }

        public Criteria andShippingTypeBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("shipping_type between", value1, value2, "shippingType");
            return (Criteria) this;
        }

        public Criteria andShippingTypeNotBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("shipping_type not between", value1, value2, "shippingType");
            return (Criteria) this;
        }



        public Criteria andMcIsNull() {
            addCriterion("mc is null");
            return (Criteria) this;
        }


        public Criteria andMcIsNotNull() {
            addCriterion("mc is not null");
            return (Criteria) this;
        }

        public Criteria andMcEqualTo(BigDecimal value) {
            addCriterion("mc =", value, "mc");
            return (Criteria) this;
        }

        public Criteria andMcNotEqualTo(BigDecimal value) {
            addCriterion("mc <>", value, "mc");
            return (Criteria) this;
        }

        public Criteria andMcGreaterThan(BigDecimal value) {
            addCriterion("mc >", value, "mc");
            return (Criteria) this;
        }

        public Criteria andMcGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("mc >=", value, "mc");
            return (Criteria) this;
        }

        public Criteria andMcLessThan(BigDecimal value) {
            addCriterion("mc <", value, "mc");
            return (Criteria) this;
        }

        public Criteria andMcLessThanOrEqualTo(BigDecimal value) {
            addCriterion("mc <=", value, "mc");
            return (Criteria) this;
        }


        public Criteria andMcIn(List<BigDecimal > values) {
            addCriterion("mc in", values, "mc");
            return (Criteria) this;
        }

        public Criteria andMcNotIn(List<BigDecimal> values) {
            addCriterion("mc not in", values, "mc");
            return (Criteria) this;
        }

        public Criteria andMcBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("mc between", value1, value2, "mc");
            return (Criteria) this;
        }

        public Criteria andMcNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("mc not between", value1, value2, "mc");
            return (Criteria) this;
        }



        public Criteria andSetupDateIsNull() {
            addCriterion("setupDate is null");
            return (Criteria) this;
        }


        public Criteria andSetupDateIsNotNull() {
            addCriterion("setupDate is not null");
            return (Criteria) this;
        }

        public Criteria andSetupDateEqualTo(java.util.Date value) {
            addCriterion("setup_date =", value, "setupDate");
            return (Criteria) this;
        }

        public Criteria andSetupDateNotEqualTo(java.util.Date value) {
            addCriterion("setup_date <>", value, "setupDate");
            return (Criteria) this;
        }

        public Criteria andSetupDateGreaterThan(java.util.Date value) {
            addCriterion("setup_date >", value, "setupDate");
            return (Criteria) this;
        }

        public Criteria andSetupDateGreaterThanOrEqualTo(java.util.Date value) {
            addCriterion("setup_date >=", value, "setup_date");
            return (Criteria) this;
        }

        public Criteria andSetupDateLessThan(java.util.Date value) {
            addCriterion("setup_date <", value, "setupDate");
            return (Criteria) this;
        }

        public Criteria andSetupDateLessThanOrEqualTo(java.util.Date value) {
            addCriterion("setup_date <=", value, "setupDate");
            return (Criteria) this;
        }


        public Criteria andSetupDateIn(List<java.util.Date > values) {
            addCriterion("setup_date in", values, "setupDate");
            return (Criteria) this;
        }

        public Criteria andSetupDateNotIn(List<java.util.Date> values) {
            addCriterion("setup_date not in", values, "setupDate");
            return (Criteria) this;
        }

        public Criteria andSetupDateBetween(java.util.Date value1, java.util.Date value2) {
            addCriterion("setup_date between", value1, value2, "setupDate");
            return (Criteria) this;
        }

        public Criteria andSetupDateNotBetween(java.util.Date value1, java.util.Date value2) {
            addCriterion("setup_date not between", value1, value2, "setupDate");
            return (Criteria) this;
        }



        public Criteria andSalePriceIsNull() {
            addCriterion("salePrice is null");
            return (Criteria) this;
        }


        public Criteria andSalePriceIsNotNull() {
            addCriterion("salePrice is not null");
            return (Criteria) this;
        }

        public Criteria andSalePriceEqualTo(BigDecimal value) {
            addCriterion("sale_price =", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceNotEqualTo(BigDecimal value) {
            addCriterion("sale_price <>", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceGreaterThan(BigDecimal value) {
            addCriterion("sale_price >", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sale_price >=", value, "sale_price");
            return (Criteria) this;
        }

        public Criteria andSalePriceLessThan(BigDecimal value) {
            addCriterion("sale_price <", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sale_price <=", value, "salePrice");
            return (Criteria) this;
        }


        public Criteria andSalePriceIn(List<BigDecimal > values) {
            addCriterion("sale_price in", values, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceNotIn(List<BigDecimal> values) {
            addCriterion("sale_price not in", values, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sale_price between", value1, value2, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sale_price not between", value1, value2, "salePrice");
            return (Criteria) this;
        }



        public Criteria andCustomNameIsNull() {
            addCriterion("customName is null");
            return (Criteria) this;
        }


        public Criteria andCustomNameIsNotNull() {
            addCriterion("customName is not null");
            return (Criteria) this;
        }

        public Criteria andCustomNameEqualTo(java.lang.String value) {
            addCriterion("custom_name =", value, "customName");
            return (Criteria) this;
        }

        public Criteria andCustomNameNotEqualTo(java.lang.String value) {
            addCriterion("custom_name <>", value, "customName");
            return (Criteria) this;
        }

        public Criteria andCustomNameGreaterThan(java.lang.String value) {
            addCriterion("custom_name >", value, "customName");
            return (Criteria) this;
        }

        public Criteria andCustomNameGreaterThanOrEqualTo(java.lang.String value) {
            addCriterion("custom_name >=", value, "custom_name");
            return (Criteria) this;
        }

        public Criteria andCustomNameLessThan(java.lang.String value) {
            addCriterion("custom_name <", value, "customName");
            return (Criteria) this;
        }

        public Criteria andCustomNameLessThanOrEqualTo(java.lang.String value) {
            addCriterion("custom_name <=", value, "customName");
            return (Criteria) this;
        }


        public Criteria andCustomNameIn(List<java.lang.String > values) {
            addCriterion("custom_name in", values, "customName");
            return (Criteria) this;
        }

        public Criteria andCustomNameNotIn(List<java.lang.String> values) {
            addCriterion("custom_name not in", values, "customName");
            return (Criteria) this;
        }

        public Criteria andCustomNameBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("custom_name between", value1, value2, "customName");
            return (Criteria) this;
        }

        public Criteria andCustomNameNotBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("custom_name not between", value1, value2, "customName");
            return (Criteria) this;
        }



        public Criteria andSaleDeptIsNull() {
            addCriterion("saleDept is null");
            return (Criteria) this;
        }


        public Criteria andSaleDeptIsNotNull() {
            addCriterion("saleDept is not null");
            return (Criteria) this;
        }

        public Criteria andSaleDeptEqualTo(java.lang.Integer value) {
            addCriterion("sale_dept =", value, "saleDept");
            return (Criteria) this;
        }

        public Criteria andSaleDeptNotEqualTo(java.lang.Integer value) {
            addCriterion("sale_dept <>", value, "saleDept");
            return (Criteria) this;
        }

        public Criteria andSaleDeptGreaterThan(java.lang.Integer value) {
            addCriterion("sale_dept >", value, "saleDept");
            return (Criteria) this;
        }

        public Criteria andSaleDeptGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("sale_dept >=", value, "sale_dept");
            return (Criteria) this;
        }

        public Criteria andSaleDeptLessThan(java.lang.Integer value) {
            addCriterion("sale_dept <", value, "saleDept");
            return (Criteria) this;
        }

        public Criteria andSaleDeptLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("sale_dept <=", value, "saleDept");
            return (Criteria) this;
        }


        public Criteria andSaleDeptIn(List<java.lang.Integer > values) {
            addCriterion("sale_dept in", values, "saleDept");
            return (Criteria) this;
        }

        public Criteria andSaleDeptNotIn(List<java.lang.Integer> values) {
            addCriterion("sale_dept not in", values, "saleDept");
            return (Criteria) this;
        }

        public Criteria andSaleDeptBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("sale_dept between", value1, value2, "saleDept");
            return (Criteria) this;
        }

        public Criteria andSaleDeptNotBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("sale_dept not between", value1, value2, "saleDept");
            return (Criteria) this;
        }



        public Criteria andCreateUserIdIsNull() {
            addCriterion("createUserId is null");
            return (Criteria) this;
        }


        public Criteria andCreateUserIdIsNotNull() {
            addCriterion("createUserId is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdEqualTo(java.lang.Integer value) {
            addCriterion("create_user_id =", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotEqualTo(java.lang.Integer value) {
            addCriterion("create_user_id <>", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdGreaterThan(java.lang.Integer value) {
            addCriterion("create_user_id >", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("create_user_id >=", value, "create_user_id");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLessThan(java.lang.Integer value) {
            addCriterion("create_user_id <", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("create_user_id <=", value, "createUserId");
            return (Criteria) this;
        }


        public Criteria andCreateUserIdIn(List<java.lang.Integer > values) {
            addCriterion("create_user_id in", values, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotIn(List<java.lang.Integer> values) {
            addCriterion("create_user_id not in", values, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("create_user_id between", value1, value2, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("create_user_id not between", value1, value2, "createUserId");
            return (Criteria) this;
        }



        public Criteria andCreateDateIsNull() {
            addCriterion("createDate is null");
            return (Criteria) this;
        }


        public Criteria andCreateDateIsNotNull() {
            addCriterion("createDate is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(java.util.Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(java.util.Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(java.util.Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(java.util.Date value) {
            addCriterion("create_date >=", value, "create_date");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(java.util.Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(java.util.Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }


        public Criteria andCreateDateIn(List<java.util.Date > values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<java.util.Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(java.util.Date value1, java.util.Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(java.util.Date value1, java.util.Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }



        public Criteria andUpdateDateIsNull() {
            addCriterion("updateDate is null");
            return (Criteria) this;
        }


        public Criteria andUpdateDateIsNotNull() {
            addCriterion("updateDate is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(java.util.Date value) {
            addCriterion("update_date =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(java.util.Date value) {
            addCriterion("update_date <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(java.util.Date value) {
            addCriterion("update_date >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(java.util.Date value) {
            addCriterion("update_date >=", value, "update_date");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(java.util.Date value) {
            addCriterion("update_date <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(java.util.Date value) {
            addCriterion("update_date <=", value, "updateDate");
            return (Criteria) this;
        }


        public Criteria andUpdateDateIn(List<java.util.Date > values) {
            addCriterion("update_date in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<java.util.Date> values) {
            addCriterion("update_date not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(java.util.Date value1, java.util.Date value2) {
            addCriterion("update_date between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(java.util.Date value1, java.util.Date value2) {
            addCriterion("update_date not between", value1, value2, "updateDate");
            return (Criteria) this;
        }



        public Criteria andUpdateUserIdIsNull() {
            addCriterion("updateUserId is null");
            return (Criteria) this;
        }


        public Criteria andUpdateUserIdIsNotNull() {
            addCriterion("updateUserId is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdEqualTo(java.lang.Integer value) {
            addCriterion("update_user_id =", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdNotEqualTo(java.lang.Integer value) {
            addCriterion("update_user_id <>", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdGreaterThan(java.lang.Integer value) {
            addCriterion("update_user_id >", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("update_user_id >=", value, "update_user_id");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdLessThan(java.lang.Integer value) {
            addCriterion("update_user_id <", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("update_user_id <=", value, "updateUserId");
            return (Criteria) this;
        }


        public Criteria andUpdateUserIdIn(List<java.lang.Integer > values) {
            addCriterion("update_user_id in", values, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdNotIn(List<java.lang.Integer> values) {
            addCriterion("update_user_id not in", values, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("update_user_id between", value1, value2, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdNotBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("update_user_id not between", value1, value2, "updateUserId");
            return (Criteria) this;
        }



       
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}