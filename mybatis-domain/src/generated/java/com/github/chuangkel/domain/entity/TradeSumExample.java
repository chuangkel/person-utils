package com.github.chuangkel.domain.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TradeSumExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TradeSumExample() {
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

        public Criteria andPortNameIsNull() {
            addCriterion("port_name is null");
            return (Criteria) this;
        }

        public Criteria andPortNameIsNotNull() {
            addCriterion("port_name is not null");
            return (Criteria) this;
        }

        public Criteria andPortNameEqualTo(String value) {
            addCriterion("port_name =", value, "portName");
            return (Criteria) this;
        }

        public Criteria andPortNameNotEqualTo(String value) {
            addCriterion("port_name <>", value, "portName");
            return (Criteria) this;
        }

        public Criteria andPortNameGreaterThan(String value) {
            addCriterion("port_name >", value, "portName");
            return (Criteria) this;
        }

        public Criteria andPortNameGreaterThanOrEqualTo(String value) {
            addCriterion("port_name >=", value, "portName");
            return (Criteria) this;
        }

        public Criteria andPortNameLessThan(String value) {
            addCriterion("port_name <", value, "portName");
            return (Criteria) this;
        }

        public Criteria andPortNameLessThanOrEqualTo(String value) {
            addCriterion("port_name <=", value, "portName");
            return (Criteria) this;
        }

        public Criteria andPortNameLike(String value) {
            addCriterion("port_name like", value, "portName");
            return (Criteria) this;
        }

        public Criteria andPortNameNotLike(String value) {
            addCriterion("port_name not like", value, "portName");
            return (Criteria) this;
        }

        public Criteria andPortNameIn(List<String> values) {
            addCriterion("port_name in", values, "portName");
            return (Criteria) this;
        }

        public Criteria andPortNameNotIn(List<String> values) {
            addCriterion("port_name not in", values, "portName");
            return (Criteria) this;
        }

        public Criteria andPortNameBetween(String value1, String value2) {
            addCriterion("port_name between", value1, value2, "portName");
            return (Criteria) this;
        }

        public Criteria andPortNameNotBetween(String value1, String value2) {
            addCriterion("port_name not between", value1, value2, "portName");
            return (Criteria) this;
        }

        public Criteria andPortCodeIsNull() {
            addCriterion("port_code is null");
            return (Criteria) this;
        }

        public Criteria andPortCodeIsNotNull() {
            addCriterion("port_code is not null");
            return (Criteria) this;
        }

        public Criteria andPortCodeEqualTo(String value) {
            addCriterion("port_code =", value, "portCode");
            return (Criteria) this;
        }

        public Criteria andPortCodeNotEqualTo(String value) {
            addCriterion("port_code <>", value, "portCode");
            return (Criteria) this;
        }

        public Criteria andPortCodeGreaterThan(String value) {
            addCriterion("port_code >", value, "portCode");
            return (Criteria) this;
        }

        public Criteria andPortCodeGreaterThanOrEqualTo(String value) {
            addCriterion("port_code >=", value, "portCode");
            return (Criteria) this;
        }

        public Criteria andPortCodeLessThan(String value) {
            addCriterion("port_code <", value, "portCode");
            return (Criteria) this;
        }

        public Criteria andPortCodeLessThanOrEqualTo(String value) {
            addCriterion("port_code <=", value, "portCode");
            return (Criteria) this;
        }

        public Criteria andPortCodeLike(String value) {
            addCriterion("port_code like", value, "portCode");
            return (Criteria) this;
        }

        public Criteria andPortCodeNotLike(String value) {
            addCriterion("port_code not like", value, "portCode");
            return (Criteria) this;
        }

        public Criteria andPortCodeIn(List<String> values) {
            addCriterion("port_code in", values, "portCode");
            return (Criteria) this;
        }

        public Criteria andPortCodeNotIn(List<String> values) {
            addCriterion("port_code not in", values, "portCode");
            return (Criteria) this;
        }

        public Criteria andPortCodeBetween(String value1, String value2) {
            addCriterion("port_code between", value1, value2, "portCode");
            return (Criteria) this;
        }

        public Criteria andPortCodeNotBetween(String value1, String value2) {
            addCriterion("port_code not between", value1, value2, "portCode");
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

        public Criteria andEntrustDirectionIsNull() {
            addCriterion("entrust_direction is null");
            return (Criteria) this;
        }

        public Criteria andEntrustDirectionIsNotNull() {
            addCriterion("entrust_direction is not null");
            return (Criteria) this;
        }

        public Criteria andEntrustDirectionEqualTo(Integer value) {
            addCriterion("entrust_direction =", value, "entrustDirection");
            return (Criteria) this;
        }

        public Criteria andEntrustDirectionNotEqualTo(Integer value) {
            addCriterion("entrust_direction <>", value, "entrustDirection");
            return (Criteria) this;
        }

        public Criteria andEntrustDirectionGreaterThan(Integer value) {
            addCriterion("entrust_direction >", value, "entrustDirection");
            return (Criteria) this;
        }

        public Criteria andEntrustDirectionGreaterThanOrEqualTo(Integer value) {
            addCriterion("entrust_direction >=", value, "entrustDirection");
            return (Criteria) this;
        }

        public Criteria andEntrustDirectionLessThan(Integer value) {
            addCriterion("entrust_direction <", value, "entrustDirection");
            return (Criteria) this;
        }

        public Criteria andEntrustDirectionLessThanOrEqualTo(Integer value) {
            addCriterion("entrust_direction <=", value, "entrustDirection");
            return (Criteria) this;
        }

        public Criteria andEntrustDirectionIn(List<Integer> values) {
            addCriterion("entrust_direction in", values, "entrustDirection");
            return (Criteria) this;
        }

        public Criteria andEntrustDirectionNotIn(List<Integer> values) {
            addCriterion("entrust_direction not in", values, "entrustDirection");
            return (Criteria) this;
        }

        public Criteria andEntrustDirectionBetween(Integer value1, Integer value2) {
            addCriterion("entrust_direction between", value1, value2, "entrustDirection");
            return (Criteria) this;
        }

        public Criteria andEntrustDirectionNotBetween(Integer value1, Integer value2) {
            addCriterion("entrust_direction not between", value1, value2, "entrustDirection");
            return (Criteria) this;
        }

        public Criteria andEntrustDirectionNameIsNull() {
            addCriterion("entrust_direction_name is null");
            return (Criteria) this;
        }

        public Criteria andEntrustDirectionNameIsNotNull() {
            addCriterion("entrust_direction_name is not null");
            return (Criteria) this;
        }

        public Criteria andEntrustDirectionNameEqualTo(String value) {
            addCriterion("entrust_direction_name =", value, "entrustDirectionName");
            return (Criteria) this;
        }

        public Criteria andEntrustDirectionNameNotEqualTo(String value) {
            addCriterion("entrust_direction_name <>", value, "entrustDirectionName");
            return (Criteria) this;
        }

        public Criteria andEntrustDirectionNameGreaterThan(String value) {
            addCriterion("entrust_direction_name >", value, "entrustDirectionName");
            return (Criteria) this;
        }

        public Criteria andEntrustDirectionNameGreaterThanOrEqualTo(String value) {
            addCriterion("entrust_direction_name >=", value, "entrustDirectionName");
            return (Criteria) this;
        }

        public Criteria andEntrustDirectionNameLessThan(String value) {
            addCriterion("entrust_direction_name <", value, "entrustDirectionName");
            return (Criteria) this;
        }

        public Criteria andEntrustDirectionNameLessThanOrEqualTo(String value) {
            addCriterion("entrust_direction_name <=", value, "entrustDirectionName");
            return (Criteria) this;
        }

        public Criteria andEntrustDirectionNameLike(String value) {
            addCriterion("entrust_direction_name like", value, "entrustDirectionName");
            return (Criteria) this;
        }

        public Criteria andEntrustDirectionNameNotLike(String value) {
            addCriterion("entrust_direction_name not like", value, "entrustDirectionName");
            return (Criteria) this;
        }

        public Criteria andEntrustDirectionNameIn(List<String> values) {
            addCriterion("entrust_direction_name in", values, "entrustDirectionName");
            return (Criteria) this;
        }

        public Criteria andEntrustDirectionNameNotIn(List<String> values) {
            addCriterion("entrust_direction_name not in", values, "entrustDirectionName");
            return (Criteria) this;
        }

        public Criteria andEntrustDirectionNameBetween(String value1, String value2) {
            addCriterion("entrust_direction_name between", value1, value2, "entrustDirectionName");
            return (Criteria) this;
        }

        public Criteria andEntrustDirectionNameNotBetween(String value1, String value2) {
            addCriterion("entrust_direction_name not between", value1, value2, "entrustDirectionName");
            return (Criteria) this;
        }

        public Criteria andDealAmountIsNull() {
            addCriterion("deal_amount is null");
            return (Criteria) this;
        }

        public Criteria andDealAmountIsNotNull() {
            addCriterion("deal_amount is not null");
            return (Criteria) this;
        }

        public Criteria andDealAmountEqualTo(BigDecimal value) {
            addCriterion("deal_amount =", value, "dealAmount");
            return (Criteria) this;
        }

        public Criteria andDealAmountNotEqualTo(BigDecimal value) {
            addCriterion("deal_amount <>", value, "dealAmount");
            return (Criteria) this;
        }

        public Criteria andDealAmountGreaterThan(BigDecimal value) {
            addCriterion("deal_amount >", value, "dealAmount");
            return (Criteria) this;
        }

        public Criteria andDealAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("deal_amount >=", value, "dealAmount");
            return (Criteria) this;
        }

        public Criteria andDealAmountLessThan(BigDecimal value) {
            addCriterion("deal_amount <", value, "dealAmount");
            return (Criteria) this;
        }

        public Criteria andDealAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("deal_amount <=", value, "dealAmount");
            return (Criteria) this;
        }

        public Criteria andDealAmountIn(List<BigDecimal> values) {
            addCriterion("deal_amount in", values, "dealAmount");
            return (Criteria) this;
        }

        public Criteria andDealAmountNotIn(List<BigDecimal> values) {
            addCriterion("deal_amount not in", values, "dealAmount");
            return (Criteria) this;
        }

        public Criteria andDealAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("deal_amount between", value1, value2, "dealAmount");
            return (Criteria) this;
        }

        public Criteria andDealAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("deal_amount not between", value1, value2, "dealAmount");
            return (Criteria) this;
        }

        public Criteria andDealBalanceIsNull() {
            addCriterion("deal_balance is null");
            return (Criteria) this;
        }

        public Criteria andDealBalanceIsNotNull() {
            addCriterion("deal_balance is not null");
            return (Criteria) this;
        }

        public Criteria andDealBalanceEqualTo(BigDecimal value) {
            addCriterion("deal_balance =", value, "dealBalance");
            return (Criteria) this;
        }

        public Criteria andDealBalanceNotEqualTo(BigDecimal value) {
            addCriterion("deal_balance <>", value, "dealBalance");
            return (Criteria) this;
        }

        public Criteria andDealBalanceGreaterThan(BigDecimal value) {
            addCriterion("deal_balance >", value, "dealBalance");
            return (Criteria) this;
        }

        public Criteria andDealBalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("deal_balance >=", value, "dealBalance");
            return (Criteria) this;
        }

        public Criteria andDealBalanceLessThan(BigDecimal value) {
            addCriterion("deal_balance <", value, "dealBalance");
            return (Criteria) this;
        }

        public Criteria andDealBalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("deal_balance <=", value, "dealBalance");
            return (Criteria) this;
        }

        public Criteria andDealBalanceIn(List<BigDecimal> values) {
            addCriterion("deal_balance in", values, "dealBalance");
            return (Criteria) this;
        }

        public Criteria andDealBalanceNotIn(List<BigDecimal> values) {
            addCriterion("deal_balance not in", values, "dealBalance");
            return (Criteria) this;
        }

        public Criteria andDealBalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("deal_balance between", value1, value2, "dealBalance");
            return (Criteria) this;
        }

        public Criteria andDealBalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("deal_balance not between", value1, value2, "dealBalance");
            return (Criteria) this;
        }

        public Criteria andDealAvgPriceIsNull() {
            addCriterion("deal_avg_price is null");
            return (Criteria) this;
        }

        public Criteria andDealAvgPriceIsNotNull() {
            addCriterion("deal_avg_price is not null");
            return (Criteria) this;
        }

        public Criteria andDealAvgPriceEqualTo(BigDecimal value) {
            addCriterion("deal_avg_price =", value, "dealAvgPrice");
            return (Criteria) this;
        }

        public Criteria andDealAvgPriceNotEqualTo(BigDecimal value) {
            addCriterion("deal_avg_price <>", value, "dealAvgPrice");
            return (Criteria) this;
        }

        public Criteria andDealAvgPriceGreaterThan(BigDecimal value) {
            addCriterion("deal_avg_price >", value, "dealAvgPrice");
            return (Criteria) this;
        }

        public Criteria andDealAvgPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("deal_avg_price >=", value, "dealAvgPrice");
            return (Criteria) this;
        }

        public Criteria andDealAvgPriceLessThan(BigDecimal value) {
            addCriterion("deal_avg_price <", value, "dealAvgPrice");
            return (Criteria) this;
        }

        public Criteria andDealAvgPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("deal_avg_price <=", value, "dealAvgPrice");
            return (Criteria) this;
        }

        public Criteria andDealAvgPriceIn(List<BigDecimal> values) {
            addCriterion("deal_avg_price in", values, "dealAvgPrice");
            return (Criteria) this;
        }

        public Criteria andDealAvgPriceNotIn(List<BigDecimal> values) {
            addCriterion("deal_avg_price not in", values, "dealAvgPrice");
            return (Criteria) this;
        }

        public Criteria andDealAvgPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("deal_avg_price between", value1, value2, "dealAvgPrice");
            return (Criteria) this;
        }

        public Criteria andDealAvgPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("deal_avg_price not between", value1, value2, "dealAvgPrice");
            return (Criteria) this;
        }

        public Criteria andClosingPriceIsNull() {
            addCriterion("closing_price is null");
            return (Criteria) this;
        }

        public Criteria andClosingPriceIsNotNull() {
            addCriterion("closing_price is not null");
            return (Criteria) this;
        }

        public Criteria andClosingPriceEqualTo(BigDecimal value) {
            addCriterion("closing_price =", value, "closingPrice");
            return (Criteria) this;
        }

        public Criteria andClosingPriceNotEqualTo(BigDecimal value) {
            addCriterion("closing_price <>", value, "closingPrice");
            return (Criteria) this;
        }

        public Criteria andClosingPriceGreaterThan(BigDecimal value) {
            addCriterion("closing_price >", value, "closingPrice");
            return (Criteria) this;
        }

        public Criteria andClosingPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("closing_price >=", value, "closingPrice");
            return (Criteria) this;
        }

        public Criteria andClosingPriceLessThan(BigDecimal value) {
            addCriterion("closing_price <", value, "closingPrice");
            return (Criteria) this;
        }

        public Criteria andClosingPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("closing_price <=", value, "closingPrice");
            return (Criteria) this;
        }

        public Criteria andClosingPriceIn(List<BigDecimal> values) {
            addCriterion("closing_price in", values, "closingPrice");
            return (Criteria) this;
        }

        public Criteria andClosingPriceNotIn(List<BigDecimal> values) {
            addCriterion("closing_price not in", values, "closingPrice");
            return (Criteria) this;
        }

        public Criteria andClosingPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("closing_price between", value1, value2, "closingPrice");
            return (Criteria) this;
        }

        public Criteria andClosingPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("closing_price not between", value1, value2, "closingPrice");
            return (Criteria) this;
        }

        public Criteria andTodayProfitIsNull() {
            addCriterion("today_profit is null");
            return (Criteria) this;
        }

        public Criteria andTodayProfitIsNotNull() {
            addCriterion("today_profit is not null");
            return (Criteria) this;
        }

        public Criteria andTodayProfitEqualTo(BigDecimal value) {
            addCriterion("today_profit =", value, "todayProfit");
            return (Criteria) this;
        }

        public Criteria andTodayProfitNotEqualTo(BigDecimal value) {
            addCriterion("today_profit <>", value, "todayProfit");
            return (Criteria) this;
        }

        public Criteria andTodayProfitGreaterThan(BigDecimal value) {
            addCriterion("today_profit >", value, "todayProfit");
            return (Criteria) this;
        }

        public Criteria andTodayProfitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("today_profit >=", value, "todayProfit");
            return (Criteria) this;
        }

        public Criteria andTodayProfitLessThan(BigDecimal value) {
            addCriterion("today_profit <", value, "todayProfit");
            return (Criteria) this;
        }

        public Criteria andTodayProfitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("today_profit <=", value, "todayProfit");
            return (Criteria) this;
        }

        public Criteria andTodayProfitIn(List<BigDecimal> values) {
            addCriterion("today_profit in", values, "todayProfit");
            return (Criteria) this;
        }

        public Criteria andTodayProfitNotIn(List<BigDecimal> values) {
            addCriterion("today_profit not in", values, "todayProfit");
            return (Criteria) this;
        }

        public Criteria andTodayProfitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("today_profit between", value1, value2, "todayProfit");
            return (Criteria) this;
        }

        public Criteria andTodayProfitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("today_profit not between", value1, value2, "todayProfit");
            return (Criteria) this;
        }

        public Criteria andMarketDealPercentIsNull() {
            addCriterion("market_deal_percent is null");
            return (Criteria) this;
        }

        public Criteria andMarketDealPercentIsNotNull() {
            addCriterion("market_deal_percent is not null");
            return (Criteria) this;
        }

        public Criteria andMarketDealPercentEqualTo(BigDecimal value) {
            addCriterion("market_deal_percent =", value, "marketDealPercent");
            return (Criteria) this;
        }

        public Criteria andMarketDealPercentNotEqualTo(BigDecimal value) {
            addCriterion("market_deal_percent <>", value, "marketDealPercent");
            return (Criteria) this;
        }

        public Criteria andMarketDealPercentGreaterThan(BigDecimal value) {
            addCriterion("market_deal_percent >", value, "marketDealPercent");
            return (Criteria) this;
        }

        public Criteria andMarketDealPercentGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("market_deal_percent >=", value, "marketDealPercent");
            return (Criteria) this;
        }

        public Criteria andMarketDealPercentLessThan(BigDecimal value) {
            addCriterion("market_deal_percent <", value, "marketDealPercent");
            return (Criteria) this;
        }

        public Criteria andMarketDealPercentLessThanOrEqualTo(BigDecimal value) {
            addCriterion("market_deal_percent <=", value, "marketDealPercent");
            return (Criteria) this;
        }

        public Criteria andMarketDealPercentIn(List<BigDecimal> values) {
            addCriterion("market_deal_percent in", values, "marketDealPercent");
            return (Criteria) this;
        }

        public Criteria andMarketDealPercentNotIn(List<BigDecimal> values) {
            addCriterion("market_deal_percent not in", values, "marketDealPercent");
            return (Criteria) this;
        }

        public Criteria andMarketDealPercentBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("market_deal_percent between", value1, value2, "marketDealPercent");
            return (Criteria) this;
        }

        public Criteria andMarketDealPercentNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("market_deal_percent not between", value1, value2, "marketDealPercent");
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