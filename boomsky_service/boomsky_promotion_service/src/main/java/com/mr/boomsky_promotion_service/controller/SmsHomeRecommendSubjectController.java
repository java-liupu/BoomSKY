package com.mr.boomsky_promotion_service.controller;

import com.mr.boomsky_promotion_service.service.ISmsHomeRecommendSubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home/recommendSubject")
public class SmsHomeRecommendSubjectController {

    //注入service
    @Autowired
    private ISmsHomeRecommendSubjectService SmsHomeRecommendSubjectSer;

    
}
