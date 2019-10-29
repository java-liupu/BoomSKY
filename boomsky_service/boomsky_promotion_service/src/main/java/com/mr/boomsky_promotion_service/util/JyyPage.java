package com.mr.boomsky_promotion_service.util;

import com.mr.boomsky_promotion_service.pojo.SmsHomeRecommendSubject;


import java.util.List;

public class JyyPage {

    private Integer pageNum;
    private Integer pageSize;
    private Integer totalPage;
    private Long total;
    private List<SmsHomeRecommendSubject> list;


    public void calculate() {
        this.totalPage = (pageNum)*pageSize;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<SmsHomeRecommendSubject> getList() {
        return list;
    }

    public void setList(List<SmsHomeRecommendSubject> list) {
        this.list = list;
    }
}
