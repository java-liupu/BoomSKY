package com.mr.goods.mapper;


import com.mr.goods.pojo.PmsProductItem;

import java.util.List;

/**
 * 商品分类自定义Dao
 * Created by macro on 2018/5/25.
 */
public interface PmsProductCategoryDao {
    List<PmsProductItem> listWithChildren();
}
