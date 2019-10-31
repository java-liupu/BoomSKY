package com.mr.boomsky_order_service.service;

import com.mr.boomsky_order_service.pojoVO.OmsOrderVo;
import com.mr.boomsky_order_service.util.PageUtil;

import java.util.List;

public interface OmsOrderService {


    PageUtil list(OmsOrderVo omsOrderVo);

    int delete(List<Long> ids);

}
