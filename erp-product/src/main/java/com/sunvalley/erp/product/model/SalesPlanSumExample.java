package com.sunvalley.erp.product.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.math.BigDecimal;

/**
* @Description: SalesPlanSumExample
* @author
* @date 2017-10-13 02:13:35
*/
public class SalesPlanSumExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private int pageIndex;

    private int pageSize;

    public SalesPlanSumExample() {
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

    public SalesPlanSumExample(int pageSize, int pageIndex) {
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



        public Criteria andPmonthIsNull() {
            addCriterion("pmonth is null");
            return (Criteria) this;
        }


        public Criteria andPmonthIsNotNull() {
            addCriterion("pmonth is not null");
            return (Criteria) this;
        }

        public Criteria andPmonthEqualTo(java.lang.Integer value) {
            addCriterion("p_month =", value, "pmonth");
            return (Criteria) this;
        }

        public Criteria andPmonthNotEqualTo(java.lang.Integer value) {
            addCriterion("p_month <>", value, "pmonth");
            return (Criteria) this;
        }

        public Criteria andPmonthGreaterThan(java.lang.Integer value) {
            addCriterion("p_month >", value, "pmonth");
            return (Criteria) this;
        }

        public Criteria andPmonthGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("p_month >=", value, "p_month");
            return (Criteria) this;
        }

        public Criteria andPmonthLessThan(java.lang.Integer value) {
            addCriterion("p_month <", value, "pmonth");
            return (Criteria) this;
        }

        public Criteria andPmonthLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("p_month <=", value, "pmonth");
            return (Criteria) this;
        }


        public Criteria andPmonthIn(List<java.lang.Integer > values) {
            addCriterion("p_month in", values, "pmonth");
            return (Criteria) this;
        }

        public Criteria andPmonthNotIn(List<java.lang.Integer> values) {
            addCriterion("p_month not in", values, "pmonth");
            return (Criteria) this;
        }

        public Criteria andPmonthBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("p_month between", value1, value2, "pmonth");
            return (Criteria) this;
        }

        public Criteria andPmonthNotBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("p_month not between", value1, value2, "pmonth");
            return (Criteria) this;
        }



        public Criteria andPvalueIsNull() {
            addCriterion("pvalue is null");
            return (Criteria) this;
        }


        public Criteria andPvalueIsNotNull() {
            addCriterion("pvalue is not null");
            return (Criteria) this;
        }

        public Criteria andPvalueEqualTo(BigDecimal value) {
            addCriterion("p_value =", value, "pvalue");
            return (Criteria) this;
        }

        public Criteria andPvalueNotEqualTo(BigDecimal value) {
            addCriterion("p_value <>", value, "pvalue");
            return (Criteria) this;
        }

        public Criteria andPvalueGreaterThan(BigDecimal value) {
            addCriterion("p_value >", value, "pvalue");
            return (Criteria) this;
        }

        public Criteria andPvalueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("p_value >=", value, "p_value");
            return (Criteria) this;
        }

        public Criteria andPvalueLessThan(BigDecimal value) {
            addCriterion("p_value <", value, "pvalue");
            return (Criteria) this;
        }

        public Criteria andPvalueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("p_value <=", value, "pvalue");
            return (Criteria) this;
        }


        public Criteria andPvalueIn(List<BigDecimal > values) {
            addCriterion("p_value in", values, "pvalue");
            return (Criteria) this;
        }

        public Criteria andPvalueNotIn(List<BigDecimal> values) {
            addCriterion("p_value not in", values, "pvalue");
            return (Criteria) this;
        }

        public Criteria andPvalueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("p_value between", value1, value2, "pvalue");
            return (Criteria) this;
        }

        public Criteria andPvalueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("p_value not between", value1, value2, "pvalue");
            return (Criteria) this;
        }



        public Criteria andPquarterIsNull() {
            addCriterion("pquarter is null");
            return (Criteria) this;
        }


        public Criteria andPquarterIsNotNull() {
            addCriterion("pquarter is not null");
            return (Criteria) this;
        }

        public Criteria andPquarterEqualTo(java.lang.String value) {
            addCriterion("p_quarter =", value, "pquarter");
            return (Criteria) this;
        }

        public Criteria andPquarterNotEqualTo(java.lang.String value) {
            addCriterion("p_quarter <>", value, "pquarter");
            return (Criteria) this;
        }

        public Criteria andPquarterGreaterThan(java.lang.String value) {
            addCriterion("p_quarter >", value, "pquarter");
            return (Criteria) this;
        }

        public Criteria andPquarterGreaterThanOrEqualTo(java.lang.String value) {
            addCriterion("p_quarter >=", value, "p_quarter");
            return (Criteria) this;
        }

        public Criteria andPquarterLessThan(java.lang.String value) {
            addCriterion("p_quarter <", value, "pquarter");
            return (Criteria) this;
        }

        public Criteria andPquarterLessThanOrEqualTo(java.lang.String value) {
            addCriterion("p_quarter <=", value, "pquarter");
            return (Criteria) this;
        }


        public Criteria andPquarterIn(List<java.lang.String > values) {
            addCriterion("p_quarter in", values, "pquarter");
            return (Criteria) this;
        }

        public Criteria andPquarterNotIn(List<java.lang.String> values) {
            addCriterion("p_quarter not in", values, "pquarter");
            return (Criteria) this;
        }

        public Criteria andPquarterBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("p_quarter between", value1, value2, "pquarter");
            return (Criteria) this;
        }

        public Criteria andPquarterNotBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("p_quarter not between", value1, value2, "pquarter");
            return (Criteria) this;
        }



        public Criteria andPyearIsNull() {
            addCriterion("pyear is null");
            return (Criteria) this;
        }


        public Criteria andPyearIsNotNull() {
            addCriterion("pyear is not null");
            return (Criteria) this;
        }

        public Criteria andPyearEqualTo(java.lang.String value) {
            addCriterion("p_year =", value, "pyear");
            return (Criteria) this;
        }

        public Criteria andPyearNotEqualTo(java.lang.String value) {
            addCriterion("p_year <>", value, "pyear");
            return (Criteria) this;
        }

        public Criteria andPyearGreaterThan(java.lang.String value) {
            addCriterion("p_year >", value, "pyear");
            return (Criteria) this;
        }

        public Criteria andPyearGreaterThanOrEqualTo(java.lang.String value) {
            addCriterion("p_year >=", value, "p_year");
            return (Criteria) this;
        }

        public Criteria andPyearLessThan(java.lang.String value) {
            addCriterion("p_year <", value, "pyear");
            return (Criteria) this;
        }

        public Criteria andPyearLessThanOrEqualTo(java.lang.String value) {
            addCriterion("p_year <=", value, "pyear");
            return (Criteria) this;
        }


        public Criteria andPyearIn(List<java.lang.String > values) {
            addCriterion("p_year in", values, "pyear");
            return (Criteria) this;
        }

        public Criteria andPyearNotIn(List<java.lang.String> values) {
            addCriterion("p_year not in", values, "pyear");
            return (Criteria) this;
        }

        public Criteria andPyearBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("p_year between", value1, value2, "pyear");
            return (Criteria) this;
        }

        public Criteria andPyearNotBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("p_year not between", value1, value2, "pyear");
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



        public Criteria andGrossIncomeIsNull() {
            addCriterion("grossIncome is null");
            return (Criteria) this;
        }


        public Criteria andGrossIncomeIsNotNull() {
            addCriterion("grossIncome is not null");
            return (Criteria) this;
        }

        public Criteria andGrossIncomeEqualTo(BigDecimal value) {
            addCriterion("gross_income =", value, "grossIncome");
            return (Criteria) this;
        }

        public Criteria andGrossIncomeNotEqualTo(BigDecimal value) {
            addCriterion("gross_income <>", value, "grossIncome");
            return (Criteria) this;
        }

        public Criteria andGrossIncomeGreaterThan(BigDecimal value) {
            addCriterion("gross_income >", value, "grossIncome");
            return (Criteria) this;
        }

        public Criteria andGrossIncomeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("gross_income >=", value, "gross_income");
            return (Criteria) this;
        }

        public Criteria andGrossIncomeLessThan(BigDecimal value) {
            addCriterion("gross_income <", value, "grossIncome");
            return (Criteria) this;
        }

        public Criteria andGrossIncomeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("gross_income <=", value, "grossIncome");
            return (Criteria) this;
        }


        public Criteria andGrossIncomeIn(List<BigDecimal > values) {
            addCriterion("gross_income in", values, "grossIncome");
            return (Criteria) this;
        }

        public Criteria andGrossIncomeNotIn(List<BigDecimal> values) {
            addCriterion("gross_income not in", values, "grossIncome");
            return (Criteria) this;
        }

        public Criteria andGrossIncomeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("gross_income between", value1, value2, "grossIncome");
            return (Criteria) this;
        }

        public Criteria andGrossIncomeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("gross_income not between", value1, value2, "grossIncome");
            return (Criteria) this;
        }



        public Criteria andNetIncomeIsNull() {
            addCriterion("netIncome is null");
            return (Criteria) this;
        }


        public Criteria andNetIncomeIsNotNull() {
            addCriterion("netIncome is not null");
            return (Criteria) this;
        }

        public Criteria andNetIncomeEqualTo(BigDecimal value) {
            addCriterion("net_income =", value, "netIncome");
            return (Criteria) this;
        }

        public Criteria andNetIncomeNotEqualTo(BigDecimal value) {
            addCriterion("net_income <>", value, "netIncome");
            return (Criteria) this;
        }

        public Criteria andNetIncomeGreaterThan(BigDecimal value) {
            addCriterion("net_income >", value, "netIncome");
            return (Criteria) this;
        }

        public Criteria andNetIncomeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("net_income >=", value, "net_income");
            return (Criteria) this;
        }

        public Criteria andNetIncomeLessThan(BigDecimal value) {
            addCriterion("net_income <", value, "netIncome");
            return (Criteria) this;
        }

        public Criteria andNetIncomeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("net_income <=", value, "netIncome");
            return (Criteria) this;
        }


        public Criteria andNetIncomeIn(List<BigDecimal > values) {
            addCriterion("net_income in", values, "netIncome");
            return (Criteria) this;
        }

        public Criteria andNetIncomeNotIn(List<BigDecimal> values) {
            addCriterion("net_income not in", values, "netIncome");
            return (Criteria) this;
        }

        public Criteria andNetIncomeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("net_income between", value1, value2, "netIncome");
            return (Criteria) this;
        }

        public Criteria andNetIncomeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("net_income not between", value1, value2, "netIncome");
            return (Criteria) this;
        }



        public Criteria andNetIncomePercentageIsNull() {
            addCriterion("netIncomePercentage is null");
            return (Criteria) this;
        }


        public Criteria andNetIncomePercentageIsNotNull() {
            addCriterion("netIncomePercentage is not null");
            return (Criteria) this;
        }

        public Criteria andNetIncomePercentageEqualTo(java.lang.Double value) {
            addCriterion("net_income_percentage =", value, "netIncomePercentage");
            return (Criteria) this;
        }

        public Criteria andNetIncomePercentageNotEqualTo(java.lang.Double value) {
            addCriterion("net_income_percentage <>", value, "netIncomePercentage");
            return (Criteria) this;
        }

        public Criteria andNetIncomePercentageGreaterThan(java.lang.Double value) {
            addCriterion("net_income_percentage >", value, "netIncomePercentage");
            return (Criteria) this;
        }

        public Criteria andNetIncomePercentageGreaterThanOrEqualTo(java.lang.Double value) {
            addCriterion("net_income_percentage >=", value, "net_income_percentage");
            return (Criteria) this;
        }

        public Criteria andNetIncomePercentageLessThan(java.lang.Double value) {
            addCriterion("net_income_percentage <", value, "netIncomePercentage");
            return (Criteria) this;
        }

        public Criteria andNetIncomePercentageLessThanOrEqualTo(java.lang.Double value) {
            addCriterion("net_income_percentage <=", value, "netIncomePercentage");
            return (Criteria) this;
        }


        public Criteria andNetIncomePercentageIn(List<java.lang.Double > values) {
            addCriterion("net_income_percentage in", values, "netIncomePercentage");
            return (Criteria) this;
        }

        public Criteria andNetIncomePercentageNotIn(List<java.lang.Double> values) {
            addCriterion("net_income_percentage not in", values, "netIncomePercentage");
            return (Criteria) this;
        }

        public Criteria andNetIncomePercentageBetween(java.lang.Double value1, java.lang.Double value2) {
            addCriterion("net_income_percentage between", value1, value2, "netIncomePercentage");
            return (Criteria) this;
        }

        public Criteria andNetIncomePercentageNotBetween(java.lang.Double value1, java.lang.Double value2) {
            addCriterion("net_income_percentage not between", value1, value2, "netIncomePercentage");
            return (Criteria) this;
        }



        public Criteria andGrossProfitRateIsNull() {
            addCriterion("grossProfitRate is null");
            return (Criteria) this;
        }


        public Criteria andGrossProfitRateIsNotNull() {
            addCriterion("grossProfitRate is not null");
            return (Criteria) this;
        }

        public Criteria andGrossProfitRateEqualTo(java.lang.Double value) {
            addCriterion("gross_profit_rate =", value, "grossProfitRate");
            return (Criteria) this;
        }

        public Criteria andGrossProfitRateNotEqualTo(java.lang.Double value) {
            addCriterion("gross_profit_rate <>", value, "grossProfitRate");
            return (Criteria) this;
        }

        public Criteria andGrossProfitRateGreaterThan(java.lang.Double value) {
            addCriterion("gross_profit_rate >", value, "grossProfitRate");
            return (Criteria) this;
        }

        public Criteria andGrossProfitRateGreaterThanOrEqualTo(java.lang.Double value) {
            addCriterion("gross_profit_rate >=", value, "gross_profit_rate");
            return (Criteria) this;
        }

        public Criteria andGrossProfitRateLessThan(java.lang.Double value) {
            addCriterion("gross_profit_rate <", value, "grossProfitRate");
            return (Criteria) this;
        }

        public Criteria andGrossProfitRateLessThanOrEqualTo(java.lang.Double value) {
            addCriterion("gross_profit_rate <=", value, "grossProfitRate");
            return (Criteria) this;
        }


        public Criteria andGrossProfitRateIn(List<java.lang.Double > values) {
            addCriterion("gross_profit_rate in", values, "grossProfitRate");
            return (Criteria) this;
        }

        public Criteria andGrossProfitRateNotIn(List<java.lang.Double> values) {
            addCriterion("gross_profit_rate not in", values, "grossProfitRate");
            return (Criteria) this;
        }

        public Criteria andGrossProfitRateBetween(java.lang.Double value1, java.lang.Double value2) {
            addCriterion("gross_profit_rate between", value1, value2, "grossProfitRate");
            return (Criteria) this;
        }

        public Criteria andGrossProfitRateNotBetween(java.lang.Double value1, java.lang.Double value2) {
            addCriterion("gross_profit_rate not between", value1, value2, "grossProfitRate");
            return (Criteria) this;
        }



        public Criteria andGrossProfitIsNull() {
            addCriterion("grossProfit is null");
            return (Criteria) this;
        }


        public Criteria andGrossProfitIsNotNull() {
            addCriterion("grossProfit is not null");
            return (Criteria) this;
        }

        public Criteria andGrossProfitEqualTo(BigDecimal value) {
            addCriterion("gross_profit =", value, "grossProfit");
            return (Criteria) this;
        }

        public Criteria andGrossProfitNotEqualTo(BigDecimal value) {
            addCriterion("gross_profit <>", value, "grossProfit");
            return (Criteria) this;
        }

        public Criteria andGrossProfitGreaterThan(BigDecimal value) {
            addCriterion("gross_profit >", value, "grossProfit");
            return (Criteria) this;
        }

        public Criteria andGrossProfitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("gross_profit >=", value, "gross_profit");
            return (Criteria) this;
        }

        public Criteria andGrossProfitLessThan(BigDecimal value) {
            addCriterion("gross_profit <", value, "grossProfit");
            return (Criteria) this;
        }

        public Criteria andGrossProfitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("gross_profit <=", value, "grossProfit");
            return (Criteria) this;
        }


        public Criteria andGrossProfitIn(List<BigDecimal > values) {
            addCriterion("gross_profit in", values, "grossProfit");
            return (Criteria) this;
        }

        public Criteria andGrossProfitNotIn(List<BigDecimal> values) {
            addCriterion("gross_profit not in", values, "grossProfit");
            return (Criteria) this;
        }

        public Criteria andGrossProfitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("gross_profit between", value1, value2, "grossProfit");
            return (Criteria) this;
        }

        public Criteria andGrossProfitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("gross_profit not between", value1, value2, "grossProfit");
            return (Criteria) this;
        }



        public Criteria andPromotionExpensesIsNull() {
            addCriterion("promotionExpenses is null");
            return (Criteria) this;
        }


        public Criteria andPromotionExpensesIsNotNull() {
            addCriterion("promotionExpenses is not null");
            return (Criteria) this;
        }

        public Criteria andPromotionExpensesEqualTo(BigDecimal value) {
            addCriterion("promotion_expenses =", value, "promotionExpenses");
            return (Criteria) this;
        }

        public Criteria andPromotionExpensesNotEqualTo(BigDecimal value) {
            addCriterion("promotion_expenses <>", value, "promotionExpenses");
            return (Criteria) this;
        }

        public Criteria andPromotionExpensesGreaterThan(BigDecimal value) {
            addCriterion("promotion_expenses >", value, "promotionExpenses");
            return (Criteria) this;
        }

        public Criteria andPromotionExpensesGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("promotion_expenses >=", value, "promotion_expenses");
            return (Criteria) this;
        }

        public Criteria andPromotionExpensesLessThan(BigDecimal value) {
            addCriterion("promotion_expenses <", value, "promotionExpenses");
            return (Criteria) this;
        }

        public Criteria andPromotionExpensesLessThanOrEqualTo(BigDecimal value) {
            addCriterion("promotion_expenses <=", value, "promotionExpenses");
            return (Criteria) this;
        }


        public Criteria andPromotionExpensesIn(List<BigDecimal > values) {
            addCriterion("promotion_expenses in", values, "promotionExpenses");
            return (Criteria) this;
        }

        public Criteria andPromotionExpensesNotIn(List<BigDecimal> values) {
            addCriterion("promotion_expenses not in", values, "promotionExpenses");
            return (Criteria) this;
        }

        public Criteria andPromotionExpensesBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("promotion_expenses between", value1, value2, "promotionExpenses");
            return (Criteria) this;
        }

        public Criteria andPromotionExpensesNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("promotion_expenses not between", value1, value2, "promotionExpenses");
            return (Criteria) this;
        }



        public Criteria andNetProfitIsNull() {
            addCriterion("netProfit is null");
            return (Criteria) this;
        }


        public Criteria andNetProfitIsNotNull() {
            addCriterion("netProfit is not null");
            return (Criteria) this;
        }

        public Criteria andNetProfitEqualTo(BigDecimal value) {
            addCriterion("net_profit =", value, "netProfit");
            return (Criteria) this;
        }

        public Criteria andNetProfitNotEqualTo(BigDecimal value) {
            addCriterion("net_profit <>", value, "netProfit");
            return (Criteria) this;
        }

        public Criteria andNetProfitGreaterThan(BigDecimal value) {
            addCriterion("net_profit >", value, "netProfit");
            return (Criteria) this;
        }

        public Criteria andNetProfitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("net_profit >=", value, "net_profit");
            return (Criteria) this;
        }

        public Criteria andNetProfitLessThan(BigDecimal value) {
            addCriterion("net_profit <", value, "netProfit");
            return (Criteria) this;
        }

        public Criteria andNetProfitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("net_profit <=", value, "netProfit");
            return (Criteria) this;
        }


        public Criteria andNetProfitIn(List<BigDecimal > values) {
            addCriterion("net_profit in", values, "netProfit");
            return (Criteria) this;
        }

        public Criteria andNetProfitNotIn(List<BigDecimal> values) {
            addCriterion("net_profit not in", values, "netProfit");
            return (Criteria) this;
        }

        public Criteria andNetProfitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("net_profit between", value1, value2, "netProfit");
            return (Criteria) this;
        }

        public Criteria andNetProfitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("net_profit not between", value1, value2, "netProfit");
            return (Criteria) this;
        }



        public Criteria andNetProfitRatePercentageIsNull() {
            addCriterion("netProfitRatePercentage is null");
            return (Criteria) this;
        }


        public Criteria andNetProfitRatePercentageIsNotNull() {
            addCriterion("netProfitRatePercentage is not null");
            return (Criteria) this;
        }

        public Criteria andNetProfitRatePercentageEqualTo(java.lang.Double value) {
            addCriterion("net_profit_rate_percentage =", value, "netProfitRatePercentage");
            return (Criteria) this;
        }

        public Criteria andNetProfitRatePercentageNotEqualTo(java.lang.Double value) {
            addCriterion("net_profit_rate_percentage <>", value, "netProfitRatePercentage");
            return (Criteria) this;
        }

        public Criteria andNetProfitRatePercentageGreaterThan(java.lang.Double value) {
            addCriterion("net_profit_rate_percentage >", value, "netProfitRatePercentage");
            return (Criteria) this;
        }

        public Criteria andNetProfitRatePercentageGreaterThanOrEqualTo(java.lang.Double value) {
            addCriterion("net_profit_rate_percentage >=", value, "net_profit_rate_percentage");
            return (Criteria) this;
        }

        public Criteria andNetProfitRatePercentageLessThan(java.lang.Double value) {
            addCriterion("net_profit_rate_percentage <", value, "netProfitRatePercentage");
            return (Criteria) this;
        }

        public Criteria andNetProfitRatePercentageLessThanOrEqualTo(java.lang.Double value) {
            addCriterion("net_profit_rate_percentage <=", value, "netProfitRatePercentage");
            return (Criteria) this;
        }


        public Criteria andNetProfitRatePercentageIn(List<java.lang.Double > values) {
            addCriterion("net_profit_rate_percentage in", values, "netProfitRatePercentage");
            return (Criteria) this;
        }

        public Criteria andNetProfitRatePercentageNotIn(List<java.lang.Double> values) {
            addCriterion("net_profit_rate_percentage not in", values, "netProfitRatePercentage");
            return (Criteria) this;
        }

        public Criteria andNetProfitRatePercentageBetween(java.lang.Double value1, java.lang.Double value2) {
            addCriterion("net_profit_rate_percentage between", value1, value2, "netProfitRatePercentage");
            return (Criteria) this;
        }

        public Criteria andNetProfitRatePercentageNotBetween(java.lang.Double value1, java.lang.Double value2) {
            addCriterion("net_profit_rate_percentage not between", value1, value2, "netProfitRatePercentage");
            return (Criteria) this;
        }



        public Criteria andSalesVolumnIsNull() {
            addCriterion("salesVolumn is null");
            return (Criteria) this;
        }


        public Criteria andSalesVolumnIsNotNull() {
            addCriterion("salesVolumn is not null");
            return (Criteria) this;
        }

        public Criteria andSalesVolumnEqualTo(java.lang.Integer value) {
            addCriterion("sales_volumn =", value, "salesVolumn");
            return (Criteria) this;
        }

        public Criteria andSalesVolumnNotEqualTo(java.lang.Integer value) {
            addCriterion("sales_volumn <>", value, "salesVolumn");
            return (Criteria) this;
        }

        public Criteria andSalesVolumnGreaterThan(java.lang.Integer value) {
            addCriterion("sales_volumn >", value, "salesVolumn");
            return (Criteria) this;
        }

        public Criteria andSalesVolumnGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("sales_volumn >=", value, "sales_volumn");
            return (Criteria) this;
        }

        public Criteria andSalesVolumnLessThan(java.lang.Integer value) {
            addCriterion("sales_volumn <", value, "salesVolumn");
            return (Criteria) this;
        }

        public Criteria andSalesVolumnLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("sales_volumn <=", value, "salesVolumn");
            return (Criteria) this;
        }


        public Criteria andSalesVolumnIn(List<java.lang.Integer > values) {
            addCriterion("sales_volumn in", values, "salesVolumn");
            return (Criteria) this;
        }

        public Criteria andSalesVolumnNotIn(List<java.lang.Integer> values) {
            addCriterion("sales_volumn not in", values, "salesVolumn");
            return (Criteria) this;
        }

        public Criteria andSalesVolumnBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("sales_volumn between", value1, value2, "salesVolumn");
            return (Criteria) this;
        }

        public Criteria andSalesVolumnNotBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("sales_volumn not between", value1, value2, "salesVolumn");
            return (Criteria) this;
        }



        public Criteria andPerUnitSalesPriceIsNull() {
            addCriterion("perUnitSalesPrice is null");
            return (Criteria) this;
        }


        public Criteria andPerUnitSalesPriceIsNotNull() {
            addCriterion("perUnitSalesPrice is not null");
            return (Criteria) this;
        }

        public Criteria andPerUnitSalesPriceEqualTo(BigDecimal value) {
            addCriterion("per_unit_sales_price =", value, "perUnitSalesPrice");
            return (Criteria) this;
        }

        public Criteria andPerUnitSalesPriceNotEqualTo(BigDecimal value) {
            addCriterion("per_unit_sales_price <>", value, "perUnitSalesPrice");
            return (Criteria) this;
        }

        public Criteria andPerUnitSalesPriceGreaterThan(BigDecimal value) {
            addCriterion("per_unit_sales_price >", value, "perUnitSalesPrice");
            return (Criteria) this;
        }

        public Criteria andPerUnitSalesPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("per_unit_sales_price >=", value, "per_unit_sales_price");
            return (Criteria) this;
        }

        public Criteria andPerUnitSalesPriceLessThan(BigDecimal value) {
            addCriterion("per_unit_sales_price <", value, "perUnitSalesPrice");
            return (Criteria) this;
        }

        public Criteria andPerUnitSalesPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("per_unit_sales_price <=", value, "perUnitSalesPrice");
            return (Criteria) this;
        }


        public Criteria andPerUnitSalesPriceIn(List<BigDecimal > values) {
            addCriterion("per_unit_sales_price in", values, "perUnitSalesPrice");
            return (Criteria) this;
        }

        public Criteria andPerUnitSalesPriceNotIn(List<BigDecimal> values) {
            addCriterion("per_unit_sales_price not in", values, "perUnitSalesPrice");
            return (Criteria) this;
        }

        public Criteria andPerUnitSalesPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("per_unit_sales_price between", value1, value2, "perUnitSalesPrice");
            return (Criteria) this;
        }

        public Criteria andPerUnitSalesPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("per_unit_sales_price not between", value1, value2, "perUnitSalesPrice");
            return (Criteria) this;
        }



        public Criteria andMktCostIsNull() {
            addCriterion("mktCost is null");
            return (Criteria) this;
        }


        public Criteria andMktCostIsNotNull() {
            addCriterion("mktCost is not null");
            return (Criteria) this;
        }

        public Criteria andMktCostEqualTo(BigDecimal value) {
            addCriterion("mkt_cost =", value, "mktCost");
            return (Criteria) this;
        }

        public Criteria andMktCostNotEqualTo(BigDecimal value) {
            addCriterion("mkt_cost <>", value, "mktCost");
            return (Criteria) this;
        }

        public Criteria andMktCostGreaterThan(BigDecimal value) {
            addCriterion("mkt_cost >", value, "mktCost");
            return (Criteria) this;
        }

        public Criteria andMktCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("mkt_cost >=", value, "mkt_cost");
            return (Criteria) this;
        }

        public Criteria andMktCostLessThan(BigDecimal value) {
            addCriterion("mkt_cost <", value, "mktCost");
            return (Criteria) this;
        }

        public Criteria andMktCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("mkt_cost <=", value, "mktCost");
            return (Criteria) this;
        }


        public Criteria andMktCostIn(List<BigDecimal > values) {
            addCriterion("mkt_cost in", values, "mktCost");
            return (Criteria) this;
        }

        public Criteria andMktCostNotIn(List<BigDecimal> values) {
            addCriterion("mkt_cost not in", values, "mktCost");
            return (Criteria) this;
        }

        public Criteria andMktCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("mkt_cost between", value1, value2, "mktCost");
            return (Criteria) this;
        }

        public Criteria andMktCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("mkt_cost not between", value1, value2, "mktCost");
            return (Criteria) this;
        }



        public Criteria andSampleCostIsNull() {
            addCriterion("sampleCost is null");
            return (Criteria) this;
        }


        public Criteria andSampleCostIsNotNull() {
            addCriterion("sampleCost is not null");
            return (Criteria) this;
        }

        public Criteria andSampleCostEqualTo(BigDecimal value) {
            addCriterion("sample_cost =", value, "sampleCost");
            return (Criteria) this;
        }

        public Criteria andSampleCostNotEqualTo(BigDecimal value) {
            addCriterion("sample_cost <>", value, "sampleCost");
            return (Criteria) this;
        }

        public Criteria andSampleCostGreaterThan(BigDecimal value) {
            addCriterion("sample_cost >", value, "sampleCost");
            return (Criteria) this;
        }

        public Criteria andSampleCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sample_cost >=", value, "sample_cost");
            return (Criteria) this;
        }

        public Criteria andSampleCostLessThan(BigDecimal value) {
            addCriterion("sample_cost <", value, "sampleCost");
            return (Criteria) this;
        }

        public Criteria andSampleCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sample_cost <=", value, "sampleCost");
            return (Criteria) this;
        }


        public Criteria andSampleCostIn(List<BigDecimal > values) {
            addCriterion("sample_cost in", values, "sampleCost");
            return (Criteria) this;
        }

        public Criteria andSampleCostNotIn(List<BigDecimal> values) {
            addCriterion("sample_cost not in", values, "sampleCost");
            return (Criteria) this;
        }

        public Criteria andSampleCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sample_cost between", value1, value2, "sampleCost");
            return (Criteria) this;
        }

        public Criteria andSampleCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sample_cost not between", value1, value2, "sampleCost");
            return (Criteria) this;
        }



        public Criteria andVatTaxesIsNull() {
            addCriterion("vatTaxes is null");
            return (Criteria) this;
        }


        public Criteria andVatTaxesIsNotNull() {
            addCriterion("vatTaxes is not null");
            return (Criteria) this;
        }

        public Criteria andVatTaxesEqualTo(BigDecimal value) {
            addCriterion("vat_taxes =", value, "vatTaxes");
            return (Criteria) this;
        }

        public Criteria andVatTaxesNotEqualTo(BigDecimal value) {
            addCriterion("vat_taxes <>", value, "vatTaxes");
            return (Criteria) this;
        }

        public Criteria andVatTaxesGreaterThan(BigDecimal value) {
            addCriterion("vat_taxes >", value, "vatTaxes");
            return (Criteria) this;
        }

        public Criteria andVatTaxesGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("vat_taxes >=", value, "vat_taxes");
            return (Criteria) this;
        }

        public Criteria andVatTaxesLessThan(BigDecimal value) {
            addCriterion("vat_taxes <", value, "vatTaxes");
            return (Criteria) this;
        }

        public Criteria andVatTaxesLessThanOrEqualTo(BigDecimal value) {
            addCriterion("vat_taxes <=", value, "vatTaxes");
            return (Criteria) this;
        }


        public Criteria andVatTaxesIn(List<BigDecimal > values) {
            addCriterion("vat_taxes in", values, "vatTaxes");
            return (Criteria) this;
        }

        public Criteria andVatTaxesNotIn(List<BigDecimal> values) {
            addCriterion("vat_taxes not in", values, "vatTaxes");
            return (Criteria) this;
        }

        public Criteria andVatTaxesBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("vat_taxes between", value1, value2, "vatTaxes");
            return (Criteria) this;
        }

        public Criteria andVatTaxesNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("vat_taxes not between", value1, value2, "vatTaxes");
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



        public Criteria andPromotionExpensesRateIsNull() {
            addCriterion("promotionExpensesRate is null");
            return (Criteria) this;
        }


        public Criteria andPromotionExpensesRateIsNotNull() {
            addCriterion("promotionExpensesRate is not null");
            return (Criteria) this;
        }

        public Criteria andPromotionExpensesRateEqualTo(java.lang.Double value) {
            addCriterion("promotion_expenses_rate =", value, "promotionExpensesRate");
            return (Criteria) this;
        }

        public Criteria andPromotionExpensesRateNotEqualTo(java.lang.Double value) {
            addCriterion("promotion_expenses_rate <>", value, "promotionExpensesRate");
            return (Criteria) this;
        }

        public Criteria andPromotionExpensesRateGreaterThan(java.lang.Double value) {
            addCriterion("promotion_expenses_rate >", value, "promotionExpensesRate");
            return (Criteria) this;
        }

        public Criteria andPromotionExpensesRateGreaterThanOrEqualTo(java.lang.Double value) {
            addCriterion("promotion_expenses_rate >=", value, "promotion_expenses_rate");
            return (Criteria) this;
        }

        public Criteria andPromotionExpensesRateLessThan(java.lang.Double value) {
            addCriterion("promotion_expenses_rate <", value, "promotionExpensesRate");
            return (Criteria) this;
        }

        public Criteria andPromotionExpensesRateLessThanOrEqualTo(java.lang.Double value) {
            addCriterion("promotion_expenses_rate <=", value, "promotionExpensesRate");
            return (Criteria) this;
        }


        public Criteria andPromotionExpensesRateIn(List<java.lang.Double > values) {
            addCriterion("promotion_expenses_rate in", values, "promotionExpensesRate");
            return (Criteria) this;
        }

        public Criteria andPromotionExpensesRateNotIn(List<java.lang.Double> values) {
            addCriterion("promotion_expenses_rate not in", values, "promotionExpensesRate");
            return (Criteria) this;
        }

        public Criteria andPromotionExpensesRateBetween(java.lang.Double value1, java.lang.Double value2) {
            addCriterion("promotion_expenses_rate between", value1, value2, "promotionExpensesRate");
            return (Criteria) this;
        }

        public Criteria andPromotionExpensesRateNotBetween(java.lang.Double value1, java.lang.Double value2) {
            addCriterion("promotion_expenses_rate not between", value1, value2, "promotionExpensesRate");
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