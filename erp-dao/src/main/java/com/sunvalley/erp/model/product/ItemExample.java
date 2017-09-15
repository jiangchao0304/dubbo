package com.sunvalley.erp.model.product;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private int pageIndex;

    private int pageSize;

    public ItemExample() {
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

    public ItemExample(int pageSize, int pageIndex) {
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



        public Criteria andLenIsNull() {
            addCriterion("len is null");
            return (Criteria) this;
        }


        public Criteria andLenIsNotNull() {
            addCriterion("len is not null");
            return (Criteria) this;
        }

        public Criteria andLenEqualTo(Integer value) {
            addCriterion("len =", value, "len");
            return (Criteria) this;
        }

        public Criteria andLenNotEqualTo(Integer value) {
            addCriterion("len <>", value, "len");
            return (Criteria) this;
        }

        public Criteria andLenGreaterThan(Integer value) {
            addCriterion("len >", value, "len");
            return (Criteria) this;
        }

        public Criteria andLenGreaterThanOrEqualTo(Integer value) {
            addCriterion("len >=", value, "len");
            return (Criteria) this;
        }

        public Criteria andLenLessThan(Integer value) {
            addCriterion("len <", value, "len");
            return (Criteria) this;
        }

        public Criteria andLenLessThanOrEqualTo(Integer value) {
            addCriterion("len <=", value, "len");
            return (Criteria) this;
        }


        public Criteria andLenIn(List<Integer > values) {
            addCriterion("len in", values, "len");
            return (Criteria) this;
        }

        public Criteria andLenNotIn(List<Integer> values) {
            addCriterion("len not in", values, "len");
            return (Criteria) this;
        }

        public Criteria andLenBetween(Integer value1, Integer value2) {
            addCriterion("len between", value1, value2, "len");
            return (Criteria) this;
        }

        public Criteria andLenNotBetween(Integer value1, Integer value2) {
            addCriterion("len not between", value1, value2, "len");
            return (Criteria) this;
        }



        public Criteria andWidthIsNull() {
            addCriterion("width is null");
            return (Criteria) this;
        }


        public Criteria andWidthIsNotNull() {
            addCriterion("width is not null");
            return (Criteria) this;
        }

        public Criteria andWidthEqualTo(Integer value) {
            addCriterion("width =", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthNotEqualTo(Integer value) {
            addCriterion("width <>", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthGreaterThan(Integer value) {
            addCriterion("width >", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthGreaterThanOrEqualTo(Integer value) {
            addCriterion("width >=", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthLessThan(Integer value) {
            addCriterion("width <", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthLessThanOrEqualTo(Integer value) {
            addCriterion("width <=", value, "width");
            return (Criteria) this;
        }


        public Criteria andWidthIn(List<Integer > values) {
            addCriterion("width in", values, "width");
            return (Criteria) this;
        }

        public Criteria andWidthNotIn(List<Integer> values) {
            addCriterion("width not in", values, "width");
            return (Criteria) this;
        }

        public Criteria andWidthBetween(Integer value1, Integer value2) {
            addCriterion("width between", value1, value2, "width");
            return (Criteria) this;
        }

        public Criteria andWidthNotBetween(Integer value1, Integer value2) {
            addCriterion("width not between", value1, value2, "width");
            return (Criteria) this;
        }



        public Criteria andHeightIsNull() {
            addCriterion("height is null");
            return (Criteria) this;
        }


        public Criteria andHeightIsNotNull() {
            addCriterion("height is not null");
            return (Criteria) this;
        }

        public Criteria andHeightEqualTo(Integer value) {
            addCriterion("height =", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotEqualTo(Integer value) {
            addCriterion("height <>", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThan(Integer value) {
            addCriterion("height >", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("height >=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThan(Integer value) {
            addCriterion("height <", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThanOrEqualTo(Integer value) {
            addCriterion("height <=", value, "height");
            return (Criteria) this;
        }


        public Criteria andHeightIn(List<Integer > values) {
            addCriterion("height in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotIn(List<Integer> values) {
            addCriterion("height not in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightBetween(Integer value1, Integer value2) {
            addCriterion("height between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotBetween(Integer value1, Integer value2) {
            addCriterion("height not between", value1, value2, "height");
            return (Criteria) this;
        }



        public Criteria andWeightIsNull() {
            addCriterion("weight is null");
            return (Criteria) this;
        }


        public Criteria andWeightIsNotNull() {
            addCriterion("weight is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(Integer value) {
            addCriterion("weight =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(Integer value) {
            addCriterion("weight <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(Integer value) {
            addCriterion("weight >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("weight >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(Integer value) {
            addCriterion("weight <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(Integer value) {
            addCriterion("weight <=", value, "weight");
            return (Criteria) this;
        }


        public Criteria andWeightIn(List<Integer > values) {
            addCriterion("weight in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<Integer> values) {
            addCriterion("weight not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(Integer value1, Integer value2) {
            addCriterion("weight between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(Integer value1, Integer value2) {
            addCriterion("weight not between", value1, value2, "weight");
            return (Criteria) this;
        }



        public Criteria andVolweightIsNull() {
            addCriterion("volweight is null");
            return (Criteria) this;
        }


        public Criteria andVolweightIsNotNull() {
            addCriterion("volweight is not null");
            return (Criteria) this;
        }

        public Criteria andVolweightEqualTo(Integer value) {
            addCriterion("volweight =", value, "volweight");
            return (Criteria) this;
        }

        public Criteria andVolweightNotEqualTo(Integer value) {
            addCriterion("volweight <>", value, "volweight");
            return (Criteria) this;
        }

        public Criteria andVolweightGreaterThan(Integer value) {
            addCriterion("volweight >", value, "volweight");
            return (Criteria) this;
        }

        public Criteria andVolweightGreaterThanOrEqualTo(Integer value) {
            addCriterion("volweight >=", value, "volweight");
            return (Criteria) this;
        }

        public Criteria andVolweightLessThan(Integer value) {
            addCriterion("volweight <", value, "volweight");
            return (Criteria) this;
        }

        public Criteria andVolweightLessThanOrEqualTo(Integer value) {
            addCriterion("volweight <=", value, "volweight");
            return (Criteria) this;
        }


        public Criteria andVolweightIn(List<Integer > values) {
            addCriterion("volweight in", values, "volweight");
            return (Criteria) this;
        }

        public Criteria andVolweightNotIn(List<Integer> values) {
            addCriterion("volweight not in", values, "volweight");
            return (Criteria) this;
        }

        public Criteria andVolweightBetween(Integer value1, Integer value2) {
            addCriterion("volweight between", value1, value2, "volweight");
            return (Criteria) this;
        }

        public Criteria andVolweightNotBetween(Integer value1, Integer value2) {
            addCriterion("volweight not between", value1, value2, "volweight");
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



        public Criteria andActiveIsNull() {
            addCriterion("active is null");
            return (Criteria) this;
        }


        public Criteria andActiveIsNotNull() {
            addCriterion("active is not null");
            return (Criteria) this;
        }

        public Criteria andActiveEqualTo(Integer value) {
            addCriterion("active =", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveNotEqualTo(Integer value) {
            addCriterion("active <>", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveGreaterThan(Integer value) {
            addCriterion("active >", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveGreaterThanOrEqualTo(Integer value) {
            addCriterion("active >=", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveLessThan(Integer value) {
            addCriterion("active <", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveLessThanOrEqualTo(Integer value) {
            addCriterion("active <=", value, "active");
            return (Criteria) this;
        }


        public Criteria andActiveIn(List<Integer > values) {
            addCriterion("active in", values, "active");
            return (Criteria) this;
        }

        public Criteria andActiveNotIn(List<Integer> values) {
            addCriterion("active not in", values, "active");
            return (Criteria) this;
        }

        public Criteria andActiveBetween(Integer value1, Integer value2) {
            addCriterion("active between", value1, value2, "active");
            return (Criteria) this;
        }

        public Criteria andActiveNotBetween(Integer value1, Integer value2) {
            addCriterion("active not between", value1, value2, "active");
            return (Criteria) this;
        }



        public Criteria andIsdropIsNull() {
            addCriterion("isdrop is null");
            return (Criteria) this;
        }


        public Criteria andIsdropIsNotNull() {
            addCriterion("isdrop is not null");
            return (Criteria) this;
        }

        public Criteria andIsdropEqualTo(java.lang.Boolean value) {
            addCriterion("isdrop =", value, "isdrop");
            return (Criteria) this;
        }

        public Criteria andIsdropNotEqualTo(java.lang.Boolean value) {
            addCriterion("isdrop <>", value, "isdrop");
            return (Criteria) this;
        }

        public Criteria andIsdropGreaterThan(java.lang.Boolean value) {
            addCriterion("isdrop >", value, "isdrop");
            return (Criteria) this;
        }

        public Criteria andIsdropGreaterThanOrEqualTo(java.lang.Boolean value) {
            addCriterion("isdrop >=", value, "isdrop");
            return (Criteria) this;
        }

        public Criteria andIsdropLessThan(java.lang.Boolean value) {
            addCriterion("isdrop <", value, "isdrop");
            return (Criteria) this;
        }

        public Criteria andIsdropLessThanOrEqualTo(java.lang.Boolean value) {
            addCriterion("isdrop <=", value, "isdrop");
            return (Criteria) this;
        }


        public Criteria andIsdropIn(List<java.lang.Boolean > values) {
            addCriterion("isdrop in", values, "isdrop");
            return (Criteria) this;
        }

        public Criteria andIsdropNotIn(List<java.lang.Boolean> values) {
            addCriterion("isdrop not in", values, "isdrop");
            return (Criteria) this;
        }

        public Criteria andIsdropBetween(java.lang.Boolean value1, java.lang.Boolean value2) {
            addCriterion("isdrop between", value1, value2, "isdrop");
            return (Criteria) this;
        }

        public Criteria andIsdropNotBetween(java.lang.Boolean value1, java.lang.Boolean value2) {
            addCriterion("isdrop not between", value1, value2, "isdrop");
            return (Criteria) this;
        }



        public Criteria andDropDefIsNull() {
            addCriterion("dropDef is null");
            return (Criteria) this;
        }


        public Criteria andDropDefIsNotNull() {
            addCriterion("dropDef is not null");
            return (Criteria) this;
        }

        public Criteria andDropDefEqualTo(java.lang.Boolean value) {
            addCriterion("drop_def =", value, "dropDef");
            return (Criteria) this;
        }

        public Criteria andDropDefNotEqualTo(java.lang.Boolean value) {
            addCriterion("drop_def <>", value, "dropDef");
            return (Criteria) this;
        }

        public Criteria andDropDefGreaterThan(java.lang.Boolean value) {
            addCriterion("drop_def >", value, "dropDef");
            return (Criteria) this;
        }

        public Criteria andDropDefGreaterThanOrEqualTo(java.lang.Boolean value) {
            addCriterion("drop_def >=", value, "drop_def");
            return (Criteria) this;
        }

        public Criteria andDropDefLessThan(java.lang.Boolean value) {
            addCriterion("drop_def <", value, "dropDef");
            return (Criteria) this;
        }

        public Criteria andDropDefLessThanOrEqualTo(java.lang.Boolean value) {
            addCriterion("drop_def <=", value, "dropDef");
            return (Criteria) this;
        }


        public Criteria andDropDefIn(List<java.lang.Boolean > values) {
            addCriterion("drop_def in", values, "dropDef");
            return (Criteria) this;
        }

        public Criteria andDropDefNotIn(List<java.lang.Boolean> values) {
            addCriterion("drop_def not in", values, "dropDef");
            return (Criteria) this;
        }

        public Criteria andDropDefBetween(java.lang.Boolean value1, java.lang.Boolean value2) {
            addCriterion("drop_def between", value1, value2, "dropDef");
            return (Criteria) this;
        }

        public Criteria andDropDefNotBetween(java.lang.Boolean value1, java.lang.Boolean value2) {
            addCriterion("drop_def not between", value1, value2, "dropDef");
            return (Criteria) this;
        }



        public Criteria andIsvirtualIsNull() {
            addCriterion("isvirtual is null");
            return (Criteria) this;
        }


        public Criteria andIsvirtualIsNotNull() {
            addCriterion("isvirtual is not null");
            return (Criteria) this;
        }

        public Criteria andIsvirtualEqualTo(Integer value) {
            addCriterion("isvirtual =", value, "isvirtual");
            return (Criteria) this;
        }

        public Criteria andIsvirtualNotEqualTo(Integer value) {
            addCriterion("isvirtual <>", value, "isvirtual");
            return (Criteria) this;
        }

        public Criteria andIsvirtualGreaterThan(Integer value) {
            addCriterion("isvirtual >", value, "isvirtual");
            return (Criteria) this;
        }

        public Criteria andIsvirtualGreaterThanOrEqualTo(Integer value) {
            addCriterion("isvirtual >=", value, "isvirtual");
            return (Criteria) this;
        }

        public Criteria andIsvirtualLessThan(Integer value) {
            addCriterion("isvirtual <", value, "isvirtual");
            return (Criteria) this;
        }

        public Criteria andIsvirtualLessThanOrEqualTo(Integer value) {
            addCriterion("isvirtual <=", value, "isvirtual");
            return (Criteria) this;
        }


        public Criteria andIsvirtualIn(List<Integer > values) {
            addCriterion("isvirtual in", values, "isvirtual");
            return (Criteria) this;
        }

        public Criteria andIsvirtualNotIn(List<Integer> values) {
            addCriterion("isvirtual not in", values, "isvirtual");
            return (Criteria) this;
        }

        public Criteria andIsvirtualBetween(Integer value1, Integer value2) {
            addCriterion("isvirtual between", value1, value2, "isvirtual");
            return (Criteria) this;
        }

        public Criteria andIsvirtualNotBetween(Integer value1, Integer value2) {
            addCriterion("isvirtual not between", value1, value2, "isvirtual");
            return (Criteria) this;
        }



        public Criteria andLineStateIsNull() {
            addCriterion("lineState is null");
            return (Criteria) this;
        }


        public Criteria andLineStateIsNotNull() {
            addCriterion("lineState is not null");
            return (Criteria) this;
        }

        public Criteria andLineStateEqualTo(Integer value) {
            addCriterion("line_state =", value, "lineState");
            return (Criteria) this;
        }

        public Criteria andLineStateNotEqualTo(Integer value) {
            addCriterion("line_state <>", value, "lineState");
            return (Criteria) this;
        }

        public Criteria andLineStateGreaterThan(Integer value) {
            addCriterion("line_state >", value, "lineState");
            return (Criteria) this;
        }

        public Criteria andLineStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("line_state >=", value, "line_state");
            return (Criteria) this;
        }

        public Criteria andLineStateLessThan(Integer value) {
            addCriterion("line_state <", value, "lineState");
            return (Criteria) this;
        }

        public Criteria andLineStateLessThanOrEqualTo(Integer value) {
            addCriterion("line_state <=", value, "lineState");
            return (Criteria) this;
        }


        public Criteria andLineStateIn(List<Integer > values) {
            addCriterion("line_state in", values, "lineState");
            return (Criteria) this;
        }

        public Criteria andLineStateNotIn(List<Integer> values) {
            addCriterion("line_state not in", values, "lineState");
            return (Criteria) this;
        }

        public Criteria andLineStateBetween(Integer value1, Integer value2) {
            addCriterion("line_state between", value1, value2, "lineState");
            return (Criteria) this;
        }

        public Criteria andLineStateNotBetween(Integer value1, Integer value2) {
            addCriterion("line_state not between", value1, value2, "lineState");
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



        public Criteria andIssaleIsNull() {
            addCriterion("issale is null");
            return (Criteria) this;
        }


        public Criteria andIssaleIsNotNull() {
            addCriterion("issale is not null");
            return (Criteria) this;
        }

        public Criteria andIssaleEqualTo(java.lang.Boolean value) {
            addCriterion("issale =", value, "issale");
            return (Criteria) this;
        }

        public Criteria andIssaleNotEqualTo(java.lang.Boolean value) {
            addCriterion("issale <>", value, "issale");
            return (Criteria) this;
        }

        public Criteria andIssaleGreaterThan(java.lang.Boolean value) {
            addCriterion("issale >", value, "issale");
            return (Criteria) this;
        }

        public Criteria andIssaleGreaterThanOrEqualTo(java.lang.Boolean value) {
            addCriterion("issale >=", value, "issale");
            return (Criteria) this;
        }

        public Criteria andIssaleLessThan(java.lang.Boolean value) {
            addCriterion("issale <", value, "issale");
            return (Criteria) this;
        }

        public Criteria andIssaleLessThanOrEqualTo(java.lang.Boolean value) {
            addCriterion("issale <=", value, "issale");
            return (Criteria) this;
        }


        public Criteria andIssaleIn(List<java.lang.Boolean > values) {
            addCriterion("issale in", values, "issale");
            return (Criteria) this;
        }

        public Criteria andIssaleNotIn(List<java.lang.Boolean> values) {
            addCriterion("issale not in", values, "issale");
            return (Criteria) this;
        }

        public Criteria andIssaleBetween(java.lang.Boolean value1, java.lang.Boolean value2) {
            addCriterion("issale between", value1, value2, "issale");
            return (Criteria) this;
        }

        public Criteria andIssaleNotBetween(java.lang.Boolean value1, java.lang.Boolean value2) {
            addCriterion("issale not between", value1, value2, "issale");
            return (Criteria) this;
        }



        public Criteria andZeroStockIsNull() {
            addCriterion("zeroStock is null");
            return (Criteria) this;
        }


        public Criteria andZeroStockIsNotNull() {
            addCriterion("zeroStock is not null");
            return (Criteria) this;
        }

        public Criteria andZeroStockEqualTo(java.lang.Boolean value) {
            addCriterion("zero_stock =", value, "zeroStock");
            return (Criteria) this;
        }

        public Criteria andZeroStockNotEqualTo(java.lang.Boolean value) {
            addCriterion("zero_stock <>", value, "zeroStock");
            return (Criteria) this;
        }

        public Criteria andZeroStockGreaterThan(java.lang.Boolean value) {
            addCriterion("zero_stock >", value, "zeroStock");
            return (Criteria) this;
        }

        public Criteria andZeroStockGreaterThanOrEqualTo(java.lang.Boolean value) {
            addCriterion("zero_stock >=", value, "zero_stock");
            return (Criteria) this;
        }

        public Criteria andZeroStockLessThan(java.lang.Boolean value) {
            addCriterion("zero_stock <", value, "zeroStock");
            return (Criteria) this;
        }

        public Criteria andZeroStockLessThanOrEqualTo(java.lang.Boolean value) {
            addCriterion("zero_stock <=", value, "zeroStock");
            return (Criteria) this;
        }


        public Criteria andZeroStockIn(List<java.lang.Boolean > values) {
            addCriterion("zero_stock in", values, "zeroStock");
            return (Criteria) this;
        }

        public Criteria andZeroStockNotIn(List<java.lang.Boolean> values) {
            addCriterion("zero_stock not in", values, "zeroStock");
            return (Criteria) this;
        }

        public Criteria andZeroStockBetween(java.lang.Boolean value1, java.lang.Boolean value2) {
            addCriterion("zero_stock between", value1, value2, "zeroStock");
            return (Criteria) this;
        }

        public Criteria andZeroStockNotBetween(java.lang.Boolean value1, java.lang.Boolean value2) {
            addCriterion("zero_stock not between", value1, value2, "zeroStock");
            return (Criteria) this;
        }



        public Criteria andZeroWhidIsNull() {
            addCriterion("zeroWhid is null");
            return (Criteria) this;
        }


        public Criteria andZeroWhidIsNotNull() {
            addCriterion("zeroWhid is not null");
            return (Criteria) this;
        }

        public Criteria andZeroWhidEqualTo(Integer value) {
            addCriterion("zero_whid =", value, "zeroWhid");
            return (Criteria) this;
        }

        public Criteria andZeroWhidNotEqualTo(Integer value) {
            addCriterion("zero_whid <>", value, "zeroWhid");
            return (Criteria) this;
        }

        public Criteria andZeroWhidGreaterThan(Integer value) {
            addCriterion("zero_whid >", value, "zeroWhid");
            return (Criteria) this;
        }

        public Criteria andZeroWhidGreaterThanOrEqualTo(Integer value) {
            addCriterion("zero_whid >=", value, "zero_whid");
            return (Criteria) this;
        }

        public Criteria andZeroWhidLessThan(Integer value) {
            addCriterion("zero_whid <", value, "zeroWhid");
            return (Criteria) this;
        }

        public Criteria andZeroWhidLessThanOrEqualTo(Integer value) {
            addCriterion("zero_whid <=", value, "zeroWhid");
            return (Criteria) this;
        }


        public Criteria andZeroWhidIn(List<Integer > values) {
            addCriterion("zero_whid in", values, "zeroWhid");
            return (Criteria) this;
        }

        public Criteria andZeroWhidNotIn(List<Integer> values) {
            addCriterion("zero_whid not in", values, "zeroWhid");
            return (Criteria) this;
        }

        public Criteria andZeroWhidBetween(Integer value1, Integer value2) {
            addCriterion("zero_whid between", value1, value2, "zeroWhid");
            return (Criteria) this;
        }

        public Criteria andZeroWhidNotBetween(Integer value1, Integer value2) {
            addCriterion("zero_whid not between", value1, value2, "zeroWhid");
            return (Criteria) this;
        }



        public Criteria andZeroQtyIsNull() {
            addCriterion("zeroQty is null");
            return (Criteria) this;
        }


        public Criteria andZeroQtyIsNotNull() {
            addCriterion("zeroQty is not null");
            return (Criteria) this;
        }

        public Criteria andZeroQtyEqualTo(Integer value) {
            addCriterion("zero_qty =", value, "zeroQty");
            return (Criteria) this;
        }

        public Criteria andZeroQtyNotEqualTo(Integer value) {
            addCriterion("zero_qty <>", value, "zeroQty");
            return (Criteria) this;
        }

        public Criteria andZeroQtyGreaterThan(Integer value) {
            addCriterion("zero_qty >", value, "zeroQty");
            return (Criteria) this;
        }

        public Criteria andZeroQtyGreaterThanOrEqualTo(Integer value) {
            addCriterion("zero_qty >=", value, "zero_qty");
            return (Criteria) this;
        }

        public Criteria andZeroQtyLessThan(Integer value) {
            addCriterion("zero_qty <", value, "zeroQty");
            return (Criteria) this;
        }

        public Criteria andZeroQtyLessThanOrEqualTo(Integer value) {
            addCriterion("zero_qty <=", value, "zeroQty");
            return (Criteria) this;
        }


        public Criteria andZeroQtyIn(List<Integer > values) {
            addCriterion("zero_qty in", values, "zeroQty");
            return (Criteria) this;
        }

        public Criteria andZeroQtyNotIn(List<Integer> values) {
            addCriterion("zero_qty not in", values, "zeroQty");
            return (Criteria) this;
        }

        public Criteria andZeroQtyBetween(Integer value1, Integer value2) {
            addCriterion("zero_qty between", value1, value2, "zeroQty");
            return (Criteria) this;
        }

        public Criteria andZeroQtyNotBetween(Integer value1, Integer value2) {
            addCriterion("zero_qty not between", value1, value2, "zeroQty");
            return (Criteria) this;
        }



        public Criteria andBoxtypeIsNull() {
            addCriterion("boxtype is null");
            return (Criteria) this;
        }


        public Criteria andBoxtypeIsNotNull() {
            addCriterion("boxtype is not null");
            return (Criteria) this;
        }

        public Criteria andBoxtypeEqualTo(Integer value) {
            addCriterion("boxtype =", value, "boxtype");
            return (Criteria) this;
        }

        public Criteria andBoxtypeNotEqualTo(Integer value) {
            addCriterion("boxtype <>", value, "boxtype");
            return (Criteria) this;
        }

        public Criteria andBoxtypeGreaterThan(Integer value) {
            addCriterion("boxtype >", value, "boxtype");
            return (Criteria) this;
        }

        public Criteria andBoxtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("boxtype >=", value, "boxtype");
            return (Criteria) this;
        }

        public Criteria andBoxtypeLessThan(Integer value) {
            addCriterion("boxtype <", value, "boxtype");
            return (Criteria) this;
        }

        public Criteria andBoxtypeLessThanOrEqualTo(Integer value) {
            addCriterion("boxtype <=", value, "boxtype");
            return (Criteria) this;
        }


        public Criteria andBoxtypeIn(List<Integer > values) {
            addCriterion("boxtype in", values, "boxtype");
            return (Criteria) this;
        }

        public Criteria andBoxtypeNotIn(List<Integer> values) {
            addCriterion("boxtype not in", values, "boxtype");
            return (Criteria) this;
        }

        public Criteria andBoxtypeBetween(Integer value1, Integer value2) {
            addCriterion("boxtype between", value1, value2, "boxtype");
            return (Criteria) this;
        }

        public Criteria andBoxtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("boxtype not between", value1, value2, "boxtype");
            return (Criteria) this;
        }



        public Criteria andPmidIsNull() {
            addCriterion("pmid is null");
            return (Criteria) this;
        }


        public Criteria andPmidIsNotNull() {
            addCriterion("pmid is not null");
            return (Criteria) this;
        }

        public Criteria andPmidEqualTo(java.lang.Integer value) {
            addCriterion("pmid =", value, "pmid");
            return (Criteria) this;
        }

        public Criteria andPmidNotEqualTo(java.lang.Integer value) {
            addCriterion("pmid <>", value, "pmid");
            return (Criteria) this;
        }

        public Criteria andPmidGreaterThan(java.lang.Integer value) {
            addCriterion("pmid >", value, "pmid");
            return (Criteria) this;
        }

        public Criteria andPmidGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("pmid >=", value, "pmid");
            return (Criteria) this;
        }

        public Criteria andPmidLessThan(java.lang.Integer value) {
            addCriterion("pmid <", value, "pmid");
            return (Criteria) this;
        }

        public Criteria andPmidLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("pmid <=", value, "pmid");
            return (Criteria) this;
        }


        public Criteria andPmidIn(List<java.lang.Integer > values) {
            addCriterion("pmid in", values, "pmid");
            return (Criteria) this;
        }

        public Criteria andPmidNotIn(List<java.lang.Integer> values) {
            addCriterion("pmid not in", values, "pmid");
            return (Criteria) this;
        }

        public Criteria andPmidBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("pmid between", value1, value2, "pmid");
            return (Criteria) this;
        }

        public Criteria andPmidNotBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("pmid not between", value1, value2, "pmid");
            return (Criteria) this;
        }



        public Criteria andPeidIsNull() {
            addCriterion("peid is null");
            return (Criteria) this;
        }


        public Criteria andPeidIsNotNull() {
            addCriterion("peid is not null");
            return (Criteria) this;
        }

        public Criteria andPeidEqualTo(java.lang.Integer value) {
            addCriterion("peid =", value, "peid");
            return (Criteria) this;
        }

        public Criteria andPeidNotEqualTo(java.lang.Integer value) {
            addCriterion("peid <>", value, "peid");
            return (Criteria) this;
        }

        public Criteria andPeidGreaterThan(java.lang.Integer value) {
            addCriterion("peid >", value, "peid");
            return (Criteria) this;
        }

        public Criteria andPeidGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("peid >=", value, "peid");
            return (Criteria) this;
        }

        public Criteria andPeidLessThan(java.lang.Integer value) {
            addCriterion("peid <", value, "peid");
            return (Criteria) this;
        }

        public Criteria andPeidLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("peid <=", value, "peid");
            return (Criteria) this;
        }


        public Criteria andPeidIn(List<java.lang.Integer > values) {
            addCriterion("peid in", values, "peid");
            return (Criteria) this;
        }

        public Criteria andPeidNotIn(List<java.lang.Integer> values) {
            addCriterion("peid not in", values, "peid");
            return (Criteria) this;
        }

        public Criteria andPeidBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("peid between", value1, value2, "peid");
            return (Criteria) this;
        }

        public Criteria andPeidNotBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("peid not between", value1, value2, "peid");
            return (Criteria) this;
        }



        public Criteria andIsoriginalIsNull() {
            addCriterion("isoriginal is null");
            return (Criteria) this;
        }


        public Criteria andIsoriginalIsNotNull() {
            addCriterion("isoriginal is not null");
            return (Criteria) this;
        }

        public Criteria andIsoriginalEqualTo(java.lang.Boolean value) {
            addCriterion("isoriginal =", value, "isoriginal");
            return (Criteria) this;
        }

        public Criteria andIsoriginalNotEqualTo(java.lang.Boolean value) {
            addCriterion("isoriginal <>", value, "isoriginal");
            return (Criteria) this;
        }

        public Criteria andIsoriginalGreaterThan(java.lang.Boolean value) {
            addCriterion("isoriginal >", value, "isoriginal");
            return (Criteria) this;
        }

        public Criteria andIsoriginalGreaterThanOrEqualTo(java.lang.Boolean value) {
            addCriterion("isoriginal >=", value, "isoriginal");
            return (Criteria) this;
        }

        public Criteria andIsoriginalLessThan(java.lang.Boolean value) {
            addCriterion("isoriginal <", value, "isoriginal");
            return (Criteria) this;
        }

        public Criteria andIsoriginalLessThanOrEqualTo(java.lang.Boolean value) {
            addCriterion("isoriginal <=", value, "isoriginal");
            return (Criteria) this;
        }


        public Criteria andIsoriginalIn(List<java.lang.Boolean > values) {
            addCriterion("isoriginal in", values, "isoriginal");
            return (Criteria) this;
        }

        public Criteria andIsoriginalNotIn(List<java.lang.Boolean> values) {
            addCriterion("isoriginal not in", values, "isoriginal");
            return (Criteria) this;
        }

        public Criteria andIsoriginalBetween(java.lang.Boolean value1, java.lang.Boolean value2) {
            addCriterion("isoriginal between", value1, value2, "isoriginal");
            return (Criteria) this;
        }

        public Criteria andIsoriginalNotBetween(java.lang.Boolean value1, java.lang.Boolean value2) {
            addCriterion("isoriginal not between", value1, value2, "isoriginal");
            return (Criteria) this;
        }



        public Criteria andPurdescIsNull() {
            addCriterion("purdesc is null");
            return (Criteria) this;
        }


        public Criteria andPurdescIsNotNull() {
            addCriterion("purdesc is not null");
            return (Criteria) this;
        }

        public Criteria andPurdescEqualTo(java.lang.String value) {
            addCriterion("purdesc =", value, "purdesc");
            return (Criteria) this;
        }

        public Criteria andPurdescNotEqualTo(java.lang.String value) {
            addCriterion("purdesc <>", value, "purdesc");
            return (Criteria) this;
        }

        public Criteria andPurdescGreaterThan(java.lang.String value) {
            addCriterion("purdesc >", value, "purdesc");
            return (Criteria) this;
        }

        public Criteria andPurdescGreaterThanOrEqualTo(java.lang.String value) {
            addCriterion("purdesc >=", value, "purdesc");
            return (Criteria) this;
        }

        public Criteria andPurdescLessThan(java.lang.String value) {
            addCriterion("purdesc <", value, "purdesc");
            return (Criteria) this;
        }

        public Criteria andPurdescLessThanOrEqualTo(java.lang.String value) {
            addCriterion("purdesc <=", value, "purdesc");
            return (Criteria) this;
        }


        public Criteria andPurdescIn(List<java.lang.String > values) {
            addCriterion("purdesc in", values, "purdesc");
            return (Criteria) this;
        }

        public Criteria andPurdescNotIn(List<java.lang.String> values) {
            addCriterion("purdesc not in", values, "purdesc");
            return (Criteria) this;
        }

        public Criteria andPurdescBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("purdesc between", value1, value2, "purdesc");
            return (Criteria) this;
        }

        public Criteria andPurdescNotBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("purdesc not between", value1, value2, "purdesc");
            return (Criteria) this;
        }



        public Criteria andPurspecIsNull() {
            addCriterion("purspec is null");
            return (Criteria) this;
        }


        public Criteria andPurspecIsNotNull() {
            addCriterion("purspec is not null");
            return (Criteria) this;
        }

        public Criteria andPurspecEqualTo(java.lang.String value) {
            addCriterion("purspec =", value, "purspec");
            return (Criteria) this;
        }

        public Criteria andPurspecNotEqualTo(java.lang.String value) {
            addCriterion("purspec <>", value, "purspec");
            return (Criteria) this;
        }

        public Criteria andPurspecGreaterThan(java.lang.String value) {
            addCriterion("purspec >", value, "purspec");
            return (Criteria) this;
        }

        public Criteria andPurspecGreaterThanOrEqualTo(java.lang.String value) {
            addCriterion("purspec >=", value, "purspec");
            return (Criteria) this;
        }

        public Criteria andPurspecLessThan(java.lang.String value) {
            addCriterion("purspec <", value, "purspec");
            return (Criteria) this;
        }

        public Criteria andPurspecLessThanOrEqualTo(java.lang.String value) {
            addCriterion("purspec <=", value, "purspec");
            return (Criteria) this;
        }


        public Criteria andPurspecIn(List<java.lang.String > values) {
            addCriterion("purspec in", values, "purspec");
            return (Criteria) this;
        }

        public Criteria andPurspecNotIn(List<java.lang.String> values) {
            addCriterion("purspec not in", values, "purspec");
            return (Criteria) this;
        }

        public Criteria andPurspecBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("purspec between", value1, value2, "purspec");
            return (Criteria) this;
        }

        public Criteria andPurspecNotBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("purspec not between", value1, value2, "purspec");
            return (Criteria) this;
        }



        public Criteria andLeadtimeIsNull() {
            addCriterion("leadtime is null");
            return (Criteria) this;
        }


        public Criteria andLeadtimeIsNotNull() {
            addCriterion("leadtime is not null");
            return (Criteria) this;
        }

        public Criteria andLeadtimeEqualTo(Integer value) {
            addCriterion("leadtime =", value, "leadtime");
            return (Criteria) this;
        }

        public Criteria andLeadtimeNotEqualTo(Integer value) {
            addCriterion("leadtime <>", value, "leadtime");
            return (Criteria) this;
        }

        public Criteria andLeadtimeGreaterThan(Integer value) {
            addCriterion("leadtime >", value, "leadtime");
            return (Criteria) this;
        }

        public Criteria andLeadtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("leadtime >=", value, "leadtime");
            return (Criteria) this;
        }

        public Criteria andLeadtimeLessThan(Integer value) {
            addCriterion("leadtime <", value, "leadtime");
            return (Criteria) this;
        }

        public Criteria andLeadtimeLessThanOrEqualTo(Integer value) {
            addCriterion("leadtime <=", value, "leadtime");
            return (Criteria) this;
        }


        public Criteria andLeadtimeIn(List<Integer > values) {
            addCriterion("leadtime in", values, "leadtime");
            return (Criteria) this;
        }

        public Criteria andLeadtimeNotIn(List<Integer> values) {
            addCriterion("leadtime not in", values, "leadtime");
            return (Criteria) this;
        }

        public Criteria andLeadtimeBetween(Integer value1, Integer value2) {
            addCriterion("leadtime between", value1, value2, "leadtime");
            return (Criteria) this;
        }

        public Criteria andLeadtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("leadtime not between", value1, value2, "leadtime");
            return (Criteria) this;
        }



        public Criteria andSkulableIsNull() {
            addCriterion("skulable is null");
            return (Criteria) this;
        }


        public Criteria andSkulableIsNotNull() {
            addCriterion("skulable is not null");
            return (Criteria) this;
        }

        public Criteria andSkulableEqualTo(java.lang.String value) {
            addCriterion("skulable =", value, "skulable");
            return (Criteria) this;
        }

        public Criteria andSkulableNotEqualTo(java.lang.String value) {
            addCriterion("skulable <>", value, "skulable");
            return (Criteria) this;
        }

        public Criteria andSkulableGreaterThan(java.lang.String value) {
            addCriterion("skulable >", value, "skulable");
            return (Criteria) this;
        }

        public Criteria andSkulableGreaterThanOrEqualTo(java.lang.String value) {
            addCriterion("skulable >=", value, "skulable");
            return (Criteria) this;
        }

        public Criteria andSkulableLessThan(java.lang.String value) {
            addCriterion("skulable <", value, "skulable");
            return (Criteria) this;
        }

        public Criteria andSkulableLessThanOrEqualTo(java.lang.String value) {
            addCriterion("skulable <=", value, "skulable");
            return (Criteria) this;
        }


        public Criteria andSkulableIn(List<java.lang.String > values) {
            addCriterion("skulable in", values, "skulable");
            return (Criteria) this;
        }

        public Criteria andSkulableNotIn(List<java.lang.String> values) {
            addCriterion("skulable not in", values, "skulable");
            return (Criteria) this;
        }

        public Criteria andSkulableBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("skulable between", value1, value2, "skulable");
            return (Criteria) this;
        }

        public Criteria andSkulableNotBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("skulable not between", value1, value2, "skulable");
            return (Criteria) this;
        }



        public Criteria andInnerskuIdIsNull() {
            addCriterion("innerskuId is null");
            return (Criteria) this;
        }


        public Criteria andInnerskuIdIsNotNull() {
            addCriterion("innerskuId is not null");
            return (Criteria) this;
        }

        public Criteria andInnerskuIdEqualTo(java.lang.Integer value) {
            addCriterion("innersku_id =", value, "innerskuId");
            return (Criteria) this;
        }

        public Criteria andInnerskuIdNotEqualTo(java.lang.Integer value) {
            addCriterion("innersku_id <>", value, "innerskuId");
            return (Criteria) this;
        }

        public Criteria andInnerskuIdGreaterThan(java.lang.Integer value) {
            addCriterion("innersku_id >", value, "innerskuId");
            return (Criteria) this;
        }

        public Criteria andInnerskuIdGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("innersku_id >=", value, "innersku_id");
            return (Criteria) this;
        }

        public Criteria andInnerskuIdLessThan(java.lang.Integer value) {
            addCriterion("innersku_id <", value, "innerskuId");
            return (Criteria) this;
        }

        public Criteria andInnerskuIdLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("innersku_id <=", value, "innerskuId");
            return (Criteria) this;
        }


        public Criteria andInnerskuIdIn(List<java.lang.Integer > values) {
            addCriterion("innersku_id in", values, "innerskuId");
            return (Criteria) this;
        }

        public Criteria andInnerskuIdNotIn(List<java.lang.Integer> values) {
            addCriterion("innersku_id not in", values, "innerskuId");
            return (Criteria) this;
        }

        public Criteria andInnerskuIdBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("innersku_id between", value1, value2, "innerskuId");
            return (Criteria) this;
        }

        public Criteria andInnerskuIdNotBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("innersku_id not between", value1, value2, "innerskuId");
            return (Criteria) this;
        }



        public Criteria andOuterskuIdIsNull() {
            addCriterion("outerskuId is null");
            return (Criteria) this;
        }


        public Criteria andOuterskuIdIsNotNull() {
            addCriterion("outerskuId is not null");
            return (Criteria) this;
        }

        public Criteria andOuterskuIdEqualTo(java.lang.Integer value) {
            addCriterion("outersku_id =", value, "outerskuId");
            return (Criteria) this;
        }

        public Criteria andOuterskuIdNotEqualTo(java.lang.Integer value) {
            addCriterion("outersku_id <>", value, "outerskuId");
            return (Criteria) this;
        }

        public Criteria andOuterskuIdGreaterThan(java.lang.Integer value) {
            addCriterion("outersku_id >", value, "outerskuId");
            return (Criteria) this;
        }

        public Criteria andOuterskuIdGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("outersku_id >=", value, "outersku_id");
            return (Criteria) this;
        }

        public Criteria andOuterskuIdLessThan(java.lang.Integer value) {
            addCriterion("outersku_id <", value, "outerskuId");
            return (Criteria) this;
        }

        public Criteria andOuterskuIdLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("outersku_id <=", value, "outerskuId");
            return (Criteria) this;
        }


        public Criteria andOuterskuIdIn(List<java.lang.Integer > values) {
            addCriterion("outersku_id in", values, "outerskuId");
            return (Criteria) this;
        }

        public Criteria andOuterskuIdNotIn(List<java.lang.Integer> values) {
            addCriterion("outersku_id not in", values, "outerskuId");
            return (Criteria) this;
        }

        public Criteria andOuterskuIdBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("outersku_id between", value1, value2, "outerskuId");
            return (Criteria) this;
        }

        public Criteria andOuterskuIdNotBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("outersku_id not between", value1, value2, "outerskuId");
            return (Criteria) this;
        }



        public Criteria andPkgweightIsNull() {
            addCriterion("pkgweight is null");
            return (Criteria) this;
        }


        public Criteria andPkgweightIsNotNull() {
            addCriterion("pkgweight is not null");
            return (Criteria) this;
        }

        public Criteria andPkgweightEqualTo(Integer value) {
            addCriterion("pkgweight =", value, "pkgweight");
            return (Criteria) this;
        }

        public Criteria andPkgweightNotEqualTo(Integer value) {
            addCriterion("pkgweight <>", value, "pkgweight");
            return (Criteria) this;
        }

        public Criteria andPkgweightGreaterThan(Integer value) {
            addCriterion("pkgweight >", value, "pkgweight");
            return (Criteria) this;
        }

        public Criteria andPkgweightGreaterThanOrEqualTo(Integer value) {
            addCriterion("pkgweight >=", value, "pkgweight");
            return (Criteria) this;
        }

        public Criteria andPkgweightLessThan(Integer value) {
            addCriterion("pkgweight <", value, "pkgweight");
            return (Criteria) this;
        }

        public Criteria andPkgweightLessThanOrEqualTo(Integer value) {
            addCriterion("pkgweight <=", value, "pkgweight");
            return (Criteria) this;
        }


        public Criteria andPkgweightIn(List<Integer > values) {
            addCriterion("pkgweight in", values, "pkgweight");
            return (Criteria) this;
        }

        public Criteria andPkgweightNotIn(List<Integer> values) {
            addCriterion("pkgweight not in", values, "pkgweight");
            return (Criteria) this;
        }

        public Criteria andPkgweightBetween(Integer value1, Integer value2) {
            addCriterion("pkgweight between", value1, value2, "pkgweight");
            return (Criteria) this;
        }

        public Criteria andPkgweightNotBetween(Integer value1, Integer value2) {
            addCriterion("pkgweight not between", value1, value2, "pkgweight");
            return (Criteria) this;
        }



        public Criteria andPkgrateIsNull() {
            addCriterion("pkgrate is null");
            return (Criteria) this;
        }


        public Criteria andPkgrateIsNotNull() {
            addCriterion("pkgrate is not null");
            return (Criteria) this;
        }

        public Criteria andPkgrateEqualTo(Integer value) {
            addCriterion("pkgrate =", value, "pkgrate");
            return (Criteria) this;
        }

        public Criteria andPkgrateNotEqualTo(Integer value) {
            addCriterion("pkgrate <>", value, "pkgrate");
            return (Criteria) this;
        }

        public Criteria andPkgrateGreaterThan(Integer value) {
            addCriterion("pkgrate >", value, "pkgrate");
            return (Criteria) this;
        }

        public Criteria andPkgrateGreaterThanOrEqualTo(Integer value) {
            addCriterion("pkgrate >=", value, "pkgrate");
            return (Criteria) this;
        }

        public Criteria andPkgrateLessThan(Integer value) {
            addCriterion("pkgrate <", value, "pkgrate");
            return (Criteria) this;
        }

        public Criteria andPkgrateLessThanOrEqualTo(Integer value) {
            addCriterion("pkgrate <=", value, "pkgrate");
            return (Criteria) this;
        }


        public Criteria andPkgrateIn(List<Integer > values) {
            addCriterion("pkgrate in", values, "pkgrate");
            return (Criteria) this;
        }

        public Criteria andPkgrateNotIn(List<Integer> values) {
            addCriterion("pkgrate not in", values, "pkgrate");
            return (Criteria) this;
        }

        public Criteria andPkgrateBetween(Integer value1, Integer value2) {
            addCriterion("pkgrate between", value1, value2, "pkgrate");
            return (Criteria) this;
        }

        public Criteria andPkgrateNotBetween(Integer value1, Integer value2) {
            addCriterion("pkgrate not between", value1, value2, "pkgrate");
            return (Criteria) this;
        }



        public Criteria andPurpkgIsNull() {
            addCriterion("purpkg is null");
            return (Criteria) this;
        }


        public Criteria andPurpkgIsNotNull() {
            addCriterion("purpkg is not null");
            return (Criteria) this;
        }

        public Criteria andPurpkgEqualTo(java.lang.String value) {
            addCriterion("purpkg =", value, "purpkg");
            return (Criteria) this;
        }

        public Criteria andPurpkgNotEqualTo(java.lang.String value) {
            addCriterion("purpkg <>", value, "purpkg");
            return (Criteria) this;
        }

        public Criteria andPurpkgGreaterThan(java.lang.String value) {
            addCriterion("purpkg >", value, "purpkg");
            return (Criteria) this;
        }

        public Criteria andPurpkgGreaterThanOrEqualTo(java.lang.String value) {
            addCriterion("purpkg >=", value, "purpkg");
            return (Criteria) this;
        }

        public Criteria andPurpkgLessThan(java.lang.String value) {
            addCriterion("purpkg <", value, "purpkg");
            return (Criteria) this;
        }

        public Criteria andPurpkgLessThanOrEqualTo(java.lang.String value) {
            addCriterion("purpkg <=", value, "purpkg");
            return (Criteria) this;
        }


        public Criteria andPurpkgIn(List<java.lang.String > values) {
            addCriterion("purpkg in", values, "purpkg");
            return (Criteria) this;
        }

        public Criteria andPurpkgNotIn(List<java.lang.String> values) {
            addCriterion("purpkg not in", values, "purpkg");
            return (Criteria) this;
        }

        public Criteria andPurpkgBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("purpkg between", value1, value2, "purpkg");
            return (Criteria) this;
        }

        public Criteria andPurpkgNotBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("purpkg not between", value1, value2, "purpkg");
            return (Criteria) this;
        }



        public Criteria andStopkgIsNull() {
            addCriterion("stopkg is null");
            return (Criteria) this;
        }


        public Criteria andStopkgIsNotNull() {
            addCriterion("stopkg is not null");
            return (Criteria) this;
        }

        public Criteria andStopkgEqualTo(java.lang.String value) {
            addCriterion("stopkg =", value, "stopkg");
            return (Criteria) this;
        }

        public Criteria andStopkgNotEqualTo(java.lang.String value) {
            addCriterion("stopkg <>", value, "stopkg");
            return (Criteria) this;
        }

        public Criteria andStopkgGreaterThan(java.lang.String value) {
            addCriterion("stopkg >", value, "stopkg");
            return (Criteria) this;
        }

        public Criteria andStopkgGreaterThanOrEqualTo(java.lang.String value) {
            addCriterion("stopkg >=", value, "stopkg");
            return (Criteria) this;
        }

        public Criteria andStopkgLessThan(java.lang.String value) {
            addCriterion("stopkg <", value, "stopkg");
            return (Criteria) this;
        }

        public Criteria andStopkgLessThanOrEqualTo(java.lang.String value) {
            addCriterion("stopkg <=", value, "stopkg");
            return (Criteria) this;
        }


        public Criteria andStopkgIn(List<java.lang.String > values) {
            addCriterion("stopkg in", values, "stopkg");
            return (Criteria) this;
        }

        public Criteria andStopkgNotIn(List<java.lang.String> values) {
            addCriterion("stopkg not in", values, "stopkg");
            return (Criteria) this;
        }

        public Criteria andStopkgBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("stopkg between", value1, value2, "stopkg");
            return (Criteria) this;
        }

        public Criteria andStopkgNotBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("stopkg not between", value1, value2, "stopkg");
            return (Criteria) this;
        }



        public Criteria andStandardIsNull() {
            addCriterion("standard is null");
            return (Criteria) this;
        }


        public Criteria andStandardIsNotNull() {
            addCriterion("standard is not null");
            return (Criteria) this;
        }

        public Criteria andStandardEqualTo(java.lang.Integer value) {
            addCriterion("standard =", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardNotEqualTo(java.lang.Integer value) {
            addCriterion("standard <>", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardGreaterThan(java.lang.Integer value) {
            addCriterion("standard >", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("standard >=", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardLessThan(java.lang.Integer value) {
            addCriterion("standard <", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("standard <=", value, "standard");
            return (Criteria) this;
        }


        public Criteria andStandardIn(List<java.lang.Integer > values) {
            addCriterion("standard in", values, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardNotIn(List<java.lang.Integer> values) {
            addCriterion("standard not in", values, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("standard between", value1, value2, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardNotBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("standard not between", value1, value2, "standard");
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

        public Criteria andVersionnoEqualTo(Integer value) {
            addCriterion("versionno =", value, "versionno");
            return (Criteria) this;
        }

        public Criteria andVersionnoNotEqualTo(Integer value) {
            addCriterion("versionno <>", value, "versionno");
            return (Criteria) this;
        }

        public Criteria andVersionnoGreaterThan(Integer value) {
            addCriterion("versionno >", value, "versionno");
            return (Criteria) this;
        }

        public Criteria andVersionnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("versionno >=", value, "versionno");
            return (Criteria) this;
        }

        public Criteria andVersionnoLessThan(Integer value) {
            addCriterion("versionno <", value, "versionno");
            return (Criteria) this;
        }

        public Criteria andVersionnoLessThanOrEqualTo(Integer value) {
            addCriterion("versionno <=", value, "versionno");
            return (Criteria) this;
        }


        public Criteria andVersionnoIn(List<Integer > values) {
            addCriterion("versionno in", values, "versionno");
            return (Criteria) this;
        }

        public Criteria andVersionnoNotIn(List<Integer> values) {
            addCriterion("versionno not in", values, "versionno");
            return (Criteria) this;
        }

        public Criteria andVersionnoBetween(Integer value1, Integer value2) {
            addCriterion("versionno between", value1, value2, "versionno");
            return (Criteria) this;
        }

        public Criteria andVersionnoNotBetween(Integer value1, Integer value2) {
            addCriterion("versionno not between", value1, value2, "versionno");
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



        public Criteria andHaspicIsNull() {
            addCriterion("haspic is null");
            return (Criteria) this;
        }


        public Criteria andHaspicIsNotNull() {
            addCriterion("haspic is not null");
            return (Criteria) this;
        }

        public Criteria andHaspicEqualTo(java.lang.Boolean value) {
            addCriterion("haspic =", value, "haspic");
            return (Criteria) this;
        }

        public Criteria andHaspicNotEqualTo(java.lang.Boolean value) {
            addCriterion("haspic <>", value, "haspic");
            return (Criteria) this;
        }

        public Criteria andHaspicGreaterThan(java.lang.Boolean value) {
            addCriterion("haspic >", value, "haspic");
            return (Criteria) this;
        }

        public Criteria andHaspicGreaterThanOrEqualTo(java.lang.Boolean value) {
            addCriterion("haspic >=", value, "haspic");
            return (Criteria) this;
        }

        public Criteria andHaspicLessThan(java.lang.Boolean value) {
            addCriterion("haspic <", value, "haspic");
            return (Criteria) this;
        }

        public Criteria andHaspicLessThanOrEqualTo(java.lang.Boolean value) {
            addCriterion("haspic <=", value, "haspic");
            return (Criteria) this;
        }


        public Criteria andHaspicIn(List<java.lang.Boolean > values) {
            addCriterion("haspic in", values, "haspic");
            return (Criteria) this;
        }

        public Criteria andHaspicNotIn(List<java.lang.Boolean> values) {
            addCriterion("haspic not in", values, "haspic");
            return (Criteria) this;
        }

        public Criteria andHaspicBetween(java.lang.Boolean value1, java.lang.Boolean value2) {
            addCriterion("haspic between", value1, value2, "haspic");
            return (Criteria) this;
        }

        public Criteria andHaspicNotBetween(java.lang.Boolean value1, java.lang.Boolean value2) {
            addCriterion("haspic not between", value1, value2, "haspic");
            return (Criteria) this;
        }



        public Criteria andUpdatepicuserIsNull() {
            addCriterion("updatepicuser is null");
            return (Criteria) this;
        }


        public Criteria andUpdatepicuserIsNotNull() {
            addCriterion("updatepicuser is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatepicuserEqualTo(java.lang.String value) {
            addCriterion("updatepicuser =", value, "updatepicuser");
            return (Criteria) this;
        }

        public Criteria andUpdatepicuserNotEqualTo(java.lang.String value) {
            addCriterion("updatepicuser <>", value, "updatepicuser");
            return (Criteria) this;
        }

        public Criteria andUpdatepicuserGreaterThan(java.lang.String value) {
            addCriterion("updatepicuser >", value, "updatepicuser");
            return (Criteria) this;
        }

        public Criteria andUpdatepicuserGreaterThanOrEqualTo(java.lang.String value) {
            addCriterion("updatepicuser >=", value, "updatepicuser");
            return (Criteria) this;
        }

        public Criteria andUpdatepicuserLessThan(java.lang.String value) {
            addCriterion("updatepicuser <", value, "updatepicuser");
            return (Criteria) this;
        }

        public Criteria andUpdatepicuserLessThanOrEqualTo(java.lang.String value) {
            addCriterion("updatepicuser <=", value, "updatepicuser");
            return (Criteria) this;
        }


        public Criteria andUpdatepicuserIn(List<java.lang.String > values) {
            addCriterion("updatepicuser in", values, "updatepicuser");
            return (Criteria) this;
        }

        public Criteria andUpdatepicuserNotIn(List<java.lang.String> values) {
            addCriterion("updatepicuser not in", values, "updatepicuser");
            return (Criteria) this;
        }

        public Criteria andUpdatepicuserBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("updatepicuser between", value1, value2, "updatepicuser");
            return (Criteria) this;
        }

        public Criteria andUpdatepicuserNotBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("updatepicuser not between", value1, value2, "updatepicuser");
            return (Criteria) this;
        }



        public Criteria andUpdatepicdateIsNull() {
            addCriterion("updatepicdate is null");
            return (Criteria) this;
        }


        public Criteria andUpdatepicdateIsNotNull() {
            addCriterion("updatepicdate is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatepicdateEqualTo(java.util.Date value) {
            addCriterion("updatepicdate =", value, "updatepicdate");
            return (Criteria) this;
        }

        public Criteria andUpdatepicdateNotEqualTo(java.util.Date value) {
            addCriterion("updatepicdate <>", value, "updatepicdate");
            return (Criteria) this;
        }

        public Criteria andUpdatepicdateGreaterThan(java.util.Date value) {
            addCriterion("updatepicdate >", value, "updatepicdate");
            return (Criteria) this;
        }

        public Criteria andUpdatepicdateGreaterThanOrEqualTo(java.util.Date value) {
            addCriterion("updatepicdate >=", value, "updatepicdate");
            return (Criteria) this;
        }

        public Criteria andUpdatepicdateLessThan(java.util.Date value) {
            addCriterion("updatepicdate <", value, "updatepicdate");
            return (Criteria) this;
        }

        public Criteria andUpdatepicdateLessThanOrEqualTo(java.util.Date value) {
            addCriterion("updatepicdate <=", value, "updatepicdate");
            return (Criteria) this;
        }


        public Criteria andUpdatepicdateIn(List<java.util.Date > values) {
            addCriterion("updatepicdate in", values, "updatepicdate");
            return (Criteria) this;
        }

        public Criteria andUpdatepicdateNotIn(List<java.util.Date> values) {
            addCriterion("updatepicdate not in", values, "updatepicdate");
            return (Criteria) this;
        }

        public Criteria andUpdatepicdateBetween(java.util.Date value1, java.util.Date value2) {
            addCriterion("updatepicdate between", value1, value2, "updatepicdate");
            return (Criteria) this;
        }

        public Criteria andUpdatepicdateNotBetween(java.util.Date value1, java.util.Date value2) {
            addCriterion("updatepicdate not between", value1, value2, "updatepicdate");
            return (Criteria) this;
        }



        public Criteria andDescSourcIsNull() {
            addCriterion("descSourc is null");
            return (Criteria) this;
        }


        public Criteria andDescSourcIsNotNull() {
            addCriterion("descSourc is not null");
            return (Criteria) this;
        }

        public Criteria andDescSourcEqualTo(java.lang.String value) {
            addCriterion("desc_sourc =", value, "descSourc");
            return (Criteria) this;
        }

        public Criteria andDescSourcNotEqualTo(java.lang.String value) {
            addCriterion("desc_sourc <>", value, "descSourc");
            return (Criteria) this;
        }

        public Criteria andDescSourcGreaterThan(java.lang.String value) {
            addCriterion("desc_sourc >", value, "descSourc");
            return (Criteria) this;
        }

        public Criteria andDescSourcGreaterThanOrEqualTo(java.lang.String value) {
            addCriterion("desc_sourc >=", value, "desc_sourc");
            return (Criteria) this;
        }

        public Criteria andDescSourcLessThan(java.lang.String value) {
            addCriterion("desc_sourc <", value, "descSourc");
            return (Criteria) this;
        }

        public Criteria andDescSourcLessThanOrEqualTo(java.lang.String value) {
            addCriterion("desc_sourc <=", value, "descSourc");
            return (Criteria) this;
        }


        public Criteria andDescSourcIn(List<java.lang.String > values) {
            addCriterion("desc_sourc in", values, "descSourc");
            return (Criteria) this;
        }

        public Criteria andDescSourcNotIn(List<java.lang.String> values) {
            addCriterion("desc_sourc not in", values, "descSourc");
            return (Criteria) this;
        }

        public Criteria andDescSourcBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("desc_sourc between", value1, value2, "descSourc");
            return (Criteria) this;
        }

        public Criteria andDescSourcNotBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("desc_sourc not between", value1, value2, "descSourc");
            return (Criteria) this;
        }



        public Criteria andLineStateDateIsNull() {
            addCriterion("lineStateDate is null");
            return (Criteria) this;
        }


        public Criteria andLineStateDateIsNotNull() {
            addCriterion("lineStateDate is not null");
            return (Criteria) this;
        }

        public Criteria andLineStateDateEqualTo(java.util.Date value) {
            addCriterion("line_state_date =", value, "lineStateDate");
            return (Criteria) this;
        }

        public Criteria andLineStateDateNotEqualTo(java.util.Date value) {
            addCriterion("line_state_date <>", value, "lineStateDate");
            return (Criteria) this;
        }

        public Criteria andLineStateDateGreaterThan(java.util.Date value) {
            addCriterion("line_state_date >", value, "lineStateDate");
            return (Criteria) this;
        }

        public Criteria andLineStateDateGreaterThanOrEqualTo(java.util.Date value) {
            addCriterion("line_state_date >=", value, "line_state_date");
            return (Criteria) this;
        }

        public Criteria andLineStateDateLessThan(java.util.Date value) {
            addCriterion("line_state_date <", value, "lineStateDate");
            return (Criteria) this;
        }

        public Criteria andLineStateDateLessThanOrEqualTo(java.util.Date value) {
            addCriterion("line_state_date <=", value, "lineStateDate");
            return (Criteria) this;
        }


        public Criteria andLineStateDateIn(List<java.util.Date > values) {
            addCriterion("line_state_date in", values, "lineStateDate");
            return (Criteria) this;
        }

        public Criteria andLineStateDateNotIn(List<java.util.Date> values) {
            addCriterion("line_state_date not in", values, "lineStateDate");
            return (Criteria) this;
        }

        public Criteria andLineStateDateBetween(java.util.Date value1, java.util.Date value2) {
            addCriterion("line_state_date between", value1, value2, "lineStateDate");
            return (Criteria) this;
        }

        public Criteria andLineStateDateNotBetween(java.util.Date value1, java.util.Date value2) {
            addCriterion("line_state_date not between", value1, value2, "lineStateDate");
            return (Criteria) this;
        }



        public Criteria andPurtitleIsNull() {
            addCriterion("purtitle is null");
            return (Criteria) this;
        }


        public Criteria andPurtitleIsNotNull() {
            addCriterion("purtitle is not null");
            return (Criteria) this;
        }

        public Criteria andPurtitleEqualTo(java.lang.String value) {
            addCriterion("purtitle =", value, "purtitle");
            return (Criteria) this;
        }

        public Criteria andPurtitleNotEqualTo(java.lang.String value) {
            addCriterion("purtitle <>", value, "purtitle");
            return (Criteria) this;
        }

        public Criteria andPurtitleGreaterThan(java.lang.String value) {
            addCriterion("purtitle >", value, "purtitle");
            return (Criteria) this;
        }

        public Criteria andPurtitleGreaterThanOrEqualTo(java.lang.String value) {
            addCriterion("purtitle >=", value, "purtitle");
            return (Criteria) this;
        }

        public Criteria andPurtitleLessThan(java.lang.String value) {
            addCriterion("purtitle <", value, "purtitle");
            return (Criteria) this;
        }

        public Criteria andPurtitleLessThanOrEqualTo(java.lang.String value) {
            addCriterion("purtitle <=", value, "purtitle");
            return (Criteria) this;
        }


        public Criteria andPurtitleIn(List<java.lang.String > values) {
            addCriterion("purtitle in", values, "purtitle");
            return (Criteria) this;
        }

        public Criteria andPurtitleNotIn(List<java.lang.String> values) {
            addCriterion("purtitle not in", values, "purtitle");
            return (Criteria) this;
        }

        public Criteria andPurtitleBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("purtitle between", value1, value2, "purtitle");
            return (Criteria) this;
        }

        public Criteria andPurtitleNotBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("purtitle not between", value1, value2, "purtitle");
            return (Criteria) this;
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



        public Criteria andPurchaserIdIsNull() {
            addCriterion("purchaserId is null");
            return (Criteria) this;
        }


        public Criteria andPurchaserIdIsNotNull() {
            addCriterion("purchaserId is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaserIdEqualTo(java.lang.Integer value) {
            addCriterion("purchaser_id =", value, "purchaserId");
            return (Criteria) this;
        }

        public Criteria andPurchaserIdNotEqualTo(java.lang.Integer value) {
            addCriterion("purchaser_id <>", value, "purchaserId");
            return (Criteria) this;
        }

        public Criteria andPurchaserIdGreaterThan(java.lang.Integer value) {
            addCriterion("purchaser_id >", value, "purchaserId");
            return (Criteria) this;
        }

        public Criteria andPurchaserIdGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("purchaser_id >=", value, "purchaser_id");
            return (Criteria) this;
        }

        public Criteria andPurchaserIdLessThan(java.lang.Integer value) {
            addCriterion("purchaser_id <", value, "purchaserId");
            return (Criteria) this;
        }

        public Criteria andPurchaserIdLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("purchaser_id <=", value, "purchaserId");
            return (Criteria) this;
        }


        public Criteria andPurchaserIdIn(List<java.lang.Integer > values) {
            addCriterion("purchaser_id in", values, "purchaserId");
            return (Criteria) this;
        }

        public Criteria andPurchaserIdNotIn(List<java.lang.Integer> values) {
            addCriterion("purchaser_id not in", values, "purchaserId");
            return (Criteria) this;
        }

        public Criteria andPurchaserIdBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("purchaser_id between", value1, value2, "purchaserId");
            return (Criteria) this;
        }

        public Criteria andPurchaserIdNotBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("purchaser_id not between", value1, value2, "purchaserId");
            return (Criteria) this;
        }



        public Criteria andProductLenIsNull() {
            addCriterion("productLen is null");
            return (Criteria) this;
        }


        public Criteria andProductLenIsNotNull() {
            addCriterion("productLen is not null");
            return (Criteria) this;
        }

        public Criteria andProductLenEqualTo(Integer value) {
            addCriterion("product_len =", value, "productLen");
            return (Criteria) this;
        }

        public Criteria andProductLenNotEqualTo(Integer value) {
            addCriterion("product_len <>", value, "productLen");
            return (Criteria) this;
        }

        public Criteria andProductLenGreaterThan(Integer value) {
            addCriterion("product_len >", value, "productLen");
            return (Criteria) this;
        }

        public Criteria andProductLenGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_len >=", value, "product_len");
            return (Criteria) this;
        }

        public Criteria andProductLenLessThan(Integer value) {
            addCriterion("product_len <", value, "productLen");
            return (Criteria) this;
        }

        public Criteria andProductLenLessThanOrEqualTo(Integer value) {
            addCriterion("product_len <=", value, "productLen");
            return (Criteria) this;
        }


        public Criteria andProductLenIn(List<Integer > values) {
            addCriterion("product_len in", values, "productLen");
            return (Criteria) this;
        }

        public Criteria andProductLenNotIn(List<Integer> values) {
            addCriterion("product_len not in", values, "productLen");
            return (Criteria) this;
        }

        public Criteria andProductLenBetween(Integer value1, Integer value2) {
            addCriterion("product_len between", value1, value2, "productLen");
            return (Criteria) this;
        }

        public Criteria andProductLenNotBetween(Integer value1, Integer value2) {
            addCriterion("product_len not between", value1, value2, "productLen");
            return (Criteria) this;
        }



        public Criteria andProductWidthIsNull() {
            addCriterion("productWidth is null");
            return (Criteria) this;
        }


        public Criteria andProductWidthIsNotNull() {
            addCriterion("productWidth is not null");
            return (Criteria) this;
        }

        public Criteria andProductWidthEqualTo(Integer value) {
            addCriterion("product_width =", value, "productWidth");
            return (Criteria) this;
        }

        public Criteria andProductWidthNotEqualTo(Integer value) {
            addCriterion("product_width <>", value, "productWidth");
            return (Criteria) this;
        }

        public Criteria andProductWidthGreaterThan(Integer value) {
            addCriterion("product_width >", value, "productWidth");
            return (Criteria) this;
        }

        public Criteria andProductWidthGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_width >=", value, "product_width");
            return (Criteria) this;
        }

        public Criteria andProductWidthLessThan(Integer value) {
            addCriterion("product_width <", value, "productWidth");
            return (Criteria) this;
        }

        public Criteria andProductWidthLessThanOrEqualTo(Integer value) {
            addCriterion("product_width <=", value, "productWidth");
            return (Criteria) this;
        }


        public Criteria andProductWidthIn(List<Integer > values) {
            addCriterion("product_width in", values, "productWidth");
            return (Criteria) this;
        }

        public Criteria andProductWidthNotIn(List<Integer> values) {
            addCriterion("product_width not in", values, "productWidth");
            return (Criteria) this;
        }

        public Criteria andProductWidthBetween(Integer value1, Integer value2) {
            addCriterion("product_width between", value1, value2, "productWidth");
            return (Criteria) this;
        }

        public Criteria andProductWidthNotBetween(Integer value1, Integer value2) {
            addCriterion("product_width not between", value1, value2, "productWidth");
            return (Criteria) this;
        }



        public Criteria andProductHeightIsNull() {
            addCriterion("productHeight is null");
            return (Criteria) this;
        }


        public Criteria andProductHeightIsNotNull() {
            addCriterion("productHeight is not null");
            return (Criteria) this;
        }

        public Criteria andProductHeightEqualTo(Integer value) {
            addCriterion("product_height =", value, "productHeight");
            return (Criteria) this;
        }

        public Criteria andProductHeightNotEqualTo(Integer value) {
            addCriterion("product_height <>", value, "productHeight");
            return (Criteria) this;
        }

        public Criteria andProductHeightGreaterThan(Integer value) {
            addCriterion("product_height >", value, "productHeight");
            return (Criteria) this;
        }

        public Criteria andProductHeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_height >=", value, "product_height");
            return (Criteria) this;
        }

        public Criteria andProductHeightLessThan(Integer value) {
            addCriterion("product_height <", value, "productHeight");
            return (Criteria) this;
        }

        public Criteria andProductHeightLessThanOrEqualTo(Integer value) {
            addCriterion("product_height <=", value, "productHeight");
            return (Criteria) this;
        }


        public Criteria andProductHeightIn(List<Integer > values) {
            addCriterion("product_height in", values, "productHeight");
            return (Criteria) this;
        }

        public Criteria andProductHeightNotIn(List<Integer> values) {
            addCriterion("product_height not in", values, "productHeight");
            return (Criteria) this;
        }

        public Criteria andProductHeightBetween(Integer value1, Integer value2) {
            addCriterion("product_height between", value1, value2, "productHeight");
            return (Criteria) this;
        }

        public Criteria andProductHeightNotBetween(Integer value1, Integer value2) {
            addCriterion("product_height not between", value1, value2, "productHeight");
            return (Criteria) this;
        }



        public Criteria andProductWeightIsNull() {
            addCriterion("productWeight is null");
            return (Criteria) this;
        }


        public Criteria andProductWeightIsNotNull() {
            addCriterion("productWeight is not null");
            return (Criteria) this;
        }

        public Criteria andProductWeightEqualTo(Integer value) {
            addCriterion("product_weight =", value, "productWeight");
            return (Criteria) this;
        }

        public Criteria andProductWeightNotEqualTo(Integer value) {
            addCriterion("product_weight <>", value, "productWeight");
            return (Criteria) this;
        }

        public Criteria andProductWeightGreaterThan(Integer value) {
            addCriterion("product_weight >", value, "productWeight");
            return (Criteria) this;
        }

        public Criteria andProductWeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_weight >=", value, "product_weight");
            return (Criteria) this;
        }

        public Criteria andProductWeightLessThan(Integer value) {
            addCriterion("product_weight <", value, "productWeight");
            return (Criteria) this;
        }

        public Criteria andProductWeightLessThanOrEqualTo(Integer value) {
            addCriterion("product_weight <=", value, "productWeight");
            return (Criteria) this;
        }


        public Criteria andProductWeightIn(List<Integer > values) {
            addCriterion("product_weight in", values, "productWeight");
            return (Criteria) this;
        }

        public Criteria andProductWeightNotIn(List<Integer> values) {
            addCriterion("product_weight not in", values, "productWeight");
            return (Criteria) this;
        }

        public Criteria andProductWeightBetween(Integer value1, Integer value2) {
            addCriterion("product_weight between", value1, value2, "productWeight");
            return (Criteria) this;
        }

        public Criteria andProductWeightNotBetween(Integer value1, Integer value2) {
            addCriterion("product_weight not between", value1, value2, "productWeight");
            return (Criteria) this;
        }



        public Criteria andProductVolweightIsNull() {
            addCriterion("productVolweight is null");
            return (Criteria) this;
        }


        public Criteria andProductVolweightIsNotNull() {
            addCriterion("productVolweight is not null");
            return (Criteria) this;
        }

        public Criteria andProductVolweightEqualTo(Integer value) {
            addCriterion("product_volweight =", value, "productVolweight");
            return (Criteria) this;
        }

        public Criteria andProductVolweightNotEqualTo(Integer value) {
            addCriterion("product_volweight <>", value, "productVolweight");
            return (Criteria) this;
        }

        public Criteria andProductVolweightGreaterThan(Integer value) {
            addCriterion("product_volweight >", value, "productVolweight");
            return (Criteria) this;
        }

        public Criteria andProductVolweightGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_volweight >=", value, "product_volweight");
            return (Criteria) this;
        }

        public Criteria andProductVolweightLessThan(Integer value) {
            addCriterion("product_volweight <", value, "productVolweight");
            return (Criteria) this;
        }

        public Criteria andProductVolweightLessThanOrEqualTo(Integer value) {
            addCriterion("product_volweight <=", value, "productVolweight");
            return (Criteria) this;
        }


        public Criteria andProductVolweightIn(List<Integer > values) {
            addCriterion("product_volweight in", values, "productVolweight");
            return (Criteria) this;
        }

        public Criteria andProductVolweightNotIn(List<Integer> values) {
            addCriterion("product_volweight not in", values, "productVolweight");
            return (Criteria) this;
        }

        public Criteria andProductVolweightBetween(Integer value1, Integer value2) {
            addCriterion("product_volweight between", value1, value2, "productVolweight");
            return (Criteria) this;
        }

        public Criteria andProductVolweightNotBetween(Integer value1, Integer value2) {
            addCriterion("product_volweight not between", value1, value2, "productVolweight");
            return (Criteria) this;
        }



        public Criteria andBatteryIsNull() {
            addCriterion("battery is null");
            return (Criteria) this;
        }


        public Criteria andBatteryIsNotNull() {
            addCriterion("battery is not null");
            return (Criteria) this;
        }

        public Criteria andBatteryEqualTo(java.lang.Integer value) {
            addCriterion("battery =", value, "battery");
            return (Criteria) this;
        }

        public Criteria andBatteryNotEqualTo(java.lang.Integer value) {
            addCriterion("battery <>", value, "battery");
            return (Criteria) this;
        }

        public Criteria andBatteryGreaterThan(java.lang.Integer value) {
            addCriterion("battery >", value, "battery");
            return (Criteria) this;
        }

        public Criteria andBatteryGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("battery >=", value, "battery");
            return (Criteria) this;
        }

        public Criteria andBatteryLessThan(java.lang.Integer value) {
            addCriterion("battery <", value, "battery");
            return (Criteria) this;
        }

        public Criteria andBatteryLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("battery <=", value, "battery");
            return (Criteria) this;
        }


        public Criteria andBatteryIn(List<java.lang.Integer > values) {
            addCriterion("battery in", values, "battery");
            return (Criteria) this;
        }

        public Criteria andBatteryNotIn(List<java.lang.Integer> values) {
            addCriterion("battery not in", values, "battery");
            return (Criteria) this;
        }

        public Criteria andBatteryBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("battery between", value1, value2, "battery");
            return (Criteria) this;
        }

        public Criteria andBatteryNotBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("battery not between", value1, value2, "battery");
            return (Criteria) this;
        }



        public Criteria andModelIsNull() {
            addCriterion("model is null");
            return (Criteria) this;
        }


        public Criteria andModelIsNotNull() {
            addCriterion("model is not null");
            return (Criteria) this;
        }

        public Criteria andModelEqualTo(java.lang.String value) {
            addCriterion("model =", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotEqualTo(java.lang.String value) {
            addCriterion("model <>", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThan(java.lang.String value) {
            addCriterion("model >", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThanOrEqualTo(java.lang.String value) {
            addCriterion("model >=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThan(java.lang.String value) {
            addCriterion("model <", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThanOrEqualTo(java.lang.String value) {
            addCriterion("model <=", value, "model");
            return (Criteria) this;
        }


        public Criteria andModelIn(List<java.lang.String > values) {
            addCriterion("model in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotIn(List<java.lang.String> values) {
            addCriterion("model not in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("model between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("model not between", value1, value2, "model");
            return (Criteria) this;
        }



        public Criteria andPsidIsNull() {
            addCriterion("psid is null");
            return (Criteria) this;
        }


        public Criteria andPsidIsNotNull() {
            addCriterion("psid is not null");
            return (Criteria) this;
        }

        public Criteria andPsidEqualTo(java.lang.Integer value) {
            addCriterion("psid =", value, "psid");
            return (Criteria) this;
        }

        public Criteria andPsidNotEqualTo(java.lang.Integer value) {
            addCriterion("psid <>", value, "psid");
            return (Criteria) this;
        }

        public Criteria andPsidGreaterThan(java.lang.Integer value) {
            addCriterion("psid >", value, "psid");
            return (Criteria) this;
        }

        public Criteria andPsidGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("psid >=", value, "psid");
            return (Criteria) this;
        }

        public Criteria andPsidLessThan(java.lang.Integer value) {
            addCriterion("psid <", value, "psid");
            return (Criteria) this;
        }

        public Criteria andPsidLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("psid <=", value, "psid");
            return (Criteria) this;
        }


        public Criteria andPsidIn(List<java.lang.Integer > values) {
            addCriterion("psid in", values, "psid");
            return (Criteria) this;
        }

        public Criteria andPsidNotIn(List<java.lang.Integer> values) {
            addCriterion("psid not in", values, "psid");
            return (Criteria) this;
        }

        public Criteria andPsidBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("psid between", value1, value2, "psid");
            return (Criteria) this;
        }

        public Criteria andPsidNotBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("psid not between", value1, value2, "psid");
            return (Criteria) this;
        }



        public Criteria andUpdatedate2IsNull() {
            addCriterion("updatedate2 is null");
            return (Criteria) this;
        }


        public Criteria andUpdatedate2IsNotNull() {
            addCriterion("updatedate2 is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedate2EqualTo(java.util.Date value) {
            addCriterion("updatedate2 =", value, "updatedate2");
            return (Criteria) this;
        }

        public Criteria andUpdatedate2NotEqualTo(java.util.Date value) {
            addCriterion("updatedate2 <>", value, "updatedate2");
            return (Criteria) this;
        }

        public Criteria andUpdatedate2GreaterThan(java.util.Date value) {
            addCriterion("updatedate2 >", value, "updatedate2");
            return (Criteria) this;
        }

        public Criteria andUpdatedate2GreaterThanOrEqualTo(java.util.Date value) {
            addCriterion("updatedate2 >=", value, "updatedate2");
            return (Criteria) this;
        }

        public Criteria andUpdatedate2LessThan(java.util.Date value) {
            addCriterion("updatedate2 <", value, "updatedate2");
            return (Criteria) this;
        }

        public Criteria andUpdatedate2LessThanOrEqualTo(java.util.Date value) {
            addCriterion("updatedate2 <=", value, "updatedate2");
            return (Criteria) this;
        }


        public Criteria andUpdatedate2In(List<java.util.Date > values) {
            addCriterion("updatedate2 in", values, "updatedate2");
            return (Criteria) this;
        }

        public Criteria andUpdatedate2NotIn(List<java.util.Date> values) {
            addCriterion("updatedate2 not in", values, "updatedate2");
            return (Criteria) this;
        }

        public Criteria andUpdatedate2Between(java.util.Date value1, java.util.Date value2) {
            addCriterion("updatedate2 between", value1, value2, "updatedate2");
            return (Criteria) this;
        }

        public Criteria andUpdatedate2NotBetween(java.util.Date value1, java.util.Date value2) {
            addCriterion("updatedate2 not between", value1, value2, "updatedate2");
            return (Criteria) this;
        }



        public Criteria andRmacategoryidIsNull() {
            addCriterion("rmacategoryid is null");
            return (Criteria) this;
        }


        public Criteria andRmacategoryidIsNotNull() {
            addCriterion("rmacategoryid is not null");
            return (Criteria) this;
        }

        public Criteria andRmacategoryidEqualTo(java.lang.Integer value) {
            addCriterion("rmacategoryid =", value, "rmacategoryid");
            return (Criteria) this;
        }

        public Criteria andRmacategoryidNotEqualTo(java.lang.Integer value) {
            addCriterion("rmacategoryid <>", value, "rmacategoryid");
            return (Criteria) this;
        }

        public Criteria andRmacategoryidGreaterThan(java.lang.Integer value) {
            addCriterion("rmacategoryid >", value, "rmacategoryid");
            return (Criteria) this;
        }

        public Criteria andRmacategoryidGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("rmacategoryid >=", value, "rmacategoryid");
            return (Criteria) this;
        }

        public Criteria andRmacategoryidLessThan(java.lang.Integer value) {
            addCriterion("rmacategoryid <", value, "rmacategoryid");
            return (Criteria) this;
        }

        public Criteria andRmacategoryidLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("rmacategoryid <=", value, "rmacategoryid");
            return (Criteria) this;
        }


        public Criteria andRmacategoryidIn(List<java.lang.Integer > values) {
            addCriterion("rmacategoryid in", values, "rmacategoryid");
            return (Criteria) this;
        }

        public Criteria andRmacategoryidNotIn(List<java.lang.Integer> values) {
            addCriterion("rmacategoryid not in", values, "rmacategoryid");
            return (Criteria) this;
        }

        public Criteria andRmacategoryidBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("rmacategoryid between", value1, value2, "rmacategoryid");
            return (Criteria) this;
        }

        public Criteria andRmacategoryidNotBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("rmacategoryid not between", value1, value2, "rmacategoryid");
            return (Criteria) this;
        }



        public Criteria andRegionIsNull() {
            addCriterion("region is null");
            return (Criteria) this;
        }


        public Criteria andRegionIsNotNull() {
            addCriterion("region is not null");
            return (Criteria) this;
        }

        public Criteria andRegionEqualTo(java.lang.Integer value) {
            addCriterion("region =", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotEqualTo(java.lang.Integer value) {
            addCriterion("region <>", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionGreaterThan(java.lang.Integer value) {
            addCriterion("region >", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("region >=", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLessThan(java.lang.Integer value) {
            addCriterion("region <", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("region <=", value, "region");
            return (Criteria) this;
        }


        public Criteria andRegionIn(List<java.lang.Integer > values) {
            addCriterion("region in", values, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotIn(List<java.lang.Integer> values) {
            addCriterion("region not in", values, "region");
            return (Criteria) this;
        }

        public Criteria andRegionBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("region between", value1, value2, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("region not between", value1, value2, "region");
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



        public Criteria andProFeaturesIsNull() {
            addCriterion("proFeatures is null");
            return (Criteria) this;
        }


        public Criteria andProFeaturesIsNotNull() {
            addCriterion("proFeatures is not null");
            return (Criteria) this;
        }

        public Criteria andProFeaturesEqualTo(java.lang.String value) {
            addCriterion("pro_features =", value, "proFeatures");
            return (Criteria) this;
        }

        public Criteria andProFeaturesNotEqualTo(java.lang.String value) {
            addCriterion("pro_features <>", value, "proFeatures");
            return (Criteria) this;
        }

        public Criteria andProFeaturesGreaterThan(java.lang.String value) {
            addCriterion("pro_features >", value, "proFeatures");
            return (Criteria) this;
        }

        public Criteria andProFeaturesGreaterThanOrEqualTo(java.lang.String value) {
            addCriterion("pro_features >=", value, "pro_features");
            return (Criteria) this;
        }

        public Criteria andProFeaturesLessThan(java.lang.String value) {
            addCriterion("pro_features <", value, "proFeatures");
            return (Criteria) this;
        }

        public Criteria andProFeaturesLessThanOrEqualTo(java.lang.String value) {
            addCriterion("pro_features <=", value, "proFeatures");
            return (Criteria) this;
        }


        public Criteria andProFeaturesIn(List<java.lang.String > values) {
            addCriterion("pro_features in", values, "proFeatures");
            return (Criteria) this;
        }

        public Criteria andProFeaturesNotIn(List<java.lang.String> values) {
            addCriterion("pro_features not in", values, "proFeatures");
            return (Criteria) this;
        }

        public Criteria andProFeaturesBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("pro_features between", value1, value2, "proFeatures");
            return (Criteria) this;
        }

        public Criteria andProFeaturesNotBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("pro_features not between", value1, value2, "proFeatures");
            return (Criteria) this;
        }



        public Criteria andCategoryidIsNull() {
            addCriterion("categoryid is null");
            return (Criteria) this;
        }


        public Criteria andCategoryidIsNotNull() {
            addCriterion("categoryid is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryidEqualTo(java.lang.Integer value) {
            addCriterion("categoryid =", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidNotEqualTo(java.lang.Integer value) {
            addCriterion("categoryid <>", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidGreaterThan(java.lang.Integer value) {
            addCriterion("categoryid >", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("categoryid >=", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidLessThan(java.lang.Integer value) {
            addCriterion("categoryid <", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("categoryid <=", value, "categoryid");
            return (Criteria) this;
        }


        public Criteria andCategoryidIn(List<java.lang.Integer > values) {
            addCriterion("categoryid in", values, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidNotIn(List<java.lang.Integer> values) {
            addCriterion("categoryid not in", values, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("categoryid between", value1, value2, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidNotBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("categoryid not between", value1, value2, "categoryid");
            return (Criteria) this;
        }



        public Criteria andSubcategoryidIsNull() {
            addCriterion("subcategoryid is null");
            return (Criteria) this;
        }


        public Criteria andSubcategoryidIsNotNull() {
            addCriterion("subcategoryid is not null");
            return (Criteria) this;
        }

        public Criteria andSubcategoryidEqualTo(java.lang.Integer value) {
            addCriterion("subcategoryid =", value, "subcategoryid");
            return (Criteria) this;
        }

        public Criteria andSubcategoryidNotEqualTo(java.lang.Integer value) {
            addCriterion("subcategoryid <>", value, "subcategoryid");
            return (Criteria) this;
        }

        public Criteria andSubcategoryidGreaterThan(java.lang.Integer value) {
            addCriterion("subcategoryid >", value, "subcategoryid");
            return (Criteria) this;
        }

        public Criteria andSubcategoryidGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("subcategoryid >=", value, "subcategoryid");
            return (Criteria) this;
        }

        public Criteria andSubcategoryidLessThan(java.lang.Integer value) {
            addCriterion("subcategoryid <", value, "subcategoryid");
            return (Criteria) this;
        }

        public Criteria andSubcategoryidLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("subcategoryid <=", value, "subcategoryid");
            return (Criteria) this;
        }


        public Criteria andSubcategoryidIn(List<java.lang.Integer > values) {
            addCriterion("subcategoryid in", values, "subcategoryid");
            return (Criteria) this;
        }

        public Criteria andSubcategoryidNotIn(List<java.lang.Integer> values) {
            addCriterion("subcategoryid not in", values, "subcategoryid");
            return (Criteria) this;
        }

        public Criteria andSubcategoryidBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("subcategoryid between", value1, value2, "subcategoryid");
            return (Criteria) this;
        }

        public Criteria andSubcategoryidNotBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("subcategoryid not between", value1, value2, "subcategoryid");
            return (Criteria) this;
        }



        public Criteria andIsPackageIsNull() {
            addCriterion("isPackage is null");
            return (Criteria) this;
        }


        public Criteria andIsPackageIsNotNull() {
            addCriterion("isPackage is not null");
            return (Criteria) this;
        }

        public Criteria andIsPackageEqualTo(java.lang.Integer value) {
            addCriterion("is_package =", value, "isPackage");
            return (Criteria) this;
        }

        public Criteria andIsPackageNotEqualTo(java.lang.Integer value) {
            addCriterion("is_package <>", value, "isPackage");
            return (Criteria) this;
        }

        public Criteria andIsPackageGreaterThan(java.lang.Integer value) {
            addCriterion("is_package >", value, "isPackage");
            return (Criteria) this;
        }

        public Criteria andIsPackageGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("is_package >=", value, "is_package");
            return (Criteria) this;
        }

        public Criteria andIsPackageLessThan(java.lang.Integer value) {
            addCriterion("is_package <", value, "isPackage");
            return (Criteria) this;
        }

        public Criteria andIsPackageLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("is_package <=", value, "isPackage");
            return (Criteria) this;
        }


        public Criteria andIsPackageIn(List<java.lang.Integer > values) {
            addCriterion("is_package in", values, "isPackage");
            return (Criteria) this;
        }

        public Criteria andIsPackageNotIn(List<java.lang.Integer> values) {
            addCriterion("is_package not in", values, "isPackage");
            return (Criteria) this;
        }

        public Criteria andIsPackageBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("is_package between", value1, value2, "isPackage");
            return (Criteria) this;
        }

        public Criteria andIsPackageNotBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("is_package not between", value1, value2, "isPackage");
            return (Criteria) this;
        }



        public Criteria andColorIsNull() {
            addCriterion("color is null");
            return (Criteria) this;
        }


        public Criteria andColorIsNotNull() {
            addCriterion("color is not null");
            return (Criteria) this;
        }

        public Criteria andColorEqualTo(java.lang.Integer value) {
            addCriterion("color =", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotEqualTo(java.lang.Integer value) {
            addCriterion("color <>", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThan(java.lang.Integer value) {
            addCriterion("color >", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("color >=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThan(java.lang.Integer value) {
            addCriterion("color <", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("color <=", value, "color");
            return (Criteria) this;
        }


        public Criteria andColorIn(List<java.lang.Integer > values) {
            addCriterion("color in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotIn(List<java.lang.Integer> values) {
            addCriterion("color not in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("color between", value1, value2, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("color not between", value1, value2, "color");
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



        public Criteria andIsMagneticIsNull() {
            addCriterion("isMagnetic is null");
            return (Criteria) this;
        }


        public Criteria andIsMagneticIsNotNull() {
            addCriterion("isMagnetic is not null");
            return (Criteria) this;
        }

        public Criteria andIsMagneticEqualTo(java.lang.Boolean value) {
            addCriterion("is_magnetic =", value, "isMagnetic");
            return (Criteria) this;
        }

        public Criteria andIsMagneticNotEqualTo(java.lang.Boolean value) {
            addCriterion("is_magnetic <>", value, "isMagnetic");
            return (Criteria) this;
        }

        public Criteria andIsMagneticGreaterThan(java.lang.Boolean value) {
            addCriterion("is_magnetic >", value, "isMagnetic");
            return (Criteria) this;
        }

        public Criteria andIsMagneticGreaterThanOrEqualTo(java.lang.Boolean value) {
            addCriterion("is_magnetic >=", value, "is_magnetic");
            return (Criteria) this;
        }

        public Criteria andIsMagneticLessThan(java.lang.Boolean value) {
            addCriterion("is_magnetic <", value, "isMagnetic");
            return (Criteria) this;
        }

        public Criteria andIsMagneticLessThanOrEqualTo(java.lang.Boolean value) {
            addCriterion("is_magnetic <=", value, "isMagnetic");
            return (Criteria) this;
        }


        public Criteria andIsMagneticIn(List<java.lang.Boolean > values) {
            addCriterion("is_magnetic in", values, "isMagnetic");
            return (Criteria) this;
        }

        public Criteria andIsMagneticNotIn(List<java.lang.Boolean> values) {
            addCriterion("is_magnetic not in", values, "isMagnetic");
            return (Criteria) this;
        }

        public Criteria andIsMagneticBetween(java.lang.Boolean value1, java.lang.Boolean value2) {
            addCriterion("is_magnetic between", value1, value2, "isMagnetic");
            return (Criteria) this;
        }

        public Criteria andIsMagneticNotBetween(java.lang.Boolean value1, java.lang.Boolean value2) {
            addCriterion("is_magnetic not between", value1, value2, "isMagnetic");
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