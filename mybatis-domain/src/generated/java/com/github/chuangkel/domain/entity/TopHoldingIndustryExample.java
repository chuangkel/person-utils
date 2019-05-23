package com.github.chuangkel.domain.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TopHoldingIndustryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TopHoldingIndustryExample() {
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

        public Criteria andIndustryTypeNoIsNull() {
            addCriterion("industry_type_no is null");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeNoIsNotNull() {
            addCriterion("industry_type_no is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeNoEqualTo(String value) {
            addCriterion("industry_type_no =", value, "industryTypeNo");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeNoNotEqualTo(String value) {
            addCriterion("industry_type_no <>", value, "industryTypeNo");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeNoGreaterThan(String value) {
            addCriterion("industry_type_no >", value, "industryTypeNo");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeNoGreaterThanOrEqualTo(String value) {
            addCriterion("industry_type_no >=", value, "industryTypeNo");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeNoLessThan(String value) {
            addCriterion("industry_type_no <", value, "industryTypeNo");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeNoLessThanOrEqualTo(String value) {
            addCriterion("industry_type_no <=", value, "industryTypeNo");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeNoLike(String value) {
            addCriterion("industry_type_no like", value, "industryTypeNo");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeNoNotLike(String value) {
            addCriterion("industry_type_no not like", value, "industryTypeNo");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeNoIn(List<String> values) {
            addCriterion("industry_type_no in", values, "industryTypeNo");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeNoNotIn(List<String> values) {
            addCriterion("industry_type_no not in", values, "industryTypeNo");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeNoBetween(String value1, String value2) {
            addCriterion("industry_type_no between", value1, value2, "industryTypeNo");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeNoNotBetween(String value1, String value2) {
            addCriterion("industry_type_no not between", value1, value2, "industryTypeNo");
            return (Criteria) this;
        }

        public Criteria andBenchmarkIdIsNull() {
            addCriterion("benchmark_id is null");
            return (Criteria) this;
        }

        public Criteria andBenchmarkIdIsNotNull() {
            addCriterion("benchmark_id is not null");
            return (Criteria) this;
        }

        public Criteria andBenchmarkIdEqualTo(Integer value) {
            addCriterion("benchmark_id =", value, "benchmarkId");
            return (Criteria) this;
        }

        public Criteria andBenchmarkIdNotEqualTo(Integer value) {
            addCriterion("benchmark_id <>", value, "benchmarkId");
            return (Criteria) this;
        }

        public Criteria andBenchmarkIdGreaterThan(Integer value) {
            addCriterion("benchmark_id >", value, "benchmarkId");
            return (Criteria) this;
        }

        public Criteria andBenchmarkIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("benchmark_id >=", value, "benchmarkId");
            return (Criteria) this;
        }

        public Criteria andBenchmarkIdLessThan(Integer value) {
            addCriterion("benchmark_id <", value, "benchmarkId");
            return (Criteria) this;
        }

        public Criteria andBenchmarkIdLessThanOrEqualTo(Integer value) {
            addCriterion("benchmark_id <=", value, "benchmarkId");
            return (Criteria) this;
        }

        public Criteria andBenchmarkIdIn(List<Integer> values) {
            addCriterion("benchmark_id in", values, "benchmarkId");
            return (Criteria) this;
        }

        public Criteria andBenchmarkIdNotIn(List<Integer> values) {
            addCriterion("benchmark_id not in", values, "benchmarkId");
            return (Criteria) this;
        }

        public Criteria andBenchmarkIdBetween(Integer value1, Integer value2) {
            addCriterion("benchmark_id between", value1, value2, "benchmarkId");
            return (Criteria) this;
        }

        public Criteria andBenchmarkIdNotBetween(Integer value1, Integer value2) {
            addCriterion("benchmark_id not between", value1, value2, "benchmarkId");
            return (Criteria) this;
        }

        public Criteria andIndustryNameOneIsNull() {
            addCriterion("industry_name_one is null");
            return (Criteria) this;
        }

        public Criteria andIndustryNameOneIsNotNull() {
            addCriterion("industry_name_one is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryNameOneEqualTo(String value) {
            addCriterion("industry_name_one =", value, "industryNameOne");
            return (Criteria) this;
        }

        public Criteria andIndustryNameOneNotEqualTo(String value) {
            addCriterion("industry_name_one <>", value, "industryNameOne");
            return (Criteria) this;
        }

        public Criteria andIndustryNameOneGreaterThan(String value) {
            addCriterion("industry_name_one >", value, "industryNameOne");
            return (Criteria) this;
        }

        public Criteria andIndustryNameOneGreaterThanOrEqualTo(String value) {
            addCriterion("industry_name_one >=", value, "industryNameOne");
            return (Criteria) this;
        }

        public Criteria andIndustryNameOneLessThan(String value) {
            addCriterion("industry_name_one <", value, "industryNameOne");
            return (Criteria) this;
        }

        public Criteria andIndustryNameOneLessThanOrEqualTo(String value) {
            addCriterion("industry_name_one <=", value, "industryNameOne");
            return (Criteria) this;
        }

        public Criteria andIndustryNameOneLike(String value) {
            addCriterion("industry_name_one like", value, "industryNameOne");
            return (Criteria) this;
        }

        public Criteria andIndustryNameOneNotLike(String value) {
            addCriterion("industry_name_one not like", value, "industryNameOne");
            return (Criteria) this;
        }

        public Criteria andIndustryNameOneIn(List<String> values) {
            addCriterion("industry_name_one in", values, "industryNameOne");
            return (Criteria) this;
        }

        public Criteria andIndustryNameOneNotIn(List<String> values) {
            addCriterion("industry_name_one not in", values, "industryNameOne");
            return (Criteria) this;
        }

        public Criteria andIndustryNameOneBetween(String value1, String value2) {
            addCriterion("industry_name_one between", value1, value2, "industryNameOne");
            return (Criteria) this;
        }

        public Criteria andIndustryNameOneNotBetween(String value1, String value2) {
            addCriterion("industry_name_one not between", value1, value2, "industryNameOne");
            return (Criteria) this;
        }

        public Criteria andIndustryCodeOneIsNull() {
            addCriterion("industry_code_one is null");
            return (Criteria) this;
        }

        public Criteria andIndustryCodeOneIsNotNull() {
            addCriterion("industry_code_one is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryCodeOneEqualTo(Integer value) {
            addCriterion("industry_code_one =", value, "industryCodeOne");
            return (Criteria) this;
        }

        public Criteria andIndustryCodeOneNotEqualTo(Integer value) {
            addCriterion("industry_code_one <>", value, "industryCodeOne");
            return (Criteria) this;
        }

        public Criteria andIndustryCodeOneGreaterThan(Integer value) {
            addCriterion("industry_code_one >", value, "industryCodeOne");
            return (Criteria) this;
        }

        public Criteria andIndustryCodeOneGreaterThanOrEqualTo(Integer value) {
            addCriterion("industry_code_one >=", value, "industryCodeOne");
            return (Criteria) this;
        }

        public Criteria andIndustryCodeOneLessThan(Integer value) {
            addCriterion("industry_code_one <", value, "industryCodeOne");
            return (Criteria) this;
        }

        public Criteria andIndustryCodeOneLessThanOrEqualTo(Integer value) {
            addCriterion("industry_code_one <=", value, "industryCodeOne");
            return (Criteria) this;
        }

        public Criteria andIndustryCodeOneIn(List<Integer> values) {
            addCriterion("industry_code_one in", values, "industryCodeOne");
            return (Criteria) this;
        }

        public Criteria andIndustryCodeOneNotIn(List<Integer> values) {
            addCriterion("industry_code_one not in", values, "industryCodeOne");
            return (Criteria) this;
        }

        public Criteria andIndustryCodeOneBetween(Integer value1, Integer value2) {
            addCriterion("industry_code_one between", value1, value2, "industryCodeOne");
            return (Criteria) this;
        }

        public Criteria andIndustryCodeOneNotBetween(Integer value1, Integer value2) {
            addCriterion("industry_code_one not between", value1, value2, "industryCodeOne");
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

        public Criteria andBenchmarkProportionIsNull() {
            addCriterion("benchmark_proportion is null");
            return (Criteria) this;
        }

        public Criteria andBenchmarkProportionIsNotNull() {
            addCriterion("benchmark_proportion is not null");
            return (Criteria) this;
        }

        public Criteria andBenchmarkProportionEqualTo(BigDecimal value) {
            addCriterion("benchmark_proportion =", value, "benchmarkProportion");
            return (Criteria) this;
        }

        public Criteria andBenchmarkProportionNotEqualTo(BigDecimal value) {
            addCriterion("benchmark_proportion <>", value, "benchmarkProportion");
            return (Criteria) this;
        }

        public Criteria andBenchmarkProportionGreaterThan(BigDecimal value) {
            addCriterion("benchmark_proportion >", value, "benchmarkProportion");
            return (Criteria) this;
        }

        public Criteria andBenchmarkProportionGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("benchmark_proportion >=", value, "benchmarkProportion");
            return (Criteria) this;
        }

        public Criteria andBenchmarkProportionLessThan(BigDecimal value) {
            addCriterion("benchmark_proportion <", value, "benchmarkProportion");
            return (Criteria) this;
        }

        public Criteria andBenchmarkProportionLessThanOrEqualTo(BigDecimal value) {
            addCriterion("benchmark_proportion <=", value, "benchmarkProportion");
            return (Criteria) this;
        }

        public Criteria andBenchmarkProportionIn(List<BigDecimal> values) {
            addCriterion("benchmark_proportion in", values, "benchmarkProportion");
            return (Criteria) this;
        }

        public Criteria andBenchmarkProportionNotIn(List<BigDecimal> values) {
            addCriterion("benchmark_proportion not in", values, "benchmarkProportion");
            return (Criteria) this;
        }

        public Criteria andBenchmarkProportionBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("benchmark_proportion between", value1, value2, "benchmarkProportion");
            return (Criteria) this;
        }

        public Criteria andBenchmarkProportionNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("benchmark_proportion not between", value1, value2, "benchmarkProportion");
            return (Criteria) this;
        }

        public Criteria andOverBaseRatioIsNull() {
            addCriterion("over_base_ratio is null");
            return (Criteria) this;
        }

        public Criteria andOverBaseRatioIsNotNull() {
            addCriterion("over_base_ratio is not null");
            return (Criteria) this;
        }

        public Criteria andOverBaseRatioEqualTo(BigDecimal value) {
            addCriterion("over_base_ratio =", value, "overBaseRatio");
            return (Criteria) this;
        }

        public Criteria andOverBaseRatioNotEqualTo(BigDecimal value) {
            addCriterion("over_base_ratio <>", value, "overBaseRatio");
            return (Criteria) this;
        }

        public Criteria andOverBaseRatioGreaterThan(BigDecimal value) {
            addCriterion("over_base_ratio >", value, "overBaseRatio");
            return (Criteria) this;
        }

        public Criteria andOverBaseRatioGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("over_base_ratio >=", value, "overBaseRatio");
            return (Criteria) this;
        }

        public Criteria andOverBaseRatioLessThan(BigDecimal value) {
            addCriterion("over_base_ratio <", value, "overBaseRatio");
            return (Criteria) this;
        }

        public Criteria andOverBaseRatioLessThanOrEqualTo(BigDecimal value) {
            addCriterion("over_base_ratio <=", value, "overBaseRatio");
            return (Criteria) this;
        }

        public Criteria andOverBaseRatioIn(List<BigDecimal> values) {
            addCriterion("over_base_ratio in", values, "overBaseRatio");
            return (Criteria) this;
        }

        public Criteria andOverBaseRatioNotIn(List<BigDecimal> values) {
            addCriterion("over_base_ratio not in", values, "overBaseRatio");
            return (Criteria) this;
        }

        public Criteria andOverBaseRatioBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("over_base_ratio between", value1, value2, "overBaseRatio");
            return (Criteria) this;
        }

        public Criteria andOverBaseRatioNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("over_base_ratio not between", value1, value2, "overBaseRatio");
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