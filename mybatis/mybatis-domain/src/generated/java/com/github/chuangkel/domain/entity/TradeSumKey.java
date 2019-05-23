package com.github.chuangkel.domain.entity;

import java.io.Serializable;

public class TradeSumKey implements Serializable {
    private Integer portId;

    private Integer businessDate;

    private Integer entrustDirection;

    private Integer interCode;

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

    public Integer getEntrustDirection() {
        return entrustDirection;
    }

    public void setEntrustDirection(Integer entrustDirection) {
        this.entrustDirection = entrustDirection;
    }

    public Integer getInterCode() {
        return interCode;
    }

    public void setInterCode(Integer interCode) {
        this.interCode = interCode;
    }
}