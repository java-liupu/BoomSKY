package com.mr.boomsky_order_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

@SpringBootApplication
@EnableCircuitBreaker  //  端口号: 8762
public class BoomskyOrderServiceApplication {

    public static void main(String[] args) {
        System.out.println("你好");
        SpringApplication.run(BoomskyOrderServiceApplication.class, args);
    }

}
