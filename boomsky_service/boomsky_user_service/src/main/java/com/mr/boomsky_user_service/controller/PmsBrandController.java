package com.mr.boomsky_user_service.controller;

import com.mr.boomsky_user_service.pojo.PmsBrand;
import com.mr.boomsky_user_service.service.PmsGoodService;
import com.mr.boomsky_user_service.util.CommonResult;
import com.mr.boomsky_user_service.util.PageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 调用  品牌管理 接口
 */
@RestController
@RequestMapping("brand")
public class PmsBrandController {

    @Autowired
    private PmsGoodService pmsGoodService;
    //获取全部品牌列表
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<PageUtils<PmsBrand>> findBrandList(@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                                           @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize) {

        return pmsGoodService.findBrandList(pageNum,pageSize);
    }

}
