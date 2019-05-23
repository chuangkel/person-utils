package com.github.chuangkel.domain.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class TopHoldingIndustry implements Serializable {
    private Integer portId;

    private Integer businessDate;

    private String industryTypeNo;

    private Integer benchmarkId;

    private String industryNameOne;

    private Integer industryCodeOne;

    private BigDecimal assetProportion;

    private BigDecimal benchmarkProportion;

    private BigDecimal overBaseRatio;

    private BigDecimal riseFallRatio;

    private static final long serialVersionUID = 1L;

    public Integer getPortId() {
        return portId;
    }

    public void setPortId(Integer portId) {
        this.portId = portId;
    }

    public Integer getBusinessDate() {
        return businessDate;
    }

    public void setBusinessDate(Integer businessDate) {
        this.businessDate = businessDate;
    }

    public String getIndustryTypeNo() {
        return industryTypeNo;
    }

    public void setIndustryTypeNo(String industryTypeNo) {
        this.industryTypeNo = industryTypeNo == null ? null : industryTypeNo.trim();
    }

    public Integer getBenchmarkId() {
        return benchmarkId;
    }

    public void setBenchmarkId(Integer benchmarkId) {
        this.benchmarkId = benchmarkId;
    }

    public String getIndustryNameOne() {
        return industryNameOne;
    }

    public void setIndustryNameOne(String industryNameOne) {
        this.industryNameOne = industryNameOne == null ? null : industryNameOne.trim();
    }

    public Integer getIndustryCodeOne() {
        return industryCodeOne;
    }

    public void setIndustryCodeOne(Integer industryCodeOne) {
        this.industryCodeOne = industryCodeOne;
    }

    public BigDecimal getAssetProportion() {
        return assetProportion;
    }

    public void setAssetProportion(BigDecimal assetProportion) {
        this.assetProportion = assetProportion;
    }

    public BigDecimal getBenchmarkProportion() {
        return benchmarkProportion;
    }

    public void setBenchmarkProportion(BigDecimal benchmarkProportion) {
        this.benchmarkProportion = benchmarkProportion;
    }

    public BigDecimal getOverBaseRatio() {
        return overBaseRatio;
    }

    public void setOverBaseRatio(BigDecimal overBaseRatio) {
        this.overBaseRatio = overBaseRatio;
    }

    public BigDecimal getRiseFallRatio() {
        return riseFallRatio;
    }

    public void setRiseFallRatio(BigDecimal riseFallRatio) {
        this.riseFallRatio = riseFallRatio;
    }
}