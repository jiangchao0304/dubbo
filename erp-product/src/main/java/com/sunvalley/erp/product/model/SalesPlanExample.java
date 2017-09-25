package com.sunvalley.erp.product.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.math.BigDecimal;

/**
* @Description: SalesPlanExample
* @author
* @date 2017-09-25 03:10:56
*/
public class SalesPlanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private int pageIndex;

    private int pageSize;

    public SalesPlanExample() {
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

    public SalesPlanExample(int pageSize, int pageIndex) {
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



        public Criteria andOrgIdIsNull() {
            addCriterion("orgId is null");
            return (Criteria) this;
        }


        public Criteria andOrgIdIsNotNull() {
            addCriterion("orgId is not null");
            return (Criteria) this;
        }

        public Criteria andOrgIdEqualTo(java.lang.Integer value) {
            addCriterion("org_id =", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotEqualTo(java.lang.Integer value) {
            addCriterion("org_id <>", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThan(java.lang.Integer value) {
            addCriterion("org_id >", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("org_id >=", value, "org_id");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThan(java.lang.Integer value) {
            addCriterion("org_id <", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("org_id <=", value, "orgId");
            return (Criteria) this;
        }


        public Criteria andOrgIdIn(List<java.lang.Integer > values) {
            addCriterion("org_id in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotIn(List<java.lang.Integer> values) {
            addCriterion("org_id not in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("org_id between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("org_id not between", value1, value2, "orgId");
            return (Criteria) this;
        }



        public Criteria andSalesPlanVersionIsNull() {
            addCriterion("salesPlanVersion is null");
            return (Criteria) this;
        }


        public Criteria andSalesPlanVersionIsNotNull() {
            addCriterion("salesPlanVersion is not null");
            return (Criteria) this;
        }

        public Criteria andSalesPlanVersionEqualTo(java.lang.Integer value) {
            addCriterion("sales_plan_version =", value, "salesPlanVersion");
            return (Criteria) this;
        }

        public Criteria andSalesPlanVersionNotEqualTo(java.lang.Integer value) {
            addCriterion("sales_plan_version <>", value, "salesPlanVersion");
            return (Criteria) this;
        }

        public Criteria andSalesPlanVersionGreaterThan(java.lang.Integer value) {
            addCriterion("sales_plan_version >", value, "salesPlanVersion");
            return (Criteria) this;
        }

        public Criteria andSalesPlanVersionGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("sales_plan_version >=", value, "sales_plan_version");
            return (Criteria) this;
        }

        public Criteria andSalesPlanVersionLessThan(java.lang.Integer value) {
            addCriterion("sales_plan_version <", value, "salesPlanVersion");
            return (Criteria) this;
        }

        public Criteria andSalesPlanVersionLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("sales_plan_version <=", value, "salesPlanVersion");
            return (Criteria) this;
        }


        public Criteria andSalesPlanVersionIn(List<java.lang.Integer > values) {
            addCriterion("sales_plan_version in", values, "salesPlanVersion");
            return (Criteria) this;
        }

        public Criteria andSalesPlanVersionNotIn(List<java.lang.Integer> values) {
            addCriterion("sales_plan_version not in", values, "salesPlanVersion");
            return (Criteria) this;
        }

        public Criteria andSalesPlanVersionBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("sales_plan_version between", value1, value2, "salesPlanVersion");
            return (Criteria) this;
        }

        public Criteria andSalesPlanVersionNotBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("sales_plan_version not between", value1, value2, "salesPlanVersion");
            return (Criteria) this;
        }



        public Criteria andPlanTypeIsNull() {
            addCriterion("planType is null");
            return (Criteria) this;
        }


        public Criteria andPlanTypeIsNotNull() {
            addCriterion("planType is not null");
            return (Criteria) this;
        }

        public Criteria andPlanTypeEqualTo(java.lang.Integer value) {
            addCriterion("plan_type =", value, "planType");
            return (Criteria) this;
        }

        public Criteria andPlanTypeNotEqualTo(java.lang.Integer value) {
            addCriterion("plan_type <>", value, "planType");
            return (Criteria) this;
        }

        public Criteria andPlanTypeGreaterThan(java.lang.Integer value) {
            addCriterion("plan_type >", value, "planType");
            return (Criteria) this;
        }

        public Criteria andPlanTypeGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("plan_type >=", value, "plan_type");
            return (Criteria) this;
        }

        public Criteria andPlanTypeLessThan(java.lang.Integer value) {
            addCriterion("plan_type <", value, "planType");
            return (Criteria) this;
        }

        public Criteria andPlanTypeLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("plan_type <=", value, "planType");
            return (Criteria) this;
        }


        public Criteria andPlanTypeIn(List<java.lang.Integer > values) {
            addCriterion("plan_type in", values, "planType");
            return (Criteria) this;
        }

        public Criteria andPlanTypeNotIn(List<java.lang.Integer> values) {
            addCriterion("plan_type not in", values, "planType");
            return (Criteria) this;
        }

        public Criteria andPlanTypeBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("plan_type between", value1, value2, "planType");
            return (Criteria) this;
        }

        public Criteria andPlanTypeNotBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("plan_type not between", value1, value2, "planType");
            return (Criteria) this;
        }



        public Criteria andDataTypeIsNull() {
            addCriterion("dataType is null");
            return (Criteria) this;
        }


        public Criteria andDataTypeIsNotNull() {
            addCriterion("dataType is not null");
            return (Criteria) this;
        }

        public Criteria andDataTypeEqualTo(java.lang.String value) {
            addCriterion("data_type =", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeNotEqualTo(java.lang.String value) {
            addCriterion("data_type <>", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeGreaterThan(java.lang.String value) {
            addCriterion("data_type >", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeGreaterThanOrEqualTo(java.lang.String value) {
            addCriterion("data_type >=", value, "data_type");
            return (Criteria) this;
        }

        public Criteria andDataTypeLessThan(java.lang.String value) {
            addCriterion("data_type <", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeLessThanOrEqualTo(java.lang.String value) {
            addCriterion("data_type <=", value, "dataType");
            return (Criteria) this;
        }


        public Criteria andDataTypeIn(List<java.lang.String > values) {
            addCriterion("data_type in", values, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeNotIn(List<java.lang.String> values) {
            addCriterion("data_type not in", values, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("data_type between", value1, value2, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeNotBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("data_type not between", value1, value2, "dataType");
            return (Criteria) this;
        }



        public Criteria andPjanIsNull() {
            addCriterion("pjan is null");
            return (Criteria) this;
        }


        public Criteria andPjanIsNotNull() {
            addCriterion("pjan is not null");
            return (Criteria) this;
        }

        public Criteria andPjanEqualTo(BigDecimal value) {
            addCriterion("p_jan =", value, "pjan");
            return (Criteria) this;
        }

        public Criteria andPjanNotEqualTo(BigDecimal value) {
            addCriterion("p_jan <>", value, "pjan");
            return (Criteria) this;
        }

        public Criteria andPjanGreaterThan(BigDecimal value) {
            addCriterion("p_jan >", value, "pjan");
            return (Criteria) this;
        }

        public Criteria andPjanGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("p_jan >=", value, "p_jan");
            return (Criteria) this;
        }

        public Criteria andPjanLessThan(BigDecimal value) {
            addCriterion("p_jan <", value, "pjan");
            return (Criteria) this;
        }

        public Criteria andPjanLessThanOrEqualTo(BigDecimal value) {
            addCriterion("p_jan <=", value, "pjan");
            return (Criteria) this;
        }


        public Criteria andPjanIn(List<BigDecimal > values) {
            addCriterion("p_jan in", values, "pjan");
            return (Criteria) this;
        }

        public Criteria andPjanNotIn(List<BigDecimal> values) {
            addCriterion("p_jan not in", values, "pjan");
            return (Criteria) this;
        }

        public Criteria andPjanBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("p_jan between", value1, value2, "pjan");
            return (Criteria) this;
        }

        public Criteria andPjanNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("p_jan not between", value1, value2, "pjan");
            return (Criteria) this;
        }



        public Criteria andPfebIsNull() {
            addCriterion("pfeb is null");
            return (Criteria) this;
        }


        public Criteria andPfebIsNotNull() {
            addCriterion("pfeb is not null");
            return (Criteria) this;
        }

        public Criteria andPfebEqualTo(BigDecimal value) {
            addCriterion("p_feb =", value, "pfeb");
            return (Criteria) this;
        }

        public Criteria andPfebNotEqualTo(BigDecimal value) {
            addCriterion("p_feb <>", value, "pfeb");
            return (Criteria) this;
        }

        public Criteria andPfebGreaterThan(BigDecimal value) {
            addCriterion("p_feb >", value, "pfeb");
            return (Criteria) this;
        }

        public Criteria andPfebGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("p_feb >=", value, "p_feb");
            return (Criteria) this;
        }

        public Criteria andPfebLessThan(BigDecimal value) {
            addCriterion("p_feb <", value, "pfeb");
            return (Criteria) this;
        }

        public Criteria andPfebLessThanOrEqualTo(BigDecimal value) {
            addCriterion("p_feb <=", value, "pfeb");
            return (Criteria) this;
        }


        public Criteria andPfebIn(List<BigDecimal > values) {
            addCriterion("p_feb in", values, "pfeb");
            return (Criteria) this;
        }

        public Criteria andPfebNotIn(List<BigDecimal> values) {
            addCriterion("p_feb not in", values, "pfeb");
            return (Criteria) this;
        }

        public Criteria andPfebBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("p_feb between", value1, value2, "pfeb");
            return (Criteria) this;
        }

        public Criteria andPfebNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("p_feb not between", value1, value2, "pfeb");
            return (Criteria) this;
        }



        public Criteria andPmarIsNull() {
            addCriterion("pmar is null");
            return (Criteria) this;
        }


        public Criteria andPmarIsNotNull() {
            addCriterion("pmar is not null");
            return (Criteria) this;
        }

        public Criteria andPmarEqualTo(BigDecimal value) {
            addCriterion("p_mar =", value, "pmar");
            return (Criteria) this;
        }

        public Criteria andPmarNotEqualTo(BigDecimal value) {
            addCriterion("p_mar <>", value, "pmar");
            return (Criteria) this;
        }

        public Criteria andPmarGreaterThan(BigDecimal value) {
            addCriterion("p_mar >", value, "pmar");
            return (Criteria) this;
        }

        public Criteria andPmarGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("p_mar >=", value, "p_mar");
            return (Criteria) this;
        }

        public Criteria andPmarLessThan(BigDecimal value) {
            addCriterion("p_mar <", value, "pmar");
            return (Criteria) this;
        }

        public Criteria andPmarLessThanOrEqualTo(BigDecimal value) {
            addCriterion("p_mar <=", value, "pmar");
            return (Criteria) this;
        }


        public Criteria andPmarIn(List<BigDecimal > values) {
            addCriterion("p_mar in", values, "pmar");
            return (Criteria) this;
        }

        public Criteria andPmarNotIn(List<BigDecimal> values) {
            addCriterion("p_mar not in", values, "pmar");
            return (Criteria) this;
        }

        public Criteria andPmarBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("p_mar between", value1, value2, "pmar");
            return (Criteria) this;
        }

        public Criteria andPmarNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("p_mar not between", value1, value2, "pmar");
            return (Criteria) this;
        }



        public Criteria andPaprIsNull() {
            addCriterion("papr is null");
            return (Criteria) this;
        }


        public Criteria andPaprIsNotNull() {
            addCriterion("papr is not null");
            return (Criteria) this;
        }

        public Criteria andPaprEqualTo(BigDecimal value) {
            addCriterion("p_apr =", value, "papr");
            return (Criteria) this;
        }

        public Criteria andPaprNotEqualTo(BigDecimal value) {
            addCriterion("p_apr <>", value, "papr");
            return (Criteria) this;
        }

        public Criteria andPaprGreaterThan(BigDecimal value) {
            addCriterion("p_apr >", value, "papr");
            return (Criteria) this;
        }

        public Criteria andPaprGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("p_apr >=", value, "p_apr");
            return (Criteria) this;
        }

        public Criteria andPaprLessThan(BigDecimal value) {
            addCriterion("p_apr <", value, "papr");
            return (Criteria) this;
        }

        public Criteria andPaprLessThanOrEqualTo(BigDecimal value) {
            addCriterion("p_apr <=", value, "papr");
            return (Criteria) this;
        }


        public Criteria andPaprIn(List<BigDecimal > values) {
            addCriterion("p_apr in", values, "papr");
            return (Criteria) this;
        }

        public Criteria andPaprNotIn(List<BigDecimal> values) {
            addCriterion("p_apr not in", values, "papr");
            return (Criteria) this;
        }

        public Criteria andPaprBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("p_apr between", value1, value2, "papr");
            return (Criteria) this;
        }

        public Criteria andPaprNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("p_apr not between", value1, value2, "papr");
            return (Criteria) this;
        }



        public Criteria andPmayIsNull() {
            addCriterion("pmay is null");
            return (Criteria) this;
        }


        public Criteria andPmayIsNotNull() {
            addCriterion("pmay is not null");
            return (Criteria) this;
        }

        public Criteria andPmayEqualTo(BigDecimal value) {
            addCriterion("p_may =", value, "pmay");
            return (Criteria) this;
        }

        public Criteria andPmayNotEqualTo(BigDecimal value) {
            addCriterion("p_may <>", value, "pmay");
            return (Criteria) this;
        }

        public Criteria andPmayGreaterThan(BigDecimal value) {
            addCriterion("p_may >", value, "pmay");
            return (Criteria) this;
        }

        public Criteria andPmayGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("p_may >=", value, "p_may");
            return (Criteria) this;
        }

        public Criteria andPmayLessThan(BigDecimal value) {
            addCriterion("p_may <", value, "pmay");
            return (Criteria) this;
        }

        public Criteria andPmayLessThanOrEqualTo(BigDecimal value) {
            addCriterion("p_may <=", value, "pmay");
            return (Criteria) this;
        }


        public Criteria andPmayIn(List<BigDecimal > values) {
            addCriterion("p_may in", values, "pmay");
            return (Criteria) this;
        }

        public Criteria andPmayNotIn(List<BigDecimal> values) {
            addCriterion("p_may not in", values, "pmay");
            return (Criteria) this;
        }

        public Criteria andPmayBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("p_may between", value1, value2, "pmay");
            return (Criteria) this;
        }

        public Criteria andPmayNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("p_may not between", value1, value2, "pmay");
            return (Criteria) this;
        }



        public Criteria andPjunIsNull() {
            addCriterion("pjun is null");
            return (Criteria) this;
        }


        public Criteria andPjunIsNotNull() {
            addCriterion("pjun is not null");
            return (Criteria) this;
        }

        public Criteria andPjunEqualTo(BigDecimal value) {
            addCriterion("p_jun =", value, "pjun");
            return (Criteria) this;
        }

        public Criteria andPjunNotEqualTo(BigDecimal value) {
            addCriterion("p_jun <>", value, "pjun");
            return (Criteria) this;
        }

        public Criteria andPjunGreaterThan(BigDecimal value) {
            addCriterion("p_jun >", value, "pjun");
            return (Criteria) this;
        }

        public Criteria andPjunGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("p_jun >=", value, "p_jun");
            return (Criteria) this;
        }

        public Criteria andPjunLessThan(BigDecimal value) {
            addCriterion("p_jun <", value, "pjun");
            return (Criteria) this;
        }

        public Criteria andPjunLessThanOrEqualTo(BigDecimal value) {
            addCriterion("p_jun <=", value, "pjun");
            return (Criteria) this;
        }


        public Criteria andPjunIn(List<BigDecimal > values) {
            addCriterion("p_jun in", values, "pjun");
            return (Criteria) this;
        }

        public Criteria andPjunNotIn(List<BigDecimal> values) {
            addCriterion("p_jun not in", values, "pjun");
            return (Criteria) this;
        }

        public Criteria andPjunBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("p_jun between", value1, value2, "pjun");
            return (Criteria) this;
        }

        public Criteria andPjunNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("p_jun not between", value1, value2, "pjun");
            return (Criteria) this;
        }



        public Criteria andPjulIsNull() {
            addCriterion("pjul is null");
            return (Criteria) this;
        }


        public Criteria andPjulIsNotNull() {
            addCriterion("pjul is not null");
            return (Criteria) this;
        }

        public Criteria andPjulEqualTo(BigDecimal value) {
            addCriterion("p_jul =", value, "pjul");
            return (Criteria) this;
        }

        public Criteria andPjulNotEqualTo(BigDecimal value) {
            addCriterion("p_jul <>", value, "pjul");
            return (Criteria) this;
        }

        public Criteria andPjulGreaterThan(BigDecimal value) {
            addCriterion("p_jul >", value, "pjul");
            return (Criteria) this;
        }

        public Criteria andPjulGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("p_jul >=", value, "p_jul");
            return (Criteria) this;
        }

        public Criteria andPjulLessThan(BigDecimal value) {
            addCriterion("p_jul <", value, "pjul");
            return (Criteria) this;
        }

        public Criteria andPjulLessThanOrEqualTo(BigDecimal value) {
            addCriterion("p_jul <=", value, "pjul");
            return (Criteria) this;
        }


        public Criteria andPjulIn(List<BigDecimal > values) {
            addCriterion("p_jul in", values, "pjul");
            return (Criteria) this;
        }

        public Criteria andPjulNotIn(List<BigDecimal> values) {
            addCriterion("p_jul not in", values, "pjul");
            return (Criteria) this;
        }

        public Criteria andPjulBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("p_jul between", value1, value2, "pjul");
            return (Criteria) this;
        }

        public Criteria andPjulNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("p_jul not between", value1, value2, "pjul");
            return (Criteria) this;
        }



        public Criteria andPaugIsNull() {
            addCriterion("paug is null");
            return (Criteria) this;
        }


        public Criteria andPaugIsNotNull() {
            addCriterion("paug is not null");
            return (Criteria) this;
        }

        public Criteria andPaugEqualTo(BigDecimal value) {
            addCriterion("p_aug =", value, "paug");
            return (Criteria) this;
        }

        public Criteria andPaugNotEqualTo(BigDecimal value) {
            addCriterion("p_aug <>", value, "paug");
            return (Criteria) this;
        }

        public Criteria andPaugGreaterThan(BigDecimal value) {
            addCriterion("p_aug >", value, "paug");
            return (Criteria) this;
        }

        public Criteria andPaugGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("p_aug >=", value, "p_aug");
            return (Criteria) this;
        }

        public Criteria andPaugLessThan(BigDecimal value) {
            addCriterion("p_aug <", value, "paug");
            return (Criteria) this;
        }

        public Criteria andPaugLessThanOrEqualTo(BigDecimal value) {
            addCriterion("p_aug <=", value, "paug");
            return (Criteria) this;
        }


        public Criteria andPaugIn(List<BigDecimal > values) {
            addCriterion("p_aug in", values, "paug");
            return (Criteria) this;
        }

        public Criteria andPaugNotIn(List<BigDecimal> values) {
            addCriterion("p_aug not in", values, "paug");
            return (Criteria) this;
        }

        public Criteria andPaugBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("p_aug between", value1, value2, "paug");
            return (Criteria) this;
        }

        public Criteria andPaugNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("p_aug not between", value1, value2, "paug");
            return (Criteria) this;
        }



        public Criteria andPsepIsNull() {
            addCriterion("psep is null");
            return (Criteria) this;
        }


        public Criteria andPsepIsNotNull() {
            addCriterion("psep is not null");
            return (Criteria) this;
        }

        public Criteria andPsepEqualTo(BigDecimal value) {
            addCriterion("p_sep =", value, "psep");
            return (Criteria) this;
        }

        public Criteria andPsepNotEqualTo(BigDecimal value) {
            addCriterion("p_sep <>", value, "psep");
            return (Criteria) this;
        }

        public Criteria andPsepGreaterThan(BigDecimal value) {
            addCriterion("p_sep >", value, "psep");
            return (Criteria) this;
        }

        public Criteria andPsepGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("p_sep >=", value, "p_sep");
            return (Criteria) this;
        }

        public Criteria andPsepLessThan(BigDecimal value) {
            addCriterion("p_sep <", value, "psep");
            return (Criteria) this;
        }

        public Criteria andPsepLessThanOrEqualTo(BigDecimal value) {
            addCriterion("p_sep <=", value, "psep");
            return (Criteria) this;
        }


        public Criteria andPsepIn(List<BigDecimal > values) {
            addCriterion("p_sep in", values, "psep");
            return (Criteria) this;
        }

        public Criteria andPsepNotIn(List<BigDecimal> values) {
            addCriterion("p_sep not in", values, "psep");
            return (Criteria) this;
        }

        public Criteria andPsepBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("p_sep between", value1, value2, "psep");
            return (Criteria) this;
        }

        public Criteria andPsepNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("p_sep not between", value1, value2, "psep");
            return (Criteria) this;
        }



        public Criteria andPoctIsNull() {
            addCriterion("poct is null");
            return (Criteria) this;
        }


        public Criteria andPoctIsNotNull() {
            addCriterion("poct is not null");
            return (Criteria) this;
        }

        public Criteria andPoctEqualTo(BigDecimal value) {
            addCriterion("p_oct =", value, "poct");
            return (Criteria) this;
        }

        public Criteria andPoctNotEqualTo(BigDecimal value) {
            addCriterion("p_oct <>", value, "poct");
            return (Criteria) this;
        }

        public Criteria andPoctGreaterThan(BigDecimal value) {
            addCriterion("p_oct >", value, "poct");
            return (Criteria) this;
        }

        public Criteria andPoctGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("p_oct >=", value, "p_oct");
            return (Criteria) this;
        }

        public Criteria andPoctLessThan(BigDecimal value) {
            addCriterion("p_oct <", value, "poct");
            return (Criteria) this;
        }

        public Criteria andPoctLessThanOrEqualTo(BigDecimal value) {
            addCriterion("p_oct <=", value, "poct");
            return (Criteria) this;
        }


        public Criteria andPoctIn(List<BigDecimal > values) {
            addCriterion("p_oct in", values, "poct");
            return (Criteria) this;
        }

        public Criteria andPoctNotIn(List<BigDecimal> values) {
            addCriterion("p_oct not in", values, "poct");
            return (Criteria) this;
        }

        public Criteria andPoctBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("p_oct between", value1, value2, "poct");
            return (Criteria) this;
        }

        public Criteria andPoctNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("p_oct not between", value1, value2, "poct");
            return (Criteria) this;
        }



        public Criteria andPnovIsNull() {
            addCriterion("pnov is null");
            return (Criteria) this;
        }


        public Criteria andPnovIsNotNull() {
            addCriterion("pnov is not null");
            return (Criteria) this;
        }

        public Criteria andPnovEqualTo(BigDecimal value) {
            addCriterion("p_nov =", value, "pnov");
            return (Criteria) this;
        }

        public Criteria andPnovNotEqualTo(BigDecimal value) {
            addCriterion("p_nov <>", value, "pnov");
            return (Criteria) this;
        }

        public Criteria andPnovGreaterThan(BigDecimal value) {
            addCriterion("p_nov >", value, "pnov");
            return (Criteria) this;
        }

        public Criteria andPnovGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("p_nov >=", value, "p_nov");
            return (Criteria) this;
        }

        public Criteria andPnovLessThan(BigDecimal value) {
            addCriterion("p_nov <", value, "pnov");
            return (Criteria) this;
        }

        public Criteria andPnovLessThanOrEqualTo(BigDecimal value) {
            addCriterion("p_nov <=", value, "pnov");
            return (Criteria) this;
        }


        public Criteria andPnovIn(List<BigDecimal > values) {
            addCriterion("p_nov in", values, "pnov");
            return (Criteria) this;
        }

        public Criteria andPnovNotIn(List<BigDecimal> values) {
            addCriterion("p_nov not in", values, "pnov");
            return (Criteria) this;
        }

        public Criteria andPnovBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("p_nov between", value1, value2, "pnov");
            return (Criteria) this;
        }

        public Criteria andPnovNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("p_nov not between", value1, value2, "pnov");
            return (Criteria) this;
        }



        public Criteria andPdecIsNull() {
            addCriterion("pdec is null");
            return (Criteria) this;
        }


        public Criteria andPdecIsNotNull() {
            addCriterion("pdec is not null");
            return (Criteria) this;
        }

        public Criteria andPdecEqualTo(BigDecimal value) {
            addCriterion("p_dec =", value, "pdec");
            return (Criteria) this;
        }

        public Criteria andPdecNotEqualTo(BigDecimal value) {
            addCriterion("p_dec <>", value, "pdec");
            return (Criteria) this;
        }

        public Criteria andPdecGreaterThan(BigDecimal value) {
            addCriterion("p_dec >", value, "pdec");
            return (Criteria) this;
        }

        public Criteria andPdecGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("p_dec >=", value, "p_dec");
            return (Criteria) this;
        }

        public Criteria andPdecLessThan(BigDecimal value) {
            addCriterion("p_dec <", value, "pdec");
            return (Criteria) this;
        }

        public Criteria andPdecLessThanOrEqualTo(BigDecimal value) {
            addCriterion("p_dec <=", value, "pdec");
            return (Criteria) this;
        }


        public Criteria andPdecIn(List<BigDecimal > values) {
            addCriterion("p_dec in", values, "pdec");
            return (Criteria) this;
        }

        public Criteria andPdecNotIn(List<BigDecimal> values) {
            addCriterion("p_dec not in", values, "pdec");
            return (Criteria) this;
        }

        public Criteria andPdecBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("p_dec between", value1, value2, "pdec");
            return (Criteria) this;
        }

        public Criteria andPdecNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("p_dec not between", value1, value2, "pdec");
            return (Criteria) this;
        }



        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }


        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(java.lang.Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(java.lang.Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(java.lang.Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(java.lang.Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }


        public Criteria andStatusIn(List<java.lang.Integer > values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<java.lang.Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }



        public Criteria andAppStateIsNull() {
            addCriterion("appState is null");
            return (Criteria) this;
        }


        public Criteria andAppStateIsNotNull() {
            addCriterion("appState is not null");
            return (Criteria) this;
        }

        public Criteria andAppStateEqualTo(java.lang.Integer value) {
            addCriterion("app_state =", value, "appState");
            return (Criteria) this;
        }

        public Criteria andAppStateNotEqualTo(java.lang.Integer value) {
            addCriterion("app_state <>", value, "appState");
            return (Criteria) this;
        }

        public Criteria andAppStateGreaterThan(java.lang.Integer value) {
            addCriterion("app_state >", value, "appState");
            return (Criteria) this;
        }

        public Criteria andAppStateGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("app_state >=", value, "app_state");
            return (Criteria) this;
        }

        public Criteria andAppStateLessThan(java.lang.Integer value) {
            addCriterion("app_state <", value, "appState");
            return (Criteria) this;
        }

        public Criteria andAppStateLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("app_state <=", value, "appState");
            return (Criteria) this;
        }


        public Criteria andAppStateIn(List<java.lang.Integer > values) {
            addCriterion("app_state in", values, "appState");
            return (Criteria) this;
        }

        public Criteria andAppStateNotIn(List<java.lang.Integer> values) {
            addCriterion("app_state not in", values, "appState");
            return (Criteria) this;
        }

        public Criteria andAppStateBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("app_state between", value1, value2, "appState");
            return (Criteria) this;
        }

        public Criteria andAppStateNotBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("app_state not between", value1, value2, "appState");
            return (Criteria) this;
        }



        public Criteria andCreateUserIsNull() {
            addCriterion("createUser is null");
            return (Criteria) this;
        }


        public Criteria andCreateUserIsNotNull() {
            addCriterion("createUser is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserEqualTo(java.lang.Integer value) {
            addCriterion("create_user =", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotEqualTo(java.lang.Integer value) {
            addCriterion("create_user <>", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThan(java.lang.Integer value) {
            addCriterion("create_user >", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("create_user >=", value, "create_user");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThan(java.lang.Integer value) {
            addCriterion("create_user <", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("create_user <=", value, "createUser");
            return (Criteria) this;
        }


        public Criteria andCreateUserIn(List<java.lang.Integer > values) {
            addCriterion("create_user in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotIn(List<java.lang.Integer> values) {
            addCriterion("create_user not in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("create_user between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("create_user not between", value1, value2, "createUser");
            return (Criteria) this;
        }



        public Criteria andCreateTimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }


        public Criteria andCreateTimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(java.util.Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(java.util.Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(java.util.Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(java.util.Date value) {
            addCriterion("create_time >=", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(java.util.Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(java.util.Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }


        public Criteria andCreateTimeIn(List<java.util.Date > values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<java.util.Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(java.util.Date value1, java.util.Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(java.util.Date value1, java.util.Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }



        public Criteria andUpdateUserIsNull() {
            addCriterion("updateUser is null");
            return (Criteria) this;
        }


        public Criteria andUpdateUserIsNotNull() {
            addCriterion("updateUser is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserEqualTo(java.lang.Integer value) {
            addCriterion("update_user =", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotEqualTo(java.lang.Integer value) {
            addCriterion("update_user <>", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThan(java.lang.Integer value) {
            addCriterion("update_user >", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("update_user >=", value, "update_user");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThan(java.lang.Integer value) {
            addCriterion("update_user <", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("update_user <=", value, "updateUser");
            return (Criteria) this;
        }


        public Criteria andUpdateUserIn(List<java.lang.Integer > values) {
            addCriterion("update_user in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotIn(List<java.lang.Integer> values) {
            addCriterion("update_user not in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("update_user between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("update_user not between", value1, value2, "updateUser");
            return (Criteria) this;
        }



        public Criteria andUpdateTimeIsNull() {
            addCriterion("updateTime is null");
            return (Criteria) this;
        }


        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("updateTime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(java.util.Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(java.util.Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(java.util.Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(java.util.Date value) {
            addCriterion("update_time >=", value, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(java.util.Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(java.util.Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }


        public Criteria andUpdateTimeIn(List<java.util.Date > values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<java.util.Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(java.util.Date value1, java.util.Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(java.util.Date value1, java.util.Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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



        public Criteria andCountryIsNull() {
            addCriterion("country is null");
            return (Criteria) this;
        }


        public Criteria andCountryIsNotNull() {
            addCriterion("country is not null");
            return (Criteria) this;
        }

        public Criteria andCountryEqualTo(java.lang.String value) {
            addCriterion("country =", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotEqualTo(java.lang.String value) {
            addCriterion("country <>", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThan(java.lang.String value) {
            addCriterion("country >", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThanOrEqualTo(java.lang.String value) {
            addCriterion("country >=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThan(java.lang.String value) {
            addCriterion("country <", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThanOrEqualTo(java.lang.String value) {
            addCriterion("country <=", value, "country");
            return (Criteria) this;
        }


        public Criteria andCountryIn(List<java.lang.String > values) {
            addCriterion("country in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotIn(List<java.lang.String> values) {
            addCriterion("country not in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("country between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("country not between", value1, value2, "country");
            return (Criteria) this;
        }



        public Criteria andSubmitUserIsNull() {
            addCriterion("submitUser is null");
            return (Criteria) this;
        }


        public Criteria andSubmitUserIsNotNull() {
            addCriterion("submitUser is not null");
            return (Criteria) this;
        }

        public Criteria andSubmitUserEqualTo(java.lang.Integer value) {
            addCriterion("submit_user =", value, "submitUser");
            return (Criteria) this;
        }

        public Criteria andSubmitUserNotEqualTo(java.lang.Integer value) {
            addCriterion("submit_user <>", value, "submitUser");
            return (Criteria) this;
        }

        public Criteria andSubmitUserGreaterThan(java.lang.Integer value) {
            addCriterion("submit_user >", value, "submitUser");
            return (Criteria) this;
        }

        public Criteria andSubmitUserGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("submit_user >=", value, "submit_user");
            return (Criteria) this;
        }

        public Criteria andSubmitUserLessThan(java.lang.Integer value) {
            addCriterion("submit_user <", value, "submitUser");
            return (Criteria) this;
        }

        public Criteria andSubmitUserLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("submit_user <=", value, "submitUser");
            return (Criteria) this;
        }


        public Criteria andSubmitUserIn(List<java.lang.Integer > values) {
            addCriterion("submit_user in", values, "submitUser");
            return (Criteria) this;
        }

        public Criteria andSubmitUserNotIn(List<java.lang.Integer> values) {
            addCriterion("submit_user not in", values, "submitUser");
            return (Criteria) this;
        }

        public Criteria andSubmitUserBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("submit_user between", value1, value2, "submitUser");
            return (Criteria) this;
        }

        public Criteria andSubmitUserNotBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("submit_user not between", value1, value2, "submitUser");
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