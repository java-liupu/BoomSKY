package com.mr.boomsky_user_service.service;


import com.mr.boomsky_user_service.util.CommonResult;
import com.mr.boomsky_user_service.util.JyyData;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient("PROMOTIONSERVICE")
public interface SmsHomeSubjectService {

    @RequestMapping(value = "/home/recommendSubject/list",method = RequestMethod.GET)
    JyyData findHomeSubjectList(@RequestParam Integer pageNum, @RequestParam Integer pageSize);

    @RequestMapping(value = "/home/recommendSubject/delete",method = RequestMethod.POST)
    CommonResult delete(@RequestParam List<Long> ids);
}
