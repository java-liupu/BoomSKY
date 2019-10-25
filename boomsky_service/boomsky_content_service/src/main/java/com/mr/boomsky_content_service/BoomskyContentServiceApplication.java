package com.mr.boomsky_content_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class BoomskyContentServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BoomskyContentServiceApplication.class, args);
    }

}
