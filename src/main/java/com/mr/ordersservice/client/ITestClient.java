package com.mr.ordersservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("test-server")
public interface ITestClient {

    @GetMapping("/test")
    String getTest();


}
