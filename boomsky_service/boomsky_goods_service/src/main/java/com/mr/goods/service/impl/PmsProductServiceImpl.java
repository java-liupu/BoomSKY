package com.mr.goods.service.impl;

import com.mr.goods.mapper.PmsProductMapper;
import com.mr.goods.pojo.PmsProduct;
import com.mr.goods.service.IPmsProductService;
import com.mr.goods.util.CommonResult;
import com.mr.goods.util.PageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class PmsProductServiceImpl implements IPmsProductService {

    @Autowired
    private PmsProductMapper productMapper;


    @Override
    public CommonResult<PageUtils<PmsProduct>> findProductList(Integer pageNum,Integer pageSize) {
        /*最终返回数据*/
        CommonResult<PageUtils<PmsProduct>>  listData = new CommonResult<>();
        /*分页封装数据*/
        PageUtils<PmsProduct> pageUtils = new PageUtils<>();
        pageUtils.setPageSize(pageSize);
        pageUtils.setPageNum(pageNum);
        pageUtils.calculate();
        List<PmsProduct> list= productMapper.findProductList(pageUtils);
        pageUtils.setList(list);
        /*总条数*/
        Integer total = productMapper.getTotal();
        pageUtils.setTotal(total);
        /*总页数*/
        pageUtils.setTotalPage(total/pageSize);
        listData.setData(pageUtils);

        listData.setCode(200);
        listData.setMessage("操作成功");

        return listData;
    }

    @Override
    public Integer deleteProductInfo(Integer ids) {
        return productMapper.deleteProductInfo(ids);
    }

    //  逻辑删除商品列表信息
    @Override
    public Integer deleteStatus(List<Long> ids) {
        int count =0;
        for (int i=0;i<ids.size();i++){
            count = productMapper.updateStatus(ids.get(i));
        }
        return count;
    }


}
