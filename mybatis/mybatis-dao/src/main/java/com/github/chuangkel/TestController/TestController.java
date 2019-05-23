package com.github.chuangkel.TestController;

import com.github.chuangkel.dao.mapper.TopHoldingIndustryMapper;
import com.github.chuangkel.domain.entity.TopHoldingIndustryExample;
import org.apache.ibatis.session.RowBounds;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: personal-utils
 * @description:
 * @author: chuangkel
 * @create: 2019-05-14 20:03
 **/
@RestController
public class TestController {

    private final TopHoldingIndustryMapper topHoldingIndustryMapper;

    public TestController(TopHoldingIndustryMapper topHoldingIndustryMapper) {
        this.topHoldingIndustryMapper = topHoldingIndustryMapper;
    }
    @RequestMapping("test")
    public void topHoldingIndustry() {
        TopHoldingIndustryExample example = new TopHoldingIndustryExample();
        example.setOrderByClause("asset_proportion DESC");
        example.createCriteria()
                .andPortIdEqualTo(1)
                .andIndustryTypeNoEqualTo("1")
                .andBenchmarkIdEqualTo(1)
                .andBusinessDateEqualTo(20190514);

        RowBounds rb = new RowBounds(0,2);
        topHoldingIndustryMapper.selectByExampleWithRowbounds(example,rb);

        System.out.println();
    }
}
