package com.sunvalley.erp.product.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.math.BigDecimal;

/**
* @Description: ItemLogExample
* @author
* @date 2017-10-13 02:11:20
*/
public class ItemLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private int pageIndex;

    private int pageSize;

    public ItemLogExample() {
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

    public ItemLogExample(int pageSize, int pageIndex) {
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



        public Criteria andOptypeIsNull() {
            addCriterion("optype is null");
            return (Criteria) this;
        }


        public Criteria andOptypeIsNotNull() {
            addCriterion("optype is not null");
            return (Criteria) this;
        }

        public Criteria andOptypeEqualTo(java.lang.Integer value) {
            addCriterion("optype =", value, "optype");
            return (Criteria) this;
        }

        public Criteria andOptypeNotEqualTo(java.lang.Integer value) {
            addCriterion("optype <>", value, "optype");
            return (Criteria) this;
        }

        public Criteria andOptypeGreaterThan(java.lang.Integer value) {
            addCriterion("optype >", value, "optype");
            return (Criteria) this;
        }

        public Criteria andOptypeGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("optype >=", value, "optype");
            return (Criteria) this;
        }

        public Criteria andOptypeLessThan(java.lang.Integer value) {
            addCriterion("optype <", value, "optype");
            return (Criteria) this;
        }

        public Criteria andOptypeLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("optype <=", value, "optype");
            return (Criteria) this;
        }


        public Criteria andOptypeIn(List<java.lang.Integer > values) {
            addCriterion("optype in", values, "optype");
            return (Criteria) this;
        }

        public Criteria andOptypeNotIn(List<java.lang.Integer> values) {
            addCriterion("optype not in", values, "optype");
            return (Criteria) this;
        }

        public Criteria andOptypeBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("optype between", value1, value2, "optype");
            return (Criteria) this;
        }

        public Criteria andOptypeNotBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("optype not between", value1, value2, "optype");
            return (Criteria) this;
        }



        public Criteria andInfoTypeIsNull() {
            addCriterion("infoType is null");
            return (Criteria) this;
        }


        public Criteria andInfoTypeIsNotNull() {
            addCriterion("infoType is not null");
            return (Criteria) this;
        }

        public Criteria andInfoTypeEqualTo(java.lang.Integer value) {
            addCriterion("info_type =", value, "infoType");
            return (Criteria) this;
        }

        public Criteria andInfoTypeNotEqualTo(java.lang.Integer value) {
            addCriterion("info_type <>", value, "infoType");
            return (Criteria) this;
        }

        public Criteria andInfoTypeGreaterThan(java.lang.Integer value) {
            addCriterion("info_type >", value, "infoType");
            return (Criteria) this;
        }

        public Criteria andInfoTypeGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("info_type >=", value, "info_type");
            return (Criteria) this;
        }

        public Criteria andInfoTypeLessThan(java.lang.Integer value) {
            addCriterion("info_type <", value, "infoType");
            return (Criteria) this;
        }

        public Criteria andInfoTypeLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("info_type <=", value, "infoType");
            return (Criteria) this;
        }


        public Criteria andInfoTypeIn(List<java.lang.Integer > values) {
            addCriterion("info_type in", values, "infoType");
            return (Criteria) this;
        }

        public Criteria andInfoTypeNotIn(List<java.lang.Integer> values) {
            addCriterion("info_type not in", values, "infoType");
            return (Criteria) this;
        }

        public Criteria andInfoTypeBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("info_type between", value1, value2, "infoType");
            return (Criteria) this;
        }

        public Criteria andInfoTypeNotBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("info_type not between", value1, value2, "infoType");
            return (Criteria) this;
        }



        public Criteria andOpnoteIsNull() {
            addCriterion("opnote is null");
            return (Criteria) this;
        }


        public Criteria andOpnoteIsNotNull() {
            addCriterion("opnote is not null");
            return (Criteria) this;
        }

        public Criteria andOpnoteEqualTo(java.lang.String value) {
            addCriterion("opnote =", value, "opnote");
            return (Criteria) this;
        }

        public Criteria andOpnoteNotEqualTo(java.lang.String value) {
            addCriterion("opnote <>", value, "opnote");
            return (Criteria) this;
        }

        public Criteria andOpnoteGreaterThan(java.lang.String value) {
            addCriterion("opnote >", value, "opnote");
            return (Criteria) this;
        }

        public Criteria andOpnoteGreaterThanOrEqualTo(java.lang.String value) {
            addCriterion("opnote >=", value, "opnote");
            return (Criteria) this;
        }

        public Criteria andOpnoteLessThan(java.lang.String value) {
            addCriterion("opnote <", value, "opnote");
            return (Criteria) this;
        }

        public Criteria andOpnoteLessThanOrEqualTo(java.lang.String value) {
            addCriterion("opnote <=", value, "opnote");
            return (Criteria) this;
        }


        public Criteria andOpnoteIn(List<java.lang.String > values) {
            addCriterion("opnote in", values, "opnote");
            return (Criteria) this;
        }

        public Criteria andOpnoteNotIn(List<java.lang.String> values) {
            addCriterion("opnote not in", values, "opnote");
            return (Criteria) this;
        }

        public Criteria andOpnoteBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("opnote between", value1, value2, "opnote");
            return (Criteria) this;
        }

        public Criteria andOpnoteNotBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("opnote not between", value1, value2, "opnote");
            return (Criteria) this;
        }



        public Criteria andOpteratorIsNull() {
            addCriterion("opterator is null");
            return (Criteria) this;
        }


        public Criteria andOpteratorIsNotNull() {
            addCriterion("opterator is not null");
            return (Criteria) this;
        }

        public Criteria andOpteratorEqualTo(java.lang.String value) {
            addCriterion("opterator =", value, "opterator");
            return (Criteria) this;
        }

        public Criteria andOpteratorNotEqualTo(java.lang.String value) {
            addCriterion("opterator <>", value, "opterator");
            return (Criteria) this;
        }

        public Criteria andOpteratorGreaterThan(java.lang.String value) {
            addCriterion("opterator >", value, "opterator");
            return (Criteria) this;
        }

        public Criteria andOpteratorGreaterThanOrEqualTo(java.lang.String value) {
            addCriterion("opterator >=", value, "opterator");
            return (Criteria) this;
        }

        public Criteria andOpteratorLessThan(java.lang.String value) {
            addCriterion("opterator <", value, "opterator");
            return (Criteria) this;
        }

        public Criteria andOpteratorLessThanOrEqualTo(java.lang.String value) {
            addCriterion("opterator <=", value, "opterator");
            return (Criteria) this;
        }


        public Criteria andOpteratorIn(List<java.lang.String > values) {
            addCriterion("opterator in", values, "opterator");
            return (Criteria) this;
        }

        public Criteria andOpteratorNotIn(List<java.lang.String> values) {
            addCriterion("opterator not in", values, "opterator");
            return (Criteria) this;
        }

        public Criteria andOpteratorBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("opterator between", value1, value2, "opterator");
            return (Criteria) this;
        }

        public Criteria andOpteratorNotBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("opterator not between", value1, value2, "opterator");
            return (Criteria) this;
        }



        public Criteria andOpteratoridIsNull() {
            addCriterion("opteratorid is null");
            return (Criteria) this;
        }


        public Criteria andOpteratoridIsNotNull() {
            addCriterion("opteratorid is not null");
            return (Criteria) this;
        }

        public Criteria andOpteratoridEqualTo(java.lang.Integer value) {
            addCriterion("opteratorid =", value, "opteratorid");
            return (Criteria) this;
        }

        public Criteria andOpteratoridNotEqualTo(java.lang.Integer value) {
            addCriterion("opteratorid <>", value, "opteratorid");
            return (Criteria) this;
        }

        public Criteria andOpteratoridGreaterThan(java.lang.Integer value) {
            addCriterion("opteratorid >", value, "opteratorid");
            return (Criteria) this;
        }

        public Criteria andOpteratoridGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("opteratorid >=", value, "opteratorid");
            return (Criteria) this;
        }

        public Criteria andOpteratoridLessThan(java.lang.Integer value) {
            addCriterion("opteratorid <", value, "opteratorid");
            return (Criteria) this;
        }

        public Criteria andOpteratoridLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("opteratorid <=", value, "opteratorid");
            return (Criteria) this;
        }


        public Criteria andOpteratoridIn(List<java.lang.Integer > values) {
            addCriterion("opteratorid in", values, "opteratorid");
            return (Criteria) this;
        }

        public Criteria andOpteratoridNotIn(List<java.lang.Integer> values) {
            addCriterion("opteratorid not in", values, "opteratorid");
            return (Criteria) this;
        }

        public Criteria andOpteratoridBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("opteratorid between", value1, value2, "opteratorid");
            return (Criteria) this;
        }

        public Criteria andOpteratoridNotBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("opteratorid not between", value1, value2, "opteratorid");
            return (Criteria) this;
        }



        public Criteria andOpdateIsNull() {
            addCriterion("opdate is null");
            return (Criteria) this;
        }


        public Criteria andOpdateIsNotNull() {
            addCriterion("opdate is not null");
            return (Criteria) this;
        }

        public Criteria andOpdateEqualTo(java.util.Date value) {
            addCriterion("opdate =", value, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateNotEqualTo(java.util.Date value) {
            addCriterion("opdate <>", value, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateGreaterThan(java.util.Date value) {
            addCriterion("opdate >", value, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateGreaterThanOrEqualTo(java.util.Date value) {
            addCriterion("opdate >=", value, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateLessThan(java.util.Date value) {
            addCriterion("opdate <", value, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateLessThanOrEqualTo(java.util.Date value) {
            addCriterion("opdate <=", value, "opdate");
            return (Criteria) this;
        }


        public Criteria andOpdateIn(List<java.util.Date > values) {
            addCriterion("opdate in", values, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateNotIn(List<java.util.Date> values) {
            addCriterion("opdate not in", values, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateBetween(java.util.Date value1, java.util.Date value2) {
            addCriterion("opdate between", value1, value2, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateNotBetween(java.util.Date value1, java.util.Date value2) {
            addCriterion("opdate not between", value1, value2, "opdate");
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