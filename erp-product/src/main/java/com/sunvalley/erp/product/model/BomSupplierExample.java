package com.sunvalley.erp.product.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.math.BigDecimal;

/**
* @Description: BomSupplierExample
* @author
* @date 2017-10-13 02:10:23
*/
public class BomSupplierExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private int pageIndex;

    private int pageSize;

    public BomSupplierExample() {
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

    public BomSupplierExample(int pageSize, int pageIndex) {
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



        public Criteria andBomIdIsNull() {
            addCriterion("bomId is null");
            return (Criteria) this;
        }


        public Criteria andBomIdIsNotNull() {
            addCriterion("bomId is not null");
            return (Criteria) this;
        }

        public Criteria andBomIdEqualTo(java.lang.Integer value) {
            addCriterion("bom_id =", value, "bomId");
            return (Criteria) this;
        }

        public Criteria andBomIdNotEqualTo(java.lang.Integer value) {
            addCriterion("bom_id <>", value, "bomId");
            return (Criteria) this;
        }

        public Criteria andBomIdGreaterThan(java.lang.Integer value) {
            addCriterion("bom_id >", value, "bomId");
            return (Criteria) this;
        }

        public Criteria andBomIdGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("bom_id >=", value, "bom_id");
            return (Criteria) this;
        }

        public Criteria andBomIdLessThan(java.lang.Integer value) {
            addCriterion("bom_id <", value, "bomId");
            return (Criteria) this;
        }

        public Criteria andBomIdLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("bom_id <=", value, "bomId");
            return (Criteria) this;
        }


        public Criteria andBomIdIn(List<java.lang.Integer > values) {
            addCriterion("bom_id in", values, "bomId");
            return (Criteria) this;
        }

        public Criteria andBomIdNotIn(List<java.lang.Integer> values) {
            addCriterion("bom_id not in", values, "bomId");
            return (Criteria) this;
        }

        public Criteria andBomIdBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("bom_id between", value1, value2, "bomId");
            return (Criteria) this;
        }

        public Criteria andBomIdNotBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("bom_id not between", value1, value2, "bomId");
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



        public Criteria andPurchasePropertyIsNull() {
            addCriterion("purchaseProperty is null");
            return (Criteria) this;
        }


        public Criteria andPurchasePropertyIsNotNull() {
            addCriterion("purchaseProperty is not null");
            return (Criteria) this;
        }

        public Criteria andPurchasePropertyEqualTo(java.lang.Integer value) {
            addCriterion("purchase_property =", value, "purchaseProperty");
            return (Criteria) this;
        }

        public Criteria andPurchasePropertyNotEqualTo(java.lang.Integer value) {
            addCriterion("purchase_property <>", value, "purchaseProperty");
            return (Criteria) this;
        }

        public Criteria andPurchasePropertyGreaterThan(java.lang.Integer value) {
            addCriterion("purchase_property >", value, "purchaseProperty");
            return (Criteria) this;
        }

        public Criteria andPurchasePropertyGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("purchase_property >=", value, "purchase_property");
            return (Criteria) this;
        }

        public Criteria andPurchasePropertyLessThan(java.lang.Integer value) {
            addCriterion("purchase_property <", value, "purchaseProperty");
            return (Criteria) this;
        }

        public Criteria andPurchasePropertyLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("purchase_property <=", value, "purchaseProperty");
            return (Criteria) this;
        }


        public Criteria andPurchasePropertyIn(List<java.lang.Integer > values) {
            addCriterion("purchase_property in", values, "purchaseProperty");
            return (Criteria) this;
        }

        public Criteria andPurchasePropertyNotIn(List<java.lang.Integer> values) {
            addCriterion("purchase_property not in", values, "purchaseProperty");
            return (Criteria) this;
        }

        public Criteria andPurchasePropertyBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("purchase_property between", value1, value2, "purchaseProperty");
            return (Criteria) this;
        }

        public Criteria andPurchasePropertyNotBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("purchase_property not between", value1, value2, "purchaseProperty");
            return (Criteria) this;
        }



        public Criteria andSupplierIdIsNull() {
            addCriterion("supplierId is null");
            return (Criteria) this;
        }


        public Criteria andSupplierIdIsNotNull() {
            addCriterion("supplierId is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierIdEqualTo(java.lang.Integer value) {
            addCriterion("supplier_id =", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotEqualTo(java.lang.Integer value) {
            addCriterion("supplier_id <>", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdGreaterThan(java.lang.Integer value) {
            addCriterion("supplier_id >", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("supplier_id >=", value, "supplier_id");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLessThan(java.lang.Integer value) {
            addCriterion("supplier_id <", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("supplier_id <=", value, "supplierId");
            return (Criteria) this;
        }


        public Criteria andSupplierIdIn(List<java.lang.Integer > values) {
            addCriterion("supplier_id in", values, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotIn(List<java.lang.Integer> values) {
            addCriterion("supplier_id not in", values, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("supplier_id between", value1, value2, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("supplier_id not between", value1, value2, "supplierId");
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