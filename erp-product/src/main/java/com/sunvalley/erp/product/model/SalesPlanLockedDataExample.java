package com.sunvalley.erp.product.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.math.BigDecimal;

/**
* @Description: SalesPlanLockedDataExample
* @author
* @date 2017-09-25 03:10:47
*/
public class SalesPlanLockedDataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private int pageIndex;

    private int pageSize;

    public SalesPlanLockedDataExample() {
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

    public SalesPlanLockedDataExample(int pageSize, int pageIndex) {
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



        public Criteria andOrgIdIsNull() {
            addCriterion("orgId is null");
            return (Criteria) this;
        }


        public Criteria andOrgIdIsNotNull() {
            addCriterion("orgId is not null");
            return (Criteria) this;
        }

        public Criteria andOrgIdEqualTo(java.lang.Integer value) {
            addCriterion("org_id =", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotEqualTo(java.lang.Integer value) {
            addCriterion("org_id <>", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThan(java.lang.Integer value) {
            addCriterion("org_id >", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("org_id >=", value, "org_id");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThan(java.lang.Integer value) {
            addCriterion("org_id <", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("org_id <=", value, "orgId");
            return (Criteria) this;
        }


        public Criteria andOrgIdIn(List<java.lang.Integer > values) {
            addCriterion("org_id in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotIn(List<java.lang.Integer> values) {
            addCriterion("org_id not in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("org_id between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("org_id not between", value1, value2, "orgId");
            return (Criteria) this;
        }



        public Criteria andSalesPlanVersionIsNull() {
            addCriterion("salesPlanVersion is null");
            return (Criteria) this;
        }


        public Criteria andSalesPlanVersionIsNotNull() {
            addCriterion("salesPlanVersion is not null");
            return (Criteria) this;
        }

        public Criteria andSalesPlanVersionEqualTo(java.lang.Integer value) {
            addCriterion("sales_plan_version =", value, "salesPlanVersion");
            return (Criteria) this;
        }

        public Criteria andSalesPlanVersionNotEqualTo(java.lang.Integer value) {
            addCriterion("sales_plan_version <>", value, "salesPlanVersion");
            return (Criteria) this;
        }

        public Criteria andSalesPlanVersionGreaterThan(java.lang.Integer value) {
            addCriterion("sales_plan_version >", value, "salesPlanVersion");
            return (Criteria) this;
        }

        public Criteria andSalesPlanVersionGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("sales_plan_version >=", value, "sales_plan_version");
            return (Criteria) this;
        }

        public Criteria andSalesPlanVersionLessThan(java.lang.Integer value) {
            addCriterion("sales_plan_version <", value, "salesPlanVersion");
            return (Criteria) this;
        }

        public Criteria andSalesPlanVersionLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("sales_plan_version <=", value, "salesPlanVersion");
            return (Criteria) this;
        }


        public Criteria andSalesPlanVersionIn(List<java.lang.Integer > values) {
            addCriterion("sales_plan_version in", values, "salesPlanVersion");
            return (Criteria) this;
        }

        public Criteria andSalesPlanVersionNotIn(List<java.lang.Integer> values) {
            addCriterion("sales_plan_version not in", values, "salesPlanVersion");
            return (Criteria) this;
        }

        public Criteria andSalesPlanVersionBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("sales_plan_version between", value1, value2, "salesPlanVersion");
            return (Criteria) this;
        }

        public Criteria andSalesPlanVersionNotBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("sales_plan_version not between", value1, value2, "salesPlanVersion");
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



        public Criteria andPurPecIsNull() {
            addCriterion("purPec is null");
            return (Criteria) this;
        }


        public Criteria andPurPecIsNotNull() {
            addCriterion("purPec is not null");
            return (Criteria) this;
        }

        public Criteria andPurPecEqualTo(java.lang.String value) {
            addCriterion("pur_pec =", value, "purPec");
            return (Criteria) this;
        }

        public Criteria andPurPecNotEqualTo(java.lang.String value) {
            addCriterion("pur_pec <>", value, "purPec");
            return (Criteria) this;
        }

        public Criteria andPurPecGreaterThan(java.lang.String value) {
            addCriterion("pur_pec >", value, "purPec");
            return (Criteria) this;
        }

        public Criteria andPurPecGreaterThanOrEqualTo(java.lang.String value) {
            addCriterion("pur_pec >=", value, "pur_pec");
            return (Criteria) this;
        }

        public Criteria andPurPecLessThan(java.lang.String value) {
            addCriterion("pur_pec <", value, "purPec");
            return (Criteria) this;
        }

        public Criteria andPurPecLessThanOrEqualTo(java.lang.String value) {
            addCriterion("pur_pec <=", value, "purPec");
            return (Criteria) this;
        }


        public Criteria andPurPecIn(List<java.lang.String > values) {
            addCriterion("pur_pec in", values, "purPec");
            return (Criteria) this;
        }

        public Criteria andPurPecNotIn(List<java.lang.String> values) {
            addCriterion("pur_pec not in", values, "purPec");
            return (Criteria) this;
        }

        public Criteria andPurPecBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("pur_pec between", value1, value2, "purPec");
            return (Criteria) this;
        }

        public Criteria andPurPecNotBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("pur_pec not between", value1, value2, "purPec");
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



        public Criteria andCurrencyIsNull() {
            addCriterion("currency is null");
            return (Criteria) this;
        }


        public Criteria andCurrencyIsNotNull() {
            addCriterion("currency is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencyEqualTo(java.lang.String value) {
            addCriterion("currency =", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotEqualTo(java.lang.String value) {
            addCriterion("currency <>", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyGreaterThan(java.lang.String value) {
            addCriterion("currency >", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyGreaterThanOrEqualTo(java.lang.String value) {
            addCriterion("currency >=", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLessThan(java.lang.String value) {
            addCriterion("currency <", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLessThanOrEqualTo(java.lang.String value) {
            addCriterion("currency <=", value, "currency");
            return (Criteria) this;
        }


        public Criteria andCurrencyIn(List<java.lang.String > values) {
            addCriterion("currency in", values, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotIn(List<java.lang.String> values) {
            addCriterion("currency not in", values, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("currency between", value1, value2, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("currency not between", value1, value2, "currency");
            return (Criteria) this;
        }



        public Criteria andExchangeRateVersionIsNull() {
            addCriterion("exchangeRateVersion is null");
            return (Criteria) this;
        }


        public Criteria andExchangeRateVersionIsNotNull() {
            addCriterion("exchangeRateVersion is not null");
            return (Criteria) this;
        }

        public Criteria andExchangeRateVersionEqualTo(java.lang.Integer value) {
            addCriterion("exchange_rate_version =", value, "exchangeRateVersion");
            return (Criteria) this;
        }

        public Criteria andExchangeRateVersionNotEqualTo(java.lang.Integer value) {
            addCriterion("exchange_rate_version <>", value, "exchangeRateVersion");
            return (Criteria) this;
        }

        public Criteria andExchangeRateVersionGreaterThan(java.lang.Integer value) {
            addCriterion("exchange_rate_version >", value, "exchangeRateVersion");
            return (Criteria) this;
        }

        public Criteria andExchangeRateVersionGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("exchange_rate_version >=", value, "exchange_rate_version");
            return (Criteria) this;
        }

        public Criteria andExchangeRateVersionLessThan(java.lang.Integer value) {
            addCriterion("exchange_rate_version <", value, "exchangeRateVersion");
            return (Criteria) this;
        }

        public Criteria andExchangeRateVersionLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("exchange_rate_version <=", value, "exchangeRateVersion");
            return (Criteria) this;
        }


        public Criteria andExchangeRateVersionIn(List<java.lang.Integer > values) {
            addCriterion("exchange_rate_version in", values, "exchangeRateVersion");
            return (Criteria) this;
        }

        public Criteria andExchangeRateVersionNotIn(List<java.lang.Integer> values) {
            addCriterion("exchange_rate_version not in", values, "exchangeRateVersion");
            return (Criteria) this;
        }

        public Criteria andExchangeRateVersionBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("exchange_rate_version between", value1, value2, "exchangeRateVersion");
            return (Criteria) this;
        }

        public Criteria andExchangeRateVersionNotBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("exchange_rate_version not between", value1, value2, "exchangeRateVersion");
            return (Criteria) this;
        }



        public Criteria andExchangeRateIsNull() {
            addCriterion("exchangeRate is null");
            return (Criteria) this;
        }


        public Criteria andExchangeRateIsNotNull() {
            addCriterion("exchangeRate is not null");
            return (Criteria) this;
        }

        public Criteria andExchangeRateEqualTo(BigDecimal value) {
            addCriterion("exchange_rate =", value, "exchangeRate");
            return (Criteria) this;
        }

        public Criteria andExchangeRateNotEqualTo(BigDecimal value) {
            addCriterion("exchange_rate <>", value, "exchangeRate");
            return (Criteria) this;
        }

        public Criteria andExchangeRateGreaterThan(BigDecimal value) {
            addCriterion("exchange_rate >", value, "exchangeRate");
            return (Criteria) this;
        }

        public Criteria andExchangeRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("exchange_rate >=", value, "exchange_rate");
            return (Criteria) this;
        }

        public Criteria andExchangeRateLessThan(BigDecimal value) {
            addCriterion("exchange_rate <", value, "exchangeRate");
            return (Criteria) this;
        }

        public Criteria andExchangeRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("exchange_rate <=", value, "exchangeRate");
            return (Criteria) this;
        }


        public Criteria andExchangeRateIn(List<BigDecimal > values) {
            addCriterion("exchange_rate in", values, "exchangeRate");
            return (Criteria) this;
        }

        public Criteria andExchangeRateNotIn(List<BigDecimal> values) {
            addCriterion("exchange_rate not in", values, "exchangeRate");
            return (Criteria) this;
        }

        public Criteria andExchangeRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("exchange_rate between", value1, value2, "exchangeRate");
            return (Criteria) this;
        }

        public Criteria andExchangeRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("exchange_rate not between", value1, value2, "exchangeRate");
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



        public Criteria andRmaRatioIsNull() {
            addCriterion("rmaRatio is null");
            return (Criteria) this;
        }


        public Criteria andRmaRatioIsNotNull() {
            addCriterion("rmaRatio is not null");
            return (Criteria) this;
        }

        public Criteria andRmaRatioEqualTo(BigDecimal value) {
            addCriterion("rma_ratio =", value, "rmaRatio");
            return (Criteria) this;
        }

        public Criteria andRmaRatioNotEqualTo(BigDecimal value) {
            addCriterion("rma_ratio <>", value, "rmaRatio");
            return (Criteria) this;
        }

        public Criteria andRmaRatioGreaterThan(BigDecimal value) {
            addCriterion("rma_ratio >", value, "rmaRatio");
            return (Criteria) this;
        }

        public Criteria andRmaRatioGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("rma_ratio >=", value, "rma_ratio");
            return (Criteria) this;
        }

        public Criteria andRmaRatioLessThan(BigDecimal value) {
            addCriterion("rma_ratio <", value, "rmaRatio");
            return (Criteria) this;
        }

        public Criteria andRmaRatioLessThanOrEqualTo(BigDecimal value) {
            addCriterion("rma_ratio <=", value, "rmaRatio");
            return (Criteria) this;
        }


        public Criteria andRmaRatioIn(List<BigDecimal > values) {
            addCriterion("rma_ratio in", values, "rmaRatio");
            return (Criteria) this;
        }

        public Criteria andRmaRatioNotIn(List<BigDecimal> values) {
            addCriterion("rma_ratio not in", values, "rmaRatio");
            return (Criteria) this;
        }

        public Criteria andRmaRatioBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rma_ratio between", value1, value2, "rmaRatio");
            return (Criteria) this;
        }

        public Criteria andRmaRatioNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rma_ratio not between", value1, value2, "rmaRatio");
            return (Criteria) this;
        }



        public Criteria andRmaFormuleIsNull() {
            addCriterion("rmaFormule is null");
            return (Criteria) this;
        }


        public Criteria andRmaFormuleIsNotNull() {
            addCriterion("rmaFormule is not null");
            return (Criteria) this;
        }

        public Criteria andRmaFormuleEqualTo(java.lang.String value) {
            addCriterion("rma_formule =", value, "rmaFormule");
            return (Criteria) this;
        }

        public Criteria andRmaFormuleNotEqualTo(java.lang.String value) {
            addCriterion("rma_formule <>", value, "rmaFormule");
            return (Criteria) this;
        }

        public Criteria andRmaFormuleGreaterThan(java.lang.String value) {
            addCriterion("rma_formule >", value, "rmaFormule");
            return (Criteria) this;
        }

        public Criteria andRmaFormuleGreaterThanOrEqualTo(java.lang.String value) {
            addCriterion("rma_formule >=", value, "rma_formule");
            return (Criteria) this;
        }

        public Criteria andRmaFormuleLessThan(java.lang.String value) {
            addCriterion("rma_formule <", value, "rmaFormule");
            return (Criteria) this;
        }

        public Criteria andRmaFormuleLessThanOrEqualTo(java.lang.String value) {
            addCriterion("rma_formule <=", value, "rmaFormule");
            return (Criteria) this;
        }


        public Criteria andRmaFormuleIn(List<java.lang.String > values) {
            addCriterion("rma_formule in", values, "rmaFormule");
            return (Criteria) this;
        }

        public Criteria andRmaFormuleNotIn(List<java.lang.String> values) {
            addCriterion("rma_formule not in", values, "rmaFormule");
            return (Criteria) this;
        }

        public Criteria andRmaFormuleBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("rma_formule between", value1, value2, "rmaFormule");
            return (Criteria) this;
        }

        public Criteria andRmaFormuleNotBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("rma_formule not between", value1, value2, "rmaFormule");
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

        public Criteria andStatusEqualTo(java.lang.Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(java.lang.Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(java.lang.Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(java.lang.Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }


        public Criteria andStatusIn(List<java.lang.Integer > values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<java.lang.Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }



        public Criteria andLockedDateIsNull() {
            addCriterion("lockedDate is null");
            return (Criteria) this;
        }


        public Criteria andLockedDateIsNotNull() {
            addCriterion("lockedDate is not null");
            return (Criteria) this;
        }

        public Criteria andLockedDateEqualTo(java.util.Date value) {
            addCriterion("locked_date =", value, "lockedDate");
            return (Criteria) this;
        }

        public Criteria andLockedDateNotEqualTo(java.util.Date value) {
            addCriterion("locked_date <>", value, "lockedDate");
            return (Criteria) this;
        }

        public Criteria andLockedDateGreaterThan(java.util.Date value) {
            addCriterion("locked_date >", value, "lockedDate");
            return (Criteria) this;
        }

        public Criteria andLockedDateGreaterThanOrEqualTo(java.util.Date value) {
            addCriterion("locked_date >=", value, "locked_date");
            return (Criteria) this;
        }

        public Criteria andLockedDateLessThan(java.util.Date value) {
            addCriterion("locked_date <", value, "lockedDate");
            return (Criteria) this;
        }

        public Criteria andLockedDateLessThanOrEqualTo(java.util.Date value) {
            addCriterion("locked_date <=", value, "lockedDate");
            return (Criteria) this;
        }


        public Criteria andLockedDateIn(List<java.util.Date > values) {
            addCriterion("locked_date in", values, "lockedDate");
            return (Criteria) this;
        }

        public Criteria andLockedDateNotIn(List<java.util.Date> values) {
            addCriterion("locked_date not in", values, "lockedDate");
            return (Criteria) this;
        }

        public Criteria andLockedDateBetween(java.util.Date value1, java.util.Date value2) {
            addCriterion("locked_date between", value1, value2, "lockedDate");
            return (Criteria) this;
        }

        public Criteria andLockedDateNotBetween(java.util.Date value1, java.util.Date value2) {
            addCriterion("locked_date not between", value1, value2, "lockedDate");
            return (Criteria) this;
        }



        public Criteria andLockedUserIsNull() {
            addCriterion("lockedUser is null");
            return (Criteria) this;
        }


        public Criteria andLockedUserIsNotNull() {
            addCriterion("lockedUser is not null");
            return (Criteria) this;
        }

        public Criteria andLockedUserEqualTo(java.lang.Integer value) {
            addCriterion("locked_user =", value, "lockedUser");
            return (Criteria) this;
        }

        public Criteria andLockedUserNotEqualTo(java.lang.Integer value) {
            addCriterion("locked_user <>", value, "lockedUser");
            return (Criteria) this;
        }

        public Criteria andLockedUserGreaterThan(java.lang.Integer value) {
            addCriterion("locked_user >", value, "lockedUser");
            return (Criteria) this;
        }

        public Criteria andLockedUserGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("locked_user >=", value, "locked_user");
            return (Criteria) this;
        }

        public Criteria andLockedUserLessThan(java.lang.Integer value) {
            addCriterion("locked_user <", value, "lockedUser");
            return (Criteria) this;
        }

        public Criteria andLockedUserLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("locked_user <=", value, "lockedUser");
            return (Criteria) this;
        }


        public Criteria andLockedUserIn(List<java.lang.Integer > values) {
            addCriterion("locked_user in", values, "lockedUser");
            return (Criteria) this;
        }

        public Criteria andLockedUserNotIn(List<java.lang.Integer> values) {
            addCriterion("locked_user not in", values, "lockedUser");
            return (Criteria) this;
        }

        public Criteria andLockedUserBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("locked_user between", value1, value2, "lockedUser");
            return (Criteria) this;
        }

        public Criteria andLockedUserNotBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("locked_user not between", value1, value2, "lockedUser");
            return (Criteria) this;
        }



        public Criteria andMonth1SalesIsNull() {
            addCriterion("month1Sales is null");
            return (Criteria) this;
        }


        public Criteria andMonth1SalesIsNotNull() {
            addCriterion("month1Sales is not null");
            return (Criteria) this;
        }

        public Criteria andMonth1SalesEqualTo(java.lang.Integer value) {
            addCriterion("month1_sales =", value, "month1Sales");
            return (Criteria) this;
        }

        public Criteria andMonth1SalesNotEqualTo(java.lang.Integer value) {
            addCriterion("month1_sales <>", value, "month1Sales");
            return (Criteria) this;
        }

        public Criteria andMonth1SalesGreaterThan(java.lang.Integer value) {
            addCriterion("month1_sales >", value, "month1Sales");
            return (Criteria) this;
        }

        public Criteria andMonth1SalesGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("month1_sales >=", value, "month1_sales");
            return (Criteria) this;
        }

        public Criteria andMonth1SalesLessThan(java.lang.Integer value) {
            addCriterion("month1_sales <", value, "month1Sales");
            return (Criteria) this;
        }

        public Criteria andMonth1SalesLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("month1_sales <=", value, "month1Sales");
            return (Criteria) this;
        }


        public Criteria andMonth1SalesIn(List<java.lang.Integer > values) {
            addCriterion("month1_sales in", values, "month1Sales");
            return (Criteria) this;
        }

        public Criteria andMonth1SalesNotIn(List<java.lang.Integer> values) {
            addCriterion("month1_sales not in", values, "month1Sales");
            return (Criteria) this;
        }

        public Criteria andMonth1SalesBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("month1_sales between", value1, value2, "month1Sales");
            return (Criteria) this;
        }

        public Criteria andMonth1SalesNotBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("month1_sales not between", value1, value2, "month1Sales");
            return (Criteria) this;
        }



        public Criteria andMonth2SalesIsNull() {
            addCriterion("month2Sales is null");
            return (Criteria) this;
        }


        public Criteria andMonth2SalesIsNotNull() {
            addCriterion("month2Sales is not null");
            return (Criteria) this;
        }

        public Criteria andMonth2SalesEqualTo(java.lang.Integer value) {
            addCriterion("month2_sales =", value, "month2Sales");
            return (Criteria) this;
        }

        public Criteria andMonth2SalesNotEqualTo(java.lang.Integer value) {
            addCriterion("month2_sales <>", value, "month2Sales");
            return (Criteria) this;
        }

        public Criteria andMonth2SalesGreaterThan(java.lang.Integer value) {
            addCriterion("month2_sales >", value, "month2Sales");
            return (Criteria) this;
        }

        public Criteria andMonth2SalesGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("month2_sales >=", value, "month2_sales");
            return (Criteria) this;
        }

        public Criteria andMonth2SalesLessThan(java.lang.Integer value) {
            addCriterion("month2_sales <", value, "month2Sales");
            return (Criteria) this;
        }

        public Criteria andMonth2SalesLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("month2_sales <=", value, "month2Sales");
            return (Criteria) this;
        }


        public Criteria andMonth2SalesIn(List<java.lang.Integer > values) {
            addCriterion("month2_sales in", values, "month2Sales");
            return (Criteria) this;
        }

        public Criteria andMonth2SalesNotIn(List<java.lang.Integer> values) {
            addCriterion("month2_sales not in", values, "month2Sales");
            return (Criteria) this;
        }

        public Criteria andMonth2SalesBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("month2_sales between", value1, value2, "month2Sales");
            return (Criteria) this;
        }

        public Criteria andMonth2SalesNotBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("month2_sales not between", value1, value2, "month2Sales");
            return (Criteria) this;
        }



        public Criteria andMonth3SalesIsNull() {
            addCriterion("month3Sales is null");
            return (Criteria) this;
        }


        public Criteria andMonth3SalesIsNotNull() {
            addCriterion("month3Sales is not null");
            return (Criteria) this;
        }

        public Criteria andMonth3SalesEqualTo(java.lang.Integer value) {
            addCriterion("month3_sales =", value, "month3Sales");
            return (Criteria) this;
        }

        public Criteria andMonth3SalesNotEqualTo(java.lang.Integer value) {
            addCriterion("month3_sales <>", value, "month3Sales");
            return (Criteria) this;
        }

        public Criteria andMonth3SalesGreaterThan(java.lang.Integer value) {
            addCriterion("month3_sales >", value, "month3Sales");
            return (Criteria) this;
        }

        public Criteria andMonth3SalesGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("month3_sales >=", value, "month3_sales");
            return (Criteria) this;
        }

        public Criteria andMonth3SalesLessThan(java.lang.Integer value) {
            addCriterion("month3_sales <", value, "month3Sales");
            return (Criteria) this;
        }

        public Criteria andMonth3SalesLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("month3_sales <=", value, "month3Sales");
            return (Criteria) this;
        }


        public Criteria andMonth3SalesIn(List<java.lang.Integer > values) {
            addCriterion("month3_sales in", values, "month3Sales");
            return (Criteria) this;
        }

        public Criteria andMonth3SalesNotIn(List<java.lang.Integer> values) {
            addCriterion("month3_sales not in", values, "month3Sales");
            return (Criteria) this;
        }

        public Criteria andMonth3SalesBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("month3_sales between", value1, value2, "month3Sales");
            return (Criteria) this;
        }

        public Criteria andMonth3SalesNotBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("month3_sales not between", value1, value2, "month3Sales");
            return (Criteria) this;
        }



        public Criteria andMonth4SalesIsNull() {
            addCriterion("month4Sales is null");
            return (Criteria) this;
        }


        public Criteria andMonth4SalesIsNotNull() {
            addCriterion("month4Sales is not null");
            return (Criteria) this;
        }

        public Criteria andMonth4SalesEqualTo(java.lang.Integer value) {
            addCriterion("month4_sales =", value, "month4Sales");
            return (Criteria) this;
        }

        public Criteria andMonth4SalesNotEqualTo(java.lang.Integer value) {
            addCriterion("month4_sales <>", value, "month4Sales");
            return (Criteria) this;
        }

        public Criteria andMonth4SalesGreaterThan(java.lang.Integer value) {
            addCriterion("month4_sales >", value, "month4Sales");
            return (Criteria) this;
        }

        public Criteria andMonth4SalesGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("month4_sales >=", value, "month4_sales");
            return (Criteria) this;
        }

        public Criteria andMonth4SalesLessThan(java.lang.Integer value) {
            addCriterion("month4_sales <", value, "month4Sales");
            return (Criteria) this;
        }

        public Criteria andMonth4SalesLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("month4_sales <=", value, "month4Sales");
            return (Criteria) this;
        }


        public Criteria andMonth4SalesIn(List<java.lang.Integer > values) {
            addCriterion("month4_sales in", values, "month4Sales");
            return (Criteria) this;
        }

        public Criteria andMonth4SalesNotIn(List<java.lang.Integer> values) {
            addCriterion("month4_sales not in", values, "month4Sales");
            return (Criteria) this;
        }

        public Criteria andMonth4SalesBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("month4_sales between", value1, value2, "month4Sales");
            return (Criteria) this;
        }

        public Criteria andMonth4SalesNotBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("month4_sales not between", value1, value2, "month4Sales");
            return (Criteria) this;
        }



        public Criteria andMonth5SalesIsNull() {
            addCriterion("month5Sales is null");
            return (Criteria) this;
        }


        public Criteria andMonth5SalesIsNotNull() {
            addCriterion("month5Sales is not null");
            return (Criteria) this;
        }

        public Criteria andMonth5SalesEqualTo(java.lang.Integer value) {
            addCriterion("month5_sales =", value, "month5Sales");
            return (Criteria) this;
        }

        public Criteria andMonth5SalesNotEqualTo(java.lang.Integer value) {
            addCriterion("month5_sales <>", value, "month5Sales");
            return (Criteria) this;
        }

        public Criteria andMonth5SalesGreaterThan(java.lang.Integer value) {
            addCriterion("month5_sales >", value, "month5Sales");
            return (Criteria) this;
        }

        public Criteria andMonth5SalesGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("month5_sales >=", value, "month5_sales");
            return (Criteria) this;
        }

        public Criteria andMonth5SalesLessThan(java.lang.Integer value) {
            addCriterion("month5_sales <", value, "month5Sales");
            return (Criteria) this;
        }

        public Criteria andMonth5SalesLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("month5_sales <=", value, "month5Sales");
            return (Criteria) this;
        }


        public Criteria andMonth5SalesIn(List<java.lang.Integer > values) {
            addCriterion("month5_sales in", values, "month5Sales");
            return (Criteria) this;
        }

        public Criteria andMonth5SalesNotIn(List<java.lang.Integer> values) {
            addCriterion("month5_sales not in", values, "month5Sales");
            return (Criteria) this;
        }

        public Criteria andMonth5SalesBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("month5_sales between", value1, value2, "month5Sales");
            return (Criteria) this;
        }

        public Criteria andMonth5SalesNotBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("month5_sales not between", value1, value2, "month5Sales");
            return (Criteria) this;
        }



        public Criteria andMonth6SalesIsNull() {
            addCriterion("month6Sales is null");
            return (Criteria) this;
        }


        public Criteria andMonth6SalesIsNotNull() {
            addCriterion("month6Sales is not null");
            return (Criteria) this;
        }

        public Criteria andMonth6SalesEqualTo(java.lang.Integer value) {
            addCriterion("month6_sales =", value, "month6Sales");
            return (Criteria) this;
        }

        public Criteria andMonth6SalesNotEqualTo(java.lang.Integer value) {
            addCriterion("month6_sales <>", value, "month6Sales");
            return (Criteria) this;
        }

        public Criteria andMonth6SalesGreaterThan(java.lang.Integer value) {
            addCriterion("month6_sales >", value, "month6Sales");
            return (Criteria) this;
        }

        public Criteria andMonth6SalesGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("month6_sales >=", value, "month6_sales");
            return (Criteria) this;
        }

        public Criteria andMonth6SalesLessThan(java.lang.Integer value) {
            addCriterion("month6_sales <", value, "month6Sales");
            return (Criteria) this;
        }

        public Criteria andMonth6SalesLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("month6_sales <=", value, "month6Sales");
            return (Criteria) this;
        }


        public Criteria andMonth6SalesIn(List<java.lang.Integer > values) {
            addCriterion("month6_sales in", values, "month6Sales");
            return (Criteria) this;
        }

        public Criteria andMonth6SalesNotIn(List<java.lang.Integer> values) {
            addCriterion("month6_sales not in", values, "month6Sales");
            return (Criteria) this;
        }

        public Criteria andMonth6SalesBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("month6_sales between", value1, value2, "month6Sales");
            return (Criteria) this;
        }

        public Criteria andMonth6SalesNotBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("month6_sales not between", value1, value2, "month6Sales");
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