package com.mr.boomsky_promotion_service.service.impl;

import com.mr.boomsky_promotion_service.mapper.SmsHomeRecommendSubjectMapper;
import com.mr.boomsky_promotion_service.pojo.SmsHomeRecommendSubject;
import com.mr.boomsky_promotion_service.service.ISmsHomeRecommendSubjectSer;
import com.mr.boomsky_promotion_service.util.DataGrid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HomeRecommendSubServiceImpl implements ISmsHomeRecommendSubjectSer {

    @Autowired
    private SmsHomeRecommendSubjectMapper homeRecommendSubMapper;

    /*
    * 查询+分页
    * */
    @Override
    public DataGrid findHomeSubjectList(SmsHomeRecommendSubject homeRecommendSubject) {
        DataGrid dg = new DataGrid();
        int total = homeRecommendSubMapper.findHomeSubjectTotal(homeRecommendSubject);
        dg.setTotal(total);
        homeRecommendSubject.calculate();
       List<SmsHomeRecommendSubject> list = homeRecommendSubMapper.findHomeSubjectList();
       dg.setRows(list);
        return dg;
    }
}
