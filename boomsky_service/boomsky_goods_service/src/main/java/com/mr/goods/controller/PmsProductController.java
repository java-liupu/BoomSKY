package com.mr.goods.controller;

import com.mr.goods.pojo.PmsProduct;
import com.mr.goods.service.IPmsProductService;
import com.mr.goods.util.CommonResult;
import com.mr.goods.util.PageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;



@Controller
@RequestMapping("/product")
public class PmsProductController {

    @Autowired
    private IPmsProductService productService;

    /*/**
    *@Description findProductList(查询)
    *@Param [pmsProduct]
    *@Return com.mr.goods.util.DataGrid
    *@Author Lxb
    *@Date 2019/10/28
    */
    @ResponseBody
    @RequestMapping(value = "/findProductList",method = RequestMethod.GET)
    public CommonResult<PageUtils<PmsProduct>> findProductList(PmsProduct pmsProduct,
                                                               @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                                             @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize) {
        CommonResult ret = new CommonResult();
        CommonResult<PageUtils<PmsProduct>>  productList = productService.findProductList(pageNum,pageSize);
        ret.setData(productList);
        return productList;
    }

    /*
    *@Description deleteProductInfo(删除)
    *@Param [ids, deleteStatus]
    *@Return com.mr.goods.util.CommonResult<java.lang.String>
    *@Author Lxb
    *@Date 2019/10/31
    */
    @ResponseBody
    @RequestMapping(value = "/deleteProductInfo",method = RequestMethod.POST)
    public CommonResult<String> deleteProductInfo(@RequestParam("ids") Integer ids,
                                                       @RequestParam("deleteStatus") Integer deleteStatus){

        CommonResult ret = new CommonResult();
        Integer del =  productService.deleteProductInfo(ids);
        ret.setCode(200);
        ret.setData(del);
        ret.setMessage("操作成功");
        return ret;
    }

}
