package com.github.chuangkel.hold_type;

import java.math.BigDecimal;

/**
 * @program: excel_parser
 * @description:
 * @author: chuangkel
 * @create: 2019-05-18 14:11
 **/
public class ObjDto {
    private int port_id;
    private int business_date;
    private String fund_account;
    private String holder_name;
    private BigDecimal share_ratio;
    private BigDecimal holding_amount;

    public int getPort_id() {
        return port_id;
    }

    public void setPort_id(int port_id) {
        this.port_id = port_id;
    }

    public int getBusiness_date() {
        return business_date;
    }

    public void setBusiness_date(int business_date) {
        this.business_date = business_date;
    }

    public String getFund_account() {
        return fund_account;
    }

    public void setFund_account(String fund_account) {
        this.fund_account = fund_account;
    }

    public String getHolder_name() {
        return holder_name;
    }

    public void setHolder_name(String holder_name) {
        this.holder_name = holder_name;
    }

    public BigDecimal getShare_ratio() {
        return share_ratio;
    }

    public void setShare_ratio(BigDecimal share_ratio) {
        this.share_ratio = share_ratio;
    }

    public BigDecimal getHolding_amount() {
        return holding_amount;
    }

    public void setHolding_amount(BigDecimal holding_amount) {
        this.holding_amount = holding_amount;
    }
}
