package com.github.chuangkel.dto;
import java.io.Serializable;

/**
 * 持有人集中度历史变化  请求参数的DTO
 * @author ares studio
 *
 */

public class HisHoldConcentrationChangeRequest implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer portId; //账户序号
    private Integer beginDate; //起始日
    private Integer topn; //前N大配置
    private Integer endDate; //结束日期

    public Integer getPortId(){
        return this.portId;
    }
    public void setPortId( Integer portId ){
        this.portId = portId;
    }
    public Integer getBeginDate(){
        return this.beginDate;
    }
    public void setBeginDate( Integer beginDate ){
        this.beginDate = beginDate;
    }
    public Integer getTopn(){
        return this.topn;
    }
    public void setTopn( Integer topn ){
        this.topn = topn;
    }
    public Integer getEndDate(){
        return this.endDate;
    }
    public void setEndDate( Integer endDate ){
        this.endDate = endDate;
    }

}
