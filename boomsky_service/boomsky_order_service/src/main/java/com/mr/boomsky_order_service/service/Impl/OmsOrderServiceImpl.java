package com.mr.boomsky_order_service.service.Impl;


import com.mr.boomsky_order_service.mapper.OmsOrderMapper;
import com.mr.boomsky_order_service.pojo.OmsOrder;
import com.mr.boomsky_order_service.pojoVO.OmsOrderVo;
import com.mr.boomsky_order_service.service.OmsOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OmsOrderServiceImpl implements OmsOrderService {

    @Autowired
    private OmsOrderMapper omsOrderMapper;

    @Override
    public List<OmsOrder> list(OmsOrderVo omsOrderVo) {

        // PageHelper.startPage(pageSize,pageNum);

        return omsOrderMapper.list(omsOrderVo);
    }
}
