package com.github.chuangkel.dto;
import java.io.Serializable;

/**
 * 重仓行业  请求参数的DTO
 * @author ares studio
 *
 */

public class TopHoldingIndustryRequest implements Serializable {
    private static final long serialVersionUID = 1L;
    private String industryTypeNo; //行业类型编号
    private Integer benchmarkId; //业绩基准
    private Integer topn; //前N大配置
    private Integer portId; //账户序号
    private Integer businessDate; //业务日期

    public String getIndustryTypeNo(){
        return this.industryTypeNo;
    }
    public void setIndustryTypeNo( String industryTypeNo ){
        this.industryTypeNo = industryTypeNo;
    }
    public Integer getBenchmarkId(){
        return this.benchmarkId;
    }
    public void setBenchmarkId( Integer benchmarkId ){
        this.benchmarkId = benchmarkId;
    }
    public Integer getTopn(){
        return this.topn;
    }
    public void setTopn( Integer topn ){
        this.topn = topn;
    }
    public Integer getPortId(){
        return this.portId;
    }
    public void setPortId( Integer portId ){
        this.portId = portId;
    }
    public Integer getBusinessDate(){
        return this.businessDate;
    }
    public void setBusinessDate( Integer businessDate ){
        this.businessDate = businessDate;
    }

}
