package com.mr.boomsky_promotion_service.mapper;

import com.mr.boomsky_promotion_service.pojo.SmsHomeRecommendSubject;

import java.util.List;

public interface SmsHomeRecommendSubjectMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SmsHomeRecommendSubject record);

    int insertSelective(SmsHomeRecommendSubject record);

    SmsHomeRecommendSubject selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SmsHomeRecommendSubject record);

    int updateByPrimaryKey(SmsHomeRecommendSubject record);

    int findHomeSubjectTotal(SmsHomeRecommendSubject homeRecommendSubject);

    List<SmsHomeRecommendSubject> findHomeSubjectList();
}