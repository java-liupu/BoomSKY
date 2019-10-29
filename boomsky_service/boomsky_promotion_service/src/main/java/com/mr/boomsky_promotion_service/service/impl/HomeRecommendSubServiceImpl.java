package com.mr.boomsky_promotion_service.service.impl;

import com.mr.boomsky_promotion_service.mapper.SmsHomeRecommendSubjectMapper;
import com.mr.boomsky_promotion_service.pojo.SmsHomeRecommendSubject;
import com.mr.boomsky_promotion_service.pojo.SmsHomeRecommendSubjectExample;
import com.mr.boomsky_promotion_service.service.ISmsHomeRecommendSubjectSer;
import com.mr.boomsky_promotion_service.util.CommonConstant;
import com.mr.boomsky_promotion_service.util.DataGrid;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
       //条件查询
        SmsHomeRecommendSubjectExample example = new SmsHomeRecommendSubjectExample();
        SmsHomeRecommendSubjectExample.Criteria criteria = example.createCriteria();
        //按名字查询
        if (!StringUtils.isEmpty(homeRecommendSubject.getSubjectName())){
            criteria.andSubjectNameLike("%"+homeRecommendSubject.getSubjectName()+"%");
        }
        //状态
        if(homeRecommendSubject.getRecommendStatus()!=null){
            criteria.andRecommendStatusEqualTo(homeRecommendSubject.getRecommendStatus());
        }
        example.setOrderByClause("sort desc");

        return dg;
    }

    @Override
    public Map<String, Object> addHomeSubject(SmsHomeRecommendSubject smsHomeRecommendSubject) {
        Map<String, Object> retMap = new HashMap<>();
        int stauts = homeRecommendSubMapper.addHomeSubject(smsHomeRecommendSubject);
        retMap.put(CommonConstant.ERROR_CODE,stauts);
        return retMap;
    }
}
