package com.mr.goods.mapper;

import com.mr.goods.pojo.PmsProduct;
import com.mr.goods.util.PageUtils;

import java.util.List;

public interface PmsProductMapper {

    Integer getTotal();

    List<PmsProduct> findProductList(PageUtils pa);

    Integer deleteProductInfo(Integer ids);

    int updateStatus(Long id);
}
