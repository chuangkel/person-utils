package com.github.chuangkel.dao.mapper;

import com.github.chuangkel.domain.entity.TopHoldingIndustry;
import com.github.chuangkel.domain.entity.TopHoldingIndustryExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

@Mapper
public interface TopHoldingIndustryMapper {
    int countByExample(TopHoldingIndustryExample example);

    int deleteByExample(TopHoldingIndustryExample example);

    int insert(TopHoldingIndustry record);

    int insertSelective(TopHoldingIndustry record);

    List<TopHoldingIndustry> selectByExampleWithRowbounds(TopHoldingIndustryExample example, RowBounds rowBounds);

    List<TopHoldingIndustry> selectByExample(TopHoldingIndustryExample example);

    int updateByExampleSelective(@Param("record") TopHoldingIndustry record, @Param("example") TopHoldingIndustryExample example);

    int updateByExample(@Param("record") TopHoldingIndustry record, @Param("example") TopHoldingIndustryExample example);
}