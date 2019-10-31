package com.mr.boomsky_order_service.mapper;

import com.mr.boomsky_order_service.pojo.OmsOrder;
import com.mr.boomsky_order_service.pojoVO.OmsOrderVo;

import java.util.List;

public interface OmsOrderMapper {
    int deleteByPrimaryKey(Long id);

    int insert(OmsOrder record);

    int insertSelective(OmsOrder record);

    OmsOrder selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OmsOrder record);

    int updateByPrimaryKey(OmsOrder record);

     /*--------------- 一下测试订单相关方法  -------------------*/
    List<OmsOrder> list(OmsOrderVo omsOrderVo);
}