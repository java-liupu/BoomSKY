package com.mr.boomsky_promotion_service.service;

import com.mr.boomsky_promotion_service.pojo.SmsHomeRecommendSubject;
import com.mr.boomsky_promotion_service.util.DataGrid;

public interface ISmsHomeRecommendSubjectSer {
    //查询
    DataGrid findHomeSubjectList(SmsHomeRecommendSubject homeRecommendSubject);
}
