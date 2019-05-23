package com.github.chuangkel.dao.mapper;

import com.github.chuangkel.domain.entity.Issuer;
import com.github.chuangkel.domain.entity.IssuerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface IssuerMapper {
    int countByExample(IssuerExample example);

    int deleteByExample(IssuerExample example);

    int insert(Issuer record);

    int insertSelective(Issuer record);

    List<Issuer> selectByExampleWithRowbounds(IssuerExample example, RowBounds rowBounds);

    List<Issuer> selectByExample(IssuerExample example);

    int updateByExampleSelective(@Param("record") Issuer record, @Param("example") IssuerExample example);

    int updateByExample(@Param("record") Issuer record, @Param("example") IssuerExample example);
}