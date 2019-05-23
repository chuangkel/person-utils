package com.github.chuangkel.domain.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class IssuerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IssuerExample() {
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

        public Criteria andPortIdIsNull() {
            addCriterion("port_id is null");
            return (Criteria) this;
        }

        public Criteria andPortIdIsNotNull() {
            addCriterion("port_id is not null");
            return (Criteria) this;
        }

        public Criteria andPortIdEqualTo(Integer value) {
            addCriterion("port_id =", value, "portId");
            return (Criteria) this;
        }

        public Criteria andPortIdNotEqualTo(Integer value) {
            addCriterion("port_id <>", value, "portId");
            return (Criteria) this;
        }

        public Criteria andPortIdGreaterThan(Integer value) {
            addCriterion("port_id >", value, "portId");
            return (Criteria) this;
        }

        public Criteria andPortIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("port_id >=", value, "portId");
            return (Criteria) this;
        }

        public Criteria andPortIdLessThan(Integer value) {
            addCriterion("port_id <", value, "portId");
            return (Criteria) this;
        }

        public Criteria andPortIdLessThanOrEqualTo(Integer value) {
            addCriterion("port_id <=", value, "portId");
            return (Criteria) this;
        }

        public Criteria andPortIdIn(List<Integer> values) {
            addCriterion("port_id in", values, "portId");
            return (Criteria) this;
        }

        public Criteria andPortIdNotIn(List<Integer> values) {
            addCriterion("port_id not in", values, "portId");
            return (Criteria) this;
        }

        public Criteria andPortIdBetween(Integer value1, Integer value2) {
            addCriterion("port_id between", value1, value2, "portId");
            return (Criteria) this;
        }

        public Criteria andPortIdNotBetween(Integer value1, Integer value2) {
            addCriterion("port_id not between", value1, value2, "portId");
            return (Criteria) this;
        }

        public Criteria andBusinessDateIsNull() {
            addCriterion("business_date is null");
            return (Criteria) this;
        }

        public Criteria andBusinessDateIsNotNull() {
            addCriterion("business_date is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessDateEqualTo(Integer value) {
            addCriterion("business_date =", value, "businessDate");
            return (Criteria) this;
        }

        public Criteria andBusinessDateNotEqualTo(Integer value) {
            addCriterion("business_date <>", value, "businessDate");
            return (Criteria) this;
        }

        public Criteria andBusinessDateGreaterThan(Integer value) {
            addCriterion("business_date >", value, "businessDate");
            return (Criteria) this;
        }

        public Criteria andBusinessDateGreaterThanOrEqualTo(Integer value) {
            addCriterion("business_date >=", value, "businessDate");
            return (Criteria) this;
        }

        public Criteria andBusinessDateLessThan(Integer value) {
            addCriterion("business_date <", value, "businessDate");
            return (Criteria) this;
        }

        public Criteria andBusinessDateLessThanOrEqualTo(Integer value) {
            addCriterion("business_date <=", value, "businessDate");
            return (Criteria) this;
        }

        public Criteria andBusinessDateIn(List<Integer> values) {
            addCriterion("business_date in", values, "businessDate");
            return (Criteria) this;
        }

        public Criteria andBusinessDateNotIn(List<Integer> values) {
            addCriterion("business_date not in", values, "businessDate");
            return (Criteria) this;
        }

        public Criteria andBusinessDateBetween(Integer value1, Integer value2) {
            addCriterion("business_date between", value1, value2, "businessDate");
            return (Criteria) this;
        }

        public Criteria andBusinessDateNotBetween(Integer value1, Integer value2) {
            addCriterion("business_date not between", value1, value2, "businessDate");
            return (Criteria) this;
        }

        public Criteria andIssuerNameIsNull() {
            addCriterion("issuer_name is null");
            return (Criteria) this;
        }

        public Criteria andIssuerNameIsNotNull() {
            addCriterion("issuer_name is not null");
            return (Criteria) this;
        }

        public Criteria andIssuerNameEqualTo(String value) {
            addCriterion("issuer_name =", value, "issuerName");
            return (Criteria) this;
        }

        public Criteria andIssuerNameNotEqualTo(String value) {
            addCriterion("issuer_name <>", value, "issuerName");
            return (Criteria) this;
        }

        public Criteria andIssuerNameGreaterThan(String value) {
            addCriterion("issuer_name >", value, "issuerName");
            return (Criteria) this;
        }

        public Criteria andIssuerNameGreaterThanOrEqualTo(String value) {
            addCriterion("issuer_name >=", value, "issuerName");
            return (Criteria) this;
        }

        public Criteria andIssuerNameLessThan(String value) {
            addCriterion("issuer_name <", value, "issuerName");
            return (Criteria) this;
        }

        public Criteria andIssuerNameLessThanOrEqualTo(String value) {
            addCriterion("issuer_name <=", value, "issuerName");
            return (Criteria) this;
        }

        public Criteria andIssuerNameLike(String value) {
            addCriterion("issuer_name like", value, "issuerName");
            return (Criteria) this;
        }

        public Criteria andIssuerNameNotLike(String value) {
            addCriterion("issuer_name not like", value, "issuerName");
            return (Criteria) this;
        }

        public Criteria andIssuerNameIn(List<String> values) {
            addCriterion("issuer_name in", values, "issuerName");
            return (Criteria) this;
        }

        public Criteria andIssuerNameNotIn(List<String> values) {
            addCriterion("issuer_name not in", values, "issuerName");
            return (Criteria) this;
        }

        public Criteria andIssuerNameBetween(String value1, String value2) {
            addCriterion("issuer_name between", value1, value2, "issuerName");
            return (Criteria) this;
        }

        public Criteria andIssuerNameNotBetween(String value1, String value2) {
            addCriterion("issuer_name not between", value1, value2, "issuerName");
            return (Criteria) this;
        }

        public Criteria andAssetProportionIsNull() {
            addCriterion("asset_proportion is null");
            return (Criteria) this;
        }

        public Criteria andAssetProportionIsNotNull() {
            addCriterion("asset_proportion is not null");
            return (Criteria) this;
        }

        public Criteria andAssetProportionEqualTo(BigDecimal value) {
            addCriterion("asset_proportion =", value, "assetProportion");
            return (Criteria) this;
        }

        public Criteria andAssetProportionNotEqualTo(BigDecimal value) {
            addCriterion("asset_proportion <>", value, "assetProportion");
            return (Criteria) this;
        }

        public Criteria andAssetProportionGreaterThan(BigDecimal value) {
            addCriterion("asset_proportion >", value, "assetProportion");
            return (Criteria) this;
        }

        public Criteria andAssetProportionGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("asset_proportion >=", value, "assetProportion");
            return (Criteria) this;
        }

        public Criteria andAssetProportionLessThan(BigDecimal value) {
            addCriterion("asset_proportion <", value, "assetProportion");
            return (Criteria) this;
        }

        public Criteria andAssetProportionLessThanOrEqualTo(BigDecimal value) {
            addCriterion("asset_proportion <=", value, "assetProportion");
            return (Criteria) this;
        }

        public Criteria andAssetProportionIn(List<BigDecimal> values) {
            addCriterion("asset_proportion in", values, "assetProportion");
            return (Criteria) this;
        }

        public Criteria andAssetProportionNotIn(List<BigDecimal> values) {
            addCriterion("asset_proportion not in", values, "assetProportion");
            return (Criteria) this;
        }

        public Criteria andAssetProportionBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("asset_proportion between", value1, value2, "assetProportion");
            return (Criteria) this;
        }

        public Criteria andAssetProportionNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("asset_proportion not between", value1, value2, "assetProportion");
            return (Criteria) this;
        }

        public Criteria andRiseFallRatioIsNull() {
            addCriterion("rise_fall_ratio is null");
            return (Criteria) this;
        }

        public Criteria andRiseFallRatioIsNotNull() {
            addCriterion("rise_fall_ratio is not null");
            return (Criteria) this;
        }

        public Criteria andRiseFallRatioEqualTo(BigDecimal value) {
            addCriterion("rise_fall_ratio =", value, "riseFallRatio");
            return (Criteria) this;
        }

        public Criteria andRiseFallRatioNotEqualTo(BigDecimal value) {
            addCriterion("rise_fall_ratio <>", value, "riseFallRatio");
            return (Criteria) this;
        }

        public Criteria andRiseFallRatioGreaterThan(BigDecimal value) {
            addCriterion("rise_fall_ratio >", value, "riseFallRatio");
            return (Criteria) this;
        }

        public Criteria andRiseFallRatioGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("rise_fall_ratio >=", value, "riseFallRatio");
            return (Criteria) this;
        }

        public Criteria andRiseFallRatioLessThan(BigDecimal value) {
            addCriterion("rise_fall_ratio <", value, "riseFallRatio");
            return (Criteria) this;
        }

        public Criteria andRiseFallRatioLessThanOrEqualTo(BigDecimal value) {
            addCriterion("rise_fall_ratio <=", value, "riseFallRatio");
            return (Criteria) this;
        }

        public Criteria andRiseFallRatioIn(List<BigDecimal> values) {
            addCriterion("rise_fall_ratio in", values, "riseFallRatio");
            return (Criteria) this;
        }

        public Criteria andRiseFallRatioNotIn(List<BigDecimal> values) {
            addCriterion("rise_fall_ratio not in", values, "riseFallRatio");
            return (Criteria) this;
        }

        public Criteria andRiseFallRatioBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rise_fall_ratio between", value1, value2, "riseFallRatio");
            return (Criteria) this;
        }

        public Criteria andRiseFallRatioNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rise_fall_ratio not between", value1, value2, "riseFallRatio");
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