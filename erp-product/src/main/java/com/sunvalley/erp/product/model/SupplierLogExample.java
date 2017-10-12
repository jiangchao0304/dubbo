package com.sunvalley.erp.product.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.math.BigDecimal;

/**
* @Description: SupplierLogExample
* @author
* @date 2017-10-12 04:28:05
*/
public class SupplierLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private int pageIndex;

    private int pageSize;

    public SupplierLogExample() {
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

    public SupplierLogExample(int pageSize, int pageIndex) {
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
        
        public Criteria andSupplierlogidIsNull() {
            addCriterion("supplierlogid is null");
            return (Criteria) this;
        }


        public Criteria andSupplierlogidIsNotNull() {
            addCriterion("supplierlogid is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierlogidEqualTo(java.lang.Integer value) {
            addCriterion("supplierlogid =", value, "supplierlogid");
            return (Criteria) this;
        }

        public Criteria andSupplierlogidNotEqualTo(java.lang.Integer value) {
            addCriterion("supplierlogid <>", value, "supplierlogid");
            return (Criteria) this;
        }

        public Criteria andSupplierlogidGreaterThan(java.lang.Integer value) {
            addCriterion("supplierlogid >", value, "supplierlogid");
            return (Criteria) this;
        }

        public Criteria andSupplierlogidGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("supplierlogid >=", value, "supplierlogid");
            return (Criteria) this;
        }

        public Criteria andSupplierlogidLessThan(java.lang.Integer value) {
            addCriterion("supplierlogid <", value, "supplierlogid");
            return (Criteria) this;
        }

        public Criteria andSupplierlogidLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("supplierlogid <=", value, "supplierlogid");
            return (Criteria) this;
        }


        public Criteria andSupplierlogidIn(List<java.lang.Integer > values) {
            addCriterion("supplierlogid in", values, "supplierlogid");
            return (Criteria) this;
        }

        public Criteria andSupplierlogidNotIn(List<java.lang.Integer> values) {
            addCriterion("supplierlogid not in", values, "supplierlogid");
            return (Criteria) this;
        }

        public Criteria andSupplierlogidBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("supplierlogid between", value1, value2, "supplierlogid");
            return (Criteria) this;
        }

        public Criteria andSupplierlogidNotBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("supplierlogid not between", value1, value2, "supplierlogid");
            return (Criteria) this;
        }



        public Criteria andSupplieridIsNull() {
            addCriterion("supplierid is null");
            return (Criteria) this;
        }


        public Criteria andSupplieridIsNotNull() {
            addCriterion("supplierid is not null");
            return (Criteria) this;
        }

        public Criteria andSupplieridEqualTo(java.lang.Integer value) {
            addCriterion("supplierid =", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridNotEqualTo(java.lang.Integer value) {
            addCriterion("supplierid <>", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridGreaterThan(java.lang.Integer value) {
            addCriterion("supplierid >", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("supplierid >=", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridLessThan(java.lang.Integer value) {
            addCriterion("supplierid <", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("supplierid <=", value, "supplierid");
            return (Criteria) this;
        }


        public Criteria andSupplieridIn(List<java.lang.Integer > values) {
            addCriterion("supplierid in", values, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridNotIn(List<java.lang.Integer> values) {
            addCriterion("supplierid not in", values, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("supplierid between", value1, value2, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridNotBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("supplierid not between", value1, value2, "supplierid");
            return (Criteria) this;
        }



        public Criteria andOperationUserIdIsNull() {
            addCriterion("operationUserId is null");
            return (Criteria) this;
        }


        public Criteria andOperationUserIdIsNotNull() {
            addCriterion("operationUserId is not null");
            return (Criteria) this;
        }

        public Criteria andOperationUserIdEqualTo(java.lang.Integer value) {
            addCriterion("operation_user_id =", value, "operationUserId");
            return (Criteria) this;
        }

        public Criteria andOperationUserIdNotEqualTo(java.lang.Integer value) {
            addCriterion("operation_user_id <>", value, "operationUserId");
            return (Criteria) this;
        }

        public Criteria andOperationUserIdGreaterThan(java.lang.Integer value) {
            addCriterion("operation_user_id >", value, "operationUserId");
            return (Criteria) this;
        }

        public Criteria andOperationUserIdGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("operation_user_id >=", value, "operation_user_id");
            return (Criteria) this;
        }

        public Criteria andOperationUserIdLessThan(java.lang.Integer value) {
            addCriterion("operation_user_id <", value, "operationUserId");
            return (Criteria) this;
        }

        public Criteria andOperationUserIdLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("operation_user_id <=", value, "operationUserId");
            return (Criteria) this;
        }


        public Criteria andOperationUserIdIn(List<java.lang.Integer > values) {
            addCriterion("operation_user_id in", values, "operationUserId");
            return (Criteria) this;
        }

        public Criteria andOperationUserIdNotIn(List<java.lang.Integer> values) {
            addCriterion("operation_user_id not in", values, "operationUserId");
            return (Criteria) this;
        }

        public Criteria andOperationUserIdBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("operation_user_id between", value1, value2, "operationUserId");
            return (Criteria) this;
        }

        public Criteria andOperationUserIdNotBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("operation_user_id not between", value1, value2, "operationUserId");
            return (Criteria) this;
        }



        public Criteria andOperationDateIsNull() {
            addCriterion("operationDate is null");
            return (Criteria) this;
        }


        public Criteria andOperationDateIsNotNull() {
            addCriterion("operationDate is not null");
            return (Criteria) this;
        }

        public Criteria andOperationDateEqualTo(java.util.Date value) {
            addCriterion("operation_date =", value, "operationDate");
            return (Criteria) this;
        }

        public Criteria andOperationDateNotEqualTo(java.util.Date value) {
            addCriterion("operation_date <>", value, "operationDate");
            return (Criteria) this;
        }

        public Criteria andOperationDateGreaterThan(java.util.Date value) {
            addCriterion("operation_date >", value, "operationDate");
            return (Criteria) this;
        }

        public Criteria andOperationDateGreaterThanOrEqualTo(java.util.Date value) {
            addCriterion("operation_date >=", value, "operation_date");
            return (Criteria) this;
        }

        public Criteria andOperationDateLessThan(java.util.Date value) {
            addCriterion("operation_date <", value, "operationDate");
            return (Criteria) this;
        }

        public Criteria andOperationDateLessThanOrEqualTo(java.util.Date value) {
            addCriterion("operation_date <=", value, "operationDate");
            return (Criteria) this;
        }


        public Criteria andOperationDateIn(List<java.util.Date > values) {
            addCriterion("operation_date in", values, "operationDate");
            return (Criteria) this;
        }

        public Criteria andOperationDateNotIn(List<java.util.Date> values) {
            addCriterion("operation_date not in", values, "operationDate");
            return (Criteria) this;
        }

        public Criteria andOperationDateBetween(java.util.Date value1, java.util.Date value2) {
            addCriterion("operation_date between", value1, value2, "operationDate");
            return (Criteria) this;
        }

        public Criteria andOperationDateNotBetween(java.util.Date value1, java.util.Date value2) {
            addCriterion("operation_date not between", value1, value2, "operationDate");
            return (Criteria) this;
        }



        public Criteria andOperationTypeIsNull() {
            addCriterion("operationType is null");
            return (Criteria) this;
        }


        public Criteria andOperationTypeIsNotNull() {
            addCriterion("operationType is not null");
            return (Criteria) this;
        }

        public Criteria andOperationTypeEqualTo(java.lang.Integer value) {
            addCriterion("operation_type =", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeNotEqualTo(java.lang.Integer value) {
            addCriterion("operation_type <>", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeGreaterThan(java.lang.Integer value) {
            addCriterion("operation_type >", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("operation_type >=", value, "operation_type");
            return (Criteria) this;
        }

        public Criteria andOperationTypeLessThan(java.lang.Integer value) {
            addCriterion("operation_type <", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("operation_type <=", value, "operationType");
            return (Criteria) this;
        }


        public Criteria andOperationTypeIn(List<java.lang.Integer > values) {
            addCriterion("operation_type in", values, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeNotIn(List<java.lang.Integer> values) {
            addCriterion("operation_type not in", values, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("operation_type between", value1, value2, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeNotBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("operation_type not between", value1, value2, "operationType");
            return (Criteria) this;
        }



        public Criteria andNoteIsNull() {
            addCriterion("note is null");
            return (Criteria) this;
        }


        public Criteria andNoteIsNotNull() {
            addCriterion("note is not null");
            return (Criteria) this;
        }

        public Criteria andNoteEqualTo(java.lang.String value) {
            addCriterion("note =", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualTo(java.lang.String value) {
            addCriterion("note <>", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThan(java.lang.String value) {
            addCriterion("note >", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(java.lang.String value) {
            addCriterion("note >=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThan(java.lang.String value) {
            addCriterion("note <", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualTo(java.lang.String value) {
            addCriterion("note <=", value, "note");
            return (Criteria) this;
        }


        public Criteria andNoteIn(List<java.lang.String > values) {
            addCriterion("note in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotIn(List<java.lang.String> values) {
            addCriterion("note not in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("note between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("note not between", value1, value2, "note");
            return (Criteria) this;
        }



        public Criteria andBelongsTypeIsNull() {
            addCriterion("belongsType is null");
            return (Criteria) this;
        }


        public Criteria andBelongsTypeIsNotNull() {
            addCriterion("belongsType is not null");
            return (Criteria) this;
        }

        public Criteria andBelongsTypeEqualTo(java.lang.Integer value) {
            addCriterion("belongs_type =", value, "belongsType");
            return (Criteria) this;
        }

        public Criteria andBelongsTypeNotEqualTo(java.lang.Integer value) {
            addCriterion("belongs_type <>", value, "belongsType");
            return (Criteria) this;
        }

        public Criteria andBelongsTypeGreaterThan(java.lang.Integer value) {
            addCriterion("belongs_type >", value, "belongsType");
            return (Criteria) this;
        }

        public Criteria andBelongsTypeGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("belongs_type >=", value, "belongs_type");
            return (Criteria) this;
        }

        public Criteria andBelongsTypeLessThan(java.lang.Integer value) {
            addCriterion("belongs_type <", value, "belongsType");
            return (Criteria) this;
        }

        public Criteria andBelongsTypeLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("belongs_type <=", value, "belongsType");
            return (Criteria) this;
        }


        public Criteria andBelongsTypeIn(List<java.lang.Integer > values) {
            addCriterion("belongs_type in", values, "belongsType");
            return (Criteria) this;
        }

        public Criteria andBelongsTypeNotIn(List<java.lang.Integer> values) {
            addCriterion("belongs_type not in", values, "belongsType");
            return (Criteria) this;
        }

        public Criteria andBelongsTypeBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("belongs_type between", value1, value2, "belongsType");
            return (Criteria) this;
        }

        public Criteria andBelongsTypeNotBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("belongs_type not between", value1, value2, "belongsType");
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