package com.example.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;

/**
 * @program: pms2.0_analyze
 * @description:
 * @author: chuangkel
 * @create: 2019-05-08 18:39
 **/
@Table(name = "TopHoldingIndustry1")
public class TopHoldingIndustry1 {
    private static final long serialVersionUID = 5199200306752426436L;

    @Column(name = "port_id", type = MySqlTypeConstant.INT, length = 11, isKey = true, isAutoIncrement = true)
    private Integer portId; //账户序号
    @Column(name = "business_date",type = MySqlTypeConstant.INT)
    private Integer businessDate; //业务日期
    @Column(name = "industry_type_no",type = MySqlTypeConstant.VARCHAR)
    private String industryTypeNo; //行业类型编号
    @Column(name = "benchmark_id",type = MySqlTypeConstant.INT)
    private Integer benchmarkId; //业绩基准
    @Column(name = "industry_code_one",type = MySqlTypeConstant.INT)
    private Integer industryCodeOne; //行业编号
    @Column(name = "industry_name_one",type = MySqlTypeConstant.VARCHAR)
    private String industryNameOne; //行业名称
    @Column(name = "asset_proportion",type = MySqlTypeConstant.DOUBLE)
    private Double assetProportion; //资产占比
    @Column(name = "benchmark_proportion",type = MySqlTypeConstant.DOUBLE)
    private Double benchmarkProportion; //基准占比
    @Column(name = "over_base_ratio",type = MySqlTypeConstant.DOUBLE)
    private Double overBaseRatio; //超配比例

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
        this.industryTypeNo = industryTypeNo;
    }

    public Integer getBenchmarkId() {
        return benchmarkId;
    }

    public void setBenchmarkId(Integer benchmarkId) {
        this.benchmarkId = benchmarkId;
    }

    public Integer getIndustryCodeOne() {
        return industryCodeOne;
    }

    public void setIndustryCodeOne(Integer industryCodeOne) {
        this.industryCodeOne = industryCodeOne;
    }

    public String getIndustryNameOne() {
        return industryNameOne;
    }

    public void setIndustryNameOne(String industryNameOne) {
        this.industryNameOne = industryNameOne;
    }

    public Double getAssetProportion() {
        return assetProportion;
    }

    public void setAssetProportion(Double assetProportion) {
        this.assetProportion = assetProportion;
    }

    public Double getBenchmarkProportion() {
        return benchmarkProportion;
    }

    public void setBenchmarkProportion(Double benchmarkProportion) {
        this.benchmarkProportion = benchmarkProportion;
    }

    public Double getOverBaseRatio() {
        return overBaseRatio;
    }

    public void setOverBaseRatio(Double overBaseRatio) {
        this.overBaseRatio = overBaseRatio;
    }
}
