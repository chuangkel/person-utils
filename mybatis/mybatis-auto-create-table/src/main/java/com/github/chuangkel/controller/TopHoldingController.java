package com.github.chuangkel.controller;

import com.github.chuangkel.dto.HisHoldConcentrationChangeRequest;
import com.github.chuangkel.dto.LowIndustryRequest;
import com.github.chuangkel.dto.TopHoldingIndustryRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: demo
 * @description:
 * @author: chuangkel
 * @create: 2019-05-09 10:12
 **/
@RestController
public class TopHoldingController {

    @GetMapping("/test")
    public TopHoldingIndustryRequest getTest(){
        TopHoldingIndustryRequest t = new TopHoldingIndustryRequest();
        t.setBenchmarkId(1);
        t.setBusinessDate(1);
        t.setIndustryTypeNo("1");
        t.setPortId(1);
        t.setTopn(1);
        return t;
    }

    @GetMapping("/test1")
    public LowIndustryRequest getTest1(){
        LowIndustryRequest request = new LowIndustryRequest();
        request.setBenchmarkId(1);
        request.setBusinessDate(20190501);
        request.setIndustryTypeNo("100100");
        request.setOverBaseFlag("-1");
        request.setTopn(10);
        request.setPortId(1);
        return request;
    }

    @GetMapping("/test2")
    public HisHoldConcentrationChangeRequest getTest2(){
        HisHoldConcentrationChangeRequest request = new HisHoldConcentrationChangeRequest();
        request.setBeginDate(20190501);
        request.setPortId(1);
        request.setTopn(6);
        request.setEndDate(20190507);
        return request;
    }


}
