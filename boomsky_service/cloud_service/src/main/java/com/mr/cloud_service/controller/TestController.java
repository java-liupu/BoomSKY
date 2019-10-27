package com.mr.cloud_service.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @ResponseBody
    @GetMapping(value = "login")
    public String login(){
        System.out.println("访问");
        return null;
    }

}
