package com.sunvalley.erp.product.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.math.BigDecimal;

/**
* @Description: ItemBrandExample
* @author
* @date 2017-10-13 02:10:46
*/
public class ItemBrandExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private int pageIndex;

    private int pageSize;

    public ItemBrandExample() {
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

    public ItemBrandExample(int pageSize, int pageIndex) {
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
        
        public Criteria andBrandIdIsNull() {
            addCriterion("brandId is null");
            return (Criteria) this;
        }


        public Criteria andBrandIdIsNotNull() {
            addCriterion("brandId is not null");
            return (Criteria) this;
        }

        public Criteria andBrandIdEqualTo(java.lang.Integer value) {
            addCriterion("brand_id =", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotEqualTo(java.lang.Integer value) {
            addCriterion("brand_id <>", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdGreaterThan(java.lang.Integer value) {
            addCriterion("brand_id >", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("brand_id >=", value, "brand_id");
            return (Criteria) this;
        }

        public Criteria andBrandIdLessThan(java.lang.Integer value) {
            addCriterion("brand_id <", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("brand_id <=", value, "brandId");
            return (Criteria) this;
        }


        public Criteria andBrandIdIn(List<java.lang.Integer > values) {
            addCriterion("brand_id in", values, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotIn(List<java.lang.Integer> values) {
            addCriterion("brand_id not in", values, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("brand_id between", value1, value2, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("brand_id not between", value1, value2, "brandId");
            return (Criteria) this;
        }



        public Criteria andParentIdIsNull() {
            addCriterion("parentId is null");
            return (Criteria) this;
        }


        public Criteria andParentIdIsNotNull() {
            addCriterion("parentId is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(java.lang.Integer value) {
            addCriterion("parent_id =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(java.lang.Integer value) {
            addCriterion("parent_id <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(java.lang.Integer value) {
            addCriterion("parent_id >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("parent_id >=", value, "parent_id");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(java.lang.Integer value) {
            addCriterion("parent_id <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("parent_id <=", value, "parentId");
            return (Criteria) this;
        }


        public Criteria andParentIdIn(List<java.lang.Integer > values) {
            addCriterion("parent_id in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<java.lang.Integer> values) {
            addCriterion("parent_id not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("parent_id between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("parent_id not between", value1, value2, "parentId");
            return (Criteria) this;
        }



        public Criteria andBrandDescIsNull() {
            addCriterion("brandDesc is null");
            return (Criteria) this;
        }


        public Criteria andBrandDescIsNotNull() {
            addCriterion("brandDesc is not null");
            return (Criteria) this;
        }

        public Criteria andBrandDescEqualTo(java.lang.String value) {
            addCriterion("brand_desc =", value, "brandDesc");
            return (Criteria) this;
        }

        public Criteria andBrandDescNotEqualTo(java.lang.String value) {
            addCriterion("brand_desc <>", value, "brandDesc");
            return (Criteria) this;
        }

        public Criteria andBrandDescGreaterThan(java.lang.String value) {
            addCriterion("brand_desc >", value, "brandDesc");
            return (Criteria) this;
        }

        public Criteria andBrandDescGreaterThanOrEqualTo(java.lang.String value) {
            addCriterion("brand_desc >=", value, "brand_desc");
            return (Criteria) this;
        }

        public Criteria andBrandDescLessThan(java.lang.String value) {
            addCriterion("brand_desc <", value, "brandDesc");
            return (Criteria) this;
        }

        public Criteria andBrandDescLessThanOrEqualTo(java.lang.String value) {
            addCriterion("brand_desc <=", value, "brandDesc");
            return (Criteria) this;
        }


        public Criteria andBrandDescIn(List<java.lang.String > values) {
            addCriterion("brand_desc in", values, "brandDesc");
            return (Criteria) this;
        }

        public Criteria andBrandDescNotIn(List<java.lang.String> values) {
            addCriterion("brand_desc not in", values, "brandDesc");
            return (Criteria) this;
        }

        public Criteria andBrandDescBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("brand_desc between", value1, value2, "brandDesc");
            return (Criteria) this;
        }

        public Criteria andBrandDescNotBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("brand_desc not between", value1, value2, "brandDesc");
            return (Criteria) this;
        }



        public Criteria andOrdernoIsNull() {
            addCriterion("orderno is null");
            return (Criteria) this;
        }


        public Criteria andOrdernoIsNotNull() {
            addCriterion("orderno is not null");
            return (Criteria) this;
        }

        public Criteria andOrdernoEqualTo(java.lang.Integer value) {
            addCriterion("orderno =", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoNotEqualTo(java.lang.Integer value) {
            addCriterion("orderno <>", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoGreaterThan(java.lang.Integer value) {
            addCriterion("orderno >", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("orderno >=", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoLessThan(java.lang.Integer value) {
            addCriterion("orderno <", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("orderno <=", value, "orderno");
            return (Criteria) this;
        }


        public Criteria andOrdernoIn(List<java.lang.Integer > values) {
            addCriterion("orderno in", values, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoNotIn(List<java.lang.Integer> values) {
            addCriterion("orderno not in", values, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("orderno between", value1, value2, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoNotBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("orderno not between", value1, value2, "orderno");
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



        public Criteria andRatioIsNull() {
            addCriterion("ratio is null");
            return (Criteria) this;
        }


        public Criteria andRatioIsNotNull() {
            addCriterion("ratio is not null");
            return (Criteria) this;
        }

        public Criteria andRatioEqualTo(BigDecimal value) {
            addCriterion("ratio =", value, "ratio");
            return (Criteria) this;
        }

        public Criteria andRatioNotEqualTo(BigDecimal value) {
            addCriterion("ratio <>", value, "ratio");
            return (Criteria) this;
        }

        public Criteria andRatioGreaterThan(BigDecimal value) {
            addCriterion("ratio >", value, "ratio");
            return (Criteria) this;
        }

        public Criteria andRatioGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ratio >=", value, "ratio");
            return (Criteria) this;
        }

        public Criteria andRatioLessThan(BigDecimal value) {
            addCriterion("ratio <", value, "ratio");
            return (Criteria) this;
        }

        public Criteria andRatioLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ratio <=", value, "ratio");
            return (Criteria) this;
        }


        public Criteria andRatioIn(List<BigDecimal > values) {
            addCriterion("ratio in", values, "ratio");
            return (Criteria) this;
        }

        public Criteria andRatioNotIn(List<BigDecimal> values) {
            addCriterion("ratio not in", values, "ratio");
            return (Criteria) this;
        }

        public Criteria andRatioBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ratio between", value1, value2, "ratio");
            return (Criteria) this;
        }

        public Criteria andRatioNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ratio not between", value1, value2, "ratio");
            return (Criteria) this;
        }



        public Criteria andBrandCodeIsNull() {
            addCriterion("brandCode is null");
            return (Criteria) this;
        }


        public Criteria andBrandCodeIsNotNull() {
            addCriterion("brandCode is not null");
            return (Criteria) this;
        }

        public Criteria andBrandCodeEqualTo(java.lang.String value) {
            addCriterion("brand_code =", value, "brandCode");
            return (Criteria) this;
        }

        public Criteria andBrandCodeNotEqualTo(java.lang.String value) {
            addCriterion("brand_code <>", value, "brandCode");
            return (Criteria) this;
        }

        public Criteria andBrandCodeGreaterThan(java.lang.String value) {
            addCriterion("brand_code >", value, "brandCode");
            return (Criteria) this;
        }

        public Criteria andBrandCodeGreaterThanOrEqualTo(java.lang.String value) {
            addCriterion("brand_code >=", value, "brand_code");
            return (Criteria) this;
        }

        public Criteria andBrandCodeLessThan(java.lang.String value) {
            addCriterion("brand_code <", value, "brandCode");
            return (Criteria) this;
        }

        public Criteria andBrandCodeLessThanOrEqualTo(java.lang.String value) {
            addCriterion("brand_code <=", value, "brandCode");
            return (Criteria) this;
        }


        public Criteria andBrandCodeIn(List<java.lang.String > values) {
            addCriterion("brand_code in", values, "brandCode");
            return (Criteria) this;
        }

        public Criteria andBrandCodeNotIn(List<java.lang.String> values) {
            addCriterion("brand_code not in", values, "brandCode");
            return (Criteria) this;
        }

        public Criteria andBrandCodeBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("brand_code between", value1, value2, "brandCode");
            return (Criteria) this;
        }

        public Criteria andBrandCodeNotBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("brand_code not between", value1, value2, "brandCode");
            return (Criteria) this;
        }



        public Criteria andHasusedIsNull() {
            addCriterion("hasused is null");
            return (Criteria) this;
        }


        public Criteria andHasusedIsNotNull() {
            addCriterion("hasused is not null");
            return (Criteria) this;
        }

        public Criteria andHasusedEqualTo(java.lang.Integer value) {
            addCriterion("hasused =", value, "hasused");
            return (Criteria) this;
        }

        public Criteria andHasusedNotEqualTo(java.lang.Integer value) {
            addCriterion("hasused <>", value, "hasused");
            return (Criteria) this;
        }

        public Criteria andHasusedGreaterThan(java.lang.Integer value) {
            addCriterion("hasused >", value, "hasused");
            return (Criteria) this;
        }

        public Criteria andHasusedGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("hasused >=", value, "hasused");
            return (Criteria) this;
        }

        public Criteria andHasusedLessThan(java.lang.Integer value) {
            addCriterion("hasused <", value, "hasused");
            return (Criteria) this;
        }

        public Criteria andHasusedLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("hasused <=", value, "hasused");
            return (Criteria) this;
        }


        public Criteria andHasusedIn(List<java.lang.Integer > values) {
            addCriterion("hasused in", values, "hasused");
            return (Criteria) this;
        }

        public Criteria andHasusedNotIn(List<java.lang.Integer> values) {
            addCriterion("hasused not in", values, "hasused");
            return (Criteria) this;
        }

        public Criteria andHasusedBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("hasused between", value1, value2, "hasused");
            return (Criteria) this;
        }

        public Criteria andHasusedNotBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("hasused not between", value1, value2, "hasused");
            return (Criteria) this;
        }



        public Criteria andControlValueIsNull() {
            addCriterion("controlValue is null");
            return (Criteria) this;
        }


        public Criteria andControlValueIsNotNull() {
            addCriterion("controlValue is not null");
            return (Criteria) this;
        }

        public Criteria andControlValueEqualTo(java.lang.Integer value) {
            addCriterion("control_value =", value, "controlValue");
            return (Criteria) this;
        }

        public Criteria andControlValueNotEqualTo(java.lang.Integer value) {
            addCriterion("control_value <>", value, "controlValue");
            return (Criteria) this;
        }

        public Criteria andControlValueGreaterThan(java.lang.Integer value) {
            addCriterion("control_value >", value, "controlValue");
            return (Criteria) this;
        }

        public Criteria andControlValueGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("control_value >=", value, "control_value");
            return (Criteria) this;
        }

        public Criteria andControlValueLessThan(java.lang.Integer value) {
            addCriterion("control_value <", value, "controlValue");
            return (Criteria) this;
        }

        public Criteria andControlValueLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("control_value <=", value, "controlValue");
            return (Criteria) this;
        }


        public Criteria andControlValueIn(List<java.lang.Integer > values) {
            addCriterion("control_value in", values, "controlValue");
            return (Criteria) this;
        }

        public Criteria andControlValueNotIn(List<java.lang.Integer> values) {
            addCriterion("control_value not in", values, "controlValue");
            return (Criteria) this;
        }

        public Criteria andControlValueBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("control_value between", value1, value2, "controlValue");
            return (Criteria) this;
        }

        public Criteria andControlValueNotBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("control_value not between", value1, value2, "controlValue");
            return (Criteria) this;
        }



        public Criteria andWarningProportionIsNull() {
            addCriterion("warningProportion is null");
            return (Criteria) this;
        }


        public Criteria andWarningProportionIsNotNull() {
            addCriterion("warningProportion is not null");
            return (Criteria) this;
        }

        public Criteria andWarningProportionEqualTo(BigDecimal value) {
            addCriterion("warning_proportion =", value, "warningProportion");
            return (Criteria) this;
        }

        public Criteria andWarningProportionNotEqualTo(BigDecimal value) {
            addCriterion("warning_proportion <>", value, "warningProportion");
            return (Criteria) this;
        }

        public Criteria andWarningProportionGreaterThan(BigDecimal value) {
            addCriterion("warning_proportion >", value, "warningProportion");
            return (Criteria) this;
        }

        public Criteria andWarningProportionGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("warning_proportion >=", value, "warning_proportion");
            return (Criteria) this;
        }

        public Criteria andWarningProportionLessThan(BigDecimal value) {
            addCriterion("warning_proportion <", value, "warningProportion");
            return (Criteria) this;
        }

        public Criteria andWarningProportionLessThanOrEqualTo(BigDecimal value) {
            addCriterion("warning_proportion <=", value, "warningProportion");
            return (Criteria) this;
        }


        public Criteria andWarningProportionIn(List<BigDecimal > values) {
            addCriterion("warning_proportion in", values, "warningProportion");
            return (Criteria) this;
        }

        public Criteria andWarningProportionNotIn(List<BigDecimal> values) {
            addCriterion("warning_proportion not in", values, "warningProportion");
            return (Criteria) this;
        }

        public Criteria andWarningProportionBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("warning_proportion between", value1, value2, "warningProportion");
            return (Criteria) this;
        }

        public Criteria andWarningProportionNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("warning_proportion not between", value1, value2, "warningProportion");
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