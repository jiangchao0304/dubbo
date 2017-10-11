package com.sunvalley.erp.product.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.math.BigDecimal;

/**
* @Description: SystemprofileExample
* @author
* @date 2017-10-11 02:51:00
*/
public class SystemprofileExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private int pageIndex;

    private int pageSize;

    public SystemprofileExample() {
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

    public SystemprofileExample(int pageSize, int pageIndex) {
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
        
        public Criteria andCompanyidIsNull() {
            addCriterion("companyid is null");
            return (Criteria) this;
        }


        public Criteria andCompanyidIsNotNull() {
            addCriterion("companyid is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyidEqualTo(java.lang.Integer value) {
            addCriterion("companyid =", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotEqualTo(java.lang.Integer value) {
            addCriterion("companyid <>", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidGreaterThan(java.lang.Integer value) {
            addCriterion("companyid >", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("companyid >=", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidLessThan(java.lang.Integer value) {
            addCriterion("companyid <", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("companyid <=", value, "companyid");
            return (Criteria) this;
        }


        public Criteria andCompanyidIn(List<java.lang.Integer > values) {
            addCriterion("companyid in", values, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotIn(List<java.lang.Integer> values) {
            addCriterion("companyid not in", values, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("companyid between", value1, value2, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("companyid not between", value1, value2, "companyid");
            return (Criteria) this;
        }



        public Criteria andCategoryIsNull() {
            addCriterion("category is null");
            return (Criteria) this;
        }


        public Criteria andCategoryIsNotNull() {
            addCriterion("category is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryEqualTo(java.lang.String value) {
            addCriterion("category =", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotEqualTo(java.lang.String value) {
            addCriterion("category <>", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThan(java.lang.String value) {
            addCriterion("category >", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThanOrEqualTo(java.lang.String value) {
            addCriterion("category >=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThan(java.lang.String value) {
            addCriterion("category <", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThanOrEqualTo(java.lang.String value) {
            addCriterion("category <=", value, "category");
            return (Criteria) this;
        }


        public Criteria andCategoryIn(List<java.lang.String > values) {
            addCriterion("category in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotIn(List<java.lang.String> values) {
            addCriterion("category not in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("category between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("category not between", value1, value2, "category");
            return (Criteria) this;
        }



        public Criteria andFkeyIsNull() {
            addCriterion("fkey is null");
            return (Criteria) this;
        }


        public Criteria andFkeyIsNotNull() {
            addCriterion("fkey is not null");
            return (Criteria) this;
        }

        public Criteria andFkeyEqualTo(java.lang.String value) {
            addCriterion("fkey =", value, "fkey");
            return (Criteria) this;
        }

        public Criteria andFkeyNotEqualTo(java.lang.String value) {
            addCriterion("fkey <>", value, "fkey");
            return (Criteria) this;
        }

        public Criteria andFkeyGreaterThan(java.lang.String value) {
            addCriterion("fkey >", value, "fkey");
            return (Criteria) this;
        }

        public Criteria andFkeyGreaterThanOrEqualTo(java.lang.String value) {
            addCriterion("fkey >=", value, "fkey");
            return (Criteria) this;
        }

        public Criteria andFkeyLessThan(java.lang.String value) {
            addCriterion("fkey <", value, "fkey");
            return (Criteria) this;
        }

        public Criteria andFkeyLessThanOrEqualTo(java.lang.String value) {
            addCriterion("fkey <=", value, "fkey");
            return (Criteria) this;
        }


        public Criteria andFkeyIn(List<java.lang.String > values) {
            addCriterion("fkey in", values, "fkey");
            return (Criteria) this;
        }

        public Criteria andFkeyNotIn(List<java.lang.String> values) {
            addCriterion("fkey not in", values, "fkey");
            return (Criteria) this;
        }

        public Criteria andFkeyBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("fkey between", value1, value2, "fkey");
            return (Criteria) this;
        }

        public Criteria andFkeyNotBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("fkey not between", value1, value2, "fkey");
            return (Criteria) this;
        }



        public Criteria andFvalueIsNull() {
            addCriterion("fvalue is null");
            return (Criteria) this;
        }


        public Criteria andFvalueIsNotNull() {
            addCriterion("fvalue is not null");
            return (Criteria) this;
        }

        public Criteria andFvalueEqualTo(java.lang.String value) {
            addCriterion("fvalue =", value, "fvalue");
            return (Criteria) this;
        }

        public Criteria andFvalueNotEqualTo(java.lang.String value) {
            addCriterion("fvalue <>", value, "fvalue");
            return (Criteria) this;
        }

        public Criteria andFvalueGreaterThan(java.lang.String value) {
            addCriterion("fvalue >", value, "fvalue");
            return (Criteria) this;
        }

        public Criteria andFvalueGreaterThanOrEqualTo(java.lang.String value) {
            addCriterion("fvalue >=", value, "fvalue");
            return (Criteria) this;
        }

        public Criteria andFvalueLessThan(java.lang.String value) {
            addCriterion("fvalue <", value, "fvalue");
            return (Criteria) this;
        }

        public Criteria andFvalueLessThanOrEqualTo(java.lang.String value) {
            addCriterion("fvalue <=", value, "fvalue");
            return (Criteria) this;
        }


        public Criteria andFvalueIn(List<java.lang.String > values) {
            addCriterion("fvalue in", values, "fvalue");
            return (Criteria) this;
        }

        public Criteria andFvalueNotIn(List<java.lang.String> values) {
            addCriterion("fvalue not in", values, "fvalue");
            return (Criteria) this;
        }

        public Criteria andFvalueBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("fvalue between", value1, value2, "fvalue");
            return (Criteria) this;
        }

        public Criteria andFvalueNotBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("fvalue not between", value1, value2, "fvalue");
            return (Criteria) this;
        }



        public Criteria andFdatatypeIsNull() {
            addCriterion("fdatatype is null");
            return (Criteria) this;
        }


        public Criteria andFdatatypeIsNotNull() {
            addCriterion("fdatatype is not null");
            return (Criteria) this;
        }

        public Criteria andFdatatypeEqualTo(java.lang.String value) {
            addCriterion("fdatatype =", value, "fdatatype");
            return (Criteria) this;
        }

        public Criteria andFdatatypeNotEqualTo(java.lang.String value) {
            addCriterion("fdatatype <>", value, "fdatatype");
            return (Criteria) this;
        }

        public Criteria andFdatatypeGreaterThan(java.lang.String value) {
            addCriterion("fdatatype >", value, "fdatatype");
            return (Criteria) this;
        }

        public Criteria andFdatatypeGreaterThanOrEqualTo(java.lang.String value) {
            addCriterion("fdatatype >=", value, "fdatatype");
            return (Criteria) this;
        }

        public Criteria andFdatatypeLessThan(java.lang.String value) {
            addCriterion("fdatatype <", value, "fdatatype");
            return (Criteria) this;
        }

        public Criteria andFdatatypeLessThanOrEqualTo(java.lang.String value) {
            addCriterion("fdatatype <=", value, "fdatatype");
            return (Criteria) this;
        }


        public Criteria andFdatatypeIn(List<java.lang.String > values) {
            addCriterion("fdatatype in", values, "fdatatype");
            return (Criteria) this;
        }

        public Criteria andFdatatypeNotIn(List<java.lang.String> values) {
            addCriterion("fdatatype not in", values, "fdatatype");
            return (Criteria) this;
        }

        public Criteria andFdatatypeBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("fdatatype between", value1, value2, "fdatatype");
            return (Criteria) this;
        }

        public Criteria andFdatatypeNotBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("fdatatype not between", value1, value2, "fdatatype");
            return (Criteria) this;
        }



        public Criteria andReftypeIsNull() {
            addCriterion("reftype is null");
            return (Criteria) this;
        }


        public Criteria andReftypeIsNotNull() {
            addCriterion("reftype is not null");
            return (Criteria) this;
        }

        public Criteria andReftypeEqualTo(java.lang.String value) {
            addCriterion("reftype =", value, "reftype");
            return (Criteria) this;
        }

        public Criteria andReftypeNotEqualTo(java.lang.String value) {
            addCriterion("reftype <>", value, "reftype");
            return (Criteria) this;
        }

        public Criteria andReftypeGreaterThan(java.lang.String value) {
            addCriterion("reftype >", value, "reftype");
            return (Criteria) this;
        }

        public Criteria andReftypeGreaterThanOrEqualTo(java.lang.String value) {
            addCriterion("reftype >=", value, "reftype");
            return (Criteria) this;
        }

        public Criteria andReftypeLessThan(java.lang.String value) {
            addCriterion("reftype <", value, "reftype");
            return (Criteria) this;
        }

        public Criteria andReftypeLessThanOrEqualTo(java.lang.String value) {
            addCriterion("reftype <=", value, "reftype");
            return (Criteria) this;
        }


        public Criteria andReftypeIn(List<java.lang.String > values) {
            addCriterion("reftype in", values, "reftype");
            return (Criteria) this;
        }

        public Criteria andReftypeNotIn(List<java.lang.String> values) {
            addCriterion("reftype not in", values, "reftype");
            return (Criteria) this;
        }

        public Criteria andReftypeBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("reftype between", value1, value2, "reftype");
            return (Criteria) this;
        }

        public Criteria andReftypeNotBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("reftype not between", value1, value2, "reftype");
            return (Criteria) this;
        }



        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }


        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(java.lang.String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(java.lang.String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(java.lang.String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(java.lang.String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(java.lang.String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(java.lang.String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }


        public Criteria andRemarkIn(List<java.lang.String > values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<java.lang.String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("remark not between", value1, value2, "remark");
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



        public Criteria andVersionnoIsNull() {
            addCriterion("versionno is null");
            return (Criteria) this;
        }


        public Criteria andVersionnoIsNotNull() {
            addCriterion("versionno is not null");
            return (Criteria) this;
        }

        public Criteria andVersionnoEqualTo(Short value) {
            addCriterion("versionno =", value, "versionno");
            return (Criteria) this;
        }

        public Criteria andVersionnoNotEqualTo(Short value) {
            addCriterion("versionno <>", value, "versionno");
            return (Criteria) this;
        }

        public Criteria andVersionnoGreaterThan(Short value) {
            addCriterion("versionno >", value, "versionno");
            return (Criteria) this;
        }

        public Criteria andVersionnoGreaterThanOrEqualTo(Short value) {
            addCriterion("versionno >=", value, "versionno");
            return (Criteria) this;
        }

        public Criteria andVersionnoLessThan(Short value) {
            addCriterion("versionno <", value, "versionno");
            return (Criteria) this;
        }

        public Criteria andVersionnoLessThanOrEqualTo(Short value) {
            addCriterion("versionno <=", value, "versionno");
            return (Criteria) this;
        }


        public Criteria andVersionnoIn(List<Short > values) {
            addCriterion("versionno in", values, "versionno");
            return (Criteria) this;
        }

        public Criteria andVersionnoNotIn(List<Short> values) {
            addCriterion("versionno not in", values, "versionno");
            return (Criteria) this;
        }

        public Criteria andVersionnoBetween(Short value1, Short value2) {
            addCriterion("versionno between", value1, value2, "versionno");
            return (Criteria) this;
        }

        public Criteria andVersionnoNotBetween(Short value1, Short value2) {
            addCriterion("versionno not between", value1, value2, "versionno");
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