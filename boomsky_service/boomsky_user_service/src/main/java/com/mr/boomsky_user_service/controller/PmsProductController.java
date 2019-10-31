package com.mr.boomsky_user_service.controller;


import com.mr.boomsky_user_service.pojo.PmsProduct;
import com.mr.boomsky_user_service.service.PmsGoodService;
import com.mr.boomsky_user_service.util.CommonResult;
import com.mr.boomsky_user_service.util.PageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 *  调用 商品列表 接口
 */
@Controller
@RequestMapping("product")
public class PmsProductController {

    @Autowired
    private PmsGoodService pmsGoodService;

    //  调用 全部商品信息接口
    @ResponseBody
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public CommonResult<PageUtils<PmsProduct>> list(@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                                               @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize) {

        return pmsGoodService.list(pageNum,pageSize);
    }

    // 删除商品信息 (逻辑删除)
    @ResponseBody
    @RequestMapping(value = "/update/deleteStatus",method = RequestMethod.POST)
    public CommonResult<String> deleteProductInfo(@RequestParam List<Long> ids,@RequestParam Integer deleteStatus){
        return pmsGoodService.deleteStatus(ids);
    }

}
