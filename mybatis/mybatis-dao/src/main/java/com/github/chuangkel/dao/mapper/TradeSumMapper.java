package com.github.chuangkel.dao.mapper;

import com.github.chuangkel.domain.entity.TradeSum;
import com.github.chuangkel.domain.entity.TradeSumExample;
import com.github.chuangkel.domain.entity.TradeSumKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface TradeSumMapper {
    long countByExample(TradeSumExample example);

    int deleteByExample(TradeSumExample example);

    int deleteByPrimaryKey(TradeSumKey key);

    int insert(TradeSum record);

    int insertSelective(TradeSum record);

    List<TradeSum> selectByExampleWithRowbounds(TradeSumExample example, RowBounds rowBounds);

    List<TradeSum> selectByExample(TradeSumExample example);

    TradeSum selectByPrimaryKey(TradeSumKey key);

    int updateByExampleSelective(@Param("record") TradeSum record, @Param("example") TradeSumExample example);

    int updateByExample(@Param("record") TradeSum record, @Param("example") TradeSumExample example);

    int updateByPrimaryKeySelective(TradeSum record);

    int updateByPrimaryKey(TradeSum record);
}