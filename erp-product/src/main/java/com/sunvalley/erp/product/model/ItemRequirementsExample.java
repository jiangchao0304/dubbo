package com.sunvalley.erp.product.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.math.BigDecimal;

/**
* @Description: ItemRequirementsExample
* @author
* @date 2017-10-10 04:56:56
*/
public class ItemRequirementsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private int pageIndex;

    private int pageSize;

    public ItemRequirementsExample() {
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

    public ItemRequirementsExample(int pageSize, int pageIndex) {
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



        public Criteria andTypeIdIsNull() {
            addCriterion("typeId is null");
            return (Criteria) this;
        }


        public Criteria andTypeIdIsNotNull() {
            addCriterion("typeId is not null");
            return (Criteria) this;
        }

        public Criteria andTypeIdEqualTo(Integer value) {
            addCriterion("type_id =", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotEqualTo(Integer value) {
            addCriterion("type_id <>", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThan(Integer value) {
            addCriterion("type_id >", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("type_id >=", value, "type_id");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThan(Integer value) {
            addCriterion("type_id <", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("type_id <=", value, "typeId");
            return (Criteria) this;
        }


        public Criteria andTypeIdIn(List<Integer > values) {
            addCriterion("type_id in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotIn(List<Integer> values) {
            addCriterion("type_id not in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("type_id between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("type_id not between", value1, value2, "typeId");
            return (Criteria) this;
        }



        public Criteria andProductReqIsNull() {
            addCriterion("productReq is null");
            return (Criteria) this;
        }


        public Criteria andProductReqIsNotNull() {
            addCriterion("productReq is not null");
            return (Criteria) this;
        }

        public Criteria andProductReqEqualTo(java.lang.String value) {
            addCriterion("product_req =", value, "productReq");
            return (Criteria) this;
        }

        public Criteria andProductReqNotEqualTo(java.lang.String value) {
            addCriterion("product_req <>", value, "productReq");
            return (Criteria) this;
        }

        public Criteria andProductReqGreaterThan(java.lang.String value) {
            addCriterion("product_req >", value, "productReq");
            return (Criteria) this;
        }

        public Criteria andProductReqGreaterThanOrEqualTo(java.lang.String value) {
            addCriterion("product_req >=", value, "product_req");
            return (Criteria) this;
        }

        public Criteria andProductReqLessThan(java.lang.String value) {
            addCriterion("product_req <", value, "productReq");
            return (Criteria) this;
        }

        public Criteria andProductReqLessThanOrEqualTo(java.lang.String value) {
            addCriterion("product_req <=", value, "productReq");
            return (Criteria) this;
        }


        public Criteria andProductReqIn(List<java.lang.String > values) {
            addCriterion("product_req in", values, "productReq");
            return (Criteria) this;
        }

        public Criteria andProductReqNotIn(List<java.lang.String> values) {
            addCriterion("product_req not in", values, "productReq");
            return (Criteria) this;
        }

        public Criteria andProductReqBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("product_req between", value1, value2, "productReq");
            return (Criteria) this;
        }

        public Criteria andProductReqNotBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("product_req not between", value1, value2, "productReq");
            return (Criteria) this;
        }



        public Criteria andPurchaseReqIsNull() {
            addCriterion("purchaseReq is null");
            return (Criteria) this;
        }


        public Criteria andPurchaseReqIsNotNull() {
            addCriterion("purchaseReq is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseReqEqualTo(java.lang.String value) {
            addCriterion("purchase_req =", value, "purchaseReq");
            return (Criteria) this;
        }

        public Criteria andPurchaseReqNotEqualTo(java.lang.String value) {
            addCriterion("purchase_req <>", value, "purchaseReq");
            return (Criteria) this;
        }

        public Criteria andPurchaseReqGreaterThan(java.lang.String value) {
            addCriterion("purchase_req >", value, "purchaseReq");
            return (Criteria) this;
        }

        public Criteria andPurchaseReqGreaterThanOrEqualTo(java.lang.String value) {
            addCriterion("purchase_req >=", value, "purchase_req");
            return (Criteria) this;
        }

        public Criteria andPurchaseReqLessThan(java.lang.String value) {
            addCriterion("purchase_req <", value, "purchaseReq");
            return (Criteria) this;
        }

        public Criteria andPurchaseReqLessThanOrEqualTo(java.lang.String value) {
            addCriterion("purchase_req <=", value, "purchaseReq");
            return (Criteria) this;
        }


        public Criteria andPurchaseReqIn(List<java.lang.String > values) {
            addCriterion("purchase_req in", values, "purchaseReq");
            return (Criteria) this;
        }

        public Criteria andPurchaseReqNotIn(List<java.lang.String> values) {
            addCriterion("purchase_req not in", values, "purchaseReq");
            return (Criteria) this;
        }

        public Criteria andPurchaseReqBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("purchase_req between", value1, value2, "purchaseReq");
            return (Criteria) this;
        }

        public Criteria andPurchaseReqNotBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("purchase_req not between", value1, value2, "purchaseReq");
            return (Criteria) this;
        }



        public Criteria andWarehouseReqIsNull() {
            addCriterion("warehouseReq is null");
            return (Criteria) this;
        }


        public Criteria andWarehouseReqIsNotNull() {
            addCriterion("warehouseReq is not null");
            return (Criteria) this;
        }

        public Criteria andWarehouseReqEqualTo(java.lang.String value) {
            addCriterion("warehouse_req =", value, "warehouseReq");
            return (Criteria) this;
        }

        public Criteria andWarehouseReqNotEqualTo(java.lang.String value) {
            addCriterion("warehouse_req <>", value, "warehouseReq");
            return (Criteria) this;
        }

        public Criteria andWarehouseReqGreaterThan(java.lang.String value) {
            addCriterion("warehouse_req >", value, "warehouseReq");
            return (Criteria) this;
        }

        public Criteria andWarehouseReqGreaterThanOrEqualTo(java.lang.String value) {
            addCriterion("warehouse_req >=", value, "warehouse_req");
            return (Criteria) this;
        }

        public Criteria andWarehouseReqLessThan(java.lang.String value) {
            addCriterion("warehouse_req <", value, "warehouseReq");
            return (Criteria) this;
        }

        public Criteria andWarehouseReqLessThanOrEqualTo(java.lang.String value) {
            addCriterion("warehouse_req <=", value, "warehouseReq");
            return (Criteria) this;
        }


        public Criteria andWarehouseReqIn(List<java.lang.String > values) {
            addCriterion("warehouse_req in", values, "warehouseReq");
            return (Criteria) this;
        }

        public Criteria andWarehouseReqNotIn(List<java.lang.String> values) {
            addCriterion("warehouse_req not in", values, "warehouseReq");
            return (Criteria) this;
        }

        public Criteria andWarehouseReqBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("warehouse_req between", value1, value2, "warehouseReq");
            return (Criteria) this;
        }

        public Criteria andWarehouseReqNotBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("warehouse_req not between", value1, value2, "warehouseReq");
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