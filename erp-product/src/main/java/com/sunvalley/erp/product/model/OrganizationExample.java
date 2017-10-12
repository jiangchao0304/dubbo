package com.sunvalley.erp.product.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.math.BigDecimal;

/**
* @Description: OrganizationExample
* @author
* @date 2017-10-12 04:26:09
*/
public class OrganizationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private int pageIndex;

    private int pageSize;

    public OrganizationExample() {
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

    public OrganizationExample(int pageSize, int pageIndex) {
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



        public Criteria andOrganizationNameIsNull() {
            addCriterion("organizationName is null");
            return (Criteria) this;
        }


        public Criteria andOrganizationNameIsNotNull() {
            addCriterion("organizationName is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationNameEqualTo(java.lang.String value) {
            addCriterion("organization_name =", value, "organizationName");
            return (Criteria) this;
        }

        public Criteria andOrganizationNameNotEqualTo(java.lang.String value) {
            addCriterion("organization_name <>", value, "organizationName");
            return (Criteria) this;
        }

        public Criteria andOrganizationNameGreaterThan(java.lang.String value) {
            addCriterion("organization_name >", value, "organizationName");
            return (Criteria) this;
        }

        public Criteria andOrganizationNameGreaterThanOrEqualTo(java.lang.String value) {
            addCriterion("organization_name >=", value, "organization_name");
            return (Criteria) this;
        }

        public Criteria andOrganizationNameLessThan(java.lang.String value) {
            addCriterion("organization_name <", value, "organizationName");
            return (Criteria) this;
        }

        public Criteria andOrganizationNameLessThanOrEqualTo(java.lang.String value) {
            addCriterion("organization_name <=", value, "organizationName");
            return (Criteria) this;
        }


        public Criteria andOrganizationNameIn(List<java.lang.String > values) {
            addCriterion("organization_name in", values, "organizationName");
            return (Criteria) this;
        }

        public Criteria andOrganizationNameNotIn(List<java.lang.String> values) {
            addCriterion("organization_name not in", values, "organizationName");
            return (Criteria) this;
        }

        public Criteria andOrganizationNameBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("organization_name between", value1, value2, "organizationName");
            return (Criteria) this;
        }

        public Criteria andOrganizationNameNotBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("organization_name not between", value1, value2, "organizationName");
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



        public Criteria andModelIdIsNull() {
            addCriterion("modelId is null");
            return (Criteria) this;
        }


        public Criteria andModelIdIsNotNull() {
            addCriterion("modelId is not null");
            return (Criteria) this;
        }

        public Criteria andModelIdEqualTo(java.lang.Integer value) {
            addCriterion("model_id =", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdNotEqualTo(java.lang.Integer value) {
            addCriterion("model_id <>", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdGreaterThan(java.lang.Integer value) {
            addCriterion("model_id >", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("model_id >=", value, "model_id");
            return (Criteria) this;
        }

        public Criteria andModelIdLessThan(java.lang.Integer value) {
            addCriterion("model_id <", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("model_id <=", value, "modelId");
            return (Criteria) this;
        }


        public Criteria andModelIdIn(List<java.lang.Integer > values) {
            addCriterion("model_id in", values, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdNotIn(List<java.lang.Integer> values) {
            addCriterion("model_id not in", values, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("model_id between", value1, value2, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdNotBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("model_id not between", value1, value2, "modelId");
            return (Criteria) this;
        }



        public Criteria andVersionNoIsNull() {
            addCriterion("versionNo is null");
            return (Criteria) this;
        }


        public Criteria andVersionNoIsNotNull() {
            addCriterion("versionNo is not null");
            return (Criteria) this;
        }

        public Criteria andVersionNoEqualTo(java.lang.String value) {
            addCriterion("version_no =", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoNotEqualTo(java.lang.String value) {
            addCriterion("version_no <>", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoGreaterThan(java.lang.String value) {
            addCriterion("version_no >", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoGreaterThanOrEqualTo(java.lang.String value) {
            addCriterion("version_no >=", value, "version_no");
            return (Criteria) this;
        }

        public Criteria andVersionNoLessThan(java.lang.String value) {
            addCriterion("version_no <", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoLessThanOrEqualTo(java.lang.String value) {
            addCriterion("version_no <=", value, "versionNo");
            return (Criteria) this;
        }


        public Criteria andVersionNoIn(List<java.lang.String > values) {
            addCriterion("version_no in", values, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoNotIn(List<java.lang.String> values) {
            addCriterion("version_no not in", values, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("version_no between", value1, value2, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoNotBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("version_no not between", value1, value2, "versionNo");
            return (Criteria) this;
        }



        public Criteria andLevelIdIsNull() {
            addCriterion("levelId is null");
            return (Criteria) this;
        }


        public Criteria andLevelIdIsNotNull() {
            addCriterion("levelId is not null");
            return (Criteria) this;
        }

        public Criteria andLevelIdEqualTo(java.lang.Integer value) {
            addCriterion("level_id =", value, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdNotEqualTo(java.lang.Integer value) {
            addCriterion("level_id <>", value, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdGreaterThan(java.lang.Integer value) {
            addCriterion("level_id >", value, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("level_id >=", value, "level_id");
            return (Criteria) this;
        }

        public Criteria andLevelIdLessThan(java.lang.Integer value) {
            addCriterion("level_id <", value, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("level_id <=", value, "levelId");
            return (Criteria) this;
        }


        public Criteria andLevelIdIn(List<java.lang.Integer > values) {
            addCriterion("level_id in", values, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdNotIn(List<java.lang.Integer> values) {
            addCriterion("level_id not in", values, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("level_id between", value1, value2, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdNotBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("level_id not between", value1, value2, "levelId");
            return (Criteria) this;
        }



        public Criteria andCountryCodeIsNull() {
            addCriterion("countryCode is null");
            return (Criteria) this;
        }


        public Criteria andCountryCodeIsNotNull() {
            addCriterion("countryCode is not null");
            return (Criteria) this;
        }

        public Criteria andCountryCodeEqualTo(java.lang.String value) {
            addCriterion("country_code =", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotEqualTo(java.lang.String value) {
            addCriterion("country_code <>", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeGreaterThan(java.lang.String value) {
            addCriterion("country_code >", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeGreaterThanOrEqualTo(java.lang.String value) {
            addCriterion("country_code >=", value, "country_code");
            return (Criteria) this;
        }

        public Criteria andCountryCodeLessThan(java.lang.String value) {
            addCriterion("country_code <", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeLessThanOrEqualTo(java.lang.String value) {
            addCriterion("country_code <=", value, "countryCode");
            return (Criteria) this;
        }


        public Criteria andCountryCodeIn(List<java.lang.String > values) {
            addCriterion("country_code in", values, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotIn(List<java.lang.String> values) {
            addCriterion("country_code not in", values, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("country_code between", value1, value2, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("country_code not between", value1, value2, "countryCode");
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



        public Criteria andDeptTypeIdIsNull() {
            addCriterion("deptTypeId is null");
            return (Criteria) this;
        }


        public Criteria andDeptTypeIdIsNotNull() {
            addCriterion("deptTypeId is not null");
            return (Criteria) this;
        }

        public Criteria andDeptTypeIdEqualTo(java.lang.Integer value) {
            addCriterion("dept_type_id =", value, "deptTypeId");
            return (Criteria) this;
        }

        public Criteria andDeptTypeIdNotEqualTo(java.lang.Integer value) {
            addCriterion("dept_type_id <>", value, "deptTypeId");
            return (Criteria) this;
        }

        public Criteria andDeptTypeIdGreaterThan(java.lang.Integer value) {
            addCriterion("dept_type_id >", value, "deptTypeId");
            return (Criteria) this;
        }

        public Criteria andDeptTypeIdGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("dept_type_id >=", value, "dept_type_id");
            return (Criteria) this;
        }

        public Criteria andDeptTypeIdLessThan(java.lang.Integer value) {
            addCriterion("dept_type_id <", value, "deptTypeId");
            return (Criteria) this;
        }

        public Criteria andDeptTypeIdLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("dept_type_id <=", value, "deptTypeId");
            return (Criteria) this;
        }


        public Criteria andDeptTypeIdIn(List<java.lang.Integer > values) {
            addCriterion("dept_type_id in", values, "deptTypeId");
            return (Criteria) this;
        }

        public Criteria andDeptTypeIdNotIn(List<java.lang.Integer> values) {
            addCriterion("dept_type_id not in", values, "deptTypeId");
            return (Criteria) this;
        }

        public Criteria andDeptTypeIdBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("dept_type_id between", value1, value2, "deptTypeId");
            return (Criteria) this;
        }

        public Criteria andDeptTypeIdNotBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("dept_type_id not between", value1, value2, "deptTypeId");
            return (Criteria) this;
        }



        public Criteria andCmIdIsNull() {
            addCriterion("cmId is null");
            return (Criteria) this;
        }


        public Criteria andCmIdIsNotNull() {
            addCriterion("cmId is not null");
            return (Criteria) this;
        }

        public Criteria andCmIdEqualTo(java.lang.Integer value) {
            addCriterion("cm_id =", value, "cmId");
            return (Criteria) this;
        }

        public Criteria andCmIdNotEqualTo(java.lang.Integer value) {
            addCriterion("cm_id <>", value, "cmId");
            return (Criteria) this;
        }

        public Criteria andCmIdGreaterThan(java.lang.Integer value) {
            addCriterion("cm_id >", value, "cmId");
            return (Criteria) this;
        }

        public Criteria andCmIdGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("cm_id >=", value, "cm_id");
            return (Criteria) this;
        }

        public Criteria andCmIdLessThan(java.lang.Integer value) {
            addCriterion("cm_id <", value, "cmId");
            return (Criteria) this;
        }

        public Criteria andCmIdLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("cm_id <=", value, "cmId");
            return (Criteria) this;
        }


        public Criteria andCmIdIn(List<java.lang.Integer > values) {
            addCriterion("cm_id in", values, "cmId");
            return (Criteria) this;
        }

        public Criteria andCmIdNotIn(List<java.lang.Integer> values) {
            addCriterion("cm_id not in", values, "cmId");
            return (Criteria) this;
        }

        public Criteria andCmIdBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("cm_id between", value1, value2, "cmId");
            return (Criteria) this;
        }

        public Criteria andCmIdNotBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("cm_id not between", value1, value2, "cmId");
            return (Criteria) this;
        }



        public Criteria andPsIdIsNull() {
            addCriterion("psId is null");
            return (Criteria) this;
        }


        public Criteria andPsIdIsNotNull() {
            addCriterion("psId is not null");
            return (Criteria) this;
        }

        public Criteria andPsIdEqualTo(java.lang.Integer value) {
            addCriterion("ps_id =", value, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdNotEqualTo(java.lang.Integer value) {
            addCriterion("ps_id <>", value, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdGreaterThan(java.lang.Integer value) {
            addCriterion("ps_id >", value, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("ps_id >=", value, "ps_id");
            return (Criteria) this;
        }

        public Criteria andPsIdLessThan(java.lang.Integer value) {
            addCriterion("ps_id <", value, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("ps_id <=", value, "psId");
            return (Criteria) this;
        }


        public Criteria andPsIdIn(List<java.lang.Integer > values) {
            addCriterion("ps_id in", values, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdNotIn(List<java.lang.Integer> values) {
            addCriterion("ps_id not in", values, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("ps_id between", value1, value2, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdNotBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("ps_id not between", value1, value2, "psId");
            return (Criteria) this;
        }



        public Criteria andSkuTypeIsNull() {
            addCriterion("skuType is null");
            return (Criteria) this;
        }


        public Criteria andSkuTypeIsNotNull() {
            addCriterion("skuType is not null");
            return (Criteria) this;
        }

        public Criteria andSkuTypeEqualTo(java.lang.Integer value) {
            addCriterion("sku_type =", value, "skuType");
            return (Criteria) this;
        }

        public Criteria andSkuTypeNotEqualTo(java.lang.Integer value) {
            addCriterion("sku_type <>", value, "skuType");
            return (Criteria) this;
        }

        public Criteria andSkuTypeGreaterThan(java.lang.Integer value) {
            addCriterion("sku_type >", value, "skuType");
            return (Criteria) this;
        }

        public Criteria andSkuTypeGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("sku_type >=", value, "sku_type");
            return (Criteria) this;
        }

        public Criteria andSkuTypeLessThan(java.lang.Integer value) {
            addCriterion("sku_type <", value, "skuType");
            return (Criteria) this;
        }

        public Criteria andSkuTypeLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("sku_type <=", value, "skuType");
            return (Criteria) this;
        }


        public Criteria andSkuTypeIn(List<java.lang.Integer > values) {
            addCriterion("sku_type in", values, "skuType");
            return (Criteria) this;
        }

        public Criteria andSkuTypeNotIn(List<java.lang.Integer> values) {
            addCriterion("sku_type not in", values, "skuType");
            return (Criteria) this;
        }

        public Criteria andSkuTypeBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("sku_type between", value1, value2, "skuType");
            return (Criteria) this;
        }

        public Criteria andSkuTypeNotBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("sku_type not between", value1, value2, "skuType");
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



        public Criteria andForPlanIsNull() {
            addCriterion("forPlan is null");
            return (Criteria) this;
        }


        public Criteria andForPlanIsNotNull() {
            addCriterion("forPlan is not null");
            return (Criteria) this;
        }

        public Criteria andForPlanEqualTo(java.lang.Integer value) {
            addCriterion("for_plan =", value, "forPlan");
            return (Criteria) this;
        }

        public Criteria andForPlanNotEqualTo(java.lang.Integer value) {
            addCriterion("for_plan <>", value, "forPlan");
            return (Criteria) this;
        }

        public Criteria andForPlanGreaterThan(java.lang.Integer value) {
            addCriterion("for_plan >", value, "forPlan");
            return (Criteria) this;
        }

        public Criteria andForPlanGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("for_plan >=", value, "for_plan");
            return (Criteria) this;
        }

        public Criteria andForPlanLessThan(java.lang.Integer value) {
            addCriterion("for_plan <", value, "forPlan");
            return (Criteria) this;
        }

        public Criteria andForPlanLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("for_plan <=", value, "forPlan");
            return (Criteria) this;
        }


        public Criteria andForPlanIn(List<java.lang.Integer > values) {
            addCriterion("for_plan in", values, "forPlan");
            return (Criteria) this;
        }

        public Criteria andForPlanNotIn(List<java.lang.Integer> values) {
            addCriterion("for_plan not in", values, "forPlan");
            return (Criteria) this;
        }

        public Criteria andForPlanBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("for_plan between", value1, value2, "forPlan");
            return (Criteria) this;
        }

        public Criteria andForPlanNotBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("for_plan not between", value1, value2, "forPlan");
            return (Criteria) this;
        }



        public Criteria andForStockUpIsNull() {
            addCriterion("forStockUp is null");
            return (Criteria) this;
        }


        public Criteria andForStockUpIsNotNull() {
            addCriterion("forStockUp is not null");
            return (Criteria) this;
        }

        public Criteria andForStockUpEqualTo(Integer value) {
            addCriterion("for_stock_up =", value, "forStockUp");
            return (Criteria) this;
        }

        public Criteria andForStockUpNotEqualTo(Integer value) {
            addCriterion("for_stock_up <>", value, "forStockUp");
            return (Criteria) this;
        }

        public Criteria andForStockUpGreaterThan(Integer value) {
            addCriterion("for_stock_up >", value, "forStockUp");
            return (Criteria) this;
        }

        public Criteria andForStockUpGreaterThanOrEqualTo(Integer value) {
            addCriterion("for_stock_up >=", value, "for_stock_up");
            return (Criteria) this;
        }

        public Criteria andForStockUpLessThan(Integer value) {
            addCriterion("for_stock_up <", value, "forStockUp");
            return (Criteria) this;
        }

        public Criteria andForStockUpLessThanOrEqualTo(Integer value) {
            addCriterion("for_stock_up <=", value, "forStockUp");
            return (Criteria) this;
        }


        public Criteria andForStockUpIn(List<Integer > values) {
            addCriterion("for_stock_up in", values, "forStockUp");
            return (Criteria) this;
        }

        public Criteria andForStockUpNotIn(List<Integer> values) {
            addCriterion("for_stock_up not in", values, "forStockUp");
            return (Criteria) this;
        }

        public Criteria andForStockUpBetween(Integer value1, Integer value2) {
            addCriterion("for_stock_up between", value1, value2, "forStockUp");
            return (Criteria) this;
        }

        public Criteria andForStockUpNotBetween(Integer value1, Integer value2) {
            addCriterion("for_stock_up not between", value1, value2, "forStockUp");
            return (Criteria) this;
        }



        public Criteria andTlIdIsNull() {
            addCriterion("tlId is null");
            return (Criteria) this;
        }


        public Criteria andTlIdIsNotNull() {
            addCriterion("tlId is not null");
            return (Criteria) this;
        }

        public Criteria andTlIdEqualTo(java.lang.Integer value) {
            addCriterion("tl_id =", value, "tlId");
            return (Criteria) this;
        }

        public Criteria andTlIdNotEqualTo(java.lang.Integer value) {
            addCriterion("tl_id <>", value, "tlId");
            return (Criteria) this;
        }

        public Criteria andTlIdGreaterThan(java.lang.Integer value) {
            addCriterion("tl_id >", value, "tlId");
            return (Criteria) this;
        }

        public Criteria andTlIdGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("tl_id >=", value, "tl_id");
            return (Criteria) this;
        }

        public Criteria andTlIdLessThan(java.lang.Integer value) {
            addCriterion("tl_id <", value, "tlId");
            return (Criteria) this;
        }

        public Criteria andTlIdLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("tl_id <=", value, "tlId");
            return (Criteria) this;
        }


        public Criteria andTlIdIn(List<java.lang.Integer > values) {
            addCriterion("tl_id in", values, "tlId");
            return (Criteria) this;
        }

        public Criteria andTlIdNotIn(List<java.lang.Integer> values) {
            addCriterion("tl_id not in", values, "tlId");
            return (Criteria) this;
        }

        public Criteria andTlIdBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("tl_id between", value1, value2, "tlId");
            return (Criteria) this;
        }

        public Criteria andTlIdNotBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("tl_id not between", value1, value2, "tlId");
            return (Criteria) this;
        }



        public Criteria andStlIdIsNull() {
            addCriterion("stlId is null");
            return (Criteria) this;
        }


        public Criteria andStlIdIsNotNull() {
            addCriterion("stlId is not null");
            return (Criteria) this;
        }

        public Criteria andStlIdEqualTo(java.lang.Integer value) {
            addCriterion("stl_id =", value, "stlId");
            return (Criteria) this;
        }

        public Criteria andStlIdNotEqualTo(java.lang.Integer value) {
            addCriterion("stl_id <>", value, "stlId");
            return (Criteria) this;
        }

        public Criteria andStlIdGreaterThan(java.lang.Integer value) {
            addCriterion("stl_id >", value, "stlId");
            return (Criteria) this;
        }

        public Criteria andStlIdGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("stl_id >=", value, "stl_id");
            return (Criteria) this;
        }

        public Criteria andStlIdLessThan(java.lang.Integer value) {
            addCriterion("stl_id <", value, "stlId");
            return (Criteria) this;
        }

        public Criteria andStlIdLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("stl_id <=", value, "stlId");
            return (Criteria) this;
        }


        public Criteria andStlIdIn(List<java.lang.Integer > values) {
            addCriterion("stl_id in", values, "stlId");
            return (Criteria) this;
        }

        public Criteria andStlIdNotIn(List<java.lang.Integer> values) {
            addCriterion("stl_id not in", values, "stlId");
            return (Criteria) this;
        }

        public Criteria andStlIdBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("stl_id between", value1, value2, "stlId");
            return (Criteria) this;
        }

        public Criteria andStlIdNotBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("stl_id not between", value1, value2, "stlId");
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



        public Criteria andCreateUserIdIsNull() {
            addCriterion("createUserId is null");
            return (Criteria) this;
        }


        public Criteria andCreateUserIdIsNotNull() {
            addCriterion("createUserId is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdEqualTo(java.lang.Integer value) {
            addCriterion("create_user_id =", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotEqualTo(java.lang.Integer value) {
            addCriterion("create_user_id <>", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdGreaterThan(java.lang.Integer value) {
            addCriterion("create_user_id >", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("create_user_id >=", value, "create_user_id");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLessThan(java.lang.Integer value) {
            addCriterion("create_user_id <", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("create_user_id <=", value, "createUserId");
            return (Criteria) this;
        }


        public Criteria andCreateUserIdIn(List<java.lang.Integer > values) {
            addCriterion("create_user_id in", values, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotIn(List<java.lang.Integer> values) {
            addCriterion("create_user_id not in", values, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("create_user_id between", value1, value2, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("create_user_id not between", value1, value2, "createUserId");
            return (Criteria) this;
        }



        public Criteria andUpdateDateIsNull() {
            addCriterion("updateDate is null");
            return (Criteria) this;
        }


        public Criteria andUpdateDateIsNotNull() {
            addCriterion("updateDate is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(java.util.Date value) {
            addCriterion("update_date =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(java.util.Date value) {
            addCriterion("update_date <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(java.util.Date value) {
            addCriterion("update_date >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(java.util.Date value) {
            addCriterion("update_date >=", value, "update_date");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(java.util.Date value) {
            addCriterion("update_date <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(java.util.Date value) {
            addCriterion("update_date <=", value, "updateDate");
            return (Criteria) this;
        }


        public Criteria andUpdateDateIn(List<java.util.Date > values) {
            addCriterion("update_date in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<java.util.Date> values) {
            addCriterion("update_date not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(java.util.Date value1, java.util.Date value2) {
            addCriterion("update_date between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(java.util.Date value1, java.util.Date value2) {
            addCriterion("update_date not between", value1, value2, "updateDate");
            return (Criteria) this;
        }



        public Criteria andUpdateUserIdIsNull() {
            addCriterion("updateUserId is null");
            return (Criteria) this;
        }


        public Criteria andUpdateUserIdIsNotNull() {
            addCriterion("updateUserId is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdEqualTo(java.lang.Integer value) {
            addCriterion("update_user_id =", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdNotEqualTo(java.lang.Integer value) {
            addCriterion("update_user_id <>", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdGreaterThan(java.lang.Integer value) {
            addCriterion("update_user_id >", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("update_user_id >=", value, "update_user_id");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdLessThan(java.lang.Integer value) {
            addCriterion("update_user_id <", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("update_user_id <=", value, "updateUserId");
            return (Criteria) this;
        }


        public Criteria andUpdateUserIdIn(List<java.lang.Integer > values) {
            addCriterion("update_user_id in", values, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdNotIn(List<java.lang.Integer> values) {
            addCriterion("update_user_id not in", values, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("update_user_id between", value1, value2, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdNotBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("update_user_id not between", value1, value2, "updateUserId");
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



        public Criteria andStructureTypeIsNull() {
            addCriterion("structureType is null");
            return (Criteria) this;
        }


        public Criteria andStructureTypeIsNotNull() {
            addCriterion("structureType is not null");
            return (Criteria) this;
        }

        public Criteria andStructureTypeEqualTo(java.lang.Integer value) {
            addCriterion("structure_type =", value, "structureType");
            return (Criteria) this;
        }

        public Criteria andStructureTypeNotEqualTo(java.lang.Integer value) {
            addCriterion("structure_type <>", value, "structureType");
            return (Criteria) this;
        }

        public Criteria andStructureTypeGreaterThan(java.lang.Integer value) {
            addCriterion("structure_type >", value, "structureType");
            return (Criteria) this;
        }

        public Criteria andStructureTypeGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("structure_type >=", value, "structure_type");
            return (Criteria) this;
        }

        public Criteria andStructureTypeLessThan(java.lang.Integer value) {
            addCriterion("structure_type <", value, "structureType");
            return (Criteria) this;
        }

        public Criteria andStructureTypeLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("structure_type <=", value, "structureType");
            return (Criteria) this;
        }


        public Criteria andStructureTypeIn(List<java.lang.Integer > values) {
            addCriterion("structure_type in", values, "structureType");
            return (Criteria) this;
        }

        public Criteria andStructureTypeNotIn(List<java.lang.Integer> values) {
            addCriterion("structure_type not in", values, "structureType");
            return (Criteria) this;
        }

        public Criteria andStructureTypeBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("structure_type between", value1, value2, "structureType");
            return (Criteria) this;
        }

        public Criteria andStructureTypeNotBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("structure_type not between", value1, value2, "structureType");
            return (Criteria) this;
        }



        public Criteria andOldIdIsNull() {
            addCriterion("oldId is null");
            return (Criteria) this;
        }


        public Criteria andOldIdIsNotNull() {
            addCriterion("oldId is not null");
            return (Criteria) this;
        }

        public Criteria andOldIdEqualTo(java.lang.Integer value) {
            addCriterion("old_id =", value, "oldId");
            return (Criteria) this;
        }

        public Criteria andOldIdNotEqualTo(java.lang.Integer value) {
            addCriterion("old_id <>", value, "oldId");
            return (Criteria) this;
        }

        public Criteria andOldIdGreaterThan(java.lang.Integer value) {
            addCriterion("old_id >", value, "oldId");
            return (Criteria) this;
        }

        public Criteria andOldIdGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("old_id >=", value, "old_id");
            return (Criteria) this;
        }

        public Criteria andOldIdLessThan(java.lang.Integer value) {
            addCriterion("old_id <", value, "oldId");
            return (Criteria) this;
        }

        public Criteria andOldIdLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("old_id <=", value, "oldId");
            return (Criteria) this;
        }


        public Criteria andOldIdIn(List<java.lang.Integer > values) {
            addCriterion("old_id in", values, "oldId");
            return (Criteria) this;
        }

        public Criteria andOldIdNotIn(List<java.lang.Integer> values) {
            addCriterion("old_id not in", values, "oldId");
            return (Criteria) this;
        }

        public Criteria andOldIdBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("old_id between", value1, value2, "oldId");
            return (Criteria) this;
        }

        public Criteria andOldIdNotBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("old_id not between", value1, value2, "oldId");
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