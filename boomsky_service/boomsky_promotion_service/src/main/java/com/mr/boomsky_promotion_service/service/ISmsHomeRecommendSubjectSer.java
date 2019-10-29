package com.mr.boomsky_promotion_service.service;

import com.mr.boomsky_promotion_service.pojo.SmsHomeRecommendSubject;
import com.mr.boomsky_promotion_service.util.DataGrid;

import java.util.Map;

public interface ISmsHomeRecommendSubjectSer {
    //查询
    DataGrid findHomeSubjectList(SmsHomeRecommendSubject homeRecommendSubject);

    Map<String, Object> addHomeSubject(SmsHomeRecommendSubject smsHomeRecommendSubject);
}
