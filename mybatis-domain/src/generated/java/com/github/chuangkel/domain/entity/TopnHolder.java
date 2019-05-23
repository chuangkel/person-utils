package com.github.chuangkel.domain.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class TopnHolder implements Serializable {
    private Integer portId;

    private Integer businessDate;

    private String fundAccount;

    private String holderName;

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

    public String getFundAccount() {
        return fundAccount;
    }

    public void setFundAccount(String fundAccount) {
        this.fundAccount = fundAccount == null ? null : fundAccount.trim();
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName == null ? null : holderName.trim();
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