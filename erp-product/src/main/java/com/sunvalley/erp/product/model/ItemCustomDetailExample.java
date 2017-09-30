package com.sunvalley.erp.product.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.math.BigDecimal;

/**
* @Description: ItemCustomDetailExample
* @author
* @date 2017-09-29 10:46:16
*/
public class ItemCustomDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private int pageIndex;

    private int pageSize;

    public ItemCustomDetailExample() {
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

    public ItemCustomDetailExample(int pageSize, int pageIndex) {
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



        public Criteria andBsitemcustomidIsNull() {
            addCriterion("bsitemcustomid is null");
            return (Criteria) this;
        }


        public Criteria andBsitemcustomidIsNotNull() {
            addCriterion("bsitemcustomid is not null");
            return (Criteria) this;
        }

        public Criteria andBsitemcustomidEqualTo(java.lang.Integer value) {
            addCriterion("bsitemcustomid =", value, "bsitemcustomid");
            return (Criteria) this;
        }

        public Criteria andBsitemcustomidNotEqualTo(java.lang.Integer value) {
            addCriterion("bsitemcustomid <>", value, "bsitemcustomid");
            return (Criteria) this;
        }

        public Criteria andBsitemcustomidGreaterThan(java.lang.Integer value) {
            addCriterion("bsitemcustomid >", value, "bsitemcustomid");
            return (Criteria) this;
        }

        public Criteria andBsitemcustomidGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("bsitemcustomid >=", value, "bsitemcustomid");
            return (Criteria) this;
        }

        public Criteria andBsitemcustomidLessThan(java.lang.Integer value) {
            addCriterion("bsitemcustomid <", value, "bsitemcustomid");
            return (Criteria) this;
        }

        public Criteria andBsitemcustomidLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("bsitemcustomid <=", value, "bsitemcustomid");
            return (Criteria) this;
        }


        public Criteria andBsitemcustomidIn(List<java.lang.Integer > values) {
            addCriterion("bsitemcustomid in", values, "bsitemcustomid");
            return (Criteria) this;
        }

        public Criteria andBsitemcustomidNotIn(List<java.lang.Integer> values) {
            addCriterion("bsitemcustomid not in", values, "bsitemcustomid");
            return (Criteria) this;
        }

        public Criteria andBsitemcustomidBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("bsitemcustomid between", value1, value2, "bsitemcustomid");
            return (Criteria) this;
        }

        public Criteria andBsitemcustomidNotBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("bsitemcustomid not between", value1, value2, "bsitemcustomid");
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



        public Criteria andCustomscodeIsNull() {
            addCriterion("customscode is null");
            return (Criteria) this;
        }


        public Criteria andCustomscodeIsNotNull() {
            addCriterion("customscode is not null");
            return (Criteria) this;
        }

        public Criteria andCustomscodeEqualTo(java.lang.String value) {
            addCriterion("customscode =", value, "customscode");
            return (Criteria) this;
        }

        public Criteria andCustomscodeNotEqualTo(java.lang.String value) {
            addCriterion("customscode <>", value, "customscode");
            return (Criteria) this;
        }

        public Criteria andCustomscodeGreaterThan(java.lang.String value) {
            addCriterion("customscode >", value, "customscode");
            return (Criteria) this;
        }

        public Criteria andCustomscodeGreaterThanOrEqualTo(java.lang.String value) {
            addCriterion("customscode >=", value, "customscode");
            return (Criteria) this;
        }

        public Criteria andCustomscodeLessThan(java.lang.String value) {
            addCriterion("customscode <", value, "customscode");
            return (Criteria) this;
        }

        public Criteria andCustomscodeLessThanOrEqualTo(java.lang.String value) {
            addCriterion("customscode <=", value, "customscode");
            return (Criteria) this;
        }


        public Criteria andCustomscodeIn(List<java.lang.String > values) {
            addCriterion("customscode in", values, "customscode");
            return (Criteria) this;
        }

        public Criteria andCustomscodeNotIn(List<java.lang.String> values) {
            addCriterion("customscode not in", values, "customscode");
            return (Criteria) this;
        }

        public Criteria andCustomscodeBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("customscode between", value1, value2, "customscode");
            return (Criteria) this;
        }

        public Criteria andCustomscodeNotBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("customscode not between", value1, value2, "customscode");
            return (Criteria) this;
        }



        public Criteria andCommoditynameIsNull() {
            addCriterion("commodityname is null");
            return (Criteria) this;
        }


        public Criteria andCommoditynameIsNotNull() {
            addCriterion("commodityname is not null");
            return (Criteria) this;
        }

        public Criteria andCommoditynameEqualTo(java.lang.String value) {
            addCriterion("commodityname =", value, "commodityname");
            return (Criteria) this;
        }

        public Criteria andCommoditynameNotEqualTo(java.lang.String value) {
            addCriterion("commodityname <>", value, "commodityname");
            return (Criteria) this;
        }

        public Criteria andCommoditynameGreaterThan(java.lang.String value) {
            addCriterion("commodityname >", value, "commodityname");
            return (Criteria) this;
        }

        public Criteria andCommoditynameGreaterThanOrEqualTo(java.lang.String value) {
            addCriterion("commodityname >=", value, "commodityname");
            return (Criteria) this;
        }

        public Criteria andCommoditynameLessThan(java.lang.String value) {
            addCriterion("commodityname <", value, "commodityname");
            return (Criteria) this;
        }

        public Criteria andCommoditynameLessThanOrEqualTo(java.lang.String value) {
            addCriterion("commodityname <=", value, "commodityname");
            return (Criteria) this;
        }


        public Criteria andCommoditynameIn(List<java.lang.String > values) {
            addCriterion("commodityname in", values, "commodityname");
            return (Criteria) this;
        }

        public Criteria andCommoditynameNotIn(List<java.lang.String> values) {
            addCriterion("commodityname not in", values, "commodityname");
            return (Criteria) this;
        }

        public Criteria andCommoditynameBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("commodityname between", value1, value2, "commodityname");
            return (Criteria) this;
        }

        public Criteria andCommoditynameNotBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("commodityname not between", value1, value2, "commodityname");
            return (Criteria) this;
        }



        public Criteria andTariffratesIsNull() {
            addCriterion("tariffrates is null");
            return (Criteria) this;
        }


        public Criteria andTariffratesIsNotNull() {
            addCriterion("tariffrates is not null");
            return (Criteria) this;
        }

        public Criteria andTariffratesEqualTo(java.lang.Double value) {
            addCriterion("tariffrates =", value, "tariffrates");
            return (Criteria) this;
        }

        public Criteria andTariffratesNotEqualTo(java.lang.Double value) {
            addCriterion("tariffrates <>", value, "tariffrates");
            return (Criteria) this;
        }

        public Criteria andTariffratesGreaterThan(java.lang.Double value) {
            addCriterion("tariffrates >", value, "tariffrates");
            return (Criteria) this;
        }

        public Criteria andTariffratesGreaterThanOrEqualTo(java.lang.Double value) {
            addCriterion("tariffrates >=", value, "tariffrates");
            return (Criteria) this;
        }

        public Criteria andTariffratesLessThan(java.lang.Double value) {
            addCriterion("tariffrates <", value, "tariffrates");
            return (Criteria) this;
        }

        public Criteria andTariffratesLessThanOrEqualTo(java.lang.Double value) {
            addCriterion("tariffrates <=", value, "tariffrates");
            return (Criteria) this;
        }


        public Criteria andTariffratesIn(List<java.lang.Double > values) {
            addCriterion("tariffrates in", values, "tariffrates");
            return (Criteria) this;
        }

        public Criteria andTariffratesNotIn(List<java.lang.Double> values) {
            addCriterion("tariffrates not in", values, "tariffrates");
            return (Criteria) this;
        }

        public Criteria andTariffratesBetween(java.lang.Double value1, java.lang.Double value2) {
            addCriterion("tariffrates between", value1, value2, "tariffrates");
            return (Criteria) this;
        }

        public Criteria andTariffratesNotBetween(java.lang.Double value1, java.lang.Double value2) {
            addCriterion("tariffrates not between", value1, value2, "tariffrates");
            return (Criteria) this;
        }



        public Criteria andSecondnameIsNull() {
            addCriterion("secondname is null");
            return (Criteria) this;
        }


        public Criteria andSecondnameIsNotNull() {
            addCriterion("secondname is not null");
            return (Criteria) this;
        }

        public Criteria andSecondnameEqualTo(java.lang.String value) {
            addCriterion("secondname =", value, "secondname");
            return (Criteria) this;
        }

        public Criteria andSecondnameNotEqualTo(java.lang.String value) {
            addCriterion("secondname <>", value, "secondname");
            return (Criteria) this;
        }

        public Criteria andSecondnameGreaterThan(java.lang.String value) {
            addCriterion("secondname >", value, "secondname");
            return (Criteria) this;
        }

        public Criteria andSecondnameGreaterThanOrEqualTo(java.lang.String value) {
            addCriterion("secondname >=", value, "secondname");
            return (Criteria) this;
        }

        public Criteria andSecondnameLessThan(java.lang.String value) {
            addCriterion("secondname <", value, "secondname");
            return (Criteria) this;
        }

        public Criteria andSecondnameLessThanOrEqualTo(java.lang.String value) {
            addCriterion("secondname <=", value, "secondname");
            return (Criteria) this;
        }


        public Criteria andSecondnameIn(List<java.lang.String > values) {
            addCriterion("secondname in", values, "secondname");
            return (Criteria) this;
        }

        public Criteria andSecondnameNotIn(List<java.lang.String> values) {
            addCriterion("secondname not in", values, "secondname");
            return (Criteria) this;
        }

        public Criteria andSecondnameBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("secondname between", value1, value2, "secondname");
            return (Criteria) this;
        }

        public Criteria andSecondnameNotBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("secondname not between", value1, value2, "secondname");
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