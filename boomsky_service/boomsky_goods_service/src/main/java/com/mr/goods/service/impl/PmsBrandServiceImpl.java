package com.mr.goods.service.impl;

import com.mr.goods.mapper.PmsBrandMapper;
import com.mr.goods.pojo.PmsBrand;
import com.mr.goods.service.IPmsBrandService;
import com.mr.goods.util.CommonResult;
import com.mr.goods.util.PageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PmsBrandServiceImpl implements IPmsBrandService {

   @Autowired
   private PmsBrandMapper brandMapper;

   //获取全部品牌列表
    @Override
    public CommonResult<PageUtils<PmsBrand>> list(Integer pageNum, Integer pageSize) {
        CommonResult<PageUtils<PmsBrand>> status = new CommonResult<>();

        PageUtils<PmsBrand> pageBrand = new PageUtils<>();
        pageBrand.setPageSize(pageSize);
        pageBrand.setPageNum(pageNum);
        //开始条数
        pageBrand.calculate();
        List<PmsBrand> brandList = brandMapper.findBrandList(pageBrand);
        pageBrand.setList(brandList);

        Integer total = brandMapper.findTotalNum();
        pageBrand.setTotal(total);

        pageBrand.setTotalPage(total/pageSize);
        status.setData(pageBrand);

        status.setCode(200);
        status.setMessage("成功");

        return status;
    }

    //添加品牌
    @Override
    public CommonResult addBrand(PmsBrand brandVO) {
        return brandMapper.addBrand(brandVO);
    }

    //获取全部品牌列表


//    @Override
//    public int deleteBrand(PmsBrand brandVO) {
//        return brandMapper.deleteBrand(brandVO);
//    }
//
//    @Override
//    public int addBrand(PmsBrand brandVO) {
//        return brandMapper.addBrand(brandVO);
//    }
//
//    @Override
//    public PmsBrand findBrandById(PmsBrand brandVO) {
//        return brandMapper.findBrandById(brandVO);
//    }


}
