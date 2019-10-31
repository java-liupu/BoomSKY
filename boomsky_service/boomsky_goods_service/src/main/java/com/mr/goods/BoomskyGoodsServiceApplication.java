package com.mr.goods;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.mr.goods.mapper")
public class BoomskyGoodsServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(BoomskyGoodsServiceApplication.class,args);
    }
}
