package com.bjsxt.service.impl;

import com.bjsxt.pojo.Star;
import com.bjsxt.service.StarService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: lixiaomi
 * @Description: com.bjsxt.service.impl
 * @Date: 2019/4/8
 * @Version: 1.0
 */
@Service
public class StarServiceImpl implements StarService {
    @Autowired
    private RestTemplate restTemplate;
    @Override
    @HystrixCommand(fallbackMethod = "getfallback")
    public List<Star> selectAll() {
        ResponseEntity<List> responseEntity = restTemplate.postForEntity("http://eureke-provider/showStar", null, List.class);
        List<Star> starList = responseEntity.getBody();
        return starList;
    }

    public List<Star> getfallback(){
        ArrayList<Star> stars = new ArrayList<>();
        Star star = new Star();
        star.setName("服务调用异常");
        stars.add(star);
        return stars;
    }
}
