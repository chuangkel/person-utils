package com.github.chuangkel.domain.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class TradeSum implements Serializable {
    private Integer portId;

    private String portName;

    private String portCode;

    private Integer businessDate;

    private Integer entrustDirection;

    private String entrustDirectionName;

    private BigDecimal dealAmount;

    private BigDecimal dealBalance;

    private BigDecimal dealAvgPrice;

    private BigDecimal closingPrice;

    private BigDecimal todayProfit;

    private BigDecimal marketDealPercent;

    private BigDecimal assetProportion;

    private static final long serialVersionUID = 1L;

    public Integer getPortId() {
        return portId;
    }

    public void setPortId(Integer portId) {
        this.portId = portId;
    }

    public String getPortName() {
        return portName;
    }

    public void setPortName(String portName) {
        this.portName = portName == null ? null : portName.trim();
    }

    public String getPortCode() {
        return portCode;
    }

    public void setPortCode(String portCode) {
        this.portCode = portCode == null ? null : portCode.trim();
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

    public String getEntrustDirectionName() {
        return entrustDirectionName;
    }

    public void setEntrustDirectionName(String entrustDirectionName) {
        this.entrustDirectionName = entrustDirectionName == null ? null : entrustDirectionName.trim();
    }

    public BigDecimal getDealAmount() {
        return dealAmount;
    }

    public void setDealAmount(BigDecimal dealAmount) {
        this.dealAmount = dealAmount;
    }

    public BigDecimal getDealBalance() {
        return dealBalance;
    }

    public void setDealBalance(BigDecimal dealBalance) {
        this.dealBalance = dealBalance;
    }

    public BigDecimal getDealAvgPrice() {
        return dealAvgPrice;
    }

    public void setDealAvgPrice(BigDecimal dealAvgPrice) {
        this.dealAvgPrice = dealAvgPrice;
    }

    public BigDecimal getClosingPrice() {
        return closingPrice;
    }

    public void setClosingPrice(BigDecimal closingPrice) {
        this.closingPrice = closingPrice;
    }

    public BigDecimal getTodayProfit() {
        return todayProfit;
    }

    public void setTodayProfit(BigDecimal todayProfit) {
        this.todayProfit = todayProfit;
    }

    public BigDecimal getMarketDealPercent() {
        return marketDealPercent;
    }

    public void setMarketDealPercent(BigDecimal marketDealPercent) {
        this.marketDealPercent = marketDealPercent;
    }

    public BigDecimal getAssetProportion() {
        return assetProportion;
    }

    public void setAssetProportion(BigDecimal assetProportion) {
        this.assetProportion = assetProportion;
    }
}