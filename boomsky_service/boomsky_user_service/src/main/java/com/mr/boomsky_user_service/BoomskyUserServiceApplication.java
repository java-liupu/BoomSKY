package com.mr.boomsky_user_service;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication // 端口号：8080
@EnableFeignClients
@MapperScan("com.mr.boomsky_user_service.mapper")
public class BoomskyUserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BoomskyUserServiceApplication.class, args);
    }

}
