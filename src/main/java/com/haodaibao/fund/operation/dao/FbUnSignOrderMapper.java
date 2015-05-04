package com.haodaibao.fund.operation.dao;

import java.util.List;

import com.haodaibao.fund.operation.domain.FbUnSignOrderExample;
import com.haodaibao.fund.operation.domain.FbUnSignOrder;
import org.apache.ibatis.annotations.Param;

public interface FbUnSignOrderMapper {
    int countByExample(FbUnSignOrderExample example);

    int deleteByExample(FbUnSignOrderExample example);

    int deleteByPrimaryKey(Long id);

    int insert(FbUnSignOrder record);

    int insertSelective(FbUnSignOrder record);

    List<FbUnSignOrder> selectByExample(FbUnSignOrderExample example);

    FbUnSignOrder selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") FbUnSignOrder record, @Param("example") FbUnSignOrderExample example);

    int updateByExample(@Param("record") FbUnSignOrder record, @Param("example") FbUnSignOrderExample example);

    int updateByPrimaryKeySelective(FbUnSignOrder record);

    int updateByPrimaryKey(FbUnSignOrder record);
}