package com.sunvalley.erp.product.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.math.BigDecimal;

/**
* @Description: SkuDescriptionExample
* @author
* @date 2017-10-12 04:27:53
*/
public class SkuDescriptionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private int pageIndex;

    private int pageSize;

    public SkuDescriptionExample() {
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

    public SkuDescriptionExample(int pageSize, int pageIndex) {
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



        public Criteria andDescSourcIsNull() {
            addCriterion("descSourc is null");
            return (Criteria) this;
        }


        public Criteria andDescSourcIsNotNull() {
            addCriterion("descSourc is not null");
            return (Criteria) this;
        }

        public Criteria andDescSourcEqualTo(java.lang.String value) {
            addCriterion("desc_sourc =", value, "descSourc");
            return (Criteria) this;
        }

        public Criteria andDescSourcNotEqualTo(java.lang.String value) {
            addCriterion("desc_sourc <>", value, "descSourc");
            return (Criteria) this;
        }

        public Criteria andDescSourcGreaterThan(java.lang.String value) {
            addCriterion("desc_sourc >", value, "descSourc");
            return (Criteria) this;
        }

        public Criteria andDescSourcGreaterThanOrEqualTo(java.lang.String value) {
            addCriterion("desc_sourc >=", value, "desc_sourc");
            return (Criteria) this;
        }

        public Criteria andDescSourcLessThan(java.lang.String value) {
            addCriterion("desc_sourc <", value, "descSourc");
            return (Criteria) this;
        }

        public Criteria andDescSourcLessThanOrEqualTo(java.lang.String value) {
            addCriterion("desc_sourc <=", value, "descSourc");
            return (Criteria) this;
        }


        public Criteria andDescSourcIn(List<java.lang.String > values) {
            addCriterion("desc_sourc in", values, "descSourc");
            return (Criteria) this;
        }

        public Criteria andDescSourcNotIn(List<java.lang.String> values) {
            addCriterion("desc_sourc not in", values, "descSourc");
            return (Criteria) this;
        }

        public Criteria andDescSourcBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("desc_sourc between", value1, value2, "descSourc");
            return (Criteria) this;
        }

        public Criteria andDescSourcNotBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("desc_sourc not between", value1, value2, "descSourc");
            return (Criteria) this;
        }



        public Criteria andActionIsNull() {
            addCriterion("action is null");
            return (Criteria) this;
        }


        public Criteria andActionIsNotNull() {
            addCriterion("action is not null");
            return (Criteria) this;
        }

        public Criteria andActionEqualTo(java.lang.String value) {
            addCriterion("action =", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionNotEqualTo(java.lang.String value) {
            addCriterion("action <>", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionGreaterThan(java.lang.String value) {
            addCriterion("action >", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionGreaterThanOrEqualTo(java.lang.String value) {
            addCriterion("action >=", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionLessThan(java.lang.String value) {
            addCriterion("action <", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionLessThanOrEqualTo(java.lang.String value) {
            addCriterion("action <=", value, "action");
            return (Criteria) this;
        }


        public Criteria andActionIn(List<java.lang.String > values) {
            addCriterion("action in", values, "action");
            return (Criteria) this;
        }

        public Criteria andActionNotIn(List<java.lang.String> values) {
            addCriterion("action not in", values, "action");
            return (Criteria) this;
        }

        public Criteria andActionBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("action between", value1, value2, "action");
            return (Criteria) this;
        }

        public Criteria andActionNotBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("action not between", value1, value2, "action");
            return (Criteria) this;
        }



        public Criteria andUpdatepicuserIsNull() {
            addCriterion("updatepicuser is null");
            return (Criteria) this;
        }


        public Criteria andUpdatepicuserIsNotNull() {
            addCriterion("updatepicuser is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatepicuserEqualTo(java.lang.String value) {
            addCriterion("updatepicuser =", value, "updatepicuser");
            return (Criteria) this;
        }

        public Criteria andUpdatepicuserNotEqualTo(java.lang.String value) {
            addCriterion("updatepicuser <>", value, "updatepicuser");
            return (Criteria) this;
        }

        public Criteria andUpdatepicuserGreaterThan(java.lang.String value) {
            addCriterion("updatepicuser >", value, "updatepicuser");
            return (Criteria) this;
        }

        public Criteria andUpdatepicuserGreaterThanOrEqualTo(java.lang.String value) {
            addCriterion("updatepicuser >=", value, "updatepicuser");
            return (Criteria) this;
        }

        public Criteria andUpdatepicuserLessThan(java.lang.String value) {
            addCriterion("updatepicuser <", value, "updatepicuser");
            return (Criteria) this;
        }

        public Criteria andUpdatepicuserLessThanOrEqualTo(java.lang.String value) {
            addCriterion("updatepicuser <=", value, "updatepicuser");
            return (Criteria) this;
        }


        public Criteria andUpdatepicuserIn(List<java.lang.String > values) {
            addCriterion("updatepicuser in", values, "updatepicuser");
            return (Criteria) this;
        }

        public Criteria andUpdatepicuserNotIn(List<java.lang.String> values) {
            addCriterion("updatepicuser not in", values, "updatepicuser");
            return (Criteria) this;
        }

        public Criteria andUpdatepicuserBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("updatepicuser between", value1, value2, "updatepicuser");
            return (Criteria) this;
        }

        public Criteria andUpdatepicuserNotBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("updatepicuser not between", value1, value2, "updatepicuser");
            return (Criteria) this;
        }



        public Criteria andUpdatepicdateIsNull() {
            addCriterion("updatepicdate is null");
            return (Criteria) this;
        }


        public Criteria andUpdatepicdateIsNotNull() {
            addCriterion("updatepicdate is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatepicdateEqualTo(java.util.Date value) {
            addCriterion("updatepicdate =", value, "updatepicdate");
            return (Criteria) this;
        }

        public Criteria andUpdatepicdateNotEqualTo(java.util.Date value) {
            addCriterion("updatepicdate <>", value, "updatepicdate");
            return (Criteria) this;
        }

        public Criteria andUpdatepicdateGreaterThan(java.util.Date value) {
            addCriterion("updatepicdate >", value, "updatepicdate");
            return (Criteria) this;
        }

        public Criteria andUpdatepicdateGreaterThanOrEqualTo(java.util.Date value) {
            addCriterion("updatepicdate >=", value, "updatepicdate");
            return (Criteria) this;
        }

        public Criteria andUpdatepicdateLessThan(java.util.Date value) {
            addCriterion("updatepicdate <", value, "updatepicdate");
            return (Criteria) this;
        }

        public Criteria andUpdatepicdateLessThanOrEqualTo(java.util.Date value) {
            addCriterion("updatepicdate <=", value, "updatepicdate");
            return (Criteria) this;
        }


        public Criteria andUpdatepicdateIn(List<java.util.Date > values) {
            addCriterion("updatepicdate in", values, "updatepicdate");
            return (Criteria) this;
        }

        public Criteria andUpdatepicdateNotIn(List<java.util.Date> values) {
            addCriterion("updatepicdate not in", values, "updatepicdate");
            return (Criteria) this;
        }

        public Criteria andUpdatepicdateBetween(java.util.Date value1, java.util.Date value2) {
            addCriterion("updatepicdate between", value1, value2, "updatepicdate");
            return (Criteria) this;
        }

        public Criteria andUpdatepicdateNotBetween(java.util.Date value1, java.util.Date value2) {
            addCriterion("updatepicdate not between", value1, value2, "updatepicdate");
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