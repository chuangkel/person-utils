package com.github.chuangkel.dao.mapper;

import com.github.chuangkel.domain.entity.HolderType;
import com.github.chuangkel.domain.entity.HolderTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface HolderTypeMapper {
    int countByExample(HolderTypeExample example);

    int deleteByExample(HolderTypeExample example);

    int insert(HolderType record);

    int insertSelective(HolderType record);

    List<HolderType> selectByExampleWithRowbounds(HolderTypeExample example, RowBounds rowBounds);

    List<HolderType> selectByExample(HolderTypeExample example);

    int updateByExampleSelective(@Param("record") HolderType record, @Param("example") HolderTypeExample example);

    int updateByExample(@Param("record") HolderType record, @Param("example") HolderTypeExample example);
}