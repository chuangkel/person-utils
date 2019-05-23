package com.github.chuangkel.dao.mapper;

import com.github.chuangkel.domain.entity.TopnHolder;
import com.github.chuangkel.domain.entity.TopnHolderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface TopnHolderMapper {
    int countByExample(TopnHolderExample example);

    int deleteByExample(TopnHolderExample example);

    int insert(TopnHolder record);

    int insertSelective(TopnHolder record);

    List<TopnHolder> selectByExampleWithRowbounds(TopnHolderExample example, RowBounds rowBounds);

    List<TopnHolder> selectByExample(TopnHolderExample example);

    int updateByExampleSelective(@Param("record") TopnHolder record, @Param("example") TopnHolderExample example);

    int updateByExample(@Param("record") TopnHolder record, @Param("example") TopnHolderExample example);
}