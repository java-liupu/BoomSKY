package com.mr.boomsky_goods_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

@SpringBootApplication
@EnableCircuitBreaker  // 熔断机制注解
public class BoomskyGoodsServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BoomskyGoodsServiceApplication.class, args);
    }

}
