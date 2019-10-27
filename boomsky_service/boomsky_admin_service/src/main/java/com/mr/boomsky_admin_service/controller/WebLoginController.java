package com.mr.boomsky_admin_service.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("admin")
public class WebLoginController {

    @ResponseBody
    @GetMapping(value = "/test")
    public String test(){
        return "123";
    }

}

