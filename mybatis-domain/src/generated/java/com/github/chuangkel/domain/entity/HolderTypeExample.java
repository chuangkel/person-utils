package com.github.chuangkel.domain.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class HolderTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HolderTypeExample() {
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

        public Criteria andHolderTypeNameIsNull() {
            addCriterion("holder_type_name is null");
            return (Criteria) this;
        }

        public Criteria andHolderTypeNameIsNotNull() {
            addCriterion("holder_type_name is not null");
            return (Criteria) this;
        }

        public Criteria andHolderTypeNameEqualTo(String value) {
            addCriterion("holder_type_name =", value, "holderTypeName");
            return (Criteria) this;
        }

        public Criteria andHolderTypeNameNotEqualTo(String value) {
            addCriterion("holder_type_name <>", value, "holderTypeName");
            return (Criteria) this;
        }

        public Criteria andHolderTypeNameGreaterThan(String value) {
            addCriterion("holder_type_name >", value, "holderTypeName");
            return (Criteria) this;
        }

        public Criteria andHolderTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("holder_type_name >=", value, "holderTypeName");
            return (Criteria) this;
        }

        public Criteria andHolderTypeNameLessThan(String value) {
            addCriterion("holder_type_name <", value, "holderTypeName");
            return (Criteria) this;
        }

        public Criteria andHolderTypeNameLessThanOrEqualTo(String value) {
            addCriterion("holder_type_name <=", value, "holderTypeName");
            return (Criteria) this;
        }

        public Criteria andHolderTypeNameLike(String value) {
            addCriterion("holder_type_name like", value, "holderTypeName");
            return (Criteria) this;
        }

        public Criteria andHolderTypeNameNotLike(String value) {
            addCriterion("holder_type_name not like", value, "holderTypeName");
            return (Criteria) this;
        }

        public Criteria andHolderTypeNameIn(List<String> values) {
            addCriterion("holder_type_name in", values, "holderTypeName");
            return (Criteria) this;
        }

        public Criteria andHolderTypeNameNotIn(List<String> values) {
            addCriterion("holder_type_name not in", values, "holderTypeName");
            return (Criteria) this;
        }

        public Criteria andHolderTypeNameBetween(String value1, String value2) {
            addCriterion("holder_type_name between", value1, value2, "holderTypeName");
            return (Criteria) this;
        }

        public Criteria andHolderTypeNameNotBetween(String value1, String value2) {
            addCriterion("holder_type_name not between", value1, value2, "holderTypeName");
            return (Criteria) this;
        }

        public Criteria andHolderTypeIsNull() {
            addCriterion("holder_type is null");
            return (Criteria) this;
        }

        public Criteria andHolderTypeIsNotNull() {
            addCriterion("holder_type is not null");
            return (Criteria) this;
        }

        public Criteria andHolderTypeEqualTo(String value) {
            addCriterion("holder_type =", value, "holderType");
            return (Criteria) this;
        }

        public Criteria andHolderTypeNotEqualTo(String value) {
            addCriterion("holder_type <>", value, "holderType");
            return (Criteria) this;
        }

        public Criteria andHolderTypeGreaterThan(String value) {
            addCriterion("holder_type >", value, "holderType");
            return (Criteria) this;
        }

        public Criteria andHolderTypeGreaterThanOrEqualTo(String value) {
            addCriterion("holder_type >=", value, "holderType");
            return (Criteria) this;
        }

        public Criteria andHolderTypeLessThan(String value) {
            addCriterion("holder_type <", value, "holderType");
            return (Criteria) this;
        }

        public Criteria andHolderTypeLessThanOrEqualTo(String value) {
            addCriterion("holder_type <=", value, "holderType");
            return (Criteria) this;
        }

        public Criteria andHolderTypeLike(String value) {
            addCriterion("holder_type like", value, "holderType");
            return (Criteria) this;
        }

        public Criteria andHolderTypeNotLike(String value) {
            addCriterion("holder_type not like", value, "holderType");
            return (Criteria) this;
        }

        public Criteria andHolderTypeIn(List<String> values) {
            addCriterion("holder_type in", values, "holderType");
            return (Criteria) this;
        }

        public Criteria andHolderTypeNotIn(List<String> values) {
            addCriterion("holder_type not in", values, "holderType");
            return (Criteria) this;
        }

        public Criteria andHolderTypeBetween(String value1, String value2) {
            addCriterion("holder_type between", value1, value2, "holderType");
            return (Criteria) this;
        }

        public Criteria andHolderTypeNotBetween(String value1, String value2) {
            addCriterion("holder_type not between", value1, value2, "holderType");
            return (Criteria) this;
        }

        public Criteria andShareRatioIsNull() {
            addCriterion("share_ratio is null");
            return (Criteria) this;
        }

        public Criteria andShareRatioIsNotNull() {
            addCriterion("share_ratio is not null");
            return (Criteria) this;
        }

        public Criteria andShareRatioEqualTo(BigDecimal value) {
            addCriterion("share_ratio =", value, "shareRatio");
            return (Criteria) this;
        }

        public Criteria andShareRatioNotEqualTo(BigDecimal value) {
            addCriterion("share_ratio <>", value, "shareRatio");
            return (Criteria) this;
        }

        public Criteria andShareRatioGreaterThan(BigDecimal value) {
            addCriterion("share_ratio >", value, "shareRatio");
            return (Criteria) this;
        }

        public Criteria andShareRatioGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("share_ratio >=", value, "shareRatio");
            return (Criteria) this;
        }

        public Criteria andShareRatioLessThan(BigDecimal value) {
            addCriterion("share_ratio <", value, "shareRatio");
            return (Criteria) this;
        }

        public Criteria andShareRatioLessThanOrEqualTo(BigDecimal value) {
            addCriterion("share_ratio <=", value, "shareRatio");
            return (Criteria) this;
        }

        public Criteria andShareRatioIn(List<BigDecimal> values) {
            addCriterion("share_ratio in", values, "shareRatio");
            return (Criteria) this;
        }

        public Criteria andShareRatioNotIn(List<BigDecimal> values) {
            addCriterion("share_ratio not in", values, "shareRatio");
            return (Criteria) this;
        }

        public Criteria andShareRatioBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("share_ratio between", value1, value2, "shareRatio");
            return (Criteria) this;
        }

        public Criteria andShareRatioNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("share_ratio not between", value1, value2, "shareRatio");
            return (Criteria) this;
        }

        public Criteria andHoldingAmountIsNull() {
            addCriterion("holding_amount is null");
            return (Criteria) this;
        }

        public Criteria andHoldingAmountIsNotNull() {
            addCriterion("holding_amount is not null");
            return (Criteria) this;
        }

        public Criteria andHoldingAmountEqualTo(BigDecimal value) {
            addCriterion("holding_amount =", value, "holdingAmount");
            return (Criteria) this;
        }

        public Criteria andHoldingAmountNotEqualTo(BigDecimal value) {
            addCriterion("holding_amount <>", value, "holdingAmount");
            return (Criteria) this;
        }

        public Criteria andHoldingAmountGreaterThan(BigDecimal value) {
            addCriterion("holding_amount >", value, "holdingAmount");
            return (Criteria) this;
        }

        public Criteria andHoldingAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("holding_amount >=", value, "holdingAmount");
            return (Criteria) this;
        }

        public Criteria andHoldingAmountLessThan(BigDecimal value) {
            addCriterion("holding_amount <", value, "holdingAmount");
            return (Criteria) this;
        }

        public Criteria andHoldingAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("holding_amount <=", value, "holdingAmount");
            return (Criteria) this;
        }

        public Criteria andHoldingAmountIn(List<BigDecimal> values) {
            addCriterion("holding_amount in", values, "holdingAmount");
            return (Criteria) this;
        }

        public Criteria andHoldingAmountNotIn(List<BigDecimal> values) {
            addCriterion("holding_amount not in", values, "holdingAmount");
            return (Criteria) this;
        }

        public Criteria andHoldingAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("holding_amount between", value1, value2, "holdingAmount");
            return (Criteria) this;
        }

        public Criteria andHoldingAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("holding_amount not between", value1, value2, "holdingAmount");
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