package com.mr.boomsky_promotion_service.mapper;

import com.mr.boomsky_promotion_service.pojo.SmsHomeRecommendSubject;
import com.mr.boomsky_promotion_service.pojo.SmsHomeRecommendSubjectExample;

import java.util.List;

public interface SmsHomeRecommendSubjectMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SmsHomeRecommendSubject record);

    int insertSelective(SmsHomeRecommendSubject record);

    SmsHomeRecommendSubject selectByPrimaryKey(Long id);



    int updateByPrimaryKey(SmsHomeRecommendSubject record);

    //查询总条数
    int findHomeSubjectTotal(SmsHomeRecommendSubject homeRecommendSubject);
    //查询所有
    List<SmsHomeRecommendSubject> findHomeSubjectList(SmsHomeRecommendSubject homeRecommendSubject);
    //增加
    int addHomeSubject(SmsHomeRecommendSubject smsHomeRecommendSubject);
    //修改推荐排序
    int updateByPrimaryKeySelective(SmsHomeRecommendSubject srs);
    //删除
    int deleteByExample(SmsHomeRecommendSubjectExample example);
}