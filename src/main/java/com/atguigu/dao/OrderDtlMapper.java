package com.atguigu.dao;

import com.atguigu.entity.OrderDtl;

public interface OrderDtlMapper {
    int deleteByPrimaryKey(String orderNo);

    int insert(OrderDtl record);

    int insertSelective(OrderDtl record);

    OrderDtl selectByPrimaryKey(String orderNo);

    int updateByPrimaryKeySelective(OrderDtl record);

    int updateByPrimaryKey(OrderDtl record);
}