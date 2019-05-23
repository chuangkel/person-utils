package com.github.chuangkel.domain.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class Issuer implements Serializable {
    private Integer portId;

    private Integer businessDate;

    private String issuerName;

    private BigDecimal assetProportion;

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

    public String getIssuerName() {
        return issuerName;
    }

    public void setIssuerName(String issuerName) {
        this.issuerName = issuerName == null ? null : issuerName.trim();
    }

    public BigDecimal getAssetProportion() {
        return assetProportion;
    }

    public void setAssetProportion(BigDecimal assetProportion) {
        this.assetProportion = assetProportion;
    }

    public BigDecimal getRiseFallRatio() {
        return riseFallRatio;
    }

    public void setRiseFallRatio(BigDecimal riseFallRatio) {
        this.riseFallRatio = riseFallRatio;
    }
}