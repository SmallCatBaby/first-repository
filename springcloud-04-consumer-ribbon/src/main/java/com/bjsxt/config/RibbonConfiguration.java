package com.bjsxt.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: lixiaomi
 * @Description: com.bjsxt.config
 * @Date: 2019/4/8
 * @Version: 1.0
 */
@Configuration
public class RibbonConfiguration {

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
