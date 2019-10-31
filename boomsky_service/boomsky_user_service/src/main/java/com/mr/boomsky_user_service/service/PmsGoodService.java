package com.mr.boomsky_user_service.service;


import com.mr.boomsky_user_service.pojo.PmsBrand;
import com.mr.boomsky_user_service.pojo.PmsProduct;
import com.mr.boomsky_user_service.pojoVO.PmsProductItem;
import com.mr.boomsky_user_service.util.CommonResult;
import com.mr.boomsky_user_service.util.PageUtils;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * 调用 商品信息  接口
 */
@FeignClient("GOODSSERVICE")
public interface PmsGoodService {

    @RequestMapping(value = "brand/list", method = RequestMethod.GET)
    CommonResult<PageUtils<PmsBrand>> findBrandList(@RequestParam Integer pageNum,@RequestParam Integer pageSize);

    @RequestMapping(value = "product/list",method = RequestMethod.GET)
    CommonResult<PageUtils<PmsProduct>> list(@RequestParam Integer pageNum, @RequestParam Integer pageSize);

    @RequestMapping(value = "productCategory/list/withChildren", method = RequestMethod.GET)
    CommonResult<List<PmsProductItem>> listWithChildren();

    @RequestMapping(value = "product/update/deleteStatus",method = RequestMethod.POST)
    CommonResult<String> deleteStatus(@RequestParam List<Long> ids);

}
