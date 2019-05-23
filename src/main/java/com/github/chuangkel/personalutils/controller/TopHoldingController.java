package com.github.chuangkel.personalutils.controller;

import com.github.chuangkel.personalutils.dto.TopHoldingIndustryRequest;
import com.google.common.base.CaseFormat;
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

    public static void main(String[] args) {
        System.out.println(CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, "TopHoldingIndustry"));
    }

}
