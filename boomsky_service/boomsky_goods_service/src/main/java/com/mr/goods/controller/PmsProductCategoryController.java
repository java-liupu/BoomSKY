package com.mr.goods.controller;


import com.mr.goods.pojo.PmsProductItem;
import com.mr.goods.service.PmsProductCategoryService;
import com.mr.goods.util.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 *  商品分类
 */
@Controller
@RequestMapping("/productCategory")
public class PmsProductCategoryController {

    @Autowired
    private PmsProductCategoryService productCategoryService;

    @RequestMapping(value = "/list/withChildren", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<PmsProductItem>> listWithChildren() {
        List<PmsProductItem> list = productCategoryService.listWithChildren();
        return CommonResult.success(list);
    }

}
