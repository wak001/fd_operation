package com.haodaibao.fund.operation.dao;

import java.util.List;

import com.haodaibao.fund.operation.domain.FbPurchaseOrder;
import com.haodaibao.fund.operation.domain.FbPurchaseOrderExample;
import org.apache.ibatis.annotations.Param;

public interface FbPurchaseOrderMapper {
    int countByExample(FbPurchaseOrderExample example);

    int deleteByExample(FbPurchaseOrderExample example);

    int deleteByPrimaryKey(Long id);

    int insert(FbPurchaseOrder record);

    int insertSelective(FbPurchaseOrder record);

    List<FbPurchaseOrder> selectByExample(FbPurchaseOrderExample example);

    FbPurchaseOrder selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") FbPurchaseOrder record, @Param("example") FbPurchaseOrderExample example);

    int updateByExample(@Param("record") FbPurchaseOrder record, @Param("example") FbPurchaseOrderExample example);

    int updateByPrimaryKeySelective(FbPurchaseOrder record);

    int updateByPrimaryKey(FbPurchaseOrder record);
}