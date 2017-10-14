package com.sunvalley.erp.product.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.math.BigDecimal;

/**
* @Description: VideoExample
* @author
* @date 2017-10-13 02:14:05
*/
public class VideoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private int pageIndex;

    private int pageSize;

    public VideoExample() {
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

    public VideoExample(int pageSize, int pageIndex) {
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
        
        public Criteria andVideoIdIsNull() {
            addCriterion("videoId is null");
            return (Criteria) this;
        }


        public Criteria andVideoIdIsNotNull() {
            addCriterion("videoId is not null");
            return (Criteria) this;
        }

        public Criteria andVideoIdEqualTo(java.lang.Integer value) {
            addCriterion("video_id =", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdNotEqualTo(java.lang.Integer value) {
            addCriterion("video_id <>", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdGreaterThan(java.lang.Integer value) {
            addCriterion("video_id >", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("video_id >=", value, "video_id");
            return (Criteria) this;
        }

        public Criteria andVideoIdLessThan(java.lang.Integer value) {
            addCriterion("video_id <", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("video_id <=", value, "videoId");
            return (Criteria) this;
        }


        public Criteria andVideoIdIn(List<java.lang.Integer > values) {
            addCriterion("video_id in", values, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdNotIn(List<java.lang.Integer> values) {
            addCriterion("video_id not in", values, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("video_id between", value1, value2, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdNotBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("video_id not between", value1, value2, "videoId");
            return (Criteria) this;
        }



        public Criteria andVideoTypeIsNull() {
            addCriterion("videoType is null");
            return (Criteria) this;
        }


        public Criteria andVideoTypeIsNotNull() {
            addCriterion("videoType is not null");
            return (Criteria) this;
        }

        public Criteria andVideoTypeEqualTo(java.lang.Integer value) {
            addCriterion("video_type =", value, "videoType");
            return (Criteria) this;
        }

        public Criteria andVideoTypeNotEqualTo(java.lang.Integer value) {
            addCriterion("video_type <>", value, "videoType");
            return (Criteria) this;
        }

        public Criteria andVideoTypeGreaterThan(java.lang.Integer value) {
            addCriterion("video_type >", value, "videoType");
            return (Criteria) this;
        }

        public Criteria andVideoTypeGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("video_type >=", value, "video_type");
            return (Criteria) this;
        }

        public Criteria andVideoTypeLessThan(java.lang.Integer value) {
            addCriterion("video_type <", value, "videoType");
            return (Criteria) this;
        }

        public Criteria andVideoTypeLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("video_type <=", value, "videoType");
            return (Criteria) this;
        }


        public Criteria andVideoTypeIn(List<java.lang.Integer > values) {
            addCriterion("video_type in", values, "videoType");
            return (Criteria) this;
        }

        public Criteria andVideoTypeNotIn(List<java.lang.Integer> values) {
            addCriterion("video_type not in", values, "videoType");
            return (Criteria) this;
        }

        public Criteria andVideoTypeBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("video_type between", value1, value2, "videoType");
            return (Criteria) this;
        }

        public Criteria andVideoTypeNotBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("video_type not between", value1, value2, "videoType");
            return (Criteria) this;
        }



        public Criteria andVideoNameIsNull() {
            addCriterion("videoName is null");
            return (Criteria) this;
        }


        public Criteria andVideoNameIsNotNull() {
            addCriterion("videoName is not null");
            return (Criteria) this;
        }

        public Criteria andVideoNameEqualTo(java.lang.String value) {
            addCriterion("video_name =", value, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameNotEqualTo(java.lang.String value) {
            addCriterion("video_name <>", value, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameGreaterThan(java.lang.String value) {
            addCriterion("video_name >", value, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameGreaterThanOrEqualTo(java.lang.String value) {
            addCriterion("video_name >=", value, "video_name");
            return (Criteria) this;
        }

        public Criteria andVideoNameLessThan(java.lang.String value) {
            addCriterion("video_name <", value, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameLessThanOrEqualTo(java.lang.String value) {
            addCriterion("video_name <=", value, "videoName");
            return (Criteria) this;
        }


        public Criteria andVideoNameIn(List<java.lang.String > values) {
            addCriterion("video_name in", values, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameNotIn(List<java.lang.String> values) {
            addCriterion("video_name not in", values, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("video_name between", value1, value2, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameNotBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("video_name not between", value1, value2, "videoName");
            return (Criteria) this;
        }



        public Criteria andObjectIdIsNull() {
            addCriterion("objectId is null");
            return (Criteria) this;
        }


        public Criteria andObjectIdIsNotNull() {
            addCriterion("objectId is not null");
            return (Criteria) this;
        }

        public Criteria andObjectIdEqualTo(java.lang.Integer value) {
            addCriterion("object_id =", value, "objectId");
            return (Criteria) this;
        }

        public Criteria andObjectIdNotEqualTo(java.lang.Integer value) {
            addCriterion("object_id <>", value, "objectId");
            return (Criteria) this;
        }

        public Criteria andObjectIdGreaterThan(java.lang.Integer value) {
            addCriterion("object_id >", value, "objectId");
            return (Criteria) this;
        }

        public Criteria andObjectIdGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("object_id >=", value, "object_id");
            return (Criteria) this;
        }

        public Criteria andObjectIdLessThan(java.lang.Integer value) {
            addCriterion("object_id <", value, "objectId");
            return (Criteria) this;
        }

        public Criteria andObjectIdLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("object_id <=", value, "objectId");
            return (Criteria) this;
        }


        public Criteria andObjectIdIn(List<java.lang.Integer > values) {
            addCriterion("object_id in", values, "objectId");
            return (Criteria) this;
        }

        public Criteria andObjectIdNotIn(List<java.lang.Integer> values) {
            addCriterion("object_id not in", values, "objectId");
            return (Criteria) this;
        }

        public Criteria andObjectIdBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("object_id between", value1, value2, "objectId");
            return (Criteria) this;
        }

        public Criteria andObjectIdNotBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("object_id not between", value1, value2, "objectId");
            return (Criteria) this;
        }



        public Criteria andVideoUrlIsNull() {
            addCriterion("videoUrl is null");
            return (Criteria) this;
        }


        public Criteria andVideoUrlIsNotNull() {
            addCriterion("videoUrl is not null");
            return (Criteria) this;
        }

        public Criteria andVideoUrlEqualTo(java.lang.String value) {
            addCriterion("video_url =", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlNotEqualTo(java.lang.String value) {
            addCriterion("video_url <>", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlGreaterThan(java.lang.String value) {
            addCriterion("video_url >", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlGreaterThanOrEqualTo(java.lang.String value) {
            addCriterion("video_url >=", value, "video_url");
            return (Criteria) this;
        }

        public Criteria andVideoUrlLessThan(java.lang.String value) {
            addCriterion("video_url <", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlLessThanOrEqualTo(java.lang.String value) {
            addCriterion("video_url <=", value, "videoUrl");
            return (Criteria) this;
        }


        public Criteria andVideoUrlIn(List<java.lang.String > values) {
            addCriterion("video_url in", values, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlNotIn(List<java.lang.String> values) {
            addCriterion("video_url not in", values, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("video_url between", value1, value2, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlNotBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("video_url not between", value1, value2, "videoUrl");
            return (Criteria) this;
        }



        public Criteria andSortNumIsNull() {
            addCriterion("sortNum is null");
            return (Criteria) this;
        }


        public Criteria andSortNumIsNotNull() {
            addCriterion("sortNum is not null");
            return (Criteria) this;
        }

        public Criteria andSortNumEqualTo(java.lang.Integer value) {
            addCriterion("sort_num =", value, "sortNum");
            return (Criteria) this;
        }

        public Criteria andSortNumNotEqualTo(java.lang.Integer value) {
            addCriterion("sort_num <>", value, "sortNum");
            return (Criteria) this;
        }

        public Criteria andSortNumGreaterThan(java.lang.Integer value) {
            addCriterion("sort_num >", value, "sortNum");
            return (Criteria) this;
        }

        public Criteria andSortNumGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("sort_num >=", value, "sort_num");
            return (Criteria) this;
        }

        public Criteria andSortNumLessThan(java.lang.Integer value) {
            addCriterion("sort_num <", value, "sortNum");
            return (Criteria) this;
        }

        public Criteria andSortNumLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("sort_num <=", value, "sortNum");
            return (Criteria) this;
        }


        public Criteria andSortNumIn(List<java.lang.Integer > values) {
            addCriterion("sort_num in", values, "sortNum");
            return (Criteria) this;
        }

        public Criteria andSortNumNotIn(List<java.lang.Integer> values) {
            addCriterion("sort_num not in", values, "sortNum");
            return (Criteria) this;
        }

        public Criteria andSortNumBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("sort_num between", value1, value2, "sortNum");
            return (Criteria) this;
        }

        public Criteria andSortNumNotBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("sort_num not between", value1, value2, "sortNum");
            return (Criteria) this;
        }



        public Criteria andUserIdIsNull() {
            addCriterion("userId is null");
            return (Criteria) this;
        }


        public Criteria andUserIdIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(java.lang.Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(java.lang.Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(java.lang.Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("user_id >=", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(java.lang.Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }


        public Criteria andUserIdIn(List<java.lang.Integer > values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<java.lang.Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
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

        public Criteria andWidthEqualTo(java.lang.Integer value) {
            addCriterion("width =", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthNotEqualTo(java.lang.Integer value) {
            addCriterion("width <>", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthGreaterThan(java.lang.Integer value) {
            addCriterion("width >", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("width >=", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthLessThan(java.lang.Integer value) {
            addCriterion("width <", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("width <=", value, "width");
            return (Criteria) this;
        }


        public Criteria andWidthIn(List<java.lang.Integer > values) {
            addCriterion("width in", values, "width");
            return (Criteria) this;
        }

        public Criteria andWidthNotIn(List<java.lang.Integer> values) {
            addCriterion("width not in", values, "width");
            return (Criteria) this;
        }

        public Criteria andWidthBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("width between", value1, value2, "width");
            return (Criteria) this;
        }

        public Criteria andWidthNotBetween(java.lang.Integer value1, java.lang.Integer value2) {
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

        public Criteria andHeightEqualTo(java.lang.Integer value) {
            addCriterion("height =", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotEqualTo(java.lang.Integer value) {
            addCriterion("height <>", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThan(java.lang.Integer value) {
            addCriterion("height >", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("height >=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThan(java.lang.Integer value) {
            addCriterion("height <", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("height <=", value, "height");
            return (Criteria) this;
        }


        public Criteria andHeightIn(List<java.lang.Integer > values) {
            addCriterion("height in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotIn(List<java.lang.Integer> values) {
            addCriterion("height not in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("height between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("height not between", value1, value2, "height");
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



        public Criteria andDeletedIsNull() {
            addCriterion("deleted is null");
            return (Criteria) this;
        }


        public Criteria andDeletedIsNotNull() {
            addCriterion("deleted is not null");
            return (Criteria) this;
        }

        public Criteria andDeletedEqualTo(java.lang.Integer value) {
            addCriterion("deleted =", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotEqualTo(java.lang.Integer value) {
            addCriterion("deleted <>", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThan(java.lang.Integer value) {
            addCriterion("deleted >", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("deleted >=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThan(java.lang.Integer value) {
            addCriterion("deleted <", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("deleted <=", value, "deleted");
            return (Criteria) this;
        }


        public Criteria andDeletedIn(List<java.lang.Integer > values) {
            addCriterion("deleted in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotIn(List<java.lang.Integer> values) {
            addCriterion("deleted not in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("deleted between", value1, value2, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("deleted not between", value1, value2, "deleted");
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