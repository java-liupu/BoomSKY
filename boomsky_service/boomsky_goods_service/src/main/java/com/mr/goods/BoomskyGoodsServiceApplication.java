package com.mr.goods;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer   // 服务端启动 端口号: 8762
@MapperScan("com.mr.goods.mapper")
public class BoomskyGoodsServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(BoomskyGoodsServiceApplication.class,args);
    }
}
