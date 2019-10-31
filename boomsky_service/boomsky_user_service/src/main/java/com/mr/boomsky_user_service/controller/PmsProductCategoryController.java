package com.mr.boomsky_user_service.controller;

import com.mr.boomsky_user_service.pojoVO.PmsProductItem;
import com.mr.boomsky_user_service.service.PmsGoodService;
import com.mr.boomsky_user_service.util.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 调用 商品分类  接口
 */
@Controller
@RequestMapping("/productCategory")
public class PmsProductCategoryController {

    @Autowired
    private PmsGoodService pmsGoodService;

    @RequestMapping(value = "/list/withChildren", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<PmsProductItem>> listWithChildren() {

        return pmsGoodService.listWithChildren();
    }

}
