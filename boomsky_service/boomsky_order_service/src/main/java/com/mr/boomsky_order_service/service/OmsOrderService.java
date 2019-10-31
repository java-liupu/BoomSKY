package com.mr.boomsky_order_service.service;

import com.mr.boomsky_order_service.pojo.OmsOrder;
import com.mr.boomsky_order_service.pojoVO.OmsOrderVo;

import java.util.List;

public interface OmsOrderService {


    List<OmsOrder> list(OmsOrderVo omsOrderVo);

}
