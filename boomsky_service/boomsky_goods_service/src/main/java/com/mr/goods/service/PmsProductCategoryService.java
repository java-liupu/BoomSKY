package com.mr.goods.service;

import com.mr.goods.pojo.PmsProductItem;

import java.util.List;

/**
 * 产品分类Service
 * Created by macro on 2018/4/26.
 */
public interface PmsProductCategoryService {

    List<PmsProductItem> listWithChildren();
}
