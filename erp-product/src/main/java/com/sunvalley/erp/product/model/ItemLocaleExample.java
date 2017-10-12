package com.sunvalley.erp.product.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.math.BigDecimal;

/**
* @Description: ItemLocaleExample
* @author
* @date 2017-10-12 04:24:05
*/
public class ItemLocaleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private int pageIndex;

    private int pageSize;

    public ItemLocaleExample() {
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

    public ItemLocaleExample(int pageSize, int pageIndex) {
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



        public Criteria andLangIdIsNull() {
            addCriterion("langId is null");
            return (Criteria) this;
        }


        public Criteria andLangIdIsNotNull() {
            addCriterion("langId is not null");
            return (Criteria) this;
        }

        public Criteria andLangIdEqualTo(Integer value) {
            addCriterion("lang_id =", value, "langId");
            return (Criteria) this;
        }

        public Criteria andLangIdNotEqualTo(Integer value) {
            addCriterion("lang_id <>", value, "langId");
            return (Criteria) this;
        }

        public Criteria andLangIdGreaterThan(Integer value) {
            addCriterion("lang_id >", value, "langId");
            return (Criteria) this;
        }

        public Criteria andLangIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("lang_id >=", value, "lang_id");
            return (Criteria) this;
        }

        public Criteria andLangIdLessThan(Integer value) {
            addCriterion("lang_id <", value, "langId");
            return (Criteria) this;
        }

        public Criteria andLangIdLessThanOrEqualTo(Integer value) {
            addCriterion("lang_id <=", value, "langId");
            return (Criteria) this;
        }


        public Criteria andLangIdIn(List<Integer > values) {
            addCriterion("lang_id in", values, "langId");
            return (Criteria) this;
        }

        public Criteria andLangIdNotIn(List<Integer> values) {
            addCriterion("lang_id not in", values, "langId");
            return (Criteria) this;
        }

        public Criteria andLangIdBetween(Integer value1, Integer value2) {
            addCriterion("lang_id between", value1, value2, "langId");
            return (Criteria) this;
        }

        public Criteria andLangIdNotBetween(Integer value1, Integer value2) {
            addCriterion("lang_id not between", value1, value2, "langId");
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



        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }


        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(java.lang.String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(java.lang.String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(java.lang.String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(java.lang.String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(java.lang.String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(java.lang.String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }


        public Criteria andDescriptionIn(List<java.lang.String > values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<java.lang.String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }



        public Criteria andUnitNameIsNull() {
            addCriterion("unitName is null");
            return (Criteria) this;
        }


        public Criteria andUnitNameIsNotNull() {
            addCriterion("unitName is not null");
            return (Criteria) this;
        }

        public Criteria andUnitNameEqualTo(java.lang.String value) {
            addCriterion("unitName =", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameNotEqualTo(java.lang.String value) {
            addCriterion("unitName <>", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameGreaterThan(java.lang.String value) {
            addCriterion("unitName >", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameGreaterThanOrEqualTo(java.lang.String value) {
            addCriterion("unitName >=", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameLessThan(java.lang.String value) {
            addCriterion("unitName <", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameLessThanOrEqualTo(java.lang.String value) {
            addCriterion("unitName <=", value, "unitName");
            return (Criteria) this;
        }


        public Criteria andUnitNameIn(List<java.lang.String > values) {
            addCriterion("unitName in", values, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameNotIn(List<java.lang.String> values) {
            addCriterion("unitName not in", values, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("unitName between", value1, value2, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameNotBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("unitName not between", value1, value2, "unitName");
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