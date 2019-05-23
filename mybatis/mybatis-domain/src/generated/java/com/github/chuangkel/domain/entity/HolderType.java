package com.github.chuangkel.domain.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class HolderType implements Serializable {
    private Integer portId;

    private Integer businessDate;

    private String holderTypeName;

    private String holderType;

    private BigDecimal shareRatio;

    private BigDecimal holdingAmount;

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

    public String getHolderTypeName() {
        return holderTypeName;
    }

    public void setHolderTypeName(String holderTypeName) {
        this.holderTypeName = holderTypeName == null ? null : holderTypeName.trim();
    }

    public String getHolderType() {
        return holderType;
    }

    public void setHolderType(String holderType) {
        this.holderType = holderType == null ? null : holderType.trim();
    }

    public BigDecimal getShareRatio() {
        return shareRatio;
    }

    public void setShareRatio(BigDecimal shareRatio) {
        this.shareRatio = shareRatio;
    }

    public BigDecimal getHoldingAmount() {
        return holdingAmount;
    }

    public void setHoldingAmount(BigDecimal holdingAmount) {
        this.holdingAmount = holdingAmount;
    }
}