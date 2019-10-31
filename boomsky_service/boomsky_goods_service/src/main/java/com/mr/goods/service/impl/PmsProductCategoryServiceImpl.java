package com.mr.goods.service.impl;

import com.mr.goods.mapper.PmsProductCategoryDao;
import com.mr.goods.pojo.PmsProductItem;
import com.mr.goods.service.PmsProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * PmsProductCategoryService实现类
 * Created by macro on 2018/4/26.
 */
@Service
public class PmsProductCategoryServiceImpl implements PmsProductCategoryService {

    @Autowired
    private PmsProductCategoryDao productCategoryDao;

    @Override
    public List<PmsProductItem> listWithChildren() {
        return productCategoryDao.listWithChildren();
    }


}
