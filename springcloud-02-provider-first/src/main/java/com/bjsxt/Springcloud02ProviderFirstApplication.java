package com.bjsxt;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.bjsxt.mapper")
public class Springcloud02ProviderFirstApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springcloud02ProviderFirstApplication.class, args);
    }

}
