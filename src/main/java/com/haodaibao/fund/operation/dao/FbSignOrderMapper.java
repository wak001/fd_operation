package com.haodaibao.fund.operation.dao;

import java.util.List;

import com.haodaibao.fund.operation.domain.FbSignOrder;
import com.haodaibao.fund.operation.domain.FbSignOrderExample;
import org.apache.ibatis.annotations.Param;

public interface FbSignOrderMapper {
    int countByExample(FbSignOrderExample example);

    int deleteByExample(FbSignOrderExample example);

    int deleteByPrimaryKey(Long id);

    int insert(FbSignOrder record);

    int insertSelective(FbSignOrder record);

    List<FbSignOrder> selectByExample(FbSignOrderExample example);

    FbSignOrder selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") FbSignOrder record, @Param("example") FbSignOrderExample example);

    int updateByExample(@Param("record") FbSignOrder record, @Param("example") FbSignOrderExample example);

    int updateByPrimaryKeySelective(FbSignOrder record);

    int updateByPrimaryKey(FbSignOrder record);
}