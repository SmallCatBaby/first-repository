package com.bjsxt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Springcloud06ConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springcloud06ConfigServerApplication.class, args);
    }

}
