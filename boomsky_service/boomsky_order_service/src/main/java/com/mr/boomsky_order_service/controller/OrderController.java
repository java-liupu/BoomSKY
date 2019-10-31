package com.mr.boomsky_order_service.controller;

import com.mr.boomsky_order_service.api.CommonPage;
import com.mr.boomsky_order_service.pojo.OmsOrder;
import com.mr.boomsky_order_service.pojoVO.OmsOrderVo;
import com.mr.boomsky_order_service.service.OmsOrderService;
import com.mr.boomsky_order_service.util.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("order")
public class OrderController {

    @Autowired
    private OmsOrderService orderService;

    /**
     * 查询全部订单信息
     * @param omsOrderVo
     * @return
     */
    @ResponseBody
    @GetMapping(value = "/list")
    public CommonResult<CommonPage<OmsOrder>> list(OmsOrderVo omsOrderVo){

        List<OmsOrder> orderList = orderService.list(omsOrderVo);

        return CommonResult.success(CommonPage.restPage(orderList));
    }

    /**
     * 批量删除订单
     */
}
