package com.mr.boomsky_user_service.controller;


import com.mr.boomsky_user_service.pojo.SmsHomeRecommendSubject;
import com.mr.boomsky_user_service.service.SmsHomeSubjectService;
import com.mr.boomsky_user_service.util.JyyData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 *  调用  专题推荐 接口
 */
@Controller
@RequestMapping("/home/recommendSubject")
public class SmsHomeController {

    @Autowired
    private SmsHomeSubjectService smsHomeSubjectSer;

    @ResponseBody
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public JyyData list(@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                        @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize){

        return smsHomeSubjectSer.findHomeSubjectList(pageNum,pageSize);
    }

}
