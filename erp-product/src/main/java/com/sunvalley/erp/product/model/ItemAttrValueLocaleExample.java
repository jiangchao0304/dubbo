package com.sunvalley.erp.product.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.math.BigDecimal;

/**
* @Description: ItemAttrValueLocaleExample
* @author
* @date 2017-10-12 04:22:22
*/
public class ItemAttrValueLocaleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private int pageIndex;

    private int pageSize;

    public ItemAttrValueLocaleExample() {
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

    public ItemAttrValueLocaleExample(int pageSize, int pageIndex) {
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



        public Criteria andRowflagIsNull() {
            addCriterion("rowflag is null");
            return (Criteria) this;
        }


        public Criteria andRowflagIsNotNull() {
            addCriterion("rowflag is not null");
            return (Criteria) this;
        }

        public Criteria andRowflagEqualTo(Integer value) {
            addCriterion("rowflag =", value, "rowflag");
            return (Criteria) this;
        }

        public Criteria andRowflagNotEqualTo(Integer value) {
            addCriterion("rowflag <>", value, "rowflag");
            return (Criteria) this;
        }

        public Criteria andRowflagGreaterThan(Integer value) {
            addCriterion("rowflag >", value, "rowflag");
            return (Criteria) this;
        }

        public Criteria andRowflagGreaterThanOrEqualTo(Integer value) {
            addCriterion("rowflag >=", value, "rowflag");
            return (Criteria) this;
        }

        public Criteria andRowflagLessThan(Integer value) {
            addCriterion("rowflag <", value, "rowflag");
            return (Criteria) this;
        }

        public Criteria andRowflagLessThanOrEqualTo(Integer value) {
            addCriterion("rowflag <=", value, "rowflag");
            return (Criteria) this;
        }


        public Criteria andRowflagIn(List<Integer > values) {
            addCriterion("rowflag in", values, "rowflag");
            return (Criteria) this;
        }

        public Criteria andRowflagNotIn(List<Integer> values) {
            addCriterion("rowflag not in", values, "rowflag");
            return (Criteria) this;
        }

        public Criteria andRowflagBetween(Integer value1, Integer value2) {
            addCriterion("rowflag between", value1, value2, "rowflag");
            return (Criteria) this;
        }

        public Criteria andRowflagNotBetween(Integer value1, Integer value2) {
            addCriterion("rowflag not between", value1, value2, "rowflag");
            return (Criteria) this;
        }



        public Criteria andFa01IsNull() {
            addCriterion("fa01 is null");
            return (Criteria) this;
        }


        public Criteria andFa01IsNotNull() {
            addCriterion("fa01 is not null");
            return (Criteria) this;
        }

        public Criteria andFa01EqualTo(java.lang.String value) {
            addCriterion("fa01 =", value, "fa01");
            return (Criteria) this;
        }

        public Criteria andFa01NotEqualTo(java.lang.String value) {
            addCriterion("fa01 <>", value, "fa01");
            return (Criteria) this;
        }

        public Criteria andFa01GreaterThan(java.lang.String value) {
            addCriterion("fa01 >", value, "fa01");
            return (Criteria) this;
        }

        public Criteria andFa01GreaterThanOrEqualTo(java.lang.String value) {
            addCriterion("fa01 >=", value, "fa01");
            return (Criteria) this;
        }

        public Criteria andFa01LessThan(java.lang.String value) {
            addCriterion("fa01 <", value, "fa01");
            return (Criteria) this;
        }

        public Criteria andFa01LessThanOrEqualTo(java.lang.String value) {
            addCriterion("fa01 <=", value, "fa01");
            return (Criteria) this;
        }


        public Criteria andFa01In(List<java.lang.String > values) {
            addCriterion("fa01 in", values, "fa01");
            return (Criteria) this;
        }

        public Criteria andFa01NotIn(List<java.lang.String> values) {
            addCriterion("fa01 not in", values, "fa01");
            return (Criteria) this;
        }

        public Criteria andFa01Between(java.lang.String value1, java.lang.String value2) {
            addCriterion("fa01 between", value1, value2, "fa01");
            return (Criteria) this;
        }

        public Criteria andFa01NotBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("fa01 not between", value1, value2, "fa01");
            return (Criteria) this;
        }



        public Criteria andFa02IsNull() {
            addCriterion("fa02 is null");
            return (Criteria) this;
        }


        public Criteria andFa02IsNotNull() {
            addCriterion("fa02 is not null");
            return (Criteria) this;
        }

        public Criteria andFa02EqualTo(java.lang.String value) {
            addCriterion("fa02 =", value, "fa02");
            return (Criteria) this;
        }

        public Criteria andFa02NotEqualTo(java.lang.String value) {
            addCriterion("fa02 <>", value, "fa02");
            return (Criteria) this;
        }

        public Criteria andFa02GreaterThan(java.lang.String value) {
            addCriterion("fa02 >", value, "fa02");
            return (Criteria) this;
        }

        public Criteria andFa02GreaterThanOrEqualTo(java.lang.String value) {
            addCriterion("fa02 >=", value, "fa02");
            return (Criteria) this;
        }

        public Criteria andFa02LessThan(java.lang.String value) {
            addCriterion("fa02 <", value, "fa02");
            return (Criteria) this;
        }

        public Criteria andFa02LessThanOrEqualTo(java.lang.String value) {
            addCriterion("fa02 <=", value, "fa02");
            return (Criteria) this;
        }


        public Criteria andFa02In(List<java.lang.String > values) {
            addCriterion("fa02 in", values, "fa02");
            return (Criteria) this;
        }

        public Criteria andFa02NotIn(List<java.lang.String> values) {
            addCriterion("fa02 not in", values, "fa02");
            return (Criteria) this;
        }

        public Criteria andFa02Between(java.lang.String value1, java.lang.String value2) {
            addCriterion("fa02 between", value1, value2, "fa02");
            return (Criteria) this;
        }

        public Criteria andFa02NotBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("fa02 not between", value1, value2, "fa02");
            return (Criteria) this;
        }



        public Criteria andFa03IsNull() {
            addCriterion("fa03 is null");
            return (Criteria) this;
        }


        public Criteria andFa03IsNotNull() {
            addCriterion("fa03 is not null");
            return (Criteria) this;
        }

        public Criteria andFa03EqualTo(java.lang.String value) {
            addCriterion("fa03 =", value, "fa03");
            return (Criteria) this;
        }

        public Criteria andFa03NotEqualTo(java.lang.String value) {
            addCriterion("fa03 <>", value, "fa03");
            return (Criteria) this;
        }

        public Criteria andFa03GreaterThan(java.lang.String value) {
            addCriterion("fa03 >", value, "fa03");
            return (Criteria) this;
        }

        public Criteria andFa03GreaterThanOrEqualTo(java.lang.String value) {
            addCriterion("fa03 >=", value, "fa03");
            return (Criteria) this;
        }

        public Criteria andFa03LessThan(java.lang.String value) {
            addCriterion("fa03 <", value, "fa03");
            return (Criteria) this;
        }

        public Criteria andFa03LessThanOrEqualTo(java.lang.String value) {
            addCriterion("fa03 <=", value, "fa03");
            return (Criteria) this;
        }


        public Criteria andFa03In(List<java.lang.String > values) {
            addCriterion("fa03 in", values, "fa03");
            return (Criteria) this;
        }

        public Criteria andFa03NotIn(List<java.lang.String> values) {
            addCriterion("fa03 not in", values, "fa03");
            return (Criteria) this;
        }

        public Criteria andFa03Between(java.lang.String value1, java.lang.String value2) {
            addCriterion("fa03 between", value1, value2, "fa03");
            return (Criteria) this;
        }

        public Criteria andFa03NotBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("fa03 not between", value1, value2, "fa03");
            return (Criteria) this;
        }



        public Criteria andFa04IsNull() {
            addCriterion("fa04 is null");
            return (Criteria) this;
        }


        public Criteria andFa04IsNotNull() {
            addCriterion("fa04 is not null");
            return (Criteria) this;
        }

        public Criteria andFa04EqualTo(java.lang.String value) {
            addCriterion("fa04 =", value, "fa04");
            return (Criteria) this;
        }

        public Criteria andFa04NotEqualTo(java.lang.String value) {
            addCriterion("fa04 <>", value, "fa04");
            return (Criteria) this;
        }

        public Criteria andFa04GreaterThan(java.lang.String value) {
            addCriterion("fa04 >", value, "fa04");
            return (Criteria) this;
        }

        public Criteria andFa04GreaterThanOrEqualTo(java.lang.String value) {
            addCriterion("fa04 >=", value, "fa04");
            return (Criteria) this;
        }

        public Criteria andFa04LessThan(java.lang.String value) {
            addCriterion("fa04 <", value, "fa04");
            return (Criteria) this;
        }

        public Criteria andFa04LessThanOrEqualTo(java.lang.String value) {
            addCriterion("fa04 <=", value, "fa04");
            return (Criteria) this;
        }


        public Criteria andFa04In(List<java.lang.String > values) {
            addCriterion("fa04 in", values, "fa04");
            return (Criteria) this;
        }

        public Criteria andFa04NotIn(List<java.lang.String> values) {
            addCriterion("fa04 not in", values, "fa04");
            return (Criteria) this;
        }

        public Criteria andFa04Between(java.lang.String value1, java.lang.String value2) {
            addCriterion("fa04 between", value1, value2, "fa04");
            return (Criteria) this;
        }

        public Criteria andFa04NotBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("fa04 not between", value1, value2, "fa04");
            return (Criteria) this;
        }



        public Criteria andFa05IsNull() {
            addCriterion("fa05 is null");
            return (Criteria) this;
        }


        public Criteria andFa05IsNotNull() {
            addCriterion("fa05 is not null");
            return (Criteria) this;
        }

        public Criteria andFa05EqualTo(java.lang.String value) {
            addCriterion("fa05 =", value, "fa05");
            return (Criteria) this;
        }

        public Criteria andFa05NotEqualTo(java.lang.String value) {
            addCriterion("fa05 <>", value, "fa05");
            return (Criteria) this;
        }

        public Criteria andFa05GreaterThan(java.lang.String value) {
            addCriterion("fa05 >", value, "fa05");
            return (Criteria) this;
        }

        public Criteria andFa05GreaterThanOrEqualTo(java.lang.String value) {
            addCriterion("fa05 >=", value, "fa05");
            return (Criteria) this;
        }

        public Criteria andFa05LessThan(java.lang.String value) {
            addCriterion("fa05 <", value, "fa05");
            return (Criteria) this;
        }

        public Criteria andFa05LessThanOrEqualTo(java.lang.String value) {
            addCriterion("fa05 <=", value, "fa05");
            return (Criteria) this;
        }


        public Criteria andFa05In(List<java.lang.String > values) {
            addCriterion("fa05 in", values, "fa05");
            return (Criteria) this;
        }

        public Criteria andFa05NotIn(List<java.lang.String> values) {
            addCriterion("fa05 not in", values, "fa05");
            return (Criteria) this;
        }

        public Criteria andFa05Between(java.lang.String value1, java.lang.String value2) {
            addCriterion("fa05 between", value1, value2, "fa05");
            return (Criteria) this;
        }

        public Criteria andFa05NotBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("fa05 not between", value1, value2, "fa05");
            return (Criteria) this;
        }



        public Criteria andFa06IsNull() {
            addCriterion("fa06 is null");
            return (Criteria) this;
        }


        public Criteria andFa06IsNotNull() {
            addCriterion("fa06 is not null");
            return (Criteria) this;
        }

        public Criteria andFa06EqualTo(java.lang.String value) {
            addCriterion("fa06 =", value, "fa06");
            return (Criteria) this;
        }

        public Criteria andFa06NotEqualTo(java.lang.String value) {
            addCriterion("fa06 <>", value, "fa06");
            return (Criteria) this;
        }

        public Criteria andFa06GreaterThan(java.lang.String value) {
            addCriterion("fa06 >", value, "fa06");
            return (Criteria) this;
        }

        public Criteria andFa06GreaterThanOrEqualTo(java.lang.String value) {
            addCriterion("fa06 >=", value, "fa06");
            return (Criteria) this;
        }

        public Criteria andFa06LessThan(java.lang.String value) {
            addCriterion("fa06 <", value, "fa06");
            return (Criteria) this;
        }

        public Criteria andFa06LessThanOrEqualTo(java.lang.String value) {
            addCriterion("fa06 <=", value, "fa06");
            return (Criteria) this;
        }


        public Criteria andFa06In(List<java.lang.String > values) {
            addCriterion("fa06 in", values, "fa06");
            return (Criteria) this;
        }

        public Criteria andFa06NotIn(List<java.lang.String> values) {
            addCriterion("fa06 not in", values, "fa06");
            return (Criteria) this;
        }

        public Criteria andFa06Between(java.lang.String value1, java.lang.String value2) {
            addCriterion("fa06 between", value1, value2, "fa06");
            return (Criteria) this;
        }

        public Criteria andFa06NotBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("fa06 not between", value1, value2, "fa06");
            return (Criteria) this;
        }



        public Criteria andFa07IsNull() {
            addCriterion("fa07 is null");
            return (Criteria) this;
        }


        public Criteria andFa07IsNotNull() {
            addCriterion("fa07 is not null");
            return (Criteria) this;
        }

        public Criteria andFa07EqualTo(java.lang.String value) {
            addCriterion("fa07 =", value, "fa07");
            return (Criteria) this;
        }

        public Criteria andFa07NotEqualTo(java.lang.String value) {
            addCriterion("fa07 <>", value, "fa07");
            return (Criteria) this;
        }

        public Criteria andFa07GreaterThan(java.lang.String value) {
            addCriterion("fa07 >", value, "fa07");
            return (Criteria) this;
        }

        public Criteria andFa07GreaterThanOrEqualTo(java.lang.String value) {
            addCriterion("fa07 >=", value, "fa07");
            return (Criteria) this;
        }

        public Criteria andFa07LessThan(java.lang.String value) {
            addCriterion("fa07 <", value, "fa07");
            return (Criteria) this;
        }

        public Criteria andFa07LessThanOrEqualTo(java.lang.String value) {
            addCriterion("fa07 <=", value, "fa07");
            return (Criteria) this;
        }


        public Criteria andFa07In(List<java.lang.String > values) {
            addCriterion("fa07 in", values, "fa07");
            return (Criteria) this;
        }

        public Criteria andFa07NotIn(List<java.lang.String> values) {
            addCriterion("fa07 not in", values, "fa07");
            return (Criteria) this;
        }

        public Criteria andFa07Between(java.lang.String value1, java.lang.String value2) {
            addCriterion("fa07 between", value1, value2, "fa07");
            return (Criteria) this;
        }

        public Criteria andFa07NotBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("fa07 not between", value1, value2, "fa07");
            return (Criteria) this;
        }



        public Criteria andFa08IsNull() {
            addCriterion("fa08 is null");
            return (Criteria) this;
        }


        public Criteria andFa08IsNotNull() {
            addCriterion("fa08 is not null");
            return (Criteria) this;
        }

        public Criteria andFa08EqualTo(java.lang.String value) {
            addCriterion("fa08 =", value, "fa08");
            return (Criteria) this;
        }

        public Criteria andFa08NotEqualTo(java.lang.String value) {
            addCriterion("fa08 <>", value, "fa08");
            return (Criteria) this;
        }

        public Criteria andFa08GreaterThan(java.lang.String value) {
            addCriterion("fa08 >", value, "fa08");
            return (Criteria) this;
        }

        public Criteria andFa08GreaterThanOrEqualTo(java.lang.String value) {
            addCriterion("fa08 >=", value, "fa08");
            return (Criteria) this;
        }

        public Criteria andFa08LessThan(java.lang.String value) {
            addCriterion("fa08 <", value, "fa08");
            return (Criteria) this;
        }

        public Criteria andFa08LessThanOrEqualTo(java.lang.String value) {
            addCriterion("fa08 <=", value, "fa08");
            return (Criteria) this;
        }


        public Criteria andFa08In(List<java.lang.String > values) {
            addCriterion("fa08 in", values, "fa08");
            return (Criteria) this;
        }

        public Criteria andFa08NotIn(List<java.lang.String> values) {
            addCriterion("fa08 not in", values, "fa08");
            return (Criteria) this;
        }

        public Criteria andFa08Between(java.lang.String value1, java.lang.String value2) {
            addCriterion("fa08 between", value1, value2, "fa08");
            return (Criteria) this;
        }

        public Criteria andFa08NotBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("fa08 not between", value1, value2, "fa08");
            return (Criteria) this;
        }



        public Criteria andFa09IsNull() {
            addCriterion("fa09 is null");
            return (Criteria) this;
        }


        public Criteria andFa09IsNotNull() {
            addCriterion("fa09 is not null");
            return (Criteria) this;
        }

        public Criteria andFa09EqualTo(java.lang.String value) {
            addCriterion("fa09 =", value, "fa09");
            return (Criteria) this;
        }

        public Criteria andFa09NotEqualTo(java.lang.String value) {
            addCriterion("fa09 <>", value, "fa09");
            return (Criteria) this;
        }

        public Criteria andFa09GreaterThan(java.lang.String value) {
            addCriterion("fa09 >", value, "fa09");
            return (Criteria) this;
        }

        public Criteria andFa09GreaterThanOrEqualTo(java.lang.String value) {
            addCriterion("fa09 >=", value, "fa09");
            return (Criteria) this;
        }

        public Criteria andFa09LessThan(java.lang.String value) {
            addCriterion("fa09 <", value, "fa09");
            return (Criteria) this;
        }

        public Criteria andFa09LessThanOrEqualTo(java.lang.String value) {
            addCriterion("fa09 <=", value, "fa09");
            return (Criteria) this;
        }


        public Criteria andFa09In(List<java.lang.String > values) {
            addCriterion("fa09 in", values, "fa09");
            return (Criteria) this;
        }

        public Criteria andFa09NotIn(List<java.lang.String> values) {
            addCriterion("fa09 not in", values, "fa09");
            return (Criteria) this;
        }

        public Criteria andFa09Between(java.lang.String value1, java.lang.String value2) {
            addCriterion("fa09 between", value1, value2, "fa09");
            return (Criteria) this;
        }

        public Criteria andFa09NotBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("fa09 not between", value1, value2, "fa09");
            return (Criteria) this;
        }



        public Criteria andFa10IsNull() {
            addCriterion("fa10 is null");
            return (Criteria) this;
        }


        public Criteria andFa10IsNotNull() {
            addCriterion("fa10 is not null");
            return (Criteria) this;
        }

        public Criteria andFa10EqualTo(java.lang.String value) {
            addCriterion("fa10 =", value, "fa10");
            return (Criteria) this;
        }

        public Criteria andFa10NotEqualTo(java.lang.String value) {
            addCriterion("fa10 <>", value, "fa10");
            return (Criteria) this;
        }

        public Criteria andFa10GreaterThan(java.lang.String value) {
            addCriterion("fa10 >", value, "fa10");
            return (Criteria) this;
        }

        public Criteria andFa10GreaterThanOrEqualTo(java.lang.String value) {
            addCriterion("fa10 >=", value, "fa10");
            return (Criteria) this;
        }

        public Criteria andFa10LessThan(java.lang.String value) {
            addCriterion("fa10 <", value, "fa10");
            return (Criteria) this;
        }

        public Criteria andFa10LessThanOrEqualTo(java.lang.String value) {
            addCriterion("fa10 <=", value, "fa10");
            return (Criteria) this;
        }


        public Criteria andFa10In(List<java.lang.String > values) {
            addCriterion("fa10 in", values, "fa10");
            return (Criteria) this;
        }

        public Criteria andFa10NotIn(List<java.lang.String> values) {
            addCriterion("fa10 not in", values, "fa10");
            return (Criteria) this;
        }

        public Criteria andFa10Between(java.lang.String value1, java.lang.String value2) {
            addCriterion("fa10 between", value1, value2, "fa10");
            return (Criteria) this;
        }

        public Criteria andFa10NotBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("fa10 not between", value1, value2, "fa10");
            return (Criteria) this;
        }



        public Criteria andFa11IsNull() {
            addCriterion("fa11 is null");
            return (Criteria) this;
        }


        public Criteria andFa11IsNotNull() {
            addCriterion("fa11 is not null");
            return (Criteria) this;
        }

        public Criteria andFa11EqualTo(java.lang.String value) {
            addCriterion("fa11 =", value, "fa11");
            return (Criteria) this;
        }

        public Criteria andFa11NotEqualTo(java.lang.String value) {
            addCriterion("fa11 <>", value, "fa11");
            return (Criteria) this;
        }

        public Criteria andFa11GreaterThan(java.lang.String value) {
            addCriterion("fa11 >", value, "fa11");
            return (Criteria) this;
        }

        public Criteria andFa11GreaterThanOrEqualTo(java.lang.String value) {
            addCriterion("fa11 >=", value, "fa11");
            return (Criteria) this;
        }

        public Criteria andFa11LessThan(java.lang.String value) {
            addCriterion("fa11 <", value, "fa11");
            return (Criteria) this;
        }

        public Criteria andFa11LessThanOrEqualTo(java.lang.String value) {
            addCriterion("fa11 <=", value, "fa11");
            return (Criteria) this;
        }


        public Criteria andFa11In(List<java.lang.String > values) {
            addCriterion("fa11 in", values, "fa11");
            return (Criteria) this;
        }

        public Criteria andFa11NotIn(List<java.lang.String> values) {
            addCriterion("fa11 not in", values, "fa11");
            return (Criteria) this;
        }

        public Criteria andFa11Between(java.lang.String value1, java.lang.String value2) {
            addCriterion("fa11 between", value1, value2, "fa11");
            return (Criteria) this;
        }

        public Criteria andFa11NotBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("fa11 not between", value1, value2, "fa11");
            return (Criteria) this;
        }



        public Criteria andFa12IsNull() {
            addCriterion("fa12 is null");
            return (Criteria) this;
        }


        public Criteria andFa12IsNotNull() {
            addCriterion("fa12 is not null");
            return (Criteria) this;
        }

        public Criteria andFa12EqualTo(java.lang.String value) {
            addCriterion("fa12 =", value, "fa12");
            return (Criteria) this;
        }

        public Criteria andFa12NotEqualTo(java.lang.String value) {
            addCriterion("fa12 <>", value, "fa12");
            return (Criteria) this;
        }

        public Criteria andFa12GreaterThan(java.lang.String value) {
            addCriterion("fa12 >", value, "fa12");
            return (Criteria) this;
        }

        public Criteria andFa12GreaterThanOrEqualTo(java.lang.String value) {
            addCriterion("fa12 >=", value, "fa12");
            return (Criteria) this;
        }

        public Criteria andFa12LessThan(java.lang.String value) {
            addCriterion("fa12 <", value, "fa12");
            return (Criteria) this;
        }

        public Criteria andFa12LessThanOrEqualTo(java.lang.String value) {
            addCriterion("fa12 <=", value, "fa12");
            return (Criteria) this;
        }


        public Criteria andFa12In(List<java.lang.String > values) {
            addCriterion("fa12 in", values, "fa12");
            return (Criteria) this;
        }

        public Criteria andFa12NotIn(List<java.lang.String> values) {
            addCriterion("fa12 not in", values, "fa12");
            return (Criteria) this;
        }

        public Criteria andFa12Between(java.lang.String value1, java.lang.String value2) {
            addCriterion("fa12 between", value1, value2, "fa12");
            return (Criteria) this;
        }

        public Criteria andFa12NotBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("fa12 not between", value1, value2, "fa12");
            return (Criteria) this;
        }



        public Criteria andFa13IsNull() {
            addCriterion("fa13 is null");
            return (Criteria) this;
        }


        public Criteria andFa13IsNotNull() {
            addCriterion("fa13 is not null");
            return (Criteria) this;
        }

        public Criteria andFa13EqualTo(java.lang.String value) {
            addCriterion("fa13 =", value, "fa13");
            return (Criteria) this;
        }

        public Criteria andFa13NotEqualTo(java.lang.String value) {
            addCriterion("fa13 <>", value, "fa13");
            return (Criteria) this;
        }

        public Criteria andFa13GreaterThan(java.lang.String value) {
            addCriterion("fa13 >", value, "fa13");
            return (Criteria) this;
        }

        public Criteria andFa13GreaterThanOrEqualTo(java.lang.String value) {
            addCriterion("fa13 >=", value, "fa13");
            return (Criteria) this;
        }

        public Criteria andFa13LessThan(java.lang.String value) {
            addCriterion("fa13 <", value, "fa13");
            return (Criteria) this;
        }

        public Criteria andFa13LessThanOrEqualTo(java.lang.String value) {
            addCriterion("fa13 <=", value, "fa13");
            return (Criteria) this;
        }


        public Criteria andFa13In(List<java.lang.String > values) {
            addCriterion("fa13 in", values, "fa13");
            return (Criteria) this;
        }

        public Criteria andFa13NotIn(List<java.lang.String> values) {
            addCriterion("fa13 not in", values, "fa13");
            return (Criteria) this;
        }

        public Criteria andFa13Between(java.lang.String value1, java.lang.String value2) {
            addCriterion("fa13 between", value1, value2, "fa13");
            return (Criteria) this;
        }

        public Criteria andFa13NotBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("fa13 not between", value1, value2, "fa13");
            return (Criteria) this;
        }



        public Criteria andFa14IsNull() {
            addCriterion("fa14 is null");
            return (Criteria) this;
        }


        public Criteria andFa14IsNotNull() {
            addCriterion("fa14 is not null");
            return (Criteria) this;
        }

        public Criteria andFa14EqualTo(java.lang.String value) {
            addCriterion("fa14 =", value, "fa14");
            return (Criteria) this;
        }

        public Criteria andFa14NotEqualTo(java.lang.String value) {
            addCriterion("fa14 <>", value, "fa14");
            return (Criteria) this;
        }

        public Criteria andFa14GreaterThan(java.lang.String value) {
            addCriterion("fa14 >", value, "fa14");
            return (Criteria) this;
        }

        public Criteria andFa14GreaterThanOrEqualTo(java.lang.String value) {
            addCriterion("fa14 >=", value, "fa14");
            return (Criteria) this;
        }

        public Criteria andFa14LessThan(java.lang.String value) {
            addCriterion("fa14 <", value, "fa14");
            return (Criteria) this;
        }

        public Criteria andFa14LessThanOrEqualTo(java.lang.String value) {
            addCriterion("fa14 <=", value, "fa14");
            return (Criteria) this;
        }


        public Criteria andFa14In(List<java.lang.String > values) {
            addCriterion("fa14 in", values, "fa14");
            return (Criteria) this;
        }

        public Criteria andFa14NotIn(List<java.lang.String> values) {
            addCriterion("fa14 not in", values, "fa14");
            return (Criteria) this;
        }

        public Criteria andFa14Between(java.lang.String value1, java.lang.String value2) {
            addCriterion("fa14 between", value1, value2, "fa14");
            return (Criteria) this;
        }

        public Criteria andFa14NotBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("fa14 not between", value1, value2, "fa14");
            return (Criteria) this;
        }



        public Criteria andFa15IsNull() {
            addCriterion("fa15 is null");
            return (Criteria) this;
        }


        public Criteria andFa15IsNotNull() {
            addCriterion("fa15 is not null");
            return (Criteria) this;
        }

        public Criteria andFa15EqualTo(java.lang.String value) {
            addCriterion("fa15 =", value, "fa15");
            return (Criteria) this;
        }

        public Criteria andFa15NotEqualTo(java.lang.String value) {
            addCriterion("fa15 <>", value, "fa15");
            return (Criteria) this;
        }

        public Criteria andFa15GreaterThan(java.lang.String value) {
            addCriterion("fa15 >", value, "fa15");
            return (Criteria) this;
        }

        public Criteria andFa15GreaterThanOrEqualTo(java.lang.String value) {
            addCriterion("fa15 >=", value, "fa15");
            return (Criteria) this;
        }

        public Criteria andFa15LessThan(java.lang.String value) {
            addCriterion("fa15 <", value, "fa15");
            return (Criteria) this;
        }

        public Criteria andFa15LessThanOrEqualTo(java.lang.String value) {
            addCriterion("fa15 <=", value, "fa15");
            return (Criteria) this;
        }


        public Criteria andFa15In(List<java.lang.String > values) {
            addCriterion("fa15 in", values, "fa15");
            return (Criteria) this;
        }

        public Criteria andFa15NotIn(List<java.lang.String> values) {
            addCriterion("fa15 not in", values, "fa15");
            return (Criteria) this;
        }

        public Criteria andFa15Between(java.lang.String value1, java.lang.String value2) {
            addCriterion("fa15 between", value1, value2, "fa15");
            return (Criteria) this;
        }

        public Criteria andFa15NotBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("fa15 not between", value1, value2, "fa15");
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