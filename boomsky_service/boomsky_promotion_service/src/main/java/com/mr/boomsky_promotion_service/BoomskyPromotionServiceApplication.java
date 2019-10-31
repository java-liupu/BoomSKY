package com.mr.boomsky_promotion_service;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@MapperScan("com.mr.boomsky_promotion_service.mapper")
public class BoomskyPromotionServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BoomskyPromotionServiceApplication.class, args);
    }

}
