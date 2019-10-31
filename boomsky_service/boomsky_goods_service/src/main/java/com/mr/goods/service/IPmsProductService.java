package com.mr.goods.service;

import com.mr.goods.pojo.PmsProduct;
import com.mr.goods.util.CommonResult;
import com.mr.goods.util.PageUtils;

import java.util.List;
import java.util.Map;

public interface IPmsProductService {

    CommonResult<PageUtils<PmsProduct>> findProductList(Integer pageNum,Integer pageSize);

    Integer deleteProductInfo(Integer ids);
}
