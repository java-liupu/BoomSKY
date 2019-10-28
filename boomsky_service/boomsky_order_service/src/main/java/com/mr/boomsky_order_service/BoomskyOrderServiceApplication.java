package com.mr.boomsky_order_service;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

@SpringBootApplication  //  端口号: 8763
@MapperScan("com.mr.boomsky_order_service.mapper")
public class BoomskyOrderServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BoomskyOrderServiceApplication.class, args);
    }

}
