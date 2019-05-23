package com.github.chuangkel.dto;
import java.io.Serializable;

/**
 * 超低配行业  请求参数的DTO
 * @author ares studio
 *
 */

public class LowIndustryRequest implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer portId; //账户序号
    private Integer businessDate; //业务日期
    private String industryTypeNo; //行业类型编号
    private Integer benchmarkId; //业绩基准
    private String overBaseFlag; //超配标识
    private Integer topn; //前N大配置

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
    public String getOverBaseFlag(){
        return this.overBaseFlag;
    }
    public void setOverBaseFlag( String overBaseFlag ){
        this.overBaseFlag = overBaseFlag;
    }
    public Integer getTopn(){
        return this.topn;
    }
    public void setTopn( Integer topn ){
        this.topn = topn;
    }

}
