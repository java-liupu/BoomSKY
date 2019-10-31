package com.mr.goods.service;

import com.mr.goods.pojo.PmsBrand;
import com.mr.goods.util.CommonResult;
import com.mr.goods.util.PageUtils;

public interface IPmsBrandService {

    CommonResult<PageUtils<PmsBrand>> list(Integer pageNum, Integer pageSize);

    CommonResult addBrand(PmsBrand brandVO);

//    int deleteBrand(PmsBrand brandVO);
//
//    int addBrand(PmsBrand brandVO);
//
//    PmsBrand findBrandById(PmsBrand brandVO);
}
