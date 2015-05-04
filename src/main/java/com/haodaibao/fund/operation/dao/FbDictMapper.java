package com.haodaibao.fund.operation.dao;

import java.util.List;

import com.haodaibao.fund.operation.domain.FbDict;
import com.haodaibao.fund.operation.domain.FbDictExample;
import org.apache.ibatis.annotations.Param;

public interface FbDictMapper {
    int countByExample(FbDictExample example);

    int deleteByExample(FbDictExample example);

    int deleteByPrimaryKey(Long id);

    int insert(FbDict record);

    int insertSelective(FbDict record);

    List<FbDict> selectByExample(FbDictExample example);

    FbDict selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") FbDict record, @Param("example") FbDictExample example);

    int updateByExample(@Param("record") FbDict record, @Param("example") FbDictExample example);

    int updateByPrimaryKeySelective(FbDict record);

    int updateByPrimaryKey(FbDict record);
}