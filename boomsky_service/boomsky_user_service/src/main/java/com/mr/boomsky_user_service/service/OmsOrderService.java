package com.mr.boomsky_user_service.service;

import com.mr.boomsky_user_service.api.CommonPage;
import com.mr.boomsky_user_service.pojo.OmsOrder;
import com.mr.boomsky_user_service.util.CommonResult;
import com.mr.boomsky_user_service.util.PageUtil;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * 调用 订单  接口
 */
@FeignClient("ORDERSERVICE")
public interface OmsOrderService {

    // 查询全部订单信息
    @RequestMapping(value = "order/list",method = RequestMethod.GET)
    CommonResult<PageUtil> getOmsOrderList(@RequestParam Map<String,Object> pageMap);

    @RequestMapping(value = "order/test",method = RequestMethod.GET)
    String test(@RequestParam Map<String,Object> test);

    @RequestMapping(value = "order/delete",method = RequestMethod.POST)
    int delete(@RequestParam List<Long> ids);
}
