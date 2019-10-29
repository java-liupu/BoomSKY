package com.mr.boomsky_promotion_service.controller;

import com.mr.boomsky_promotion_service.pojo.SmsHomeRecommendSubject;
import com.mr.boomsky_promotion_service.service.ISmsHomeRecommendSubjectSer;
import com.mr.boomsky_promotion_service.util.DataGrid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Controller
@RequestMapping("home/recommendSubject")
public class SmsHomeRecommendSubjectController {

    @Autowired
    private ISmsHomeRecommendSubjectSer smsHomeRecommendSubjectSer;

    @ResponseBody
    @RequestMapping("/list")
    public DataGrid findHomeSubjectList(SmsHomeRecommendSubject homeRecommendSubject){
       DataGrid dg=  smsHomeRecommendSubjectSer.findHomeSubjectList(homeRecommendSubject);
        return dg;
    }

}
