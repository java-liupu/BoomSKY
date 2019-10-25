package com.mr.boomsky_admin_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class BoomskyAdminServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BoomskyAdminServiceApplication.class, args);
    }

}
