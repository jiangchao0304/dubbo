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

        public Criteria andSkuidEqualTo(Integer value) {
            addCriterion("skuid =", value, "skuid");
            return (Criteria) this;
        }

        public Criteria andSkuidNotEqualTo(Integer value) {
            addCriterion("skuid <>", value, "skuid");
            return (Criteria) this;
        }

        public Criteria andSkuidGreaterThan(Integer value) {
            addCriterion("skuid >", value, "skuid");
            return (Criteria) this;
        }

        public Criteria andSkuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("skuid >=", value, "skuid");
            return (Criteria) this;
        }

        public Criteria andSkuidLessThan(Integer value) {
            addCriterion("skuid <", value, "skuid");
            return (Criteria) this;
        }

        public Criteria andSkuidLessThanOrEqualTo(Integer value) {
            addCriterion("skuid <=", value, "skuid");
            return (Criteria) this;
        }

        public Criteria andSkuidIn(List<Integer> values) {
            addCriterion("skuid in", values, "skuid");
            return (Criteria) this;
        }

        public Criteria andSkuidNotIn(List<Integer> values) {
            addCriterion("skuid not in", values, "skuid");
            return (Criteria) this;
        }

        public Criteria andSkuidBetween(Integer value1, Integer value2) {
            addCriterion("skuid between", value1, value2, "skuid");
            return (Criteria) this;
        }

        public Criteria andSkuidNotBetween(Integer value1, Integer value2) {
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

        public Criteria andSkuEqualTo(String value) {
            addCriterion("sku =", value, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuNotEqualTo(String value) {
            addCriterion("sku <>", value, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuGreaterThan(String value) {
            addCriterion("sku >", value, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuGreaterThanOrEqualTo(String value) {
            addCriterion("sku >=", value, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuLessThan(String value) {
            addCriterion("sku <", value, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuLessThanOrEqualTo(String value) {
            addCriterion("sku <=", value, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuLike(String value) {
            addCriterion("sku like", value, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuNotLike(String value) {
            addCriterion("sku not like", value, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuIn(List<String> values) {
            addCriterion("sku in", values, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuNotIn(List<String> values) {
            addCriterion("sku not in", values, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuBetween(String value1, String value2) {
            addCriterion("sku between", value1, value2, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuNotBetween(String value1, String value2) {
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

        public Criteria andLenEqualTo(Short value) {
            addCriterion("len =", value, "len");
            return (Criteria) this;
        }

        public Criteria andLenNotEqualTo(Short value) {
            addCriterion("len <>", value, "len");
            return (Criteria) this;
        }

        public Criteria andLenGreaterThan(Short value) {
            addCriterion("len >", value, "len");
            return (Criteria) this;
        }

        public Criteria andLenGreaterThanOrEqualTo(Short value) {
            addCriterion("len >=", value, "len");
            return (Criteria) this;
        }

        public Criteria andLenLessThan(Short value) {
            addCriterion("len <", value, "len");
            return (Criteria) this;
        }

        public Criteria andLenLessThanOrEqualTo(Short value) {
            addCriterion("len <=", value, "len");
            return (Criteria) this;
        }

        public Criteria andLenIn(List<Short> values) {
            addCriterion("len in", values, "len");
            return (Criteria) this;
        }

        public Criteria andLenNotIn(List<Short> values) {
            addCriterion("len not in", values, "len");
            return (Criteria) this;
        }

        public Criteria andLenBetween(Short value1, Short value2) {
            addCriterion("len between", value1, value2, "len");
            return (Criteria) this;
        }

        public Criteria andLenNotBetween(Short value1, Short value2) {
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

        public Criteria andWidthEqualTo(Short value) {
            addCriterion("width =", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthNotEqualTo(Short value) {
            addCriterion("width <>", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthGreaterThan(Short value) {
            addCriterion("width >", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthGreaterThanOrEqualTo(Short value) {
            addCriterion("width >=", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthLessThan(Short value) {
            addCriterion("width <", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthLessThanOrEqualTo(Short value) {
            addCriterion("width <=", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthIn(List<Short> values) {
            addCriterion("width in", values, "width");
            return (Criteria) this;
        }

        public Criteria andWidthNotIn(List<Short> values) {
            addCriterion("width not in", values, "width");
            return (Criteria) this;
        }

        public Criteria andWidthBetween(Short value1, Short value2) {
            addCriterion("width between", value1, value2, "width");
            return (Criteria) this;
        }

        public Criteria andWidthNotBetween(Short value1, Short value2) {
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

        public Criteria andHeightEqualTo(Short value) {
            addCriterion("height =", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotEqualTo(Short value) {
            addCriterion("height <>", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThan(Short value) {
            addCriterion("height >", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThanOrEqualTo(Short value) {
            addCriterion("height >=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThan(Short value) {
            addCriterion("height <", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThanOrEqualTo(Short value) {
            addCriterion("height <=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightIn(List<Short> values) {
            addCriterion("height in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotIn(List<Short> values) {
            addCriterion("height not in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightBetween(Short value1, Short value2) {
            addCriterion("height between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotBetween(Short value1, Short value2) {
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

        public Criteria andWeightEqualTo(Short value) {
            addCriterion("weight =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(Short value) {
            addCriterion("weight <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(Short value) {
            addCriterion("weight >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(Short value) {
            addCriterion("weight >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(Short value) {
            addCriterion("weight <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(Short value) {
            addCriterion("weight <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<Short> values) {
            addCriterion("weight in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<Short> values) {
            addCriterion("weight not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(Short value1, Short value2) {
            addCriterion("weight between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(Short value1, Short value2) {
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

        public Criteria andVolweightEqualTo(Short value) {
            addCriterion("volweight =", value, "volweight");
            return (Criteria) this;
        }

        public Criteria andVolweightNotEqualTo(Short value) {
            addCriterion("volweight <>", value, "volweight");
            return (Criteria) this;
        }

        public Criteria andVolweightGreaterThan(Short value) {
            addCriterion("volweight >", value, "volweight");
            return (Criteria) this;
        }

        public Criteria andVolweightGreaterThanOrEqualTo(Short value) {
            addCriterion("volweight >=", value, "volweight");
            return (Criteria) this;
        }

        public Criteria andVolweightLessThan(Short value) {
            addCriterion("volweight <", value, "volweight");
            return (Criteria) this;
        }

        public Criteria andVolweightLessThanOrEqualTo(Short value) {
            addCriterion("volweight <=", value, "volweight");
            return (Criteria) this;
        }

        public Criteria andVolweightIn(List<Short> values) {
            addCriterion("volweight in", values, "volweight");
            return (Criteria) this;
        }

        public Criteria andVolweightNotIn(List<Short> values) {
            addCriterion("volweight not in", values, "volweight");
            return (Criteria) this;
        }

        public Criteria andVolweightBetween(Short value1, Short value2) {
            addCriterion("volweight between", value1, value2, "volweight");
            return (Criteria) this;
        }

        public Criteria andVolweightNotBetween(Short value1, Short value2) {
            addCriterion("volweight not between", value1, value2, "volweight");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
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

        public Criteria andActiveEqualTo(Short value) {
            addCriterion("active =", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveNotEqualTo(Short value) {
            addCriterion("active <>", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveGreaterThan(Short value) {
            addCriterion("active >", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveGreaterThanOrEqualTo(Short value) {
            addCriterion("active >=", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveLessThan(Short value) {
            addCriterion("active <", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveLessThanOrEqualTo(Short value) {
            addCriterion("active <=", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveIn(List<Short> values) {
            addCriterion("active in", values, "active");
            return (Criteria) this;
        }

        public Criteria andActiveNotIn(List<Short> values) {
            addCriterion("active not in", values, "active");
            return (Criteria) this;
        }

        public Criteria andActiveBetween(Short value1, Short value2) {
            addCriterion("active between", value1, value2, "active");
            return (Criteria) this;
        }

        public Criteria andActiveNotBetween(Short value1, Short value2) {
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

        public Criteria andIsdropEqualTo(Boolean value) {
            addCriterion("isdrop =", value, "isdrop");
            return (Criteria) this;
        }

        public Criteria andIsdropNotEqualTo(Boolean value) {
            addCriterion("isdrop <>", value, "isdrop");
            return (Criteria) this;
        }

        public Criteria andIsdropGreaterThan(Boolean value) {
            addCriterion("isdrop >", value, "isdrop");
            return (Criteria) this;
        }

        public Criteria andIsdropGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isdrop >=", value, "isdrop");
            return (Criteria) this;
        }

        public Criteria andIsdropLessThan(Boolean value) {
            addCriterion("isdrop <", value, "isdrop");
            return (Criteria) this;
        }

        public Criteria andIsdropLessThanOrEqualTo(Boolean value) {
            addCriterion("isdrop <=", value, "isdrop");
            return (Criteria) this;
        }

        public Criteria andIsdropIn(List<Boolean> values) {
            addCriterion("isdrop in", values, "isdrop");
            return (Criteria) this;
        }

        public Criteria andIsdropNotIn(List<Boolean> values) {
            addCriterion("isdrop not in", values, "isdrop");
            return (Criteria) this;
        }

        public Criteria andIsdropBetween(Boolean value1, Boolean value2) {
            addCriterion("isdrop between", value1, value2, "isdrop");
            return (Criteria) this;
        }

        public Criteria andIsdropNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isdrop not between", value1, value2, "isdrop");
            return (Criteria) this;
        }

        public Criteria andDropDefIsNull() {
            addCriterion("drop_def is null");
            return (Criteria) this;
        }

        public Criteria andDropDefIsNotNull() {
            addCriterion("drop_def is not null");
            return (Criteria) this;
        }

        public Criteria andDropDefEqualTo(Boolean value) {
            addCriterion("drop_def =", value, "dropDef");
            return (Criteria) this;
        }

        public Criteria andDropDefNotEqualTo(Boolean value) {
            addCriterion("drop_def <>", value, "dropDef");
            return (Criteria) this;
        }

        public Criteria andDropDefGreaterThan(Boolean value) {
            addCriterion("drop_def >", value, "dropDef");
            return (Criteria) this;
        }

        public Criteria andDropDefGreaterThanOrEqualTo(Boolean value) {
            addCriterion("drop_def >=", value, "dropDef");
            return (Criteria) this;
        }

        public Criteria andDropDefLessThan(Boolean value) {
            addCriterion("drop_def <", value, "dropDef");
            return (Criteria) this;
        }

        public Criteria andDropDefLessThanOrEqualTo(Boolean value) {
            addCriterion("drop_def <=", value, "dropDef");
            return (Criteria) this;
        }

        public Criteria andDropDefIn(List<Boolean> values) {
            addCriterion("drop_def in", values, "dropDef");
            return (Criteria) this;
        }

        public Criteria andDropDefNotIn(List<Boolean> values) {
            addCriterion("drop_def not in", values, "dropDef");
            return (Criteria) this;
        }

        public Criteria andDropDefBetween(Boolean value1, Boolean value2) {
            addCriterion("drop_def between", value1, value2, "dropDef");
            return (Criteria) this;
        }

        public Criteria andDropDefNotBetween(Boolean value1, Boolean value2) {
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

        public Criteria andIsvirtualEqualTo(Byte value) {
            addCriterion("isvirtual =", value, "isvirtual");
            return (Criteria) this;
        }

        public Criteria andIsvirtualNotEqualTo(Byte value) {
            addCriterion("isvirtual <>", value, "isvirtual");
            return (Criteria) this;
        }

        public Criteria andIsvirtualGreaterThan(Byte value) {
            addCriterion("isvirtual >", value, "isvirtual");
            return (Criteria) this;
        }

        public Criteria andIsvirtualGreaterThanOrEqualTo(Byte value) {
            addCriterion("isvirtual >=", value, "isvirtual");
            return (Criteria) this;
        }

        public Criteria andIsvirtualLessThan(Byte value) {
            addCriterion("isvirtual <", value, "isvirtual");
            return (Criteria) this;
        }

        public Criteria andIsvirtualLessThanOrEqualTo(Byte value) {
            addCriterion("isvirtual <=", value, "isvirtual");
            return (Criteria) this;
        }

        public Criteria andIsvirtualIn(List<Byte> values) {
            addCriterion("isvirtual in", values, "isvirtual");
            return (Criteria) this;
        }

        public Criteria andIsvirtualNotIn(List<Byte> values) {
            addCriterion("isvirtual not in", values, "isvirtual");
            return (Criteria) this;
        }

        public Criteria andIsvirtualBetween(Byte value1, Byte value2) {
            addCriterion("isvirtual between", value1, value2, "isvirtual");
            return (Criteria) this;
        }

        public Criteria andIsvirtualNotBetween(Byte value1, Byte value2) {
            addCriterion("isvirtual not between", value1, value2, "isvirtual");
            return (Criteria) this;
        }

        public Criteria andLineStateIsNull() {
            addCriterion("line_state is null");
            return (Criteria) this;
        }

        public Criteria andLineStateIsNotNull() {
            addCriterion("line_state is not null");
            return (Criteria) this;
        }

        public Criteria andLineStateEqualTo(Byte value) {
            addCriterion("line_state =", value, "lineState");
            return (Criteria) this;
        }

        public Criteria andLineStateNotEqualTo(Byte value) {
            addCriterion("line_state <>", value, "lineState");
            return (Criteria) this;
        }

        public Criteria andLineStateGreaterThan(Byte value) {
            addCriterion("line_state >", value, "lineState");
            return (Criteria) this;
        }

        public Criteria andLineStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("line_state >=", value, "lineState");
            return (Criteria) this;
        }

        public Criteria andLineStateLessThan(Byte value) {
            addCriterion("line_state <", value, "lineState");
            return (Criteria) this;
        }

        public Criteria andLineStateLessThanOrEqualTo(Byte value) {
            addCriterion("line_state <=", value, "lineState");
            return (Criteria) this;
        }

        public Criteria andLineStateIn(List<Byte> values) {
            addCriterion("line_state in", values, "lineState");
            return (Criteria) this;
        }

        public Criteria andLineStateNotIn(List<Byte> values) {
            addCriterion("line_state not in", values, "lineState");
            return (Criteria) this;
        }

        public Criteria andLineStateBetween(Byte value1, Byte value2) {
            addCriterion("line_state between", value1, value2, "lineState");
            return (Criteria) this;
        }

        public Criteria andLineStateNotBetween(Byte value1, Byte value2) {
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

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
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

        public Criteria andIssaleEqualTo(Boolean value) {
            addCriterion("issale =", value, "issale");
            return (Criteria) this;
        }

        public Criteria andIssaleNotEqualTo(Boolean value) {
            addCriterion("issale <>", value, "issale");
            return (Criteria) this;
        }

        public Criteria andIssaleGreaterThan(Boolean value) {
            addCriterion("issale >", value, "issale");
            return (Criteria) this;
        }

        public Criteria andIssaleGreaterThanOrEqualTo(Boolean value) {
            addCriterion("issale >=", value, "issale");
            return (Criteria) this;
        }

        public Criteria andIssaleLessThan(Boolean value) {
            addCriterion("issale <", value, "issale");
            return (Criteria) this;
        }

        public Criteria andIssaleLessThanOrEqualTo(Boolean value) {
            addCriterion("issale <=", value, "issale");
            return (Criteria) this;
        }

        public Criteria andIssaleIn(List<Boolean> values) {
            addCriterion("issale in", values, "issale");
            return (Criteria) this;
        }

        public Criteria andIssaleNotIn(List<Boolean> values) {
            addCriterion("issale not in", values, "issale");
            return (Criteria) this;
        }

        public Criteria andIssaleBetween(Boolean value1, Boolean value2) {
            addCriterion("issale between", value1, value2, "issale");
            return (Criteria) this;
        }

        public Criteria andIssaleNotBetween(Boolean value1, Boolean value2) {
            addCriterion("issale not between", value1, value2, "issale");
            return (Criteria) this;
        }

        public Criteria andZeroStockIsNull() {
            addCriterion("zero_stock is null");
            return (Criteria) this;
        }

        public Criteria andZeroStockIsNotNull() {
            addCriterion("zero_stock is not null");
            return (Criteria) this;
        }

        public Criteria andZeroStockEqualTo(Boolean value) {
            addCriterion("zero_stock =", value, "zeroStock");
            return (Criteria) this;
        }

        public Criteria andZeroStockNotEqualTo(Boolean value) {
            addCriterion("zero_stock <>", value, "zeroStock");
            return (Criteria) this;
        }

        public Criteria andZeroStockGreaterThan(Boolean value) {
            addCriterion("zero_stock >", value, "zeroStock");
            return (Criteria) this;
        }

        public Criteria andZeroStockGreaterThanOrEqualTo(Boolean value) {
            addCriterion("zero_stock >=", value, "zeroStock");
            return (Criteria) this;
        }

        public Criteria andZeroStockLessThan(Boolean value) {
            addCriterion("zero_stock <", value, "zeroStock");
            return (Criteria) this;
        }

        public Criteria andZeroStockLessThanOrEqualTo(Boolean value) {
            addCriterion("zero_stock <=", value, "zeroStock");
            return (Criteria) this;
        }

        public Criteria andZeroStockIn(List<Boolean> values) {
            addCriterion("zero_stock in", values, "zeroStock");
            return (Criteria) this;
        }

        public Criteria andZeroStockNotIn(List<Boolean> values) {
            addCriterion("zero_stock not in", values, "zeroStock");
            return (Criteria) this;
        }

        public Criteria andZeroStockBetween(Boolean value1, Boolean value2) {
            addCriterion("zero_stock between", value1, value2, "zeroStock");
            return (Criteria) this;
        }

        public Criteria andZeroStockNotBetween(Boolean value1, Boolean value2) {
            addCriterion("zero_stock not between", value1, value2, "zeroStock");
            return (Criteria) this;
        }

        public Criteria andZeroWhidIsNull() {
            addCriterion("zero_whid is null");
            return (Criteria) this;
        }

        public Criteria andZeroWhidIsNotNull() {
            addCriterion("zero_whid is not null");
            return (Criteria) this;
        }

        public Criteria andZeroWhidEqualTo(Short value) {
            addCriterion("zero_whid =", value, "zeroWhid");
            return (Criteria) this;
        }

        public Criteria andZeroWhidNotEqualTo(Short value) {
            addCriterion("zero_whid <>", value, "zeroWhid");
            return (Criteria) this;
        }

        public Criteria andZeroWhidGreaterThan(Short value) {
            addCriterion("zero_whid >", value, "zeroWhid");
            return (Criteria) this;
        }

        public Criteria andZeroWhidGreaterThanOrEqualTo(Short value) {
            addCriterion("zero_whid >=", value, "zeroWhid");
            return (Criteria) this;
        }

        public Criteria andZeroWhidLessThan(Short value) {
            addCriterion("zero_whid <", value, "zeroWhid");
            return (Criteria) this;
        }

        public Criteria andZeroWhidLessThanOrEqualTo(Short value) {
            addCriterion("zero_whid <=", value, "zeroWhid");
            return (Criteria) this;
        }

        public Criteria andZeroWhidIn(List<Short> values) {
            addCriterion("zero_whid in", values, "zeroWhid");
            return (Criteria) this;
        }

        public Criteria andZeroWhidNotIn(List<Short> values) {
            addCriterion("zero_whid not in", values, "zeroWhid");
            return (Criteria) this;
        }

        public Criteria andZeroWhidBetween(Short value1, Short value2) {
            addCriterion("zero_whid between", value1, value2, "zeroWhid");
            return (Criteria) this;
        }

        public Criteria andZeroWhidNotBetween(Short value1, Short value2) {
            addCriterion("zero_whid not between", value1, value2, "zeroWhid");
            return (Criteria) this;
        }

        public Criteria andZeroQtyIsNull() {
            addCriterion("zero_qty is null");
            return (Criteria) this;
        }

        public Criteria andZeroQtyIsNotNull() {
            addCriterion("zero_qty is not null");
            return (Criteria) this;
        }

        public Criteria andZeroQtyEqualTo(Short value) {
            addCriterion("zero_qty =", value, "zeroQty");
            return (Criteria) this;
        }

        public Criteria andZeroQtyNotEqualTo(Short value) {
            addCriterion("zero_qty <>", value, "zeroQty");
            return (Criteria) this;
        }

        public Criteria andZeroQtyGreaterThan(Short value) {
            addCriterion("zero_qty >", value, "zeroQty");
            return (Criteria) this;
        }

        public Criteria andZeroQtyGreaterThanOrEqualTo(Short value) {
            addCriterion("zero_qty >=", value, "zeroQty");
            return (Criteria) this;
        }

        public Criteria andZeroQtyLessThan(Short value) {
            addCriterion("zero_qty <", value, "zeroQty");
            return (Criteria) this;
        }

        public Criteria andZeroQtyLessThanOrEqualTo(Short value) {
            addCriterion("zero_qty <=", value, "zeroQty");
            return (Criteria) this;
        }

        public Criteria andZeroQtyIn(List<Short> values) {
            addCriterion("zero_qty in", values, "zeroQty");
            return (Criteria) this;
        }

        public Criteria andZeroQtyNotIn(List<Short> values) {
            addCriterion("zero_qty not in", values, "zeroQty");
            return (Criteria) this;
        }

        public Criteria andZeroQtyBetween(Short value1, Short value2) {
            addCriterion("zero_qty between", value1, value2, "zeroQty");
            return (Criteria) this;
        }

        public Criteria andZeroQtyNotBetween(Short value1, Short value2) {
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

        public Criteria andBoxtypeEqualTo(Byte value) {
            addCriterion("boxtype =", value, "boxtype");
            return (Criteria) this;
        }

        public Criteria andBoxtypeNotEqualTo(Byte value) {
            addCriterion("boxtype <>", value, "boxtype");
            return (Criteria) this;
        }

        public Criteria andBoxtypeGreaterThan(Byte value) {
            addCriterion("boxtype >", value, "boxtype");
            return (Criteria) this;
        }

        public Criteria andBoxtypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("boxtype >=", value, "boxtype");
            return (Criteria) this;
        }

        public Criteria andBoxtypeLessThan(Byte value) {
            addCriterion("boxtype <", value, "boxtype");
            return (Criteria) this;
        }

        public Criteria andBoxtypeLessThanOrEqualTo(Byte value) {
            addCriterion("boxtype <=", value, "boxtype");
            return (Criteria) this;
        }

        public Criteria andBoxtypeIn(List<Byte> values) {
            addCriterion("boxtype in", values, "boxtype");
            return (Criteria) this;
        }

        public Criteria andBoxtypeNotIn(List<Byte> values) {
            addCriterion("boxtype not in", values, "boxtype");
            return (Criteria) this;
        }

        public Criteria andBoxtypeBetween(Byte value1, Byte value2) {
            addCriterion("boxtype between", value1, value2, "boxtype");
            return (Criteria) this;
        }

        public Criteria andBoxtypeNotBetween(Byte value1, Byte value2) {
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

        public Criteria andPmidEqualTo(Integer value) {
            addCriterion("pmid =", value, "pmid");
            return (Criteria) this;
        }

        public Criteria andPmidNotEqualTo(Integer value) {
            addCriterion("pmid <>", value, "pmid");
            return (Criteria) this;
        }

        public Criteria andPmidGreaterThan(Integer value) {
            addCriterion("pmid >", value, "pmid");
            return (Criteria) this;
        }

        public Criteria andPmidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pmid >=", value, "pmid");
            return (Criteria) this;
        }

        public Criteria andPmidLessThan(Integer value) {
            addCriterion("pmid <", value, "pmid");
            return (Criteria) this;
        }

        public Criteria andPmidLessThanOrEqualTo(Integer value) {
            addCriterion("pmid <=", value, "pmid");
            return (Criteria) this;
        }

        public Criteria andPmidIn(List<Integer> values) {
            addCriterion("pmid in", values, "pmid");
            return (Criteria) this;
        }

        public Criteria andPmidNotIn(List<Integer> values) {
            addCriterion("pmid not in", values, "pmid");
            return (Criteria) this;
        }

        public Criteria andPmidBetween(Integer value1, Integer value2) {
            addCriterion("pmid between", value1, value2, "pmid");
            return (Criteria) this;
        }

        public Criteria andPmidNotBetween(Integer value1, Integer value2) {
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

        public Criteria andPeidEqualTo(Integer value) {
            addCriterion("peid =", value, "peid");
            return (Criteria) this;
        }

        public Criteria andPeidNotEqualTo(Integer value) {
            addCriterion("peid <>", value, "peid");
            return (Criteria) this;
        }

        public Criteria andPeidGreaterThan(Integer value) {
            addCriterion("peid >", value, "peid");
            return (Criteria) this;
        }

        public Criteria andPeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("peid >=", value, "peid");
            return (Criteria) this;
        }

        public Criteria andPeidLessThan(Integer value) {
            addCriterion("peid <", value, "peid");
            return (Criteria) this;
        }

        public Criteria andPeidLessThanOrEqualTo(Integer value) {
            addCriterion("peid <=", value, "peid");
            return (Criteria) this;
        }

        public Criteria andPeidIn(List<Integer> values) {
            addCriterion("peid in", values, "peid");
            return (Criteria) this;
        }

        public Criteria andPeidNotIn(List<Integer> values) {
            addCriterion("peid not in", values, "peid");
            return (Criteria) this;
        }

        public Criteria andPeidBetween(Integer value1, Integer value2) {
            addCriterion("peid between", value1, value2, "peid");
            return (Criteria) this;
        }

        public Criteria andPeidNotBetween(Integer value1, Integer value2) {
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

        public Criteria andIsoriginalEqualTo(Boolean value) {
            addCriterion("isoriginal =", value, "isoriginal");
            return (Criteria) this;
        }

        public Criteria andIsoriginalNotEqualTo(Boolean value) {
            addCriterion("isoriginal <>", value, "isoriginal");
            return (Criteria) this;
        }

        public Criteria andIsoriginalGreaterThan(Boolean value) {
            addCriterion("isoriginal >", value, "isoriginal");
            return (Criteria) this;
        }

        public Criteria andIsoriginalGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isoriginal >=", value, "isoriginal");
            return (Criteria) this;
        }

        public Criteria andIsoriginalLessThan(Boolean value) {
            addCriterion("isoriginal <", value, "isoriginal");
            return (Criteria) this;
        }

        public Criteria andIsoriginalLessThanOrEqualTo(Boolean value) {
            addCriterion("isoriginal <=", value, "isoriginal");
            return (Criteria) this;
        }

        public Criteria andIsoriginalIn(List<Boolean> values) {
            addCriterion("isoriginal in", values, "isoriginal");
            return (Criteria) this;
        }

        public Criteria andIsoriginalNotIn(List<Boolean> values) {
            addCriterion("isoriginal not in", values, "isoriginal");
            return (Criteria) this;
        }

        public Criteria andIsoriginalBetween(Boolean value1, Boolean value2) {
            addCriterion("isoriginal between", value1, value2, "isoriginal");
            return (Criteria) this;
        }

        public Criteria andIsoriginalNotBetween(Boolean value1, Boolean value2) {
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

        public Criteria andPurdescEqualTo(String value) {
            addCriterion("purdesc =", value, "purdesc");
            return (Criteria) this;
        }

        public Criteria andPurdescNotEqualTo(String value) {
            addCriterion("purdesc <>", value, "purdesc");
            return (Criteria) this;
        }

        public Criteria andPurdescGreaterThan(String value) {
            addCriterion("purdesc >", value, "purdesc");
            return (Criteria) this;
        }

        public Criteria andPurdescGreaterThanOrEqualTo(String value) {
            addCriterion("purdesc >=", value, "purdesc");
            return (Criteria) this;
        }

        public Criteria andPurdescLessThan(String value) {
            addCriterion("purdesc <", value, "purdesc");
            return (Criteria) this;
        }

        public Criteria andPurdescLessThanOrEqualTo(String value) {
            addCriterion("purdesc <=", value, "purdesc");
            return (Criteria) this;
        }

        public Criteria andPurdescLike(String value) {
            addCriterion("purdesc like", value, "purdesc");
            return (Criteria) this;
        }

        public Criteria andPurdescNotLike(String value) {
            addCriterion("purdesc not like", value, "purdesc");
            return (Criteria) this;
        }

        public Criteria andPurdescIn(List<String> values) {
            addCriterion("purdesc in", values, "purdesc");
            return (Criteria) this;
        }

        public Criteria andPurdescNotIn(List<String> values) {
            addCriterion("purdesc not in", values, "purdesc");
            return (Criteria) this;
        }

        public Criteria andPurdescBetween(String value1, String value2) {
            addCriterion("purdesc between", value1, value2, "purdesc");
            return (Criteria) this;
        }

        public Criteria andPurdescNotBetween(String value1, String value2) {
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

        public Criteria andPurspecEqualTo(String value) {
            addCriterion("purspec =", value, "purspec");
            return (Criteria) this;
        }

        public Criteria andPurspecNotEqualTo(String value) {
            addCriterion("purspec <>", value, "purspec");
            return (Criteria) this;
        }

        public Criteria andPurspecGreaterThan(String value) {
            addCriterion("purspec >", value, "purspec");
            return (Criteria) this;
        }

        public Criteria andPurspecGreaterThanOrEqualTo(String value) {
            addCriterion("purspec >=", value, "purspec");
            return (Criteria) this;
        }

        public Criteria andPurspecLessThan(String value) {
            addCriterion("purspec <", value, "purspec");
            return (Criteria) this;
        }

        public Criteria andPurspecLessThanOrEqualTo(String value) {
            addCriterion("purspec <=", value, "purspec");
            return (Criteria) this;
        }

        public Criteria andPurspecLike(String value) {
            addCriterion("purspec like", value, "purspec");
            return (Criteria) this;
        }

        public Criteria andPurspecNotLike(String value) {
            addCriterion("purspec not like", value, "purspec");
            return (Criteria) this;
        }

        public Criteria andPurspecIn(List<String> values) {
            addCriterion("purspec in", values, "purspec");
            return (Criteria) this;
        }

        public Criteria andPurspecNotIn(List<String> values) {
            addCriterion("purspec not in", values, "purspec");
            return (Criteria) this;
        }

        public Criteria andPurspecBetween(String value1, String value2) {
            addCriterion("purspec between", value1, value2, "purspec");
            return (Criteria) this;
        }

        public Criteria andPurspecNotBetween(String value1, String value2) {
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

        public Criteria andLeadtimeEqualTo(Byte value) {
            addCriterion("leadtime =", value, "leadtime");
            return (Criteria) this;
        }

        public Criteria andLeadtimeNotEqualTo(Byte value) {
            addCriterion("leadtime <>", value, "leadtime");
            return (Criteria) this;
        }

        public Criteria andLeadtimeGreaterThan(Byte value) {
            addCriterion("leadtime >", value, "leadtime");
            return (Criteria) this;
        }

        public Criteria andLeadtimeGreaterThanOrEqualTo(Byte value) {
            addCriterion("leadtime >=", value, "leadtime");
            return (Criteria) this;
        }

        public Criteria andLeadtimeLessThan(Byte value) {
            addCriterion("leadtime <", value, "leadtime");
            return (Criteria) this;
        }

        public Criteria andLeadtimeLessThanOrEqualTo(Byte value) {
            addCriterion("leadtime <=", value, "leadtime");
            return (Criteria) this;
        }

        public Criteria andLeadtimeIn(List<Byte> values) {
            addCriterion("leadtime in", values, "leadtime");
            return (Criteria) this;
        }

        public Criteria andLeadtimeNotIn(List<Byte> values) {
            addCriterion("leadtime not in", values, "leadtime");
            return (Criteria) this;
        }

        public Criteria andLeadtimeBetween(Byte value1, Byte value2) {
            addCriterion("leadtime between", value1, value2, "leadtime");
            return (Criteria) this;
        }

        public Criteria andLeadtimeNotBetween(Byte value1, Byte value2) {
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

        public Criteria andSkulableEqualTo(String value) {
            addCriterion("skulable =", value, "skulable");
            return (Criteria) this;
        }

        public Criteria andSkulableNotEqualTo(String value) {
            addCriterion("skulable <>", value, "skulable");
            return (Criteria) this;
        }

        public Criteria andSkulableGreaterThan(String value) {
            addCriterion("skulable >", value, "skulable");
            return (Criteria) this;
        }

        public Criteria andSkulableGreaterThanOrEqualTo(String value) {
            addCriterion("skulable >=", value, "skulable");
            return (Criteria) this;
        }

        public Criteria andSkulableLessThan(String value) {
            addCriterion("skulable <", value, "skulable");
            return (Criteria) this;
        }

        public Criteria andSkulableLessThanOrEqualTo(String value) {
            addCriterion("skulable <=", value, "skulable");
            return (Criteria) this;
        }

        public Criteria andSkulableLike(String value) {
            addCriterion("skulable like", value, "skulable");
            return (Criteria) this;
        }

        public Criteria andSkulableNotLike(String value) {
            addCriterion("skulable not like", value, "skulable");
            return (Criteria) this;
        }

        public Criteria andSkulableIn(List<String> values) {
            addCriterion("skulable in", values, "skulable");
            return (Criteria) this;
        }

        public Criteria andSkulableNotIn(List<String> values) {
            addCriterion("skulable not in", values, "skulable");
            return (Criteria) this;
        }

        public Criteria andSkulableBetween(String value1, String value2) {
            addCriterion("skulable between", value1, value2, "skulable");
            return (Criteria) this;
        }

        public Criteria andSkulableNotBetween(String value1, String value2) {
            addCriterion("skulable not between", value1, value2, "skulable");
            return (Criteria) this;
        }

        public Criteria andInnerskuIdIsNull() {
            addCriterion("innersku_id is null");
            return (Criteria) this;
        }

        public Criteria andInnerskuIdIsNotNull() {
            addCriterion("innersku_id is not null");
            return (Criteria) this;
        }

        public Criteria andInnerskuIdEqualTo(Integer value) {
            addCriterion("innersku_id =", value, "innerskuId");
            return (Criteria) this;
        }

        public Criteria andInnerskuIdNotEqualTo(Integer value) {
            addCriterion("innersku_id <>", value, "innerskuId");
            return (Criteria) this;
        }

        public Criteria andInnerskuIdGreaterThan(Integer value) {
            addCriterion("innersku_id >", value, "innerskuId");
            return (Criteria) this;
        }

        public Criteria andInnerskuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("innersku_id >=", value, "innerskuId");
            return (Criteria) this;
        }

        public Criteria andInnerskuIdLessThan(Integer value) {
            addCriterion("innersku_id <", value, "innerskuId");
            return (Criteria) this;
        }

        public Criteria andInnerskuIdLessThanOrEqualTo(Integer value) {
            addCriterion("innersku_id <=", value, "innerskuId");
            return (Criteria) this;
        }

        public Criteria andInnerskuIdIn(List<Integer> values) {
            addCriterion("innersku_id in", values, "innerskuId");
            return (Criteria) this;
        }

        public Criteria andInnerskuIdNotIn(List<Integer> values) {
            addCriterion("innersku_id not in", values, "innerskuId");
            return (Criteria) this;
        }

        public Criteria andInnerskuIdBetween(Integer value1, Integer value2) {
            addCriterion("innersku_id between", value1, value2, "innerskuId");
            return (Criteria) this;
        }

        public Criteria andInnerskuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("innersku_id not between", value1, value2, "innerskuId");
            return (Criteria) this;
        }

        public Criteria andOuterskuIdIsNull() {
            addCriterion("outersku_id is null");
            return (Criteria) this;
        }

        public Criteria andOuterskuIdIsNotNull() {
            addCriterion("outersku_id is not null");
            return (Criteria) this;
        }

        public Criteria andOuterskuIdEqualTo(Integer value) {
            addCriterion("outersku_id =", value, "outerskuId");
            return (Criteria) this;
        }

        public Criteria andOuterskuIdNotEqualTo(Integer value) {
            addCriterion("outersku_id <>", value, "outerskuId");
            return (Criteria) this;
        }

        public Criteria andOuterskuIdGreaterThan(Integer value) {
            addCriterion("outersku_id >", value, "outerskuId");
            return (Criteria) this;
        }

        public Criteria andOuterskuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("outersku_id >=", value, "outerskuId");
            return (Criteria) this;
        }

        public Criteria andOuterskuIdLessThan(Integer value) {
            addCriterion("outersku_id <", value, "outerskuId");
            return (Criteria) this;
        }

        public Criteria andOuterskuIdLessThanOrEqualTo(Integer value) {
            addCriterion("outersku_id <=", value, "outerskuId");
            return (Criteria) this;
        }

        public Criteria andOuterskuIdIn(List<Integer> values) {
            addCriterion("outersku_id in", values, "outerskuId");
            return (Criteria) this;
        }

        public Criteria andOuterskuIdNotIn(List<Integer> values) {
            addCriterion("outersku_id not in", values, "outerskuId");
            return (Criteria) this;
        }

        public Criteria andOuterskuIdBetween(Integer value1, Integer value2) {
            addCriterion("outersku_id between", value1, value2, "outerskuId");
            return (Criteria) this;
        }

        public Criteria andOuterskuIdNotBetween(Integer value1, Integer value2) {
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

        public Criteria andPkgweightEqualTo(Short value) {
            addCriterion("pkgweight =", value, "pkgweight");
            return (Criteria) this;
        }

        public Criteria andPkgweightNotEqualTo(Short value) {
            addCriterion("pkgweight <>", value, "pkgweight");
            return (Criteria) this;
        }

        public Criteria andPkgweightGreaterThan(Short value) {
            addCriterion("pkgweight >", value, "pkgweight");
            return (Criteria) this;
        }

        public Criteria andPkgweightGreaterThanOrEqualTo(Short value) {
            addCriterion("pkgweight >=", value, "pkgweight");
            return (Criteria) this;
        }

        public Criteria andPkgweightLessThan(Short value) {
            addCriterion("pkgweight <", value, "pkgweight");
            return (Criteria) this;
        }

        public Criteria andPkgweightLessThanOrEqualTo(Short value) {
            addCriterion("pkgweight <=", value, "pkgweight");
            return (Criteria) this;
        }

        public Criteria andPkgweightIn(List<Short> values) {
            addCriterion("pkgweight in", values, "pkgweight");
            return (Criteria) this;
        }

        public Criteria andPkgweightNotIn(List<Short> values) {
            addCriterion("pkgweight not in", values, "pkgweight");
            return (Criteria) this;
        }

        public Criteria andPkgweightBetween(Short value1, Short value2) {
            addCriterion("pkgweight between", value1, value2, "pkgweight");
            return (Criteria) this;
        }

        public Criteria andPkgweightNotBetween(Short value1, Short value2) {
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

        public Criteria andPkgrateEqualTo(Short value) {
            addCriterion("pkgrate =", value, "pkgrate");
            return (Criteria) this;
        }

        public Criteria andPkgrateNotEqualTo(Short value) {
            addCriterion("pkgrate <>", value, "pkgrate");
            return (Criteria) this;
        }

        public Criteria andPkgrateGreaterThan(Short value) {
            addCriterion("pkgrate >", value, "pkgrate");
            return (Criteria) this;
        }

        public Criteria andPkgrateGreaterThanOrEqualTo(Short value) {
            addCriterion("pkgrate >=", value, "pkgrate");
            return (Criteria) this;
        }

        public Criteria andPkgrateLessThan(Short value) {
            addCriterion("pkgrate <", value, "pkgrate");
            return (Criteria) this;
        }

        public Criteria andPkgrateLessThanOrEqualTo(Short value) {
            addCriterion("pkgrate <=", value, "pkgrate");
            return (Criteria) this;
        }

        public Criteria andPkgrateIn(List<Short> values) {
            addCriterion("pkgrate in", values, "pkgrate");
            return (Criteria) this;
        }

        public Criteria andPkgrateNotIn(List<Short> values) {
            addCriterion("pkgrate not in", values, "pkgrate");
            return (Criteria) this;
        }

        public Criteria andPkgrateBetween(Short value1, Short value2) {
            addCriterion("pkgrate between", value1, value2, "pkgrate");
            return (Criteria) this;
        }

        public Criteria andPkgrateNotBetween(Short value1, Short value2) {
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

        public Criteria andPurpkgEqualTo(String value) {
            addCriterion("purpkg =", value, "purpkg");
            return (Criteria) this;
        }

        public Criteria andPurpkgNotEqualTo(String value) {
            addCriterion("purpkg <>", value, "purpkg");
            return (Criteria) this;
        }

        public Criteria andPurpkgGreaterThan(String value) {
            addCriterion("purpkg >", value, "purpkg");
            return (Criteria) this;
        }

        public Criteria andPurpkgGreaterThanOrEqualTo(String value) {
            addCriterion("purpkg >=", value, "purpkg");
            return (Criteria) this;
        }

        public Criteria andPurpkgLessThan(String value) {
            addCriterion("purpkg <", value, "purpkg");
            return (Criteria) this;
        }

        public Criteria andPurpkgLessThanOrEqualTo(String value) {
            addCriterion("purpkg <=", value, "purpkg");
            return (Criteria) this;
        }

        public Criteria andPurpkgLike(String value) {
            addCriterion("purpkg like", value, "purpkg");
            return (Criteria) this;
        }

        public Criteria andPurpkgNotLike(String value) {
            addCriterion("purpkg not like", value, "purpkg");
            return (Criteria) this;
        }

        public Criteria andPurpkgIn(List<String> values) {
            addCriterion("purpkg in", values, "purpkg");
            return (Criteria) this;
        }

        public Criteria andPurpkgNotIn(List<String> values) {
            addCriterion("purpkg not in", values, "purpkg");
            return (Criteria) this;
        }

        public Criteria andPurpkgBetween(String value1, String value2) {
            addCriterion("purpkg between", value1, value2, "purpkg");
            return (Criteria) this;
        }

        public Criteria andPurpkgNotBetween(String value1, String value2) {
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

        public Criteria andStopkgEqualTo(String value) {
            addCriterion("stopkg =", value, "stopkg");
            return (Criteria) this;
        }

        public Criteria andStopkgNotEqualTo(String value) {
            addCriterion("stopkg <>", value, "stopkg");
            return (Criteria) this;
        }

        public Criteria andStopkgGreaterThan(String value) {
            addCriterion("stopkg >", value, "stopkg");
            return (Criteria) this;
        }

        public Criteria andStopkgGreaterThanOrEqualTo(String value) {
            addCriterion("stopkg >=", value, "stopkg");
            return (Criteria) this;
        }

        public Criteria andStopkgLessThan(String value) {
            addCriterion("stopkg <", value, "stopkg");
            return (Criteria) this;
        }

        public Criteria andStopkgLessThanOrEqualTo(String value) {
            addCriterion("stopkg <=", value, "stopkg");
            return (Criteria) this;
        }

        public Criteria andStopkgLike(String value) {
            addCriterion("stopkg like", value, "stopkg");
            return (Criteria) this;
        }

        public Criteria andStopkgNotLike(String value) {
            addCriterion("stopkg not like", value, "stopkg");
            return (Criteria) this;
        }

        public Criteria andStopkgIn(List<String> values) {
            addCriterion("stopkg in", values, "stopkg");
            return (Criteria) this;
        }

        public Criteria andStopkgNotIn(List<String> values) {
            addCriterion("stopkg not in", values, "stopkg");
            return (Criteria) this;
        }

        public Criteria andStopkgBetween(String value1, String value2) {
            addCriterion("stopkg between", value1, value2, "stopkg");
            return (Criteria) this;
        }

        public Criteria andStopkgNotBetween(String value1, String value2) {
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

        public Criteria andStandardEqualTo(Integer value) {
            addCriterion("standard =", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardNotEqualTo(Integer value) {
            addCriterion("standard <>", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardGreaterThan(Integer value) {
            addCriterion("standard >", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardGreaterThanOrEqualTo(Integer value) {
            addCriterion("standard >=", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardLessThan(Integer value) {
            addCriterion("standard <", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardLessThanOrEqualTo(Integer value) {
            addCriterion("standard <=", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardIn(List<Integer> values) {
            addCriterion("standard in", values, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardNotIn(List<Integer> values) {
            addCriterion("standard not in", values, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardBetween(Integer value1, Integer value2) {
            addCriterion("standard between", value1, value2, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardNotBetween(Integer value1, Integer value2) {
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

        public Criteria andVersionnoIn(List<Short> values) {
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

        public Criteria andUpdateuseridIsNull() {
            addCriterion("updateuserid is null");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridIsNotNull() {
            addCriterion("updateuserid is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridEqualTo(Integer value) {
            addCriterion("updateuserid =", value, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridNotEqualTo(Integer value) {
            addCriterion("updateuserid <>", value, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridGreaterThan(Integer value) {
            addCriterion("updateuserid >", value, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("updateuserid >=", value, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridLessThan(Integer value) {
            addCriterion("updateuserid <", value, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridLessThanOrEqualTo(Integer value) {
            addCriterion("updateuserid <=", value, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridIn(List<Integer> values) {
            addCriterion("updateuserid in", values, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridNotIn(List<Integer> values) {
            addCriterion("updateuserid not in", values, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridBetween(Integer value1, Integer value2) {
            addCriterion("updateuserid between", value1, value2, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridNotBetween(Integer value1, Integer value2) {
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

        public Criteria andUpdatedateEqualTo(Date value) {
            addCriterion("updatedate =", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotEqualTo(Date value) {
            addCriterion("updatedate <>", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateGreaterThan(Date value) {
            addCriterion("updatedate >", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("updatedate >=", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateLessThan(Date value) {
            addCriterion("updatedate <", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateLessThanOrEqualTo(Date value) {
            addCriterion("updatedate <=", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateIn(List<Date> values) {
            addCriterion("updatedate in", values, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotIn(List<Date> values) {
            addCriterion("updatedate not in", values, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateBetween(Date value1, Date value2) {
            addCriterion("updatedate between", value1, value2, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotBetween(Date value1, Date value2) {
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

        public Criteria andHaspicEqualTo(Boolean value) {
            addCriterion("haspic =", value, "haspic");
            return (Criteria) this;
        }

        public Criteria andHaspicNotEqualTo(Boolean value) {
            addCriterion("haspic <>", value, "haspic");
            return (Criteria) this;
        }

        public Criteria andHaspicGreaterThan(Boolean value) {
            addCriterion("haspic >", value, "haspic");
            return (Criteria) this;
        }

        public Criteria andHaspicGreaterThanOrEqualTo(Boolean value) {
            addCriterion("haspic >=", value, "haspic");
            return (Criteria) this;
        }

        public Criteria andHaspicLessThan(Boolean value) {
            addCriterion("haspic <", value, "haspic");
            return (Criteria) this;
        }

        public Criteria andHaspicLessThanOrEqualTo(Boolean value) {
            addCriterion("haspic <=", value, "haspic");
            return (Criteria) this;
        }

        public Criteria andHaspicIn(List<Boolean> values) {
            addCriterion("haspic in", values, "haspic");
            return (Criteria) this;
        }

        public Criteria andHaspicNotIn(List<Boolean> values) {
            addCriterion("haspic not in", values, "haspic");
            return (Criteria) this;
        }

        public Criteria andHaspicBetween(Boolean value1, Boolean value2) {
            addCriterion("haspic between", value1, value2, "haspic");
            return (Criteria) this;
        }

        public Criteria andHaspicNotBetween(Boolean value1, Boolean value2) {
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

        public Criteria andUpdatepicuserEqualTo(String value) {
            addCriterion("updatepicuser =", value, "updatepicuser");
            return (Criteria) this;
        }

        public Criteria andUpdatepicuserNotEqualTo(String value) {
            addCriterion("updatepicuser <>", value, "updatepicuser");
            return (Criteria) this;
        }

        public Criteria andUpdatepicuserGreaterThan(String value) {
            addCriterion("updatepicuser >", value, "updatepicuser");
            return (Criteria) this;
        }

        public Criteria andUpdatepicuserGreaterThanOrEqualTo(String value) {
            addCriterion("updatepicuser >=", value, "updatepicuser");
            return (Criteria) this;
        }

        public Criteria andUpdatepicuserLessThan(String value) {
            addCriterion("updatepicuser <", value, "updatepicuser");
            return (Criteria) this;
        }

        public Criteria andUpdatepicuserLessThanOrEqualTo(String value) {
            addCriterion("updatepicuser <=", value, "updatepicuser");
            return (Criteria) this;
        }

        public Criteria andUpdatepicuserLike(String value) {
            addCriterion("updatepicuser like", value, "updatepicuser");
            return (Criteria) this;
        }

        public Criteria andUpdatepicuserNotLike(String value) {
            addCriterion("updatepicuser not like", value, "updatepicuser");
            return (Criteria) this;
        }

        public Criteria andUpdatepicuserIn(List<String> values) {
            addCriterion("updatepicuser in", values, "updatepicuser");
            return (Criteria) this;
        }

        public Criteria andUpdatepicuserNotIn(List<String> values) {
            addCriterion("updatepicuser not in", values, "updatepicuser");
            return (Criteria) this;
        }

        public Criteria andUpdatepicuserBetween(String value1, String value2) {
            addCriterion("updatepicuser between", value1, value2, "updatepicuser");
            return (Criteria) this;
        }

        public Criteria andUpdatepicuserNotBetween(String value1, String value2) {
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

        public Criteria andUpdatepicdateEqualTo(Date value) {
            addCriterion("updatepicdate =", value, "updatepicdate");
            return (Criteria) this;
        }

        public Criteria andUpdatepicdateNotEqualTo(Date value) {
            addCriterion("updatepicdate <>", value, "updatepicdate");
            return (Criteria) this;
        }

        public Criteria andUpdatepicdateGreaterThan(Date value) {
            addCriterion("updatepicdate >", value, "updatepicdate");
            return (Criteria) this;
        }

        public Criteria andUpdatepicdateGreaterThanOrEqualTo(Date value) {
            addCriterion("updatepicdate >=", value, "updatepicdate");
            return (Criteria) this;
        }

        public Criteria andUpdatepicdateLessThan(Date value) {
            addCriterion("updatepicdate <", value, "updatepicdate");
            return (Criteria) this;
        }

        public Criteria andUpdatepicdateLessThanOrEqualTo(Date value) {
            addCriterion("updatepicdate <=", value, "updatepicdate");
            return (Criteria) this;
        }

        public Criteria andUpdatepicdateIn(List<Date> values) {
            addCriterion("updatepicdate in", values, "updatepicdate");
            return (Criteria) this;
        }

        public Criteria andUpdatepicdateNotIn(List<Date> values) {
            addCriterion("updatepicdate not in", values, "updatepicdate");
            return (Criteria) this;
        }

        public Criteria andUpdatepicdateBetween(Date value1, Date value2) {
            addCriterion("updatepicdate between", value1, value2, "updatepicdate");
            return (Criteria) this;
        }

        public Criteria andUpdatepicdateNotBetween(Date value1, Date value2) {
            addCriterion("updatepicdate not between", value1, value2, "updatepicdate");
            return (Criteria) this;
        }

        public Criteria andDescSourcIsNull() {
            addCriterion("desc_sourc is null");
            return (Criteria) this;
        }

        public Criteria andDescSourcIsNotNull() {
            addCriterion("desc_sourc is not null");
            return (Criteria) this;
        }

        public Criteria andDescSourcEqualTo(String value) {
            addCriterion("desc_sourc =", value, "descSourc");
            return (Criteria) this;
        }

        public Criteria andDescSourcNotEqualTo(String value) {
            addCriterion("desc_sourc <>", value, "descSourc");
            return (Criteria) this;
        }

        public Criteria andDescSourcGreaterThan(String value) {
            addCriterion("desc_sourc >", value, "descSourc");
            return (Criteria) this;
        }

        public Criteria andDescSourcGreaterThanOrEqualTo(String value) {
            addCriterion("desc_sourc >=", value, "descSourc");
            return (Criteria) this;
        }

        public Criteria andDescSourcLessThan(String value) {
            addCriterion("desc_sourc <", value, "descSourc");
            return (Criteria) this;
        }

        public Criteria andDescSourcLessThanOrEqualTo(String value) {
            addCriterion("desc_sourc <=", value, "descSourc");
            return (Criteria) this;
        }

        public Criteria andDescSourcLike(String value) {
            addCriterion("desc_sourc like", value, "descSourc");
            return (Criteria) this;
        }

        public Criteria andDescSourcNotLike(String value) {
            addCriterion("desc_sourc not like", value, "descSourc");
            return (Criteria) this;
        }

        public Criteria andDescSourcIn(List<String> values) {
            addCriterion("desc_sourc in", values, "descSourc");
            return (Criteria) this;
        }

        public Criteria andDescSourcNotIn(List<String> values) {
            addCriterion("desc_sourc not in", values, "descSourc");
            return (Criteria) this;
        }

        public Criteria andDescSourcBetween(String value1, String value2) {
            addCriterion("desc_sourc between", value1, value2, "descSourc");
            return (Criteria) this;
        }

        public Criteria andDescSourcNotBetween(String value1, String value2) {
            addCriterion("desc_sourc not between", value1, value2, "descSourc");
            return (Criteria) this;
        }

        public Criteria andLineStateDateIsNull() {
            addCriterion("line_state_date is null");
            return (Criteria) this;
        }

        public Criteria andLineStateDateIsNotNull() {
            addCriterion("line_state_date is not null");
            return (Criteria) this;
        }

        public Criteria andLineStateDateEqualTo(Date value) {
            addCriterion("line_state_date =", value, "lineStateDate");
            return (Criteria) this;
        }

        public Criteria andLineStateDateNotEqualTo(Date value) {
            addCriterion("line_state_date <>", value, "lineStateDate");
            return (Criteria) this;
        }

        public Criteria andLineStateDateGreaterThan(Date value) {
            addCriterion("line_state_date >", value, "lineStateDate");
            return (Criteria) this;
        }

        public Criteria andLineStateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("line_state_date >=", value, "lineStateDate");
            return (Criteria) this;
        }

        public Criteria andLineStateDateLessThan(Date value) {
            addCriterion("line_state_date <", value, "lineStateDate");
            return (Criteria) this;
        }

        public Criteria andLineStateDateLessThanOrEqualTo(Date value) {
            addCriterion("line_state_date <=", value, "lineStateDate");
            return (Criteria) this;
        }

        public Criteria andLineStateDateIn(List<Date> values) {
            addCriterion("line_state_date in", values, "lineStateDate");
            return (Criteria) this;
        }

        public Criteria andLineStateDateNotIn(List<Date> values) {
            addCriterion("line_state_date not in", values, "lineStateDate");
            return (Criteria) this;
        }

        public Criteria andLineStateDateBetween(Date value1, Date value2) {
            addCriterion("line_state_date between", value1, value2, "lineStateDate");
            return (Criteria) this;
        }

        public Criteria andLineStateDateNotBetween(Date value1, Date value2) {
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

        public Criteria andPurtitleEqualTo(String value) {
            addCriterion("purtitle =", value, "purtitle");
            return (Criteria) this;
        }

        public Criteria andPurtitleNotEqualTo(String value) {
            addCriterion("purtitle <>", value, "purtitle");
            return (Criteria) this;
        }

        public Criteria andPurtitleGreaterThan(String value) {
            addCriterion("purtitle >", value, "purtitle");
            return (Criteria) this;
        }

        public Criteria andPurtitleGreaterThanOrEqualTo(String value) {
            addCriterion("purtitle >=", value, "purtitle");
            return (Criteria) this;
        }

        public Criteria andPurtitleLessThan(String value) {
            addCriterion("purtitle <", value, "purtitle");
            return (Criteria) this;
        }

        public Criteria andPurtitleLessThanOrEqualTo(String value) {
            addCriterion("purtitle <=", value, "purtitle");
            return (Criteria) this;
        }

        public Criteria andPurtitleLike(String value) {
            addCriterion("purtitle like", value, "purtitle");
            return (Criteria) this;
        }

        public Criteria andPurtitleNotLike(String value) {
            addCriterion("purtitle not like", value, "purtitle");
            return (Criteria) this;
        }

        public Criteria andPurtitleIn(List<String> values) {
            addCriterion("purtitle in", values, "purtitle");
            return (Criteria) this;
        }

        public Criteria andPurtitleNotIn(List<String> values) {
            addCriterion("purtitle not in", values, "purtitle");
            return (Criteria) this;
        }

        public Criteria andPurtitleBetween(String value1, String value2) {
            addCriterion("purtitle between", value1, value2, "purtitle");
            return (Criteria) this;
        }

        public Criteria andPurtitleNotBetween(String value1, String value2) {
            addCriterion("purtitle not between", value1, value2, "purtitle");
            return (Criteria) this;
        }

        public Criteria andBrandIdIsNull() {
            addCriterion("brand_id is null");
            return (Criteria) this;
        }

        public Criteria andBrandIdIsNotNull() {
            addCriterion("brand_id is not null");
            return (Criteria) this;
        }

        public Criteria andBrandIdEqualTo(Integer value) {
            addCriterion("brand_id =", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotEqualTo(Integer value) {
            addCriterion("brand_id <>", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdGreaterThan(Integer value) {
            addCriterion("brand_id >", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("brand_id >=", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdLessThan(Integer value) {
            addCriterion("brand_id <", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdLessThanOrEqualTo(Integer value) {
            addCriterion("brand_id <=", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdIn(List<Integer> values) {
            addCriterion("brand_id in", values, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotIn(List<Integer> values) {
            addCriterion("brand_id not in", values, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdBetween(Integer value1, Integer value2) {
            addCriterion("brand_id between", value1, value2, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotBetween(Integer value1, Integer value2) {
            addCriterion("brand_id not between", value1, value2, "brandId");
            return (Criteria) this;
        }

        public Criteria andPurchaserIdIsNull() {
            addCriterion("purchaser_id is null");
            return (Criteria) this;
        }

        public Criteria andPurchaserIdIsNotNull() {
            addCriterion("purchaser_id is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaserIdEqualTo(Integer value) {
            addCriterion("purchaser_id =", value, "purchaserId");
            return (Criteria) this;
        }

        public Criteria andPurchaserIdNotEqualTo(Integer value) {
            addCriterion("purchaser_id <>", value, "purchaserId");
            return (Criteria) this;
        }

        public Criteria andPurchaserIdGreaterThan(Integer value) {
            addCriterion("purchaser_id >", value, "purchaserId");
            return (Criteria) this;
        }

        public Criteria andPurchaserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("purchaser_id >=", value, "purchaserId");
            return (Criteria) this;
        }

        public Criteria andPurchaserIdLessThan(Integer value) {
            addCriterion("purchaser_id <", value, "purchaserId");
            return (Criteria) this;
        }

        public Criteria andPurchaserIdLessThanOrEqualTo(Integer value) {
            addCriterion("purchaser_id <=", value, "purchaserId");
            return (Criteria) this;
        }

        public Criteria andPurchaserIdIn(List<Integer> values) {
            addCriterion("purchaser_id in", values, "purchaserId");
            return (Criteria) this;
        }

        public Criteria andPurchaserIdNotIn(List<Integer> values) {
            addCriterion("purchaser_id not in", values, "purchaserId");
            return (Criteria) this;
        }

        public Criteria andPurchaserIdBetween(Integer value1, Integer value2) {
            addCriterion("purchaser_id between", value1, value2, "purchaserId");
            return (Criteria) this;
        }

        public Criteria andPurchaserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("purchaser_id not between", value1, value2, "purchaserId");
            return (Criteria) this;
        }

        public Criteria andProductLenIsNull() {
            addCriterion("product_len is null");
            return (Criteria) this;
        }

        public Criteria andProductLenIsNotNull() {
            addCriterion("product_len is not null");
            return (Criteria) this;
        }

        public Criteria andProductLenEqualTo(Short value) {
            addCriterion("product_len =", value, "productLen");
            return (Criteria) this;
        }

        public Criteria andProductLenNotEqualTo(Short value) {
            addCriterion("product_len <>", value, "productLen");
            return (Criteria) this;
        }

        public Criteria andProductLenGreaterThan(Short value) {
            addCriterion("product_len >", value, "productLen");
            return (Criteria) this;
        }

        public Criteria andProductLenGreaterThanOrEqualTo(Short value) {
            addCriterion("product_len >=", value, "productLen");
            return (Criteria) this;
        }

        public Criteria andProductLenLessThan(Short value) {
            addCriterion("product_len <", value, "productLen");
            return (Criteria) this;
        }

        public Criteria andProductLenLessThanOrEqualTo(Short value) {
            addCriterion("product_len <=", value, "productLen");
            return (Criteria) this;
        }

        public Criteria andProductLenIn(List<Short> values) {
            addCriterion("product_len in", values, "productLen");
            return (Criteria) this;
        }

        public Criteria andProductLenNotIn(List<Short> values) {
            addCriterion("product_len not in", values, "productLen");
            return (Criteria) this;
        }

        public Criteria andProductLenBetween(Short value1, Short value2) {
            addCriterion("product_len between", value1, value2, "productLen");
            return (Criteria) this;
        }

        public Criteria andProductLenNotBetween(Short value1, Short value2) {
            addCriterion("product_len not between", value1, value2, "productLen");
            return (Criteria) this;
        }

        public Criteria andProductWidthIsNull() {
            addCriterion("product_width is null");
            return (Criteria) this;
        }

        public Criteria andProductWidthIsNotNull() {
            addCriterion("product_width is not null");
            return (Criteria) this;
        }

        public Criteria andProductWidthEqualTo(Short value) {
            addCriterion("product_width =", value, "productWidth");
            return (Criteria) this;
        }

        public Criteria andProductWidthNotEqualTo(Short value) {
            addCriterion("product_width <>", value, "productWidth");
            return (Criteria) this;
        }

        public Criteria andProductWidthGreaterThan(Short value) {
            addCriterion("product_width >", value, "productWidth");
            return (Criteria) this;
        }

        public Criteria andProductWidthGreaterThanOrEqualTo(Short value) {
            addCriterion("product_width >=", value, "productWidth");
            return (Criteria) this;
        }

        public Criteria andProductWidthLessThan(Short value) {
            addCriterion("product_width <", value, "productWidth");
            return (Criteria) this;
        }

        public Criteria andProductWidthLessThanOrEqualTo(Short value) {
            addCriterion("product_width <=", value, "productWidth");
            return (Criteria) this;
        }

        public Criteria andProductWidthIn(List<Short> values) {
            addCriterion("product_width in", values, "productWidth");
            return (Criteria) this;
        }

        public Criteria andProductWidthNotIn(List<Short> values) {
            addCriterion("product_width not in", values, "productWidth");
            return (Criteria) this;
        }

        public Criteria andProductWidthBetween(Short value1, Short value2) {
            addCriterion("product_width between", value1, value2, "productWidth");
            return (Criteria) this;
        }

        public Criteria andProductWidthNotBetween(Short value1, Short value2) {
            addCriterion("product_width not between", value1, value2, "productWidth");
            return (Criteria) this;
        }

        public Criteria andProductHeightIsNull() {
            addCriterion("product_height is null");
            return (Criteria) this;
        }

        public Criteria andProductHeightIsNotNull() {
            addCriterion("product_height is not null");
            return (Criteria) this;
        }

        public Criteria andProductHeightEqualTo(Short value) {
            addCriterion("product_height =", value, "productHeight");
            return (Criteria) this;
        }

        public Criteria andProductHeightNotEqualTo(Short value) {
            addCriterion("product_height <>", value, "productHeight");
            return (Criteria) this;
        }

        public Criteria andProductHeightGreaterThan(Short value) {
            addCriterion("product_height >", value, "productHeight");
            return (Criteria) this;
        }

        public Criteria andProductHeightGreaterThanOrEqualTo(Short value) {
            addCriterion("product_height >=", value, "productHeight");
            return (Criteria) this;
        }

        public Criteria andProductHeightLessThan(Short value) {
            addCriterion("product_height <", value, "productHeight");
            return (Criteria) this;
        }

        public Criteria andProductHeightLessThanOrEqualTo(Short value) {
            addCriterion("product_height <=", value, "productHeight");
            return (Criteria) this;
        }

        public Criteria andProductHeightIn(List<Short> values) {
            addCriterion("product_height in", values, "productHeight");
            return (Criteria) this;
        }

        public Criteria andProductHeightNotIn(List<Short> values) {
            addCriterion("product_height not in", values, "productHeight");
            return (Criteria) this;
        }

        public Criteria andProductHeightBetween(Short value1, Short value2) {
            addCriterion("product_height between", value1, value2, "productHeight");
            return (Criteria) this;
        }

        public Criteria andProductHeightNotBetween(Short value1, Short value2) {
            addCriterion("product_height not between", value1, value2, "productHeight");
            return (Criteria) this;
        }

        public Criteria andProductWeightIsNull() {
            addCriterion("product_weight is null");
            return (Criteria) this;
        }

        public Criteria andProductWeightIsNotNull() {
            addCriterion("product_weight is not null");
            return (Criteria) this;
        }

        public Criteria andProductWeightEqualTo(Short value) {
            addCriterion("product_weight =", value, "productWeight");
            return (Criteria) this;
        }

        public Criteria andProductWeightNotEqualTo(Short value) {
            addCriterion("product_weight <>", value, "productWeight");
            return (Criteria) this;
        }

        public Criteria andProductWeightGreaterThan(Short value) {
            addCriterion("product_weight >", value, "productWeight");
            return (Criteria) this;
        }

        public Criteria andProductWeightGreaterThanOrEqualTo(Short value) {
            addCriterion("product_weight >=", value, "productWeight");
            return (Criteria) this;
        }

        public Criteria andProductWeightLessThan(Short value) {
            addCriterion("product_weight <", value, "productWeight");
            return (Criteria) this;
        }

        public Criteria andProductWeightLessThanOrEqualTo(Short value) {
            addCriterion("product_weight <=", value, "productWeight");
            return (Criteria) this;
        }

        public Criteria andProductWeightIn(List<Short> values) {
            addCriterion("product_weight in", values, "productWeight");
            return (Criteria) this;
        }

        public Criteria andProductWeightNotIn(List<Short> values) {
            addCriterion("product_weight not in", values, "productWeight");
            return (Criteria) this;
        }

        public Criteria andProductWeightBetween(Short value1, Short value2) {
            addCriterion("product_weight between", value1, value2, "productWeight");
            return (Criteria) this;
        }

        public Criteria andProductWeightNotBetween(Short value1, Short value2) {
            addCriterion("product_weight not between", value1, value2, "productWeight");
            return (Criteria) this;
        }

        public Criteria andProductVolweightIsNull() {
            addCriterion("product_volweight is null");
            return (Criteria) this;
        }

        public Criteria andProductVolweightIsNotNull() {
            addCriterion("product_volweight is not null");
            return (Criteria) this;
        }

        public Criteria andProductVolweightEqualTo(Short value) {
            addCriterion("product_volweight =", value, "productVolweight");
            return (Criteria) this;
        }

        public Criteria andProductVolweightNotEqualTo(Short value) {
            addCriterion("product_volweight <>", value, "productVolweight");
            return (Criteria) this;
        }

        public Criteria andProductVolweightGreaterThan(Short value) {
            addCriterion("product_volweight >", value, "productVolweight");
            return (Criteria) this;
        }

        public Criteria andProductVolweightGreaterThanOrEqualTo(Short value) {
            addCriterion("product_volweight >=", value, "productVolweight");
            return (Criteria) this;
        }

        public Criteria andProductVolweightLessThan(Short value) {
            addCriterion("product_volweight <", value, "productVolweight");
            return (Criteria) this;
        }

        public Criteria andProductVolweightLessThanOrEqualTo(Short value) {
            addCriterion("product_volweight <=", value, "productVolweight");
            return (Criteria) this;
        }

        public Criteria andProductVolweightIn(List<Short> values) {
            addCriterion("product_volweight in", values, "productVolweight");
            return (Criteria) this;
        }

        public Criteria andProductVolweightNotIn(List<Short> values) {
            addCriterion("product_volweight not in", values, "productVolweight");
            return (Criteria) this;
        }

        public Criteria andProductVolweightBetween(Short value1, Short value2) {
            addCriterion("product_volweight between", value1, value2, "productVolweight");
            return (Criteria) this;
        }

        public Criteria andProductVolweightNotBetween(Short value1, Short value2) {
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

        public Criteria andBatteryEqualTo(Integer value) {
            addCriterion("battery =", value, "battery");
            return (Criteria) this;
        }

        public Criteria andBatteryNotEqualTo(Integer value) {
            addCriterion("battery <>", value, "battery");
            return (Criteria) this;
        }

        public Criteria andBatteryGreaterThan(Integer value) {
            addCriterion("battery >", value, "battery");
            return (Criteria) this;
        }

        public Criteria andBatteryGreaterThanOrEqualTo(Integer value) {
            addCriterion("battery >=", value, "battery");
            return (Criteria) this;
        }

        public Criteria andBatteryLessThan(Integer value) {
            addCriterion("battery <", value, "battery");
            return (Criteria) this;
        }

        public Criteria andBatteryLessThanOrEqualTo(Integer value) {
            addCriterion("battery <=", value, "battery");
            return (Criteria) this;
        }

        public Criteria andBatteryIn(List<Integer> values) {
            addCriterion("battery in", values, "battery");
            return (Criteria) this;
        }

        public Criteria andBatteryNotIn(List<Integer> values) {
            addCriterion("battery not in", values, "battery");
            return (Criteria) this;
        }

        public Criteria andBatteryBetween(Integer value1, Integer value2) {
            addCriterion("battery between", value1, value2, "battery");
            return (Criteria) this;
        }

        public Criteria andBatteryNotBetween(Integer value1, Integer value2) {
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

        public Criteria andModelEqualTo(String value) {
            addCriterion("model =", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotEqualTo(String value) {
            addCriterion("model <>", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThan(String value) {
            addCriterion("model >", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThanOrEqualTo(String value) {
            addCriterion("model >=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThan(String value) {
            addCriterion("model <", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThanOrEqualTo(String value) {
            addCriterion("model <=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLike(String value) {
            addCriterion("model like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotLike(String value) {
            addCriterion("model not like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelIn(List<String> values) {
            addCriterion("model in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotIn(List<String> values) {
            addCriterion("model not in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelBetween(String value1, String value2) {
            addCriterion("model between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotBetween(String value1, String value2) {
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

        public Criteria andPsidEqualTo(Integer value) {
            addCriterion("psid =", value, "psid");
            return (Criteria) this;
        }

        public Criteria andPsidNotEqualTo(Integer value) {
            addCriterion("psid <>", value, "psid");
            return (Criteria) this;
        }

        public Criteria andPsidGreaterThan(Integer value) {
            addCriterion("psid >", value, "psid");
            return (Criteria) this;
        }

        public Criteria andPsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("psid >=", value, "psid");
            return (Criteria) this;
        }

        public Criteria andPsidLessThan(Integer value) {
            addCriterion("psid <", value, "psid");
            return (Criteria) this;
        }

        public Criteria andPsidLessThanOrEqualTo(Integer value) {
            addCriterion("psid <=", value, "psid");
            return (Criteria) this;
        }

        public Criteria andPsidIn(List<Integer> values) {
            addCriterion("psid in", values, "psid");
            return (Criteria) this;
        }

        public Criteria andPsidNotIn(List<Integer> values) {
            addCriterion("psid not in", values, "psid");
            return (Criteria) this;
        }

        public Criteria andPsidBetween(Integer value1, Integer value2) {
            addCriterion("psid between", value1, value2, "psid");
            return (Criteria) this;
        }

        public Criteria andPsidNotBetween(Integer value1, Integer value2) {
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

        public Criteria andUpdatedate2EqualTo(Date value) {
            addCriterion("updatedate2 =", value, "updatedate2");
            return (Criteria) this;
        }

        public Criteria andUpdatedate2NotEqualTo(Date value) {
            addCriterion("updatedate2 <>", value, "updatedate2");
            return (Criteria) this;
        }

        public Criteria andUpdatedate2GreaterThan(Date value) {
            addCriterion("updatedate2 >", value, "updatedate2");
            return (Criteria) this;
        }

        public Criteria andUpdatedate2GreaterThanOrEqualTo(Date value) {
            addCriterion("updatedate2 >=", value, "updatedate2");
            return (Criteria) this;
        }

        public Criteria andUpdatedate2LessThan(Date value) {
            addCriterion("updatedate2 <", value, "updatedate2");
            return (Criteria) this;
        }

        public Criteria andUpdatedate2LessThanOrEqualTo(Date value) {
            addCriterion("updatedate2 <=", value, "updatedate2");
            return (Criteria) this;
        }

        public Criteria andUpdatedate2In(List<Date> values) {
            addCriterion("updatedate2 in", values, "updatedate2");
            return (Criteria) this;
        }

        public Criteria andUpdatedate2NotIn(List<Date> values) {
            addCriterion("updatedate2 not in", values, "updatedate2");
            return (Criteria) this;
        }

        public Criteria andUpdatedate2Between(Date value1, Date value2) {
            addCriterion("updatedate2 between", value1, value2, "updatedate2");
            return (Criteria) this;
        }

        public Criteria andUpdatedate2NotBetween(Date value1, Date value2) {
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

        public Criteria andRmacategoryidEqualTo(Integer value) {
            addCriterion("rmacategoryid =", value, "rmacategoryid");
            return (Criteria) this;
        }

        public Criteria andRmacategoryidNotEqualTo(Integer value) {
            addCriterion("rmacategoryid <>", value, "rmacategoryid");
            return (Criteria) this;
        }

        public Criteria andRmacategoryidGreaterThan(Integer value) {
            addCriterion("rmacategoryid >", value, "rmacategoryid");
            return (Criteria) this;
        }

        public Criteria andRmacategoryidGreaterThanOrEqualTo(Integer value) {
            addCriterion("rmacategoryid >=", value, "rmacategoryid");
            return (Criteria) this;
        }

        public Criteria andRmacategoryidLessThan(Integer value) {
            addCriterion("rmacategoryid <", value, "rmacategoryid");
            return (Criteria) this;
        }

        public Criteria andRmacategoryidLessThanOrEqualTo(Integer value) {
            addCriterion("rmacategoryid <=", value, "rmacategoryid");
            return (Criteria) this;
        }

        public Criteria andRmacategoryidIn(List<Integer> values) {
            addCriterion("rmacategoryid in", values, "rmacategoryid");
            return (Criteria) this;
        }

        public Criteria andRmacategoryidNotIn(List<Integer> values) {
            addCriterion("rmacategoryid not in", values, "rmacategoryid");
            return (Criteria) this;
        }

        public Criteria andRmacategoryidBetween(Integer value1, Integer value2) {
            addCriterion("rmacategoryid between", value1, value2, "rmacategoryid");
            return (Criteria) this;
        }

        public Criteria andRmacategoryidNotBetween(Integer value1, Integer value2) {
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

        public Criteria andRegionEqualTo(Integer value) {
            addCriterion("region =", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotEqualTo(Integer value) {
            addCriterion("region <>", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionGreaterThan(Integer value) {
            addCriterion("region >", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionGreaterThanOrEqualTo(Integer value) {
            addCriterion("region >=", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLessThan(Integer value) {
            addCriterion("region <", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLessThanOrEqualTo(Integer value) {
            addCriterion("region <=", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionIn(List<Integer> values) {
            addCriterion("region in", values, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotIn(List<Integer> values) {
            addCriterion("region not in", values, "region");
            return (Criteria) this;
        }

        public Criteria andRegionBetween(Integer value1, Integer value2) {
            addCriterion("region between", value1, value2, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotBetween(Integer value1, Integer value2) {
            addCriterion("region not between", value1, value2, "region");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIsNull() {
            addCriterion("create_user_id is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIsNotNull() {
            addCriterion("create_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdEqualTo(Integer value) {
            addCriterion("create_user_id =", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotEqualTo(Integer value) {
            addCriterion("create_user_id <>", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdGreaterThan(Integer value) {
            addCriterion("create_user_id >", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("create_user_id >=", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLessThan(Integer value) {
            addCriterion("create_user_id <", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("create_user_id <=", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIn(List<Integer> values) {
            addCriterion("create_user_id in", values, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotIn(List<Integer> values) {
            addCriterion("create_user_id not in", values, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdBetween(Integer value1, Integer value2) {
            addCriterion("create_user_id between", value1, value2, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("create_user_id not between", value1, value2, "createUserId");
            return (Criteria) this;
        }

        public Criteria andProFeaturesIsNull() {
            addCriterion("pro_features is null");
            return (Criteria) this;
        }

        public Criteria andProFeaturesIsNotNull() {
            addCriterion("pro_features is not null");
            return (Criteria) this;
        }

        public Criteria andProFeaturesEqualTo(String value) {
            addCriterion("pro_features =", value, "proFeatures");
            return (Criteria) this;
        }

        public Criteria andProFeaturesNotEqualTo(String value) {
            addCriterion("pro_features <>", value, "proFeatures");
            return (Criteria) this;
        }

        public Criteria andProFeaturesGreaterThan(String value) {
            addCriterion("pro_features >", value, "proFeatures");
            return (Criteria) this;
        }

        public Criteria andProFeaturesGreaterThanOrEqualTo(String value) {
            addCriterion("pro_features >=", value, "proFeatures");
            return (Criteria) this;
        }

        public Criteria andProFeaturesLessThan(String value) {
            addCriterion("pro_features <", value, "proFeatures");
            return (Criteria) this;
        }

        public Criteria andProFeaturesLessThanOrEqualTo(String value) {
            addCriterion("pro_features <=", value, "proFeatures");
            return (Criteria) this;
        }

        public Criteria andProFeaturesLike(String value) {
            addCriterion("pro_features like", value, "proFeatures");
            return (Criteria) this;
        }

        public Criteria andProFeaturesNotLike(String value) {
            addCriterion("pro_features not like", value, "proFeatures");
            return (Criteria) this;
        }

        public Criteria andProFeaturesIn(List<String> values) {
            addCriterion("pro_features in", values, "proFeatures");
            return (Criteria) this;
        }

        public Criteria andProFeaturesNotIn(List<String> values) {
            addCriterion("pro_features not in", values, "proFeatures");
            return (Criteria) this;
        }

        public Criteria andProFeaturesBetween(String value1, String value2) {
            addCriterion("pro_features between", value1, value2, "proFeatures");
            return (Criteria) this;
        }

        public Criteria andProFeaturesNotBetween(String value1, String value2) {
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

        public Criteria andCategoryidEqualTo(Integer value) {
            addCriterion("categoryid =", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidNotEqualTo(Integer value) {
            addCriterion("categoryid <>", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidGreaterThan(Integer value) {
            addCriterion("categoryid >", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidGreaterThanOrEqualTo(Integer value) {
            addCriterion("categoryid >=", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidLessThan(Integer value) {
            addCriterion("categoryid <", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidLessThanOrEqualTo(Integer value) {
            addCriterion("categoryid <=", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidIn(List<Integer> values) {
            addCriterion("categoryid in", values, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidNotIn(List<Integer> values) {
            addCriterion("categoryid not in", values, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidBetween(Integer value1, Integer value2) {
            addCriterion("categoryid between", value1, value2, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidNotBetween(Integer value1, Integer value2) {
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

        public Criteria andSubcategoryidEqualTo(Integer value) {
            addCriterion("subcategoryid =", value, "subcategoryid");
            return (Criteria) this;
        }

        public Criteria andSubcategoryidNotEqualTo(Integer value) {
            addCriterion("subcategoryid <>", value, "subcategoryid");
            return (Criteria) this;
        }

        public Criteria andSubcategoryidGreaterThan(Integer value) {
            addCriterion("subcategoryid >", value, "subcategoryid");
            return (Criteria) this;
        }

        public Criteria andSubcategoryidGreaterThanOrEqualTo(Integer value) {
            addCriterion("subcategoryid >=", value, "subcategoryid");
            return (Criteria) this;
        }

        public Criteria andSubcategoryidLessThan(Integer value) {
            addCriterion("subcategoryid <", value, "subcategoryid");
            return (Criteria) this;
        }

        public Criteria andSubcategoryidLessThanOrEqualTo(Integer value) {
            addCriterion("subcategoryid <=", value, "subcategoryid");
            return (Criteria) this;
        }

        public Criteria andSubcategoryidIn(List<Integer> values) {
            addCriterion("subcategoryid in", values, "subcategoryid");
            return (Criteria) this;
        }

        public Criteria andSubcategoryidNotIn(List<Integer> values) {
            addCriterion("subcategoryid not in", values, "subcategoryid");
            return (Criteria) this;
        }

        public Criteria andSubcategoryidBetween(Integer value1, Integer value2) {
            addCriterion("subcategoryid between", value1, value2, "subcategoryid");
            return (Criteria) this;
        }

        public Criteria andSubcategoryidNotBetween(Integer value1, Integer value2) {
            addCriterion("subcategoryid not between", value1, value2, "subcategoryid");
            return (Criteria) this;
        }

        public Criteria andIsPackageIsNull() {
            addCriterion("is_package is null");
            return (Criteria) this;
        }

        public Criteria andIsPackageIsNotNull() {
            addCriterion("is_package is not null");
            return (Criteria) this;
        }

        public Criteria andIsPackageEqualTo(Integer value) {
            addCriterion("is_package =", value, "isPackage");
            return (Criteria) this;
        }

        public Criteria andIsPackageNotEqualTo(Integer value) {
            addCriterion("is_package <>", value, "isPackage");
            return (Criteria) this;
        }

        public Criteria andIsPackageGreaterThan(Integer value) {
            addCriterion("is_package >", value, "isPackage");
            return (Criteria) this;
        }

        public Criteria andIsPackageGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_package >=", value, "isPackage");
            return (Criteria) this;
        }

        public Criteria andIsPackageLessThan(Integer value) {
            addCriterion("is_package <", value, "isPackage");
            return (Criteria) this;
        }

        public Criteria andIsPackageLessThanOrEqualTo(Integer value) {
            addCriterion("is_package <=", value, "isPackage");
            return (Criteria) this;
        }

        public Criteria andIsPackageIn(List<Integer> values) {
            addCriterion("is_package in", values, "isPackage");
            return (Criteria) this;
        }

        public Criteria andIsPackageNotIn(List<Integer> values) {
            addCriterion("is_package not in", values, "isPackage");
            return (Criteria) this;
        }

        public Criteria andIsPackageBetween(Integer value1, Integer value2) {
            addCriterion("is_package between", value1, value2, "isPackage");
            return (Criteria) this;
        }

        public Criteria andIsPackageNotBetween(Integer value1, Integer value2) {
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

        public Criteria andColorEqualTo(Integer value) {
            addCriterion("color =", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotEqualTo(Integer value) {
            addCriterion("color <>", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThan(Integer value) {
            addCriterion("color >", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThanOrEqualTo(Integer value) {
            addCriterion("color >=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThan(Integer value) {
            addCriterion("color <", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThanOrEqualTo(Integer value) {
            addCriterion("color <=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorIn(List<Integer> values) {
            addCriterion("color in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotIn(List<Integer> values) {
            addCriterion("color not in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorBetween(Integer value1, Integer value2) {
            addCriterion("color between", value1, value2, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotBetween(Integer value1, Integer value2) {
            addCriterion("color not between", value1, value2, "color");
            return (Criteria) this;
        }

        public Criteria andModelIdIsNull() {
            addCriterion("model_id is null");
            return (Criteria) this;
        }

        public Criteria andModelIdIsNotNull() {
            addCriterion("model_id is not null");
            return (Criteria) this;
        }

        public Criteria andModelIdEqualTo(Integer value) {
            addCriterion("model_id =", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdNotEqualTo(Integer value) {
            addCriterion("model_id <>", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdGreaterThan(Integer value) {
            addCriterion("model_id >", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("model_id >=", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdLessThan(Integer value) {
            addCriterion("model_id <", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdLessThanOrEqualTo(Integer value) {
            addCriterion("model_id <=", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdIn(List<Integer> values) {
            addCriterion("model_id in", values, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdNotIn(List<Integer> values) {
            addCriterion("model_id not in", values, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdBetween(Integer value1, Integer value2) {
            addCriterion("model_id between", value1, value2, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdNotBetween(Integer value1, Integer value2) {
            addCriterion("model_id not between", value1, value2, "modelId");
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