package com.mr.boomsky_promotion_service.controller;

import com.mr.boomsky_promotion_service.pojo.SmsHomeRecommendSubject;
import com.mr.boomsky_promotion_service.service.ISmsHomeRecommendSubjectSer;
import com.mr.boomsky_promotion_service.util.CommonResult;
import com.mr.boomsky_promotion_service.util.DataGrid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
    public CommonResult<DataGrid> list(SmsHomeRecommendSubject homeRecommendSubject){
        DataGrid dg=  smsHomeRecommendSubjectSer.findHomeSubjectList(homeRecommendSubject);
        return CommonResult.success(dg);
    }

    /*
    * 增加方法
    * */

    @ResponseBody
    @RequestMapping("/create")
    public Map<String,Object> addHomeSubject(@RequestBody SmsHomeRecommendSubject smsHomeRecommendSubject){
        Map<String,Object> map = smsHomeRecommendSubjectSer.addHomeSubject(smsHomeRecommendSubject);
        return map;
    }


}
