package com.sunvalley.erp.product.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.math.BigDecimal;

/**
* @Description: SalesPlanCostExample
* @author
* @date 2017-10-12 04:27:00
*/
public class SalesPlanCostExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private int pageIndex;

    private int pageSize;

    public SalesPlanCostExample() {
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

    public SalesPlanCostExample(int pageSize, int pageIndex) {
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



        public Criteria andSkuIsNull() {
            addCriterion("sku is null");
            return (Criteria) this;
        }


        public Criteria andSkuIsNotNull() {
            addCriterion("sku is not null");
            return (Criteria) this;
        }

        public Criteria andSkuEqualTo(java.lang.String value) {
            addCriterion("sku =", value, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuNotEqualTo(java.lang.String value) {
            addCriterion("sku <>", value, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuGreaterThan(java.lang.String value) {
            addCriterion("sku >", value, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuGreaterThanOrEqualTo(java.lang.String value) {
            addCriterion("sku >=", value, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuLessThan(java.lang.String value) {
            addCriterion("sku <", value, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuLessThanOrEqualTo(java.lang.String value) {
            addCriterion("sku <=", value, "sku");
            return (Criteria) this;
        }


        public Criteria andSkuIn(List<java.lang.String > values) {
            addCriterion("sku in", values, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuNotIn(List<java.lang.String> values) {
            addCriterion("sku not in", values, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("sku between", value1, value2, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuNotBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("sku not between", value1, value2, "sku");
            return (Criteria) this;
        }



        public Criteria andSkuTypeIsNull() {
            addCriterion("skuType is null");
            return (Criteria) this;
        }


        public Criteria andSkuTypeIsNotNull() {
            addCriterion("skuType is not null");
            return (Criteria) this;
        }

        public Criteria andSkuTypeEqualTo(java.lang.Integer value) {
            addCriterion("sku_type =", value, "skuType");
            return (Criteria) this;
        }

        public Criteria andSkuTypeNotEqualTo(java.lang.Integer value) {
            addCriterion("sku_type <>", value, "skuType");
            return (Criteria) this;
        }

        public Criteria andSkuTypeGreaterThan(java.lang.Integer value) {
            addCriterion("sku_type >", value, "skuType");
            return (Criteria) this;
        }

        public Criteria andSkuTypeGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("sku_type >=", value, "sku_type");
            return (Criteria) this;
        }

        public Criteria andSkuTypeLessThan(java.lang.Integer value) {
            addCriterion("sku_type <", value, "skuType");
            return (Criteria) this;
        }

        public Criteria andSkuTypeLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("sku_type <=", value, "skuType");
            return (Criteria) this;
        }


        public Criteria andSkuTypeIn(List<java.lang.Integer > values) {
            addCriterion("sku_type in", values, "skuType");
            return (Criteria) this;
        }

        public Criteria andSkuTypeNotIn(List<java.lang.Integer> values) {
            addCriterion("sku_type not in", values, "skuType");
            return (Criteria) this;
        }

        public Criteria andSkuTypeBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("sku_type between", value1, value2, "skuType");
            return (Criteria) this;
        }

        public Criteria andSkuTypeNotBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("sku_type not between", value1, value2, "skuType");
            return (Criteria) this;
        }



        public Criteria andModelIsNull() {
            addCriterion("model is null");
            return (Criteria) this;
        }


        public Criteria andModelIsNotNull() {
            addCriterion("model is not null");
            return (Criteria) this;
        }

        public Criteria andModelEqualTo(java.lang.String value) {
            addCriterion("model =", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotEqualTo(java.lang.String value) {
            addCriterion("model <>", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThan(java.lang.String value) {
            addCriterion("model >", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThanOrEqualTo(java.lang.String value) {
            addCriterion("model >=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThan(java.lang.String value) {
            addCriterion("model <", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThanOrEqualTo(java.lang.String value) {
            addCriterion("model <=", value, "model");
            return (Criteria) this;
        }


        public Criteria andModelIn(List<java.lang.String > values) {
            addCriterion("model in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotIn(List<java.lang.String> values) {
            addCriterion("model not in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("model between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("model not between", value1, value2, "model");
            return (Criteria) this;
        }



        public Criteria andCountryIsNull() {
            addCriterion("country is null");
            return (Criteria) this;
        }


        public Criteria andCountryIsNotNull() {
            addCriterion("country is not null");
            return (Criteria) this;
        }

        public Criteria andCountryEqualTo(java.lang.String value) {
            addCriterion("country =", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotEqualTo(java.lang.String value) {
            addCriterion("country <>", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThan(java.lang.String value) {
            addCriterion("country >", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThanOrEqualTo(java.lang.String value) {
            addCriterion("country >=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThan(java.lang.String value) {
            addCriterion("country <", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThanOrEqualTo(java.lang.String value) {
            addCriterion("country <=", value, "country");
            return (Criteria) this;
        }


        public Criteria andCountryIn(List<java.lang.String > values) {
            addCriterion("country in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotIn(List<java.lang.String> values) {
            addCriterion("country not in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("country between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("country not between", value1, value2, "country");
            return (Criteria) this;
        }



        public Criteria andCommissionRateIsNull() {
            addCriterion("commissionRate is null");
            return (Criteria) this;
        }


        public Criteria andCommissionRateIsNotNull() {
            addCriterion("commissionRate is not null");
            return (Criteria) this;
        }

        public Criteria andCommissionRateEqualTo(BigDecimal value) {
            addCriterion("commission_rate =", value, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateNotEqualTo(BigDecimal value) {
            addCriterion("commission_rate <>", value, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateGreaterThan(BigDecimal value) {
            addCriterion("commission_rate >", value, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("commission_rate >=", value, "commission_rate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateLessThan(BigDecimal value) {
            addCriterion("commission_rate <", value, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("commission_rate <=", value, "commissionRate");
            return (Criteria) this;
        }


        public Criteria andCommissionRateIn(List<BigDecimal > values) {
            addCriterion("commission_rate in", values, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateNotIn(List<BigDecimal> values) {
            addCriterion("commission_rate not in", values, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("commission_rate between", value1, value2, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("commission_rate not between", value1, value2, "commissionRate");
            return (Criteria) this;
        }



        public Criteria andFbaCostIsNull() {
            addCriterion("fbaCost is null");
            return (Criteria) this;
        }


        public Criteria andFbaCostIsNotNull() {
            addCriterion("fbaCost is not null");
            return (Criteria) this;
        }

        public Criteria andFbaCostEqualTo(BigDecimal value) {
            addCriterion("fba_cost =", value, "fbaCost");
            return (Criteria) this;
        }

        public Criteria andFbaCostNotEqualTo(BigDecimal value) {
            addCriterion("fba_cost <>", value, "fbaCost");
            return (Criteria) this;
        }

        public Criteria andFbaCostGreaterThan(BigDecimal value) {
            addCriterion("fba_cost >", value, "fbaCost");
            return (Criteria) this;
        }

        public Criteria andFbaCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fba_cost >=", value, "fba_cost");
            return (Criteria) this;
        }

        public Criteria andFbaCostLessThan(BigDecimal value) {
            addCriterion("fba_cost <", value, "fbaCost");
            return (Criteria) this;
        }

        public Criteria andFbaCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fba_cost <=", value, "fbaCost");
            return (Criteria) this;
        }


        public Criteria andFbaCostIn(List<BigDecimal > values) {
            addCriterion("fba_cost in", values, "fbaCost");
            return (Criteria) this;
        }

        public Criteria andFbaCostNotIn(List<BigDecimal> values) {
            addCriterion("fba_cost not in", values, "fbaCost");
            return (Criteria) this;
        }

        public Criteria andFbaCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fba_cost between", value1, value2, "fbaCost");
            return (Criteria) this;
        }

        public Criteria andFbaCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fba_cost not between", value1, value2, "fbaCost");
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



        public Criteria andCreateTimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }


        public Criteria andCreateTimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(java.util.Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(java.util.Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(java.util.Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(java.util.Date value) {
            addCriterion("create_time >=", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(java.util.Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(java.util.Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }


        public Criteria andCreateTimeIn(List<java.util.Date > values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<java.util.Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(java.util.Date value1, java.util.Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(java.util.Date value1, java.util.Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
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



        public Criteria andUpdateTimeIsNull() {
            addCriterion("updateTime is null");
            return (Criteria) this;
        }


        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("updateTime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(java.util.Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(java.util.Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(java.util.Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(java.util.Date value) {
            addCriterion("update_time >=", value, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(java.util.Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(java.util.Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }


        public Criteria andUpdateTimeIn(List<java.util.Date > values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<java.util.Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(java.util.Date value1, java.util.Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(java.util.Date value1, java.util.Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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



        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }


        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(java.lang.String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(java.lang.String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(java.lang.String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(java.lang.String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(java.lang.String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(java.lang.String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }


        public Criteria andStatusIn(List<java.lang.String > values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<java.lang.String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }



        public Criteria andVatTaxRateIsNull() {
            addCriterion("vatTaxRate is null");
            return (Criteria) this;
        }


        public Criteria andVatTaxRateIsNotNull() {
            addCriterion("vatTaxRate is not null");
            return (Criteria) this;
        }

        public Criteria andVatTaxRateEqualTo(BigDecimal value) {
            addCriterion("vat_tax_rate =", value, "vatTaxRate");
            return (Criteria) this;
        }

        public Criteria andVatTaxRateNotEqualTo(BigDecimal value) {
            addCriterion("vat_tax_rate <>", value, "vatTaxRate");
            return (Criteria) this;
        }

        public Criteria andVatTaxRateGreaterThan(BigDecimal value) {
            addCriterion("vat_tax_rate >", value, "vatTaxRate");
            return (Criteria) this;
        }

        public Criteria andVatTaxRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("vat_tax_rate >=", value, "vat_tax_rate");
            return (Criteria) this;
        }

        public Criteria andVatTaxRateLessThan(BigDecimal value) {
            addCriterion("vat_tax_rate <", value, "vatTaxRate");
            return (Criteria) this;
        }

        public Criteria andVatTaxRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("vat_tax_rate <=", value, "vatTaxRate");
            return (Criteria) this;
        }


        public Criteria andVatTaxRateIn(List<BigDecimal > values) {
            addCriterion("vat_tax_rate in", values, "vatTaxRate");
            return (Criteria) this;
        }

        public Criteria andVatTaxRateNotIn(List<BigDecimal> values) {
            addCriterion("vat_tax_rate not in", values, "vatTaxRate");
            return (Criteria) this;
        }

        public Criteria andVatTaxRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("vat_tax_rate between", value1, value2, "vatTaxRate");
            return (Criteria) this;
        }

        public Criteria andVatTaxRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("vat_tax_rate not between", value1, value2, "vatTaxRate");
            return (Criteria) this;
        }



        public Criteria andSkuidIsNull() {
            addCriterion("skuid is null");
            return (Criteria) this;
        }


        public Criteria andSkuidIsNotNull() {
            addCriterion("skuid is not null");
            return (Criteria) this;
        }

        public Criteria andSkuidEqualTo(java.lang.Integer value) {
            addCriterion("skuid =", value, "skuid");
            return (Criteria) this;
        }

        public Criteria andSkuidNotEqualTo(java.lang.Integer value) {
            addCriterion("skuid <>", value, "skuid");
            return (Criteria) this;
        }

        public Criteria andSkuidGreaterThan(java.lang.Integer value) {
            addCriterion("skuid >", value, "skuid");
            return (Criteria) this;
        }

        public Criteria andSkuidGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("skuid >=", value, "skuid");
            return (Criteria) this;
        }

        public Criteria andSkuidLessThan(java.lang.Integer value) {
            addCriterion("skuid <", value, "skuid");
            return (Criteria) this;
        }

        public Criteria andSkuidLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("skuid <=", value, "skuid");
            return (Criteria) this;
        }


        public Criteria andSkuidIn(List<java.lang.Integer > values) {
            addCriterion("skuid in", values, "skuid");
            return (Criteria) this;
        }

        public Criteria andSkuidNotIn(List<java.lang.Integer> values) {
            addCriterion("skuid not in", values, "skuid");
            return (Criteria) this;
        }

        public Criteria andSkuidBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("skuid between", value1, value2, "skuid");
            return (Criteria) this;
        }

        public Criteria andSkuidNotBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("skuid not between", value1, value2, "skuid");
            return (Criteria) this;
        }



        public Criteria andShipTypeIsNull() {
            addCriterion("shipType is null");
            return (Criteria) this;
        }


        public Criteria andShipTypeIsNotNull() {
            addCriterion("shipType is not null");
            return (Criteria) this;
        }

        public Criteria andShipTypeEqualTo(Integer value) {
            addCriterion("ship_type =", value, "shipType");
            return (Criteria) this;
        }

        public Criteria andShipTypeNotEqualTo(Integer value) {
            addCriterion("ship_type <>", value, "shipType");
            return (Criteria) this;
        }

        public Criteria andShipTypeGreaterThan(Integer value) {
            addCriterion("ship_type >", value, "shipType");
            return (Criteria) this;
        }

        public Criteria andShipTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ship_type >=", value, "ship_type");
            return (Criteria) this;
        }

        public Criteria andShipTypeLessThan(Integer value) {
            addCriterion("ship_type <", value, "shipType");
            return (Criteria) this;
        }

        public Criteria andShipTypeLessThanOrEqualTo(Integer value) {
            addCriterion("ship_type <=", value, "shipType");
            return (Criteria) this;
        }


        public Criteria andShipTypeIn(List<Integer > values) {
            addCriterion("ship_type in", values, "shipType");
            return (Criteria) this;
        }

        public Criteria andShipTypeNotIn(List<Integer> values) {
            addCriterion("ship_type not in", values, "shipType");
            return (Criteria) this;
        }

        public Criteria andShipTypeBetween(Integer value1, Integer value2) {
            addCriterion("ship_type between", value1, value2, "shipType");
            return (Criteria) this;
        }

        public Criteria andShipTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("ship_type not between", value1, value2, "shipType");
            return (Criteria) this;
        }



        public Criteria andPurchaseCycleIsNull() {
            addCriterion("purchaseCycle is null");
            return (Criteria) this;
        }


        public Criteria andPurchaseCycleIsNotNull() {
            addCriterion("purchaseCycle is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseCycleEqualTo(java.lang.Integer value) {
            addCriterion("purchase_cycle =", value, "purchaseCycle");
            return (Criteria) this;
        }

        public Criteria andPurchaseCycleNotEqualTo(java.lang.Integer value) {
            addCriterion("purchase_cycle <>", value, "purchaseCycle");
            return (Criteria) this;
        }

        public Criteria andPurchaseCycleGreaterThan(java.lang.Integer value) {
            addCriterion("purchase_cycle >", value, "purchaseCycle");
            return (Criteria) this;
        }

        public Criteria andPurchaseCycleGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("purchase_cycle >=", value, "purchase_cycle");
            return (Criteria) this;
        }

        public Criteria andPurchaseCycleLessThan(java.lang.Integer value) {
            addCriterion("purchase_cycle <", value, "purchaseCycle");
            return (Criteria) this;
        }

        public Criteria andPurchaseCycleLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("purchase_cycle <=", value, "purchaseCycle");
            return (Criteria) this;
        }


        public Criteria andPurchaseCycleIn(List<java.lang.Integer > values) {
            addCriterion("purchase_cycle in", values, "purchaseCycle");
            return (Criteria) this;
        }

        public Criteria andPurchaseCycleNotIn(List<java.lang.Integer> values) {
            addCriterion("purchase_cycle not in", values, "purchaseCycle");
            return (Criteria) this;
        }

        public Criteria andPurchaseCycleBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("purchase_cycle between", value1, value2, "purchaseCycle");
            return (Criteria) this;
        }

        public Criteria andPurchaseCycleNotBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("purchase_cycle not between", value1, value2, "purchaseCycle");
            return (Criteria) this;
        }



        public Criteria andCalMonthIsNull() {
            addCriterion("calMonth is null");
            return (Criteria) this;
        }


        public Criteria andCalMonthIsNotNull() {
            addCriterion("calMonth is not null");
            return (Criteria) this;
        }

        public Criteria andCalMonthEqualTo(BigDecimal value) {
            addCriterion("cal_month =", value, "calMonth");
            return (Criteria) this;
        }

        public Criteria andCalMonthNotEqualTo(BigDecimal value) {
            addCriterion("cal_month <>", value, "calMonth");
            return (Criteria) this;
        }

        public Criteria andCalMonthGreaterThan(BigDecimal value) {
            addCriterion("cal_month >", value, "calMonth");
            return (Criteria) this;
        }

        public Criteria andCalMonthGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cal_month >=", value, "cal_month");
            return (Criteria) this;
        }

        public Criteria andCalMonthLessThan(BigDecimal value) {
            addCriterion("cal_month <", value, "calMonth");
            return (Criteria) this;
        }

        public Criteria andCalMonthLessThanOrEqualTo(BigDecimal value) {
            addCriterion("cal_month <=", value, "calMonth");
            return (Criteria) this;
        }


        public Criteria andCalMonthIn(List<BigDecimal > values) {
            addCriterion("cal_month in", values, "calMonth");
            return (Criteria) this;
        }

        public Criteria andCalMonthNotIn(List<BigDecimal> values) {
            addCriterion("cal_month not in", values, "calMonth");
            return (Criteria) this;
        }

        public Criteria andCalMonthBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cal_month between", value1, value2, "calMonth");
            return (Criteria) this;
        }

        public Criteria andCalMonthNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cal_month not between", value1, value2, "calMonth");
            return (Criteria) this;
        }



        public Criteria andIsDirectShipmentsIsNull() {
            addCriterion("isDirectShipments is null");
            return (Criteria) this;
        }


        public Criteria andIsDirectShipmentsIsNotNull() {
            addCriterion("isDirectShipments is not null");
            return (Criteria) this;
        }

        public Criteria andIsDirectShipmentsEqualTo(Integer value) {
            addCriterion("is_direct_shipments =", value, "isDirectShipments");
            return (Criteria) this;
        }

        public Criteria andIsDirectShipmentsNotEqualTo(Integer value) {
            addCriterion("is_direct_shipments <>", value, "isDirectShipments");
            return (Criteria) this;
        }

        public Criteria andIsDirectShipmentsGreaterThan(Integer value) {
            addCriterion("is_direct_shipments >", value, "isDirectShipments");
            return (Criteria) this;
        }

        public Criteria andIsDirectShipmentsGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_direct_shipments >=", value, "is_direct_shipments");
            return (Criteria) this;
        }

        public Criteria andIsDirectShipmentsLessThan(Integer value) {
            addCriterion("is_direct_shipments <", value, "isDirectShipments");
            return (Criteria) this;
        }

        public Criteria andIsDirectShipmentsLessThanOrEqualTo(Integer value) {
            addCriterion("is_direct_shipments <=", value, "isDirectShipments");
            return (Criteria) this;
        }


        public Criteria andIsDirectShipmentsIn(List<Integer > values) {
            addCriterion("is_direct_shipments in", values, "isDirectShipments");
            return (Criteria) this;
        }

        public Criteria andIsDirectShipmentsNotIn(List<Integer> values) {
            addCriterion("is_direct_shipments not in", values, "isDirectShipments");
            return (Criteria) this;
        }

        public Criteria andIsDirectShipmentsBetween(Integer value1, Integer value2) {
            addCriterion("is_direct_shipments between", value1, value2, "isDirectShipments");
            return (Criteria) this;
        }

        public Criteria andIsDirectShipmentsNotBetween(Integer value1, Integer value2) {
            addCriterion("is_direct_shipments not between", value1, value2, "isDirectShipments");
            return (Criteria) this;
        }



        public Criteria andIsOutsideDetectIsNull() {
            addCriterion("isOutsideDetect is null");
            return (Criteria) this;
        }


        public Criteria andIsOutsideDetectIsNotNull() {
            addCriterion("isOutsideDetect is not null");
            return (Criteria) this;
        }

        public Criteria andIsOutsideDetectEqualTo(Integer value) {
            addCriterion("is_outside_detect =", value, "isOutsideDetect");
            return (Criteria) this;
        }

        public Criteria andIsOutsideDetectNotEqualTo(Integer value) {
            addCriterion("is_outside_detect <>", value, "isOutsideDetect");
            return (Criteria) this;
        }

        public Criteria andIsOutsideDetectGreaterThan(Integer value) {
            addCriterion("is_outside_detect >", value, "isOutsideDetect");
            return (Criteria) this;
        }

        public Criteria andIsOutsideDetectGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_outside_detect >=", value, "is_outside_detect");
            return (Criteria) this;
        }

        public Criteria andIsOutsideDetectLessThan(Integer value) {
            addCriterion("is_outside_detect <", value, "isOutsideDetect");
            return (Criteria) this;
        }

        public Criteria andIsOutsideDetectLessThanOrEqualTo(Integer value) {
            addCriterion("is_outside_detect <=", value, "isOutsideDetect");
            return (Criteria) this;
        }


        public Criteria andIsOutsideDetectIn(List<Integer > values) {
            addCriterion("is_outside_detect in", values, "isOutsideDetect");
            return (Criteria) this;
        }

        public Criteria andIsOutsideDetectNotIn(List<Integer> values) {
            addCriterion("is_outside_detect not in", values, "isOutsideDetect");
            return (Criteria) this;
        }

        public Criteria andIsOutsideDetectBetween(Integer value1, Integer value2) {
            addCriterion("is_outside_detect between", value1, value2, "isOutsideDetect");
            return (Criteria) this;
        }

        public Criteria andIsOutsideDetectNotBetween(Integer value1, Integer value2) {
            addCriterion("is_outside_detect not between", value1, value2, "isOutsideDetect");
            return (Criteria) this;
        }



        public Criteria andFcstQtyIsNull() {
            addCriterion("fcstQty is null");
            return (Criteria) this;
        }


        public Criteria andFcstQtyIsNotNull() {
            addCriterion("fcstQty is not null");
            return (Criteria) this;
        }

        public Criteria andFcstQtyEqualTo(java.lang.Integer value) {
            addCriterion("fcst_qty =", value, "fcstQty");
            return (Criteria) this;
        }

        public Criteria andFcstQtyNotEqualTo(java.lang.Integer value) {
            addCriterion("fcst_qty <>", value, "fcstQty");
            return (Criteria) this;
        }

        public Criteria andFcstQtyGreaterThan(java.lang.Integer value) {
            addCriterion("fcst_qty >", value, "fcstQty");
            return (Criteria) this;
        }

        public Criteria andFcstQtyGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("fcst_qty >=", value, "fcst_qty");
            return (Criteria) this;
        }

        public Criteria andFcstQtyLessThan(java.lang.Integer value) {
            addCriterion("fcst_qty <", value, "fcstQty");
            return (Criteria) this;
        }

        public Criteria andFcstQtyLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("fcst_qty <=", value, "fcstQty");
            return (Criteria) this;
        }


        public Criteria andFcstQtyIn(List<java.lang.Integer > values) {
            addCriterion("fcst_qty in", values, "fcstQty");
            return (Criteria) this;
        }

        public Criteria andFcstQtyNotIn(List<java.lang.Integer> values) {
            addCriterion("fcst_qty not in", values, "fcstQty");
            return (Criteria) this;
        }

        public Criteria andFcstQtyBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("fcst_qty between", value1, value2, "fcstQty");
            return (Criteria) this;
        }

        public Criteria andFcstQtyNotBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("fcst_qty not between", value1, value2, "fcstQty");
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