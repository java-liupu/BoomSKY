package com.mr.boomsky_promotion_service.service.impl;

import com.mr.boomsky_promotion_service.mapper.SmsHomeRecommendSubjectMapper;
import com.mr.boomsky_promotion_service.pojo.SmsHomeRecommendSubject;
import com.mr.boomsky_promotion_service.pojo.SmsHomeRecommendSubjectExample;
import com.mr.boomsky_promotion_service.service.ISmsHomeRecommendSubjectSer;
import com.mr.boomsky_promotion_service.util.CommonConstant;
import com.mr.boomsky_promotion_service.util.CommonResult;
import com.mr.boomsky_promotion_service.util.JyyData;
import com.mr.boomsky_promotion_service.util.JyyPage;
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
    public JyyData findHomeSubjectList(SmsHomeRecommendSubject homeRecommendSubject) {
        JyyPage jp =new JyyPage();
        JyyData jd = new JyyData();
        int total = homeRecommendSubMapper.findHomeSubjectTotal(homeRecommendSubject);
        int i = (homeRecommendSubject.getPageNum() - 1) * homeRecommendSubject.getPageSize();
        homeRecommendSubject.setTotalPage(i);
        List<SmsHomeRecommendSubject> list = homeRecommendSubMapper.findHomeSubjectList(homeRecommendSubject);
        jp.setPageNum(homeRecommendSubject.getPageNum());
        jp.setTotal((long)total);
        jp.setPageSize(homeRecommendSubject.getPageSize());
        jp.setList(list);
        jd.setData(jp);
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

        return jd;
    }

    @Override
    public int addHomeSubject(List<SmsHomeRecommendSubject> recommendSubjectList) {
        for (SmsHomeRecommendSubject recommendProduct : recommendSubjectList) {
            recommendProduct.setRecommendStatus(1);
            recommendProduct.setSort(0);
            homeRecommendSubMapper.insert(recommendProduct);
        }
        return recommendSubjectList.size();
    }

    @Override
    public int updateSort(Long id, Integer sort) {
        SmsHomeRecommendSubject srs = new SmsHomeRecommendSubject();
            srs.setId(id);
            srs.setSort(sort);
        return homeRecommendSubMapper.updateByPrimaryKeySelective(srs);
    }

    @Override
    public int delete(String ids) {
        String[] id = ids.split(",");
        return homeRecommendSubMapper.deleteByExample(id);
    }

    @Override
    public int updateRecommendStatus(List<Long> ids, Integer recommendStatus) {

        return 0;
    }
}
