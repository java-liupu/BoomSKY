package com.mr.boomsky_promotion_service.controller;

import com.mr.boomsky_promotion_service.pojo.SmsHomeRecommendSubject;
import com.mr.boomsky_promotion_service.service.ISmsHomeRecommendSubjectSer;
import com.mr.boomsky_promotion_service.util.CommonResult;
import com.mr.boomsky_promotion_service.util.JyyData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/home/recommendSubject")
public class SmsHomeRecommendSubjectController {

    @Autowired
    private ISmsHomeRecommendSubjectSer smsHomeRecommendSubjectSer;

    /*
    * 查询
    * */
    @ResponseBody
    @RequestMapping("/list")
    public JyyData list(@RequestParam Integer pageNum,@RequestParam Integer pageSize){
        SmsHomeRecommendSubject homeRecommendSubject = new SmsHomeRecommendSubject();
        homeRecommendSubject.setPageNum(pageNum);
        homeRecommendSubject.setPageSize(pageSize);
        JyyData dg=  smsHomeRecommendSubjectSer.findHomeSubjectList(homeRecommendSubject);
        return dg;
    }

    /*
    * 增加方法
    * */

    @ResponseBody
    @RequestMapping("/create")
    public CommonResult create(@RequestBody List<SmsHomeRecommendSubject> recommendSubjectList){
        int count = smsHomeRecommendSubjectSer.addHomeSubject(recommendSubjectList);
        if (count > 0){
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    /*
    *
    * 修改推荐排序
    * */
    @ResponseBody
    @RequestMapping("/update/sort/{id}")
    public CommonResult updateSort(@PathVariable Long id,Integer sort){
        int count =smsHomeRecommendSubjectSer.updateSort(id,sort);
        if (count > 0){
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    /*
    *
    * 批量删除推荐
    * */
    @ResponseBody
    @RequestMapping("/delete")
    public CommonResult delete(String ids){
        Integer cu = null;
        int count = smsHomeRecommendSubjectSer.delete(ids);
        if (count > 0){
            cu=200;
        }
        return CommonResult.success(cu);
    }
    /**
     *fzl
     *批量修改推荐状态
     */
    @ResponseBody
    @RequestMapping("/update/recommendStatus")
    public CommonResult updateRecommendStatus(@RequestParam("ids") List<Long> ids, @RequestParam Integer recommendStatus){
        int count = smsHomeRecommendSubjectSer.updateRecommendStatus(ids,recommendStatus);
        if (count > 0){
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }
}
