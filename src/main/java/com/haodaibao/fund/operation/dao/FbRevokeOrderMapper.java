package com.haodaibao.fund.operation.dao;

import java.util.List;

import com.haodaibao.fund.operation.domain.FbRevokeOrder;
import com.haodaibao.fund.operation.domain.FbRevokeOrderExample;
import org.apache.ibatis.annotations.Param;

public interface FbRevokeOrderMapper {
    int countByExample(FbRevokeOrderExample example);

    int deleteByExample(FbRevokeOrderExample example);

    int deleteByPrimaryKey(Long id);

    int insert(FbRevokeOrder record);

    int insertSelective(FbRevokeOrder record);

    List<FbRevokeOrder> selectByExample(FbRevokeOrderExample example);

    FbRevokeOrder selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") FbRevokeOrder record, @Param("example") FbRevokeOrderExample example);

    int updateByExample(@Param("record") FbRevokeOrder record, @Param("example") FbRevokeOrderExample example);

    int updateByPrimaryKeySelective(FbRevokeOrder record);

    int updateByPrimaryKey(FbRevokeOrder record);
}