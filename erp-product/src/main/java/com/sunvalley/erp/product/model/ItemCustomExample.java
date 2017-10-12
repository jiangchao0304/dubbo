package com.sunvalley.erp.product.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.math.BigDecimal;

/**
* @Description: ItemCustomExample
* @author
* @date 2017-10-12 04:23:04
*/
public class ItemCustomExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private int pageIndex;

    private int pageSize;

    public ItemCustomExample() {
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

    public ItemCustomExample(int pageSize, int pageIndex) {
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



        public Criteria andStateidIsNull() {
            addCriterion("stateid is null");
            return (Criteria) this;
        }


        public Criteria andStateidIsNotNull() {
            addCriterion("stateid is not null");
            return (Criteria) this;
        }

        public Criteria andStateidEqualTo(java.lang.String value) {
            addCriterion("stateid =", value, "stateid");
            return (Criteria) this;
        }

        public Criteria andStateidNotEqualTo(java.lang.String value) {
            addCriterion("stateid <>", value, "stateid");
            return (Criteria) this;
        }

        public Criteria andStateidGreaterThan(java.lang.String value) {
            addCriterion("stateid >", value, "stateid");
            return (Criteria) this;
        }

        public Criteria andStateidGreaterThanOrEqualTo(java.lang.String value) {
            addCriterion("stateid >=", value, "stateid");
            return (Criteria) this;
        }

        public Criteria andStateidLessThan(java.lang.String value) {
            addCriterion("stateid <", value, "stateid");
            return (Criteria) this;
        }

        public Criteria andStateidLessThanOrEqualTo(java.lang.String value) {
            addCriterion("stateid <=", value, "stateid");
            return (Criteria) this;
        }


        public Criteria andStateidIn(List<java.lang.String > values) {
            addCriterion("stateid in", values, "stateid");
            return (Criteria) this;
        }

        public Criteria andStateidNotIn(List<java.lang.String> values) {
            addCriterion("stateid not in", values, "stateid");
            return (Criteria) this;
        }

        public Criteria andStateidBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("stateid between", value1, value2, "stateid");
            return (Criteria) this;
        }

        public Criteria andStateidNotBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("stateid not between", value1, value2, "stateid");
            return (Criteria) this;
        }



        public Criteria andCncustomscodeIsNull() {
            addCriterion("cncustomscode is null");
            return (Criteria) this;
        }


        public Criteria andCncustomscodeIsNotNull() {
            addCriterion("cncustomscode is not null");
            return (Criteria) this;
        }

        public Criteria andCncustomscodeEqualTo(java.lang.String value) {
            addCriterion("cncustomscode =", value, "cncustomscode");
            return (Criteria) this;
        }

        public Criteria andCncustomscodeNotEqualTo(java.lang.String value) {
            addCriterion("cncustomscode <>", value, "cncustomscode");
            return (Criteria) this;
        }

        public Criteria andCncustomscodeGreaterThan(java.lang.String value) {
            addCriterion("cncustomscode >", value, "cncustomscode");
            return (Criteria) this;
        }

        public Criteria andCncustomscodeGreaterThanOrEqualTo(java.lang.String value) {
            addCriterion("cncustomscode >=", value, "cncustomscode");
            return (Criteria) this;
        }

        public Criteria andCncustomscodeLessThan(java.lang.String value) {
            addCriterion("cncustomscode <", value, "cncustomscode");
            return (Criteria) this;
        }

        public Criteria andCncustomscodeLessThanOrEqualTo(java.lang.String value) {
            addCriterion("cncustomscode <=", value, "cncustomscode");
            return (Criteria) this;
        }


        public Criteria andCncustomscodeIn(List<java.lang.String > values) {
            addCriterion("cncustomscode in", values, "cncustomscode");
            return (Criteria) this;
        }

        public Criteria andCncustomscodeNotIn(List<java.lang.String> values) {
            addCriterion("cncustomscode not in", values, "cncustomscode");
            return (Criteria) this;
        }

        public Criteria andCncustomscodeBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("cncustomscode between", value1, value2, "cncustomscode");
            return (Criteria) this;
        }

        public Criteria andCncustomscodeNotBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("cncustomscode not between", value1, value2, "cncustomscode");
            return (Criteria) this;
        }



        public Criteria andImportcheckingIsNull() {
            addCriterion("importchecking is null");
            return (Criteria) this;
        }


        public Criteria andImportcheckingIsNotNull() {
            addCriterion("importchecking is not null");
            return (Criteria) this;
        }

        public Criteria andImportcheckingEqualTo(Integer value) {
            addCriterion("importchecking =", value, "importchecking");
            return (Criteria) this;
        }

        public Criteria andImportcheckingNotEqualTo(Integer value) {
            addCriterion("importchecking <>", value, "importchecking");
            return (Criteria) this;
        }

        public Criteria andImportcheckingGreaterThan(Integer value) {
            addCriterion("importchecking >", value, "importchecking");
            return (Criteria) this;
        }

        public Criteria andImportcheckingGreaterThanOrEqualTo(Integer value) {
            addCriterion("importchecking >=", value, "importchecking");
            return (Criteria) this;
        }

        public Criteria andImportcheckingLessThan(Integer value) {
            addCriterion("importchecking <", value, "importchecking");
            return (Criteria) this;
        }

        public Criteria andImportcheckingLessThanOrEqualTo(Integer value) {
            addCriterion("importchecking <=", value, "importchecking");
            return (Criteria) this;
        }


        public Criteria andImportcheckingIn(List<Integer > values) {
            addCriterion("importchecking in", values, "importchecking");
            return (Criteria) this;
        }

        public Criteria andImportcheckingNotIn(List<Integer> values) {
            addCriterion("importchecking not in", values, "importchecking");
            return (Criteria) this;
        }

        public Criteria andImportcheckingBetween(Integer value1, Integer value2) {
            addCriterion("importchecking between", value1, value2, "importchecking");
            return (Criteria) this;
        }

        public Criteria andImportcheckingNotBetween(Integer value1, Integer value2) {
            addCriterion("importchecking not between", value1, value2, "importchecking");
            return (Criteria) this;
        }



        public Criteria andExportcheckingIsNull() {
            addCriterion("exportchecking is null");
            return (Criteria) this;
        }


        public Criteria andExportcheckingIsNotNull() {
            addCriterion("exportchecking is not null");
            return (Criteria) this;
        }

        public Criteria andExportcheckingEqualTo(Integer value) {
            addCriterion("exportchecking =", value, "exportchecking");
            return (Criteria) this;
        }

        public Criteria andExportcheckingNotEqualTo(Integer value) {
            addCriterion("exportchecking <>", value, "exportchecking");
            return (Criteria) this;
        }

        public Criteria andExportcheckingGreaterThan(Integer value) {
            addCriterion("exportchecking >", value, "exportchecking");
            return (Criteria) this;
        }

        public Criteria andExportcheckingGreaterThanOrEqualTo(Integer value) {
            addCriterion("exportchecking >=", value, "exportchecking");
            return (Criteria) this;
        }

        public Criteria andExportcheckingLessThan(Integer value) {
            addCriterion("exportchecking <", value, "exportchecking");
            return (Criteria) this;
        }

        public Criteria andExportcheckingLessThanOrEqualTo(Integer value) {
            addCriterion("exportchecking <=", value, "exportchecking");
            return (Criteria) this;
        }


        public Criteria andExportcheckingIn(List<Integer > values) {
            addCriterion("exportchecking in", values, "exportchecking");
            return (Criteria) this;
        }

        public Criteria andExportcheckingNotIn(List<Integer> values) {
            addCriterion("exportchecking not in", values, "exportchecking");
            return (Criteria) this;
        }

        public Criteria andExportcheckingBetween(Integer value1, Integer value2) {
            addCriterion("exportchecking between", value1, value2, "exportchecking");
            return (Criteria) this;
        }

        public Criteria andExportcheckingNotBetween(Integer value1, Integer value2) {
            addCriterion("exportchecking not between", value1, value2, "exportchecking");
            return (Criteria) this;
        }



        public Criteria andCommodityunitIsNull() {
            addCriterion("commodityunit is null");
            return (Criteria) this;
        }


        public Criteria andCommodityunitIsNotNull() {
            addCriterion("commodityunit is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityunitEqualTo(java.lang.String value) {
            addCriterion("commodityunit =", value, "commodityunit");
            return (Criteria) this;
        }

        public Criteria andCommodityunitNotEqualTo(java.lang.String value) {
            addCriterion("commodityunit <>", value, "commodityunit");
            return (Criteria) this;
        }

        public Criteria andCommodityunitGreaterThan(java.lang.String value) {
            addCriterion("commodityunit >", value, "commodityunit");
            return (Criteria) this;
        }

        public Criteria andCommodityunitGreaterThanOrEqualTo(java.lang.String value) {
            addCriterion("commodityunit >=", value, "commodityunit");
            return (Criteria) this;
        }

        public Criteria andCommodityunitLessThan(java.lang.String value) {
            addCriterion("commodityunit <", value, "commodityunit");
            return (Criteria) this;
        }

        public Criteria andCommodityunitLessThanOrEqualTo(java.lang.String value) {
            addCriterion("commodityunit <=", value, "commodityunit");
            return (Criteria) this;
        }


        public Criteria andCommodityunitIn(List<java.lang.String > values) {
            addCriterion("commodityunit in", values, "commodityunit");
            return (Criteria) this;
        }

        public Criteria andCommodityunitNotIn(List<java.lang.String> values) {
            addCriterion("commodityunit not in", values, "commodityunit");
            return (Criteria) this;
        }

        public Criteria andCommodityunitBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("commodityunit between", value1, value2, "commodityunit");
            return (Criteria) this;
        }

        public Criteria andCommodityunitNotBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("commodityunit not between", value1, value2, "commodityunit");
            return (Criteria) this;
        }



        public Criteria andCncommoditynameIsNull() {
            addCriterion("cncommodityname is null");
            return (Criteria) this;
        }


        public Criteria andCncommoditynameIsNotNull() {
            addCriterion("cncommodityname is not null");
            return (Criteria) this;
        }

        public Criteria andCncommoditynameEqualTo(java.lang.String value) {
            addCriterion("cncommodityname =", value, "cncommodityname");
            return (Criteria) this;
        }

        public Criteria andCncommoditynameNotEqualTo(java.lang.String value) {
            addCriterion("cncommodityname <>", value, "cncommodityname");
            return (Criteria) this;
        }

        public Criteria andCncommoditynameGreaterThan(java.lang.String value) {
            addCriterion("cncommodityname >", value, "cncommodityname");
            return (Criteria) this;
        }

        public Criteria andCncommoditynameGreaterThanOrEqualTo(java.lang.String value) {
            addCriterion("cncommodityname >=", value, "cncommodityname");
            return (Criteria) this;
        }

        public Criteria andCncommoditynameLessThan(java.lang.String value) {
            addCriterion("cncommodityname <", value, "cncommodityname");
            return (Criteria) this;
        }

        public Criteria andCncommoditynameLessThanOrEqualTo(java.lang.String value) {
            addCriterion("cncommodityname <=", value, "cncommodityname");
            return (Criteria) this;
        }


        public Criteria andCncommoditynameIn(List<java.lang.String > values) {
            addCriterion("cncommodityname in", values, "cncommodityname");
            return (Criteria) this;
        }

        public Criteria andCncommoditynameNotIn(List<java.lang.String> values) {
            addCriterion("cncommodityname not in", values, "cncommodityname");
            return (Criteria) this;
        }

        public Criteria andCncommoditynameBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("cncommodityname between", value1, value2, "cncommodityname");
            return (Criteria) this;
        }

        public Criteria andCncommoditynameNotBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("cncommodityname not between", value1, value2, "cncommodityname");
            return (Criteria) this;
        }



        public Criteria andRefundrateIsNull() {
            addCriterion("refundrate is null");
            return (Criteria) this;
        }


        public Criteria andRefundrateIsNotNull() {
            addCriterion("refundrate is not null");
            return (Criteria) this;
        }

        public Criteria andRefundrateEqualTo(java.lang.Double value) {
            addCriterion("refundrate =", value, "refundrate");
            return (Criteria) this;
        }

        public Criteria andRefundrateNotEqualTo(java.lang.Double value) {
            addCriterion("refundrate <>", value, "refundrate");
            return (Criteria) this;
        }

        public Criteria andRefundrateGreaterThan(java.lang.Double value) {
            addCriterion("refundrate >", value, "refundrate");
            return (Criteria) this;
        }

        public Criteria andRefundrateGreaterThanOrEqualTo(java.lang.Double value) {
            addCriterion("refundrate >=", value, "refundrate");
            return (Criteria) this;
        }

        public Criteria andRefundrateLessThan(java.lang.Double value) {
            addCriterion("refundrate <", value, "refundrate");
            return (Criteria) this;
        }

        public Criteria andRefundrateLessThanOrEqualTo(java.lang.Double value) {
            addCriterion("refundrate <=", value, "refundrate");
            return (Criteria) this;
        }


        public Criteria andRefundrateIn(List<java.lang.Double > values) {
            addCriterion("refundrate in", values, "refundrate");
            return (Criteria) this;
        }

        public Criteria andRefundrateNotIn(List<java.lang.Double> values) {
            addCriterion("refundrate not in", values, "refundrate");
            return (Criteria) this;
        }

        public Criteria andRefundrateBetween(java.lang.Double value1, java.lang.Double value2) {
            addCriterion("refundrate between", value1, value2, "refundrate");
            return (Criteria) this;
        }

        public Criteria andRefundrateNotBetween(java.lang.Double value1, java.lang.Double value2) {
            addCriterion("refundrate not between", value1, value2, "refundrate");
            return (Criteria) this;
        }



        public Criteria andCreateuseridIsNull() {
            addCriterion("createuserid is null");
            return (Criteria) this;
        }


        public Criteria andCreateuseridIsNotNull() {
            addCriterion("createuserid is not null");
            return (Criteria) this;
        }

        public Criteria andCreateuseridEqualTo(java.lang.Integer value) {
            addCriterion("createuserid =", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridNotEqualTo(java.lang.Integer value) {
            addCriterion("createuserid <>", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridGreaterThan(java.lang.Integer value) {
            addCriterion("createuserid >", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("createuserid >=", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridLessThan(java.lang.Integer value) {
            addCriterion("createuserid <", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("createuserid <=", value, "createuserid");
            return (Criteria) this;
        }


        public Criteria andCreateuseridIn(List<java.lang.Integer > values) {
            addCriterion("createuserid in", values, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridNotIn(List<java.lang.Integer> values) {
            addCriterion("createuserid not in", values, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("createuserid between", value1, value2, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridNotBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("createuserid not between", value1, value2, "createuserid");
            return (Criteria) this;
        }



        public Criteria andCreatedateIsNull() {
            addCriterion("createdate is null");
            return (Criteria) this;
        }


        public Criteria andCreatedateIsNotNull() {
            addCriterion("createdate is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedateEqualTo(java.util.Date value) {
            addCriterion("createdate =", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotEqualTo(java.util.Date value) {
            addCriterion("createdate <>", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThan(java.util.Date value) {
            addCriterion("createdate >", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThanOrEqualTo(java.util.Date value) {
            addCriterion("createdate >=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThan(java.util.Date value) {
            addCriterion("createdate <", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThanOrEqualTo(java.util.Date value) {
            addCriterion("createdate <=", value, "createdate");
            return (Criteria) this;
        }


        public Criteria andCreatedateIn(List<java.util.Date > values) {
            addCriterion("createdate in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotIn(List<java.util.Date> values) {
            addCriterion("createdate not in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateBetween(java.util.Date value1, java.util.Date value2) {
            addCriterion("createdate between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotBetween(java.util.Date value1, java.util.Date value2) {
            addCriterion("createdate not between", value1, value2, "createdate");
            return (Criteria) this;
        }



        public Criteria andUpdateuseridIsNull() {
            addCriterion("updateuserid is null");
            return (Criteria) this;
        }


        public Criteria andUpdateuseridIsNotNull() {
            addCriterion("updateuserid is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridEqualTo(java.lang.Integer value) {
            addCriterion("updateuserid =", value, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridNotEqualTo(java.lang.Integer value) {
            addCriterion("updateuserid <>", value, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridGreaterThan(java.lang.Integer value) {
            addCriterion("updateuserid >", value, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("updateuserid >=", value, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridLessThan(java.lang.Integer value) {
            addCriterion("updateuserid <", value, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("updateuserid <=", value, "updateuserid");
            return (Criteria) this;
        }


        public Criteria andUpdateuseridIn(List<java.lang.Integer > values) {
            addCriterion("updateuserid in", values, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridNotIn(List<java.lang.Integer> values) {
            addCriterion("updateuserid not in", values, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("updateuserid between", value1, value2, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridNotBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("updateuserid not between", value1, value2, "updateuserid");
            return (Criteria) this;
        }



        public Criteria andUpdatedateIsNull() {
            addCriterion("updatedate is null");
            return (Criteria) this;
        }


        public Criteria andUpdatedateIsNotNull() {
            addCriterion("updatedate is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedateEqualTo(java.util.Date value) {
            addCriterion("updatedate =", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotEqualTo(java.util.Date value) {
            addCriterion("updatedate <>", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateGreaterThan(java.util.Date value) {
            addCriterion("updatedate >", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateGreaterThanOrEqualTo(java.util.Date value) {
            addCriterion("updatedate >=", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateLessThan(java.util.Date value) {
            addCriterion("updatedate <", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateLessThanOrEqualTo(java.util.Date value) {
            addCriterion("updatedate <=", value, "updatedate");
            return (Criteria) this;
        }


        public Criteria andUpdatedateIn(List<java.util.Date > values) {
            addCriterion("updatedate in", values, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotIn(List<java.util.Date> values) {
            addCriterion("updatedate not in", values, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateBetween(java.util.Date value1, java.util.Date value2) {
            addCriterion("updatedate between", value1, value2, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotBetween(java.util.Date value1, java.util.Date value2) {
            addCriterion("updatedate not between", value1, value2, "updatedate");
            return (Criteria) this;
        }



        public Criteria andCategoryNameIdIsNull() {
            addCriterion("categoryNameId is null");
            return (Criteria) this;
        }


        public Criteria andCategoryNameIdIsNotNull() {
            addCriterion("categoryNameId is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryNameIdEqualTo(java.lang.Integer value) {
            addCriterion("category_name_id =", value, "categoryNameId");
            return (Criteria) this;
        }

        public Criteria andCategoryNameIdNotEqualTo(java.lang.Integer value) {
            addCriterion("category_name_id <>", value, "categoryNameId");
            return (Criteria) this;
        }

        public Criteria andCategoryNameIdGreaterThan(java.lang.Integer value) {
            addCriterion("category_name_id >", value, "categoryNameId");
            return (Criteria) this;
        }

        public Criteria andCategoryNameIdGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("category_name_id >=", value, "category_name_id");
            return (Criteria) this;
        }

        public Criteria andCategoryNameIdLessThan(java.lang.Integer value) {
            addCriterion("category_name_id <", value, "categoryNameId");
            return (Criteria) this;
        }

        public Criteria andCategoryNameIdLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("category_name_id <=", value, "categoryNameId");
            return (Criteria) this;
        }


        public Criteria andCategoryNameIdIn(List<java.lang.Integer > values) {
            addCriterion("category_name_id in", values, "categoryNameId");
            return (Criteria) this;
        }

        public Criteria andCategoryNameIdNotIn(List<java.lang.Integer> values) {
            addCriterion("category_name_id not in", values, "categoryNameId");
            return (Criteria) this;
        }

        public Criteria andCategoryNameIdBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("category_name_id between", value1, value2, "categoryNameId");
            return (Criteria) this;
        }

        public Criteria andCategoryNameIdNotBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("category_name_id not between", value1, value2, "categoryNameId");
            return (Criteria) this;
        }



        public Criteria andCustomsModelIsNull() {
            addCriterion("customsModel is null");
            return (Criteria) this;
        }


        public Criteria andCustomsModelIsNotNull() {
            addCriterion("customsModel is not null");
            return (Criteria) this;
        }

        public Criteria andCustomsModelEqualTo(java.lang.String value) {
            addCriterion("customs_model =", value, "customsModel");
            return (Criteria) this;
        }

        public Criteria andCustomsModelNotEqualTo(java.lang.String value) {
            addCriterion("customs_model <>", value, "customsModel");
            return (Criteria) this;
        }

        public Criteria andCustomsModelGreaterThan(java.lang.String value) {
            addCriterion("customs_model >", value, "customsModel");
            return (Criteria) this;
        }

        public Criteria andCustomsModelGreaterThanOrEqualTo(java.lang.String value) {
            addCriterion("customs_model >=", value, "customs_model");
            return (Criteria) this;
        }

        public Criteria andCustomsModelLessThan(java.lang.String value) {
            addCriterion("customs_model <", value, "customsModel");
            return (Criteria) this;
        }

        public Criteria andCustomsModelLessThanOrEqualTo(java.lang.String value) {
            addCriterion("customs_model <=", value, "customsModel");
            return (Criteria) this;
        }


        public Criteria andCustomsModelIn(List<java.lang.String > values) {
            addCriterion("customs_model in", values, "customsModel");
            return (Criteria) this;
        }

        public Criteria andCustomsModelNotIn(List<java.lang.String> values) {
            addCriterion("customs_model not in", values, "customsModel");
            return (Criteria) this;
        }

        public Criteria andCustomsModelBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("customs_model between", value1, value2, "customsModel");
            return (Criteria) this;
        }

        public Criteria andCustomsModelNotBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("customs_model not between", value1, value2, "customsModel");
            return (Criteria) this;
        }



        public Criteria andItemStatusIsNull() {
            addCriterion("itemStatus is null");
            return (Criteria) this;
        }


        public Criteria andItemStatusIsNotNull() {
            addCriterion("itemStatus is not null");
            return (Criteria) this;
        }

        public Criteria andItemStatusEqualTo(java.lang.Integer value) {
            addCriterion("item_status =", value, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusNotEqualTo(java.lang.Integer value) {
            addCriterion("item_status <>", value, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusGreaterThan(java.lang.Integer value) {
            addCriterion("item_status >", value, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("item_status >=", value, "item_status");
            return (Criteria) this;
        }

        public Criteria andItemStatusLessThan(java.lang.Integer value) {
            addCriterion("item_status <", value, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("item_status <=", value, "itemStatus");
            return (Criteria) this;
        }


        public Criteria andItemStatusIn(List<java.lang.Integer > values) {
            addCriterion("item_status in", values, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusNotIn(List<java.lang.Integer> values) {
            addCriterion("item_status not in", values, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("item_status between", value1, value2, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusNotBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("item_status not between", value1, value2, "itemStatus");
            return (Criteria) this;
        }



        public Criteria andSkuStatusIsNull() {
            addCriterion("skuStatus is null");
            return (Criteria) this;
        }


        public Criteria andSkuStatusIsNotNull() {
            addCriterion("skuStatus is not null");
            return (Criteria) this;
        }

        public Criteria andSkuStatusEqualTo(java.lang.Integer value) {
            addCriterion("sku_status =", value, "skuStatus");
            return (Criteria) this;
        }

        public Criteria andSkuStatusNotEqualTo(java.lang.Integer value) {
            addCriterion("sku_status <>", value, "skuStatus");
            return (Criteria) this;
        }

        public Criteria andSkuStatusGreaterThan(java.lang.Integer value) {
            addCriterion("sku_status >", value, "skuStatus");
            return (Criteria) this;
        }

        public Criteria andSkuStatusGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("sku_status >=", value, "sku_status");
            return (Criteria) this;
        }

        public Criteria andSkuStatusLessThan(java.lang.Integer value) {
            addCriterion("sku_status <", value, "skuStatus");
            return (Criteria) this;
        }

        public Criteria andSkuStatusLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("sku_status <=", value, "skuStatus");
            return (Criteria) this;
        }


        public Criteria andSkuStatusIn(List<java.lang.Integer > values) {
            addCriterion("sku_status in", values, "skuStatus");
            return (Criteria) this;
        }

        public Criteria andSkuStatusNotIn(List<java.lang.Integer> values) {
            addCriterion("sku_status not in", values, "skuStatus");
            return (Criteria) this;
        }

        public Criteria andSkuStatusBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("sku_status between", value1, value2, "skuStatus");
            return (Criteria) this;
        }

        public Criteria andSkuStatusNotBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("sku_status not between", value1, value2, "skuStatus");
            return (Criteria) this;
        }



        public Criteria andReportingElementsIsNull() {
            addCriterion("reportingElements is null");
            return (Criteria) this;
        }


        public Criteria andReportingElementsIsNotNull() {
            addCriterion("reportingElements is not null");
            return (Criteria) this;
        }

        public Criteria andReportingElementsEqualTo(java.lang.String value) {
            addCriterion("reporting_elements =", value, "reportingElements");
            return (Criteria) this;
        }

        public Criteria andReportingElementsNotEqualTo(java.lang.String value) {
            addCriterion("reporting_elements <>", value, "reportingElements");
            return (Criteria) this;
        }

        public Criteria andReportingElementsGreaterThan(java.lang.String value) {
            addCriterion("reporting_elements >", value, "reportingElements");
            return (Criteria) this;
        }

        public Criteria andReportingElementsGreaterThanOrEqualTo(java.lang.String value) {
            addCriterion("reporting_elements >=", value, "reporting_elements");
            return (Criteria) this;
        }

        public Criteria andReportingElementsLessThan(java.lang.String value) {
            addCriterion("reporting_elements <", value, "reportingElements");
            return (Criteria) this;
        }

        public Criteria andReportingElementsLessThanOrEqualTo(java.lang.String value) {
            addCriterion("reporting_elements <=", value, "reportingElements");
            return (Criteria) this;
        }


        public Criteria andReportingElementsIn(List<java.lang.String > values) {
            addCriterion("reporting_elements in", values, "reportingElements");
            return (Criteria) this;
        }

        public Criteria andReportingElementsNotIn(List<java.lang.String> values) {
            addCriterion("reporting_elements not in", values, "reportingElements");
            return (Criteria) this;
        }

        public Criteria andReportingElementsBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("reporting_elements between", value1, value2, "reportingElements");
            return (Criteria) this;
        }

        public Criteria andReportingElementsNotBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("reporting_elements not between", value1, value2, "reportingElements");
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