package com.haodaibao.fund.operation.dao;

import java.util.List;

import com.haodaibao.fund.operation.domain.FbCustomer;
import com.haodaibao.fund.operation.domain.FbCustomerExample;
import org.apache.ibatis.annotations.Param;

public interface FbCustomerMapper {
    int countByExample(FbCustomerExample example);

    int deleteByExample(FbCustomerExample example);

    int deleteByPrimaryKey(Long id);

    int insert(FbCustomer record);

    int insertSelective(FbCustomer record);

    List<FbCustomer> selectByExample(FbCustomerExample example);

    FbCustomer selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") FbCustomer record, @Param("example") FbCustomerExample example);

    int updateByExample(@Param("record") FbCustomer record, @Param("example") FbCustomerExample example);

    int updateByPrimaryKeySelective(FbCustomer record);

    int updateByPrimaryKey(FbCustomer record);
}