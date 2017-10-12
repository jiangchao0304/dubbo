package com.sunvalley.erp.product.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.math.BigDecimal;

/**
* @Description: PrepareSkuExample
* @author
* @date 2017-10-12 04:26:20
*/
public class PrepareSkuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private int pageIndex;

    private int pageSize;

    public PrepareSkuExample() {
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

    public PrepareSkuExample(int pageSize, int pageIndex) {
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



        public Criteria andPreSkuIsNull() {
            addCriterion("preSku is null");
            return (Criteria) this;
        }


        public Criteria andPreSkuIsNotNull() {
            addCriterion("preSku is not null");
            return (Criteria) this;
        }

        public Criteria andPreSkuEqualTo(java.lang.String value) {
            addCriterion("pre_sku =", value, "preSku");
            return (Criteria) this;
        }

        public Criteria andPreSkuNotEqualTo(java.lang.String value) {
            addCriterion("pre_sku <>", value, "preSku");
            return (Criteria) this;
        }

        public Criteria andPreSkuGreaterThan(java.lang.String value) {
            addCriterion("pre_sku >", value, "preSku");
            return (Criteria) this;
        }

        public Criteria andPreSkuGreaterThanOrEqualTo(java.lang.String value) {
            addCriterion("pre_sku >=", value, "pre_sku");
            return (Criteria) this;
        }

        public Criteria andPreSkuLessThan(java.lang.String value) {
            addCriterion("pre_sku <", value, "preSku");
            return (Criteria) this;
        }

        public Criteria andPreSkuLessThanOrEqualTo(java.lang.String value) {
            addCriterion("pre_sku <=", value, "preSku");
            return (Criteria) this;
        }


        public Criteria andPreSkuIn(List<java.lang.String > values) {
            addCriterion("pre_sku in", values, "preSku");
            return (Criteria) this;
        }

        public Criteria andPreSkuNotIn(List<java.lang.String> values) {
            addCriterion("pre_sku not in", values, "preSku");
            return (Criteria) this;
        }

        public Criteria andPreSkuBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("pre_sku between", value1, value2, "preSku");
            return (Criteria) this;
        }

        public Criteria andPreSkuNotBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("pre_sku not between", value1, value2, "preSku");
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



        public Criteria andPurspecIsNull() {
            addCriterion("purspec is null");
            return (Criteria) this;
        }


        public Criteria andPurspecIsNotNull() {
            addCriterion("purspec is not null");
            return (Criteria) this;
        }

        public Criteria andPurspecEqualTo(java.lang.String value) {
            addCriterion("purspec =", value, "purspec");
            return (Criteria) this;
        }

        public Criteria andPurspecNotEqualTo(java.lang.String value) {
            addCriterion("purspec <>", value, "purspec");
            return (Criteria) this;
        }

        public Criteria andPurspecGreaterThan(java.lang.String value) {
            addCriterion("purspec >", value, "purspec");
            return (Criteria) this;
        }

        public Criteria andPurspecGreaterThanOrEqualTo(java.lang.String value) {
            addCriterion("purspec >=", value, "purspec");
            return (Criteria) this;
        }

        public Criteria andPurspecLessThan(java.lang.String value) {
            addCriterion("purspec <", value, "purspec");
            return (Criteria) this;
        }

        public Criteria andPurspecLessThanOrEqualTo(java.lang.String value) {
            addCriterion("purspec <=", value, "purspec");
            return (Criteria) this;
        }


        public Criteria andPurspecIn(List<java.lang.String > values) {
            addCriterion("purspec in", values, "purspec");
            return (Criteria) this;
        }

        public Criteria andPurspecNotIn(List<java.lang.String> values) {
            addCriterion("purspec not in", values, "purspec");
            return (Criteria) this;
        }

        public Criteria andPurspecBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("purspec between", value1, value2, "purspec");
            return (Criteria) this;
        }

        public Criteria andPurspecNotBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("purspec not between", value1, value2, "purspec");
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



        public Criteria andSaleQtyIsNull() {
            addCriterion("saleQty is null");
            return (Criteria) this;
        }


        public Criteria andSaleQtyIsNotNull() {
            addCriterion("saleQty is not null");
            return (Criteria) this;
        }

        public Criteria andSaleQtyEqualTo(java.lang.Integer value) {
            addCriterion("sale_qty =", value, "saleQty");
            return (Criteria) this;
        }

        public Criteria andSaleQtyNotEqualTo(java.lang.Integer value) {
            addCriterion("sale_qty <>", value, "saleQty");
            return (Criteria) this;
        }

        public Criteria andSaleQtyGreaterThan(java.lang.Integer value) {
            addCriterion("sale_qty >", value, "saleQty");
            return (Criteria) this;
        }

        public Criteria andSaleQtyGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("sale_qty >=", value, "sale_qty");
            return (Criteria) this;
        }

        public Criteria andSaleQtyLessThan(java.lang.Integer value) {
            addCriterion("sale_qty <", value, "saleQty");
            return (Criteria) this;
        }

        public Criteria andSaleQtyLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("sale_qty <=", value, "saleQty");
            return (Criteria) this;
        }


        public Criteria andSaleQtyIn(List<java.lang.Integer > values) {
            addCriterion("sale_qty in", values, "saleQty");
            return (Criteria) this;
        }

        public Criteria andSaleQtyNotIn(List<java.lang.Integer> values) {
            addCriterion("sale_qty not in", values, "saleQty");
            return (Criteria) this;
        }

        public Criteria andSaleQtyBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("sale_qty between", value1, value2, "saleQty");
            return (Criteria) this;
        }

        public Criteria andSaleQtyNotBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("sale_qty not between", value1, value2, "saleQty");
            return (Criteria) this;
        }



        public Criteria andMarketCapacityIsNull() {
            addCriterion("marketCapacity is null");
            return (Criteria) this;
        }


        public Criteria andMarketCapacityIsNotNull() {
            addCriterion("marketCapacity is not null");
            return (Criteria) this;
        }

        public Criteria andMarketCapacityEqualTo(java.lang.Integer value) {
            addCriterion("market_capacity =", value, "marketCapacity");
            return (Criteria) this;
        }

        public Criteria andMarketCapacityNotEqualTo(java.lang.Integer value) {
            addCriterion("market_capacity <>", value, "marketCapacity");
            return (Criteria) this;
        }

        public Criteria andMarketCapacityGreaterThan(java.lang.Integer value) {
            addCriterion("market_capacity >", value, "marketCapacity");
            return (Criteria) this;
        }

        public Criteria andMarketCapacityGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("market_capacity >=", value, "market_capacity");
            return (Criteria) this;
        }

        public Criteria andMarketCapacityLessThan(java.lang.Integer value) {
            addCriterion("market_capacity <", value, "marketCapacity");
            return (Criteria) this;
        }

        public Criteria andMarketCapacityLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("market_capacity <=", value, "marketCapacity");
            return (Criteria) this;
        }


        public Criteria andMarketCapacityIn(List<java.lang.Integer > values) {
            addCriterion("market_capacity in", values, "marketCapacity");
            return (Criteria) this;
        }

        public Criteria andMarketCapacityNotIn(List<java.lang.Integer> values) {
            addCriterion("market_capacity not in", values, "marketCapacity");
            return (Criteria) this;
        }

        public Criteria andMarketCapacityBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("market_capacity between", value1, value2, "marketCapacity");
            return (Criteria) this;
        }

        public Criteria andMarketCapacityNotBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("market_capacity not between", value1, value2, "marketCapacity");
            return (Criteria) this;
        }



        public Criteria andMpDateIsNull() {
            addCriterion("mpDate is null");
            return (Criteria) this;
        }


        public Criteria andMpDateIsNotNull() {
            addCriterion("mpDate is not null");
            return (Criteria) this;
        }

        public Criteria andMpDateEqualTo(java.util.Date value) {
            addCriterion("mp_date =", value, "mpDate");
            return (Criteria) this;
        }

        public Criteria andMpDateNotEqualTo(java.util.Date value) {
            addCriterion("mp_date <>", value, "mpDate");
            return (Criteria) this;
        }

        public Criteria andMpDateGreaterThan(java.util.Date value) {
            addCriterion("mp_date >", value, "mpDate");
            return (Criteria) this;
        }

        public Criteria andMpDateGreaterThanOrEqualTo(java.util.Date value) {
            addCriterion("mp_date >=", value, "mp_date");
            return (Criteria) this;
        }

        public Criteria andMpDateLessThan(java.util.Date value) {
            addCriterion("mp_date <", value, "mpDate");
            return (Criteria) this;
        }

        public Criteria andMpDateLessThanOrEqualTo(java.util.Date value) {
            addCriterion("mp_date <=", value, "mpDate");
            return (Criteria) this;
        }


        public Criteria andMpDateIn(List<java.util.Date > values) {
            addCriterion("mp_date in", values, "mpDate");
            return (Criteria) this;
        }

        public Criteria andMpDateNotIn(List<java.util.Date> values) {
            addCriterion("mp_date not in", values, "mpDate");
            return (Criteria) this;
        }

        public Criteria andMpDateBetween(java.util.Date value1, java.util.Date value2) {
            addCriterion("mp_date between", value1, value2, "mpDate");
            return (Criteria) this;
        }

        public Criteria andMpDateNotBetween(java.util.Date value1, java.util.Date value2) {
            addCriterion("mp_date not between", value1, value2, "mpDate");
            return (Criteria) this;
        }



        public Criteria andColorIsNull() {
            addCriterion("color is null");
            return (Criteria) this;
        }


        public Criteria andColorIsNotNull() {
            addCriterion("color is not null");
            return (Criteria) this;
        }

        public Criteria andColorEqualTo(java.lang.Integer value) {
            addCriterion("color =", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotEqualTo(java.lang.Integer value) {
            addCriterion("color <>", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThan(java.lang.Integer value) {
            addCriterion("color >", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("color >=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThan(java.lang.Integer value) {
            addCriterion("color <", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("color <=", value, "color");
            return (Criteria) this;
        }


        public Criteria andColorIn(List<java.lang.Integer > values) {
            addCriterion("color in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotIn(List<java.lang.Integer> values) {
            addCriterion("color not in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("color between", value1, value2, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("color not between", value1, value2, "color");
            return (Criteria) this;
        }



        public Criteria andProductNameIsNull() {
            addCriterion("productName is null");
            return (Criteria) this;
        }


        public Criteria andProductNameIsNotNull() {
            addCriterion("productName is not null");
            return (Criteria) this;
        }

        public Criteria andProductNameEqualTo(java.lang.String value) {
            addCriterion("product_name =", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotEqualTo(java.lang.String value) {
            addCriterion("product_name <>", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThan(java.lang.String value) {
            addCriterion("product_name >", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThanOrEqualTo(java.lang.String value) {
            addCriterion("product_name >=", value, "product_name");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThan(java.lang.String value) {
            addCriterion("product_name <", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThanOrEqualTo(java.lang.String value) {
            addCriterion("product_name <=", value, "productName");
            return (Criteria) this;
        }


        public Criteria andProductNameIn(List<java.lang.String > values) {
            addCriterion("product_name in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotIn(List<java.lang.String> values) {
            addCriterion("product_name not in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("product_name between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("product_name not between", value1, value2, "productName");
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



        public Criteria andRegionIsNull() {
            addCriterion("region is null");
            return (Criteria) this;
        }


        public Criteria andRegionIsNotNull() {
            addCriterion("region is not null");
            return (Criteria) this;
        }

        public Criteria andRegionEqualTo(java.lang.Integer value) {
            addCriterion("region =", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotEqualTo(java.lang.Integer value) {
            addCriterion("region <>", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionGreaterThan(java.lang.Integer value) {
            addCriterion("region >", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("region >=", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLessThan(java.lang.Integer value) {
            addCriterion("region <", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("region <=", value, "region");
            return (Criteria) this;
        }


        public Criteria andRegionIn(List<java.lang.Integer > values) {
            addCriterion("region in", values, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotIn(List<java.lang.Integer> values) {
            addCriterion("region not in", values, "region");
            return (Criteria) this;
        }

        public Criteria andRegionBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("region between", value1, value2, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("region not between", value1, value2, "region");
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