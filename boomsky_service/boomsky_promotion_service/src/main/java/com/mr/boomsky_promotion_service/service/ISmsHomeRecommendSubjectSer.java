package com.mr.boomsky_promotion_service.service;

import com.mr.boomsky_promotion_service.pojo.SmsHomeRecommendSubject;
import com.mr.boomsky_promotion_service.util.CommonResult;
import com.mr.boomsky_promotion_service.util.JyyData;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

public interface ISmsHomeRecommendSubjectSer {
    //查询
    JyyData findHomeSubjectList(SmsHomeRecommendSubject homeRecommendSubject);

    @Transactional
    int addHomeSubject(List<SmsHomeRecommendSubject> recommendSubjectList);

    int updateSort(Long id, Integer sort);

    int delete(String ids);

    int updateRecommendStatus(List<Long> ids, Integer recommendStatus);
}
