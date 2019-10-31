package com.mr.goods.mapper;

import com.mr.goods.pojo.PmsBrand;
import com.mr.goods.util.CommonResult;
import com.mr.goods.util.PageUtils;


import java.util.List;

public interface PmsBrandMapper {

    //获取全部品牌列表
    List<PmsBrand> findBrandList(PageUtils<PmsBrand> pageBrand);

    //查询总条数
    Integer findTotalNum();

    //添加品牌
    CommonResult addBrand(PmsBrand brandVO);
}
