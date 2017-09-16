package com.sunvalley.erp.model.product;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.math.BigDecimal;

/**
* @Description: ItemModelExample
* @author
* @date 2017-09-16 11:22:46
*/
public class ItemModelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private int pageIndex;

    private int pageSize;

    public ItemModelExample() {
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

    public ItemModelExample(int pageSize, int pageIndex) {
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



        public Criteria andModelNameIsNull() {
            addCriterion("modelName is null");
            return (Criteria) this;
        }


        public Criteria andModelNameIsNotNull() {
            addCriterion("modelName is not null");
            return (Criteria) this;
        }

        public Criteria andModelNameEqualTo(java.lang.String value) {
            addCriterion("model_name =", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameNotEqualTo(java.lang.String value) {
            addCriterion("model_name <>", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameGreaterThan(java.lang.String value) {
            addCriterion("model_name >", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameGreaterThanOrEqualTo(java.lang.String value) {
            addCriterion("model_name >=", value, "model_name");
            return (Criteria) this;
        }

        public Criteria andModelNameLessThan(java.lang.String value) {
            addCriterion("model_name <", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameLessThanOrEqualTo(java.lang.String value) {
            addCriterion("model_name <=", value, "modelName");
            return (Criteria) this;
        }


        public Criteria andModelNameIn(List<java.lang.String > values) {
            addCriterion("model_name in", values, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameNotIn(List<java.lang.String> values) {
            addCriterion("model_name not in", values, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("model_name between", value1, value2, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameNotBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("model_name not between", value1, value2, "modelName");
            return (Criteria) this;
        }



        public Criteria andBrandIdIsNull() {
            addCriterion("brandId is null");
            return (Criteria) this;
        }


        public Criteria andBrandIdIsNotNull() {
            addCriterion("brandId is not null");
            return (Criteria) this;
        }

        public Criteria andBrandIdEqualTo(java.lang.Integer value) {
            addCriterion("brand_id =", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotEqualTo(java.lang.Integer value) {
            addCriterion("brand_id <>", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdGreaterThan(java.lang.Integer value) {
            addCriterion("brand_id >", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("brand_id >=", value, "brand_id");
            return (Criteria) this;
        }

        public Criteria andBrandIdLessThan(java.lang.Integer value) {
            addCriterion("brand_id <", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("brand_id <=", value, "brandId");
            return (Criteria) this;
        }


        public Criteria andBrandIdIn(List<java.lang.Integer > values) {
            addCriterion("brand_id in", values, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotIn(List<java.lang.Integer> values) {
            addCriterion("brand_id not in", values, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("brand_id between", value1, value2, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("brand_id not between", value1, value2, "brandId");
            return (Criteria) this;
        }



        public Criteria andBrandCodeIsNull() {
            addCriterion("brandCode is null");
            return (Criteria) this;
        }


        public Criteria andBrandCodeIsNotNull() {
            addCriterion("brandCode is not null");
            return (Criteria) this;
        }

        public Criteria andBrandCodeEqualTo(java.lang.String value) {
            addCriterion("brand_code =", value, "brandCode");
            return (Criteria) this;
        }

        public Criteria andBrandCodeNotEqualTo(java.lang.String value) {
            addCriterion("brand_code <>", value, "brandCode");
            return (Criteria) this;
        }

        public Criteria andBrandCodeGreaterThan(java.lang.String value) {
            addCriterion("brand_code >", value, "brandCode");
            return (Criteria) this;
        }

        public Criteria andBrandCodeGreaterThanOrEqualTo(java.lang.String value) {
            addCriterion("brand_code >=", value, "brand_code");
            return (Criteria) this;
        }

        public Criteria andBrandCodeLessThan(java.lang.String value) {
            addCriterion("brand_code <", value, "brandCode");
            return (Criteria) this;
        }

        public Criteria andBrandCodeLessThanOrEqualTo(java.lang.String value) {
            addCriterion("brand_code <=", value, "brandCode");
            return (Criteria) this;
        }


        public Criteria andBrandCodeIn(List<java.lang.String > values) {
            addCriterion("brand_code in", values, "brandCode");
            return (Criteria) this;
        }

        public Criteria andBrandCodeNotIn(List<java.lang.String> values) {
            addCriterion("brand_code not in", values, "brandCode");
            return (Criteria) this;
        }

        public Criteria andBrandCodeBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("brand_code between", value1, value2, "brandCode");
            return (Criteria) this;
        }

        public Criteria andBrandCodeNotBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("brand_code not between", value1, value2, "brandCode");
            return (Criteria) this;
        }



        public Criteria andPmIdIsNull() {
            addCriterion("pmId is null");
            return (Criteria) this;
        }


        public Criteria andPmIdIsNotNull() {
            addCriterion("pmId is not null");
            return (Criteria) this;
        }

        public Criteria andPmIdEqualTo(java.lang.Integer value) {
            addCriterion("pm_id =", value, "pmId");
            return (Criteria) this;
        }

        public Criteria andPmIdNotEqualTo(java.lang.Integer value) {
            addCriterion("pm_id <>", value, "pmId");
            return (Criteria) this;
        }

        public Criteria andPmIdGreaterThan(java.lang.Integer value) {
            addCriterion("pm_id >", value, "pmId");
            return (Criteria) this;
        }

        public Criteria andPmIdGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("pm_id >=", value, "pm_id");
            return (Criteria) this;
        }

        public Criteria andPmIdLessThan(java.lang.Integer value) {
            addCriterion("pm_id <", value, "pmId");
            return (Criteria) this;
        }

        public Criteria andPmIdLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("pm_id <=", value, "pmId");
            return (Criteria) this;
        }


        public Criteria andPmIdIn(List<java.lang.Integer > values) {
            addCriterion("pm_id in", values, "pmId");
            return (Criteria) this;
        }

        public Criteria andPmIdNotIn(List<java.lang.Integer> values) {
            addCriterion("pm_id not in", values, "pmId");
            return (Criteria) this;
        }

        public Criteria andPmIdBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("pm_id between", value1, value2, "pmId");
            return (Criteria) this;
        }

        public Criteria andPmIdNotBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("pm_id not between", value1, value2, "pmId");
            return (Criteria) this;
        }



        public Criteria andMainCategoryIdIsNull() {
            addCriterion("mainCategoryId is null");
            return (Criteria) this;
        }


        public Criteria andMainCategoryIdIsNotNull() {
            addCriterion("mainCategoryId is not null");
            return (Criteria) this;
        }

        public Criteria andMainCategoryIdEqualTo(java.lang.Integer value) {
            addCriterion("main_category_id =", value, "mainCategoryId");
            return (Criteria) this;
        }

        public Criteria andMainCategoryIdNotEqualTo(java.lang.Integer value) {
            addCriterion("main_category_id <>", value, "mainCategoryId");
            return (Criteria) this;
        }

        public Criteria andMainCategoryIdGreaterThan(java.lang.Integer value) {
            addCriterion("main_category_id >", value, "mainCategoryId");
            return (Criteria) this;
        }

        public Criteria andMainCategoryIdGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("main_category_id >=", value, "main_category_id");
            return (Criteria) this;
        }

        public Criteria andMainCategoryIdLessThan(java.lang.Integer value) {
            addCriterion("main_category_id <", value, "mainCategoryId");
            return (Criteria) this;
        }

        public Criteria andMainCategoryIdLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("main_category_id <=", value, "mainCategoryId");
            return (Criteria) this;
        }


        public Criteria andMainCategoryIdIn(List<java.lang.Integer > values) {
            addCriterion("main_category_id in", values, "mainCategoryId");
            return (Criteria) this;
        }

        public Criteria andMainCategoryIdNotIn(List<java.lang.Integer> values) {
            addCriterion("main_category_id not in", values, "mainCategoryId");
            return (Criteria) this;
        }

        public Criteria andMainCategoryIdBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("main_category_id between", value1, value2, "mainCategoryId");
            return (Criteria) this;
        }

        public Criteria andMainCategoryIdNotBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("main_category_id not between", value1, value2, "mainCategoryId");
            return (Criteria) this;
        }



        public Criteria andSubCategoryIdIsNull() {
            addCriterion("subCategoryId is null");
            return (Criteria) this;
        }


        public Criteria andSubCategoryIdIsNotNull() {
            addCriterion("subCategoryId is not null");
            return (Criteria) this;
        }

        public Criteria andSubCategoryIdEqualTo(java.lang.Integer value) {
            addCriterion("sub_category_id =", value, "subCategoryId");
            return (Criteria) this;
        }

        public Criteria andSubCategoryIdNotEqualTo(java.lang.Integer value) {
            addCriterion("sub_category_id <>", value, "subCategoryId");
            return (Criteria) this;
        }

        public Criteria andSubCategoryIdGreaterThan(java.lang.Integer value) {
            addCriterion("sub_category_id >", value, "subCategoryId");
            return (Criteria) this;
        }

        public Criteria andSubCategoryIdGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("sub_category_id >=", value, "sub_category_id");
            return (Criteria) this;
        }

        public Criteria andSubCategoryIdLessThan(java.lang.Integer value) {
            addCriterion("sub_category_id <", value, "subCategoryId");
            return (Criteria) this;
        }

        public Criteria andSubCategoryIdLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("sub_category_id <=", value, "subCategoryId");
            return (Criteria) this;
        }


        public Criteria andSubCategoryIdIn(List<java.lang.Integer > values) {
            addCriterion("sub_category_id in", values, "subCategoryId");
            return (Criteria) this;
        }

        public Criteria andSubCategoryIdNotIn(List<java.lang.Integer> values) {
            addCriterion("sub_category_id not in", values, "subCategoryId");
            return (Criteria) this;
        }

        public Criteria andSubCategoryIdBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("sub_category_id between", value1, value2, "subCategoryId");
            return (Criteria) this;
        }

        public Criteria andSubCategoryIdNotBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("sub_category_id not between", value1, value2, "subCategoryId");
            return (Criteria) this;
        }



        public Criteria andBatteryIsNull() {
            addCriterion("battery is null");
            return (Criteria) this;
        }


        public Criteria andBatteryIsNotNull() {
            addCriterion("battery is not null");
            return (Criteria) this;
        }

        public Criteria andBatteryEqualTo(java.lang.Integer value) {
            addCriterion("battery =", value, "battery");
            return (Criteria) this;
        }

        public Criteria andBatteryNotEqualTo(java.lang.Integer value) {
            addCriterion("battery <>", value, "battery");
            return (Criteria) this;
        }

        public Criteria andBatteryGreaterThan(java.lang.Integer value) {
            addCriterion("battery >", value, "battery");
            return (Criteria) this;
        }

        public Criteria andBatteryGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("battery >=", value, "battery");
            return (Criteria) this;
        }

        public Criteria andBatteryLessThan(java.lang.Integer value) {
            addCriterion("battery <", value, "battery");
            return (Criteria) this;
        }

        public Criteria andBatteryLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("battery <=", value, "battery");
            return (Criteria) this;
        }


        public Criteria andBatteryIn(List<java.lang.Integer > values) {
            addCriterion("battery in", values, "battery");
            return (Criteria) this;
        }

        public Criteria andBatteryNotIn(List<java.lang.Integer> values) {
            addCriterion("battery not in", values, "battery");
            return (Criteria) this;
        }

        public Criteria andBatteryBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("battery between", value1, value2, "battery");
            return (Criteria) this;
        }

        public Criteria andBatteryNotBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("battery not between", value1, value2, "battery");
            return (Criteria) this;
        }



        public Criteria andWarrantyIsNull() {
            addCriterion("warranty is null");
            return (Criteria) this;
        }


        public Criteria andWarrantyIsNotNull() {
            addCriterion("warranty is not null");
            return (Criteria) this;
        }

        public Criteria andWarrantyEqualTo(java.lang.Integer value) {
            addCriterion("warranty =", value, "warranty");
            return (Criteria) this;
        }

        public Criteria andWarrantyNotEqualTo(java.lang.Integer value) {
            addCriterion("warranty <>", value, "warranty");
            return (Criteria) this;
        }

        public Criteria andWarrantyGreaterThan(java.lang.Integer value) {
            addCriterion("warranty >", value, "warranty");
            return (Criteria) this;
        }

        public Criteria andWarrantyGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("warranty >=", value, "warranty");
            return (Criteria) this;
        }

        public Criteria andWarrantyLessThan(java.lang.Integer value) {
            addCriterion("warranty <", value, "warranty");
            return (Criteria) this;
        }

        public Criteria andWarrantyLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("warranty <=", value, "warranty");
            return (Criteria) this;
        }


        public Criteria andWarrantyIn(List<java.lang.Integer > values) {
            addCriterion("warranty in", values, "warranty");
            return (Criteria) this;
        }

        public Criteria andWarrantyNotIn(List<java.lang.Integer> values) {
            addCriterion("warranty not in", values, "warranty");
            return (Criteria) this;
        }

        public Criteria andWarrantyBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("warranty between", value1, value2, "warranty");
            return (Criteria) this;
        }

        public Criteria andWarrantyNotBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("warranty not between", value1, value2, "warranty");
            return (Criteria) this;
        }



        public Criteria andRmacategoryidIsNull() {
            addCriterion("rmacategoryid is null");
            return (Criteria) this;
        }


        public Criteria andRmacategoryidIsNotNull() {
            addCriterion("rmacategoryid is not null");
            return (Criteria) this;
        }

        public Criteria andRmacategoryidEqualTo(java.lang.Integer value) {
            addCriterion("rmacategoryid =", value, "rmacategoryid");
            return (Criteria) this;
        }

        public Criteria andRmacategoryidNotEqualTo(java.lang.Integer value) {
            addCriterion("rmacategoryid <>", value, "rmacategoryid");
            return (Criteria) this;
        }

        public Criteria andRmacategoryidGreaterThan(java.lang.Integer value) {
            addCriterion("rmacategoryid >", value, "rmacategoryid");
            return (Criteria) this;
        }

        public Criteria andRmacategoryidGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("rmacategoryid >=", value, "rmacategoryid");
            return (Criteria) this;
        }

        public Criteria andRmacategoryidLessThan(java.lang.Integer value) {
            addCriterion("rmacategoryid <", value, "rmacategoryid");
            return (Criteria) this;
        }

        public Criteria andRmacategoryidLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("rmacategoryid <=", value, "rmacategoryid");
            return (Criteria) this;
        }


        public Criteria andRmacategoryidIn(List<java.lang.Integer > values) {
            addCriterion("rmacategoryid in", values, "rmacategoryid");
            return (Criteria) this;
        }

        public Criteria andRmacategoryidNotIn(List<java.lang.Integer> values) {
            addCriterion("rmacategoryid not in", values, "rmacategoryid");
            return (Criteria) this;
        }

        public Criteria andRmacategoryidBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("rmacategoryid between", value1, value2, "rmacategoryid");
            return (Criteria) this;
        }

        public Criteria andRmacategoryidNotBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("rmacategoryid not between", value1, value2, "rmacategoryid");
            return (Criteria) this;
        }



        public Criteria andMagneticIsNull() {
            addCriterion("magnetic is null");
            return (Criteria) this;
        }


        public Criteria andMagneticIsNotNull() {
            addCriterion("magnetic is not null");
            return (Criteria) this;
        }

        public Criteria andMagneticEqualTo(java.lang.Integer value) {
            addCriterion("magnetic =", value, "magnetic");
            return (Criteria) this;
        }

        public Criteria andMagneticNotEqualTo(java.lang.Integer value) {
            addCriterion("magnetic <>", value, "magnetic");
            return (Criteria) this;
        }

        public Criteria andMagneticGreaterThan(java.lang.Integer value) {
            addCriterion("magnetic >", value, "magnetic");
            return (Criteria) this;
        }

        public Criteria andMagneticGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("magnetic >=", value, "magnetic");
            return (Criteria) this;
        }

        public Criteria andMagneticLessThan(java.lang.Integer value) {
            addCriterion("magnetic <", value, "magnetic");
            return (Criteria) this;
        }

        public Criteria andMagneticLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("magnetic <=", value, "magnetic");
            return (Criteria) this;
        }


        public Criteria andMagneticIn(List<java.lang.Integer > values) {
            addCriterion("magnetic in", values, "magnetic");
            return (Criteria) this;
        }

        public Criteria andMagneticNotIn(List<java.lang.Integer> values) {
            addCriterion("magnetic not in", values, "magnetic");
            return (Criteria) this;
        }

        public Criteria andMagneticBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("magnetic between", value1, value2, "magnetic");
            return (Criteria) this;
        }

        public Criteria andMagneticNotBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("magnetic not between", value1, value2, "magnetic");
            return (Criteria) this;
        }



        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }


        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(java.lang.String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(java.lang.String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(java.lang.String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(java.lang.String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(java.lang.String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(java.lang.String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }


        public Criteria andRemarkIn(List<java.lang.String > values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<java.lang.String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }



        public Criteria andCreateUserIsNull() {
            addCriterion("createUser is null");
            return (Criteria) this;
        }


        public Criteria andCreateUserIsNotNull() {
            addCriterion("createUser is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserEqualTo(java.lang.Integer value) {
            addCriterion("create_user =", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotEqualTo(java.lang.Integer value) {
            addCriterion("create_user <>", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThan(java.lang.Integer value) {
            addCriterion("create_user >", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("create_user >=", value, "create_user");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThan(java.lang.Integer value) {
            addCriterion("create_user <", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("create_user <=", value, "createUser");
            return (Criteria) this;
        }


        public Criteria andCreateUserIn(List<java.lang.Integer > values) {
            addCriterion("create_user in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotIn(List<java.lang.Integer> values) {
            addCriterion("create_user not in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("create_user between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("create_user not between", value1, value2, "createUser");
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



        public Criteria andUpdateUserIsNull() {
            addCriterion("updateUser is null");
            return (Criteria) this;
        }


        public Criteria andUpdateUserIsNotNull() {
            addCriterion("updateUser is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserEqualTo(java.lang.Integer value) {
            addCriterion("update_user =", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotEqualTo(java.lang.Integer value) {
            addCriterion("update_user <>", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThan(java.lang.Integer value) {
            addCriterion("update_user >", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("update_user >=", value, "update_user");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThan(java.lang.Integer value) {
            addCriterion("update_user <", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("update_user <=", value, "updateUser");
            return (Criteria) this;
        }


        public Criteria andUpdateUserIn(List<java.lang.Integer > values) {
            addCriterion("update_user in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotIn(List<java.lang.Integer> values) {
            addCriterion("update_user not in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("update_user between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("update_user not between", value1, value2, "updateUser");
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