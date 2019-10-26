package com.mr.boomsky_admin_service.controller;

import com.mr.boomsky_admin_service.dto.UmsAdminLoginParam;
import com.mr.boomsky_admin_service.service.UmsAdminService;
import com.mr.boomsky_admin_service.util.CommonResult;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/admin")
public class WebLoginController {

    @Autowired
    private UmsAdminService umsAdminSer;

    @ResponseBody
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public CommonResult login(@RequestBody UmsAdminLoginParam umsAdminLoginParam){
                System.out.println(umsAdminLoginParam);
        return null;
    }

}
