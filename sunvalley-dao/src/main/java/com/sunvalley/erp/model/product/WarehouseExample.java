package com.sunvalley.erp.model.product;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.math.BigDecimal;

/**
* @Description: WarehouseExample
* @author
* @date 2017-09-22 12:25:29
*/
public class WarehouseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private int pageIndex;

    private int pageSize;

    public WarehouseExample() {
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

    public WarehouseExample(int pageSize, int pageIndex) {
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
        
        public Criteria andWhIdIsNull() {
            addCriterion("whId is null");
            return (Criteria) this;
        }


        public Criteria andWhIdIsNotNull() {
            addCriterion("whId is not null");
            return (Criteria) this;
        }

        public Criteria andWhIdEqualTo(java.lang.Integer value) {
            addCriterion("wh_id =", value, "whId");
            return (Criteria) this;
        }

        public Criteria andWhIdNotEqualTo(java.lang.Integer value) {
            addCriterion("wh_id <>", value, "whId");
            return (Criteria) this;
        }

        public Criteria andWhIdGreaterThan(java.lang.Integer value) {
            addCriterion("wh_id >", value, "whId");
            return (Criteria) this;
        }

        public Criteria andWhIdGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("wh_id >=", value, "wh_id");
            return (Criteria) this;
        }

        public Criteria andWhIdLessThan(java.lang.Integer value) {
            addCriterion("wh_id <", value, "whId");
            return (Criteria) this;
        }

        public Criteria andWhIdLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("wh_id <=", value, "whId");
            return (Criteria) this;
        }


        public Criteria andWhIdIn(List<java.lang.Integer > values) {
            addCriterion("wh_id in", values, "whId");
            return (Criteria) this;
        }

        public Criteria andWhIdNotIn(List<java.lang.Integer> values) {
            addCriterion("wh_id not in", values, "whId");
            return (Criteria) this;
        }

        public Criteria andWhIdBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("wh_id between", value1, value2, "whId");
            return (Criteria) this;
        }

        public Criteria andWhIdNotBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("wh_id not between", value1, value2, "whId");
            return (Criteria) this;
        }



        public Criteria andWhNameIsNull() {
            addCriterion("whName is null");
            return (Criteria) this;
        }


        public Criteria andWhNameIsNotNull() {
            addCriterion("whName is not null");
            return (Criteria) this;
        }

        public Criteria andWhNameEqualTo(java.lang.String value) {
            addCriterion("wh_name =", value, "whName");
            return (Criteria) this;
        }

        public Criteria andWhNameNotEqualTo(java.lang.String value) {
            addCriterion("wh_name <>", value, "whName");
            return (Criteria) this;
        }

        public Criteria andWhNameGreaterThan(java.lang.String value) {
            addCriterion("wh_name >", value, "whName");
            return (Criteria) this;
        }

        public Criteria andWhNameGreaterThanOrEqualTo(java.lang.String value) {
            addCriterion("wh_name >=", value, "wh_name");
            return (Criteria) this;
        }

        public Criteria andWhNameLessThan(java.lang.String value) {
            addCriterion("wh_name <", value, "whName");
            return (Criteria) this;
        }

        public Criteria andWhNameLessThanOrEqualTo(java.lang.String value) {
            addCriterion("wh_name <=", value, "whName");
            return (Criteria) this;
        }


        public Criteria andWhNameIn(List<java.lang.String > values) {
            addCriterion("wh_name in", values, "whName");
            return (Criteria) this;
        }

        public Criteria andWhNameNotIn(List<java.lang.String> values) {
            addCriterion("wh_name not in", values, "whName");
            return (Criteria) this;
        }

        public Criteria andWhNameBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("wh_name between", value1, value2, "whName");
            return (Criteria) this;
        }

        public Criteria andWhNameNotBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("wh_name not between", value1, value2, "whName");
            return (Criteria) this;
        }



        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }


        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(java.lang.String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(java.lang.String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(java.lang.String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(java.lang.String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(java.lang.String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(java.lang.String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }


        public Criteria andTypeIn(List<java.lang.String > values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<java.lang.String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }



        public Criteria andWhEmailIsNull() {
            addCriterion("whEmail is null");
            return (Criteria) this;
        }


        public Criteria andWhEmailIsNotNull() {
            addCriterion("whEmail is not null");
            return (Criteria) this;
        }

        public Criteria andWhEmailEqualTo(java.lang.String value) {
            addCriterion("wh_email =", value, "whEmail");
            return (Criteria) this;
        }

        public Criteria andWhEmailNotEqualTo(java.lang.String value) {
            addCriterion("wh_email <>", value, "whEmail");
            return (Criteria) this;
        }

        public Criteria andWhEmailGreaterThan(java.lang.String value) {
            addCriterion("wh_email >", value, "whEmail");
            return (Criteria) this;
        }

        public Criteria andWhEmailGreaterThanOrEqualTo(java.lang.String value) {
            addCriterion("wh_email >=", value, "wh_email");
            return (Criteria) this;
        }

        public Criteria andWhEmailLessThan(java.lang.String value) {
            addCriterion("wh_email <", value, "whEmail");
            return (Criteria) this;
        }

        public Criteria andWhEmailLessThanOrEqualTo(java.lang.String value) {
            addCriterion("wh_email <=", value, "whEmail");
            return (Criteria) this;
        }


        public Criteria andWhEmailIn(List<java.lang.String > values) {
            addCriterion("wh_email in", values, "whEmail");
            return (Criteria) this;
        }

        public Criteria andWhEmailNotIn(List<java.lang.String> values) {
            addCriterion("wh_email not in", values, "whEmail");
            return (Criteria) this;
        }

        public Criteria andWhEmailBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("wh_email between", value1, value2, "whEmail");
            return (Criteria) this;
        }

        public Criteria andWhEmailNotBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("wh_email not between", value1, value2, "whEmail");
            return (Criteria) this;
        }



        public Criteria andWhContactIsNull() {
            addCriterion("whContact is null");
            return (Criteria) this;
        }


        public Criteria andWhContactIsNotNull() {
            addCriterion("whContact is not null");
            return (Criteria) this;
        }

        public Criteria andWhContactEqualTo(java.lang.String value) {
            addCriterion("wh_contact =", value, "whContact");
            return (Criteria) this;
        }

        public Criteria andWhContactNotEqualTo(java.lang.String value) {
            addCriterion("wh_contact <>", value, "whContact");
            return (Criteria) this;
        }

        public Criteria andWhContactGreaterThan(java.lang.String value) {
            addCriterion("wh_contact >", value, "whContact");
            return (Criteria) this;
        }

        public Criteria andWhContactGreaterThanOrEqualTo(java.lang.String value) {
            addCriterion("wh_contact >=", value, "wh_contact");
            return (Criteria) this;
        }

        public Criteria andWhContactLessThan(java.lang.String value) {
            addCriterion("wh_contact <", value, "whContact");
            return (Criteria) this;
        }

        public Criteria andWhContactLessThanOrEqualTo(java.lang.String value) {
            addCriterion("wh_contact <=", value, "whContact");
            return (Criteria) this;
        }


        public Criteria andWhContactIn(List<java.lang.String > values) {
            addCriterion("wh_contact in", values, "whContact");
            return (Criteria) this;
        }

        public Criteria andWhContactNotIn(List<java.lang.String> values) {
            addCriterion("wh_contact not in", values, "whContact");
            return (Criteria) this;
        }

        public Criteria andWhContactBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("wh_contact between", value1, value2, "whContact");
            return (Criteria) this;
        }

        public Criteria andWhContactNotBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("wh_contact not between", value1, value2, "whContact");
            return (Criteria) this;
        }



        public Criteria andWhContactLastnameIsNull() {
            addCriterion("whContactLastname is null");
            return (Criteria) this;
        }


        public Criteria andWhContactLastnameIsNotNull() {
            addCriterion("whContactLastname is not null");
            return (Criteria) this;
        }

        public Criteria andWhContactLastnameEqualTo(java.lang.String value) {
            addCriterion("wh_contact_lastname =", value, "whContactLastname");
            return (Criteria) this;
        }

        public Criteria andWhContactLastnameNotEqualTo(java.lang.String value) {
            addCriterion("wh_contact_lastname <>", value, "whContactLastname");
            return (Criteria) this;
        }

        public Criteria andWhContactLastnameGreaterThan(java.lang.String value) {
            addCriterion("wh_contact_lastname >", value, "whContactLastname");
            return (Criteria) this;
        }

        public Criteria andWhContactLastnameGreaterThanOrEqualTo(java.lang.String value) {
            addCriterion("wh_contact_lastname >=", value, "wh_contact_lastname");
            return (Criteria) this;
        }

        public Criteria andWhContactLastnameLessThan(java.lang.String value) {
            addCriterion("wh_contact_lastname <", value, "whContactLastname");
            return (Criteria) this;
        }

        public Criteria andWhContactLastnameLessThanOrEqualTo(java.lang.String value) {
            addCriterion("wh_contact_lastname <=", value, "whContactLastname");
            return (Criteria) this;
        }


        public Criteria andWhContactLastnameIn(List<java.lang.String > values) {
            addCriterion("wh_contact_lastname in", values, "whContactLastname");
            return (Criteria) this;
        }

        public Criteria andWhContactLastnameNotIn(List<java.lang.String> values) {
            addCriterion("wh_contact_lastname not in", values, "whContactLastname");
            return (Criteria) this;
        }

        public Criteria andWhContactLastnameBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("wh_contact_lastname between", value1, value2, "whContactLastname");
            return (Criteria) this;
        }

        public Criteria andWhContactLastnameNotBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("wh_contact_lastname not between", value1, value2, "whContactLastname");
            return (Criteria) this;
        }



        public Criteria andWhAddrIsNull() {
            addCriterion("whAddr is null");
            return (Criteria) this;
        }


        public Criteria andWhAddrIsNotNull() {
            addCriterion("whAddr is not null");
            return (Criteria) this;
        }

        public Criteria andWhAddrEqualTo(java.lang.String value) {
            addCriterion("wh_addr =", value, "whAddr");
            return (Criteria) this;
        }

        public Criteria andWhAddrNotEqualTo(java.lang.String value) {
            addCriterion("wh_addr <>", value, "whAddr");
            return (Criteria) this;
        }

        public Criteria andWhAddrGreaterThan(java.lang.String value) {
            addCriterion("wh_addr >", value, "whAddr");
            return (Criteria) this;
        }

        public Criteria andWhAddrGreaterThanOrEqualTo(java.lang.String value) {
            addCriterion("wh_addr >=", value, "wh_addr");
            return (Criteria) this;
        }

        public Criteria andWhAddrLessThan(java.lang.String value) {
            addCriterion("wh_addr <", value, "whAddr");
            return (Criteria) this;
        }

        public Criteria andWhAddrLessThanOrEqualTo(java.lang.String value) {
            addCriterion("wh_addr <=", value, "whAddr");
            return (Criteria) this;
        }


        public Criteria andWhAddrIn(List<java.lang.String > values) {
            addCriterion("wh_addr in", values, "whAddr");
            return (Criteria) this;
        }

        public Criteria andWhAddrNotIn(List<java.lang.String> values) {
            addCriterion("wh_addr not in", values, "whAddr");
            return (Criteria) this;
        }

        public Criteria andWhAddrBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("wh_addr between", value1, value2, "whAddr");
            return (Criteria) this;
        }

        public Criteria andWhAddrNotBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("wh_addr not between", value1, value2, "whAddr");
            return (Criteria) this;
        }



        public Criteria andWhCityIsNull() {
            addCriterion("whCity is null");
            return (Criteria) this;
        }


        public Criteria andWhCityIsNotNull() {
            addCriterion("whCity is not null");
            return (Criteria) this;
        }

        public Criteria andWhCityEqualTo(java.lang.String value) {
            addCriterion("wh_city =", value, "whCity");
            return (Criteria) this;
        }

        public Criteria andWhCityNotEqualTo(java.lang.String value) {
            addCriterion("wh_city <>", value, "whCity");
            return (Criteria) this;
        }

        public Criteria andWhCityGreaterThan(java.lang.String value) {
            addCriterion("wh_city >", value, "whCity");
            return (Criteria) this;
        }

        public Criteria andWhCityGreaterThanOrEqualTo(java.lang.String value) {
            addCriterion("wh_city >=", value, "wh_city");
            return (Criteria) this;
        }

        public Criteria andWhCityLessThan(java.lang.String value) {
            addCriterion("wh_city <", value, "whCity");
            return (Criteria) this;
        }

        public Criteria andWhCityLessThanOrEqualTo(java.lang.String value) {
            addCriterion("wh_city <=", value, "whCity");
            return (Criteria) this;
        }


        public Criteria andWhCityIn(List<java.lang.String > values) {
            addCriterion("wh_city in", values, "whCity");
            return (Criteria) this;
        }

        public Criteria andWhCityNotIn(List<java.lang.String> values) {
            addCriterion("wh_city not in", values, "whCity");
            return (Criteria) this;
        }

        public Criteria andWhCityBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("wh_city between", value1, value2, "whCity");
            return (Criteria) this;
        }

        public Criteria andWhCityNotBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("wh_city not between", value1, value2, "whCity");
            return (Criteria) this;
        }



        public Criteria andWhStateIsNull() {
            addCriterion("whState is null");
            return (Criteria) this;
        }


        public Criteria andWhStateIsNotNull() {
            addCriterion("whState is not null");
            return (Criteria) this;
        }

        public Criteria andWhStateEqualTo(java.lang.String value) {
            addCriterion("wh_state =", value, "whState");
            return (Criteria) this;
        }

        public Criteria andWhStateNotEqualTo(java.lang.String value) {
            addCriterion("wh_state <>", value, "whState");
            return (Criteria) this;
        }

        public Criteria andWhStateGreaterThan(java.lang.String value) {
            addCriterion("wh_state >", value, "whState");
            return (Criteria) this;
        }

        public Criteria andWhStateGreaterThanOrEqualTo(java.lang.String value) {
            addCriterion("wh_state >=", value, "wh_state");
            return (Criteria) this;
        }

        public Criteria andWhStateLessThan(java.lang.String value) {
            addCriterion("wh_state <", value, "whState");
            return (Criteria) this;
        }

        public Criteria andWhStateLessThanOrEqualTo(java.lang.String value) {
            addCriterion("wh_state <=", value, "whState");
            return (Criteria) this;
        }


        public Criteria andWhStateIn(List<java.lang.String > values) {
            addCriterion("wh_state in", values, "whState");
            return (Criteria) this;
        }

        public Criteria andWhStateNotIn(List<java.lang.String> values) {
            addCriterion("wh_state not in", values, "whState");
            return (Criteria) this;
        }

        public Criteria andWhStateBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("wh_state between", value1, value2, "whState");
            return (Criteria) this;
        }

        public Criteria andWhStateNotBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("wh_state not between", value1, value2, "whState");
            return (Criteria) this;
        }



        public Criteria andWhCountryIsNull() {
            addCriterion("whCountry is null");
            return (Criteria) this;
        }


        public Criteria andWhCountryIsNotNull() {
            addCriterion("whCountry is not null");
            return (Criteria) this;
        }

        public Criteria andWhCountryEqualTo(java.lang.String value) {
            addCriterion("wh_country =", value, "whCountry");
            return (Criteria) this;
        }

        public Criteria andWhCountryNotEqualTo(java.lang.String value) {
            addCriterion("wh_country <>", value, "whCountry");
            return (Criteria) this;
        }

        public Criteria andWhCountryGreaterThan(java.lang.String value) {
            addCriterion("wh_country >", value, "whCountry");
            return (Criteria) this;
        }

        public Criteria andWhCountryGreaterThanOrEqualTo(java.lang.String value) {
            addCriterion("wh_country >=", value, "wh_country");
            return (Criteria) this;
        }

        public Criteria andWhCountryLessThan(java.lang.String value) {
            addCriterion("wh_country <", value, "whCountry");
            return (Criteria) this;
        }

        public Criteria andWhCountryLessThanOrEqualTo(java.lang.String value) {
            addCriterion("wh_country <=", value, "whCountry");
            return (Criteria) this;
        }


        public Criteria andWhCountryIn(List<java.lang.String > values) {
            addCriterion("wh_country in", values, "whCountry");
            return (Criteria) this;
        }

        public Criteria andWhCountryNotIn(List<java.lang.String> values) {
            addCriterion("wh_country not in", values, "whCountry");
            return (Criteria) this;
        }

        public Criteria andWhCountryBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("wh_country between", value1, value2, "whCountry");
            return (Criteria) this;
        }

        public Criteria andWhCountryNotBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("wh_country not between", value1, value2, "whCountry");
            return (Criteria) this;
        }



        public Criteria andWhZipIsNull() {
            addCriterion("whZip is null");
            return (Criteria) this;
        }


        public Criteria andWhZipIsNotNull() {
            addCriterion("whZip is not null");
            return (Criteria) this;
        }

        public Criteria andWhZipEqualTo(java.lang.String value) {
            addCriterion("wh_zip =", value, "whZip");
            return (Criteria) this;
        }

        public Criteria andWhZipNotEqualTo(java.lang.String value) {
            addCriterion("wh_zip <>", value, "whZip");
            return (Criteria) this;
        }

        public Criteria andWhZipGreaterThan(java.lang.String value) {
            addCriterion("wh_zip >", value, "whZip");
            return (Criteria) this;
        }

        public Criteria andWhZipGreaterThanOrEqualTo(java.lang.String value) {
            addCriterion("wh_zip >=", value, "wh_zip");
            return (Criteria) this;
        }

        public Criteria andWhZipLessThan(java.lang.String value) {
            addCriterion("wh_zip <", value, "whZip");
            return (Criteria) this;
        }

        public Criteria andWhZipLessThanOrEqualTo(java.lang.String value) {
            addCriterion("wh_zip <=", value, "whZip");
            return (Criteria) this;
        }


        public Criteria andWhZipIn(List<java.lang.String > values) {
            addCriterion("wh_zip in", values, "whZip");
            return (Criteria) this;
        }

        public Criteria andWhZipNotIn(List<java.lang.String> values) {
            addCriterion("wh_zip not in", values, "whZip");
            return (Criteria) this;
        }

        public Criteria andWhZipBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("wh_zip between", value1, value2, "whZip");
            return (Criteria) this;
        }

        public Criteria andWhZipNotBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("wh_zip not between", value1, value2, "whZip");
            return (Criteria) this;
        }



        public Criteria andWhTelIsNull() {
            addCriterion("whTel is null");
            return (Criteria) this;
        }


        public Criteria andWhTelIsNotNull() {
            addCriterion("whTel is not null");
            return (Criteria) this;
        }

        public Criteria andWhTelEqualTo(java.lang.String value) {
            addCriterion("wh_tel =", value, "whTel");
            return (Criteria) this;
        }

        public Criteria andWhTelNotEqualTo(java.lang.String value) {
            addCriterion("wh_tel <>", value, "whTel");
            return (Criteria) this;
        }

        public Criteria andWhTelGreaterThan(java.lang.String value) {
            addCriterion("wh_tel >", value, "whTel");
            return (Criteria) this;
        }

        public Criteria andWhTelGreaterThanOrEqualTo(java.lang.String value) {
            addCriterion("wh_tel >=", value, "wh_tel");
            return (Criteria) this;
        }

        public Criteria andWhTelLessThan(java.lang.String value) {
            addCriterion("wh_tel <", value, "whTel");
            return (Criteria) this;
        }

        public Criteria andWhTelLessThanOrEqualTo(java.lang.String value) {
            addCriterion("wh_tel <=", value, "whTel");
            return (Criteria) this;
        }


        public Criteria andWhTelIn(List<java.lang.String > values) {
            addCriterion("wh_tel in", values, "whTel");
            return (Criteria) this;
        }

        public Criteria andWhTelNotIn(List<java.lang.String> values) {
            addCriterion("wh_tel not in", values, "whTel");
            return (Criteria) this;
        }

        public Criteria andWhTelBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("wh_tel between", value1, value2, "whTel");
            return (Criteria) this;
        }

        public Criteria andWhTelNotBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("wh_tel not between", value1, value2, "whTel");
            return (Criteria) this;
        }



        public Criteria andWhFaxIsNull() {
            addCriterion("whFax is null");
            return (Criteria) this;
        }


        public Criteria andWhFaxIsNotNull() {
            addCriterion("whFax is not null");
            return (Criteria) this;
        }

        public Criteria andWhFaxEqualTo(java.lang.String value) {
            addCriterion("wh_fax =", value, "whFax");
            return (Criteria) this;
        }

        public Criteria andWhFaxNotEqualTo(java.lang.String value) {
            addCriterion("wh_fax <>", value, "whFax");
            return (Criteria) this;
        }

        public Criteria andWhFaxGreaterThan(java.lang.String value) {
            addCriterion("wh_fax >", value, "whFax");
            return (Criteria) this;
        }

        public Criteria andWhFaxGreaterThanOrEqualTo(java.lang.String value) {
            addCriterion("wh_fax >=", value, "wh_fax");
            return (Criteria) this;
        }

        public Criteria andWhFaxLessThan(java.lang.String value) {
            addCriterion("wh_fax <", value, "whFax");
            return (Criteria) this;
        }

        public Criteria andWhFaxLessThanOrEqualTo(java.lang.String value) {
            addCriterion("wh_fax <=", value, "whFax");
            return (Criteria) this;
        }


        public Criteria andWhFaxIn(List<java.lang.String > values) {
            addCriterion("wh_fax in", values, "whFax");
            return (Criteria) this;
        }

        public Criteria andWhFaxNotIn(List<java.lang.String> values) {
            addCriterion("wh_fax not in", values, "whFax");
            return (Criteria) this;
        }

        public Criteria andWhFaxBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("wh_fax between", value1, value2, "whFax");
            return (Criteria) this;
        }

        public Criteria andWhFaxNotBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("wh_fax not between", value1, value2, "whFax");
            return (Criteria) this;
        }



        public Criteria andCurnoIsNull() {
            addCriterion("curno is null");
            return (Criteria) this;
        }


        public Criteria andCurnoIsNotNull() {
            addCriterion("curno is not null");
            return (Criteria) this;
        }

        public Criteria andCurnoEqualTo(java.lang.String value) {
            addCriterion("curno =", value, "curno");
            return (Criteria) this;
        }

        public Criteria andCurnoNotEqualTo(java.lang.String value) {
            addCriterion("curno <>", value, "curno");
            return (Criteria) this;
        }

        public Criteria andCurnoGreaterThan(java.lang.String value) {
            addCriterion("curno >", value, "curno");
            return (Criteria) this;
        }

        public Criteria andCurnoGreaterThanOrEqualTo(java.lang.String value) {
            addCriterion("curno >=", value, "curno");
            return (Criteria) this;
        }

        public Criteria andCurnoLessThan(java.lang.String value) {
            addCriterion("curno <", value, "curno");
            return (Criteria) this;
        }

        public Criteria andCurnoLessThanOrEqualTo(java.lang.String value) {
            addCriterion("curno <=", value, "curno");
            return (Criteria) this;
        }


        public Criteria andCurnoIn(List<java.lang.String > values) {
            addCriterion("curno in", values, "curno");
            return (Criteria) this;
        }

        public Criteria andCurnoNotIn(List<java.lang.String> values) {
            addCriterion("curno not in", values, "curno");
            return (Criteria) this;
        }

        public Criteria andCurnoBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("curno between", value1, value2, "curno");
            return (Criteria) this;
        }

        public Criteria andCurnoNotBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("curno not between", value1, value2, "curno");
            return (Criteria) this;
        }



        public Criteria andPerorderchargeIsNull() {
            addCriterion("perordercharge is null");
            return (Criteria) this;
        }


        public Criteria andPerorderchargeIsNotNull() {
            addCriterion("perordercharge is not null");
            return (Criteria) this;
        }

        public Criteria andPerorderchargeEqualTo(BigDecimal value) {
            addCriterion("perordercharge =", value, "perordercharge");
            return (Criteria) this;
        }

        public Criteria andPerorderchargeNotEqualTo(BigDecimal value) {
            addCriterion("perordercharge <>", value, "perordercharge");
            return (Criteria) this;
        }

        public Criteria andPerorderchargeGreaterThan(BigDecimal value) {
            addCriterion("perordercharge >", value, "perordercharge");
            return (Criteria) this;
        }

        public Criteria andPerorderchargeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("perordercharge >=", value, "perordercharge");
            return (Criteria) this;
        }

        public Criteria andPerorderchargeLessThan(BigDecimal value) {
            addCriterion("perordercharge <", value, "perordercharge");
            return (Criteria) this;
        }

        public Criteria andPerorderchargeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("perordercharge <=", value, "perordercharge");
            return (Criteria) this;
        }


        public Criteria andPerorderchargeIn(List<BigDecimal > values) {
            addCriterion("perordercharge in", values, "perordercharge");
            return (Criteria) this;
        }

        public Criteria andPerorderchargeNotIn(List<BigDecimal> values) {
            addCriterion("perordercharge not in", values, "perordercharge");
            return (Criteria) this;
        }

        public Criteria andPerorderchargeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("perordercharge between", value1, value2, "perordercharge");
            return (Criteria) this;
        }

        public Criteria andPerorderchargeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("perordercharge not between", value1, value2, "perordercharge");
            return (Criteria) this;
        }



        public Criteria andPeritemchargeIsNull() {
            addCriterion("peritemcharge is null");
            return (Criteria) this;
        }


        public Criteria andPeritemchargeIsNotNull() {
            addCriterion("peritemcharge is not null");
            return (Criteria) this;
        }

        public Criteria andPeritemchargeEqualTo(BigDecimal value) {
            addCriterion("peritemcharge =", value, "peritemcharge");
            return (Criteria) this;
        }

        public Criteria andPeritemchargeNotEqualTo(BigDecimal value) {
            addCriterion("peritemcharge <>", value, "peritemcharge");
            return (Criteria) this;
        }

        public Criteria andPeritemchargeGreaterThan(BigDecimal value) {
            addCriterion("peritemcharge >", value, "peritemcharge");
            return (Criteria) this;
        }

        public Criteria andPeritemchargeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("peritemcharge >=", value, "peritemcharge");
            return (Criteria) this;
        }

        public Criteria andPeritemchargeLessThan(BigDecimal value) {
            addCriterion("peritemcharge <", value, "peritemcharge");
            return (Criteria) this;
        }

        public Criteria andPeritemchargeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("peritemcharge <=", value, "peritemcharge");
            return (Criteria) this;
        }


        public Criteria andPeritemchargeIn(List<BigDecimal > values) {
            addCriterion("peritemcharge in", values, "peritemcharge");
            return (Criteria) this;
        }

        public Criteria andPeritemchargeNotIn(List<BigDecimal> values) {
            addCriterion("peritemcharge not in", values, "peritemcharge");
            return (Criteria) this;
        }

        public Criteria andPeritemchargeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("peritemcharge between", value1, value2, "peritemcharge");
            return (Criteria) this;
        }

        public Criteria andPeritemchargeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("peritemcharge not between", value1, value2, "peritemcharge");
            return (Criteria) this;
        }



        public Criteria andDropshipIsNull() {
            addCriterion("dropship is null");
            return (Criteria) this;
        }


        public Criteria andDropshipIsNotNull() {
            addCriterion("dropship is not null");
            return (Criteria) this;
        }

        public Criteria andDropshipEqualTo(Integer value) {
            addCriterion("dropship =", value, "dropship");
            return (Criteria) this;
        }

        public Criteria andDropshipNotEqualTo(Integer value) {
            addCriterion("dropship <>", value, "dropship");
            return (Criteria) this;
        }

        public Criteria andDropshipGreaterThan(Integer value) {
            addCriterion("dropship >", value, "dropship");
            return (Criteria) this;
        }

        public Criteria andDropshipGreaterThanOrEqualTo(Integer value) {
            addCriterion("dropship >=", value, "dropship");
            return (Criteria) this;
        }

        public Criteria andDropshipLessThan(Integer value) {
            addCriterion("dropship <", value, "dropship");
            return (Criteria) this;
        }

        public Criteria andDropshipLessThanOrEqualTo(Integer value) {
            addCriterion("dropship <=", value, "dropship");
            return (Criteria) this;
        }


        public Criteria andDropshipIn(List<Integer > values) {
            addCriterion("dropship in", values, "dropship");
            return (Criteria) this;
        }

        public Criteria andDropshipNotIn(List<Integer> values) {
            addCriterion("dropship not in", values, "dropship");
            return (Criteria) this;
        }

        public Criteria andDropshipBetween(Integer value1, Integer value2) {
            addCriterion("dropship between", value1, value2, "dropship");
            return (Criteria) this;
        }

        public Criteria andDropshipNotBetween(Integer value1, Integer value2) {
            addCriterion("dropship not between", value1, value2, "dropship");
            return (Criteria) this;
        }



        public Criteria andVirtualIsNull() {
            addCriterion("virtual is null");
            return (Criteria) this;
        }


        public Criteria andVirtualIsNotNull() {
            addCriterion("virtual is not null");
            return (Criteria) this;
        }

        public Criteria andVirtualEqualTo(Integer value) {
            addCriterion("virtual =", value, "virtual");
            return (Criteria) this;
        }

        public Criteria andVirtualNotEqualTo(Integer value) {
            addCriterion("virtual <>", value, "virtual");
            return (Criteria) this;
        }

        public Criteria andVirtualGreaterThan(Integer value) {
            addCriterion("virtual >", value, "virtual");
            return (Criteria) this;
        }

        public Criteria andVirtualGreaterThanOrEqualTo(Integer value) {
            addCriterion("virtual >=", value, "virtual");
            return (Criteria) this;
        }

        public Criteria andVirtualLessThan(Integer value) {
            addCriterion("virtual <", value, "virtual");
            return (Criteria) this;
        }

        public Criteria andVirtualLessThanOrEqualTo(Integer value) {
            addCriterion("virtual <=", value, "virtual");
            return (Criteria) this;
        }


        public Criteria andVirtualIn(List<Integer > values) {
            addCriterion("virtual in", values, "virtual");
            return (Criteria) this;
        }

        public Criteria andVirtualNotIn(List<Integer> values) {
            addCriterion("virtual not in", values, "virtual");
            return (Criteria) this;
        }

        public Criteria andVirtualBetween(Integer value1, Integer value2) {
            addCriterion("virtual between", value1, value2, "virtual");
            return (Criteria) this;
        }

        public Criteria andVirtualNotBetween(Integer value1, Integer value2) {
            addCriterion("virtual not between", value1, value2, "virtual");
            return (Criteria) this;
        }



        public Criteria andUsedWhIdIsNull() {
            addCriterion("usedWhId is null");
            return (Criteria) this;
        }


        public Criteria andUsedWhIdIsNotNull() {
            addCriterion("usedWhId is not null");
            return (Criteria) this;
        }

        public Criteria andUsedWhIdEqualTo(java.lang.Integer value) {
            addCriterion("used_wh_id =", value, "usedWhId");
            return (Criteria) this;
        }

        public Criteria andUsedWhIdNotEqualTo(java.lang.Integer value) {
            addCriterion("used_wh_id <>", value, "usedWhId");
            return (Criteria) this;
        }

        public Criteria andUsedWhIdGreaterThan(java.lang.Integer value) {
            addCriterion("used_wh_id >", value, "usedWhId");
            return (Criteria) this;
        }

        public Criteria andUsedWhIdGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("used_wh_id >=", value, "used_wh_id");
            return (Criteria) this;
        }

        public Criteria andUsedWhIdLessThan(java.lang.Integer value) {
            addCriterion("used_wh_id <", value, "usedWhId");
            return (Criteria) this;
        }

        public Criteria andUsedWhIdLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("used_wh_id <=", value, "usedWhId");
            return (Criteria) this;
        }


        public Criteria andUsedWhIdIn(List<java.lang.Integer > values) {
            addCriterion("used_wh_id in", values, "usedWhId");
            return (Criteria) this;
        }

        public Criteria andUsedWhIdNotIn(List<java.lang.Integer> values) {
            addCriterion("used_wh_id not in", values, "usedWhId");
            return (Criteria) this;
        }

        public Criteria andUsedWhIdBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("used_wh_id between", value1, value2, "usedWhId");
            return (Criteria) this;
        }

        public Criteria andUsedWhIdNotBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("used_wh_id not between", value1, value2, "usedWhId");
            return (Criteria) this;
        }



        public Criteria andCistencilidIsNull() {
            addCriterion("cistencilid is null");
            return (Criteria) this;
        }


        public Criteria andCistencilidIsNotNull() {
            addCriterion("cistencilid is not null");
            return (Criteria) this;
        }

        public Criteria andCistencilidEqualTo(java.lang.Integer value) {
            addCriterion("cistencilid =", value, "cistencilid");
            return (Criteria) this;
        }

        public Criteria andCistencilidNotEqualTo(java.lang.Integer value) {
            addCriterion("cistencilid <>", value, "cistencilid");
            return (Criteria) this;
        }

        public Criteria andCistencilidGreaterThan(java.lang.Integer value) {
            addCriterion("cistencilid >", value, "cistencilid");
            return (Criteria) this;
        }

        public Criteria andCistencilidGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("cistencilid >=", value, "cistencilid");
            return (Criteria) this;
        }

        public Criteria andCistencilidLessThan(java.lang.Integer value) {
            addCriterion("cistencilid <", value, "cistencilid");
            return (Criteria) this;
        }

        public Criteria andCistencilidLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("cistencilid <=", value, "cistencilid");
            return (Criteria) this;
        }


        public Criteria andCistencilidIn(List<java.lang.Integer > values) {
            addCriterion("cistencilid in", values, "cistencilid");
            return (Criteria) this;
        }

        public Criteria andCistencilidNotIn(List<java.lang.Integer> values) {
            addCriterion("cistencilid not in", values, "cistencilid");
            return (Criteria) this;
        }

        public Criteria andCistencilidBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("cistencilid between", value1, value2, "cistencilid");
            return (Criteria) this;
        }

        public Criteria andCistencilidNotBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("cistencilid not between", value1, value2, "cistencilid");
            return (Criteria) this;
        }



        public Criteria andIsMergerIsNull() {
            addCriterion("isMerger is null");
            return (Criteria) this;
        }


        public Criteria andIsMergerIsNotNull() {
            addCriterion("isMerger is not null");
            return (Criteria) this;
        }

        public Criteria andIsMergerEqualTo(java.lang.String value) {
            addCriterion("is_merger =", value, "isMerger");
            return (Criteria) this;
        }

        public Criteria andIsMergerNotEqualTo(java.lang.String value) {
            addCriterion("is_merger <>", value, "isMerger");
            return (Criteria) this;
        }

        public Criteria andIsMergerGreaterThan(java.lang.String value) {
            addCriterion("is_merger >", value, "isMerger");
            return (Criteria) this;
        }

        public Criteria andIsMergerGreaterThanOrEqualTo(java.lang.String value) {
            addCriterion("is_merger >=", value, "is_merger");
            return (Criteria) this;
        }

        public Criteria andIsMergerLessThan(java.lang.String value) {
            addCriterion("is_merger <", value, "isMerger");
            return (Criteria) this;
        }

        public Criteria andIsMergerLessThanOrEqualTo(java.lang.String value) {
            addCriterion("is_merger <=", value, "isMerger");
            return (Criteria) this;
        }


        public Criteria andIsMergerIn(List<java.lang.String > values) {
            addCriterion("is_merger in", values, "isMerger");
            return (Criteria) this;
        }

        public Criteria andIsMergerNotIn(List<java.lang.String> values) {
            addCriterion("is_merger not in", values, "isMerger");
            return (Criteria) this;
        }

        public Criteria andIsMergerBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("is_merger between", value1, value2, "isMerger");
            return (Criteria) this;
        }

        public Criteria andIsMergerNotBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("is_merger not between", value1, value2, "isMerger");
            return (Criteria) this;
        }



        public Criteria andInvoicePriceCoefficientIsNull() {
            addCriterion("invoicePriceCoefficient is null");
            return (Criteria) this;
        }


        public Criteria andInvoicePriceCoefficientIsNotNull() {
            addCriterion("invoicePriceCoefficient is not null");
            return (Criteria) this;
        }

        public Criteria andInvoicePriceCoefficientEqualTo(BigDecimal value) {
            addCriterion("invoice_price_coefficient =", value, "invoicePriceCoefficient");
            return (Criteria) this;
        }

        public Criteria andInvoicePriceCoefficientNotEqualTo(BigDecimal value) {
            addCriterion("invoice_price_coefficient <>", value, "invoicePriceCoefficient");
            return (Criteria) this;
        }

        public Criteria andInvoicePriceCoefficientGreaterThan(BigDecimal value) {
            addCriterion("invoice_price_coefficient >", value, "invoicePriceCoefficient");
            return (Criteria) this;
        }

        public Criteria andInvoicePriceCoefficientGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("invoice_price_coefficient >=", value, "invoice_price_coefficient");
            return (Criteria) this;
        }

        public Criteria andInvoicePriceCoefficientLessThan(BigDecimal value) {
            addCriterion("invoice_price_coefficient <", value, "invoicePriceCoefficient");
            return (Criteria) this;
        }

        public Criteria andInvoicePriceCoefficientLessThanOrEqualTo(BigDecimal value) {
            addCriterion("invoice_price_coefficient <=", value, "invoicePriceCoefficient");
            return (Criteria) this;
        }


        public Criteria andInvoicePriceCoefficientIn(List<BigDecimal > values) {
            addCriterion("invoice_price_coefficient in", values, "invoicePriceCoefficient");
            return (Criteria) this;
        }

        public Criteria andInvoicePriceCoefficientNotIn(List<BigDecimal> values) {
            addCriterion("invoice_price_coefficient not in", values, "invoicePriceCoefficient");
            return (Criteria) this;
        }

        public Criteria andInvoicePriceCoefficientBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("invoice_price_coefficient between", value1, value2, "invoicePriceCoefficient");
            return (Criteria) this;
        }

        public Criteria andInvoicePriceCoefficientNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("invoice_price_coefficient not between", value1, value2, "invoicePriceCoefficient");
            return (Criteria) this;
        }



        public Criteria andCustomPriceCoefficientIsNull() {
            addCriterion("customPriceCoefficient is null");
            return (Criteria) this;
        }


        public Criteria andCustomPriceCoefficientIsNotNull() {
            addCriterion("customPriceCoefficient is not null");
            return (Criteria) this;
        }

        public Criteria andCustomPriceCoefficientEqualTo(BigDecimal value) {
            addCriterion("custom_price_coefficient =", value, "customPriceCoefficient");
            return (Criteria) this;
        }

        public Criteria andCustomPriceCoefficientNotEqualTo(BigDecimal value) {
            addCriterion("custom_price_coefficient <>", value, "customPriceCoefficient");
            return (Criteria) this;
        }

        public Criteria andCustomPriceCoefficientGreaterThan(BigDecimal value) {
            addCriterion("custom_price_coefficient >", value, "customPriceCoefficient");
            return (Criteria) this;
        }

        public Criteria andCustomPriceCoefficientGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("custom_price_coefficient >=", value, "custom_price_coefficient");
            return (Criteria) this;
        }

        public Criteria andCustomPriceCoefficientLessThan(BigDecimal value) {
            addCriterion("custom_price_coefficient <", value, "customPriceCoefficient");
            return (Criteria) this;
        }

        public Criteria andCustomPriceCoefficientLessThanOrEqualTo(BigDecimal value) {
            addCriterion("custom_price_coefficient <=", value, "customPriceCoefficient");
            return (Criteria) this;
        }


        public Criteria andCustomPriceCoefficientIn(List<BigDecimal > values) {
            addCriterion("custom_price_coefficient in", values, "customPriceCoefficient");
            return (Criteria) this;
        }

        public Criteria andCustomPriceCoefficientNotIn(List<BigDecimal> values) {
            addCriterion("custom_price_coefficient not in", values, "customPriceCoefficient");
            return (Criteria) this;
        }

        public Criteria andCustomPriceCoefficientBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("custom_price_coefficient between", value1, value2, "customPriceCoefficient");
            return (Criteria) this;
        }

        public Criteria andCustomPriceCoefficientNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("custom_price_coefficient not between", value1, value2, "customPriceCoefficient");
            return (Criteria) this;
        }



        public Criteria andCiPriceCoefficientIsNull() {
            addCriterion("ciPriceCoefficient is null");
            return (Criteria) this;
        }


        public Criteria andCiPriceCoefficientIsNotNull() {
            addCriterion("ciPriceCoefficient is not null");
            return (Criteria) this;
        }

        public Criteria andCiPriceCoefficientEqualTo(BigDecimal value) {
            addCriterion("ci_price_coefficient =", value, "ciPriceCoefficient");
            return (Criteria) this;
        }

        public Criteria andCiPriceCoefficientNotEqualTo(BigDecimal value) {
            addCriterion("ci_price_coefficient <>", value, "ciPriceCoefficient");
            return (Criteria) this;
        }

        public Criteria andCiPriceCoefficientGreaterThan(BigDecimal value) {
            addCriterion("ci_price_coefficient >", value, "ciPriceCoefficient");
            return (Criteria) this;
        }

        public Criteria andCiPriceCoefficientGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ci_price_coefficient >=", value, "ci_price_coefficient");
            return (Criteria) this;
        }

        public Criteria andCiPriceCoefficientLessThan(BigDecimal value) {
            addCriterion("ci_price_coefficient <", value, "ciPriceCoefficient");
            return (Criteria) this;
        }

        public Criteria andCiPriceCoefficientLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ci_price_coefficient <=", value, "ciPriceCoefficient");
            return (Criteria) this;
        }


        public Criteria andCiPriceCoefficientIn(List<BigDecimal > values) {
            addCriterion("ci_price_coefficient in", values, "ciPriceCoefficient");
            return (Criteria) this;
        }

        public Criteria andCiPriceCoefficientNotIn(List<BigDecimal> values) {
            addCriterion("ci_price_coefficient not in", values, "ciPriceCoefficient");
            return (Criteria) this;
        }

        public Criteria andCiPriceCoefficientBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ci_price_coefficient between", value1, value2, "ciPriceCoefficient");
            return (Criteria) this;
        }

        public Criteria andCiPriceCoefficientNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ci_price_coefficient not between", value1, value2, "ciPriceCoefficient");
            return (Criteria) this;
        }



        public Criteria andWhCountryZoneIsNull() {
            addCriterion("whCountryZone is null");
            return (Criteria) this;
        }


        public Criteria andWhCountryZoneIsNotNull() {
            addCriterion("whCountryZone is not null");
            return (Criteria) this;
        }

        public Criteria andWhCountryZoneEqualTo(java.lang.String value) {
            addCriterion("wh_country_zone =", value, "whCountryZone");
            return (Criteria) this;
        }

        public Criteria andWhCountryZoneNotEqualTo(java.lang.String value) {
            addCriterion("wh_country_zone <>", value, "whCountryZone");
            return (Criteria) this;
        }

        public Criteria andWhCountryZoneGreaterThan(java.lang.String value) {
            addCriterion("wh_country_zone >", value, "whCountryZone");
            return (Criteria) this;
        }

        public Criteria andWhCountryZoneGreaterThanOrEqualTo(java.lang.String value) {
            addCriterion("wh_country_zone >=", value, "wh_country_zone");
            return (Criteria) this;
        }

        public Criteria andWhCountryZoneLessThan(java.lang.String value) {
            addCriterion("wh_country_zone <", value, "whCountryZone");
            return (Criteria) this;
        }

        public Criteria andWhCountryZoneLessThanOrEqualTo(java.lang.String value) {
            addCriterion("wh_country_zone <=", value, "whCountryZone");
            return (Criteria) this;
        }


        public Criteria andWhCountryZoneIn(List<java.lang.String > values) {
            addCriterion("wh_country_zone in", values, "whCountryZone");
            return (Criteria) this;
        }

        public Criteria andWhCountryZoneNotIn(List<java.lang.String> values) {
            addCriterion("wh_country_zone not in", values, "whCountryZone");
            return (Criteria) this;
        }

        public Criteria andWhCountryZoneBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("wh_country_zone between", value1, value2, "whCountryZone");
            return (Criteria) this;
        }

        public Criteria andWhCountryZoneNotBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("wh_country_zone not between", value1, value2, "whCountryZone");
            return (Criteria) this;
        }



        public Criteria andWh3rdIsNull() {
            addCriterion("wh3rd is null");
            return (Criteria) this;
        }


        public Criteria andWh3rdIsNotNull() {
            addCriterion("wh3rd is not null");
            return (Criteria) this;
        }

        public Criteria andWh3rdEqualTo(java.lang.Integer value) {
            addCriterion("wh_3rd =", value, "wh3rd");
            return (Criteria) this;
        }

        public Criteria andWh3rdNotEqualTo(java.lang.Integer value) {
            addCriterion("wh_3rd <>", value, "wh3rd");
            return (Criteria) this;
        }

        public Criteria andWh3rdGreaterThan(java.lang.Integer value) {
            addCriterion("wh_3rd >", value, "wh3rd");
            return (Criteria) this;
        }

        public Criteria andWh3rdGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("wh_3rd >=", value, "wh_3rd");
            return (Criteria) this;
        }

        public Criteria andWh3rdLessThan(java.lang.Integer value) {
            addCriterion("wh_3rd <", value, "wh3rd");
            return (Criteria) this;
        }

        public Criteria andWh3rdLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("wh_3rd <=", value, "wh3rd");
            return (Criteria) this;
        }


        public Criteria andWh3rdIn(List<java.lang.Integer > values) {
            addCriterion("wh_3rd in", values, "wh3rd");
            return (Criteria) this;
        }

        public Criteria andWh3rdNotIn(List<java.lang.Integer> values) {
            addCriterion("wh_3rd not in", values, "wh3rd");
            return (Criteria) this;
        }

        public Criteria andWh3rdBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("wh_3rd between", value1, value2, "wh3rd");
            return (Criteria) this;
        }

        public Criteria andWh3rdNotBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("wh_3rd not between", value1, value2, "wh3rd");
            return (Criteria) this;
        }



        public Criteria andIstaxIsNull() {
            addCriterion("istax is null");
            return (Criteria) this;
        }


        public Criteria andIstaxIsNotNull() {
            addCriterion("istax is not null");
            return (Criteria) this;
        }

        public Criteria andIstaxEqualTo(java.lang.Integer value) {
            addCriterion("istax =", value, "istax");
            return (Criteria) this;
        }

        public Criteria andIstaxNotEqualTo(java.lang.Integer value) {
            addCriterion("istax <>", value, "istax");
            return (Criteria) this;
        }

        public Criteria andIstaxGreaterThan(java.lang.Integer value) {
            addCriterion("istax >", value, "istax");
            return (Criteria) this;
        }

        public Criteria andIstaxGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("istax >=", value, "istax");
            return (Criteria) this;
        }

        public Criteria andIstaxLessThan(java.lang.Integer value) {
            addCriterion("istax <", value, "istax");
            return (Criteria) this;
        }

        public Criteria andIstaxLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("istax <=", value, "istax");
            return (Criteria) this;
        }


        public Criteria andIstaxIn(List<java.lang.Integer > values) {
            addCriterion("istax in", values, "istax");
            return (Criteria) this;
        }

        public Criteria andIstaxNotIn(List<java.lang.Integer> values) {
            addCriterion("istax not in", values, "istax");
            return (Criteria) this;
        }

        public Criteria andIstaxBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("istax between", value1, value2, "istax");
            return (Criteria) this;
        }

        public Criteria andIstaxNotBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("istax not between", value1, value2, "istax");
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