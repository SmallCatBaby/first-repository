package com.bjsxt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class Springcloud05ZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springcloud05ZuulApplication.class, args);
    }

}
