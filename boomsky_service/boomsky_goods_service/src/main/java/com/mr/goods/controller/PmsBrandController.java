package com.mr.goods.controller;

import com.mr.goods.pojo.PmsBrand;
import com.mr.goods.service.IPmsBrandService;
import com.mr.goods.util.CommonResult;
import com.mr.goods.util.PageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("brand")
public class PmsBrandController {

    @Autowired
    private IPmsBrandService brandService;

    //获取全部品牌列表
    @RequestMapping(value = "/findBrandList", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<PageUtils<PmsBrand>> findBrandList(@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                                     @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize) {
        CommonResult cr = new CommonResult();
        CommonResult<PageUtils<PmsBrand>> list = brandService.findBrandList(pageNum,pageSize);
        cr.setData(list);
        return list;
    }

    //添加
    @ResponseBody
    @RequestMapping("/addBrand")
    public CommonResult addBrand(PmsBrand brandVO){
//        CommonResult commonResult = new CommonResult();
//        int status = brandService.addBrand(brandVO);
//        commonResult.setCode(status);
//        return commonResult;
        return brandService.addBrand(brandVO);
    }

        //删除
//    @ResponseBody
//    @RequestMapping("/deleteBrand")
//    public Map<String,Object> deleteBrand(PmsBrand brandVO){
//        Map<String,Object> retMap = new HashMap<>();
//        int status = brandService.deleteBrand(brandVO);
//        retMap.put("errorCode",status);
//        return retMap;
//    }

       //根据id查询
//    @ResponseBody
//    @RequestMapping("/findBrandById")
//    public PmsBrand findBrandById(PmsBrand brandVO){
//        return brandService.findBrandById(brandVO);
//    }
}
