package com.mr.boomsky_user_service.controller;


import com.mr.boomsky_user_service.service.SmsHomeSubjectService;
import com.mr.boomsky_user_service.util.CommonResult;
import com.mr.boomsky_user_service.util.JyyData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *  调用  专题推荐 接口
 */
@Controller
@RequestMapping("/home/recommendSubject")
public class SmsHomeController {

    @Autowired
    private SmsHomeSubjectService smsHomeSubjectSer;

    // 调用 查询专题列表 接口
    @ResponseBody
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public JyyData list(@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                        @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize){

        return smsHomeSubjectSer.findHomeSubjectList(pageNum,pageSize);
    }

    // 删除(物理删除)
    @ResponseBody
    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    public CommonResult delete(@RequestParam List<Long> ids){
        return smsHomeSubjectSer.delete(ids);
    }

}
