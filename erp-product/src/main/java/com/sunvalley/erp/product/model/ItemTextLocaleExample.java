package com.sunvalley.erp.product.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.math.BigDecimal;

/**
* @Description: ItemTextLocaleExample
* @author
* @date 2017-09-22 11:33:48
*/
public class ItemTextLocaleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private int pageIndex;

    private int pageSize;

    public ItemTextLocaleExample() {
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

    public ItemTextLocaleExample(int pageSize, int pageIndex) {
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



        public Criteria andMetatileIsNull() {
            addCriterion("metatile is null");
            return (Criteria) this;
        }


        public Criteria andMetatileIsNotNull() {
            addCriterion("metatile is not null");
            return (Criteria) this;
        }

        public Criteria andMetatileEqualTo(java.lang.String value) {
            addCriterion("metatile =", value, "metatile");
            return (Criteria) this;
        }

        public Criteria andMetatileNotEqualTo(java.lang.String value) {
            addCriterion("metatile <>", value, "metatile");
            return (Criteria) this;
        }

        public Criteria andMetatileGreaterThan(java.lang.String value) {
            addCriterion("metatile >", value, "metatile");
            return (Criteria) this;
        }

        public Criteria andMetatileGreaterThanOrEqualTo(java.lang.String value) {
            addCriterion("metatile >=", value, "metatile");
            return (Criteria) this;
        }

        public Criteria andMetatileLessThan(java.lang.String value) {
            addCriterion("metatile <", value, "metatile");
            return (Criteria) this;
        }

        public Criteria andMetatileLessThanOrEqualTo(java.lang.String value) {
            addCriterion("metatile <=", value, "metatile");
            return (Criteria) this;
        }


        public Criteria andMetatileIn(List<java.lang.String > values) {
            addCriterion("metatile in", values, "metatile");
            return (Criteria) this;
        }

        public Criteria andMetatileNotIn(List<java.lang.String> values) {
            addCriterion("metatile not in", values, "metatile");
            return (Criteria) this;
        }

        public Criteria andMetatileBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("metatile between", value1, value2, "metatile");
            return (Criteria) this;
        }

        public Criteria andMetatileNotBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("metatile not between", value1, value2, "metatile");
            return (Criteria) this;
        }



        public Criteria andMetakeywordIsNull() {
            addCriterion("metakeyword is null");
            return (Criteria) this;
        }


        public Criteria andMetakeywordIsNotNull() {
            addCriterion("metakeyword is not null");
            return (Criteria) this;
        }

        public Criteria andMetakeywordEqualTo(java.lang.String value) {
            addCriterion("metakeyword =", value, "metakeyword");
            return (Criteria) this;
        }

        public Criteria andMetakeywordNotEqualTo(java.lang.String value) {
            addCriterion("metakeyword <>", value, "metakeyword");
            return (Criteria) this;
        }

        public Criteria andMetakeywordGreaterThan(java.lang.String value) {
            addCriterion("metakeyword >", value, "metakeyword");
            return (Criteria) this;
        }

        public Criteria andMetakeywordGreaterThanOrEqualTo(java.lang.String value) {
            addCriterion("metakeyword >=", value, "metakeyword");
            return (Criteria) this;
        }

        public Criteria andMetakeywordLessThan(java.lang.String value) {
            addCriterion("metakeyword <", value, "metakeyword");
            return (Criteria) this;
        }

        public Criteria andMetakeywordLessThanOrEqualTo(java.lang.String value) {
            addCriterion("metakeyword <=", value, "metakeyword");
            return (Criteria) this;
        }


        public Criteria andMetakeywordIn(List<java.lang.String > values) {
            addCriterion("metakeyword in", values, "metakeyword");
            return (Criteria) this;
        }

        public Criteria andMetakeywordNotIn(List<java.lang.String> values) {
            addCriterion("metakeyword not in", values, "metakeyword");
            return (Criteria) this;
        }

        public Criteria andMetakeywordBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("metakeyword between", value1, value2, "metakeyword");
            return (Criteria) this;
        }

        public Criteria andMetakeywordNotBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("metakeyword not between", value1, value2, "metakeyword");
            return (Criteria) this;
        }



        public Criteria andMetadescIsNull() {
            addCriterion("metadesc is null");
            return (Criteria) this;
        }


        public Criteria andMetadescIsNotNull() {
            addCriterion("metadesc is not null");
            return (Criteria) this;
        }

        public Criteria andMetadescEqualTo(java.lang.String value) {
            addCriterion("metadesc =", value, "metadesc");
            return (Criteria) this;
        }

        public Criteria andMetadescNotEqualTo(java.lang.String value) {
            addCriterion("metadesc <>", value, "metadesc");
            return (Criteria) this;
        }

        public Criteria andMetadescGreaterThan(java.lang.String value) {
            addCriterion("metadesc >", value, "metadesc");
            return (Criteria) this;
        }

        public Criteria andMetadescGreaterThanOrEqualTo(java.lang.String value) {
            addCriterion("metadesc >=", value, "metadesc");
            return (Criteria) this;
        }

        public Criteria andMetadescLessThan(java.lang.String value) {
            addCriterion("metadesc <", value, "metadesc");
            return (Criteria) this;
        }

        public Criteria andMetadescLessThanOrEqualTo(java.lang.String value) {
            addCriterion("metadesc <=", value, "metadesc");
            return (Criteria) this;
        }


        public Criteria andMetadescIn(List<java.lang.String > values) {
            addCriterion("metadesc in", values, "metadesc");
            return (Criteria) this;
        }

        public Criteria andMetadescNotIn(List<java.lang.String> values) {
            addCriterion("metadesc not in", values, "metadesc");
            return (Criteria) this;
        }

        public Criteria andMetadescBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("metadesc between", value1, value2, "metadesc");
            return (Criteria) this;
        }

        public Criteria andMetadescNotBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("metadesc not between", value1, value2, "metadesc");
            return (Criteria) this;
        }



        public Criteria andLaptopModelIsNull() {
            addCriterion("laptopModel is null");
            return (Criteria) this;
        }


        public Criteria andLaptopModelIsNotNull() {
            addCriterion("laptopModel is not null");
            return (Criteria) this;
        }

        public Criteria andLaptopModelEqualTo(java.lang.String value) {
            addCriterion("laptop_model =", value, "laptopModel");
            return (Criteria) this;
        }

        public Criteria andLaptopModelNotEqualTo(java.lang.String value) {
            addCriterion("laptop_model <>", value, "laptopModel");
            return (Criteria) this;
        }

        public Criteria andLaptopModelGreaterThan(java.lang.String value) {
            addCriterion("laptop_model >", value, "laptopModel");
            return (Criteria) this;
        }

        public Criteria andLaptopModelGreaterThanOrEqualTo(java.lang.String value) {
            addCriterion("laptop_model >=", value, "laptop_model");
            return (Criteria) this;
        }

        public Criteria andLaptopModelLessThan(java.lang.String value) {
            addCriterion("laptop_model <", value, "laptopModel");
            return (Criteria) this;
        }

        public Criteria andLaptopModelLessThanOrEqualTo(java.lang.String value) {
            addCriterion("laptop_model <=", value, "laptopModel");
            return (Criteria) this;
        }


        public Criteria andLaptopModelIn(List<java.lang.String > values) {
            addCriterion("laptop_model in", values, "laptopModel");
            return (Criteria) this;
        }

        public Criteria andLaptopModelNotIn(List<java.lang.String> values) {
            addCriterion("laptop_model not in", values, "laptopModel");
            return (Criteria) this;
        }

        public Criteria andLaptopModelBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("laptop_model between", value1, value2, "laptopModel");
            return (Criteria) this;
        }

        public Criteria andLaptopModelNotBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("laptop_model not between", value1, value2, "laptopModel");
            return (Criteria) this;
        }



        public Criteria andReviewIsNull() {
            addCriterion("review is null");
            return (Criteria) this;
        }


        public Criteria andReviewIsNotNull() {
            addCriterion("review is not null");
            return (Criteria) this;
        }

        public Criteria andReviewEqualTo(java.lang.String value) {
            addCriterion("review =", value, "review");
            return (Criteria) this;
        }

        public Criteria andReviewNotEqualTo(java.lang.String value) {
            addCriterion("review <>", value, "review");
            return (Criteria) this;
        }

        public Criteria andReviewGreaterThan(java.lang.String value) {
            addCriterion("review >", value, "review");
            return (Criteria) this;
        }

        public Criteria andReviewGreaterThanOrEqualTo(java.lang.String value) {
            addCriterion("review >=", value, "review");
            return (Criteria) this;
        }

        public Criteria andReviewLessThan(java.lang.String value) {
            addCriterion("review <", value, "review");
            return (Criteria) this;
        }

        public Criteria andReviewLessThanOrEqualTo(java.lang.String value) {
            addCriterion("review <=", value, "review");
            return (Criteria) this;
        }


        public Criteria andReviewIn(List<java.lang.String > values) {
            addCriterion("review in", values, "review");
            return (Criteria) this;
        }

        public Criteria andReviewNotIn(List<java.lang.String> values) {
            addCriterion("review not in", values, "review");
            return (Criteria) this;
        }

        public Criteria andReviewBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("review between", value1, value2, "review");
            return (Criteria) this;
        }

        public Criteria andReviewNotBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("review not between", value1, value2, "review");
            return (Criteria) this;
        }



        public Criteria andSpecificationIsNull() {
            addCriterion("specification is null");
            return (Criteria) this;
        }


        public Criteria andSpecificationIsNotNull() {
            addCriterion("specification is not null");
            return (Criteria) this;
        }

        public Criteria andSpecificationEqualTo(java.lang.String value) {
            addCriterion("specification =", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationNotEqualTo(java.lang.String value) {
            addCriterion("specification <>", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationGreaterThan(java.lang.String value) {
            addCriterion("specification >", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationGreaterThanOrEqualTo(java.lang.String value) {
            addCriterion("specification >=", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationLessThan(java.lang.String value) {
            addCriterion("specification <", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationLessThanOrEqualTo(java.lang.String value) {
            addCriterion("specification <=", value, "specification");
            return (Criteria) this;
        }


        public Criteria andSpecificationIn(List<java.lang.String > values) {
            addCriterion("specification in", values, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationNotIn(List<java.lang.String> values) {
            addCriterion("specification not in", values, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("specification between", value1, value2, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationNotBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("specification not between", value1, value2, "specification");
            return (Criteria) this;
        }



        public Criteria andPartNumberIsNull() {
            addCriterion("partNumber is null");
            return (Criteria) this;
        }


        public Criteria andPartNumberIsNotNull() {
            addCriterion("partNumber is not null");
            return (Criteria) this;
        }

        public Criteria andPartNumberEqualTo(java.lang.String value) {
            addCriterion("part_number =", value, "partNumber");
            return (Criteria) this;
        }

        public Criteria andPartNumberNotEqualTo(java.lang.String value) {
            addCriterion("part_number <>", value, "partNumber");
            return (Criteria) this;
        }

        public Criteria andPartNumberGreaterThan(java.lang.String value) {
            addCriterion("part_number >", value, "partNumber");
            return (Criteria) this;
        }

        public Criteria andPartNumberGreaterThanOrEqualTo(java.lang.String value) {
            addCriterion("part_number >=", value, "part_number");
            return (Criteria) this;
        }

        public Criteria andPartNumberLessThan(java.lang.String value) {
            addCriterion("part_number <", value, "partNumber");
            return (Criteria) this;
        }

        public Criteria andPartNumberLessThanOrEqualTo(java.lang.String value) {
            addCriterion("part_number <=", value, "partNumber");
            return (Criteria) this;
        }


        public Criteria andPartNumberIn(List<java.lang.String > values) {
            addCriterion("part_number in", values, "partNumber");
            return (Criteria) this;
        }

        public Criteria andPartNumberNotIn(List<java.lang.String> values) {
            addCriterion("part_number not in", values, "partNumber");
            return (Criteria) this;
        }

        public Criteria andPartNumberBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("part_number between", value1, value2, "partNumber");
            return (Criteria) this;
        }

        public Criteria andPartNumberNotBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("part_number not between", value1, value2, "partNumber");
            return (Criteria) this;
        }



        public Criteria andPackagedescIsNull() {
            addCriterion("packagedesc is null");
            return (Criteria) this;
        }


        public Criteria andPackagedescIsNotNull() {
            addCriterion("packagedesc is not null");
            return (Criteria) this;
        }

        public Criteria andPackagedescEqualTo(java.lang.String value) {
            addCriterion("packagedesc =", value, "packagedesc");
            return (Criteria) this;
        }

        public Criteria andPackagedescNotEqualTo(java.lang.String value) {
            addCriterion("packagedesc <>", value, "packagedesc");
            return (Criteria) this;
        }

        public Criteria andPackagedescGreaterThan(java.lang.String value) {
            addCriterion("packagedesc >", value, "packagedesc");
            return (Criteria) this;
        }

        public Criteria andPackagedescGreaterThanOrEqualTo(java.lang.String value) {
            addCriterion("packagedesc >=", value, "packagedesc");
            return (Criteria) this;
        }

        public Criteria andPackagedescLessThan(java.lang.String value) {
            addCriterion("packagedesc <", value, "packagedesc");
            return (Criteria) this;
        }

        public Criteria andPackagedescLessThanOrEqualTo(java.lang.String value) {
            addCriterion("packagedesc <=", value, "packagedesc");
            return (Criteria) this;
        }


        public Criteria andPackagedescIn(List<java.lang.String > values) {
            addCriterion("packagedesc in", values, "packagedesc");
            return (Criteria) this;
        }

        public Criteria andPackagedescNotIn(List<java.lang.String> values) {
            addCriterion("packagedesc not in", values, "packagedesc");
            return (Criteria) this;
        }

        public Criteria andPackagedescBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("packagedesc between", value1, value2, "packagedesc");
            return (Criteria) this;
        }

        public Criteria andPackagedescNotBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("packagedesc not between", value1, value2, "packagedesc");
            return (Criteria) this;
        }



        public Criteria andWarrantyIsNull() {
            addCriterion("warranty is null");
            return (Criteria) this;
        }


        public Criteria andWarrantyIsNotNull() {
            addCriterion("warranty is not null");
            return (Criteria) this;
        }

        public Criteria andWarrantyEqualTo(java.lang.String value) {
            addCriterion("warranty =", value, "warranty");
            return (Criteria) this;
        }

        public Criteria andWarrantyNotEqualTo(java.lang.String value) {
            addCriterion("warranty <>", value, "warranty");
            return (Criteria) this;
        }

        public Criteria andWarrantyGreaterThan(java.lang.String value) {
            addCriterion("warranty >", value, "warranty");
            return (Criteria) this;
        }

        public Criteria andWarrantyGreaterThanOrEqualTo(java.lang.String value) {
            addCriterion("warranty >=", value, "warranty");
            return (Criteria) this;
        }

        public Criteria andWarrantyLessThan(java.lang.String value) {
            addCriterion("warranty <", value, "warranty");
            return (Criteria) this;
        }

        public Criteria andWarrantyLessThanOrEqualTo(java.lang.String value) {
            addCriterion("warranty <=", value, "warranty");
            return (Criteria) this;
        }


        public Criteria andWarrantyIn(List<java.lang.String > values) {
            addCriterion("warranty in", values, "warranty");
            return (Criteria) this;
        }

        public Criteria andWarrantyNotIn(List<java.lang.String> values) {
            addCriterion("warranty not in", values, "warranty");
            return (Criteria) this;
        }

        public Criteria andWarrantyBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("warranty between", value1, value2, "warranty");
            return (Criteria) this;
        }

        public Criteria andWarrantyNotBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("warranty not between", value1, value2, "warranty");
            return (Criteria) this;
        }



        public Criteria andSpecificationOriginalIsNull() {
            addCriterion("specificationOriginal is null");
            return (Criteria) this;
        }


        public Criteria andSpecificationOriginalIsNotNull() {
            addCriterion("specificationOriginal is not null");
            return (Criteria) this;
        }

        public Criteria andSpecificationOriginalEqualTo(java.lang.String value) {
            addCriterion("specification_original =", value, "specificationOriginal");
            return (Criteria) this;
        }

        public Criteria andSpecificationOriginalNotEqualTo(java.lang.String value) {
            addCriterion("specification_original <>", value, "specificationOriginal");
            return (Criteria) this;
        }

        public Criteria andSpecificationOriginalGreaterThan(java.lang.String value) {
            addCriterion("specification_original >", value, "specificationOriginal");
            return (Criteria) this;
        }

        public Criteria andSpecificationOriginalGreaterThanOrEqualTo(java.lang.String value) {
            addCriterion("specification_original >=", value, "specification_original");
            return (Criteria) this;
        }

        public Criteria andSpecificationOriginalLessThan(java.lang.String value) {
            addCriterion("specification_original <", value, "specificationOriginal");
            return (Criteria) this;
        }

        public Criteria andSpecificationOriginalLessThanOrEqualTo(java.lang.String value) {
            addCriterion("specification_original <=", value, "specificationOriginal");
            return (Criteria) this;
        }


        public Criteria andSpecificationOriginalIn(List<java.lang.String > values) {
            addCriterion("specification_original in", values, "specificationOriginal");
            return (Criteria) this;
        }

        public Criteria andSpecificationOriginalNotIn(List<java.lang.String> values) {
            addCriterion("specification_original not in", values, "specificationOriginal");
            return (Criteria) this;
        }

        public Criteria andSpecificationOriginalBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("specification_original between", value1, value2, "specificationOriginal");
            return (Criteria) this;
        }

        public Criteria andSpecificationOriginalNotBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("specification_original not between", value1, value2, "specificationOriginal");
            return (Criteria) this;
        }



        public Criteria andFlagIsNull() {
            addCriterion("flag is null");
            return (Criteria) this;
        }


        public Criteria andFlagIsNotNull() {
            addCriterion("flag is not null");
            return (Criteria) this;
        }

        public Criteria andFlagEqualTo(java.lang.Boolean value) {
            addCriterion("flag =", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotEqualTo(java.lang.Boolean value) {
            addCriterion("flag <>", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThan(java.lang.Boolean value) {
            addCriterion("flag >", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThanOrEqualTo(java.lang.Boolean value) {
            addCriterion("flag >=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThan(java.lang.Boolean value) {
            addCriterion("flag <", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThanOrEqualTo(java.lang.Boolean value) {
            addCriterion("flag <=", value, "flag");
            return (Criteria) this;
        }


        public Criteria andFlagIn(List<java.lang.Boolean > values) {
            addCriterion("flag in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotIn(List<java.lang.Boolean> values) {
            addCriterion("flag not in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagBetween(java.lang.Boolean value1, java.lang.Boolean value2) {
            addCriterion("flag between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotBetween(java.lang.Boolean value1, java.lang.Boolean value2) {
            addCriterion("flag not between", value1, value2, "flag");
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