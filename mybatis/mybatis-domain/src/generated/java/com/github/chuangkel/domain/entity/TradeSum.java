package com.github.chuangkel.domain.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class TradeSum extends TradeSumKey implements Serializable {
    private String portName;

    private String entrustDirectionName;

    private BigDecimal dealAmount;

    private BigDecimal dealBalance;

    private BigDecimal dealAvgPrice;

    private BigDecimal closingPrice;

    private BigDecimal todayProfit;

    private BigDecimal marketDealPercent;

    private BigDecimal assetProportion;

    private String stockCode;

    private String stockName;

    private static final long serialVersionUID = 1L;

    public String getPortName() {
        return portName;
    }

    public void setPortName(String portName) {
        this.portName = portName == null ? null : portName.trim();
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

    public String getStockCode() {
        return stockCode;
    }

    public void setStockCode(String stockCode) {
        this.stockCode = stockCode == null ? null : stockCode.trim();
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName == null ? null : stockName.trim();
    }
}