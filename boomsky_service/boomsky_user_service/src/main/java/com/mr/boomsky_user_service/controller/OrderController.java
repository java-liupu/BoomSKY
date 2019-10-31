package com.mr.boomsky_user_service.controller;

import com.mr.boomsky_user_service.api.CommonPage;
import com.mr.boomsky_user_service.pojo.OmsOrder;
import com.mr.boomsky_user_service.service.OmsOrderService;
import com.mr.boomsky_user_service.util.CommonResult;
import com.mr.boomsky_user_service.util.PageUtil;
import javafx.scene.control.IndexRange;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("order")
public class OrderController {

    @Autowired
    private OmsOrderService omsOrderSer;

    // 调用 查询全部订单信息  接口
    @ResponseBody
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public CommonResult<PageUtil> getOmsOrderList(@RequestParam Integer pageNum,Integer pageSize){
        System.out.println("参数是："+ pageNum +"---"+pageSize);
        Map<String,Object> pageMap = new HashMap<>();
        pageMap.put("pageNum",pageNum);
        pageMap.put("pageSize",pageSize);
        //CommonResult<CommonPage<OmsOrder>> orderList = omsOrderSer.getOmsOrderList(omsOrderVo);

        return omsOrderSer.getOmsOrderList(pageMap);
    }

    // 调用 删除订单 delete?ids=12
    @ResponseBody
    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    public CommonResult delete(@RequestParam List<Long> ids){
        System.out.println(ids);
         int count = omsOrderSer.delete(ids);
         if(count >0){
             return CommonResult.success(count);
         }
        return CommonResult.failed();
    }

    // @RequestParam : 可以传递单一的属性
    @ResponseBody
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String test(@RequestParam Integer ping, Integer pang){
        Map<String,Object> map = new HashMap<>();
        map.put("ping",ping);
        map.put("pang",pang);
        String test1 = omsOrderSer.test(map);
        return test1;
    }
    

}
