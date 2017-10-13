package com.sunvalley.erp.product.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.math.BigDecimal;

/**
* @Description: ItemVirtualExample
* @author
* @date 2017-10-13 02:12:14
*/
public class ItemVirtualExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private int pageIndex;

    private int pageSize;

    public ItemVirtualExample() {
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

    public ItemVirtualExample(int pageSize, int pageIndex) {
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
        
        public Criteria andVirtualSkuidIsNull() {
            addCriterion("virtualSkuid is null");
            return (Criteria) this;
        }


        public Criteria andVirtualSkuidIsNotNull() {
            addCriterion("virtualSkuid is not null");
            return (Criteria) this;
        }

        public Criteria andVirtualSkuidEqualTo(java.lang.Integer value) {
            addCriterion("virtual_skuid =", value, "virtualSkuid");
            return (Criteria) this;
        }

        public Criteria andVirtualSkuidNotEqualTo(java.lang.Integer value) {
            addCriterion("virtual_skuid <>", value, "virtualSkuid");
            return (Criteria) this;
        }

        public Criteria andVirtualSkuidGreaterThan(java.lang.Integer value) {
            addCriterion("virtual_skuid >", value, "virtualSkuid");
            return (Criteria) this;
        }

        public Criteria andVirtualSkuidGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("virtual_skuid >=", value, "virtual_skuid");
            return (Criteria) this;
        }

        public Criteria andVirtualSkuidLessThan(java.lang.Integer value) {
            addCriterion("virtual_skuid <", value, "virtualSkuid");
            return (Criteria) this;
        }

        public Criteria andVirtualSkuidLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("virtual_skuid <=", value, "virtualSkuid");
            return (Criteria) this;
        }


        public Criteria andVirtualSkuidIn(List<java.lang.Integer > values) {
            addCriterion("virtual_skuid in", values, "virtualSkuid");
            return (Criteria) this;
        }

        public Criteria andVirtualSkuidNotIn(List<java.lang.Integer> values) {
            addCriterion("virtual_skuid not in", values, "virtualSkuid");
            return (Criteria) this;
        }

        public Criteria andVirtualSkuidBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("virtual_skuid between", value1, value2, "virtualSkuid");
            return (Criteria) this;
        }

        public Criteria andVirtualSkuidNotBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("virtual_skuid not between", value1, value2, "virtualSkuid");
            return (Criteria) this;
        }



        public Criteria andActualSkuidIsNull() {
            addCriterion("actualSkuid is null");
            return (Criteria) this;
        }


        public Criteria andActualSkuidIsNotNull() {
            addCriterion("actualSkuid is not null");
            return (Criteria) this;
        }

        public Criteria andActualSkuidEqualTo(java.lang.Integer value) {
            addCriterion("actual_skuid =", value, "actualSkuid");
            return (Criteria) this;
        }

        public Criteria andActualSkuidNotEqualTo(java.lang.Integer value) {
            addCriterion("actual_skuid <>", value, "actualSkuid");
            return (Criteria) this;
        }

        public Criteria andActualSkuidGreaterThan(java.lang.Integer value) {
            addCriterion("actual_skuid >", value, "actualSkuid");
            return (Criteria) this;
        }

        public Criteria andActualSkuidGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("actual_skuid >=", value, "actual_skuid");
            return (Criteria) this;
        }

        public Criteria andActualSkuidLessThan(java.lang.Integer value) {
            addCriterion("actual_skuid <", value, "actualSkuid");
            return (Criteria) this;
        }

        public Criteria andActualSkuidLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("actual_skuid <=", value, "actualSkuid");
            return (Criteria) this;
        }


        public Criteria andActualSkuidIn(List<java.lang.Integer > values) {
            addCriterion("actual_skuid in", values, "actualSkuid");
            return (Criteria) this;
        }

        public Criteria andActualSkuidNotIn(List<java.lang.Integer> values) {
            addCriterion("actual_skuid not in", values, "actualSkuid");
            return (Criteria) this;
        }

        public Criteria andActualSkuidBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("actual_skuid between", value1, value2, "actualSkuid");
            return (Criteria) this;
        }

        public Criteria andActualSkuidNotBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("actual_skuid not between", value1, value2, "actualSkuid");
            return (Criteria) this;
        }



        public Criteria andQtyIsNull() {
            addCriterion("qty is null");
            return (Criteria) this;
        }


        public Criteria andQtyIsNotNull() {
            addCriterion("qty is not null");
            return (Criteria) this;
        }

        public Criteria andQtyEqualTo(Short value) {
            addCriterion("qty =", value, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyNotEqualTo(Short value) {
            addCriterion("qty <>", value, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyGreaterThan(Short value) {
            addCriterion("qty >", value, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyGreaterThanOrEqualTo(Short value) {
            addCriterion("qty >=", value, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyLessThan(Short value) {
            addCriterion("qty <", value, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyLessThanOrEqualTo(Short value) {
            addCriterion("qty <=", value, "qty");
            return (Criteria) this;
        }


        public Criteria andQtyIn(List<Short > values) {
            addCriterion("qty in", values, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyNotIn(List<Short> values) {
            addCriterion("qty not in", values, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyBetween(Short value1, Short value2) {
            addCriterion("qty between", value1, value2, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyNotBetween(Short value1, Short value2) {
            addCriterion("qty not between", value1, value2, "qty");
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