package com.sunvalley.erp.product.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.math.BigDecimal;

/**
* @Description: MarketAccountExample
* @author
* @date 2017-10-12 12:52:58
*/
public class MarketAccountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private int pageIndex;

    private int pageSize;

    public MarketAccountExample() {
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

    public MarketAccountExample(int pageSize, int pageIndex) {
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
        
        public Criteria andMaidIsNull() {
            addCriterion("maid is null");
            return (Criteria) this;
        }


        public Criteria andMaidIsNotNull() {
            addCriterion("maid is not null");
            return (Criteria) this;
        }

        public Criteria andMaidEqualTo(java.lang.Integer value) {
            addCriterion("m_a_id =", value, "maid");
            return (Criteria) this;
        }

        public Criteria andMaidNotEqualTo(java.lang.Integer value) {
            addCriterion("m_a_id <>", value, "maid");
            return (Criteria) this;
        }

        public Criteria andMaidGreaterThan(java.lang.Integer value) {
            addCriterion("m_a_id >", value, "maid");
            return (Criteria) this;
        }

        public Criteria andMaidGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("m_a_id >=", value, "m_a_id");
            return (Criteria) this;
        }

        public Criteria andMaidLessThan(java.lang.Integer value) {
            addCriterion("m_a_id <", value, "maid");
            return (Criteria) this;
        }

        public Criteria andMaidLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("m_a_id <=", value, "maid");
            return (Criteria) this;
        }


        public Criteria andMaidIn(List<java.lang.Integer > values) {
            addCriterion("m_a_id in", values, "maid");
            return (Criteria) this;
        }

        public Criteria andMaidNotIn(List<java.lang.Integer> values) {
            addCriterion("m_a_id not in", values, "maid");
            return (Criteria) this;
        }

        public Criteria andMaidBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("m_a_id between", value1, value2, "maid");
            return (Criteria) this;
        }

        public Criteria andMaidNotBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("m_a_id not between", value1, value2, "maid");
            return (Criteria) this;
        }



        public Criteria andMarketIdIsNull() {
            addCriterion("marketId is null");
            return (Criteria) this;
        }


        public Criteria andMarketIdIsNotNull() {
            addCriterion("marketId is not null");
            return (Criteria) this;
        }

        public Criteria andMarketIdEqualTo(java.lang.Integer value) {
            addCriterion("market_id =", value, "marketId");
            return (Criteria) this;
        }

        public Criteria andMarketIdNotEqualTo(java.lang.Integer value) {
            addCriterion("market_id <>", value, "marketId");
            return (Criteria) this;
        }

        public Criteria andMarketIdGreaterThan(java.lang.Integer value) {
            addCriterion("market_id >", value, "marketId");
            return (Criteria) this;
        }

        public Criteria andMarketIdGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("market_id >=", value, "market_id");
            return (Criteria) this;
        }

        public Criteria andMarketIdLessThan(java.lang.Integer value) {
            addCriterion("market_id <", value, "marketId");
            return (Criteria) this;
        }

        public Criteria andMarketIdLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("market_id <=", value, "marketId");
            return (Criteria) this;
        }


        public Criteria andMarketIdIn(List<java.lang.Integer > values) {
            addCriterion("market_id in", values, "marketId");
            return (Criteria) this;
        }

        public Criteria andMarketIdNotIn(List<java.lang.Integer> values) {
            addCriterion("market_id not in", values, "marketId");
            return (Criteria) this;
        }

        public Criteria andMarketIdBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("market_id between", value1, value2, "marketId");
            return (Criteria) this;
        }

        public Criteria andMarketIdNotBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("market_id not between", value1, value2, "marketId");
            return (Criteria) this;
        }



        public Criteria andAccountIsNull() {
            addCriterion("account is null");
            return (Criteria) this;
        }


        public Criteria andAccountIsNotNull() {
            addCriterion("account is not null");
            return (Criteria) this;
        }

        public Criteria andAccountEqualTo(java.lang.String value) {
            addCriterion("account =", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotEqualTo(java.lang.String value) {
            addCriterion("account <>", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThan(java.lang.String value) {
            addCriterion("account >", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThanOrEqualTo(java.lang.String value) {
            addCriterion("account >=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThan(java.lang.String value) {
            addCriterion("account <", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThanOrEqualTo(java.lang.String value) {
            addCriterion("account <=", value, "account");
            return (Criteria) this;
        }


        public Criteria andAccountIn(List<java.lang.String > values) {
            addCriterion("account in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotIn(List<java.lang.String> values) {
            addCriterion("account not in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("account between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("account not between", value1, value2, "account");
            return (Criteria) this;
        }



        public Criteria andAccountEmailIsNull() {
            addCriterion("accountEmail is null");
            return (Criteria) this;
        }


        public Criteria andAccountEmailIsNotNull() {
            addCriterion("accountEmail is not null");
            return (Criteria) this;
        }

        public Criteria andAccountEmailEqualTo(java.lang.String value) {
            addCriterion("account_email =", value, "accountEmail");
            return (Criteria) this;
        }

        public Criteria andAccountEmailNotEqualTo(java.lang.String value) {
            addCriterion("account_email <>", value, "accountEmail");
            return (Criteria) this;
        }

        public Criteria andAccountEmailGreaterThan(java.lang.String value) {
            addCriterion("account_email >", value, "accountEmail");
            return (Criteria) this;
        }

        public Criteria andAccountEmailGreaterThanOrEqualTo(java.lang.String value) {
            addCriterion("account_email >=", value, "account_email");
            return (Criteria) this;
        }

        public Criteria andAccountEmailLessThan(java.lang.String value) {
            addCriterion("account_email <", value, "accountEmail");
            return (Criteria) this;
        }

        public Criteria andAccountEmailLessThanOrEqualTo(java.lang.String value) {
            addCriterion("account_email <=", value, "accountEmail");
            return (Criteria) this;
        }


        public Criteria andAccountEmailIn(List<java.lang.String > values) {
            addCriterion("account_email in", values, "accountEmail");
            return (Criteria) this;
        }

        public Criteria andAccountEmailNotIn(List<java.lang.String> values) {
            addCriterion("account_email not in", values, "accountEmail");
            return (Criteria) this;
        }

        public Criteria andAccountEmailBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("account_email between", value1, value2, "accountEmail");
            return (Criteria) this;
        }

        public Criteria andAccountEmailNotBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("account_email not between", value1, value2, "accountEmail");
            return (Criteria) this;
        }



        public Criteria andPaypalEmailIsNull() {
            addCriterion("paypalEmail is null");
            return (Criteria) this;
        }


        public Criteria andPaypalEmailIsNotNull() {
            addCriterion("paypalEmail is not null");
            return (Criteria) this;
        }

        public Criteria andPaypalEmailEqualTo(java.lang.String value) {
            addCriterion("paypal_email =", value, "paypalEmail");
            return (Criteria) this;
        }

        public Criteria andPaypalEmailNotEqualTo(java.lang.String value) {
            addCriterion("paypal_email <>", value, "paypalEmail");
            return (Criteria) this;
        }

        public Criteria andPaypalEmailGreaterThan(java.lang.String value) {
            addCriterion("paypal_email >", value, "paypalEmail");
            return (Criteria) this;
        }

        public Criteria andPaypalEmailGreaterThanOrEqualTo(java.lang.String value) {
            addCriterion("paypal_email >=", value, "paypal_email");
            return (Criteria) this;
        }

        public Criteria andPaypalEmailLessThan(java.lang.String value) {
            addCriterion("paypal_email <", value, "paypalEmail");
            return (Criteria) this;
        }

        public Criteria andPaypalEmailLessThanOrEqualTo(java.lang.String value) {
            addCriterion("paypal_email <=", value, "paypalEmail");
            return (Criteria) this;
        }


        public Criteria andPaypalEmailIn(List<java.lang.String > values) {
            addCriterion("paypal_email in", values, "paypalEmail");
            return (Criteria) this;
        }

        public Criteria andPaypalEmailNotIn(List<java.lang.String> values) {
            addCriterion("paypal_email not in", values, "paypalEmail");
            return (Criteria) this;
        }

        public Criteria andPaypalEmailBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("paypal_email between", value1, value2, "paypalEmail");
            return (Criteria) this;
        }

        public Criteria andPaypalEmailNotBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("paypal_email not between", value1, value2, "paypalEmail");
            return (Criteria) this;
        }



        public Criteria andSmtpEmailIsNull() {
            addCriterion("smtpEmail is null");
            return (Criteria) this;
        }


        public Criteria andSmtpEmailIsNotNull() {
            addCriterion("smtpEmail is not null");
            return (Criteria) this;
        }

        public Criteria andSmtpEmailEqualTo(java.lang.String value) {
            addCriterion("smtp_email =", value, "smtpEmail");
            return (Criteria) this;
        }

        public Criteria andSmtpEmailNotEqualTo(java.lang.String value) {
            addCriterion("smtp_email <>", value, "smtpEmail");
            return (Criteria) this;
        }

        public Criteria andSmtpEmailGreaterThan(java.lang.String value) {
            addCriterion("smtp_email >", value, "smtpEmail");
            return (Criteria) this;
        }

        public Criteria andSmtpEmailGreaterThanOrEqualTo(java.lang.String value) {
            addCriterion("smtp_email >=", value, "smtp_email");
            return (Criteria) this;
        }

        public Criteria andSmtpEmailLessThan(java.lang.String value) {
            addCriterion("smtp_email <", value, "smtpEmail");
            return (Criteria) this;
        }

        public Criteria andSmtpEmailLessThanOrEqualTo(java.lang.String value) {
            addCriterion("smtp_email <=", value, "smtpEmail");
            return (Criteria) this;
        }


        public Criteria andSmtpEmailIn(List<java.lang.String > values) {
            addCriterion("smtp_email in", values, "smtpEmail");
            return (Criteria) this;
        }

        public Criteria andSmtpEmailNotIn(List<java.lang.String> values) {
            addCriterion("smtp_email not in", values, "smtpEmail");
            return (Criteria) this;
        }

        public Criteria andSmtpEmailBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("smtp_email between", value1, value2, "smtpEmail");
            return (Criteria) this;
        }

        public Criteria andSmtpEmailNotBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("smtp_email not between", value1, value2, "smtpEmail");
            return (Criteria) this;
        }



        public Criteria andEmailPasswordIsNull() {
            addCriterion("emailPassword is null");
            return (Criteria) this;
        }


        public Criteria andEmailPasswordIsNotNull() {
            addCriterion("emailPassword is not null");
            return (Criteria) this;
        }

        public Criteria andEmailPasswordEqualTo(java.lang.String value) {
            addCriterion("email_password =", value, "emailPassword");
            return (Criteria) this;
        }

        public Criteria andEmailPasswordNotEqualTo(java.lang.String value) {
            addCriterion("email_password <>", value, "emailPassword");
            return (Criteria) this;
        }

        public Criteria andEmailPasswordGreaterThan(java.lang.String value) {
            addCriterion("email_password >", value, "emailPassword");
            return (Criteria) this;
        }

        public Criteria andEmailPasswordGreaterThanOrEqualTo(java.lang.String value) {
            addCriterion("email_password >=", value, "email_password");
            return (Criteria) this;
        }

        public Criteria andEmailPasswordLessThan(java.lang.String value) {
            addCriterion("email_password <", value, "emailPassword");
            return (Criteria) this;
        }

        public Criteria andEmailPasswordLessThanOrEqualTo(java.lang.String value) {
            addCriterion("email_password <=", value, "emailPassword");
            return (Criteria) this;
        }


        public Criteria andEmailPasswordIn(List<java.lang.String > values) {
            addCriterion("email_password in", values, "emailPassword");
            return (Criteria) this;
        }

        public Criteria andEmailPasswordNotIn(List<java.lang.String> values) {
            addCriterion("email_password not in", values, "emailPassword");
            return (Criteria) this;
        }

        public Criteria andEmailPasswordBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("email_password between", value1, value2, "emailPassword");
            return (Criteria) this;
        }

        public Criteria andEmailPasswordNotBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("email_password not between", value1, value2, "emailPassword");
            return (Criteria) this;
        }



        public Criteria andTplIdIsNull() {
            addCriterion("tplId is null");
            return (Criteria) this;
        }


        public Criteria andTplIdIsNotNull() {
            addCriterion("tplId is not null");
            return (Criteria) this;
        }

        public Criteria andTplIdEqualTo(java.lang.Integer value) {
            addCriterion("tpl_id =", value, "tplId");
            return (Criteria) this;
        }

        public Criteria andTplIdNotEqualTo(java.lang.Integer value) {
            addCriterion("tpl_id <>", value, "tplId");
            return (Criteria) this;
        }

        public Criteria andTplIdGreaterThan(java.lang.Integer value) {
            addCriterion("tpl_id >", value, "tplId");
            return (Criteria) this;
        }

        public Criteria andTplIdGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("tpl_id >=", value, "tpl_id");
            return (Criteria) this;
        }

        public Criteria andTplIdLessThan(java.lang.Integer value) {
            addCriterion("tpl_id <", value, "tplId");
            return (Criteria) this;
        }

        public Criteria andTplIdLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("tpl_id <=", value, "tplId");
            return (Criteria) this;
        }


        public Criteria andTplIdIn(List<java.lang.Integer > values) {
            addCriterion("tpl_id in", values, "tplId");
            return (Criteria) this;
        }

        public Criteria andTplIdNotIn(List<java.lang.Integer> values) {
            addCriterion("tpl_id not in", values, "tplId");
            return (Criteria) this;
        }

        public Criteria andTplIdBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("tpl_id between", value1, value2, "tplId");
            return (Criteria) this;
        }

        public Criteria andTplIdNotBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("tpl_id not between", value1, value2, "tplId");
            return (Criteria) this;
        }



        public Criteria andSmtpIdIsNull() {
            addCriterion("smtpId is null");
            return (Criteria) this;
        }


        public Criteria andSmtpIdIsNotNull() {
            addCriterion("smtpId is not null");
            return (Criteria) this;
        }

        public Criteria andSmtpIdEqualTo(java.lang.Integer value) {
            addCriterion("smtp_id =", value, "smtpId");
            return (Criteria) this;
        }

        public Criteria andSmtpIdNotEqualTo(java.lang.Integer value) {
            addCriterion("smtp_id <>", value, "smtpId");
            return (Criteria) this;
        }

        public Criteria andSmtpIdGreaterThan(java.lang.Integer value) {
            addCriterion("smtp_id >", value, "smtpId");
            return (Criteria) this;
        }

        public Criteria andSmtpIdGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("smtp_id >=", value, "smtp_id");
            return (Criteria) this;
        }

        public Criteria andSmtpIdLessThan(java.lang.Integer value) {
            addCriterion("smtp_id <", value, "smtpId");
            return (Criteria) this;
        }

        public Criteria andSmtpIdLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("smtp_id <=", value, "smtpId");
            return (Criteria) this;
        }


        public Criteria andSmtpIdIn(List<java.lang.Integer > values) {
            addCriterion("smtp_id in", values, "smtpId");
            return (Criteria) this;
        }

        public Criteria andSmtpIdNotIn(List<java.lang.Integer> values) {
            addCriterion("smtp_id not in", values, "smtpId");
            return (Criteria) this;
        }

        public Criteria andSmtpIdBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("smtp_id between", value1, value2, "smtpId");
            return (Criteria) this;
        }

        public Criteria andSmtpIdNotBetween(java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("smtp_id not between", value1, value2, "smtpId");
            return (Criteria) this;
        }



        public Criteria andRpcUrlIsNull() {
            addCriterion("rpcUrl is null");
            return (Criteria) this;
        }


        public Criteria andRpcUrlIsNotNull() {
            addCriterion("rpcUrl is not null");
            return (Criteria) this;
        }

        public Criteria andRpcUrlEqualTo(java.lang.String value) {
            addCriterion("rpc_url =", value, "rpcUrl");
            return (Criteria) this;
        }

        public Criteria andRpcUrlNotEqualTo(java.lang.String value) {
            addCriterion("rpc_url <>", value, "rpcUrl");
            return (Criteria) this;
        }

        public Criteria andRpcUrlGreaterThan(java.lang.String value) {
            addCriterion("rpc_url >", value, "rpcUrl");
            return (Criteria) this;
        }

        public Criteria andRpcUrlGreaterThanOrEqualTo(java.lang.String value) {
            addCriterion("rpc_url >=", value, "rpc_url");
            return (Criteria) this;
        }

        public Criteria andRpcUrlLessThan(java.lang.String value) {
            addCriterion("rpc_url <", value, "rpcUrl");
            return (Criteria) this;
        }

        public Criteria andRpcUrlLessThanOrEqualTo(java.lang.String value) {
            addCriterion("rpc_url <=", value, "rpcUrl");
            return (Criteria) this;
        }


        public Criteria andRpcUrlIn(List<java.lang.String > values) {
            addCriterion("rpc_url in", values, "rpcUrl");
            return (Criteria) this;
        }

        public Criteria andRpcUrlNotIn(List<java.lang.String> values) {
            addCriterion("rpc_url not in", values, "rpcUrl");
            return (Criteria) this;
        }

        public Criteria andRpcUrlBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("rpc_url between", value1, value2, "rpcUrl");
            return (Criteria) this;
        }

        public Criteria andRpcUrlNotBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("rpc_url not between", value1, value2, "rpcUrl");
            return (Criteria) this;
        }



        public Criteria andChannelClassIsNull() {
            addCriterion("channelClass is null");
            return (Criteria) this;
        }


        public Criteria andChannelClassIsNotNull() {
            addCriterion("channelClass is not null");
            return (Criteria) this;
        }

        public Criteria andChannelClassEqualTo(Integer value) {
            addCriterion("channel_class =", value, "channelClass");
            return (Criteria) this;
        }

        public Criteria andChannelClassNotEqualTo(Integer value) {
            addCriterion("channel_class <>", value, "channelClass");
            return (Criteria) this;
        }

        public Criteria andChannelClassGreaterThan(Integer value) {
            addCriterion("channel_class >", value, "channelClass");
            return (Criteria) this;
        }

        public Criteria andChannelClassGreaterThanOrEqualTo(Integer value) {
            addCriterion("channel_class >=", value, "channel_class");
            return (Criteria) this;
        }

        public Criteria andChannelClassLessThan(Integer value) {
            addCriterion("channel_class <", value, "channelClass");
            return (Criteria) this;
        }

        public Criteria andChannelClassLessThanOrEqualTo(Integer value) {
            addCriterion("channel_class <=", value, "channelClass");
            return (Criteria) this;
        }


        public Criteria andChannelClassIn(List<Integer > values) {
            addCriterion("channel_class in", values, "channelClass");
            return (Criteria) this;
        }

        public Criteria andChannelClassNotIn(List<Integer> values) {
            addCriterion("channel_class not in", values, "channelClass");
            return (Criteria) this;
        }

        public Criteria andChannelClassBetween(Integer value1, Integer value2) {
            addCriterion("channel_class between", value1, value2, "channelClass");
            return (Criteria) this;
        }

        public Criteria andChannelClassNotBetween(Integer value1, Integer value2) {
            addCriterion("channel_class not between", value1, value2, "channelClass");
            return (Criteria) this;
        }



        public Criteria andAbbreviationIsNull() {
            addCriterion("abbreviation is null");
            return (Criteria) this;
        }


        public Criteria andAbbreviationIsNotNull() {
            addCriterion("abbreviation is not null");
            return (Criteria) this;
        }

        public Criteria andAbbreviationEqualTo(java.lang.String value) {
            addCriterion("abbreviation =", value, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationNotEqualTo(java.lang.String value) {
            addCriterion("abbreviation <>", value, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationGreaterThan(java.lang.String value) {
            addCriterion("abbreviation >", value, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationGreaterThanOrEqualTo(java.lang.String value) {
            addCriterion("abbreviation >=", value, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationLessThan(java.lang.String value) {
            addCriterion("abbreviation <", value, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationLessThanOrEqualTo(java.lang.String value) {
            addCriterion("abbreviation <=", value, "abbreviation");
            return (Criteria) this;
        }


        public Criteria andAbbreviationIn(List<java.lang.String > values) {
            addCriterion("abbreviation in", values, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationNotIn(List<java.lang.String> values) {
            addCriterion("abbreviation not in", values, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("abbreviation between", value1, value2, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationNotBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("abbreviation not between", value1, value2, "abbreviation");
            return (Criteria) this;
        }



        public Criteria andImgUrlIsNull() {
            addCriterion("imgUrl is null");
            return (Criteria) this;
        }


        public Criteria andImgUrlIsNotNull() {
            addCriterion("imgUrl is not null");
            return (Criteria) this;
        }

        public Criteria andImgUrlEqualTo(java.lang.String value) {
            addCriterion("img_url =", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotEqualTo(java.lang.String value) {
            addCriterion("img_url <>", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlGreaterThan(java.lang.String value) {
            addCriterion("img_url >", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlGreaterThanOrEqualTo(java.lang.String value) {
            addCriterion("img_url >=", value, "img_url");
            return (Criteria) this;
        }

        public Criteria andImgUrlLessThan(java.lang.String value) {
            addCriterion("img_url <", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlLessThanOrEqualTo(java.lang.String value) {
            addCriterion("img_url <=", value, "imgUrl");
            return (Criteria) this;
        }


        public Criteria andImgUrlIn(List<java.lang.String > values) {
            addCriterion("img_url in", values, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotIn(List<java.lang.String> values) {
            addCriterion("img_url not in", values, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("img_url between", value1, value2, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("img_url not between", value1, value2, "imgUrl");
            return (Criteria) this;
        }



        public Criteria andMailCenterIdIsNull() {
            addCriterion("mailCenterId is null");
            return (Criteria) this;
        }


        public Criteria andMailCenterIdIsNotNull() {
            addCriterion("mailCenterId is not null");
            return (Criteria) this;
        }

        public Criteria andMailCenterIdEqualTo(java.lang.String value) {
            addCriterion("mail_center_id =", value, "mailCenterId");
            return (Criteria) this;
        }

        public Criteria andMailCenterIdNotEqualTo(java.lang.String value) {
            addCriterion("mail_center_id <>", value, "mailCenterId");
            return (Criteria) this;
        }

        public Criteria andMailCenterIdGreaterThan(java.lang.String value) {
            addCriterion("mail_center_id >", value, "mailCenterId");
            return (Criteria) this;
        }

        public Criteria andMailCenterIdGreaterThanOrEqualTo(java.lang.String value) {
            addCriterion("mail_center_id >=", value, "mail_center_id");
            return (Criteria) this;
        }

        public Criteria andMailCenterIdLessThan(java.lang.String value) {
            addCriterion("mail_center_id <", value, "mailCenterId");
            return (Criteria) this;
        }

        public Criteria andMailCenterIdLessThanOrEqualTo(java.lang.String value) {
            addCriterion("mail_center_id <=", value, "mailCenterId");
            return (Criteria) this;
        }


        public Criteria andMailCenterIdIn(List<java.lang.String > values) {
            addCriterion("mail_center_id in", values, "mailCenterId");
            return (Criteria) this;
        }

        public Criteria andMailCenterIdNotIn(List<java.lang.String> values) {
            addCriterion("mail_center_id not in", values, "mailCenterId");
            return (Criteria) this;
        }

        public Criteria andMailCenterIdBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("mail_center_id between", value1, value2, "mailCenterId");
            return (Criteria) this;
        }

        public Criteria andMailCenterIdNotBetween(java.lang.String value1, java.lang.String value2) {
            addCriterion("mail_center_id not between", value1, value2, "mailCenterId");
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