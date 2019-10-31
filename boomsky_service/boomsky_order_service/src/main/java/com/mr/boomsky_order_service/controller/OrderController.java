package com.mr.boomsky_order_service.controller;

import com.mr.boomsky_order_service.api.CommonPage;
import com.mr.boomsky_order_service.pojo.OmsOrder;
import com.mr.boomsky_order_service.pojoVO.OmsOrderVo;
import com.mr.boomsky_order_service.service.OmsOrderService;
import com.mr.boomsky_order_service.util.CommonResult;
import com.mr.boomsky_order_service.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("order")
public class OrderController {

    @Autowired
    private OmsOrderService orderService;

    /**
     * 查询全部订单信息
     * @param pageMap
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public CommonResult<PageUtil> list(@RequestParam Map<String,Object> pageMap){

        Integer pageNum = Integer.parseInt((String) pageMap.get("pageNum"));
        Integer pageSize = Integer.parseInt((String) pageMap.get("pageSize"));
        OmsOrderVo omsOrderVo = new OmsOrderVo();
        omsOrderVo.setPageNum(pageNum);
        omsOrderVo.setPageSize(pageSize);

        PageUtil pageDate = orderService.list(omsOrderVo);

        return CommonResult.success(pageDate);
    }

    /**
     * 批量删除订单 (逻辑删除)
     */
    @ResponseBody
    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    public int delete(@RequestParam List<Long> ids){
        System.out.println("接收的参数是:"+ ids);
        int count = orderService.delete(ids);
        return count;
    }

    // 测试
    @ResponseBody
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String test(@RequestParam Map<String,Object> test){
        System.out.println(test.get("ping"));
        System.out.println(test.get("pang"));
        return "123";
    }

}
