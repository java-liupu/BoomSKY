package com.mr.ordersservice.controller;

import com.mr.ordersservice.client.ITestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RequestMapping("order")
public class OrderController {
    @Autowired
    private ITestClient iTestClient;

    @HystrixCommand(fallbackMethod = "retTest")
    @GetMapping("/getTest")
    public String test(){
        String test = iTestClient.getTest();
        return test;
    }


    public String retTest(){
        return "系统异常";
    }

}
